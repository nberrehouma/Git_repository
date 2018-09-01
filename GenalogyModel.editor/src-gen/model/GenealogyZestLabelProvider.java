package model;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.zest.core.viewers.EntityConnectionData;

import genalogyModel.Marriage;
import genalogyModel.Person;

public class GenealogyZestLabelProvider extends LabelProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		StringBuilder builder = new StringBuilder();
		if (element instanceof Person) {
			Person person = (Person) element;
			builder.append(person.getName());
			builder.append('\n');
			builder.append(person.getBirthYear() + " -");
			if (person.getDeathYear() != -1) {
				builder.append(' ');
				builder.append(person.getDeathYear());
			}
		} else if (element instanceof Marriage) {
			Marriage marriage = (Marriage) element;
			builder.append("Married\n");
			builder.append(marriage.getYearMarried());
		} else if (element instanceof EntityConnectionData) {
			EntityConnectionData conn = (EntityConnectionData) element;
			if (conn.source instanceof Person)
				builder.append("Spouse");
			else
				builder.append("Offspring");
		}
		return builder.toString();
	}

}
