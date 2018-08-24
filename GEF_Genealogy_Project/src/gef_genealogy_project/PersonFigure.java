package gef_genealogy_project;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Pattern;
import org.eclipse.swt.widgets.Display;

public class PersonFigure extends RectangleFigure {
	public PersonFigure(String name, int birthYear, int deathYear, String note) {
		// setBackgroundColor(ColorConstants.lightGray);
		setLayoutManager(new ToolbarLayout());
		setPreferredSize(100, 100);
		setBorder(new LineBorder(1));
		add(new Label(name));
		String datesText = birthYear + " -";
		if (deathYear != -1)
			datesText += " " + deathYear;
		add(new Label(datesText));

		Label noteLabel = new Label(note) {
			@Override
			protected void paintBorder(Graphics graphics) {
				Rectangle r = getBounds();
				graphics.drawLine(r.x, r.y, r.x + r.width, r.y);
			}

			@Override
			public Insets getInsets() {
				// top, left, bottom, right
				return new Insets(2, 0, 0, 0);
			}
		};
		add(noteLabel);
		new FigureMover(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.Shape#paintFigure(org.eclipse.draw2d.Graphics)
	 */

	@Override
	public void paintFigure(Graphics graphics) {

		Rectangle r = getBounds();
		graphics.setBackgroundPattern(new Pattern(Display.getCurrent(), r.x, r.y, r.x + r.width, r.y + r.height,
				ColorConstants.white, ColorConstants.lightGray));
		graphics.fillRectangle(r);

	}

}