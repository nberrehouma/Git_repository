package figures;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;

public class MarriageAnchor extends AbstractConnectionAnchor {
	private static final int RADIUS = 26;

	public MarriageAnchor(IFigure owner) {
		super(owner);
	}

	@Override
	public Point getLocation(Point reference) {
		Point origin = getOwner().getBounds().getCenter();
		int Ax = Math.abs(reference.x - origin.x);
		int Ay = Math.abs(reference.y - origin.y);
		int divisor = Ax + Ay;
		if (divisor == 0)
			return origin;
		int x = (RADIUS * Ax) / divisor;
		int y = (RADIUS * Ay) / divisor;
		if (reference.x < origin.x)
			x = -x;
		if (reference.y < origin.y)
			y = -y;
		return new Point(origin.x + x, origin.y + y);
	}
}