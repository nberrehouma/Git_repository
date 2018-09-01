import org.eclipse.draw2d.IFigure;

import figures.NoteFigure;
import genalogyModel.Note;

public class NoteEditPart extends GenealogyElementEditPart {
	public NoteEditPart(Note note) {
		System.out.println("note edit part created");
		setModel(note);
	}

	@Override
	public Note getModel() {
		return (Note) super.getModel();
	}

	@Override
	protected IFigure createFigure() {
		Note m = getModel();

		return new NoteFigure(m.getText());
	}

	@Override
	protected void createEditPolicies() {
	}

}