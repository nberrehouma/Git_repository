/**
 */
package graphproject.graph.impl;

import graphproject.graph.Edge;
import graphproject.graph.Entry;
import graphproject.graph.GraphPackage;
import graphproject.graph.Label;
import graphproject.graph.Vertex;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphproject.graph.impl.LabelImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link graphproject.graph.impl.LabelImpl#getVertex <em>Vertex</em>}</li>
 *   <li>{@link graphproject.graph.impl.LabelImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends NamedImpl implements Label {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Entry> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge getEdge() {
		if (eContainerFeatureID() != GraphPackage.LABEL__EDGE)
			return null;
		return (Edge) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdge(Edge newEdge, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEdge, GraphPackage.LABEL__EDGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdge(Edge newEdge) {
		if (newEdge != eInternalContainer() || (eContainerFeatureID() != GraphPackage.LABEL__EDGE && newEdge != null)) {
			if (EcoreUtil.isAncestor(this, newEdge))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEdge != null)
				msgs = ((InternalEObject) newEdge).eInverseAdd(this, GraphPackage.EDGE__LABEL, Edge.class, msgs);
			msgs = basicSetEdge(newEdge, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.LABEL__EDGE, newEdge, newEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getVertex() {
		if (eContainerFeatureID() != GraphPackage.LABEL__VERTEX)
			return null;
		return (Vertex) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVertex(Vertex newVertex, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newVertex, GraphPackage.LABEL__VERTEX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertex(Vertex newVertex) {
		if (newVertex != eInternalContainer()
				|| (eContainerFeatureID() != GraphPackage.LABEL__VERTEX && newVertex != null)) {
			if (EcoreUtil.isAncestor(this, newVertex))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVertex != null)
				msgs = ((InternalEObject) newVertex).eInverseAdd(this, GraphPackage.VERTEX__LABEL, Vertex.class, msgs);
			msgs = basicSetVertex(newVertex, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.LABEL__VERTEX, newVertex, newVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentWithInverseEList<Entry>(Entry.class, this, GraphPackage.LABEL__ENTRIES,
					GraphPackage.ENTRY__LABEL);
		}
		return entries;
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
		case GraphPackage.LABEL__EDGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetEdge((Edge) otherEnd, msgs);
		case GraphPackage.LABEL__VERTEX:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetVertex((Vertex) otherEnd, msgs);
		case GraphPackage.LABEL__ENTRIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEntries()).basicAdd(otherEnd, msgs);
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
		case GraphPackage.LABEL__EDGE:
			return basicSetEdge(null, msgs);
		case GraphPackage.LABEL__VERTEX:
			return basicSetVertex(null, msgs);
		case GraphPackage.LABEL__ENTRIES:
			return ((InternalEList<?>) getEntries()).basicRemove(otherEnd, msgs);
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
		case GraphPackage.LABEL__EDGE:
			return eInternalContainer().eInverseRemove(this, GraphPackage.EDGE__LABEL, Edge.class, msgs);
		case GraphPackage.LABEL__VERTEX:
			return eInternalContainer().eInverseRemove(this, GraphPackage.VERTEX__LABEL, Vertex.class, msgs);
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
		case GraphPackage.LABEL__EDGE:
			return getEdge();
		case GraphPackage.LABEL__VERTEX:
			return getVertex();
		case GraphPackage.LABEL__ENTRIES:
			return getEntries();
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
		case GraphPackage.LABEL__EDGE:
			setEdge((Edge) newValue);
			return;
		case GraphPackage.LABEL__VERTEX:
			setVertex((Vertex) newValue);
			return;
		case GraphPackage.LABEL__ENTRIES:
			getEntries().clear();
			getEntries().addAll((Collection<? extends Entry>) newValue);
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
		case GraphPackage.LABEL__EDGE:
			setEdge((Edge) null);
			return;
		case GraphPackage.LABEL__VERTEX:
			setVertex((Vertex) null);
			return;
		case GraphPackage.LABEL__ENTRIES:
			getEntries().clear();
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
		case GraphPackage.LABEL__EDGE:
			return getEdge() != null;
		case GraphPackage.LABEL__VERTEX:
			return getVertex() != null;
		case GraphPackage.LABEL__ENTRIES:
			return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LabelImpl
