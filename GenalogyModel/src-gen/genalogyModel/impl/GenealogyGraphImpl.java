/**
 */
package genalogyModel.impl;

import genalogyModel.GenalogyModelPackage;
import genalogyModel.GenealogyGraph;
import genalogyModel.Marriage;
import genalogyModel.Note;
import genalogyModel.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genealogy Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genalogyModel.impl.GenealogyGraphImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link genalogyModel.impl.GenealogyGraphImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link genalogyModel.impl.GenealogyGraphImpl#getMarriages <em>Marriages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenealogyGraphImpl extends MinimalEObjectImpl.Container implements GenealogyGraph {
	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> notes;

	/**
	 * The cached value of the '{@link #getMarriages() <em>Marriages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarriages()
	 * @generated
	 * @ordered
	 */
	protected EList<Marriage> marriages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenealogyGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenalogyModelPackage.Literals.GENEALOGY_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentWithInverseEList<Person>(Person.class, this,
					GenalogyModelPackage.GENEALOGY_GRAPH__PERSONS, GenalogyModelPackage.PERSON__GENEALOGYGRAPH);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Note> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentWithInverseEList<Note>(Note.class, this,
					GenalogyModelPackage.GENEALOGY_GRAPH__NOTES, GenalogyModelPackage.NOTE__GENEALOGYGRAPH);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Marriage> getMarriages() {
		if (marriages == null) {
			marriages = new EObjectContainmentWithInverseEList<Marriage>(Marriage.class, this,
					GenalogyModelPackage.GENEALOGY_GRAPH__MARRIAGES, GenalogyModelPackage.MARRIAGE__GENEALOGYGRAPH);
		}
		return marriages;
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
		case GenalogyModelPackage.GENEALOGY_GRAPH__PERSONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPersons()).basicAdd(otherEnd, msgs);
		case GenalogyModelPackage.GENEALOGY_GRAPH__NOTES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNotes()).basicAdd(otherEnd, msgs);
		case GenalogyModelPackage.GENEALOGY_GRAPH__MARRIAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMarriages()).basicAdd(otherEnd, msgs);
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
		case GenalogyModelPackage.GENEALOGY_GRAPH__PERSONS:
			return ((InternalEList<?>) getPersons()).basicRemove(otherEnd, msgs);
		case GenalogyModelPackage.GENEALOGY_GRAPH__NOTES:
			return ((InternalEList<?>) getNotes()).basicRemove(otherEnd, msgs);
		case GenalogyModelPackage.GENEALOGY_GRAPH__MARRIAGES:
			return ((InternalEList<?>) getMarriages()).basicRemove(otherEnd, msgs);
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
		case GenalogyModelPackage.GENEALOGY_GRAPH__PERSONS:
			return getPersons();
		case GenalogyModelPackage.GENEALOGY_GRAPH__NOTES:
			return getNotes();
		case GenalogyModelPackage.GENEALOGY_GRAPH__MARRIAGES:
			return getMarriages();
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
		case GenalogyModelPackage.GENEALOGY_GRAPH__PERSONS:
			getPersons().clear();
			getPersons().addAll((Collection<? extends Person>) newValue);
			return;
		case GenalogyModelPackage.GENEALOGY_GRAPH__NOTES:
			getNotes().clear();
			getNotes().addAll((Collection<? extends Note>) newValue);
			return;
		case GenalogyModelPackage.GENEALOGY_GRAPH__MARRIAGES:
			getMarriages().clear();
			getMarriages().addAll((Collection<? extends Marriage>) newValue);
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
		case GenalogyModelPackage.GENEALOGY_GRAPH__PERSONS:
			getPersons().clear();
			return;
		case GenalogyModelPackage.GENEALOGY_GRAPH__NOTES:
			getNotes().clear();
			return;
		case GenalogyModelPackage.GENEALOGY_GRAPH__MARRIAGES:
			getMarriages().clear();
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
		case GenalogyModelPackage.GENEALOGY_GRAPH__PERSONS:
			return persons != null && !persons.isEmpty();
		case GenalogyModelPackage.GENEALOGY_GRAPH__NOTES:
			return notes != null && !notes.isEmpty();
		case GenalogyModelPackage.GENEALOGY_GRAPH__MARRIAGES:
			return marriages != null && !marriages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenealogyGraphImpl
