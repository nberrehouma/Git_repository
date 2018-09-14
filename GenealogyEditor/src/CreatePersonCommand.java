import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import genalogyModel.GenealogyGraph;
import genalogyModel.Person;

public class CreatePersonCommand extends Command {
	private final GenealogyGraph graph;
	private final Person person;
	private final Rectangle box;

	public CreatePersonCommand(GenealogyGraph g, Person p, Rectangle box) {
		super("Create Person");
		this.graph = g;
		this.person = p;
		this.box = box;
	}

	@Override
	public void execute() {

		person.setX(box.x);
		person.setY(box.y);
		person.setWidth(100);
		person.setHeight(100);
		person.setGenealogygraph(graph);
	}

	@Override
	public void undo() {
		graph.getPersons().remove(person);
	}
}