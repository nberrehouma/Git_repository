package gef_genealogy_project;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.PolygonShape;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import genalogyModel.GenalogyModelFactory;
import genalogyModel.GenalogyModelPackage;
import genalogyModel.GenealogyGraph;
import genalogyModel.Person;
import genalogyModel.provider.GenalogyModelItemProviderAdapterFactory;

public class GenealogyView {
	public static void main(String[] args) {

		GenealogyView g = new GenealogyView();
		EObject model = g.createModel();
		g.save(model);

		g.run();
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
		NoteFigure note = new NoteFigure("Smith Family");
		note.setFont(parent.getFont());
		final Dimension noteSize = note.getPreferredSize();
		new FigureMover(note);
		root.add(note, new Rectangle(new Point(10, 220 - noteSize.height), noteSize));
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

	public EObject createModel() {
		GenalogyModelPackage.eINSTANCE.eClass();
		GenalogyModelFactory factory = GenalogyModelFactory.eINSTANCE;
		GenalogyModelItemProviderAdapterFactory adapterFactory = new GenalogyModelItemProviderAdapterFactory();
		GenealogyGraph graph = factory.createGenealogyGraph();
		Adapter a = adapterFactory.createAdapter(graph);
		Person person = factory.createPerson();
		Adapter b = adapterFactory.createAdapter(person);
		person.eAdapters().add(b);
		person.setName("nabil");
		Person person2 = factory.createPerson();
		person2.eAdapters().add(b);
		person2.setName("said");
		person.setGenealogygraph(graph);
		person2.setGenealogygraph(graph);
		// graph.getPersons().add(person);
		// graph.getPersons().add(person2);
		return graph;
	}

	public void save(EObject obj) {

		GenalogyModelFactory factory = GenalogyModelFactory.eINSTANCE;

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("GenalogyModel", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI("file://e://My.GenalogyModel"));
		resource.getContents().add(obj);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public EObject load() {

		GenalogyModelFactory factory = GenalogyModelFactory.eINSTANCE;

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("GenalogyModel", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI("file://e://My.GenalogyModel"), true);
		GenealogyGraph graph = (GenealogyGraph) resource.getContents().get(0);

		return graph;
	}

}