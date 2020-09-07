/**
 */
package StudyProgram.util;

import StudyProgram.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see StudyProgram.StudyProgramPackage
 * @generated
 */
public class StudyProgramValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudyProgramValidator INSTANCE = new StudyProgramValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "StudyProgram";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgramValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudyProgramPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudyProgramPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case StudyProgramPackage.STUDYPROGRAM:
				return validateStudyprogram((Studyprogram)value, diagnostics, context);
			case StudyProgramPackage.PROFILE:
				return validateProfile((Profile)value, diagnostics, context);
			case StudyProgramPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case StudyProgramPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudyProgramPackage.COURSE_ELEMENT:
				return validateCourseElement((CourseElement)value, diagnostics, context);
			case StudyProgramPackage.SEASON:
				return validateSeason((Season)value, diagnostics, context);
			case StudyProgramPackage.LEVEL:
				return validateLevel((Level)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyprogram(Studyprogram studyprogram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(studyprogram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyprogram_isGreaterThan(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyprogram_isLessThan(studyprogram, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isGreaterThan constraint of '<em>Studyprogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STUDYPROGRAM__IS_GREATER_THAN__EEXPRESSION = "self.numberOfYears >= 2";

	/**
	 * Validates the isGreaterThan constraint of '<em>Studyprogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyprogram_isGreaterThan(Studyprogram studyprogram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyProgramPackage.Literals.STUDYPROGRAM,
				 studyprogram,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "isGreaterThan",
				 STUDYPROGRAM__IS_GREATER_THAN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isLessThan constraint of '<em>Studyprogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STUDYPROGRAM__IS_LESS_THAN__EEXPRESSION = "self.numberOfYears <= 5";

	/**
	 * Validates the isLessThan constraint of '<em>Studyprogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyprogram_isLessThan(Studyprogram studyprogram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyProgramPackage.Literals.STUDYPROGRAM,
				 studyprogram,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "isLessThan",
				 STUDYPROGRAM__IS_LESS_THAN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfile(Profile profile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(profile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateProfile_canBeSubProfile(profile, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the canBeSubProfile constraint of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROFILE__CAN_BE_SUB_PROFILE__EEXPRESSION = "self.eContainer().eContainer().eClass() <> self.eClass()";

	/**
	 * Validates the canBeSubProfile constraint of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfile_canBeSubProfile(Profile profile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyProgramPackage.Literals.PROFILE,
				 profile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "canBeSubProfile",
				 PROFILE__CAN_BE_SUB_PROFILE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_hasEnoughCredits(semester, diagnostics, context);
		return result;
	}


	/**
	 * The cached validation expression for the hasEnoughCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__HAS_ENOUGH_CREDITS__EEXPRESSION = "self.courses -> select(p | p.isMandetory = true).course.credits -> sum() <= 30.0";

	/**
	 * Validates the hasEnoughCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_hasEnoughCredits(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyProgramPackage.Literals.SEMESTER,
				 semester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "hasEnoughCredits",
				 SEMESTER__HAS_ENOUGH_CREDITS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_correctCourseCode(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_correctCredits(course, diagnostics, context);
		return result;
	}

	/**
	 * Validates the correctCourseCode constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourse_correctCourseCode(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		String code = course.getCode();
		
		if(code.length()< 6 || code.length() >7) {
			return false;
		}
		for(int i = 0; i < course.getCode().length(); i ++) {
			if(i < 3 && code.length() == 7) {
				if(!Character.isLetter(course.getCode().charAt(i))) {
					return false;
				}
			}else if(i < 2 && code.length() == 6){
				if(!Character.isLetter(course.getCode().charAt(i))) {
					return false;
				}
			}else {
				if(!Character.isDigit(course.getCode().charAt(i))) {
					return false;
				}		
			}
		}
		return true;
	
	}

	/**
	 * Validates the correctCredits constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourse_correctCredits(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return course.getCredits() >= 0.0f && course.getCredits() <= 60.0f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseElement(CourseElement courseElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeason(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevel(Level level, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudyProgramValidator
