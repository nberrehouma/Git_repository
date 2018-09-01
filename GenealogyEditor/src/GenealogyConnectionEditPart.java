import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import figures.GenealogyConnection;

public class GenealogyConnectionEditPart extends AbstractConnectionEditPart {
	private static final PointList ARROWHEAD = new PointList(new int[] { 0, 0, -2, 2, -2, 0, -2, -2, 0, 0 });

	public GenealogyConnectionEditPart(GenealogyConnection GenealogyConnection) {

		setModel(GenealogyConnection);
	}

	@Override
	public GenealogyConnection getModel() {
		return (GenealogyConnection) super.getModel();
	}

	@Override
	protected void createEditPolicies() {
		ConnectionEndpointEditPolicy selectionPolicy = new ConnectionEndpointEditPolicy();
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, selectionPolicy);
	}

	@Override
	protected IFigure createFigure() {
		PolylineConnection connection = new PolylineConnection();
		PolygonDecoration decoration = new PolygonDecoration();
		decoration.setTemplate(ARROWHEAD);
		decoration.setBackgroundColor(
				getModel().isOffspringConnection() ? ColorConstants.white : ColorConstants.darkGray);
		connection.setTargetDecoration(decoration);
		return connection;
	}

}