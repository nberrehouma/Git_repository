/**
 */
package genalogyModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Genealogy Graph</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link genalogyModel.GenealogyGraph#getPersons <em>Persons</em>}</li>
 * <li>{@link genalogyModel.GenealogyGraph#getNotes <em>Notes</em>}</li>
 * <li>{@link genalogyModel.GenealogyGraph#getMarriages <em>Marriages</em>}</li>
 * </ul>
 *
 * @see genalogyModel.GenalogyModelPackage#getGenealogyGraph()
 * @model
 * @generated NOT
 */
public interface GenealogyGraph extends EObject, NoteContainer {
	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference
	 * list. The list contents are of type {@link genalogyModel.Person}. It is
	 * bidirectional and its opposite is
	 * '{@link genalogyModel.Person#getGenealogygraph <em>Genealogygraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see genalogyModel.GenalogyModelPackage#getGenealogyGraph_Persons()
	 * @see genalogyModel.Person#getGenealogygraph
	 * @model opposite="genealogygraph" containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link genalogyModel.Note}. It is bidirectional
	 * and its opposite is '{@link genalogyModel.Note#getGenealogygraph
	 * <em>Genealogygraph</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see genalogyModel.GenalogyModelPackage#getGenealogyGraph_Notes()
	 * @see genalogyModel.Note#getGenealogygraph
	 * @model opposite="genealogygraph" containment="true"
	 * @generated
	 */
	@Override
	EList<Note> getNotes();

	/**
	 * Returns the value of the '<em><b>Marriages</b></em>' containment reference
	 * list. The list contents are of type {@link genalogyModel.Marriage}. It is
	 * bidirectional and its opposite is
	 * '{@link genalogyModel.Marriage#getGenealogygraph <em>Genealogygraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marriages</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Marriages</em>' containment reference list.
	 * @see genalogyModel.GenalogyModelPackage#getGenealogyGraph_Marriages()
	 * @see genalogyModel.Marriage#getGenealogygraph
	 * @model opposite="genealogygraph" containment="true"
	 * @generated
	 */
	EList<Marriage> getMarriages();

} // GenealogyGraph
