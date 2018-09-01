package gef_genealogy_project;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.UpdateManager;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.INotifyChangedListener;

import figures.PersonFigure;
import genalogyModel.GenealogyElement;
import genalogyModel.Person;
import genalogyModel.impl.GenalogyModelPackageImpl;

public class Controller implements INotifyChangedListener {

	private Point location;
	public Map<GenealogyElement, IFigure> model2Figure;
	private GenealogyElement element;

	public Controller() {
		super();
		model2Figure = new HashMap<GenealogyElement, IFigure>();

	}

	@Override
	public void notifyChanged(Notification notification) {

		GenealogyElement notifier = (GenealogyElement) notification.getNotifier();
		if (notifier instanceof Person) {
			Person person = (Person) notifier;
			PersonFigure figure = (PersonFigure) model2Figure.get(person);
			if (notification.getFeature() == GenalogyModelPackageImpl.eINSTANCE.getPerson_Name()) {
				figure.setName(notification.getNewStringValue());

			}

		}
		/*
		 * System.out.println("old value" + notification.getOldStringValue() + "\n" +
		 * "new value " + notification.getNewStringValue() + "\n" + "event type " +
		 * notification.getEventType() + "\n feature " + notification.getFeature() +
		 * "\n notifier class name " + notification.getNotifier().getClass().getName() +
		 * "\n  position " + notification.getPosition());
		 */

	}

	public void mouseDragged(IFigure figure, MouseEvent event) {

		if (location == null)
			return;
		Point newLocation = event.getLocation();
		if (newLocation == null)
			return;
		Dimension offset = newLocation.getDifference(location);
		if (offset.width == 0 && offset.height == 0)
			return;
		location = newLocation;
		UpdateManager updateMgr = figure.getUpdateManager();
		LayoutManager layoutMgr = figure.getParent().getLayoutManager();
		Rectangle bounds = figure.getBounds();
		updateMgr.addDirtyRegion(figure.getParent(), bounds);
		bounds = bounds.getCopy().translate(offset.width, offset.height);
		layoutMgr.setConstraint(figure, bounds);
		figure.translate(offset.width, offset.height);
		updateMgr.addDirtyRegion(figure.getParent(), bounds);
		event.consume();

	}

	public void mouseEntered(IFigure figure, MouseEvent me) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(IFigure figure, MouseEvent me) {
		// TODO Auto-generated method stub

	}

	public void mouseHover(IFigure figure, MouseEvent me) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(IFigure figure, MouseEvent me) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(IFigure figure, MouseEvent event) {

		location = event.getLocation();
		element = getKeyByValue(model2Figure, figure);
		event.consume();
	}

	public void mouseReleased(IFigure figure, MouseEvent event) {

		if (location == null)
			return;

		element.setX(location.x());
		element.setY(location.y());

		/*
		 * try {
		 * 
		 * element.eResource().save(Collections.EMPTY_MAP); } catch (Exception e) {
		 * System.out.println("can't save " + (element == null) + "-------------");
		 * 
		 * }
		 */

		System.out.println("(" + element.getX() + "," + element.getY() + ")");
		element = null;
		location = null;
		event.consume();

	}

	public void mouseDoubleClicked(IFigure figure, MouseEvent me) {
		// TODO Auto-generated method stub

	}

	public GenealogyElement getKeyByValue(Map<GenealogyElement, IFigure> map, IFigure value) {
		for (Entry<GenealogyElement, IFigure> entry : map.entrySet()) {
			if (Objects.equals(value, entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}
}