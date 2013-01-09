/**
 */
package org.earthsystemcurator.cupid.sidl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.sidl.SIDLFactory
 * @model kind="package"
 * @generated
 */
public interface SIDLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sidl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.earthsystemcurator.org/cupid/sidl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sidl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SIDLPackage eINSTANCE = org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.sidl.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.sidl.impl.ClassImpl
	 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Parent Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PARENT_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PACKAGE = 3;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.sidl.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.sidl.impl.SpecificationImpl
	 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.sidl.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.sidl.impl.InterfaceImpl
	 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Parent Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PARENT_INTERFACE = 2;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.sidl.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.sidl.impl.PackageImpl
	 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.sidl.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.sidl.impl.MethodImpl
	 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 4;

	/**
	 * The feature id for the '<em><b>Shortname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SHORTNAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CLASS = 3;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.sidl.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.sidl.impl.ArgumentImpl
	 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__MODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__METHOD = 3;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.sidl.impl.SIDLTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLTypeImpl
	 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getSIDLType()
	 * @generated
	 */
	int SIDL_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDL_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.sidl.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.sidl.impl.ArrayTypeImpl
	 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DIM = SIDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__TYPE = SIDL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = SIDL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.sidl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.sidl.impl.SimpleTypeImpl
	 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__SIMPLE_TYPE = SIDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = SIDL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.sidl.SimpleTypeEnum <em>Simple Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.sidl.SimpleTypeEnum
	 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getSimpleTypeEnum()
	 * @generated
	 */
	int SIMPLE_TYPE_ENUM = 9;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.sidl.ModeEnum <em>Mode Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.sidl.ModeEnum
	 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getModeEnum()
	 * @generated
	 */
	int MODE_ENUM = 10;


	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.sidl.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.sidl.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.sidl.Class#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Class#getMethod()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Method();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.sidl.Class#getParentInterface <em>Parent Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Interface</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Class#getParentInterface()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ParentInterface();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.sidl.Class#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Class#getPackage()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Package();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.sidl.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.sidl.Specification#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Specification#getPackage()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Package();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.sidl.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.sidl.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.sidl.Interface#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Interface#getMethod()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Method();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.sidl.Interface#getParentInterface <em>Parent Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Interface</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Interface#getParentInterface()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ParentInterface();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.sidl.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.sidl.Package#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Package#getClass_()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.sidl.Package#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Package#getInterface()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Interface();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.sidl.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.sidl.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.sidl.Method#getShortname <em>Shortname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shortname</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Method#getShortname()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Shortname();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.sidl.Method#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Method#getType()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.sidl.Method#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Method#getArgument()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Argument();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.sidl.Method#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Class</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Method#getClass_()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Class();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.sidl.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.sidl.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.sidl.Argument#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Argument#getMode()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Mode();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.sidl.Argument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Argument#getType()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.sidl.Argument#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.Argument#getMethod()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Method();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.sidl.SIDLType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.SIDLType
	 * @generated
	 */
	EClass getSIDLType();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.sidl.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.sidl.ArrayType#getDim <em>Dim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dim</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.ArrayType#getDim()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_Dim();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.sidl.ArrayType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.ArrayType#getType()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_Type();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.sidl.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.sidl.SimpleType#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Type</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.SimpleType#getSimpleType()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_SimpleType();

	/**
	 * Returns the meta object for enum '{@link org.earthsystemcurator.cupid.sidl.SimpleTypeEnum <em>Simple Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Type Enum</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.SimpleTypeEnum
	 * @generated
	 */
	EEnum getSimpleTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.earthsystemcurator.cupid.sidl.ModeEnum <em>Mode Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode Enum</em>'.
	 * @see org.earthsystemcurator.cupid.sidl.ModeEnum
	 * @generated
	 */
	EEnum getModeEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SIDLFactory getSIDLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.sidl.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.sidl.impl.ClassImpl
		 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__METHOD = eINSTANCE.getClass_Method();

		/**
		 * The meta object literal for the '<em><b>Parent Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PARENT_INTERFACE = eINSTANCE.getClass_ParentInterface();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PACKAGE = eINSTANCE.getClass_Package();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.sidl.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.sidl.impl.SpecificationImpl
		 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__PACKAGE = eINSTANCE.getSpecification_Package();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.sidl.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.sidl.impl.InterfaceImpl
		 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__METHOD = eINSTANCE.getInterface_Method();

		/**
		 * The meta object literal for the '<em><b>Parent Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PARENT_INTERFACE = eINSTANCE.getInterface_ParentInterface();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.sidl.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.sidl.impl.PackageImpl
		 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CLASS = eINSTANCE.getPackage_Class();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__INTERFACE = eINSTANCE.getPackage_Interface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.sidl.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.sidl.impl.MethodImpl
		 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Shortname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__SHORTNAME = eINSTANCE.getMethod_Shortname();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__TYPE = eINSTANCE.getMethod_Type();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__ARGUMENT = eINSTANCE.getMethod_Argument();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__CLASS = eINSTANCE.getMethod_Class();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.sidl.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.sidl.impl.ArgumentImpl
		 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__MODE = eINSTANCE.getArgument_Mode();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__TYPE = eINSTANCE.getArgument_Type();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__METHOD = eINSTANCE.getArgument_Method();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.sidl.impl.SIDLTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLTypeImpl
		 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getSIDLType()
		 * @generated
		 */
		EClass SIDL_TYPE = eINSTANCE.getSIDLType();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.sidl.impl.ArrayTypeImpl <em>Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.sidl.impl.ArrayTypeImpl
		 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getArrayType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getArrayType();

		/**
		 * The meta object literal for the '<em><b>Dim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_TYPE__DIM = eINSTANCE.getArrayType_Dim();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__TYPE = eINSTANCE.getArrayType_Type();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.sidl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.sidl.impl.SimpleTypeImpl
		 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '<em><b>Simple Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__SIMPLE_TYPE = eINSTANCE.getSimpleType_SimpleType();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.sidl.SimpleTypeEnum <em>Simple Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.sidl.SimpleTypeEnum
		 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getSimpleTypeEnum()
		 * @generated
		 */
		EEnum SIMPLE_TYPE_ENUM = eINSTANCE.getSimpleTypeEnum();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.sidl.ModeEnum <em>Mode Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.sidl.ModeEnum
		 * @see org.earthsystemcurator.cupid.sidl.impl.SIDLPackageImpl#getModeEnum()
		 * @generated
		 */
		EEnum MODE_ENUM = eINSTANCE.getModeEnum();

	}

} //SIDLPackage
