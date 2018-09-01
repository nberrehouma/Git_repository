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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Pattern;
import org.eclipse.swt.widgets.Display;

import genalogyModel.Person;

public class PersonFigure extends RectangleFigure {

	Person person;
	private Label nameFigure;
	private Image image;
	private LineBorder lineBorder;
	// public static final Image MALE = new Image(Display.getCurrent(),
	// PersonFigure.class.getResourceAsStream("images/man.png"));
//	public static final Image FEMALE = new Image(Display.getCurrent(),
	// PersonFigure.class.getResourceAsStream("images/woman.png"));

	public PersonFigure(String name, int birthYear, int deathYear, Person person) {
		this.person = person;
		// setBackgroundColor(ColorConstants.lightGray);
		setLayoutManager(new ToolbarLayout());
		setPreferredSize(100, 100);
		lineBorder = new LineBorder(1);
		setBorder(new CompoundBorder(lineBorder, new MarginBorder(2, 2, 2, 2)));

		nameFigure = new Label(name);
		add(nameFigure);
		String datesText = birthYear + " -";
		if (deathYear != -1)
			datesText += " " + deathYear;
		add(new Label(datesText));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.Shape#paintFigure(org.eclipse.draw2d.Graphics)
	 */

	public PersonFigure(String name, Image image, int birthYear, int deathYear, Person m) {
		this.person = m;
		// setBackgroundColor(ColorConstants.lightGray);
		setLayoutManager(new ToolbarLayout());
		setPreferredSize(100, 100);
		setBorder(new LineBorder(1));

		nameFigure = new Label(name);
		add(nameFigure);
		String datesText = birthYear + " -";
		if (deathYear != -1)
			datesText += " " + deathYear;
		add(new Label(datesText));
		this.image = image;
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