package gef_genealogy_project;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.PolygonShape;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class GenealogyView {
	public static void main(String[] args) {
		new GenealogyView().run();
	}

	private void run() {
		Shell shell = new Shell(new Display());
		shell.setSize(365, 280);
		shell.setText(" application de Genealogie");
		shell.setLayout(new GridLayout());
		Canvas canvas = createDiagram(shell);
		canvas.setLayoutData(new GridData(GridData.FILL_BOTH));
		Display display = shell.getDisplay();
		shell.open();
		while (!shell.isDisposed()) {
			while (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	private Canvas createDiagram(Composite parent) {
		// Create a root figure and simple layout to contain
		// all other figures
		Figure root = new Figure();
		root.setFont(parent.getFont());
		XYLayout layout = new XYLayout();
		root.setLayoutManager(layout);
		// Create a canvas to display the root figure
		Canvas canvas = new Canvas(parent, SWT.DOUBLE_BUFFERED);
		canvas.setBackground(ColorConstants.white);
		LightweightSystem lws = new LightweightSystem(canvas);
		lws.setContents(root);
		// Add the father "Andy"
		IFigure andy = new PersonFigure("Andy", 1922, 2002, "Andy was a\ngood man.");// createPersonFigure("Andy");
		root.add(andy);
		layout.setConstraint(andy, new Rectangle(new Point(10, 10), andy.getPreferredSize()));
		// Add the mother "Betty"
		IFigure betty = new PersonFigure("Betty", 1924, 2006, "Betty was a\ngood woman.");// createPersonFigure("Betty");

		root.add(betty);
		layout.setConstraint(betty, new Rectangle(new Point(230, 10), betty.getPreferredSize()));
		// Add the son "Carl"
		IFigure carl = new PersonFigure("Carl", 1947, -1, "Carl is a\ngood man.");// createPersonFigure("Carl");
		root.add(carl);
		layout.setConstraint(carl, new Rectangle(new Point(120, 120), carl.getPreferredSize()));

		IFigure marriage = new MarriageFigure();// createMarriageFigure();

		root.add(marriage, new Rectangle(new Point(145, 35), marriage.getPreferredSize()));

		root.add(connect(andy, marriage));
		root.add(connect(betty, marriage));
		root.add(connect(carl, marriage));

		return canvas;

	}

	private IFigure createMarriageFigure() {
		Rectangle r = new Rectangle(0, 0, 50, 50);
		PolygonShape polygonShape = new PolygonShape();
		polygonShape.setStart(r.getTop());
		polygonShape.addPoint(r.getTop());
		polygonShape.addPoint(r.getLeft());
		polygonShape.addPoint(r.getBottom());
		polygonShape.addPoint(r.getRight());
		polygonShape.addPoint(r.getTop());
		polygonShape.setEnd(r.getTop());
		polygonShape.setFill(true);
		polygonShape.setBackgroundColor(ColorConstants.lightGray);
		polygonShape.setPreferredSize(r.getSize());

		new FigureMover(polygonShape);
		return polygonShape;
	}

	private Connection connect(IFigure figure1, IFigure figure2) {
		PolylineConnection connection = new PolylineConnection();
		connection.setSourceAnchor(new ChopboxAnchor(figure1));
		connection.setTargetAnchor(new ChopboxAnchor(figure2));
		return connection;
	}
}