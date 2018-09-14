import java.util.List;

import org.eclipse.gef.commands.Command;

import genalogyModel.GenalogyModelPackage;
import genalogyModel.GenealogyGraph;
import genalogyModel.Marriage;
import genalogyModel.Person;

class DeleteMarriageCommand extends Command {
	private final GenealogyGraph graph;
	private final Marriage mar;

	public DeleteMarriageCommand(GenealogyGraph graph, Marriage mar) {
		super("Delete marriage");
		System.out.println("delete marriage command initialized");
		this.graph = graph;
		this.mar = mar;
	}

	private Person hasbend, wife;
	private List<Person> offsprings;

	@Override
	public void execute() {
		hasbend = mar.getHasbend();
		wife = mar.getWife();
		offsprings = mar.getOffspring();
		mar.eUnset(GenalogyModelPackage.eINSTANCE.getMarriage_Hasbend());
		mar.eUnset(GenalogyModelPackage.eINSTANCE.getMarriage_Wife());
		mar.eUnset(GenalogyModelPackage.eINSTANCE.getMarriage_Offspring());
		graph.getMarriages().remove(mar);
	}

	@Override
	public void undo() {
		graph.getMarriages().add(mar);
		mar.setHasbend(hasbend);
		mar.setWife(wife);
		mar.getOffspring().addAll(offsprings);

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