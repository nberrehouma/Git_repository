import java.util.Map;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import figures.GenealogyConnection;
import genalogyModel.GenealogyElement;
import genalogyModel.Marriage;
import genalogyModel.Person;

public abstract class GenealogyElementEditPart extends AbstractGraphicalEditPart {

	@Override
	protected void refreshVisuals() {
		GenealogyElement m = (GenealogyElement) getModel();
		Rectangle bounds = new Rectangle(m.getX(), m.getY(), m.getWidth(), m.getHeight());
		((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), bounds);
		super.refreshVisuals();
	}

	protected ConnectionEditPart findConnection(Person p, Marriage m) {
		if (p == null || m == null)
			return null;
		Map<?, ?> registry = getViewer().getEditPartRegistry();
		Object conn = new GenealogyConnection(p, m);
		return (ConnectionEditPart) registry.get(conn);
	}

	protected ConnectionEditPart createOrFindConnection(Person p, Marriage m) {
		Object conn = new GenealogyConnection(p, m);
		return createOrFindConnection(conn);
	}

}
