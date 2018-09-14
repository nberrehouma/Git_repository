package editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import figures.EdgeFigure;
import graphproject.graph.Edge;

public class EdgeEditPart extends AbstractConnectionEditPart {

	public EdgeEditPart(Edge edge) {
		super();
		// TODO Auto-generated constructor stub

		setModel(edge);
	}

	@Override
	protected void createEditPolicies() {
		ConnectionEndpointEditPolicy selectionPolicy = new ConnectionEndpointEditPolicy();
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, selectionPolicy);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractConnectionEditPart#createFigure()
	 */
	@Override
	protected IFigure createFigure() {
		Edge model = (Edge) getModel();
		return new EdgeFigure(model, model.getName());
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
