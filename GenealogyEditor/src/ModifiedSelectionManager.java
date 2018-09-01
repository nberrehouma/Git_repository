import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.SelectionManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

public class ModifiedSelectionManager extends SelectionManager {

	private final GraphicalViewer viewer;

	public ModifiedSelectionManager(GraphicalViewer viewer) {
		this.viewer = viewer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.SelectionManager#appendSelection(org.eclipse.gef.EditPart)
	 */
	@Override
	public void appendSelection(EditPart part) {
		List<?> selection = ((IStructuredSelection) getSelection()).toList();
		// If "nothing" is selected then getSelection() returns
		// the viewer's primary edit part in which case the
		// specified part should be selected.
		if (selection.size() == 1 && selection.get(0) == viewer.getContents()) {
			super.appendSelection(part);
			return;
		}
		// If the selection already contains an ancestor
		// of the specified part then don't select the part
		if (containsAncestor(selection, part))
			return;
		// Deselect any currently selected parts
		// which have the new part as an ancestor
		Iterator<?> iter = new ArrayList<Object>(selection).iterator();
		while (iter.hasNext()) {
			EditPart each = (EditPart) iter.next();
			if (isAncestor(part, each))
				deselect(each);
		}
		// Call the superclass implemention to select the part
		super.appendSelection(part);
	}

	private static boolean isAncestor(EditPart ancestor, EditPart part) {
		while (part != null) {
			part = part.getParent();
			if (part == ancestor)
				return true;
		}
		return false;
	}

	private static boolean containsAncestor(final List<?> list, EditPart part) {
		while (part != null) {
			part = part.getParent();
			if (list.contains(part))
				return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.SelectionManager#setSelection(org.eclipse.jface.viewers.
	 * ISelection)
	 */
	@Override
	public void setSelection(ISelection selection) {
		/// Build a collection of originally selected parts
		// and a collection from which nested parts are removed
		List<?> oldSelection = ((IStructuredSelection) selection).toList();
		final List<Object> newSelection = new ArrayList<Object>(oldSelection.size());
		newSelection.addAll(oldSelection);
		// Cycle through all selected parts and remove nested parts
		// which have a parent or grandparent part that is selected
		Iterator<Object> iter = newSelection.iterator();
		while (iter.hasNext())
			if (containsAncestor(newSelection, (EditPart) iter.next()))
				iter.remove();
		// Pass the revised selection to the superclass implementation
		// to perform the actual selection
		super.setSelection(new StructuredSelection(newSelection));
	}

}
