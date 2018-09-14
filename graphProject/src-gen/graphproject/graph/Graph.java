/**
 */
package graphproject.graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphproject.graph.Graph#getEdges <em>Edges</em>}</li>
 *   <li>{@link graphproject.graph.Graph#getVertices <em>Vertices</em>}</li>
 *   <li>{@link graphproject.graph.Graph#isDirect <em>Direct</em>}</li>
 * </ul>
 *
 * @see graphproject.graph.GraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends Named {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link graphproject.graph.Edge}.
	 * It is bidirectional and its opposite is '{@link graphproject.graph.Edge#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see graphproject.graph.GraphPackage#getGraph_Edges()
	 * @see graphproject.graph.Edge#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link graphproject.graph.Vertex}.
	 * It is bidirectional and its opposite is '{@link graphproject.graph.Vertex#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' containment reference list.
	 * @see graphproject.graph.GraphPackage#getGraph_Vertices()
	 * @see graphproject.graph.Vertex#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<Vertex> getVertices();

	/**
	 * Returns the value of the '<em><b>Direct</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct</em>' attribute.
	 * @see #setDirect(boolean)
	 * @see graphproject.graph.GraphPackage#getGraph_Direct()
	 * @model default="true"
	 * @generated
	 */
	boolean isDirect();

	/**
	 * Sets the value of the '{@link graphproject.graph.Graph#isDirect <em>Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct</em>' attribute.
	 * @see #isDirect()
	 * @generated
	 */
	void setDirect(boolean value);

} // Graph
