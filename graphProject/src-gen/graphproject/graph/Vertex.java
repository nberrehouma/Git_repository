/**
 */
package graphproject.graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphproject.graph.Vertex#getGraph <em>Graph</em>}</li>
 *   <li>{@link graphproject.graph.Vertex#getLabel <em>Label</em>}</li>
 *   <li>{@link graphproject.graph.Vertex#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link graphproject.graph.Vertex#getIngoingEdges <em>Ingoing Edges</em>}</li>
 * </ul>
 *
 * @see graphproject.graph.GraphPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link graphproject.graph.Graph#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see graphproject.graph.GraphPackage#getVertex_Graph()
	 * @see graphproject.graph.Graph#getVertices
	 * @model opposite="vertices" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link graphproject.graph.Vertex#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link graphproject.graph.Label#getVertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see graphproject.graph.GraphPackage#getVertex_Label()
	 * @see graphproject.graph.Label#getVertex
	 * @model opposite="vertex" containment="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link graphproject.graph.Vertex#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' reference list.
	 * The list contents are of type {@link graphproject.graph.Edge}.
	 * It is bidirectional and its opposite is '{@link graphproject.graph.Edge#getSourceVertex <em>Source Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' reference list.
	 * @see graphproject.graph.GraphPackage#getVertex_OutgoingEdges()
	 * @see graphproject.graph.Edge#getSourceVertex
	 * @model opposite="SourceVertex"
	 * @generated
	 */
	EList<Edge> getOutgoingEdges();

	/**
	 * Returns the value of the '<em><b>Ingoing Edges</b></em>' reference list.
	 * The list contents are of type {@link graphproject.graph.Edge}.
	 * It is bidirectional and its opposite is '{@link graphproject.graph.Edge#getTargetVertex <em>Target Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingoing Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingoing Edges</em>' reference list.
	 * @see graphproject.graph.GraphPackage#getVertex_IngoingEdges()
	 * @see graphproject.graph.Edge#getTargetVertex
	 * @model opposite="targetVertex"
	 * @generated
	 */
	EList<Edge> getIngoingEdges();

} // Vertex
