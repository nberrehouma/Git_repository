/**
 */
package genalogyModel.impl;

import genalogyModel.GenalogyModelPackage;
import genalogyModel.Gender;
import genalogyModel.GenealogyGraph;
import genalogyModel.Marriage;
import genalogyModel.Note;
import genalogyModel.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genalogyModel.impl.PersonImpl#getGenealogygraph <em>Genealogygraph</em>}</li>
 *   <li>{@link genalogyModel.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link genalogyModel.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link genalogyModel.impl.PersonImpl#getBirthYear <em>Birth Year</em>}</li>
 *   <li>{@link genalogyModel.impl.PersonImpl#getDeathYear <em>Death Year</em>}</li>
 *   <li>{@link genalogyModel.impl.PersonImpl#getMarriage <em>Marriage</em>}</li>
 *   <li>{@link genalogyModel.impl.PersonImpl#getParentsMarriage <em>Parents Marriage</em>}</li>
 *   <li>{@link genalogyModel.impl.PersonImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends GenealogyElementImpl implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final Gender GENDER_EDEFAULT = Gender.MAN;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Gender gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthYear() <em>Birth Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthYear()
	 * @generated
	 * @ordered
	 */
	protected static final int BIRTH_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBirthYear() <em>Birth Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthYear()
	 * @generated
	 * @ordered
	 */
	protected int birthYear = BIRTH_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeathYear() <em>Death Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathYear()
	 * @generated
	 * @ordered
	 */
	protected static final int DEATH_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeathYear() <em>Death Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathYear()
	 * @generated
	 * @ordered
	 */
	protected int deathYear = DEATH_YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMarriage() <em>Marriage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarriage()
	 * @generated
	 * @ordered
	 */
	protected Marriage marriage;

	/**
	 * The cached value of the '{@link #getParentsMarriage() <em>Parents Marriage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentsMarriage()
	 * @generated
	 * @ordered
	 */
	protected Marriage parentsMarriage;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenalogyModelPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenealogyGraph getGenealogygraph() {
		if (eContainerFeatureID() != GenalogyModelPackage.PERSON__GENEALOGYGRAPH)
			return null;
		return (GenealogyGraph) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenealogygraph(GenealogyGraph newGenealogygraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newGenealogygraph, GenalogyModelPackage.PERSON__GENEALOGYGRAPH,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenealogygraph(GenealogyGraph newGenealogygraph) {
		if (newGenealogygraph != eInternalContainer()
				|| (eContainerFeatureID() != GenalogyModelPackage.PERSON__GENEALOGYGRAPH
						&& newGenealogygraph != null)) {
			if (EcoreUtil.isAncestor(this, newGenealogygraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenealogygraph != null)
				msgs = ((InternalEObject) newGenealogygraph).eInverseAdd(this,
						GenalogyModelPackage.GENEALOGY_GRAPH__PERSONS, GenealogyGraph.class, msgs);
			msgs = basicSetGenealogygraph(newGenealogygraph, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenalogyModelPackage.PERSON__GENEALOGYGRAPH,
					newGenealogygraph, newGenealogygraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenalogyModelPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Gender newGender) {
		Gender oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenalogyModelPackage.PERSON__GENDER, oldGender,
					gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthYear(int newBirthYear) {
		int oldBirthYear = birthYear;
		birthYear = newBirthYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenalogyModelPackage.PERSON__BIRTH_YEAR, oldBirthYear,
					birthYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeathYear() {
		return deathYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeathYear(int newDeathYear) {
		int oldDeathYear = deathYear;
		deathYear = newDeathYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenalogyModelPackage.PERSON__DEATH_YEAR, oldDeathYear,
					deathYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marriage getMarriage() {
		if (marriage != null && marriage.eIsProxy()) {
			InternalEObject oldMarriage = (InternalEObject) marriage;
			marriage = (Marriage) eResolveProxy(oldMarriage);
			if (marriage != oldMarriage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenalogyModelPackage.PERSON__MARRIAGE,
							oldMarriage, marriage));
			}
		}
		return marriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marriage basicGetMarriage() {
		return marriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarriage(Marriage newMarriage) {
		Marriage oldMarriage = marriage;
		marriage = newMarriage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenalogyModelPackage.PERSON__MARRIAGE, oldMarriage,
					marriage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marriage getParentsMarriage() {
		if (parentsMarriage != null && parentsMarriage.eIsProxy()) {
			InternalEObject oldParentsMarriage = (InternalEObject) parentsMarriage;
			parentsMarriage = (Marriage) eResolveProxy(oldParentsMarriage);
			if (parentsMarriage != oldParentsMarriage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GenalogyModelPackage.PERSON__PARENTS_MARRIAGE, oldParentsMarriage, parentsMarriage));
			}
		}
		return parentsMarriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marriage basicGetParentsMarriage() {
		return parentsMarriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentsMarriage(Marriage newParentsMarriage, NotificationChain msgs) {
		Marriage oldParentsMarriage = parentsMarriage;
		parentsMarriage = newParentsMarriage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GenalogyModelPackage.PERSON__PARENTS_MARRIAGE, oldParentsMarriage, newParentsMarriage);
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
	public void setParentsMarriage(Marriage newParentsMarriage) {
		if (newParentsMarriage != parentsMarriage) {
			NotificationChain msgs = null;
			if (parentsMarriage != null)
				msgs = ((InternalEObject) parentsMarriage).eInverseRemove(this,
						GenalogyModelPackage.MARRIAGE__OFFSPRING, Marriage.class, msgs);
			if (newParentsMarriage != null)
				msgs = ((InternalEObject) newParentsMarriage).eInverseAdd(this,
						GenalogyModelPackage.MARRIAGE__OFFSPRING, Marriage.class, msgs);
			msgs = basicSetParentsMarriage(newParentsMarriage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenalogyModelPackage.PERSON__PARENTS_MARRIAGE,
					newParentsMarriage, newParentsMarriage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Note> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Note>(Note.class, this, GenalogyModelPackage.PERSON__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GenalogyModelPackage.PERSON__GENEALOGYGRAPH:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetGenealogygraph((GenealogyGraph) otherEnd, msgs);
		case GenalogyModelPackage.PERSON__PARENTS_MARRIAGE:
			if (parentsMarriage != null)
				msgs = ((InternalEObject) parentsMarriage).eInverseRemove(this,
						GenalogyModelPackage.MARRIAGE__OFFSPRING, Marriage.class, msgs);
			return basicSetParentsMarriage((Marriage) otherEnd, msgs);
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
		case GenalogyModelPackage.PERSON__GENEALOGYGRAPH:
			return basicSetGenealogygraph(null, msgs);
		case GenalogyModelPackage.PERSON__PARENTS_MARRIAGE:
			return basicSetParentsMarriage(null, msgs);
		case GenalogyModelPackage.PERSON__NOTE:
			return ((InternalEList<?>) getNote()).basicRemove(otherEnd, msgs);
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
		case GenalogyModelPackage.PERSON__GENEALOGYGRAPH:
			return eInternalContainer().eInverseRemove(this, GenalogyModelPackage.GENEALOGY_GRAPH__PERSONS,
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
		case GenalogyModelPackage.PERSON__GENEALOGYGRAPH:
			return getGenealogygraph();
		case GenalogyModelPackage.PERSON__NAME:
			return getName();
		case GenalogyModelPackage.PERSON__GENDER:
			return getGender();
		case GenalogyModelPackage.PERSON__BIRTH_YEAR:
			return getBirthYear();
		case GenalogyModelPackage.PERSON__DEATH_YEAR:
			return getDeathYear();
		case GenalogyModelPackage.PERSON__MARRIAGE:
			if (resolve)
				return getMarriage();
			return basicGetMarriage();
		case GenalogyModelPackage.PERSON__PARENTS_MARRIAGE:
			if (resolve)
				return getParentsMarriage();
			return basicGetParentsMarriage();
		case GenalogyModelPackage.PERSON__NOTE:
			return getNote();
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
		case GenalogyModelPackage.PERSON__GENEALOGYGRAPH:
			setGenealogygraph((GenealogyGraph) newValue);
			return;
		case GenalogyModelPackage.PERSON__NAME:
			setName((String) newValue);
			return;
		case GenalogyModelPackage.PERSON__GENDER:
			setGender((Gender) newValue);
			return;
		case GenalogyModelPackage.PERSON__BIRTH_YEAR:
			setBirthYear((Integer) newValue);
			return;
		case GenalogyModelPackage.PERSON__DEATH_YEAR:
			setDeathYear((Integer) newValue);
			return;
		case GenalogyModelPackage.PERSON__MARRIAGE:
			setMarriage((Marriage) newValue);
			return;
		case GenalogyModelPackage.PERSON__PARENTS_MARRIAGE:
			setParentsMarriage((Marriage) newValue);
			return;
		case GenalogyModelPackage.PERSON__NOTE:
			getNote().clear();
			getNote().addAll((Collection<? extends Note>) newValue);
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
		case GenalogyModelPackage.PERSON__GENEALOGYGRAPH:
			setGenealogygraph((GenealogyGraph) null);
			return;
		case GenalogyModelPackage.PERSON__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GenalogyModelPackage.PERSON__GENDER:
			setGender(GENDER_EDEFAULT);
			return;
		case GenalogyModelPackage.PERSON__BIRTH_YEAR:
			setBirthYear(BIRTH_YEAR_EDEFAULT);
			return;
		case GenalogyModelPackage.PERSON__DEATH_YEAR:
			setDeathYear(DEATH_YEAR_EDEFAULT);
			return;
		case GenalogyModelPackage.PERSON__MARRIAGE:
			setMarriage((Marriage) null);
			return;
		case GenalogyModelPackage.PERSON__PARENTS_MARRIAGE:
			setParentsMarriage((Marriage) null);
			return;
		case GenalogyModelPackage.PERSON__NOTE:
			getNote().clear();
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
		case GenalogyModelPackage.PERSON__GENEALOGYGRAPH:
			return getGenealogygraph() != null;
		case GenalogyModelPackage.PERSON__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GenalogyModelPackage.PERSON__GENDER:
			return gender != GENDER_EDEFAULT;
		case GenalogyModelPackage.PERSON__BIRTH_YEAR:
			return birthYear != BIRTH_YEAR_EDEFAULT;
		case GenalogyModelPackage.PERSON__DEATH_YEAR:
			return deathYear != DEATH_YEAR_EDEFAULT;
		case GenalogyModelPackage.PERSON__MARRIAGE:
			return marriage != null;
		case GenalogyModelPackage.PERSON__PARENTS_MARRIAGE:
			return parentsMarriage != null;
		case GenalogyModelPackage.PERSON__NOTE:
			return note != null && !note.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", gender: ");
		result.append(gender);
		result.append(", birthYear: ");
		result.append(birthYear);
		result.append(", deathYear: ");
		result.append(deathYear);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
