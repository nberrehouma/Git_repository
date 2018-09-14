package algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import graphproject.graph.Edge;
import graphproject.graph.Graph;
import graphproject.graph.GraphFactory;
import graphproject.graph.Vertex;

/**
 * @author Seven
 *
 */
public class GraphUtil {

	public static Graph randomGraph(int vertexNumber, int edgeNumber) {

		GraphFactory factory = GraphFactory.eINSTANCE;
		Graph graph = factory.createGraph();
		for (int i = 0; i < vertexNumber; i++) {
			Vertex vertex = factory.createVertex();
			vertex.setName("V" + i);
			graph.getVertices().add(vertex);
		}

		for (int i = 0; i < edgeNumber; i++) {

			int source = (int) (Math.random() * vertexNumber);
			int target = (int) (Math.random() * vertexNumber);
			Vertex sourceVertex = graph.getVertices().get(source);
			Vertex targetVertex = graph.getVertices().get(target);

			if (existedge(graph, sourceVertex, targetVertex)) {

				continue;
			} else {
				Edge edge = factory.createEdge();
				edge.setSourceVertex(sourceVertex);
				edge.setTargetVertex(targetVertex);
				edge.setName("E" + i);
				graph.getEdges().add(edge);
			}

		}
		return graph;

	}

	private static boolean existedge(Graph g, Vertex s, Vertex t) {
		List<Edge> edges = g.getEdges();
		Iterator<Edge> it = edges.iterator();
		while (it.hasNext()) {
			Edge edge = it.next();
			if (edge.getSourceVertex() == s && edge.getTargetVertex() == t)
				return true;

		}
		return false;
	}

// ordre du graphe ou le nombre de ses vertex(s)

	public static int order(Graph graph) {
		if (graph == null) {
			return 0;
		}
		List<Vertex> vertices = graph.getVertices();
		if (vertices == null) {
			return 0;

		}
		int order = vertices.size();

		return order;
	}

	public static int degree(Vertex v) {
		assert (v != null);
		int degree = (v.getOutgoingEdges().size() + v.getIngoingEdges().size());
		return degree;
	}

	public static Vertex[] edgeIncidence(Edge e) {
		assert (e != null);
		Vertex[] v = { e.getSourceVertex(), e.getTargetVertex() };
		return v;

	}

	public static List<Edge> VertexIncidence(Vertex vertex) {
		assert (vertex != null);
		List<Edge> incidence = vertex.getOutgoingEdges();
		incidence.addAll(vertex.getIngoingEdges());
		return incidence;

	}

	public static List<Vertex> nieghbour(Vertex vertex)

	{
		assert (vertex != null);
		List<Vertex> nieghbours = new ArrayList<Vertex>(1);

		Iterator<Edge> it = VertexIncidence(vertex).iterator();
		while (it.hasNext()) {
			Edge edge = it.next();
			if (edge.getSourceVertex() == edge.getTargetVertex())
				continue;
			if (edge.getSourceVertex() == vertex)
				nieghbours.add(edge.getTargetVertex());
			else
				nieghbours.add(edge.getSourceVertex());

		}
		return nieghbours;

	}

	public static boolean existChain(Vertex start, Vertex end) {

		if (nieghbour(start).contains(end))
			return true;
		else {
			Iterator<Vertex> it = nieghbour(start).iterator();

			while (it.hasNext()) {
				Vertex vertex = it.next();
				if (existChain(vertex, end))
					return true;
			}
		}
		return false;
	}

}
