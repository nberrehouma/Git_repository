/**
 */
package genalogyModel.impl;

import genalogyModel.GenalogyModelFactory;
import genalogyModel.GenalogyModelPackage;
import genalogyModel.Gender;
import genalogyModel.GenealogyElement;
import genalogyModel.GenealogyGraph;
import genalogyModel.Marriage;
import genalogyModel.Note;
import genalogyModel.NoteContainer;
import genalogyModel.Person;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenalogyModelPackageImpl extends EPackageImpl implements GenalogyModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genealogyGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genealogyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marriageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see genalogyModel.GenalogyModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenalogyModelPackageImpl() {
		super(eNS_URI, GenalogyModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GenalogyModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenalogyModelPackage init() {
		if (isInited)
			return (GenalogyModelPackage) EPackage.Registry.INSTANCE.getEPackage(GenalogyModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGenalogyModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GenalogyModelPackageImpl theGenalogyModelPackage = registeredGenalogyModelPackage instanceof GenalogyModelPackageImpl
				? (GenalogyModelPackageImpl) registeredGenalogyModelPackage
				: new GenalogyModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGenalogyModelPackage.createPackageContents();

		// Initialize created meta-data
		theGenalogyModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenalogyModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenalogyModelPackage.eNS_URI, theGenalogyModelPackage);
		return theGenalogyModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenealogyGraph() {
		return genealogyGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenealogyGraph_Persons() {
		return (EReference) genealogyGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenealogyGraph_Notes() {
		return (EReference) genealogyGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenealogyGraph_Marriages() {
		return (EReference) genealogyGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteContainer() {
		return noteContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNoteContainer__AddNote__Note() {
		return noteContainerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNoteContainer__RemoveNote__Note() {
		return noteContainerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNoteContainer__GetNotes() {
		return noteContainerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNoteContainer__RemoveAllNotes() {
		return noteContainerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenealogyElement() {
		return genealogyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenealogyElement_X() {
		return (EAttribute) genealogyElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenealogyElement_Y() {
		return (EAttribute) genealogyElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenealogyElement_Width() {
		return (EAttribute) genealogyElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenealogyElement_Height() {
		return (EAttribute) genealogyElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Genealogygraph() {
		return (EReference) personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Gender() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_BirthYear() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_DeathYear() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Marriage() {
		return (EReference) personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_ParentsMarriage() {
		return (EReference) personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Note() {
		return (EReference) personEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarriage() {
		return marriageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarriage_Genealogygraph() {
		return (EReference) marriageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarriage_YearMarried() {
		return (EAttribute) marriageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarriage_Hasbend() {
		return (EReference) marriageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarriage_Wife() {
		return (EReference) marriageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarriage_Offspring() {
		return (EReference) marriageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNote_Genealogygraph() {
		return (EReference) noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Text() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGender() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenalogyModelFactory getGenalogyModelFactory() {
		return (GenalogyModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		genealogyGraphEClass = createEClass(GENEALOGY_GRAPH);
		createEReference(genealogyGraphEClass, GENEALOGY_GRAPH__PERSONS);
		createEReference(genealogyGraphEClass, GENEALOGY_GRAPH__NOTES);
		createEReference(genealogyGraphEClass, GENEALOGY_GRAPH__MARRIAGES);

		noteContainerEClass = createEClass(NOTE_CONTAINER);
		createEOperation(noteContainerEClass, NOTE_CONTAINER___ADD_NOTE__NOTE);
		createEOperation(noteContainerEClass, NOTE_CONTAINER___REMOVE_NOTE__NOTE);
		createEOperation(noteContainerEClass, NOTE_CONTAINER___GET_NOTES);
		createEOperation(noteContainerEClass, NOTE_CONTAINER___REMOVE_ALL_NOTES);

		genealogyElementEClass = createEClass(GENEALOGY_ELEMENT);
		createEAttribute(genealogyElementEClass, GENEALOGY_ELEMENT__X);
		createEAttribute(genealogyElementEClass, GENEALOGY_ELEMENT__Y);
		createEAttribute(genealogyElementEClass, GENEALOGY_ELEMENT__WIDTH);
		createEAttribute(genealogyElementEClass, GENEALOGY_ELEMENT__HEIGHT);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__GENEALOGYGRAPH);
		createEAttribute(personEClass, PERSON__NAME);
		createEAttribute(personEClass, PERSON__GENDER);
		createEAttribute(personEClass, PERSON__BIRTH_YEAR);
		createEAttribute(personEClass, PERSON__DEATH_YEAR);
		createEReference(personEClass, PERSON__MARRIAGE);
		createEReference(personEClass, PERSON__PARENTS_MARRIAGE);
		createEReference(personEClass, PERSON__NOTE);

		marriageEClass = createEClass(MARRIAGE);
		createEReference(marriageEClass, MARRIAGE__GENEALOGYGRAPH);
		createEAttribute(marriageEClass, MARRIAGE__YEAR_MARRIED);
		createEReference(marriageEClass, MARRIAGE__HASBEND);
		createEReference(marriageEClass, MARRIAGE__WIFE);
		createEReference(marriageEClass, MARRIAGE__OFFSPRING);

		noteEClass = createEClass(NOTE);
		createEReference(noteEClass, NOTE__GENEALOGYGRAPH);
		createEAttribute(noteEClass, NOTE__TEXT);

		// Create enums
		genderEEnum = createEEnum(GENDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		personEClass.getESuperTypes().add(this.getGenealogyElement());
		marriageEClass.getESuperTypes().add(this.getGenealogyElement());
		noteEClass.getESuperTypes().add(this.getGenealogyElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(genealogyGraphEClass, GenealogyGraph.class, "GenealogyGraph", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenealogyGraph_Persons(), this.getPerson(), this.getPerson_Genealogygraph(), "persons", null,
				0, -1, GenealogyGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenealogyGraph_Notes(), this.getNote(), this.getNote_Genealogygraph(), "notes", null, 0, -1,
				GenealogyGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenealogyGraph_Marriages(), this.getMarriage(), this.getMarriage_Genealogygraph(),
				"marriages", null, 0, -1, GenealogyGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteContainerEClass, NoteContainer.class, "NoteContainer", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getNoteContainer__AddNote__Note(), null, "addNote", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNote(), "note", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNoteContainer__RemoveNote__Note(), null, "removeNote", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNote(), "note", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNoteContainer__GetNotes(), this.getNote(), "getNotes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNoteContainer__RemoveAllNotes(), null, "removeAllNotes", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(genealogyElementEClass, GenealogyElement.class, "GenealogyElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenealogyElement_X(), ecorePackage.getEInt(), "x", null, 0, 1, GenealogyElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenealogyElement_Y(), ecorePackage.getEInt(), "y", null, 0, 1, GenealogyElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenealogyElement_Width(), ecorePackage.getEInt(), "width", null, 0, 1, GenealogyElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenealogyElement_Height(), ecorePackage.getEInt(), "height", null, 0, 1,
				GenealogyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Genealogygraph(), this.getGenealogyGraph(), this.getGenealogyGraph_Persons(),
				"genealogygraph", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Gender(), this.getGender(), "gender", null, 0, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_BirthYear(), ecorePackage.getEInt(), "birthYear", null, 0, 1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_DeathYear(), ecorePackage.getEInt(), "deathYear", null, 0, 1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Marriage(), this.getMarriage(), null, "marriage", null, 0, 1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_ParentsMarriage(), this.getMarriage(), this.getMarriage_Offspring(), "ParentsMarriage",
				null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Note(), this.getNote(), null, "note", null, 0, -1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(marriageEClass, Marriage.class, "Marriage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarriage_Genealogygraph(), this.getGenealogyGraph(), this.getGenealogyGraph_Marriages(),
				"genealogygraph", null, 0, 1, Marriage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarriage_YearMarried(), ecorePackage.getEInt(), "yearMarried", null, 0, 1, Marriage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarriage_Hasbend(), this.getPerson(), null, "hasbend", null, 1, 1, Marriage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarriage_Wife(), this.getPerson(), null, "wife", null, 1, 1, Marriage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMarriage_Offspring(), this.getPerson(), this.getPerson_ParentsMarriage(), "offspring", null,
				0, -1, Marriage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNote_Genealogygraph(), this.getGenealogyGraph(), this.getGenealogyGraph_Notes(),
				"genealogygraph", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Text(), ecorePackage.getEString(), "text", null, 0, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(genderEEnum, Gender.class, "Gender");
		addEEnumLiteral(genderEEnum, Gender.MAN);
		addEEnumLiteral(genderEEnum, Gender.WOMAN);

		// Create resource
		createResource(eNS_URI);
	}

} //GenalogyModelPackageImpl
