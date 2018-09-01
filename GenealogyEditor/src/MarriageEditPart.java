import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;

import figures.GenealogyConnection;
import figures.MarriageAnchor;
import figures.MarriageFigure;
import genalogyModel.Marriage;
import genalogyModel.Person;

public class MarriageEditPart extends GenealogyElementEditPart implements NodeEditPart {
	public MarriageEditPart(Marriage marriage) {
		System.out.println("MarriageEditPart created");
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
