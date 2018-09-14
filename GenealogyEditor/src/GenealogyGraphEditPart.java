import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

import genalogyModel.GenalogyModelPackage;
import genalogyModel.GenealogyElement;
import genalogyModel.GenealogyGraph;
import genalogyModel.Marriage;
import genalogyModel.Note;
import genalogyModel.Person;

public class GenealogyGraphEditPart extends AbstractGraphicalEditPart {

	Adapter adapter;

	public GenealogyGraphEditPart(GenealogyGraph genealogyGraph) {
		System.out.println("GenealogyGraphEditPart created");

		adapter = new AdapterImpl() {

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
				if (msg.getFeature() == modelPackage.getGenealogyGraph_Persons()) {
					if (msg.getEventType() == Notification.ADD) {
						GenealogyGraph notifier = (GenealogyGraph) msg.getNotifier();
						int position = msg.getPosition();
						personAdded(notifier.getPersons().get(position));
					}
					if (msg.getEventType() == Notification.REMOVE) {
						System.out.println("removing person..... notification recieved by Graph edit part ");

						personRemoved((Person) msg.getOldValue());

					}

				}

				if (msg.getFeature() == modelPackage.getGenealogyGraph_Marriages()) {

					if (msg.getEventType() == Notification.ADD) {
						GenealogyGraph notifier = (GenealogyGraph) msg.getNotifier();
						int position = msg.getPosition();
						marriageAdded(notifier.getMarriages().get(position));
					}

					if (msg.getEventType() == Notification.REMOVE) {
						System.out.println("marriage removed");
						marriageRemoved((Marriage) msg.getOldValue());
					}
				}

				if (msg.getFeature() == modelPackage.getGenealogyGraph_Notes()) {

					if (msg.getEventType() == Notification.ADD) {

						GenealogyGraph notifier = (GenealogyGraph) msg.getNotifier();
						int position = msg.getPosition();
						noteAdded(0, notifier.getNotes().get(position));
					}
					if (msg.getEventType() == Notification.REMOVE)
						noteRemoved((Note) msg.getNotifier());
				}

			}

			public void personAdded(Person p) {
				addChild(createChild(p), 0);

			}

			public void marriageAdded(Marriage m) {
				addChild(createChild(m), 0);
			}

			public void noteAdded(int index, Note n) {
				addChild(createChild(n), index);
			}

			public void personRemoved(Person p) {
				genealogyElementRemoved(p);
			}

			public void marriageRemoved(Marriage m) {
				genealogyElementRemoved(m);
			}

			public void noteRemoved(Note n) {
				genealogyElementRemoved(n);
			}

		};

		genealogyGraph.eAdapters().add(adapter);
		setModel(genealogyGraph);
	}

	@Override
	public GenealogyGraph getModel() {
		return (GenealogyGraph) super.getModel();
	}

	@Override
	protected IFigure createFigure() {
		Figure figure = new FreeformLayer();
		figure.setBorder(new MarginBorder(3));
		figure.setLayoutManager(new FreeformLayout());
		return figure;
	}

	@Override
	protected void createEditPolicies() {

		installEditPolicy(EditPolicy.LAYOUT_ROLE, new XYLayoutEditPolicy() {
			@Override
			protected Command getCreateCommand(CreateRequest request) {
				Object type = request.getNewObjectType();
				Rectangle box = (Rectangle) getConstraintFor(request);
				GenealogyGraph graph = getModel();
				if (type == Person.class) {
					Person person = (Person) request.getNewObject();
					return new CreatePersonCommand(graph, person, box);
				}

				if (type == Marriage.class) {
					Marriage marriage = (Marriage) request.getNewObject();
					return new CreateMarriageCommand(graph, marriage, box);
				}

				if (type == Note.class) {
					Note note = (Note) request.getNewObject();
					return new CreateNoteCommand(graph, note, box);
				}

				return null;
			}

			@Override
			protected Command createChangeConstraintCommand(ChangeBoundsRequest request, EditPart child,
					Object constraint) {
				GenealogyElement elem = (GenealogyElement) child.getModel();
				Rectangle box = (Rectangle) constraint;
				return new MoveAndResizeGenealogyElementCommand(elem, box);

			}

			@Override
			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child instanceof MarriageEditPart)
					return new NonResizableEditPolicy();
				return super.createChildEditPolicy(child);
			}

		});
	}

	@Override
	protected List<GenealogyElement> getModelChildren() {
		List<GenealogyElement> allObjects = new ArrayList<GenealogyElement>();
		allObjects.addAll(getModel().getMarriages());
		allObjects.addAll(getModel().getPersons());
		allObjects.addAll(getModel().getNotes());

		return allObjects;
	}

	private void genealogyElementRemoved(GenealogyElement elem) {
		Object part = getViewer().getEditPartRegistry().get(elem);
		if (part instanceof EditPart)
			removeChild((EditPart) part);
	}
}