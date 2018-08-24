/**
 */
package genalogyModel.impl;

import genalogyModel.GenalogyModelPackage;
import genalogyModel.GenealogyGraph;
import genalogyModel.Marriage;
import genalogyModel.Person;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marriage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genalogyModel.impl.MarriageImpl#getGenealogygraph <em>Genealogygraph</em>}</li>
 *   <li>{@link genalogyModel.impl.MarriageImpl#getYearMarried <em>Year Married</em>}</li>
 *   <li>{@link genalogyModel.impl.MarriageImpl#getHasbend <em>Hasbend</em>}</li>
 *   <li>{@link genalogyModel.impl.MarriageImpl#getWife <em>Wife</em>}</li>
 *   <li>{@link genalogyModel.impl.MarriageImpl#getOffspring <em>Offspring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarriageImpl extends GenealogyElementImpl implements Marriage {
	/**
	 * The default value of the '{@link #getYearMarried() <em>Year Married</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearMarried()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_MARRIED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearMarried() <em>Year Married</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearMarried()
	 * @generated
	 * @ordered
	 */
	protected int yearMarried = YEAR_MARRIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasbend() <em>Hasbend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasbend()
	 * @generated
	 * @ordered
	 */
	protected Person hasbend;

	/**
	 * The cached value of the '{@link #getWife() <em>Wife</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWife()
	 * @generated
	 * @ordered
	 */
	protected Person wife;

	/**
	 * The cached value of the '{@link #getOffspring() <em>Offspring</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffspring()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> offspring;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarriageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenalogyModelPackage.Literals.MARRIAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenealogyGraph getGenealogygraph() {
		if (eContainerFeatureID() != GenalogyModelPackage.MARRIAGE__GENEALOGYGRAPH)
			return null;
		return (GenealogyGraph) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenealogygraph(GenealogyGraph newGenealogygraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newGenealogygraph, GenalogyModelPackage.MARRIAGE__GENEALOGYGRAPH,
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
				|| (eContainerFeatureID() != GenalogyModelPackage.MARRIAGE__GENEALOGYGRAPH
						&& newGenealogygraph != null)) {
			if (EcoreUtil.isAncestor(this, newGenealogygraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenealogygraph != null)
				msgs = ((InternalEObject) newGenealogygraph).eInverseAdd(this,
						GenalogyModelPackage.GENEALOGY_GRAPH__MARRIAGES, GenealogyGraph.class, msgs);
			msgs = basicSetGenealogygraph(newGenealogygraph, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenalogyModelPackage.MARRIAGE__GENEALOGYGRAPH,
					newGenealogygraph, newGenealogygraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYearMarried() {
		return yearMarried;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearMarried(int newYearMarried) {
		int oldYearMarried = yearMarried;
		yearMarried = newYearMarried;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenalogyModelPackage.MARRIAGE__YEAR_MARRIED,
					oldYearMarried, yearMarried));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getHasbend() {
		if (hasbend != null && hasbend.eIsProxy()) {
			InternalEObject oldHasbend = (InternalEObject) hasbend;
			hasbend = (Person) eResolveProxy(oldHasbend);
			if (hasbend != oldHasbend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenalogyModelPackage.MARRIAGE__HASBEND,
							oldHasbend, hasbend));
			}
		}
		return hasbend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetHasbend() {
		return hasbend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasbend(Person newHasbend) {
		Person oldHasbend = hasbend;
		hasbend = newHasbend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenalogyModelPackage.MARRIAGE__HASBEND, oldHasbend,
					hasbend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getWife() {
		if (wife != null && wife.eIsProxy()) {
			InternalEObject oldWife = (InternalEObject) wife;
			wife = (Person) eResolveProxy(oldWife);
			if (wife != oldWife) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenalogyModelPackage.MARRIAGE__WIFE,
							oldWife, wife));
			}
		}
		return wife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetWife() {
		return wife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWife(Person newWife) {
		Person oldWife = wife;
		wife = newWife;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenalogyModelPackage.MARRIAGE__WIFE, oldWife, wife));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getOffspring() {
		if (offspring == null) {
			offspring = new EObjectWithInverseResolvingEList<Person>(Person.class, this,
					GenalogyModelPackage.MARRIAGE__OFFSPRING, GenalogyModelPackage.PERSON__PARENTS_MARRIAGE);
		}
		return offspring;
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
		case GenalogyModelPackage.MARRIAGE__GENEALOGYGRAPH:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetGenealogygraph((GenealogyGraph) otherEnd, msgs);
		case GenalogyModelPackage.MARRIAGE__OFFSPRING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOffspring()).basicAdd(otherEnd, msgs);
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
		case GenalogyModelPackage.MARRIAGE__GENEALOGYGRAPH:
			return basicSetGenealogygraph(null, msgs);
		case GenalogyModelPackage.MARRIAGE__OFFSPRING:
			return ((InternalEList<?>) getOffspring()).basicRemove(otherEnd, msgs);
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
		case GenalogyModelPackage.MARRIAGE__GENEALOGYGRAPH:
			return eInternalContainer().eInverseRemove(this, GenalogyModelPackage.GENEALOGY_GRAPH__MARRIAGES,
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
		case GenalogyModelPackage.MARRIAGE__GENEALOGYGRAPH:
			return getGenealogygraph();
		case GenalogyModelPackage.MARRIAGE__YEAR_MARRIED:
			return getYearMarried();
		case GenalogyModelPackage.MARRIAGE__HASBEND:
			if (resolve)
				return getHasbend();
			return basicGetHasbend();
		case GenalogyModelPackage.MARRIAGE__WIFE:
			if (resolve)
				return getWife();
			return basicGetWife();
		case GenalogyModelPackage.MARRIAGE__OFFSPRING:
			return getOffspring();
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
		case GenalogyModelPackage.MARRIAGE__GENEALOGYGRAPH:
			setGenealogygraph((GenealogyGraph) newValue);
			return;
		case GenalogyModelPackage.MARRIAGE__YEAR_MARRIED:
			setYearMarried((Integer) newValue);
			return;
		case GenalogyModelPackage.MARRIAGE__HASBEND:
			setHasbend((Person) newValue);
			return;
		case GenalogyModelPackage.MARRIAGE__WIFE:
			setWife((Person) newValue);
			return;
		case GenalogyModelPackage.MARRIAGE__OFFSPRING:
			getOffspring().clear();
			getOffspring().addAll((Collection<? extends Person>) newValue);
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
		case GenalogyModelPackage.MARRIAGE__GENEALOGYGRAPH:
			setGenealogygraph((GenealogyGraph) null);
			return;
		case GenalogyModelPackage.MARRIAGE__YEAR_MARRIED:
			setYearMarried(YEAR_MARRIED_EDEFAULT);
			return;
		case GenalogyModelPackage.MARRIAGE__HASBEND:
			setHasbend((Person) null);
			return;
		case GenalogyModelPackage.MARRIAGE__WIFE:
			setWife((Person) null);
			return;
		case GenalogyModelPackage.MARRIAGE__OFFSPRING:
			getOffspring().clear();
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
		case GenalogyModelPackage.MARRIAGE__GENEALOGYGRAPH:
			return getGenealogygraph() != null;
		case GenalogyModelPackage.MARRIAGE__YEAR_MARRIED:
			return yearMarried != YEAR_MARRIED_EDEFAULT;
		case GenalogyModelPackage.MARRIAGE__HASBEND:
			return hasbend != null;
		case GenalogyModelPackage.MARRIAGE__WIFE:
			return wife != null;
		case GenalogyModelPackage.MARRIAGE__OFFSPRING:
			return offspring != null && !offspring.isEmpty();
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
		result.append(" (yearMarried: ");
		result.append(yearMarried);
		result.append(')');
		return result.toString();
	}

} //MarriageImpl
