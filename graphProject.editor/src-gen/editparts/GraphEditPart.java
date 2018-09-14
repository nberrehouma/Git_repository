package editparts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import graphproject.graph.Graph;
import graphproject.graph.Named;

public class GraphEditPart extends AbstractGraphicalEditPart {

	public GraphEditPart(Graph graph) {
		setModel(graph);
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModel()
	 */
	@Override
	public Graph getModel() {
		// TODO Auto-generated method stub
		return (Graph) super.getModel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	@Override
	protected List getModelChildren() {
		List<Named> allObjects = new ArrayList<Named>();
		allObjects.addAll(getModel().getVertices());
		allObjects.addAll(getModel().getEdges());
		return allObjects;
	}

}
