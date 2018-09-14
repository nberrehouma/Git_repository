package commands;

import org.eclipse.gef.commands.Command;

import graphproject.graph.Edge;
import graphproject.graph.Graph;
import graphproject.graph.GraphPackage;
import graphproject.graph.Vertex;

public class DeleteEdgeCommand extends Command {
	private Graph graph;
	private Edge edge;
	private Vertex source;
	private Vertex target;

	public DeleteEdgeCommand(Graph graph, Edge edge) {
		super();
		this.graph = graph;
		this.edge = edge;
	}

	@Override
	public void execute() {
		source = edge.getSourceVertex();
		target = edge.getTargetVertex();
		edge.eUnset(GraphPackage.eINSTANCE.getEdge_SourceVertex());
		edge.eUnset(GraphPackage.eINSTANCE.getEdge_TargetVertex());
		graph.getEdges().remove(edge);
	}

	@Override
	public void undo() {
		edge.setSourceVertex(source);
		edge.setTargetVertex(target);
		graph.getEdges().add(edge);
	}

}
