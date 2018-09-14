package handlers;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import algorithms.GraphUtil;
import graphproject.graph.Graph;
import graphproject.graph.GraphFactory;
import graphproject.graph.GraphPackage;

public class RandomGraphGenegateHandler implements IHandler {

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
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject project = root.getProject("newGraph");

		IFile file = null;
		try {
			// progressMonitor=null

			project.create(null);
			project.open(null);
			file = project.getFile("randomgraph.graph");
			file.create(null, false, null);

		} catch (CoreException e) {
			e.printStackTrace();
		}

		GraphPackage.eINSTANCE.eClass();
		GraphFactory factory = GraphFactory.eINSTANCE;
		Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("graph", new XMIResourceFactoryImpl());
		ResourceSetImpl resSet = new ResourceSetImpl();
		// Resource resource = resSet.getResource(URI.createURI(path), true);
		Graph graph = GraphUtil.randomGraph(5, 8);
		Resource resource = resSet.createResource(URI.createURI("file://" + file.getLocation().toString()));
		resource.getContents().add(graph);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
