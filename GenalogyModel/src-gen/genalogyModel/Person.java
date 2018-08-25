/**
 */
package genalogyModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Person</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link genalogyModel.Person#getGenealogygraph
 * <em>Genealogygraph</em>}</li>
 * <li>{@link genalogyModel.Person#getName <em>Name</em>}</li>
 * <li>{@link genalogyModel.Person#getGender <em>Gender</em>}</li>
 * <li>{@link genalogyModel.Person#getBirthYear <em>Birth Year</em>}</li>
 * <li>{@link genalogyModel.Person#getDeathYear <em>Death Year</em>}</li>
 * <li>{@link genalogyModel.Person#getMarriage <em>Marriage</em>}</li>
 * <li>{@link genalogyModel.Person#getParentsMarriage <em>Parents
 * Marriage</em>}</li>
 * <li>{@link genalogyModel.Person#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see genalogyModel.GenalogyModelPackage#getPerson()
 * @model
 * @generated NOT
 */
public interface Person extends GenealogyElement, NoteContainer {
	/**
	 * Returns the value of the '<em><b>Genealogygraph</b></em>' container
	 * reference. It is bidirectional and its opposite is
	 * '{@link genalogyModel.GenealogyGraph#getPersons <em>Persons</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genealogygraph</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Genealogygraph</em>' container reference.
	 * @see #setGenealogygraph(GenealogyGraph)
	 * @see genalogyModel.GenalogyModelPackage#getPerson_Genealogygraph()
	 * @see genalogyModel.GenealogyGraph#getPersons
	 * @model opposite="persons" transient="false"
	 * @generated
	 */
	GenealogyGraph getGenealogygraph();

	/**
	 * Sets the value of the '{@link genalogyModel.Person#getGenealogygraph
	 * <em>Genealogygraph</em>}' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Genealogygraph</em>' container
	 *              reference.
	 * @see #getGenealogygraph()
	 * @generated
	 */
	void setGenealogygraph(GenealogyGraph value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see genalogyModel.GenalogyModelPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link genalogyModel.Person#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute. The literals are
	 * from the enumeration {@link genalogyModel.Gender}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see genalogyModel.Gender
	 * @see #setGender(Gender)
	 * @see genalogyModel.GenalogyModelPackage#getPerson_Gender()
	 * @model
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link genalogyModel.Person#getGender
	 * <em>Gender</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see genalogyModel.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Birth Year</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Year</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Birth Year</em>' attribute.
	 * @see #setBirthYear(int)
	 * @see genalogyModel.GenalogyModelPackage#getPerson_BirthYear()
	 * @model
	 * @generated
	 */
	int getBirthYear();

	/**
	 * Sets the value of the '{@link genalogyModel.Person#getBirthYear <em>Birth
	 * Year</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Birth Year</em>' attribute.
	 * @see #getBirthYear()
	 * @generated
	 */
	void setBirthYear(int value);

	/**
	 * Returns the value of the '<em><b>Death Year</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Death Year</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Death Year</em>' attribute.
	 * @see #setDeathYear(int)
	 * @see genalogyModel.GenalogyModelPackage#getPerson_DeathYear()
	 * @model
	 * @generated
	 */
	int getDeathYear();

	/**
	 * Sets the value of the '{@link genalogyModel.Person#getDeathYear <em>Death
	 * Year</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Death Year</em>' attribute.
	 * @see #getDeathYear()
	 * @generated
	 */
	void setDeathYear(int value);

	/**
	 * Returns the value of the '<em><b>Marriage</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marriage</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Marriage</em>' reference.
	 * @see #setMarriage(Marriage)
	 * @see genalogyModel.GenalogyModelPackage#getPerson_Marriage()
	 * @model
	 * @generated
	 */
	Marriage getMarriage();

	/**
	 * Sets the value of the '{@link genalogyModel.Person#getMarriage
	 * <em>Marriage</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Marriage</em>' reference.
	 * @see #getMarriage()
	 * @generated
	 */
	void setMarriage(Marriage value);

	/**
	 * Returns the value of the '<em><b>Parents Marriage</b></em>' reference. It is
	 * bidirectional and its opposite is '{@link genalogyModel.Marriage#getOffspring
	 * <em>Offspring</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents Marriage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parents Marriage</em>' reference.
	 * @see #setParentsMarriage(Marriage)
	 * @see genalogyModel.GenalogyModelPackage#getPerson_ParentsMarriage()
	 * @see genalogyModel.Marriage#getOffspring
	 * @model opposite="offspring" required="true"
	 * @generated
	 */
	Marriage getParentsMarriage();

	/**
	 * Sets the value of the '{@link genalogyModel.Person#getParentsMarriage
	 * <em>Parents Marriage</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Parents Marriage</em>' reference.
	 * @see #getParentsMarriage()
	 * @generated
	 */
	void setParentsMarriage(Marriage value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link genalogyModel.Note}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see genalogyModel.GenalogyModelPackage#getPerson_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNote();

} // Person
