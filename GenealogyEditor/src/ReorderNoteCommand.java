import org.eclipse.gef.commands.Command;

import genalogyModel.Note;
import genalogyModel.Person;

public class ReorderNoteCommand extends Command {
	private final Person container;
	private final Note note;
	private int index;
	private int oldIndex;

	public ReorderNoteCommand(Person container, Note note) {
		this.container = container;
		this.note = note;
	}

	public void setAfterNote(Note afterNote) {
		index = container.getNote().indexOf(afterNote) + 1;
	}

	@Override
	public void execute() {
		oldIndex = container.getNote().indexOf(note);
		container.getNote().remove(note);
		container.getNote().add(index <= oldIndex ? index : index - 1, note);
	}

	@Override
	public void undo() {
		container.getNote().remove(note);
		container.getNote().add(oldIndex <= index ? oldIndex : oldIndex - 1, note);
	}
}