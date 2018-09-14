import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import genalogyModel.GenealogyGraph;
import genalogyModel.Marriage;

class CreateMarriageCommand extends Command {
	private final GenealogyGraph graph;
	private final Marriage marriage;
	private final Rectangle box;

	public CreateMarriageCommand(GenealogyGraph g, Marriage m, Rectangle box) {
		super("Create Marriage");
		this.graph = g;
		this.marriage = m;
		this.box = box;
	}

	@Override
	public void execute() {

		marriage.setX(box.x);
		marriage.setY(box.y);
		marriage.setWidth(50);
		marriage.setHeight(50);
		marriage.setGenealogygraph(graph);
	}

	@Override
	public void undo() {
		graph.getPersons().remove(marriage);
	}
}