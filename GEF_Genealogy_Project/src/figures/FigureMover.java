package figures;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;

import gef_genealogy_project.Controller;
import genalogyModel.GenealogyElement;

public class FigureMover implements MouseListener, MouseMotionListener {

	private Controller controller;
	IFigure figure;

	public FigureMover(Controller controller, IFigure figure, GenealogyElement element) {
		super();
		this.controller = controller;
		controller.model2Figure.put(element, figure);
		this.figure = figure;
		figure.addMouseListener(this);
		figure.addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent me) {
		controller.mouseDragged(figure, me);

	}

	@Override
	public void mouseEntered(MouseEvent me) {
		controller.mouseEntered(figure, me);

	}

	@Override
	public void mouseExited(MouseEvent me) {
		controller.mouseExited(figure, me);

	}

	@Override
	public void mouseHover(MouseEvent me) {
		controller.mouseHover(figure, me);

	}

	@Override
	public void mouseMoved(MouseEvent me) {
		controller.mouseMoved(figure, me);

	}

	@Override
	public void mousePressed(MouseEvent me) {

		controller.mousePressed(figure, me);

	}

	@Override
	public void mouseReleased(MouseEvent me) {
		controller.mouseReleased(figure, me);

	}

	@Override
	public void mouseDoubleClicked(MouseEvent me) {
		controller.mouseDoubleClicked(figure, me);

	}

}
