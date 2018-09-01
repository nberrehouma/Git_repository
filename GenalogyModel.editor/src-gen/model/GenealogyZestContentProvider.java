package model;

import java.util.ArrayList;

import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;

import genalogyModel.GenealogyGraph;
import genalogyModel.Marriage;
import genalogyModel.Person;

public class GenealogyZestContentProvider implements IGraphEntityContentProvider {

	@Override
	public Object[] getElements(Object input) {
		ArrayList<Object> results = new ArrayList<Object>();
		if (input instanceof GenealogyGraph) {
			GenealogyGraph graph = (GenealogyGraph) input;
			results.addAll(graph.getPersons());
			results.addAll(graph.getMarriages());
		}
		return results.toArray();
	}

	@Override
	public Object[] getConnectedTo(Object element) {
		ArrayList<Object> results = new ArrayList<Object>();
		if (element instanceof Person) {
			Person p = (Person) element;
			if (p.getMarriage() != null)
				results.add(p.getMarriage());
		}
		if (element instanceof Marriage) {
			Marriage m = (Marriage) element;
			results.addAll(m.getOffspring());
		}
		return results.toArray();
	}

}
