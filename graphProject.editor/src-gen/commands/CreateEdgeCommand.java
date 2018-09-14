package commands;

import org.eclipse.gef.commands.Command;

import graphproject.graph.Edge;
import graphproject.graph.Graph;
import graphproject.graph.Vertex;

public class CreateEdgeCommand extends Command {
	private final Graph graph;
	private final Edge edge;

	public CreateEdgeCommand(Graph graph, Edge edge) {
		this.graph = graph;
		this.edge = edge;
		setLabel("Create " + getConnectionName());
	}

	public String getConnectionName() {

		return edge.getName();
	}

	public boolean isValidSource(Object source) {
		return true;
	}

	public boolean isValidTarget(Object target) {
		return true;
	}

	public void setSource(Vertex source) {
		edge.setSourceVertex(source);
	}

	public void setTarget(Vertex target) {
		edge.setTargetVertex(target);
	}

	@Override
	public void execute() {

		graph.getEdges().add(edge);
	}

	@Override
	public void undo() {

		graph.getEdges().remove(edge);
	}

}
