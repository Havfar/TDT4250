/**
 */
package StudyProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StudyProgram.Department#getName <em>Name</em>}</li>
 *   <li>{@link StudyProgram.Department#getCourses <em>Courses</em>}</li>
 *   <li>{@link StudyProgram.Department#getStudyPrograms <em>Study Programs</em>}</li>
 * </ul>
 *
 * @see StudyProgram.StudyProgramPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StudyProgram.StudyProgramPackage#getDepartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StudyProgram.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgram.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see StudyProgram.StudyProgramPackage#getDepartment_Courses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Study Programs</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgram.Studyprogram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Programs</em>' containment reference list.
	 * @see StudyProgram.StudyProgramPackage#getDepartment_StudyPrograms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Studyprogram> getStudyPrograms();

} // Department
