import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import genalogyModel.GenealogyGraph;
import genalogyModel.Note;
import genalogyModel.Person;

class CreateNoteCommand extends Command {
	private final GenealogyGraph graph;
	private final Note note;
	private final Rectangle box;
	private final Person person;

	public CreateNoteCommand(GenealogyGraph g, Note n, Rectangle box) {
		super("Create Person");
		this.person = null;
		this.graph = g;
		this.note = n;
		this.box = box;
	}

	public CreateNoteCommand(Person p, Note n, Rectangle box) {
		super("Create Person");
		this.graph = null;
		this.person = p;
		this.note = n;
		this.box = box;
	}

	@Override
	public void execute() {

		// note.setX(box.x);
		// note.setX(box.y);
		// note.setWidth(100);
		// note.setHeight(25);
		if (graph != null)
			note.setGenealogygraph(graph);
		else
			person.getNote().add(note);
	}

	@Override
	public void undo() {
		if (graph != null)
			graph.getPersons().remove(note);
		else
			person.getNote().remove(note);
	}
}