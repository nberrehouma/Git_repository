package gef_genealogy_project;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.PolygonShape;
import org.eclipse.draw2d.geometry.Rectangle;

public class MarriageFigure extends PolygonShape {
	public MarriageFigure() {
		Rectangle r = new Rectangle(0, 0, 50, 50);
		setStart(r.getTop());
		addPoint(r.getTop());
		addPoint(r.getLeft());
		addPoint(r.getBottom());
		addPoint(r.getRight());
		addPoint(r.getTop());
		setEnd(r.getTop());
		setFill(true);
		setBackgroundColor(ColorConstants.lightGray);
// Add 1 to include width of the border otherwise
// the diamond's right and bottom tips are missing 1 pixel
		setPreferredSize(r.getSize().expand(1, 1));
		new FigureMover(this);
	}
}