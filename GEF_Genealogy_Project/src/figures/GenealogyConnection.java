package figures;

import genalogyModel.Marriage;
import genalogyModel.Person;

public class GenealogyConnection {
	public final Person person;
	public final Marriage marriage;

	public GenealogyConnection(Person person, Marriage marriage) {
		this.person = person;
		this.marriage = marriage;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof GenealogyConnection))
			return false;
		GenealogyConnection conn = (GenealogyConnection) obj;
		return conn.person == person && conn.marriage == marriage;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		if (person != null)
			hash += person.hashCode();
		if (marriage != null)
			hash += marriage.hashCode();
		return hash;
	}

	public boolean isOffspringConnection() {
		return marriage != null && marriage.getOffspring().contains(person);
	}
}