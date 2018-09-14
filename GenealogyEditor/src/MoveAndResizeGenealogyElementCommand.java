import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import genalogyModel.GenealogyElement;
import genalogyModel.Marriage;
import genalogyModel.Note;
import genalogyModel.Person;

public class MoveAndResizeGenealogyElementCommand extends Command {
	private final GenealogyElement element;
	private final Rectangle box;

	public MoveAndResizeGenealogyElementCommand(GenealogyElement element, Rectangle box) {
		this.element = element;
		this.box = box;
		setLabel("Modify " + getElementName());
	}

	private String getElementName() {
		if (element instanceof Person)
			return "Person";
		if (element instanceof Marriage)
			return "Marriage";
		if (element instanceof Note)
			return "Note";
		return "Element";
	}

	private Rectangle oldBox;

	@Override
	public void execute() {
		oldBox = new Rectangle(element.getX(), element.getY(), element.getWidth(), element.getHeight());
		element.setX(box.x);
		element.setY(box.y);
		element.setWidth(box.width);
		element.setHeight(box.height);
	}

	@Override
	public void undo() {
		element.setX(oldBox.x);
		element.setY(oldBox.y);
		element.setWidth(oldBox.width);
		element.setHeight(oldBox.height);
	}
}