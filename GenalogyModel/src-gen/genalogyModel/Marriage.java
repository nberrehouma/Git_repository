/**
 */
package genalogyModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marriage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genalogyModel.Marriage#getGenealogygraph <em>Genealogygraph</em>}</li>
 *   <li>{@link genalogyModel.Marriage#getYearMarried <em>Year Married</em>}</li>
 *   <li>{@link genalogyModel.Marriage#getHasbend <em>Hasbend</em>}</li>
 *   <li>{@link genalogyModel.Marriage#getWife <em>Wife</em>}</li>
 *   <li>{@link genalogyModel.Marriage#getOffspring <em>Offspring</em>}</li>
 * </ul>
 *
 * @see genalogyModel.GenalogyModelPackage#getMarriage()
 * @model
 * @generated
 */
public interface Marriage extends GenealogyElement {
	/**
	 * Returns the value of the '<em><b>Genealogygraph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link genalogyModel.GenealogyGraph#getMarriages <em>Marriages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genealogygraph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genealogygraph</em>' container reference.
	 * @see #setGenealogygraph(GenealogyGraph)
	 * @see genalogyModel.GenalogyModelPackage#getMarriage_Genealogygraph()
	 * @see genalogyModel.GenealogyGraph#getMarriages
	 * @model opposite="marriages" transient="false"
	 * @generated
	 */
	GenealogyGraph getGenealogygraph();

	/**
	 * Sets the value of the '{@link genalogyModel.Marriage#getGenealogygraph <em>Genealogygraph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genealogygraph</em>' container reference.
	 * @see #getGenealogygraph()
	 * @generated
	 */
	void setGenealogygraph(GenealogyGraph value);

	/**
	 * Returns the value of the '<em><b>Year Married</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Married</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Married</em>' attribute.
	 * @see #setYearMarried(int)
	 * @see genalogyModel.GenalogyModelPackage#getMarriage_YearMarried()
	 * @model
	 * @generated
	 */
	int getYearMarried();

	/**
	 * Sets the value of the '{@link genalogyModel.Marriage#getYearMarried <em>Year Married</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Married</em>' attribute.
	 * @see #getYearMarried()
	 * @generated
	 */
	void setYearMarried(int value);

	/**
	 * Returns the value of the '<em><b>Hasbend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hasbend</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasbend</em>' reference.
	 * @see #setHasbend(Person)
	 * @see genalogyModel.GenalogyModelPackage#getMarriage_Hasbend()
	 * @model required="true"
	 * @generated
	 */
	Person getHasbend();

	/**
	 * Sets the value of the '{@link genalogyModel.Marriage#getHasbend <em>Hasbend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hasbend</em>' reference.
	 * @see #getHasbend()
	 * @generated
	 */
	void setHasbend(Person value);

	/**
	 * Returns the value of the '<em><b>Wife</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wife</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wife</em>' reference.
	 * @see #setWife(Person)
	 * @see genalogyModel.GenalogyModelPackage#getMarriage_Wife()
	 * @model required="true"
	 * @generated
	 */
	Person getWife();

	/**
	 * Sets the value of the '{@link genalogyModel.Marriage#getWife <em>Wife</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wife</em>' reference.
	 * @see #getWife()
	 * @generated
	 */
	void setWife(Person value);

	/**
	 * Returns the value of the '<em><b>Offspring</b></em>' reference list.
	 * The list contents are of type {@link genalogyModel.Person}.
	 * It is bidirectional and its opposite is '{@link genalogyModel.Person#getParentsMarriage <em>Parents Marriage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offspring</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offspring</em>' reference list.
	 * @see genalogyModel.GenalogyModelPackage#getMarriage_Offspring()
	 * @see genalogyModel.Person#getParentsMarriage
	 * @model opposite="ParentsMarriage"
	 * @generated
	 */
	EList<Person> getOffspring();

} // Marriage
