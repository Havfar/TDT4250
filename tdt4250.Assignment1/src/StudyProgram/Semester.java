/**
 */
package StudyProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StudyProgram.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link StudyProgram.Semester#getSeason <em>Season</em>}</li>
 *   <li>{@link StudyProgram.Semester#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see StudyProgram.StudyProgramPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasEnoughCredits'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 hasEnoughCredits='self.courses -&gt; select(p | p.isMandetory = true).course.credits -&gt; sum() &lt;= 30.0'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see StudyProgram.StudyProgramPackage#getSemester_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link StudyProgram.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * The literals are from the enumeration {@link StudyProgram.Season}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see StudyProgram.Season
	 * @see #setSeason(Season)
	 * @see StudyProgram.StudyProgramPackage#getSemester_Season()
	 * @model
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link StudyProgram.Semester#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see StudyProgram.Season
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgram.CourseElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see StudyProgram.StudyProgramPackage#getSemester_Courses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CourseElement> getCourses();

} // Semester
