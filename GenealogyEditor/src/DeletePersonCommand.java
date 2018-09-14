import org.eclipse.gef.commands.Command;

import genalogyModel.GenalogyModelPackage;
import genalogyModel.GenealogyGraph;
import genalogyModel.Marriage;
import genalogyModel.Person;

public class DeletePersonCommand extends Command {
	private final GenealogyGraph graph;
	private final Person person;

	public DeletePersonCommand(GenealogyGraph graph, Person person) {
		super("Delete " + person.getName());
		System.out.println("delete person command initialized");
		this.graph = graph;
		this.person = person;
	}

	private Marriage marriage;
	private Marriage parentsMarriage;

	@Override
	public void execute() {
		marriage = person.getMarriage();
		parentsMarriage = person.getParentsMarriage();
		person.eUnset(GenalogyModelPackage.eINSTANCE.getPerson_Marriage());
		person.eUnset(GenalogyModelPackage.eINSTANCE.getPerson_ParentsMarriage());
		graph.getPersons().remove(person);
	}

	@Override
	public void undo() {
		graph.getPersons().add(person);
		person.setParentsMarriage(parentsMarriage);
		person.setMarriage(marriage);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	@Override
	public boolean canExecute() {
		return true;
	}

}
