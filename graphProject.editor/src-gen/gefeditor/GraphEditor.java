package gefeditor;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;

import editparts.GraphEditorEditPartFactory;
import graphproject.graph.Graph;
import graphproject.graph.GraphFactory;
import graphproject.graph.GraphPackage;

public class GraphEditor extends GraphicalEditorWithFlyoutPalette {

	private GraphFactory factory;
	private Registry reg;
	private Map<String, Object> m;
	private ResourceSetImpl resSet;
	private Graph graph;
	private GraphicalViewer viewer;

	public GraphEditor() {
		setEditDomain(new DefaultEditDomain(this));
		// initialisation du gestionnaire de persistance des modèles EMF
		GraphPackage.eINSTANCE.eClass();
		factory = GraphFactory.eINSTANCE;
		reg = Resource.Factory.Registry.INSTANCE;
		m = reg.getExtensionToFactoryMap();
		m.put("GenalogyModel", new XMIResourceFactoryImpl());
		resSet = new ResourceSetImpl();
		graph = factory.createGraph();

	}

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new GraphEditorEditPartFactory());
		viewer.setRootEditPart(new ScalableFreeformRootEditPart());
	}

	@Override
	protected void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();

		// TODO Auto-generated method stub
		super.initializeGraphicalViewer();
		// viewer = getGraphicalViewer();

		try {
			System.out.println(graph.getEdges().size());
			System.out.println(viewer);
			viewer.setContents(graph);
		} catch (Exception e) {
			System.out.println("con't set viewer content" + e.toString());

		}
	}

	@Override
	protected void setInput(IEditorInput input) {
		// TODO Auto-generated method stub
		super.setInput(input);
		IFile file = ((IFileEditorInput) input).getFile();

		setPartName(file.getName());

		load("file://" + ((IFileEditorInput) input).getFile().getLocation().toString());

	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		IEditorInput editorInput = this.getEditorInput();
		IFile file = ((IFileEditorInput) editorInput).getFile();
		save("file://" + ((IFileEditorInput) editorInput).getFile().getLocation().toString());
		getCommandStack().markSaveLocation();
		firePropertyChange(PROP_DIRTY);
		System.out.println("content saved");

	}

	public void save(String file) {

		Resource resource = resSet.createResource(URI.createURI(file));
		resource.getContents().add(graph);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void load(String file) {

		Resource resource = resSet.getResource(URI.createURI(file), true);
		graph = (Graph) resource.getContents().get(0);

	}

}
