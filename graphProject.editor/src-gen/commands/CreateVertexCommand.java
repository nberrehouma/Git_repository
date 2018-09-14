package commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import graphproject.graph.Graph;
import graphproject.graph.Vertex;

public class CreateVertexCommand extends Command {

	private final Graph graph;
	private final Vertex vertex;
	private final Rectangle box;

	public CreateVertexCommand(Graph graph, Vertex vertex, Rectangle box) {
		super();
		this.graph = graph;
		this.vertex = vertex;
		this.box = box;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {

		graph.getVertices().add(vertex);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		graph.getVertices().remove(vertex);
	}

}
