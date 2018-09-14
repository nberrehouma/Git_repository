package editparts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import figures.VertexFigure;
import graphproject.graph.Vertex;

public class VertexEditPart extends AbstractGraphicalEditPart {

	public VertexEditPart(Vertex vertex) {
		super();
		// TODO Auto-generated constructor stub
		setModel(vertex);
	}

	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		Vertex model = (Vertex) getModel();
		assert (model != null);
		return new VertexFigure(model.getName(), model);
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editparts.AbstractGraphicalEditPart#getModelSourceConnections
	 * ()
	 */
	@Override
	protected List getModelSourceConnections() {
		Vertex model = (Vertex) getModel();
		assert (model != null);
		return model.getOutgoingEdges();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editparts.AbstractGraphicalEditPart#getModelTargetConnections
	 * ()
	 */
	@Override
	protected List getModelTargetConnections() {
		Vertex model = (Vertex) getModel();
		assert (model != null);
		return model.getIngoingEdges();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModel()
	 */
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return super.getModel();
	}

}
