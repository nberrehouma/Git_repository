import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import figures.GenealogyConnection;
import figures.MarriageAnchor;
import figures.MarriageFigure;
import genalogyModel.GenalogyModelPackage;
import genalogyModel.GenealogyGraph;
import genalogyModel.Marriage;
import genalogyModel.Person;

public class MarriageEditPart extends GenealogyElementEditPart implements NodeEditPart {
	public MarriageEditPart(Marriage marriage) {
		System.out.println("MarriageEditPart created");
		Adapter adapter = new AdapterImpl() {
			GenalogyModelPackage modelPackage = GenalogyModelPackage.eINSTANCE;

			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.
			 * common.notify.Notification)
			 */
			@Override
			public void notifyChanged(Notification msg) {
				// TODO Auto-generated method stub
				super.notifyChanged(msg);
				if (msg.getFeature() == modelPackage.getMarriage_YearMarried()) {
					// TODO

				}

				if (msg.getFeature() == modelPackage.getMarriage_Hasbend()) {
					System.out.println("hasbend changed");
					HasbandChanged((Person) msg.getNewValue(), (Person) msg.getOldValue());
				}
				if (msg.getFeature() == modelPackage.getMarriage_Wife()) {
					WifeChanged((Person) msg.getNewValue(), (Person) msg.getOldValue());

				}
				if (msg.getFeature() == modelPackage.getMarriage_Offspring()) {
					// TODO
				}

				if (msg.getFeature() == modelPackage.getGenealogyElement_X()) {

					int x = msg.getNewIntValue();
					int y = getModel().getY();
					getFigure().setLocation(new Point(x, y));

				}

				if (msg.getFeature() == modelPackage.getGenealogyElement_Y()) {

					int y = msg.getNewIntValue();
					int x = getModel().getX();
					getFigure().setLocation(new Point(x, y));

				}
			}

			private void WifeChanged(Person newValue, Person oldValue) {
				ConnectionEditPart part = findConnection(oldValue, getModel());
				if (part != null)
					removeSourceConnection(part);
				if (newValue != null) {
					part = createOrFindConnection(newValue, getModel());
					addSourceConnection(part, 0);
				}

			}

			private void HasbandChanged(Person newValue, Person oldValue) {
				ConnectionEditPart part = findConnection(oldValue, getModel());
				if (part != null)
					removeSourceConnection(part);
				if (newValue != null) {
					part = createOrFindConnection(newValue, getModel());
					addSourceConnection(part, 0);
				}

			}

		};
		marriage.eAdapters().add(adapter);
		setModel(marriage);
	}

	@Override
	public Marriage getModel() {
		return (Marriage) super.getModel();
	}

	@Override
	protected IFigure createFigure() {
		Marriage m = getModel();

		return new MarriageFigure(m.getYearMarried(), m);
	}

	@Override
	protected void createEditPolicies() {
		NonResizableEditPolicy selectionPolicy = new NonResizableEditPolicy();
		selectionPolicy.setDragAllowed(false);
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, selectionPolicy);
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentEditPolicy() {
			@Override
			protected Command createDeleteCommand(GroupRequest request) {
				System.out.println("delete person command created");
				GenealogyGraph graph = (GenealogyGraph) getParent().getModel();
				return new DeleteMarriageCommand(graph, getModel());
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editparts.AbstractGraphicalEditPart#getTargetConnections()
	 */
	@Override
	public List<GenealogyConnection> getModelTargetConnections() {
		Marriage marriage = getModel();
		ArrayList<GenealogyConnection> marriageList = new ArrayList<GenealogyConnection>(1);
		Person husband = marriage.getHasbend();
		if (husband != null)
			marriageList.add(new GenealogyConnection(husband, marriage));
		Person wife = marriage.getWife();
		if (wife != null)
			marriageList.add(new GenealogyConnection(wife, marriage));
		return marriageList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editparts.AbstractGraphicalEditPart#getModelSourceConnections
	 * ()
	 */

	@Override
	protected List getModelSourceConnections() {
		Marriage marriage = getModel();
		EList<Person> offsprings = marriage.getOffspring();
		ArrayList<GenealogyConnection> offspringsList = new ArrayList<GenealogyConnection>(1);
		Iterator<Person> iterator = offsprings.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			offspringsList.add(new GenealogyConnection(person, marriage));

		}
		return offspringsList;
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
		return new MarriageAnchor(getFigure());
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
		return new MarriageAnchor(getFigure());
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return new MarriageAnchor(getFigure());
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return new MarriageAnchor(getFigure());
	}

}
