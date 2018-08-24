/**
 */
package genalogyModel.impl;

import genalogyModel.GenalogyModelPackage;
import genalogyModel.GenealogyGraph;
import genalogyModel.Note;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genalogyModel.impl.NoteImpl#getGenealogygraph <em>Genealogygraph</em>}</li>
 *   <li>{@link genalogyModel.impl.NoteImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteImpl extends GenealogyElementImpl implements Note {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenalogyModelPackage.Literals.NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenealogyGraph getGenealogygraph() {
		if (eContainerFeatureID() != GenalogyModelPackage.NOTE__GENEALOGYGRAPH)
			return null;
		return (GenealogyGraph) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenealogygraph(GenealogyGraph newGenealogygraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newGenealogygraph, GenalogyModelPackage.NOTE__GENEALOGYGRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenealogygraph(GenealogyGraph newGenealogygraph) {
		if (newGenealogygraph != eInternalContainer()
				|| (eContainerFeatureID() != GenalogyModelPackage.NOTE__GENEALOGYGRAPH && newGenealogygraph != null)) {
			if (EcoreUtil.isAncestor(this, newGenealogygraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenealogygraph != null)
				msgs = ((InternalEObject) newGenealogygraph).eInverseAdd(this,
						GenalogyModelPackage.GENEALOGY_GRAPH__NOTES, GenealogyGraph.class, msgs);
			msgs = basicSetGenealogygraph(newGenealogygraph, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenalogyModelPackage.NOTE__GENEALOGYGRAPH,
					newGenealogygraph, newGenealogygraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenalogyModelPackage.NOTE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GenalogyModelPackage.NOTE__GENEALOGYGRAPH:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetGenealogygraph((GenealogyGraph) otherEnd, msgs);
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
		case GenalogyModelPackage.NOTE__GENEALOGYGRAPH:
			return basicSetGenealogygraph(null, msgs);
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
		case GenalogyModelPackage.NOTE__GENEALOGYGRAPH:
			return eInternalContainer().eInverseRemove(this, GenalogyModelPackage.GENEALOGY_GRAPH__NOTES,
					GenealogyGraph.class, msgs);
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
		case GenalogyModelPackage.NOTE__GENEALOGYGRAPH:
			return getGenealogygraph();
		case GenalogyModelPackage.NOTE__TEXT:
			return getText();
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
		case GenalogyModelPackage.NOTE__GENEALOGYGRAPH:
			setGenealogygraph((GenealogyGraph) newValue);
			return;
		case GenalogyModelPackage.NOTE__TEXT:
			setText((String) newValue);
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
		case GenalogyModelPackage.NOTE__GENEALOGYGRAPH:
			setGenealogygraph((GenealogyGraph) null);
			return;
		case GenalogyModelPackage.NOTE__TEXT:
			setText(TEXT_EDEFAULT);
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
		case GenalogyModelPackage.NOTE__GENEALOGYGRAPH:
			return getGenealogygraph() != null;
		case GenalogyModelPackage.NOTE__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //NoteImpl
