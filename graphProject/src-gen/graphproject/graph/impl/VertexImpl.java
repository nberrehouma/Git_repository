/**
 */
package graphproject.graph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import graphproject.graph.Edge;
import graphproject.graph.Graph;
import graphproject.graph.GraphPackage;
import graphproject.graph.Label;
import graphproject.graph.Vertex;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Vertex</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link graphproject.graph.impl.VertexImpl#getGraph <em>Graph</em>}</li>
 * <li>{@link graphproject.graph.impl.VertexImpl#getLabel <em>Label</em>}</li>
 * <li>{@link graphproject.graph.impl.VertexImpl#getOutgoingEdges <em>Outgoing
 * Edges</em>}</li>
 * <li>{@link graphproject.graph.impl.VertexImpl#getIngoingEdges <em>Ingoing
 * Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VertexImpl extends GraphElementImpl implements Vertex {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Label label;

	/**
	 * The cached value of the '{@link #getOutgoingEdges() <em>Outgoing Edges</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOutgoingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> outgoingEdges;

	/**
	 * The cached value of the '{@link #getIngoingEdges() <em>Ingoing Edges</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIngoingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> ingoingEdges;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.VERTEX;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Graph getGraph() {
		if (eContainerFeatureID() != GraphPackage.VERTEX__GRAPH)
			return null;
		return (Graph) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newGraph, GraphPackage.VERTEX__GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setGraph(Graph newGraph) {
		if (newGraph != eInternalContainer()
				|| (eContainerFeatureID() != GraphPackage.VERTEX__GRAPH && newGraph != null)) {
			if (EcoreUtil.isAncestor(this, newGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGraph != null)
				msgs = ((InternalEObject) newGraph).eInverseAdd(this, GraphPackage.GRAPH__VERTICES, Graph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.VERTEX__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Label getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs) {
		Label oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphPackage.VERTEX__LABEL,
					oldLabel, newLabel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLabel(Label newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject) label).eInverseRemove(this, GraphPackage.LABEL__VERTEX, Label.class, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject) newLabel).eInverseAdd(this, GraphPackage.LABEL__VERTEX, Label.class, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.VERTEX__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Edge> getOutgoingEdges() {
		if (outgoingEdges == null) {
			outgoingEdges = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this,
					GraphPackage.VERTEX__OUTGOING_EDGES, GraphPackage.EDGE__SOURCE_VERTEX);
		}
		return outgoingEdges;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Edge> getIngoingEdges() {
		if (ingoingEdges == null) {
			ingoingEdges = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this,
					GraphPackage.VERTEX__INGOING_EDGES, GraphPackage.EDGE__TARGET_VERTEX);
		}
		return ingoingEdges;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphPackage.VERTEX__GRAPH:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetGraph((Graph) otherEnd, msgs);
		case GraphPackage.VERTEX__LABEL:
			if (label != null)
				msgs = ((InternalEObject) label).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphPackage.VERTEX__LABEL, null, msgs);
			return basicSetLabel((Label) otherEnd, msgs);
		case GraphPackage.VERTEX__OUTGOING_EDGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingEdges()).basicAdd(otherEnd, msgs);
		case GraphPackage.VERTEX__INGOING_EDGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIngoingEdges()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphPackage.VERTEX__GRAPH:
			return basicSetGraph(null, msgs);
		case GraphPackage.VERTEX__LABEL:
			return basicSetLabel(null, msgs);
		case GraphPackage.VERTEX__OUTGOING_EDGES:
			return ((InternalEList<?>) getOutgoingEdges()).basicRemove(otherEnd, msgs);
		case GraphPackage.VERTEX__INGOING_EDGES:
			return ((InternalEList<?>) getIngoingEdges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case GraphPackage.VERTEX__GRAPH:
			return eInternalContainer().eInverseRemove(this, GraphPackage.GRAPH__VERTICES, Graph.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GraphPackage.VERTEX__GRAPH:
			return getGraph();
		case GraphPackage.VERTEX__LABEL:
			return getLabel();
		case GraphPackage.VERTEX__OUTGOING_EDGES:
			return getOutgoingEdges();
		case GraphPackage.VERTEX__INGOING_EDGES:
			return getIngoingEdges();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GraphPackage.VERTEX__GRAPH:
			setGraph((Graph) newValue);
			return;
		case GraphPackage.VERTEX__LABEL:
			setLabel((Label) newValue);
			return;
		case GraphPackage.VERTEX__OUTGOING_EDGES:
			getOutgoingEdges().clear();
			getOutgoingEdges().addAll((Collection<? extends Edge>) newValue);
			return;
		case GraphPackage.VERTEX__INGOING_EDGES:
			getIngoingEdges().clear();
			getIngoingEdges().addAll((Collection<? extends Edge>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GraphPackage.VERTEX__GRAPH:
			setGraph((Graph) null);
			return;
		case GraphPackage.VERTEX__LABEL:
			setLabel((Label) null);
			return;
		case GraphPackage.VERTEX__OUTGOING_EDGES:
			getOutgoingEdges().clear();
			return;
		case GraphPackage.VERTEX__INGOING_EDGES:
			getIngoingEdges().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GraphPackage.VERTEX__GRAPH:
			return getGraph() != null;
		case GraphPackage.VERTEX__LABEL:
			return label != null;
		case GraphPackage.VERTEX__OUTGOING_EDGES:
			return outgoingEdges != null && !outgoingEdges.isEmpty();
		case GraphPackage.VERTEX__INGOING_EDGES:
			return ingoingEdges != null && !ingoingEdges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Vertex))
			return false;
		Vertex comparedVertex = (Vertex) obj;
		boolean nameEqual = this.getName().contentEquals(comparedVertex.getName());
		// boolean labelEqual = this.getLabel().equals(comparedVertex.getLabel());
		return nameEqual;// && labelEqual;

	}

} // VertexImpl
