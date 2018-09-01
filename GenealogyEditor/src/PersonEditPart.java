import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;

import figures.GenealogyConnection;
import figures.PersonFigure;
import genalogyModel.Marriage;
import genalogyModel.Note;
import genalogyModel.Person;

public class PersonEditPart extends GenealogyElementEditPart {
	public PersonEditPart(Person person) {
		System.out.println("personEditPart created");
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
}
