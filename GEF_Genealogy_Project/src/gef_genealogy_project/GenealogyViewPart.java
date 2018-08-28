
package gef_genealogy_project;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import genalogyModel.GenalogyModelFactory;
import genalogyModel.GenalogyModelPackage;
import genalogyModel.GenealogyGraph;
import genalogyModel.Marriage;
import genalogyModel.Note;
import genalogyModel.Person;
import genalogyModel.provider.GenalogyModelItemProviderAdapterFactory;

public class GenealogyViewPart extends ViewPart {

	private GenalogyModelFactory factory;
	private Resource.Factory.Registry reg;
	private Map<String, Object> m;
	private ResourceSetImpl resSet;
	private GenalogyModelItemProviderAdapterFactory adapterFactory;
	private Controller controller = new Controller();

	public GenealogyViewPart() {
		GenalogyModelPackage.eINSTANCE.eClass();
		adapterFactory = new GenalogyModelItemProviderAdapterFactory();
		adapterFactory.addListener(controller);
		factory = GenalogyModelFactory.eINSTANCE;
		reg = Resource.Factory.Registry.INSTANCE;
		m = reg.getExtensionToFactoryMap();
		m.put("GenalogyModel", new XMIResourceFactoryImpl());
		resSet = new ResourceSetImpl();
	}

	@Override
	public void createPartControl(Composite parent) {

		// GenealogyGraph graph = (GenealogyGraph) load();
		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		if (editorPart instanceof genalogyModel.presentation.GenalogyModelEditor) {

			final EditingDomain domain = ((IEditingDomainProvider) editorPart).getEditingDomain();
			ResourceSet set = domain.getResourceSet();
			// set.eAdapters().add(controller);
			Resource res = set.getResources().get(0);
			GenealogyGraph graph = (GenealogyGraph) res.getContents().get(0);
			Adapter a = adapterFactory.createAdapter(graph);

			graph.eAdapters().add(a);
			EList<Person> persons = graph.getPersons();
			Iterator<Person> it = persons.iterator();
			while (it.hasNext()) {
				Person person = it.next();
				person.eAdapters().add(adapterFactory.createAdapter(person));

			}
			createDiagram(parent, graph);
		}

	}

	private Canvas createDiagram(Composite parent, GenealogyGraph graph) {
		Figure root = new Figure();
		root.setFont(parent.getFont());
		XYLayout layout = new XYLayout();
		root.setLayoutManager(layout);
		// Create a canvas to display the root figure
		Canvas canvas = new Canvas(parent, SWT.DOUBLE_BUFFERED);
		canvas.setBackground(ColorConstants.white);
		LightweightSystem lws = new LightweightSystem(canvas);
		lws.setContents(root);

		EList<Person> persons = graph.getPersons();
		Iterator<Person> it = persons.iterator();
		while (it.hasNext()) {
			Person person = it.next();

			IFigure figure = new PersonFigure(person.getName(), person.getBirthYear(), person.getDeathYear(), person);
			new FigureMover(controller, figure, person);
			layout.setConstraint(figure,
					new Rectangle(new Point(person.getX(), person.getY()), figure.getPreferredSize()));
			EList<Note> notes = person.getNote();
			if (notes != null) {
				Iterator<Note> j = notes.iterator();
				while (j.hasNext()) {
					Note note = j.next();
					figure.add(new NoteFigure(note.getText()));
				}
			}

			root.add(figure);
		}

		EList<Marriage> marriages = graph.getMarriages();
		Iterator<Marriage> mars = marriages.iterator();
		while (mars.hasNext()) {
			Marriage marriage = mars.next();

			Person hasband = marriage.getHasbend();
			Person wife = marriage.getWife();
			EList<Person> children = marriage.getOffspring();
			IFigure figure = new MarriageFigure(marriage.getYearMarried(), marriage);
			new FigureMover(controller, figure, marriage);
			layout.setConstraint(figure,
					new Rectangle(new Point(marriage.getX(), marriage.getY()), figure.getPreferredSize()));

			root.add(figure);

			IFigure hasbandFigure = controller.model2Figure.get(hasband);
			IFigure wifeFigure = controller.model2Figure.get(wife);
			if (children.size() >= 1) {
				IFigure[] offspringsFigures = new IFigure[children.size()];

				for (int i = 0; i < children.size(); i++) {
					Person person = children.get(i);
					offspringsFigures[i] = controller.model2Figure.get(person);
					root.add(connect(figure, offspringsFigures[i]));
				}
			}

			if (hasbandFigure != null)
				root.add(connect(figure, hasbandFigure));

			if (wifeFigure != null)
				root.add(connect(figure, wifeFigure));

			if (children.size() >= 1) {
				IFigure offspringsFigure;

				for (int i = 0; i < children.size(); i++) {
					Person person = children.get(i);
					offspringsFigure = controller.model2Figure.get(person);
					if (offspringsFigure != null)
						root.add(connect(figure, offspringsFigure));
				}
			}

		}

		return canvas;
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	private Connection connect(IFigure figure1, IFigure figure2) {
		PolylineConnection connection = new PolylineConnection();
		connection.setSourceAnchor(new ChopboxAnchor(figure1));
		connection.setTargetAnchor(new ChopboxAnchor(figure2));
		return connection;
	}

	public EObject createModel() {

		GenealogyGraph graph = factory.createGenealogyGraph();
		Adapter a = adapterFactory.createAdapter(graph);
		graph.eAdapters().add(a);
		Person nabil = factory.createPerson();

		Adapter b = adapterFactory.createAdapter(nabil);
		nabil.eAdapters().add(b);
		nabil.setName("nabil");
		Person nadjat = factory.createPerson();
		nadjat.eAdapters().add(b);
		nadjat.setName("nadjat");

		graph.getPersons().add(nabil);
		graph.getPersons().add(nadjat);
		return graph;
	}

	public void save(EObject obj) {

		Resource resource = resSet
				.createResource(URI.createURI("file://C:\\Users\\Seven\\runtime-EclipseApplication\\My.GenalogyModel"));
		resource.getContents().add(obj);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public EObject load() {

		Resource resource = resSet.getResource(
				URI.createURI("file://C:\\Users\\Seven\\runtime-EclipseApplication\\genealogy\\My.GenalogyModel"),
				true);
		GenealogyGraph graph = (GenealogyGraph) resource.getContents().get(0);
		Adapter a = adapterFactory.createAdapter(graph);

		graph.eAdapters().add(a);
		EList<Person> persons = graph.getPersons();
		Iterator<Person> it = persons.iterator();
		while (it.hasNext()) {
			Person person = it.next();
			person.eAdapters().add(adapterFactory.createAdapter(person));

		}
		return graph;
	}

}
