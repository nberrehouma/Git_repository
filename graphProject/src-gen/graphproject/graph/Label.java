/**
 */
package graphproject.graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphproject.graph.Label#getEdge <em>Edge</em>}</li>
 *   <li>{@link graphproject.graph.Label#getVertex <em>Vertex</em>}</li>
 *   <li>{@link graphproject.graph.Label#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see graphproject.graph.GraphPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends Named {
	/**
	 * Returns the value of the '<em><b>Edge</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link graphproject.graph.Edge#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' container reference.
	 * @see #setEdge(Edge)
	 * @see graphproject.graph.GraphPackage#getLabel_Edge()
	 * @see graphproject.graph.Edge#getLabel
	 * @model opposite="label" transient="false"
	 * @generated
	 */
	Edge getEdge();

	/**
	 * Sets the value of the '{@link graphproject.graph.Label#getEdge <em>Edge</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge</em>' container reference.
	 * @see #getEdge()
	 * @generated
	 */
	void setEdge(Edge value);

	/**
	 * Returns the value of the '<em><b>Vertex</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link graphproject.graph.Vertex#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex</em>' container reference.
	 * @see #setVertex(Vertex)
	 * @see graphproject.graph.GraphPackage#getLabel_Vertex()
	 * @see graphproject.graph.Vertex#getLabel
	 * @model opposite="label" transient="false"
	 * @generated
	 */
	Vertex getVertex();

	/**
	 * Sets the value of the '{@link graphproject.graph.Label#getVertex <em>Vertex</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertex</em>' container reference.
	 * @see #getVertex()
	 * @generated
	 */
	void setVertex(Vertex value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link graphproject.graph.Entry}.
	 * It is bidirectional and its opposite is '{@link graphproject.graph.Entry#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see graphproject.graph.GraphPackage#getLabel_Entries()
	 * @see graphproject.graph.Entry#getLabel
	 * @model opposite="label" containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

} // Label
