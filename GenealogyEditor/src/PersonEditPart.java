import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.OrderedLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.GroupRequest;

import figures.GenealogyConnection;
import figures.PersonFigure;
import genalogyModel.GenalogyModelPackage;
import genalogyModel.GenealogyElement;
import genalogyModel.GenealogyGraph;
import genalogyModel.Marriage;
import genalogyModel.Note;
import genalogyModel.Person;

public class PersonEditPart extends GenealogyElementEditPart {
	public PersonEditPart(Person person) {
		System.out.println("personEditPart created");
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
				if (msg.getFeature() == modelPackage.getPerson_Note()) {
					if (msg.getEventType() == Notification.ADD) {
						Person notifier = (Person) msg.getNotifier();
						int position = msg.getPosition();
						NoteAdded(notifier.getNote().get(position));
					}
					if (msg.getEventType() == Notification.REMOVE)
						NoteRemoved((Note) msg.getNotifier());

				}

				if (msg.getFeature() == modelPackage.getPerson_Name()) {
					// TODO

				}

				if (msg.getFeature() == modelPackage.getPerson_BirthYear()) {
					// TODO
				}

				if (msg.getFeature() == modelPackage.getPerson_DeathYear()) {
					// TODO
				}

				if (msg.getFeature() == modelPackage.getPerson_Gender()) {
					// TODO
				}
				if (msg.getFeature() == modelPackage.getPerson_Marriage()) {
					System.out.println("marriage change");
					marriageChanged((Marriage) msg.getNewValue(), (Marriage) msg.getOldValue());
				}
				if (msg.getFeature() == modelPackage.getPerson_ParentsMarriage()) {
					parentsMarriageChanged((Marriage) msg.getNewValue(), (Marriage) msg.getOldValue());
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

				if (msg.getFeature() == modelPackage.getGenealogyElement_Width()) {

					int w = msg.getNewIntValue();
					int h = getModel().getHeight();
					getFigure().setSize(w, h);

				}

				if (msg.getFeature() == modelPackage.getGenealogyElement_Height()) {

					int w = getModel().getWidth();
					int h = msg.getNewIntValue();
					getFigure().setSize(w, h);

				}

				if (msg.getFeature() == modelPackage.getPerson_Genealogygraph()) {
					if (msg.getEventType() == Notification.SET) {
						System.out.println("removing person ..... notification from Person edit part  ");
						// PersonRemoved((Person) msg.getOldValue());

					}

				}

			}

			private void NoteRemoved(Note notifier) {
				genealogyElementRemoved(notifier);

			}

			private void NoteAdded(Note note) {
				addChild(createChild(note), 0);

			}

			void marriageChanged(Marriage marriage, Marriage oldMarriage) {

				ConnectionEditPart part = findConnection(getModel(), oldMarriage);
				if (part != null)
					removeSourceConnection(part);
				if (marriage != null) {
					part = createOrFindConnection(getModel(), marriage);
					addSourceConnection(part, 0);
				}

			};

			void parentsMarriageChanged(Marriage marriage, Marriage oldMarriage) {
				ConnectionEditPart part = findConnection(getModel(), oldMarriage);
				if (part != null)
					removeTargetConnection(part);
				if (marriage != null) {
					part = createOrFindConnection(getModel(), marriage);
					addTargetConnection(part, 0);
				}
			}
		};
		person.eAdapters().add(adapter);
		setModel(person);
	}

	@Override
	public Person getModel() {
		return (Person) super.getModel();
	}

	@Override
	protected IFigure createFigure() {
		Person m = getModel();
		// Image image = m.getGender() == Gender.MAN ? PersonFigure.MALE :
		// PersonFigure.FEMALE;

		return new PersonFigure(m.getName(), m.getBirthYear(), m.getDeathYear(), m);
		// new PersonFigure(m.getName(), image, m.getBirthYear(), m.getDeathYear(), m);
	}

	@Override
	protected void createEditPolicies() {
		NonResizableEditPolicy selectionPolicy = new NonResizableEditPolicy();
		selectionPolicy.setDragAllowed(false);
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, selectionPolicy);

		installEditPolicy(EditPolicy.LAYOUT_ROLE, new OrderedLayoutEditPolicy() {
			@Override
			protected Command getCreateCommand(CreateRequest request) {
				Object type = request.getNewObjectType();

				Person person = getModel();

				if (type == Note.class) {
					Note note = (Note) request.getNewObject();
					return new CreateNoteCommand(person, note, null);
				}

				return null;
			}

			@Override
			protected Command createAddCommand(EditPart child, EditPart after) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			protected Command createMoveChildCommand(EditPart child, EditPart after) {
				if (child == after || getChildren().size() == 1)
					return null;
				int index = getChildren().indexOf(child);
				if (index == 0) {
					if (after == null)
						return null;
				} else {
					if (after == getChildren().get(index - 1))
						return null;
				}
				ReorderNoteCommand cmd = new ReorderNoteCommand(getModel(), (Note) child.getModel());
				if (after != null)
					cmd.setAfterNote((Note) after.getModel());
				return cmd;
			}

			@Override
			protected EditPart getInsertionReference(Request request) {
				int y = ((ChangeBoundsRequest) request).getLocation().y;
				List<?> notes = getChildren();
				NoteEditPart afterNote = null;
				for (Iterator<?> iter = notes.iterator(); iter.hasNext();) {
					NoteEditPart note = (NoteEditPart) iter.next();
					if (y < note.getFigure().getBounds().y)
						return afterNote;
					afterNote = note;
				}
				return afterNote;
			}

		});

		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentEditPolicy() {
			@Override
			protected Command createDeleteCommand(GroupRequest request) {
				System.out.println("delete person command created");
				GenealogyGraph graph = (GenealogyGraph) getParent().getModel();
				return new DeletePersonCommand(graph, getModel());
			}
		});
	}

	@Override
	protected List<Note> getModelChildren() {
		return getModel().getNote();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#fireSelectionChanged()
	 */
	@Override
	protected void fireSelectionChanged() {
		// TODO Auto-generated method stub
		super.fireSelectionChanged();
		((PersonFigure) getFigure()).setSelected(getSelected() != 0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editparts.AbstractGraphicalEditPart#getSourceConnections()
	 */
	@Override
	public List<GenealogyConnection> getModelSourceConnections() {
		Person person = getModel();
		Marriage marriage = person.getMarriage();
		ArrayList<GenealogyConnection> marriageList = new ArrayList<GenealogyConnection>(1);
		if (marriage != null)
			marriageList.add(new GenealogyConnection(person, marriage));

		return marriageList;
	}

	@Override
	public List<GenealogyConnection> getModelTargetConnections() {
		Person person = getModel();
		ArrayList<GenealogyConnection> parentMarriage = new ArrayList<GenealogyConnection>(1);
		if (person.getParentsMarriage() != null)
			parentMarriage.add(new GenealogyConnection(person, person.getParentsMarriage()));
		return parentMarriage;
	}

	private void genealogyElementRemoved(GenealogyElement elem) {
		Object part = getViewer().getEditPartRegistry().get(elem);
		if (part instanceof EditPart)
			removeChild((EditPart) part);

	}

	public void marriageChanged(Marriage marriage, Marriage oldMarriage) {
		ConnectionEditPart part = findConnection(getModel(), oldMarriage);
		if (part != null)
			removeSourceConnection(part);
		if (marriage != null) {
			part = createOrFindConnection(getModel(), marriage);
			addSourceConnection(part, 0);
		}
	}

}
