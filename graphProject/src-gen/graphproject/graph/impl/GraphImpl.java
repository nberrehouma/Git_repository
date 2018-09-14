/**
 */
package graphproject.graph.impl;

import graphproject.graph.Edge;
import graphproject.graph.Graph;
import graphproject.graph.GraphPackage;
import graphproject.graph.Vertex;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphproject.graph.impl.GraphImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link graphproject.graph.impl.GraphImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link graphproject.graph.impl.GraphImpl#isDirect <em>Direct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends NamedImpl implements Graph {
	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * The cached value of the '{@link #getVertices() <em>Vertices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertices()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> vertices;

	/**
	 * The default value of the '{@link #isDirect() <em>Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDirect() <em>Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirect()
	 * @generated
	 * @ordered
	 */
	protected boolean direct = DIRECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentWithInverseEList<Edge>(Edge.class, this, GraphPackage.GRAPH__EDGES,
					GraphPackage.EDGE__GRAPH);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getVertices() {
		if (vertices == null) {
			vertices = new EObjectContainmentWithInverseEList<Vertex>(Vertex.class, this, GraphPackage.GRAPH__VERTICES,
					GraphPackage.VERTEX__GRAPH);
		}
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirect() {
		return direct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirect(boolean newDirect) {
		boolean oldDirect = direct;
		direct = newDirect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GRAPH__DIRECT, oldDirect, direct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphPackage.GRAPH__EDGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEdges()).basicAdd(otherEnd, msgs);
		case GraphPackage.GRAPH__VERTICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVertices()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphPackage.GRAPH__EDGES:
			return ((InternalEList<?>) getEdges()).basicRemove(otherEnd, msgs);
		case GraphPackage.GRAPH__VERTICES:
			return ((InternalEList<?>) getVertices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GraphPackage.GRAPH__EDGES:
			return getEdges();
		case GraphPackage.GRAPH__VERTICES:
			return getVertices();
		case GraphPackage.GRAPH__DIRECT:
			return isDirect();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GraphPackage.GRAPH__EDGES:
			getEdges().clear();
			getEdges().addAll((Collection<? extends Edge>) newValue);
			return;
		case GraphPackage.GRAPH__VERTICES:
			getVertices().clear();
			getVertices().addAll((Collection<? extends Vertex>) newValue);
			return;
		case GraphPackage.GRAPH__DIRECT:
			setDirect((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GraphPackage.GRAPH__EDGES:
			getEdges().clear();
			return;
		case GraphPackage.GRAPH__VERTICES:
			getVertices().clear();
			return;
		case GraphPackage.GRAPH__DIRECT:
			setDirect(DIRECT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GraphPackage.GRAPH__EDGES:
			return edges != null && !edges.isEmpty();
		case GraphPackage.GRAPH__VERTICES:
			return vertices != null && !vertices.isEmpty();
		case GraphPackage.GRAPH__DIRECT:
			return direct != DIRECT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (direct: ");
		result.append(direct);
		result.append(')');
		return result.toString();
	}

} //GraphImpl
