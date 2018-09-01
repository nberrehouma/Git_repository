import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import genalogyModel.GenealogyElement;
import genalogyModel.GenealogyGraph;

public class GenealogyGraphEditPart extends AbstractGraphicalEditPart {
	public GenealogyGraphEditPart(GenealogyGraph genealogyGraph) {
		System.out.println("GenealogyGraphEditPart created");
		setModel(genealogyGraph);
	}

	@Override
	public GenealogyGraph getModel() {
		return (GenealogyGraph) super.getModel();
	}

	@Override
	protected IFigure createFigure() {
		Figure figure = new FreeformLayer();
		figure.setBorder(new MarginBorder(3));
		figure.setLayoutManager(new FreeformLayout());
		return figure;
	}

	@Override
	protected void createEditPolicies() {
	}

	@Override
	protected List<GenealogyElement> getModelChildren() {
		List<GenealogyElement> allObjects = new ArrayList<GenealogyElement>();
		allObjects.addAll(getModel().getMarriages());
		allObjects.addAll(getModel().getPersons());
		allObjects.addAll(getModel().getNotes());

		return allObjects;
	}

}