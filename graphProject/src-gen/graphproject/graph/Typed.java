/**
 */
package graphproject.graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphproject.graph.Typed#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see graphproject.graph.GraphPackage#getTyped()
 * @model abstract="true"
 * @generated
 */
public interface Typed extends Named {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Class)
	 * @see graphproject.graph.GraphPackage#getTyped_Type()
	 * @model
	 * @generated
	 */
	Class getType();

	/**
	 * Sets the value of the '{@link graphproject.graph.Typed#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Class value);

} // Typed
