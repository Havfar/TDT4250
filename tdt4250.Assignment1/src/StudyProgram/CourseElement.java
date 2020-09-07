/**
 */
package StudyProgram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StudyProgram.CourseElement#getCourse <em>Course</em>}</li>
 *   <li>{@link StudyProgram.CourseElement#isIsMandetory <em>Is Mandetory</em>}</li>
 * </ul>
 *
 * @see StudyProgram.StudyProgramPackage#getCourseElement()
 * @model
 * @generated
 */
public interface CourseElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see StudyProgram.StudyProgramPackage#getCourseElement_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link StudyProgram.CourseElement#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Is Mandetory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mandetory</em>' attribute.
	 * @see #setIsMandetory(boolean)
	 * @see StudyProgram.StudyProgramPackage#getCourseElement_IsMandetory()
	 * @model
	 * @generated
	 */
	boolean isIsMandetory();

	/**
	 * Sets the value of the '{@link StudyProgram.CourseElement#isIsMandetory <em>Is Mandetory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandetory</em>' attribute.
	 * @see #isIsMandetory()
	 * @generated
	 */
	void setIsMandetory(boolean value);

} // CourseElement
