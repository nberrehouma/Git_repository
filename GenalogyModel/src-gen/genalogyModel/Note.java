/**
 */
package genalogyModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genalogyModel.Note#getGenealogygraph <em>Genealogygraph</em>}</li>
 *   <li>{@link genalogyModel.Note#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see genalogyModel.GenalogyModelPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends GenealogyElement {
	/**
	 * Returns the value of the '<em><b>Genealogygraph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link genalogyModel.GenealogyGraph#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genealogygraph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genealogygraph</em>' container reference.
	 * @see #setGenealogygraph(GenealogyGraph)
	 * @see genalogyModel.GenalogyModelPackage#getNote_Genealogygraph()
	 * @see genalogyModel.GenealogyGraph#getNotes
	 * @model opposite="notes" transient="false"
	 * @generated
	 */
	GenealogyGraph getGenealogygraph();

	/**
	 * Sets the value of the '{@link genalogyModel.Note#getGenealogygraph <em>Genealogygraph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genealogygraph</em>' container reference.
	 * @see #getGenealogygraph()
	 * @generated
	 */
	void setGenealogygraph(GenealogyGraph value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see genalogyModel.GenalogyModelPackage#getNote_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link genalogyModel.Note#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Note
