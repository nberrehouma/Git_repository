package editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import graphproject.graph.Edge;
import graphproject.graph.Graph;
import graphproject.graph.Vertex;

public class GraphEditorEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof Graph)
			return new GraphEditPart((Graph) model);
		if (model instanceof Vertex)
			return new VertexEditPart((Vertex) model);
		if (model instanceof Edge)
			return new EdgeEditPart((Edge) model);
		throw new IllegalStateException("No EditPart for " + model.getClass());
	}

}
