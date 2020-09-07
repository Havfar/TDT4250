/**
 */
package StudyProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StudyProgram.Profile#getName <em>Name</em>}</li>
 *   <li>{@link StudyProgram.Profile#getSubProfile <em>Sub Profile</em>}</li>
 *   <li>{@link StudyProgram.Profile#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see StudyProgram.StudyProgramPackage#getProfile()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='canBeSubProfile'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 canBeSubProfile='self.eContainer().eContainer().eClass() &lt;&gt; self.eClass()'"
 * @generated
 */
public interface Profile extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StudyProgram.StudyProgramPackage#getProfile_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StudyProgram.Profile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sub Profile</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgram.Profile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Profile</em>' containment reference list.
	 * @see StudyProgram.StudyProgramPackage#getProfile_SubProfile()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<Profile> getSubProfile();

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' containment reference list.
	 * The list contents are of type {@link StudyProgram.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' containment reference list.
	 * @see StudyProgram.StudyProgramPackage#getProfile_Semester()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemester();

} // Profile
