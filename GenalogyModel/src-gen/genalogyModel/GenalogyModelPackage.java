/**
 */
package genalogyModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see genalogyModel.GenalogyModelFactory
 * @model kind="package"
 * @generated
 */
public interface GenalogyModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genalogyModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/genalogyModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genalogyModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenalogyModelPackage eINSTANCE = genalogyModel.impl.GenalogyModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link genalogyModel.impl.GenealogyGraphImpl <em>Genealogy Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genalogyModel.impl.GenealogyGraphImpl
	 * @see genalogyModel.impl.GenalogyModelPackageImpl#getGenealogyGraph()
	 * @generated
	 */
	int GENEALOGY_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_GRAPH__PERSONS = 0;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_GRAPH__NOTES = 1;

	/**
	 * The feature id for the '<em><b>Marriages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_GRAPH__MARRIAGES = 2;

	/**
	 * The number of structural features of the '<em>Genealogy Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_GRAPH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Genealogy Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link genalogyModel.NoteContainer <em>Note Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genalogyModel.NoteContainer
	 * @see genalogyModel.impl.GenalogyModelPackageImpl#getNoteContainer()
	 * @generated
	 */
	int NOTE_CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Note Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Note</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_CONTAINER___ADD_NOTE__NOTE = 0;

	/**
	 * The operation id for the '<em>Remove Note</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_CONTAINER___REMOVE_NOTE__NOTE = 1;

	/**
	 * The operation id for the '<em>Get Notes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_CONTAINER___GET_NOTES = 2;

	/**
	 * The operation id for the '<em>Remove All Notes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_CONTAINER___REMOVE_ALL_NOTES = 3;

	/**
	 * The number of operations of the '<em>Note Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_CONTAINER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link genalogyModel.impl.GenealogyElementImpl <em>Genealogy Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genalogyModel.impl.GenealogyElementImpl
	 * @see genalogyModel.impl.GenalogyModelPackageImpl#getGenealogyElement()
	 * @generated
	 */
	int GENEALOGY_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_ELEMENT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_ELEMENT__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_ELEMENT__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_ELEMENT__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Genealogy Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Genealogy Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link genalogyModel.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genalogyModel.impl.PersonImpl
	 * @see genalogyModel.impl.GenalogyModelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__X = GENEALOGY_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__Y = GENEALOGY_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__WIDTH = GENEALOGY_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HEIGHT = GENEALOGY_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Genealogygraph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENEALOGYGRAPH = GENEALOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = GENEALOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = GENEALOGY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Birth Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_YEAR = GENEALOGY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Death Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEATH_YEAR = GENEALOGY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Marriage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MARRIAGE = GENEALOGY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parents Marriage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARENTS_MARRIAGE = GENEALOGY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NOTE = GENEALOGY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = GENEALOGY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = GENEALOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genalogyModel.impl.MarriageImpl <em>Marriage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genalogyModel.impl.MarriageImpl
	 * @see genalogyModel.impl.GenalogyModelPackageImpl#getMarriage()
	 * @generated
	 */
	int MARRIAGE = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__X = GENEALOGY_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__Y = GENEALOGY_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__WIDTH = GENEALOGY_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__HEIGHT = GENEALOGY_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Genealogygraph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__GENEALOGYGRAPH = GENEALOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Year Married</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__YEAR_MARRIED = GENEALOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hasbend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__HASBEND = GENEALOGY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wife</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__WIFE = GENEALOGY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Offspring</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__OFFSPRING = GENEALOGY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Marriage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_FEATURE_COUNT = GENEALOGY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Marriage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_OPERATION_COUNT = GENEALOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genalogyModel.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genalogyModel.impl.NoteImpl
	 * @see genalogyModel.impl.GenalogyModelPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__X = GENEALOGY_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__Y = GENEALOGY_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__WIDTH = GENEALOGY_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__HEIGHT = GENEALOGY_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Genealogygraph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__GENEALOGYGRAPH = GENEALOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__TEXT = GENEALOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = GENEALOGY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = GENEALOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genalogyModel.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genalogyModel.Gender
	 * @see genalogyModel.impl.GenalogyModelPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 6;

	/**
	 * Returns the meta object for class '{@link genalogyModel.GenealogyGraph <em>Genealogy Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genealogy Graph</em>'.
	 * @see genalogyModel.GenealogyGraph
	 * @generated
	 */
	EClass getGenealogyGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link genalogyModel.GenealogyGraph#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see genalogyModel.GenealogyGraph#getPersons()
	 * @see #getGenealogyGraph()
	 * @generated
	 */
	EReference getGenealogyGraph_Persons();

	/**
	 * Returns the meta object for the containment reference list '{@link genalogyModel.GenealogyGraph#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see genalogyModel.GenealogyGraph#getNotes()
	 * @see #getGenealogyGraph()
	 * @generated
	 */
	EReference getGenealogyGraph_Notes();

	/**
	 * Returns the meta object for the containment reference list '{@link genalogyModel.GenealogyGraph#getMarriages <em>Marriages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Marriages</em>'.
	 * @see genalogyModel.GenealogyGraph#getMarriages()
	 * @see #getGenealogyGraph()
	 * @generated
	 */
	EReference getGenealogyGraph_Marriages();

	/**
	 * Returns the meta object for class '{@link genalogyModel.NoteContainer <em>Note Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note Container</em>'.
	 * @see genalogyModel.NoteContainer
	 * @generated
	 */
	EClass getNoteContainer();

	/**
	 * Returns the meta object for the '{@link genalogyModel.NoteContainer#addNote(genalogyModel.Note) <em>Add Note</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Note</em>' operation.
	 * @see genalogyModel.NoteContainer#addNote(genalogyModel.Note)
	 * @generated
	 */
	EOperation getNoteContainer__AddNote__Note();

	/**
	 * Returns the meta object for the '{@link genalogyModel.NoteContainer#removeNote(genalogyModel.Note) <em>Remove Note</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Note</em>' operation.
	 * @see genalogyModel.NoteContainer#removeNote(genalogyModel.Note)
	 * @generated
	 */
	EOperation getNoteContainer__RemoveNote__Note();

	/**
	 * Returns the meta object for the '{@link genalogyModel.NoteContainer#getNotes() <em>Get Notes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Notes</em>' operation.
	 * @see genalogyModel.NoteContainer#getNotes()
	 * @generated
	 */
	EOperation getNoteContainer__GetNotes();

	/**
	 * Returns the meta object for the '{@link genalogyModel.NoteContainer#removeAllNotes() <em>Remove All Notes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove All Notes</em>' operation.
	 * @see genalogyModel.NoteContainer#removeAllNotes()
	 * @generated
	 */
	EOperation getNoteContainer__RemoveAllNotes();

	/**
	 * Returns the meta object for class '{@link genalogyModel.GenealogyElement <em>Genealogy Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genealogy Element</em>'.
	 * @see genalogyModel.GenealogyElement
	 * @generated
	 */
	EClass getGenealogyElement();

	/**
	 * Returns the meta object for the attribute '{@link genalogyModel.GenealogyElement#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see genalogyModel.GenealogyElement#getX()
	 * @see #getGenealogyElement()
	 * @generated
	 */
	EAttribute getGenealogyElement_X();

	/**
	 * Returns the meta object for the attribute '{@link genalogyModel.GenealogyElement#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see genalogyModel.GenealogyElement#getY()
	 * @see #getGenealogyElement()
	 * @generated
	 */
	EAttribute getGenealogyElement_Y();

	/**
	 * Returns the meta object for the attribute '{@link genalogyModel.GenealogyElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see genalogyModel.GenealogyElement#getWidth()
	 * @see #getGenealogyElement()
	 * @generated
	 */
	EAttribute getGenealogyElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link genalogyModel.GenealogyElement#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see genalogyModel.GenealogyElement#getHeight()
	 * @see #getGenealogyElement()
	 * @generated
	 */
	EAttribute getGenealogyElement_Height();

	/**
	 * Returns the meta object for class '{@link genalogyModel.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see genalogyModel.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the container reference '{@link genalogyModel.Person#getGenealogygraph <em>Genealogygraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Genealogygraph</em>'.
	 * @see genalogyModel.Person#getGenealogygraph()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Genealogygraph();

	/**
	 * Returns the meta object for the attribute '{@link genalogyModel.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genalogyModel.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link genalogyModel.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see genalogyModel.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the attribute '{@link genalogyModel.Person#getBirthYear <em>Birth Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Year</em>'.
	 * @see genalogyModel.Person#getBirthYear()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthYear();

	/**
	 * Returns the meta object for the attribute '{@link genalogyModel.Person#getDeathYear <em>Death Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Death Year</em>'.
	 * @see genalogyModel.Person#getDeathYear()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DeathYear();

	/**
	 * Returns the meta object for the reference '{@link genalogyModel.Person#getMarriage <em>Marriage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marriage</em>'.
	 * @see genalogyModel.Person#getMarriage()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Marriage();

	/**
	 * Returns the meta object for the reference '{@link genalogyModel.Person#getParentsMarriage <em>Parents Marriage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parents Marriage</em>'.
	 * @see genalogyModel.Person#getParentsMarriage()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_ParentsMarriage();

	/**
	 * Returns the meta object for the containment reference list '{@link genalogyModel.Person#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see genalogyModel.Person#getNote()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Note();

	/**
	 * Returns the meta object for class '{@link genalogyModel.Marriage <em>Marriage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marriage</em>'.
	 * @see genalogyModel.Marriage
	 * @generated
	 */
	EClass getMarriage();

	/**
	 * Returns the meta object for the container reference '{@link genalogyModel.Marriage#getGenealogygraph <em>Genealogygraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Genealogygraph</em>'.
	 * @see genalogyModel.Marriage#getGenealogygraph()
	 * @see #getMarriage()
	 * @generated
	 */
	EReference getMarriage_Genealogygraph();

	/**
	 * Returns the meta object for the attribute '{@link genalogyModel.Marriage#getYearMarried <em>Year Married</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Married</em>'.
	 * @see genalogyModel.Marriage#getYearMarried()
	 * @see #getMarriage()
	 * @generated
	 */
	EAttribute getMarriage_YearMarried();

	/**
	 * Returns the meta object for the reference '{@link genalogyModel.Marriage#getHasbend <em>Hasbend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hasbend</em>'.
	 * @see genalogyModel.Marriage#getHasbend()
	 * @see #getMarriage()
	 * @generated
	 */
	EReference getMarriage_Hasbend();

	/**
	 * Returns the meta object for the reference '{@link genalogyModel.Marriage#getWife <em>Wife</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wife</em>'.
	 * @see genalogyModel.Marriage#getWife()
	 * @see #getMarriage()
	 * @generated
	 */
	EReference getMarriage_Wife();

	/**
	 * Returns the meta object for the reference list '{@link genalogyModel.Marriage#getOffspring <em>Offspring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offspring</em>'.
	 * @see genalogyModel.Marriage#getOffspring()
	 * @see #getMarriage()
	 * @generated
	 */
	EReference getMarriage_Offspring();

	/**
	 * Returns the meta object for class '{@link genalogyModel.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see genalogyModel.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the container reference '{@link genalogyModel.Note#getGenealogygraph <em>Genealogygraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Genealogygraph</em>'.
	 * @see genalogyModel.Note#getGenealogygraph()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Genealogygraph();

	/**
	 * Returns the meta object for the attribute '{@link genalogyModel.Note#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see genalogyModel.Note#getText()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Text();

	/**
	 * Returns the meta object for enum '{@link genalogyModel.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see genalogyModel.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenalogyModelFactory getGenalogyModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link genalogyModel.impl.GenealogyGraphImpl <em>Genealogy Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genalogyModel.impl.GenealogyGraphImpl
		 * @see genalogyModel.impl.GenalogyModelPackageImpl#getGenealogyGraph()
		 * @generated
		 */
		EClass GENEALOGY_GRAPH = eINSTANCE.getGenealogyGraph();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENEALOGY_GRAPH__PERSONS = eINSTANCE.getGenealogyGraph_Persons();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENEALOGY_GRAPH__NOTES = eINSTANCE.getGenealogyGraph_Notes();

		/**
		 * The meta object literal for the '<em><b>Marriages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENEALOGY_GRAPH__MARRIAGES = eINSTANCE.getGenealogyGraph_Marriages();

		/**
		 * The meta object literal for the '{@link genalogyModel.NoteContainer <em>Note Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genalogyModel.NoteContainer
		 * @see genalogyModel.impl.GenalogyModelPackageImpl#getNoteContainer()
		 * @generated
		 */
		EClass NOTE_CONTAINER = eINSTANCE.getNoteContainer();

		/**
		 * The meta object literal for the '<em><b>Add Note</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTE_CONTAINER___ADD_NOTE__NOTE = eINSTANCE.getNoteContainer__AddNote__Note();

		/**
		 * The meta object literal for the '<em><b>Remove Note</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTE_CONTAINER___REMOVE_NOTE__NOTE = eINSTANCE.getNoteContainer__RemoveNote__Note();

		/**
		 * The meta object literal for the '<em><b>Get Notes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTE_CONTAINER___GET_NOTES = eINSTANCE.getNoteContainer__GetNotes();

		/**
		 * The meta object literal for the '<em><b>Remove All Notes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTE_CONTAINER___REMOVE_ALL_NOTES = eINSTANCE.getNoteContainer__RemoveAllNotes();

		/**
		 * The meta object literal for the '{@link genalogyModel.impl.GenealogyElementImpl <em>Genealogy Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genalogyModel.impl.GenealogyElementImpl
		 * @see genalogyModel.impl.GenalogyModelPackageImpl#getGenealogyElement()
		 * @generated
		 */
		EClass GENEALOGY_ELEMENT = eINSTANCE.getGenealogyElement();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENEALOGY_ELEMENT__X = eINSTANCE.getGenealogyElement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENEALOGY_ELEMENT__Y = eINSTANCE.getGenealogyElement_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENEALOGY_ELEMENT__WIDTH = eINSTANCE.getGenealogyElement_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENEALOGY_ELEMENT__HEIGHT = eINSTANCE.getGenealogyElement_Height();

		/**
		 * The meta object literal for the '{@link genalogyModel.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genalogyModel.impl.PersonImpl
		 * @see genalogyModel.impl.GenalogyModelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Genealogygraph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__GENEALOGYGRAPH = eINSTANCE.getPerson_Genealogygraph();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '<em><b>Birth Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTH_YEAR = eINSTANCE.getPerson_BirthYear();

		/**
		 * The meta object literal for the '<em><b>Death Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DEATH_YEAR = eINSTANCE.getPerson_DeathYear();

		/**
		 * The meta object literal for the '<em><b>Marriage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__MARRIAGE = eINSTANCE.getPerson_Marriage();

		/**
		 * The meta object literal for the '<em><b>Parents Marriage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PARENTS_MARRIAGE = eINSTANCE.getPerson_ParentsMarriage();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__NOTE = eINSTANCE.getPerson_Note();

		/**
		 * The meta object literal for the '{@link genalogyModel.impl.MarriageImpl <em>Marriage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genalogyModel.impl.MarriageImpl
		 * @see genalogyModel.impl.GenalogyModelPackageImpl#getMarriage()
		 * @generated
		 */
		EClass MARRIAGE = eINSTANCE.getMarriage();

		/**
		 * The meta object literal for the '<em><b>Genealogygraph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARRIAGE__GENEALOGYGRAPH = eINSTANCE.getMarriage_Genealogygraph();

		/**
		 * The meta object literal for the '<em><b>Year Married</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARRIAGE__YEAR_MARRIED = eINSTANCE.getMarriage_YearMarried();

		/**
		 * The meta object literal for the '<em><b>Hasbend</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARRIAGE__HASBEND = eINSTANCE.getMarriage_Hasbend();

		/**
		 * The meta object literal for the '<em><b>Wife</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARRIAGE__WIFE = eINSTANCE.getMarriage_Wife();

		/**
		 * The meta object literal for the '<em><b>Offspring</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARRIAGE__OFFSPRING = eINSTANCE.getMarriage_Offspring();

		/**
		 * The meta object literal for the '{@link genalogyModel.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genalogyModel.impl.NoteImpl
		 * @see genalogyModel.impl.GenalogyModelPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Genealogygraph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__GENEALOGYGRAPH = eINSTANCE.getNote_Genealogygraph();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__TEXT = eINSTANCE.getNote_Text();

		/**
		 * The meta object literal for the '{@link genalogyModel.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genalogyModel.Gender
		 * @see genalogyModel.impl.GenalogyModelPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

	}

} //GenalogyModelPackage
