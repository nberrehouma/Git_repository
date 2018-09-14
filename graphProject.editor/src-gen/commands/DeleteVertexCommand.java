package commands;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.commands.Command;

import graphproject.graph.Edge;
import graphproject.graph.Graph;
import graphproject.graph.GraphPackage;
import graphproject.graph.Vertex;

public class DeleteVertexCommand extends Command {

	Graph graph;
	Vertex vertex;
	private EList<Edge> outgoingEdges;
	private EList<Edge> ingoingEdges;

	public DeleteVertexCommand(Graph graph, Vertex vertex) {
		super();
		this.graph = graph;
		this.vertex = vertex;
	}

	@Override

	public void execute() {
		outgoingEdges = vertex.getOutgoingEdges();
		ingoingEdges = vertex.getIngoingEdges();
		vertex.eUnset(GraphPackage.eINSTANCE.getVertex_IngoingEdges());
		vertex.eUnset(GraphPackage.eINSTANCE.getVertex_OutgoingEdges());
		graph.getEdges().removeAll(ingoingEdges);
		graph.getEdges().removeAll(outgoingEdges);
		graph.getVertices().remove(vertex);
	}

	@Override
	public void undo() {
		graph.getEdges().addAll(ingoingEdges);
		graph.getEdges().addAll(outgoingEdges);
		vertex.getOutgoingEdges().addAll(outgoingEdges);
		vertex.getIngoingEdges().addAll(ingoingEdges);
		graph.getVertices().add(vertex);
	}

}
