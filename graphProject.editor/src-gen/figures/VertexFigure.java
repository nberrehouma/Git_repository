package figures;



import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Pattern;
import org.eclipse.swt.widgets.Display;


import graphproject.graph.Vertex;

public class VertexFigure extends RectangleFigure {

	Vertex vertex;
	private Label nameFigure;
	
	private LineBorder lineBorder;
	

	public VertexFigure(String name, Vertex vertex) {
		this.vertex=vertex;
		// setBackgroundColor(ColorConstants.lightGray);
		setLayoutManager(new ToolbarLayout());
		setPreferredSize(100, 100);
		lineBorder = new LineBorder(1);
		setBorder(new CompoundBorder(lineBorder, new MarginBorder(2, 2, 2, 2)));

		nameFigure = new Label(name);
		add(nameFigure);
		
	}

	

	@Override
	public void paintFigure(Graphics graphics) {

		Rectangle r = getBounds();
		graphics.setBackgroundPattern(new Pattern(Display.getCurrent(), r.x, r.y, r.x + r.width, r.y + r.height,
				ColorConstants.white, ColorConstants.lightGray));
		graphics.fillRectangle(r);

	}

	public void setName(String name)

	{

		nameFigure.setText(name);
	}

	public void setSelected(boolean selected) {
		lineBorder.setColor(selected ? ColorConstants.blue : ColorConstants.black);
		lineBorder.setWidth(selected ? 2 : 1);
		erase();

	}

}