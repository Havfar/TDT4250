/**
 */
package StudyProgram.impl;

import StudyProgram.Course;
import StudyProgram.CourseElement;
import StudyProgram.StudyProgramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StudyProgram.impl.CourseElementImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link StudyProgram.impl.CourseElementImpl#isIsMandetory <em>Is Mandetory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseElementImpl extends MinimalEObjectImpl.Container implements CourseElement {
	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * The default value of the '{@link #isIsMandetory() <em>Is Mandetory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandetory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDETORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandetory() <em>Is Mandetory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandetory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandetory = IS_MANDETORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgramPackage.Literals.COURSE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject)course;
			course = (Course)eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyProgramPackage.COURSE_ELEMENT__COURSE, oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramPackage.COURSE_ELEMENT__COURSE, oldCourse, course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMandetory() {
		return isMandetory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandetory(boolean newIsMandetory) {
		boolean oldIsMandetory = isMandetory;
		isMandetory = newIsMandetory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramPackage.COURSE_ELEMENT__IS_MANDETORY, oldIsMandetory, isMandetory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyProgramPackage.COURSE_ELEMENT__COURSE:
				if (resolve) return getCourse();
				return basicGetCourse();
			case StudyProgramPackage.COURSE_ELEMENT__IS_MANDETORY:
				return isIsMandetory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyProgramPackage.COURSE_ELEMENT__COURSE:
				setCourse((Course)newValue);
				return;
			case StudyProgramPackage.COURSE_ELEMENT__IS_MANDETORY:
				setIsMandetory((Boolean)newValue);
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
			case StudyProgramPackage.COURSE_ELEMENT__COURSE:
				setCourse((Course)null);
				return;
			case StudyProgramPackage.COURSE_ELEMENT__IS_MANDETORY:
				setIsMandetory(IS_MANDETORY_EDEFAULT);
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
			case StudyProgramPackage.COURSE_ELEMENT__COURSE:
				return course != null;
			case StudyProgramPackage.COURSE_ELEMENT__IS_MANDETORY:
				return isMandetory != IS_MANDETORY_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isMandetory: ");
		result.append(isMandetory);
		result.append(')');
		return result.toString();
	}

} //CourseElementImpl
