import java.io.IOException;
import java.util.Collections;
import java.util.EventObject;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.part.FileEditorInput;

import gef_genealogy_project.Controller;
import genalogyModel.GenalogyModelFactory;
import genalogyModel.GenalogyModelPackage;
import genalogyModel.GenealogyGraph;
import genalogyModel.provider.GenalogyModelItemProviderAdapterFactory;

public class GenealogyGEFEditor extends GraphicalEditorWithFlyoutPalette {

	private GenalogyModelFactory factory;
	private Resource.Factory.Registry reg;
	private Map<String, Object> m;
	private ResourceSetImpl resSet;
	private GenalogyModelItemProviderAdapterFactory adapterFactory;
	private Controller controller = new Controller();
	private GenealogyGraph graph;
	private GraphicalViewer viewer;

	public GenealogyGEFEditor() {

		setEditDomain(new DefaultEditDomain(this));
		// initialisation du gestionnaire de persistance des modèles EMF
		GenalogyModelPackage.eINSTANCE.eClass();
		adapterFactory = new GenalogyModelItemProviderAdapterFactory();
		// adapterFactory.addListener(controller);
		factory = GenalogyModelFactory.eINSTANCE;
		reg = Resource.Factory.Registry.INSTANCE;
		m = reg.getExtensionToFactoryMap();
		m.put("GenalogyModel", new XMIResourceFactoryImpl());
		resSet = new ResourceSetImpl();
		graph = factory.createGenealogyGraph();
		Adapter a = adapterFactory.createAdapter(graph);
		graph.eAdapters().add(a);

	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		return GenealogyGraphEditorPaletteFactory.createPalette();
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

	@Override
	public void doSaveAs() {
		SaveAsDialog dialog = new SaveAsDialog(getSite().getShell());
		dialog.setOriginalFile(((IFileEditorInput) getEditorInput()).getFile());

		dialog.open();
		IPath path = dialog.getResult();
		if (path == null)
			return;
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		super.setInput(new FileEditorInput(file));
		doSave(null);
		setPartName(file.getName());
		firePropertyChange(PROP_INPUT);
	}

	@Override
	protected void configureGraphicalViewer() {
		// TODO Auto-generated method stub
		super.configureGraphicalViewer();
		viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new GenealogyEditPartFactory());
		viewer.setRootEditPart(new ScalableFreeformRootEditPart());
		viewer.setSelectionManager(new ModifiedSelectionManager(viewer));
		// getSite().setSelectionProvider(viewer);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection iStructuredSelection = (IStructuredSelection) event.getSelection();
				@SuppressWarnings("unchecked")
				List<EditPart> selection = iStructuredSelection.toList();
				Iterator<EditPart> it = selection.iterator();
				while (it.hasNext()) {
					EditPart element = it.next();
					System.out.println("selected object of class" + element.getModel().getClass().getName());

				}

			}
		});
		viewer.setKeyHandler(new GraphicalViewerKeyHandler(viewer));
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
		graph = (GenealogyGraph) resource.getContents().get(0);
		// Adapter a = adapterFactory.createAdapter(graph);

		// graph.eAdapters().add(a);
		/*
		 * EList<Person> persons = graph.getPersons(); Iterator<Person> it =
		 * persons.iterator(); while (it.hasNext()) { Person person = it.next();
		 * person.eAdapters().add(adapterFactory.createAdapter(person));
		 * 
		 * }
		 */

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#
	 * initializeGraphicalViewer()
	 */
	@Override
	protected void initializeGraphicalViewer() {
		// TODO Auto-generated method stub
		super.initializeGraphicalViewer();
		GraphicalViewer viewer = getGraphicalViewer();

		try {
			viewer.setContents(graph);
		} catch (Exception e) {
			System.out.println("con't set viewer content" + e.toString());

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#setInput(org.eclipse.ui.IEditorInput)
	 */
	@Override
	protected void setInput(IEditorInput input) {
		// TODO Auto-generated method stub
		super.setInput(input);
		IFile file = ((IFileEditorInput) input).getFile();

		setPartName(file.getName());

		load("file://" + ((IFileEditorInput) input).getFile().getLocation().toString());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#commandStackChanged(java.util.
	 * EventObject)
	 */
	@Override
	public void commandStackChanged(EventObject event) {
		firePropertyChange(IEditorPart.PROP_DIRTY);
		super.commandStackChanged(event);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return true;
	}

}
