/**
 */
package graphproject.graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphproject.graph.Edge#getGraph <em>Graph</em>}</li>
 *   <li>{@link graphproject.graph.Edge#getLabel <em>Label</em>}</li>
 *   <li>{@link graphproject.graph.Edge#getSourceVertex <em>Source Vertex</em>}</li>
 *   <li>{@link graphproject.graph.Edge#getTargetVertex <em>Target Vertex</em>}</li>
 * </ul>
 *
 * @see graphproject.graph.GraphPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends Typed {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link graphproject.graph.Graph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see graphproject.graph.GraphPackage#getEdge_Graph()
	 * @see graphproject.graph.Graph#getEdges
	 * @model opposite="edges" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link graphproject.graph.Edge#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link graphproject.graph.Label#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see graphproject.graph.GraphPackage#getEdge_Label()
	 * @see graphproject.graph.Label#getEdge
	 * @model opposite="edge" containment="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link graphproject.graph.Edge#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Source Vertex</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link graphproject.graph.Vertex#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Vertex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Vertex</em>' reference.
	 * @see #setSourceVertex(Vertex)
	 * @see graphproject.graph.GraphPackage#getEdge_SourceVertex()
	 * @see graphproject.graph.Vertex#getOutgoingEdges
	 * @model opposite="outgoingEdges" required="true"
	 * @generated
	 */
	Vertex getSourceVertex();

	/**
	 * Sets the value of the '{@link graphproject.graph.Edge#getSourceVertex <em>Source Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Vertex</em>' reference.
	 * @see #getSourceVertex()
	 * @generated
	 */
	void setSourceVertex(Vertex value);

	/**
	 * Returns the value of the '<em><b>Target Vertex</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link graphproject.graph.Vertex#getIngoingEdges <em>Ingoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Vertex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Vertex</em>' reference.
	 * @see #setTargetVertex(Vertex)
	 * @see graphproject.graph.GraphPackage#getEdge_TargetVertex()
	 * @see graphproject.graph.Vertex#getIngoingEdges
	 * @model opposite="ingoingEdges" required="true"
	 * @generated
	 */
	Vertex getTargetVertex();

	/**
	 * Sets the value of the '{@link graphproject.graph.Edge#getTargetVertex <em>Target Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Vertex</em>' reference.
	 * @see #getTargetVertex()
	 * @generated
	 */
	void setTargetVertex(Vertex value);

} // Edge
