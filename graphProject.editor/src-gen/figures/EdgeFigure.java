package figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.PointList;

import graphproject.graph.Edge;

public class EdgeFigure extends PolylineConnection {
	Edge edge;
	String Name;
	private static final PointList ARROWHEAD = new PointList(new int[] { 0, 0, -2, 2, -2, 0, -2, -2, 0, 0 });

	public EdgeFigure(Edge edge, String name) {
		super();
		this.edge = edge;
		Name = name;
		PolygonDecoration decoration = new PolygonDecoration();
		decoration.setTemplate(ARROWHEAD);
		decoration.setBackgroundColor(ColorConstants.darkGray);
		setTargetDecoration(decoration);
	}

}
