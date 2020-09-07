/**
 */
package StudyProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Studyprogram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StudyProgram.Studyprogram#getName <em>Name</em>}</li>
 *   <li>{@link StudyProgram.Studyprogram#getNumberOfYears <em>Number Of Years</em>}</li>
 *   <li>{@link StudyProgram.Studyprogram#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link StudyProgram.Studyprogram#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see StudyProgram.StudyProgramPackage#getStudyprogram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isGreaterThan isLessThan'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 isLessThan='self.numberOfYears &lt;= 5' isGreaterThan='self.numberOfYears &gt;= 2'"
 * @generated
 */
public interface Studyprogram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StudyProgram.StudyProgramPackage#getStudyprogram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StudyProgram.Studyprogram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Years</em>' attribute.
	 * @see #setNumberOfYears(int)
	 * @see StudyProgram.StudyProgramPackage#getStudyprogram_NumberOfYears()
	 * @model required="true"
	 * @generated
	 */
	int getNumberOfYears();

	/**
	 * Sets the value of the '{@link StudyProgram.Studyprogram#getNumberOfYears <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Years</em>' attribute.
	 * @see #getNumberOfYears()
	 * @generated
	 */
	void setNumberOfYears(int value);

	/**
	 * Returns the value of the '<em><b>Profiles</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgram.Profile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profiles</em>' containment reference list.
	 * @see StudyProgram.StudyProgramPackage#getStudyprogram_Profiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Profile> getProfiles();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgram.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see StudyProgram.StudyProgramPackage#getStudyprogram_Semesters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // Studyprogram
