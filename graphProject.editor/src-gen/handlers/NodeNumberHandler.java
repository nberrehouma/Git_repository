package handlers;

import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;

import graphproject.graph.Graph;
import graphproject.graph.GraphFactory;
import graphproject.graph.GraphPackage;

public class NodeNumberHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart activePart = HandlerUtil.getActiveEditor(event);
		IEditorInput input = activePart.getEditorInput();
		IFile file = ((IFileEditorInput) input).getFile();
		String path = "file://" + ((IFileEditorInput) input).getFile().getLocation().toString();
		GraphPackage.eINSTANCE.eClass();
		GraphFactory factory = GraphFactory.eINSTANCE;
		Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("graph", new XMIResourceFactoryImpl());
		ResourceSetImpl resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(path), true);
		Graph graph = (Graph) resource.getContents().get(0);
		System.out.println(graph.getVertices().size());
		MessageBox dialog = new MessageBox(HandlerUtil.getActiveShell(event), SWT.ICON_QUESTION | SWT.OK | SWT.CANCEL);
		dialog.setText("info");
		dialog.setMessage("the active graph contains " + graph.getVertices().size() + " vertex ");

		// open dialog and await user selection
		int returnCode = dialog.open();
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
