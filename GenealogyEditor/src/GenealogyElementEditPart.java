import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import genalogyModel.GenealogyElement;

public abstract class GenealogyElementEditPart extends AbstractGraphicalEditPart {

	@Override
	protected void refreshVisuals() {
		GenealogyElement m = (GenealogyElement) getModel();
		Rectangle bounds = new Rectangle(m.getX(), m.getY(), m.getWidth(), m.getHeight());
		((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), bounds);
		super.refreshVisuals();
	}

}
