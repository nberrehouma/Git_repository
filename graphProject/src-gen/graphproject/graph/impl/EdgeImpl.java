/**
 */
package graphproject.graph.impl;

import graphproject.graph.Edge;
import graphproject.graph.Graph;
import graphproject.graph.GraphPackage;
import graphproject.graph.Label;
import graphproject.graph.Vertex;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphproject.graph.impl.EdgeImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link graphproject.graph.impl.EdgeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link graphproject.graph.impl.EdgeImpl#getSourceVertex <em>Source Vertex</em>}</li>
 *   <li>{@link graphproject.graph.impl.EdgeImpl#getTargetVertex <em>Target Vertex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends TypedImpl implements Edge {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Label label;

	/**
	 * The cached value of the '{@link #getSourceVertex() <em>Source Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVertex()
	 * @generated
	 * @ordered
	 */
	protected Vertex sourceVertex;

	/**
	 * The cached value of the '{@link #getTargetVertex() <em>Target Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVertex()
	 * @generated
	 * @ordered
	 */
	protected Vertex targetVertex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getGraph() {
		if (eContainerFeatureID() != GraphPackage.EDGE__GRAPH)
			return null;
		return (Graph) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newGraph, GraphPackage.EDGE__GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(Graph newGraph) {
		if (newGraph != eInternalContainer()
				|| (eContainerFeatureID() != GraphPackage.EDGE__GRAPH && newGraph != null)) {
			if (EcoreUtil.isAncestor(this, newGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGraph != null)
				msgs = ((InternalEObject) newGraph).eInverseAdd(this, GraphPackage.GRAPH__EDGES, Graph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.EDGE__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs) {
		Label oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphPackage.EDGE__LABEL,
					oldLabel, newLabel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(Label newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject) label).eInverseRemove(this, GraphPackage.LABEL__EDGE, Label.class, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject) newLabel).eInverseAdd(this, GraphPackage.LABEL__EDGE, Label.class, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.EDGE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getSourceVertex() {
		if (sourceVertex != null && sourceVertex.eIsProxy()) {
			InternalEObject oldSourceVertex = (InternalEObject) sourceVertex;
			sourceVertex = (Vertex) eResolveProxy(oldSourceVertex);
			if (sourceVertex != oldSourceVertex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphPackage.EDGE__SOURCE_VERTEX,
							oldSourceVertex, sourceVertex));
			}
		}
		return sourceVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetSourceVertex() {
		return sourceVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceVertex(Vertex newSourceVertex, NotificationChain msgs) {
		Vertex oldSourceVertex = sourceVertex;
		sourceVertex = newSourceVertex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphPackage.EDGE__SOURCE_VERTEX, oldSourceVertex, newSourceVertex);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceVertex(Vertex newSourceVertex) {
		if (newSourceVertex != sourceVertex) {
			NotificationChain msgs = null;
			if (sourceVertex != null)
				msgs = ((InternalEObject) sourceVertex).eInverseRemove(this, GraphPackage.VERTEX__OUTGOING_EDGES,
						Vertex.class, msgs);
			if (newSourceVertex != null)
				msgs = ((InternalEObject) newSourceVertex).eInverseAdd(this, GraphPackage.VERTEX__OUTGOING_EDGES,
						Vertex.class, msgs);
			msgs = basicSetSourceVertex(newSourceVertex, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.EDGE__SOURCE_VERTEX, newSourceVertex,
					newSourceVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getTargetVertex() {
		if (targetVertex != null && targetVertex.eIsProxy()) {
			InternalEObject oldTargetVertex = (InternalEObject) targetVertex;
			targetVertex = (Vertex) eResolveProxy(oldTargetVertex);
			if (targetVertex != oldTargetVertex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphPackage.EDGE__TARGET_VERTEX,
							oldTargetVertex, targetVertex));
			}
		}
		return targetVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetTargetVertex() {
		return targetVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetVertex(Vertex newTargetVertex, NotificationChain msgs) {
		Vertex oldTargetVertex = targetVertex;
		targetVertex = newTargetVertex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphPackage.EDGE__TARGET_VERTEX, oldTargetVertex, newTargetVertex);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVertex(Vertex newTargetVertex) {
		if (newTargetVertex != targetVertex) {
			NotificationChain msgs = null;
			if (targetVertex != null)
				msgs = ((InternalEObject) targetVertex).eInverseRemove(this, GraphPackage.VERTEX__INGOING_EDGES,
						Vertex.class, msgs);
			if (newTargetVertex != null)
				msgs = ((InternalEObject) newTargetVertex).eInverseAdd(this, GraphPackage.VERTEX__INGOING_EDGES,
						Vertex.class, msgs);
			msgs = basicSetTargetVertex(newTargetVertex, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.EDGE__TARGET_VERTEX, newTargetVertex,
					newTargetVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphPackage.EDGE__GRAPH:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetGraph((Graph) otherEnd, msgs);
		case GraphPackage.EDGE__LABEL:
			if (label != null)
				msgs = ((InternalEObject) label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphPackage.EDGE__LABEL,
						null, msgs);
			return basicSetLabel((Label) otherEnd, msgs);
		case GraphPackage.EDGE__SOURCE_VERTEX:
			if (sourceVertex != null)
				msgs = ((InternalEObject) sourceVertex).eInverseRemove(this, GraphPackage.VERTEX__OUTGOING_EDGES,
						Vertex.class, msgs);
			return basicSetSourceVertex((Vertex) otherEnd, msgs);
		case GraphPackage.EDGE__TARGET_VERTEX:
			if (targetVertex != null)
				msgs = ((InternalEObject) targetVertex).eInverseRemove(this, GraphPackage.VERTEX__INGOING_EDGES,
						Vertex.class, msgs);
			return basicSetTargetVertex((Vertex) otherEnd, msgs);
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
		case GraphPackage.EDGE__GRAPH:
			return basicSetGraph(null, msgs);
		case GraphPackage.EDGE__LABEL:
			return basicSetLabel(null, msgs);
		case GraphPackage.EDGE__SOURCE_VERTEX:
			return basicSetSourceVertex(null, msgs);
		case GraphPackage.EDGE__TARGET_VERTEX:
			return basicSetTargetVertex(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case GraphPackage.EDGE__GRAPH:
			return eInternalContainer().eInverseRemove(this, GraphPackage.GRAPH__EDGES, Graph.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GraphPackage.EDGE__GRAPH:
			return getGraph();
		case GraphPackage.EDGE__LABEL:
			return getLabel();
		case GraphPackage.EDGE__SOURCE_VERTEX:
			if (resolve)
				return getSourceVertex();
			return basicGetSourceVertex();
		case GraphPackage.EDGE__TARGET_VERTEX:
			if (resolve)
				return getTargetVertex();
			return basicGetTargetVertex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GraphPackage.EDGE__GRAPH:
			setGraph((Graph) newValue);
			return;
		case GraphPackage.EDGE__LABEL:
			setLabel((Label) newValue);
			return;
		case GraphPackage.EDGE__SOURCE_VERTEX:
			setSourceVertex((Vertex) newValue);
			return;
		case GraphPackage.EDGE__TARGET_VERTEX:
			setTargetVertex((Vertex) newValue);
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
		case GraphPackage.EDGE__GRAPH:
			setGraph((Graph) null);
			return;
		case GraphPackage.EDGE__LABEL:
			setLabel((Label) null);
			return;
		case GraphPackage.EDGE__SOURCE_VERTEX:
			setSourceVertex((Vertex) null);
			return;
		case GraphPackage.EDGE__TARGET_VERTEX:
			setTargetVertex((Vertex) null);
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
		case GraphPackage.EDGE__GRAPH:
			return getGraph() != null;
		case GraphPackage.EDGE__LABEL:
			return label != null;
		case GraphPackage.EDGE__SOURCE_VERTEX:
			return sourceVertex != null;
		case GraphPackage.EDGE__TARGET_VERTEX:
			return targetVertex != null;
		}
		return super.eIsSet(featureID);
	}

} //EdgeImpl
