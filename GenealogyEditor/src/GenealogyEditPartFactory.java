import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import figures.GenealogyConnection;
import genalogyModel.GenealogyGraph;
import genalogyModel.Marriage;
import genalogyModel.Note;
import genalogyModel.Person;

public class GenealogyEditPartFactory implements EditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {

		if (model instanceof GenealogyGraph)
			return new GenealogyGraphEditPart((GenealogyGraph) model);

		if (model instanceof Person)
			return new PersonEditPart((Person) model);

		if (model instanceof Marriage)
			return new MarriageEditPart((Marriage) model);

		if (model instanceof Note)
			return new NoteEditPart((Note) model);

		if (model instanceof GenealogyConnection) {

			return new GenealogyConnectionEditPart((GenealogyConnection) model);
		}

		throw new IllegalStateException("No EditPart for " + model.getClass());
	}
}