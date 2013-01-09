/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.earthsystemcurator.cupid.esmf.ESMFFactory
 * @model kind="package"
 * @generated
 */
public interface ESMFPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "esmf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.earthsystemcurator.org/cupid/esmf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "esmf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ESMFPackage eINSTANCE = org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFNamedEntityImpl <em>Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFNamedEntityImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFNamedEntity()
	 * @generated
	 */
	int ESMF_NAMED_ENTITY = 92;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_NAMED_ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_NAMED_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFComponent()
	 * @generated
	 */
	int ESMF_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__NAME = ESMF_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__METHOD = ESMF_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Register Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__REGISTER_METHOD = ESMF_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__STATE = ESMF_NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__IMPORT_STATE = ESMF_NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__EXPORT_STATE = ESMF_NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__COMPONENT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__PARENT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Array Spec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__ARRAY_SPEC = ESMF_NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__ARRAY = ESMF_NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Dist Grid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__DIST_GRID = ESMF_NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__FIELD = ESMF_NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__GRID = ESMF_NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Route Handle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__ROUTE_HANDLE = ESMF_NAMED_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__CLOCK = ESMF_NAMED_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Model Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__MODEL_CLOCK = ESMF_NAMED_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__TIME = ESMF_NAMED_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__TIME_INTERVAL = ESMF_NAMED_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>SIDL Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT__SIDL_CLASS = ESMF_NAMED_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COMPONENT_FEATURE_COUNT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFGriddedComponentImpl <em>Gridded Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFGriddedComponentImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFGriddedComponent()
	 * @generated
	 */
	int ESMF_GRIDDED_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__NAME = ESMF_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__METHOD = ESMF_COMPONENT__METHOD;

	/**
	 * The feature id for the '<em><b>Register Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__REGISTER_METHOD = ESMF_COMPONENT__REGISTER_METHOD;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__STATE = ESMF_COMPONENT__STATE;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__IMPORT_STATE = ESMF_COMPONENT__IMPORT_STATE;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__EXPORT_STATE = ESMF_COMPONENT__EXPORT_STATE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__COMPONENT = ESMF_COMPONENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__PARENT = ESMF_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Array Spec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__ARRAY_SPEC = ESMF_COMPONENT__ARRAY_SPEC;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__ARRAY = ESMF_COMPONENT__ARRAY;

	/**
	 * The feature id for the '<em><b>Dist Grid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__DIST_GRID = ESMF_COMPONENT__DIST_GRID;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__FIELD = ESMF_COMPONENT__FIELD;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__GRID = ESMF_COMPONENT__GRID;

	/**
	 * The feature id for the '<em><b>Route Handle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__ROUTE_HANDLE = ESMF_COMPONENT__ROUTE_HANDLE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__CLOCK = ESMF_COMPONENT__CLOCK;

	/**
	 * The feature id for the '<em><b>Model Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__MODEL_CLOCK = ESMF_COMPONENT__MODEL_CLOCK;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__TIME = ESMF_COMPONENT__TIME;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__TIME_INTERVAL = ESMF_COMPONENT__TIME_INTERVAL;

	/**
	 * The feature id for the '<em><b>SIDL Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT__SIDL_CLASS = ESMF_COMPONENT__SIDL_CLASS;

	/**
	 * The number of structural features of the '<em>Gridded Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRIDDED_COMPONENT_FEATURE_COUNT = ESMF_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCouplerComponentImpl <em>Coupler Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCouplerComponentImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCouplerComponent()
	 * @generated
	 */
	int ESMF_COUPLER_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__NAME = ESMF_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__METHOD = ESMF_COMPONENT__METHOD;

	/**
	 * The feature id for the '<em><b>Register Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__REGISTER_METHOD = ESMF_COMPONENT__REGISTER_METHOD;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__STATE = ESMF_COMPONENT__STATE;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__IMPORT_STATE = ESMF_COMPONENT__IMPORT_STATE;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__EXPORT_STATE = ESMF_COMPONENT__EXPORT_STATE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__COMPONENT = ESMF_COMPONENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__PARENT = ESMF_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Array Spec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__ARRAY_SPEC = ESMF_COMPONENT__ARRAY_SPEC;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__ARRAY = ESMF_COMPONENT__ARRAY;

	/**
	 * The feature id for the '<em><b>Dist Grid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__DIST_GRID = ESMF_COMPONENT__DIST_GRID;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__FIELD = ESMF_COMPONENT__FIELD;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__GRID = ESMF_COMPONENT__GRID;

	/**
	 * The feature id for the '<em><b>Route Handle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__ROUTE_HANDLE = ESMF_COMPONENT__ROUTE_HANDLE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__CLOCK = ESMF_COMPONENT__CLOCK;

	/**
	 * The feature id for the '<em><b>Model Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__MODEL_CLOCK = ESMF_COMPONENT__MODEL_CLOCK;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__TIME = ESMF_COMPONENT__TIME;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__TIME_INTERVAL = ESMF_COMPONENT__TIME_INTERVAL;

	/**
	 * The feature id for the '<em><b>SIDL Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT__SIDL_CLASS = ESMF_COMPONENT__SIDL_CLASS;

	/**
	 * The number of structural features of the '<em>Coupler Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_COUPLER_COMPONENT_FEATURE_COUNT = ESMF_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFSimpleCouplerComponentImpl <em>Simple Coupler Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFSimpleCouplerComponentImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFSimpleCouplerComponent()
	 * @generated
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__NAME = ESMF_COUPLER_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__METHOD = ESMF_COUPLER_COMPONENT__METHOD;

	/**
	 * The feature id for the '<em><b>Register Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__REGISTER_METHOD = ESMF_COUPLER_COMPONENT__REGISTER_METHOD;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__STATE = ESMF_COUPLER_COMPONENT__STATE;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__IMPORT_STATE = ESMF_COUPLER_COMPONENT__IMPORT_STATE;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__EXPORT_STATE = ESMF_COUPLER_COMPONENT__EXPORT_STATE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__COMPONENT = ESMF_COUPLER_COMPONENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__PARENT = ESMF_COUPLER_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Array Spec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__ARRAY_SPEC = ESMF_COUPLER_COMPONENT__ARRAY_SPEC;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__ARRAY = ESMF_COUPLER_COMPONENT__ARRAY;

	/**
	 * The feature id for the '<em><b>Dist Grid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__DIST_GRID = ESMF_COUPLER_COMPONENT__DIST_GRID;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__FIELD = ESMF_COUPLER_COMPONENT__FIELD;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__GRID = ESMF_COUPLER_COMPONENT__GRID;

	/**
	 * The feature id for the '<em><b>Route Handle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__ROUTE_HANDLE = ESMF_COUPLER_COMPONENT__ROUTE_HANDLE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__CLOCK = ESMF_COUPLER_COMPONENT__CLOCK;

	/**
	 * The feature id for the '<em><b>Model Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__MODEL_CLOCK = ESMF_COUPLER_COMPONENT__MODEL_CLOCK;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__TIME = ESMF_COUPLER_COMPONENT__TIME;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__TIME_INTERVAL = ESMF_COUPLER_COMPONENT__TIME_INTERVAL;

	/**
	 * The feature id for the '<em><b>SIDL Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__SIDL_CLASS = ESMF_COUPLER_COMPONENT__SIDL_CLASS;

	/**
	 * The feature id for the '<em><b>Field Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT__FIELD_CONNECTION = ESMF_COUPLER_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Coupler Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_SIMPLE_COUPLER_COMPONENT_FEATURE_COUNT = ESMF_COUPLER_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFMethod()
	 * @generated
	 */
	int ESMF_METHOD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_METHOD__NAME = ESMF_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_METHOD__COMPONENT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_METHOD__PHASE = ESMF_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_METHOD__IMPORT_STATE = ESMF_NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_METHOD__EXPORT_STATE = ESMF_NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_METHOD__CLOCK = ESMF_NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_METHOD__ACTION = ESMF_NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>SIDL Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_METHOD__SIDL_METHOD = ESMF_NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_METHOD_FEATURE_COUNT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFInitMethodImpl <em>Init Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFInitMethodImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFInitMethod()
	 * @generated
	 */
	int ESMF_INIT_METHOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_INIT_METHOD__NAME = ESMF_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_INIT_METHOD__COMPONENT = ESMF_METHOD__COMPONENT;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_INIT_METHOD__PHASE = ESMF_METHOD__PHASE;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_INIT_METHOD__IMPORT_STATE = ESMF_METHOD__IMPORT_STATE;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_INIT_METHOD__EXPORT_STATE = ESMF_METHOD__EXPORT_STATE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_INIT_METHOD__CLOCK = ESMF_METHOD__CLOCK;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_INIT_METHOD__ACTION = ESMF_METHOD__ACTION;

	/**
	 * The feature id for the '<em><b>SIDL Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_INIT_METHOD__SIDL_METHOD = ESMF_METHOD__SIDL_METHOD;

	/**
	 * The number of structural features of the '<em>Init Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_INIT_METHOD_FEATURE_COUNT = ESMF_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFPreInitMethodSIDLImpl <em>Pre Init Method SIDL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPreInitMethodSIDLImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFPreInitMethodSIDL()
	 * @generated
	 */
	int ESMF_PRE_INIT_METHOD_SIDL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_PRE_INIT_METHOD_SIDL__NAME = ESMF_INIT_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_PRE_INIT_METHOD_SIDL__COMPONENT = ESMF_INIT_METHOD__COMPONENT;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_PRE_INIT_METHOD_SIDL__PHASE = ESMF_INIT_METHOD__PHASE;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_PRE_INIT_METHOD_SIDL__IMPORT_STATE = ESMF_INIT_METHOD__IMPORT_STATE;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_PRE_INIT_METHOD_SIDL__EXPORT_STATE = ESMF_INIT_METHOD__EXPORT_STATE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_PRE_INIT_METHOD_SIDL__CLOCK = ESMF_INIT_METHOD__CLOCK;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_PRE_INIT_METHOD_SIDL__ACTION = ESMF_INIT_METHOD__ACTION;

	/**
	 * The feature id for the '<em><b>SIDL Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_PRE_INIT_METHOD_SIDL__SIDL_METHOD = ESMF_INIT_METHOD__SIDL_METHOD;

	/**
	 * The number of structural features of the '<em>Pre Init Method SIDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_PRE_INIT_METHOD_SIDL_FEATURE_COUNT = ESMF_INIT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFPostInitMethodSIDLImpl <em>Post Init Method SIDL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPostInitMethodSIDLImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFPostInitMethodSIDL()
	 * @generated
	 */
	int ESMF_POST_INIT_METHOD_SIDL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_POST_INIT_METHOD_SIDL__NAME = ESMF_INIT_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_POST_INIT_METHOD_SIDL__COMPONENT = ESMF_INIT_METHOD__COMPONENT;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_POST_INIT_METHOD_SIDL__PHASE = ESMF_INIT_METHOD__PHASE;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_POST_INIT_METHOD_SIDL__IMPORT_STATE = ESMF_INIT_METHOD__IMPORT_STATE;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_POST_INIT_METHOD_SIDL__EXPORT_STATE = ESMF_INIT_METHOD__EXPORT_STATE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_POST_INIT_METHOD_SIDL__CLOCK = ESMF_INIT_METHOD__CLOCK;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_POST_INIT_METHOD_SIDL__ACTION = ESMF_INIT_METHOD__ACTION;

	/**
	 * The feature id for the '<em><b>SIDL Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_POST_INIT_METHOD_SIDL__SIDL_METHOD = ESMF_INIT_METHOD__SIDL_METHOD;

	/**
	 * The number of structural features of the '<em>Post Init Method SIDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_POST_INIT_METHOD_SIDL_FEATURE_COUNT = ESMF_INIT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFRunMethodImpl <em>Run Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFRunMethodImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFRunMethod()
	 * @generated
	 */
	int ESMF_RUN_METHOD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_RUN_METHOD__NAME = ESMF_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_RUN_METHOD__COMPONENT = ESMF_METHOD__COMPONENT;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_RUN_METHOD__PHASE = ESMF_METHOD__PHASE;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_RUN_METHOD__IMPORT_STATE = ESMF_METHOD__IMPORT_STATE;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_RUN_METHOD__EXPORT_STATE = ESMF_METHOD__EXPORT_STATE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_RUN_METHOD__CLOCK = ESMF_METHOD__CLOCK;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_RUN_METHOD__ACTION = ESMF_METHOD__ACTION;

	/**
	 * The feature id for the '<em><b>SIDL Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_RUN_METHOD__SIDL_METHOD = ESMF_METHOD__SIDL_METHOD;

	/**
	 * The number of structural features of the '<em>Run Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_RUN_METHOD_FEATURE_COUNT = ESMF_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFinalizeMethodImpl <em>Finalize Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFFinalizeMethodImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFFinalizeMethod()
	 * @generated
	 */
	int ESMF_FINALIZE_METHOD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD__NAME = ESMF_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD__COMPONENT = ESMF_METHOD__COMPONENT;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD__PHASE = ESMF_METHOD__PHASE;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD__IMPORT_STATE = ESMF_METHOD__IMPORT_STATE;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD__EXPORT_STATE = ESMF_METHOD__EXPORT_STATE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD__CLOCK = ESMF_METHOD__CLOCK;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD__ACTION = ESMF_METHOD__ACTION;

	/**
	 * The feature id for the '<em><b>SIDL Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD__SIDL_METHOD = ESMF_METHOD__SIDL_METHOD;

	/**
	 * The number of structural features of the '<em>Finalize Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD_FEATURE_COUNT = ESMF_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFinalizeMethodSIDLImpl <em>Finalize Method SIDL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFFinalizeMethodSIDLImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFFinalizeMethodSIDL()
	 * @generated
	 */
	int ESMF_FINALIZE_METHOD_SIDL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD_SIDL__NAME = ESMF_FINALIZE_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD_SIDL__COMPONENT = ESMF_FINALIZE_METHOD__COMPONENT;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD_SIDL__PHASE = ESMF_FINALIZE_METHOD__PHASE;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD_SIDL__IMPORT_STATE = ESMF_FINALIZE_METHOD__IMPORT_STATE;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD_SIDL__EXPORT_STATE = ESMF_FINALIZE_METHOD__EXPORT_STATE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD_SIDL__CLOCK = ESMF_FINALIZE_METHOD__CLOCK;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD_SIDL__ACTION = ESMF_FINALIZE_METHOD__ACTION;

	/**
	 * The feature id for the '<em><b>SIDL Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD_SIDL__SIDL_METHOD = ESMF_FINALIZE_METHOD__SIDL_METHOD;

	/**
	 * The number of structural features of the '<em>Finalize Method SIDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FINALIZE_METHOD_SIDL_FEATURE_COUNT = ESMF_FINALIZE_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFRegisterMethodImpl <em>Register Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFRegisterMethodImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFRegisterMethod()
	 * @generated
	 */
	int ESMF_REGISTER_METHOD = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_REGISTER_METHOD__NAME = ESMF_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_REGISTER_METHOD__COMPONENT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Register Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_REGISTER_METHOD_FEATURE_COUNT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCalendarImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCalendar()
	 * @generated
	 */
	int ESMF_CALENDAR = 12;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALENDAR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFTimeIntervalImpl <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFTimeIntervalImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFTimeInterval()
	 * @generated
	 */
	int ESMF_TIME_INTERVAL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME_INTERVAL__NAME = ESMF_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME_INTERVAL__HOURS = ESMF_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME_INTERVAL__MINUTES = ESMF_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME_INTERVAL__SECONDS = ESMF_NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME_INTERVAL_FEATURE_COUNT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFTimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFTimeImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFTime()
	 * @generated
	 */
	int ESMF_TIME = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME__NAME = ESMF_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME__YEAR = ESMF_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME__MONTH = ESMF_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME__DAY = ESMF_NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME__HOUR = ESMF_NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME__MINUTE = ESMF_NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME__SECOND = ESMF_NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME__CALENDAR = ESMF_NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_TIME_FEATURE_COUNT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFClockImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFClock()
	 * @generated
	 */
	int ESMF_CLOCK = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CLOCK__NAME = ESMF_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CLOCK__START_TIME = ESMF_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stop Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CLOCK__STOP_TIME = ESMF_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CLOCK__TIME_STEP = ESMF_NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CLOCK__COMPONENT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CLOCK_FEATURE_COUNT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.ESMFStateItem <em>State Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStateItem
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFStateItem()
	 * @generated
	 */
	int ESMF_STATE_ITEM = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_STATE_ITEM__NAME = ESMF_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Workspace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_STATE_ITEM__WORKSPACE = ESMF_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_STATE_ITEM_FEATURE_COUNT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFStateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFStateImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFState()
	 * @generated
	 */
	int ESMF_STATE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_STATE__NAME = ESMF_STATE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Workspace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_STATE__WORKSPACE = ESMF_STATE_ITEM__WORKSPACE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_STATE__COMPONENT = ESMF_STATE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_STATE__ITEM = ESMF_STATE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_STATE_FEATURE_COUNT = ESMF_STATE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFFieldImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFField()
	 * @generated
	 */
	int ESMF_FIELD = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FIELD__NAME = ESMF_STATE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Workspace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FIELD__WORKSPACE = ESMF_STATE_ITEM__WORKSPACE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FIELD__COMPONENT = ESMF_STATE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FIELD__GRID = ESMF_STATE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FIELD__ARRAY = ESMF_STATE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stagger Loc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FIELD__STAGGER_LOC = ESMF_STATE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Array Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FIELD__ARRAY_SPEC = ESMF_STATE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>SIDL Argument</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FIELD__SIDL_ARGUMENT = ESMF_STATE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FIELD_FEATURE_COUNT = ESMF_STATE_ITEM_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldConnectionImpl <em>Field Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFFieldConnectionImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFFieldConnection()
	 * @generated
	 */
	int ESMF_FIELD_CONNECTION = 19;

	/**
	 * The feature id for the '<em><b>Src Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FIELD_CONNECTION__SRC_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Dst Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FIELD_CONNECTION__DST_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FIELD_CONNECTION__COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Field Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_FIELD_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFArrayImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFArray()
	 * @generated
	 */
	int ESMF_ARRAY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY__NAME = ESMF_STATE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Workspace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY__WORKSPACE = ESMF_STATE_ITEM__WORKSPACE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY__COMPONENT = ESMF_STATE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Array Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY__ARRAY_SPEC = ESMF_STATE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dist Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY__DIST_GRID = ESMF_STATE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Farray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY__FARRAY = ESMF_STATE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Indexflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY__INDEXFLAG = ESMF_STATE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Halo LWidth</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY__HALO_LWIDTH = ESMF_STATE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Halo UWidth</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY__HALO_UWIDTH = ESMF_STATE_ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY_FEATURE_COUNT = ESMF_STATE_ITEM_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFRouteHandleImpl <em>Route Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFRouteHandleImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFRouteHandle()
	 * @generated
	 */
	int ESMF_ROUTE_HANDLE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ROUTE_HANDLE__NAME = ESMF_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ROUTE_HANDLE__COMPONENT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Route Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ROUTE_HANDLE_FEATURE_COUNT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArraySpecImpl <em>Array Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFArraySpecImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFArraySpec()
	 * @generated
	 */
	int ESMF_ARRAY_SPEC = 22;

	/**
	 * The feature id for the '<em><b>Typekind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY_SPEC__TYPEKIND = 0;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY_SPEC__RANK = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY_SPEC__COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Array Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ARRAY_SPEC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFGridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFGridImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFGrid()
	 * @generated
	 */
	int ESMF_GRID = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRID__NAME = ESMF_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Dist Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRID__DIST_GRID = ESMF_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_GRID_FEATURE_COUNT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ExtentImpl <em>Extent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ExtentImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getExtent()
	 * @generated
	 */
	int EXTENT = 24;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__MAX = 1;

	/**
	 * The number of structural features of the '<em>Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDistGridImpl <em>Dist Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFDistGridImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFDistGrid()
	 * @generated
	 */
	int ESMF_DIST_GRID = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_DIST_GRID__NAME = ESMF_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_DIST_GRID__EXTENT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>De</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_DIST_GRID__DE = ESMF_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>De Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_DIST_GRID__DE_LAYOUT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Regular Decomposition Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_DIST_GRID__REGULAR_DECOMPOSITION_SIZE = ESMF_NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dist Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_DIST_GRID_FEATURE_COUNT = ESMF_NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFWorkspaceImpl <em>Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFWorkspaceImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFWorkspace()
	 * @generated
	 */
	int ESMF_WORKSPACE = 26;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_WORKSPACE__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_WORKSPACE__CALENDAR = 1;

	/**
	 * The feature id for the '<em><b>State Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_WORKSPACE__STATE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Dist Grid</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_WORKSPACE__DIST_GRID = 3;

	/**
	 * The feature id for the '<em><b>Virtual Machine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_WORKSPACE__VIRTUAL_MACHINE = 4;

	/**
	 * The feature id for the '<em><b>Persistent Execution Thread</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_WORKSPACE__PERSISTENT_EXECUTION_THREAD = 5;

	/**
	 * The feature id for the '<em><b>De Layout</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_WORKSPACE__DE_LAYOUT = 6;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_WORKSPACE__GRID = 7;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_WORKSPACE__CLOCK = 8;

	/**
	 * The number of structural features of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_WORKSPACE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFVirtualMachineImpl <em>Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFVirtualMachineImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFVirtualMachine()
	 * @generated
	 */
	int ESMF_VIRTUAL_MACHINE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_VIRTUAL_MACHINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent VM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_VIRTUAL_MACHINE__PARENT_VM = 1;

	/**
	 * The feature id for the '<em><b>Pet ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_VIRTUAL_MACHINE__PET_ID = 2;

	/**
	 * The number of structural features of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_VIRTUAL_MACHINE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFPersistentExecutionThreadImpl <em>Persistent Execution Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPersistentExecutionThreadImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFPersistentExecutionThread()
	 * @generated
	 */
	int ESMF_PERSISTENT_EXECUTION_THREAD = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_PERSISTENT_EXECUTION_THREAD__ID = 0;

	/**
	 * The number of structural features of the '<em>Persistent Execution Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_PERSISTENT_EXECUTION_THREAD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDELayoutImpl <em>DE Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFDELayoutImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFDELayout()
	 * @generated
	 */
	int ESMF_DE_LAYOUT = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_DE_LAYOUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Decomposition Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_DE_LAYOUT__DECOMPOSITION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>De To Pet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_DE_LAYOUT__DE_TO_PET = 2;

	/**
	 * The number of structural features of the '<em>DE Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_DE_LAYOUT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDecompositionElementImpl <em>Decomposition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFDecompositionElementImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFDecompositionElement()
	 * @generated
	 */
	int ESMF_DECOMPOSITION_ELEMENT = 30;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_DECOMPOSITION_ELEMENT__EXTENT = 0;

	/**
	 * The feature id for the '<em><b>Parent Dist Grid</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID = 1;

	/**
	 * The number of structural features of the '<em>Decomposition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_DECOMPOSITION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFVirtualAddressSpaceImpl <em>Virtual Address Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFVirtualAddressSpaceImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFVirtualAddressSpace()
	 * @generated
	 */
	int ESMF_VIRTUAL_ADDRESS_SPACE = 31;

	/**
	 * The number of structural features of the '<em>Virtual Address Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_VIRTUAL_ADDRESS_SPACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFAction()
	 * @generated
	 */
	int ESMF_ACTION = 32;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION__CONTEXT = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionAPIImpl <em>Action API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionAPIImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionAPI()
	 * @generated
	 */
	int ESMF_ACTION_API = 33;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_API__CONTEXT = ESMF_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_API__RC = ESMF_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_API_FEATURE_COUNT = ESMF_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokePatternImpl <em>Action Method Invoke Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokePatternImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionMethodInvokePattern()
	 * @generated
	 */
	int ESMF_ACTION_METHOD_INVOKE_PATTERN = 34;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE_PATTERN__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE_PATTERN__RC = ESMF_ACTION_API__RC;

	/**
	 * The number of structural features of the '<em>Action Method Invoke Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE_PATTERN_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeSequenceImpl <em>Action Method Invoke Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeSequenceImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionMethodInvokeSequence()
	 * @generated
	 */
	int ESMF_ACTION_METHOD_INVOKE_SEQUENCE = 35;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE_SEQUENCE__CONTEXT = ESMF_ACTION_METHOD_INVOKE_PATTERN__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE_SEQUENCE__RC = ESMF_ACTION_METHOD_INVOKE_PATTERN__RC;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE_SEQUENCE__PATTERN = ESMF_ACTION_METHOD_INVOKE_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Method Invoke Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE_SEQUENCE_FEATURE_COUNT = ESMF_ACTION_METHOD_INVOKE_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeIterationImpl <em>Action Method Invoke Iteration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeIterationImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionMethodInvokeIteration()
	 * @generated
	 */
	int ESMF_ACTION_METHOD_INVOKE_ITERATION = 36;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE_ITERATION__CONTEXT = ESMF_ACTION_METHOD_INVOKE_SEQUENCE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE_ITERATION__RC = ESMF_ACTION_METHOD_INVOKE_SEQUENCE__RC;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE_ITERATION__PATTERN = ESMF_ACTION_METHOD_INVOKE_SEQUENCE__PATTERN;

	/**
	 * The number of structural features of the '<em>Action Method Invoke Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE_ITERATION_FEATURE_COUNT = ESMF_ACTION_METHOD_INVOKE_SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateAddImpl <em>Action State Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateAddImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionStateAdd()
	 * @generated
	 */
	int ESMF_ACTION_STATE_ADD = 37;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_ADD__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_ADD__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_ADD__STATE = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_ADD__ITEM_LIST = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action State Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_ADD_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateCreateImpl <em>Action State Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateCreateImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionStateCreate()
	 * @generated
	 */
	int ESMF_ACTION_STATE_CREATE = 38;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_CREATE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_CREATE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_CREATE__STATE = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_CREATE__NAME = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action State Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_CREATE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateGetImpl <em>Action State Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateGetImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionStateGet()
	 * @generated
	 */
	int ESMF_ACTION_STATE_GET = 39;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_GET__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_GET__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_GET__STATE = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_GET__ITEM_NAME = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_GET__ITEM = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action State Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_GET_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateReconcileImpl <em>Action State Reconcile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateReconcileImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionStateReconcile()
	 * @generated
	 */
	int ESMF_ACTION_STATE_RECONCILE = 40;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_RECONCILE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_RECONCILE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_RECONCILE__STATE = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action State Reconcile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_STATE_RECONCILE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateImpl <em>Action Array Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionArrayCreate()
	 * @generated
	 */
	int ESMF_ACTION_ARRAY_CREATE = 41;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_CREATE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_CREATE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_CREATE__ARRAY = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Array Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_CREATE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateAllocateASImpl <em>Action Array Create Allocate AS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateAllocateASImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionArrayCreateAllocateAS()
	 * @generated
	 */
	int ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS = 42;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dist Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__DIST_GRID = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Array Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY_SPEC = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Indexflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__INDEXFLAG = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Total LWidth</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_LWIDTH = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Total UWidth</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_UWIDTH = ESMF_ACTION_API_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Action Array Create Allocate AS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArraySpecSetImpl <em>Action Array Spec Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionArraySpecSetImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionArraySpecSet()
	 * @generated
	 */
	int ESMF_ACTION_ARRAY_SPEC_SET = 43;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_SPEC_SET__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_SPEC_SET__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Array Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_SPEC_SET__ARRAY_SPEC = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Typekind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_SPEC_SET__TYPEKIND = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_SPEC_SET__RANK = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Array Spec Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_ARRAY_SPEC_SET_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockCreateImpl <em>Action Clock Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockCreateImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionClockCreate()
	 * @generated
	 */
	int ESMF_ACTION_CLOCK_CREATE = 44;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_CREATE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_CREATE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_CREATE__CLOCK = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_CREATE__TIME_STEP = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_CREATE__START_TIME = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stop Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_CREATE__STOP_TIME = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Clock Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_CREATE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockGetImpl <em>Action Clock Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockGetImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionClockGet()
	 * @generated
	 */
	int ESMF_ACTION_CLOCK_GET = 45;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_GET__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_GET__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_GET__CLOCK = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_GET__TIME_STEP = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Curr Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_GET__CURR_TIME = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Clock Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_GET_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockGetTimestepImpl <em>Action Clock Get Timestep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockGetTimestepImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionClockGetTimestep()
	 * @generated
	 */
	int ESMF_ACTION_CLOCK_GET_TIMESTEP = 46;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_GET_TIMESTEP__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_GET_TIMESTEP__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_GET_TIMESTEP__CLOCK = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Clock Get Timestep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CLOCK_GET_TIMESTEP_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompCreateImpl <em>Action Cpl Comp Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompCreateImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionCplCompCreate()
	 * @generated
	 */
	int ESMF_ACTION_CPL_COMP_CREATE = 47;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_CREATE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_CREATE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Cplcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_CREATE__CPLCOMP = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_CREATE__NAME = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Cpl Comp Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_CREATE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompInitializeImpl <em>Action Cpl Comp Initialize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompInitializeImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionCplCompInitialize()
	 * @generated
	 */
	int ESMF_ACTION_CPL_COMP_INITIALIZE = 48;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_INITIALIZE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_INITIALIZE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Cplcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_INITIALIZE__CPLCOMP = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_INITIALIZE__IMPORT_STATE = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_INITIALIZE__EXPORT_STATE = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_INITIALIZE__CLOCK = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_INITIALIZE__PHASE = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action Cpl Comp Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_INITIALIZE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompRunImpl <em>Action Cpl Comp Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompRunImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionCplCompRun()
	 * @generated
	 */
	int ESMF_ACTION_CPL_COMP_RUN = 49;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_RUN__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_RUN__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Cplcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_RUN__CPLCOMP = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_RUN__IMPORT_STATE = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_RUN__EXPORT_STATE = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_RUN__CLOCK = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_RUN__PHASE = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action Cpl Comp Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_RUN_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompFinalizeImpl <em>Action Cpl Comp Finalize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompFinalizeImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionCplCompFinalize()
	 * @generated
	 */
	int ESMF_ACTION_CPL_COMP_FINALIZE = 50;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_FINALIZE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_FINALIZE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Cplcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_FINALIZE__CPLCOMP = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_FINALIZE__IMPORT_STATE = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_FINALIZE__EXPORT_STATE = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_FINALIZE__CLOCK = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_FINALIZE__PHASE = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action Cpl Comp Finalize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_FINALIZE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompSetServicesImpl <em>Action Cpl Comp Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompSetServicesImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionCplCompSetServices()
	 * @generated
	 */
	int ESMF_ACTION_CPL_COMP_SET_SERVICES = 51;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_SET_SERVICES__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_SET_SERVICES__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Cplcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_SET_SERVICES__CPLCOMP = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Routine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_ROUTINE = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User RC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_RC = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Cpl Comp Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_CPL_COMP_SET_SERVICES_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionDistGridCreateImpl <em>Action Dist Grid Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionDistGridCreateImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionDistGridCreate()
	 * @generated
	 */
	int ESMF_ACTION_DIST_GRID_CREATE = 52;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_DIST_GRID_CREATE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_DIST_GRID_CREATE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Dist Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_DIST_GRID_CREATE__DIST_GRID = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_DIST_GRID_CREATE__MIN_INDEX = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_DIST_GRID_CREATE__MAX_INDEX = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reg Decomp</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_DIST_GRID_CREATE__REG_DECOMP = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Dist Grid Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_DIST_GRID_CREATE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateImpl <em>Action Field Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldCreate()
	 * @generated
	 */
	int ESMF_ACTION_FIELD_CREATE = 53;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE__FIELD = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Field Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArrayImpl <em>Action Field Create Grid Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArrayImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldCreateGridArray()
	 * @generated
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY = 54;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__FIELD = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__NAME = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__GRID = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__ARRAY = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Field Create Grid Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArraySpecImpl <em>Action Field Create Grid Array Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArraySpecImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldCreateGridArraySpec()
	 * @generated
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC = 55;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__FIELD = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__GRID = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Array Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__ARRAY_SPEC = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Indexflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__INDEXFLAG = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Total LWidth</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_LWIDTH = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Total UWidth</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_UWIDTH = ESMF_ACTION_API_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__NAME = ESMF_ACTION_API_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Action Field Create Grid Array Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateTKRImpl <em>Action Field Create TKR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateTKRImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldCreateTKR()
	 * @generated
	 */
	int ESMF_ACTION_FIELD_CREATE_TKR = 56;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_TKR__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_TKR__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_TKR__FIELD = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_TKR__GRID = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Typekind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_TKR__TYPEKIND = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Field Create TKR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_CREATE_TKR_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetImpl <em>Action Field Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldGet()
	 * @generated
	 */
	int ESMF_ACTION_FIELD_GET = 57;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET__FIELD = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Farray Ptr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET__FARRAY_PTR = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Field Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetBoundsImpl <em>Action Field Get Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetBoundsImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldGetBounds()
	 * @generated
	 */
	int ESMF_ACTION_FIELD_GET_BOUNDS = 58;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET_BOUNDS__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET_BOUNDS__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET_BOUNDS__FIELD = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclusive LBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_LBOUND = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exclusive UBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_UBOUND = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Computational LBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_LBOUND = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Computational UBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_UBOUND = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Total LBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_LBOUND = ESMF_ACTION_API_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Total UBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_UBOUND = ESMF_ACTION_API_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Action Field Get Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_GET_BOUNDS_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloStoreImpl <em>Action Field Halo Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloStoreImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldHaloStore()
	 * @generated
	 */
	int ESMF_ACTION_FIELD_HALO_STORE = 59;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO_STORE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO_STORE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO_STORE__FIELD = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Route Handle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO_STORE__ROUTE_HANDLE = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Field Halo Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO_STORE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloImpl <em>Action Field Halo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldHalo()
	 * @generated
	 */
	int ESMF_ACTION_FIELD_HALO = 60;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO__FIELD = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Route Handle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO__ROUTE_HANDLE = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Field Halo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloReleaseImpl <em>Action Field Halo Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloReleaseImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldHaloRelease()
	 * @generated
	 */
	int ESMF_ACTION_FIELD_HALO_RELEASE = 61;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO_RELEASE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO_RELEASE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Route Handle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO_RELEASE__ROUTE_HANDLE = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Field Halo Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_HALO_RELEASE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistStoreImpl <em>Action Field Redist Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistStoreImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldRedistStore()
	 * @generated
	 */
	int ESMF_ACTION_FIELD_REDIST_STORE = 62;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST_STORE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST_STORE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Src Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST_STORE__SRC_FIELD = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dst Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST_STORE__DST_FIELD = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Route Handle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST_STORE__ROUTE_HANDLE = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Field Redist Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST_STORE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistImpl <em>Action Field Redist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldRedist()
	 * @generated
	 */
	int ESMF_ACTION_FIELD_REDIST = 63;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Src Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST__SRC_FIELD = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dst Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST__DST_FIELD = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Route Handle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST__ROUTE_HANDLE = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Field Redist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistReleaseImpl <em>Action Field Redist Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistReleaseImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldRedistRelease()
	 * @generated
	 */
	int ESMF_ACTION_FIELD_REDIST_RELEASE = 64;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST_RELEASE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST_RELEASE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Route Handle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST_RELEASE__ROUTE_HANDLE = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Field Redist Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FIELD_REDIST_RELEASE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFrameworkInitImpl <em>Action Framework Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFrameworkInitImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFrameworkInit()
	 * @generated
	 */
	int ESMF_ACTION_FRAMEWORK_INIT = 65;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FRAMEWORK_INIT__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FRAMEWORK_INIT__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Default Cal Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FRAMEWORK_INIT__DEFAULT_CAL_KIND = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Framework Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FRAMEWORK_INIT_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFrameworkFinalizeImpl <em>Action Framework Finalize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFrameworkFinalizeImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFrameworkFinalize()
	 * @generated
	 */
	int ESMF_ACTION_FRAMEWORK_FINALIZE = 66;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FRAMEWORK_FINALIZE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FRAMEWORK_FINALIZE__RC = ESMF_ACTION_API__RC;

	/**
	 * The number of structural features of the '<em>Action Framework Finalize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_FRAMEWORK_FINALIZE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCreateImpl <em>Action Grid Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCreateImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridCreate()
	 * @generated
	 */
	int ESMF_ACTION_GRID_CREATE = 67;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_CREATE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_CREATE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_CREATE__GRID = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dist Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_CREATE__DIST_GRID = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_CREATE__NAME = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Indexflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_CREATE__INDEXFLAG = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Grid Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_CREATE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetImpl <em>Action Grid Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridGet()
	 * @generated
	 */
	int ESMF_ACTION_GRID_GET = 68;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET__GRID = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Grid Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDeImpl <em>Action Grid Get PLocal De</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDeImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridGetPLocalDe()
	 * @generated
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE = 69;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE__CONTEXT = ESMF_ACTION_GRID_GET__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE__RC = ESMF_ACTION_GRID_GET__RC;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE__GRID = ESMF_ACTION_GRID_GET__GRID;

	/**
	 * The feature id for the '<em><b>Local DE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE__LOCAL_DE = ESMF_ACTION_GRID_GET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is LBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_LBOUND = ESMF_ACTION_GRID_GET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is UBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_UBOUND = ESMF_ACTION_GRID_GET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Grid Get PLocal De</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_FEATURE_COUNT = ESMF_ACTION_GRID_GET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDePSlocImpl <em>Action Grid Get PLocal De PSloc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDePSlocImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridGetPLocalDePSloc()
	 * @generated
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC = 70;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__CONTEXT = ESMF_ACTION_GRID_GET_PLOCAL_DE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__RC = ESMF_ACTION_GRID_GET_PLOCAL_DE__RC;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__GRID = ESMF_ACTION_GRID_GET_PLOCAL_DE__GRID;

	/**
	 * The feature id for the '<em><b>Local DE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__LOCAL_DE = ESMF_ACTION_GRID_GET_PLOCAL_DE__LOCAL_DE;

	/**
	 * The feature id for the '<em><b>Is LBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__IS_LBOUND = ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_LBOUND;

	/**
	 * The feature id for the '<em><b>Is UBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__IS_UBOUND = ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_UBOUND;

	/**
	 * The feature id for the '<em><b>Staggerloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__STAGGERLOC = ESMF_ACTION_GRID_GET_PLOCAL_DE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclusive LBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_LBOUND = ESMF_ACTION_GRID_GET_PLOCAL_DE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exclusive UBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_UBOUND = ESMF_ACTION_GRID_GET_PLOCAL_DE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Computational LBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_LBOUND = ESMF_ACTION_GRID_GET_PLOCAL_DE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Computational UBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_UBOUND = ESMF_ACTION_GRID_GET_PLOCAL_DE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action Grid Get PLocal De PSloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC_FEATURE_COUNT = ESMF_ACTION_GRID_GET_PLOCAL_DE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetCoordImpl <em>Action Grid Get Coord</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetCoordImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridGetCoord()
	 * @generated
	 */
	int ESMF_ACTION_GRID_GET_COORD = 71;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_COORD__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_COORD__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_COORD__GRID = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coord Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_COORD__COORD_DIM = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Farray Ptr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_COORD__FARRAY_PTR = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Grid Get Coord</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_GET_COORD_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompCreateImpl <em>Action Grid Comp Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompCreateImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridCompCreate()
	 * @generated
	 */
	int ESMF_ACTION_GRID_COMP_CREATE = 72;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_CREATE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_CREATE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Gridcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_CREATE__GRIDCOMP = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_CREATE__NAME = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Grid Comp Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_CREATE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompInitializeImpl <em>Action Grid Comp Initialize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompInitializeImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridCompInitialize()
	 * @generated
	 */
	int ESMF_ACTION_GRID_COMP_INITIALIZE = 73;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_INITIALIZE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_INITIALIZE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Gridcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_INITIALIZE__GRIDCOMP = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_INITIALIZE__IMPORT_STATE = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_INITIALIZE__EXPORT_STATE = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_INITIALIZE__CLOCK = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_INITIALIZE__PHASE = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action Grid Comp Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_INITIALIZE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompRunImpl <em>Action Grid Comp Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompRunImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridCompRun()
	 * @generated
	 */
	int ESMF_ACTION_GRID_COMP_RUN = 74;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_RUN__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_RUN__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Gridcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_RUN__GRIDCOMP = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_RUN__IMPORT_STATE = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_RUN__EXPORT_STATE = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_RUN__CLOCK = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_RUN__PHASE = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action Grid Comp Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_RUN_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompFinalizeImpl <em>Action Grid Comp Finalize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompFinalizeImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridCompFinalize()
	 * @generated
	 */
	int ESMF_ACTION_GRID_COMP_FINALIZE = 75;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_FINALIZE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_FINALIZE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Gridcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_FINALIZE__GRIDCOMP = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_FINALIZE__IMPORT_STATE = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_FINALIZE__EXPORT_STATE = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_FINALIZE__CLOCK = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_FINALIZE__PHASE = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action Grid Comp Finalize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_FINALIZE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompSetServicesImpl <em>Action Grid Comp Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompSetServicesImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridCompSetServices()
	 * @generated
	 */
	int ESMF_ACTION_GRID_COMP_SET_SERVICES = 76;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_SET_SERVICES__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_SET_SERVICES__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Gridcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_SET_SERVICES__GRIDCOMP = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Routine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_SET_SERVICES__USER_ROUTINE = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User RC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_SET_SERVICES__USER_RC = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Grid Comp Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_GRID_COMP_SET_SERVICES_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeImpl <em>Action Method Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionMethodInvoke()
	 * @generated
	 */
	int ESMF_ACTION_METHOD_INVOKE = 77;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE__CONTEXT = ESMF_ACTION_METHOD_INVOKE_PATTERN__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE__RC = ESMF_ACTION_METHOD_INVOKE_PATTERN__RC;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE__METHOD = ESMF_ACTION_METHOD_INVOKE_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE__IMPORT_STATE = ESMF_ACTION_METHOD_INVOKE_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Export State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE__EXPORT_STATE = ESMF_ACTION_METHOD_INVOKE_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Method Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_METHOD_INVOKE_FEATURE_COUNT = ESMF_ACTION_METHOD_INVOKE_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeSetImpl <em>Action Time Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeSetImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionTimeSet()
	 * @generated
	 */
	int ESMF_ACTION_TIME_SET = 78;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_SET__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_SET__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_SET__TIME = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Yy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_SET__YY = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_SET__MM = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_SET__DD = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_SET__H = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_SET__M = ESMF_ACTION_API_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_SET__S = ESMF_ACTION_API_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Action Time Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_SET_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeGetImpl <em>Action Time Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeGetImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionTimeGet()
	 * @generated
	 */
	int ESMF_ACTION_TIME_GET = 79;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_GET__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_GET__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_GET__TIME = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Yy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_GET__YY = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_GET__MM = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_GET__DD = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_GET__H = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_GET__M = ESMF_ACTION_API_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_GET__S = ESMF_ACTION_API_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Action Time Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_GET_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeIntervalSetImpl <em>Action Time Interval Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeIntervalSetImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionTimeIntervalSet()
	 * @generated
	 */
	int ESMF_ACTION_TIME_INTERVAL_SET = 80;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_SET__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_SET__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_SET__TIME_INTERVAL = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_SET__H = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_SET__M = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_SET__S = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Time Interval Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_SET_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeIntervalGetImpl <em>Action Time Interval Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeIntervalGetImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionTimeIntervalGet()
	 * @generated
	 */
	int ESMF_ACTION_TIME_INTERVAL_GET = 81;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_GET__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_GET__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_GET__TIME_INTERVAL = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_GET__H = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_GET__M = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_GET__S = ESMF_ACTION_API_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Time Interval Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_TIME_INTERVAL_GET_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionUserServiceInvokeImpl <em>Action User Service Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionUserServiceInvokeImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionUserServiceInvoke()
	 * @generated
	 */
	int ESMF_ACTION_USER_SERVICE_INVOKE = 82;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_USER_SERVICE_INVOKE__CONTEXT = ESMF_ACTION_API__CONTEXT;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_USER_SERVICE_INVOKE__RC = ESMF_ACTION_API__RC;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_USER_SERVICE_INVOKE__DECLARATION = ESMF_ACTION_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_USER_SERVICE_INVOKE__EXECUTION = ESMF_ACTION_API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action User Service Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_ACTION_USER_SERVICE_INVOKE_FEATURE_COUNT = ESMF_ACTION_API_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCall()
	 * @generated
	 */
	int ESMF_CALL = 83;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL__CONTEXT = ESMF_ACTION__CONTEXT;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_FEATURE_COUNT = ESMF_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallGridCompCreateImpl <em>Call Grid Comp Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallGridCompCreateImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallGridCompCreate()
	 * @generated
	 */
	int ESMF_CALL_GRID_COMP_CREATE = 84;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_GRID_COMP_CREATE__CONTEXT = ESMF_CALL__CONTEXT;

	/**
	 * The feature id for the '<em><b>Gridcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_GRID_COMP_CREATE__GRIDCOMP = ESMF_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Grid Comp Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_GRID_COMP_CREATE_FEATURE_COUNT = ESMF_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallGridCompInitializeImpl <em>Call Grid Comp Initialize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallGridCompInitializeImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallGridCompInitialize()
	 * @generated
	 */
	int ESMF_CALL_GRID_COMP_INITIALIZE = 85;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_GRID_COMP_INITIALIZE__CONTEXT = ESMF_CALL__CONTEXT;

	/**
	 * The feature id for the '<em><b>Gridcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_GRID_COMP_INITIALIZE__GRIDCOMP = ESMF_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Grid Comp Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_GRID_COMP_INITIALIZE_FEATURE_COUNT = ESMF_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallGridCompSetServicesImpl <em>Call Grid Comp Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallGridCompSetServicesImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallGridCompSetServices()
	 * @generated
	 */
	int ESMF_CALL_GRID_COMP_SET_SERVICES = 86;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_GRID_COMP_SET_SERVICES__CONTEXT = ESMF_CALL__CONTEXT;

	/**
	 * The feature id for the '<em><b>Gridcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_GRID_COMP_SET_SERVICES__GRIDCOMP = ESMF_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Grid Comp Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_GRID_COMP_SET_SERVICES_FEATURE_COUNT = ESMF_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallCplCompCreateImpl <em>Call Cpl Comp Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallCplCompCreateImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallCplCompCreate()
	 * @generated
	 */
	int ESMF_CALL_CPL_COMP_CREATE = 87;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_CPL_COMP_CREATE__CONTEXT = ESMF_CALL__CONTEXT;

	/**
	 * The feature id for the '<em><b>Cplcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_CPL_COMP_CREATE__CPLCOMP = ESMF_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Cpl Comp Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_CPL_COMP_CREATE_FEATURE_COUNT = ESMF_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallCplCompInitializeImpl <em>Call Cpl Comp Initialize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallCplCompInitializeImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallCplCompInitialize()
	 * @generated
	 */
	int ESMF_CALL_CPL_COMP_INITIALIZE = 88;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_CPL_COMP_INITIALIZE__CONTEXT = ESMF_CALL__CONTEXT;

	/**
	 * The feature id for the '<em><b>Cplcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_CPL_COMP_INITIALIZE__CPLCOMP = ESMF_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Cpl Comp Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_CPL_COMP_INITIALIZE_FEATURE_COUNT = ESMF_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallCplCompSetServicesImpl <em>Call Cpl Comp Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallCplCompSetServicesImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallCplCompSetServices()
	 * @generated
	 */
	int ESMF_CALL_CPL_COMP_SET_SERVICES = 89;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_CPL_COMP_SET_SERVICES__CONTEXT = ESMF_CALL__CONTEXT;

	/**
	 * The feature id for the '<em><b>Cplcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_CPL_COMP_SET_SERVICES__CPLCOMP = ESMF_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Cpl Comp Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_CPL_COMP_SET_SERVICES_FEATURE_COUNT = ESMF_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallFieldCreateSIDLImpl <em>Call Field Create SIDL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallFieldCreateSIDLImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallFieldCreateSIDL()
	 * @generated
	 */
	int ESMF_CALL_FIELD_CREATE_SIDL = 90;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_FIELD_CREATE_SIDL__CONTEXT = ESMF_CALL__CONTEXT;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_FIELD_CREATE_SIDL__ARGUMENT = ESMF_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Field Create SIDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_FIELD_CREATE_SIDL_FEATURE_COUNT = ESMF_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallSIDLMethodImpl <em>Call SIDL Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallSIDLMethodImpl
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallSIDLMethod()
	 * @generated
	 */
	int ESMF_CALL_SIDL_METHOD = 91;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_SIDL_METHOD__CONTEXT = ESMF_CALL__CONTEXT;

	/**
	 * The feature id for the '<em><b>SIDL Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_SIDL_METHOD__SIDL_METHOD = ESMF_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call SIDL Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESMF_CALL_SIDL_METHOD_FEATURE_COUNT = ESMF_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.ESMFCalKind <em>Cal Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCalKind
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCalKind()
	 * @generated
	 */
	int ESMF_CAL_KIND = 93;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc <em>Stagger Loc</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFStaggerLoc()
	 * @generated
	 */
	int ESMF_STAGGER_LOC = 94;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.ESMFTypeKind <em>Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTypeKind
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFTypeKind()
	 * @generated
	 */
	int ESMF_TYPE_KIND = 95;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.esmf.ESMF_INDEX <em>ESMF INDEX</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.ESMF_INDEX
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMF_INDEX()
	 * @generated
	 */
	int ESMF_INDEX = 96;

	/**
	 * The meta object id for the '<em>EInt Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getEIntArray()
	 * @generated
	 */
	int EINT_ARRAY = 97;

	/**
	 * The meta object id for the '<em>User Token</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFUserToken()
	 * @generated
	 */
	int ESMF_USER_TOKEN = 98;


	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent
	 * @generated
	 */
	EClass getESMFComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getMethod()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_Method();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getRegisterMethod <em>Register Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Register Method</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getRegisterMethod()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_RegisterMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getState()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_State();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getImportState <em>Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getImportState()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_ImportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getExportState <em>Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getExportState()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_ExportState();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getComponent()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_Component();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getParent()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getArraySpec <em>Array Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Spec</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getArraySpec()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_ArraySpec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getArray()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_Array();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getDistGrid <em>Dist Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dist Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getDistGrid()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_DistGrid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getField()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getGrid()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_Grid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getRouteHandle <em>Route Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route Handle</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getRouteHandle()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_RouteHandle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getClock()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_Clock();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getModelClock <em>Model Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getModelClock()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_ModelClock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getTime()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_Time();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Interval</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getTimeInterval()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_TimeInterval();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getSIDLClass <em>SIDL Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SIDL Class</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getSIDLClass()
	 * @see #getESMFComponent()
	 * @generated
	 */
	EReference getESMFComponent_SIDLClass();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFGriddedComponent <em>Gridded Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gridded Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFGriddedComponent
	 * @generated
	 */
	EClass getESMFGriddedComponent();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFCouplerComponent <em>Coupler Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupler Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCouplerComponent
	 * @generated
	 */
	EClass getESMFCouplerComponent();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFSimpleCouplerComponent <em>Simple Coupler Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Coupler Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFSimpleCouplerComponent
	 * @generated
	 */
	EClass getESMFSimpleCouplerComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFSimpleCouplerComponent#getFieldConnection <em>Field Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Connection</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFSimpleCouplerComponent#getFieldConnection()
	 * @see #getESMFSimpleCouplerComponent()
	 * @generated
	 */
	EReference getESMFSimpleCouplerComponent_FieldConnection();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFMethod
	 * @generated
	 */
	EClass getESMFMethod();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFMethod#getComponent()
	 * @see #getESMFMethod()
	 * @generated
	 */
	EReference getESMFMethod_Component();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFMethod#getPhase()
	 * @see #getESMFMethod()
	 * @generated
	 */
	EAttribute getESMFMethod_Phase();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getImportState <em>Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFMethod#getImportState()
	 * @see #getESMFMethod()
	 * @generated
	 */
	EReference getESMFMethod_ImportState();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getExportState <em>Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Export State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFMethod#getExportState()
	 * @see #getESMFMethod()
	 * @generated
	 */
	EReference getESMFMethod_ExportState();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFMethod#getClock()
	 * @see #getESMFMethod()
	 * @generated
	 */
	EReference getESMFMethod_Clock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFMethod#getAction()
	 * @see #getESMFMethod()
	 * @generated
	 */
	EReference getESMFMethod_Action();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getSIDLMethod <em>SIDL Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SIDL Method</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFMethod#getSIDLMethod()
	 * @see #getESMFMethod()
	 * @generated
	 */
	EReference getESMFMethod_SIDLMethod();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFInitMethod <em>Init Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Method</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFInitMethod
	 * @generated
	 */
	EClass getESMFInitMethod();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFPreInitMethodSIDL <em>Pre Init Method SIDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Init Method SIDL</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPreInitMethodSIDL
	 * @generated
	 */
	EClass getESMFPreInitMethodSIDL();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFPostInitMethodSIDL <em>Post Init Method SIDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Init Method SIDL</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPostInitMethodSIDL
	 * @generated
	 */
	EClass getESMFPostInitMethodSIDL();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFRunMethod <em>Run Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Method</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFRunMethod
	 * @generated
	 */
	EClass getESMFRunMethod();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFFinalizeMethod <em>Finalize Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finalize Method</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFFinalizeMethod
	 * @generated
	 */
	EClass getESMFFinalizeMethod();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFFinalizeMethodSIDL <em>Finalize Method SIDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finalize Method SIDL</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFFinalizeMethodSIDL
	 * @generated
	 */
	EClass getESMFFinalizeMethodSIDL();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFRegisterMethod <em>Register Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register Method</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFRegisterMethod
	 * @generated
	 */
	EClass getESMFRegisterMethod();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.esmf.ESMFRegisterMethod#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFRegisterMethod#getComponent()
	 * @see #getESMFRegisterMethod()
	 * @generated
	 */
	EReference getESMFRegisterMethod_Component();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCalendar
	 * @generated
	 */
	EClass getESMFCalendar();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTimeInterval
	 * @generated
	 */
	EClass getESMFTimeInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFTimeInterval#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTimeInterval#getHours()
	 * @see #getESMFTimeInterval()
	 * @generated
	 */
	EAttribute getESMFTimeInterval_Hours();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFTimeInterval#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTimeInterval#getMinutes()
	 * @see #getESMFTimeInterval()
	 * @generated
	 */
	EAttribute getESMFTimeInterval_Minutes();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFTimeInterval#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTimeInterval#getSeconds()
	 * @see #getESMFTimeInterval()
	 * @generated
	 */
	EAttribute getESMFTimeInterval_Seconds();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTime
	 * @generated
	 */
	EClass getESMFTime();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFTime#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTime#getYear()
	 * @see #getESMFTime()
	 * @generated
	 */
	EAttribute getESMFTime_Year();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFTime#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTime#getMonth()
	 * @see #getESMFTime()
	 * @generated
	 */
	EAttribute getESMFTime_Month();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFTime#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTime#getDay()
	 * @see #getESMFTime()
	 * @generated
	 */
	EAttribute getESMFTime_Day();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFTime#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTime#getHour()
	 * @see #getESMFTime()
	 * @generated
	 */
	EAttribute getESMFTime_Hour();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFTime#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTime#getMinute()
	 * @see #getESMFTime()
	 * @generated
	 */
	EAttribute getESMFTime_Minute();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFTime#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTime#getSecond()
	 * @see #getESMFTime()
	 * @generated
	 */
	EAttribute getESMFTime_Second();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFTime#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calendar</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTime#getCalendar()
	 * @see #getESMFTime()
	 * @generated
	 */
	EReference getESMFTime_Calendar();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFClock
	 * @generated
	 */
	EClass getESMFClock();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.esmf.ESMFClock#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Time</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFClock#getStartTime()
	 * @see #getESMFClock()
	 * @generated
	 */
	EReference getESMFClock_StartTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.esmf.ESMFClock#getStopTime <em>Stop Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Time</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFClock#getStopTime()
	 * @see #getESMFClock()
	 * @generated
	 */
	EReference getESMFClock_StopTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.esmf.ESMFClock#getTimeStep <em>Time Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Step</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFClock#getTimeStep()
	 * @see #getESMFClock()
	 * @generated
	 */
	EReference getESMFClock_TimeStep();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.esmf.ESMFClock#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFClock#getComponent()
	 * @see #getESMFClock()
	 * @generated
	 */
	EReference getESMFClock_Component();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFState
	 * @generated
	 */
	EClass getESMFState();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.esmf.ESMFState#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFState#getComponent()
	 * @see #getESMFState()
	 * @generated
	 */
	EReference getESMFState_Component();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFState#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFState#getItem()
	 * @see #getESMFState()
	 * @generated
	 */
	EReference getESMFState_Item();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFStateItem <em>State Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Item</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStateItem
	 * @generated
	 */
	EClass getESMFStateItem();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFStateItem#getWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workspace</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStateItem#getWorkspace()
	 * @see #getESMFStateItem()
	 * @generated
	 */
	EReference getESMFStateItem_Workspace();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFField
	 * @generated
	 */
	EClass getESMFField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.esmf.ESMFField#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFField#getComponent()
	 * @see #getESMFField()
	 * @generated
	 */
	EReference getESMFField_Component();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFField#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFField#getGrid()
	 * @see #getESMFField()
	 * @generated
	 */
	EReference getESMFField_Grid();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFField#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFField#getArray()
	 * @see #getESMFField()
	 * @generated
	 */
	EReference getESMFField_Array();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFField#getStaggerLoc <em>Stagger Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stagger Loc</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFField#getStaggerLoc()
	 * @see #getESMFField()
	 * @generated
	 */
	EAttribute getESMFField_StaggerLoc();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFField#getArraySpec <em>Array Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array Spec</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFField#getArraySpec()
	 * @see #getESMFField()
	 * @generated
	 */
	EReference getESMFField_ArraySpec();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFField#getSIDLArgument <em>SIDL Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>SIDL Argument</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFField#getSIDLArgument()
	 * @see #getESMFField()
	 * @generated
	 */
	EReference getESMFField_SIDLArgument();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFFieldConnection <em>Field Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Connection</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFFieldConnection
	 * @generated
	 */
	EClass getESMFFieldConnection();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getSrcField <em>Src Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getSrcField()
	 * @see #getESMFFieldConnection()
	 * @generated
	 */
	EReference getESMFFieldConnection_SrcField();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getDstField <em>Dst Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dst Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getDstField()
	 * @see #getESMFFieldConnection()
	 * @generated
	 */
	EReference getESMFFieldConnection_DstField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getComponent()
	 * @see #getESMFFieldConnection()
	 * @generated
	 */
	EReference getESMFFieldConnection_Component();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArray
	 * @generated
	 */
	EClass getESMFArray();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArray#getComponent()
	 * @see #getESMFArray()
	 * @generated
	 */
	EReference getESMFArray_Component();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getArraySpec <em>Array Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array Spec</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArray#getArraySpec()
	 * @see #getESMFArray()
	 * @generated
	 */
	EReference getESMFArray_ArraySpec();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getDistGrid <em>Dist Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dist Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArray#getDistGrid()
	 * @see #getESMFArray()
	 * @generated
	 */
	EReference getESMFArray_DistGrid();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getFarray <em>Farray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farray</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArray#getFarray()
	 * @see #getESMFArray()
	 * @generated
	 */
	EAttribute getESMFArray_Farray();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getIndexflag <em>Indexflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indexflag</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArray#getIndexflag()
	 * @see #getESMFArray()
	 * @generated
	 */
	EAttribute getESMFArray_Indexflag();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getHaloLWidth <em>Halo LWidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Halo LWidth</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArray#getHaloLWidth()
	 * @see #getESMFArray()
	 * @generated
	 */
	EAttribute getESMFArray_HaloLWidth();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getHaloUWidth <em>Halo UWidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Halo UWidth</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArray#getHaloUWidth()
	 * @see #getESMFArray()
	 * @generated
	 */
	EAttribute getESMFArray_HaloUWidth();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFRouteHandle <em>Route Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Handle</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFRouteHandle
	 * @generated
	 */
	EClass getESMFRouteHandle();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.esmf.ESMFRouteHandle#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFRouteHandle#getComponent()
	 * @see #getESMFRouteHandle()
	 * @generated
	 */
	EReference getESMFRouteHandle_Component();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFArraySpec <em>Array Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Spec</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArraySpec
	 * @generated
	 */
	EClass getESMFArraySpec();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getTypekind <em>Typekind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typekind</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getTypekind()
	 * @see #getESMFArraySpec()
	 * @generated
	 */
	EAttribute getESMFArraySpec_Typekind();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getRank()
	 * @see #getESMFArraySpec()
	 * @generated
	 */
	EAttribute getESMFArraySpec_Rank();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getComponent()
	 * @see #getESMFArraySpec()
	 * @generated
	 */
	EReference getESMFArraySpec_Component();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFGrid
	 * @generated
	 */
	EClass getESMFGrid();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFGrid#getDistGrid <em>Dist Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dist Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFGrid#getDistGrid()
	 * @see #getESMFGrid()
	 * @generated
	 */
	EReference getESMFGrid_DistGrid();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.Extent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extent</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.Extent
	 * @generated
	 */
	EClass getExtent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.Extent#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.Extent#getMin()
	 * @see #getExtent()
	 * @generated
	 */
	EAttribute getExtent_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.Extent#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.Extent#getMax()
	 * @see #getExtent()
	 * @generated
	 */
	EAttribute getExtent_Max();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid <em>Dist Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dist Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDistGrid
	 * @generated
	 */
	EClass getESMFDistGrid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extent</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getExtent()
	 * @see #getESMFDistGrid()
	 * @generated
	 */
	EReference getESMFDistGrid_Extent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getDe <em>De</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>De</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getDe()
	 * @see #getESMFDistGrid()
	 * @generated
	 */
	EReference getESMFDistGrid_De();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getDeLayout <em>De Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>De Layout</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getDeLayout()
	 * @see #getESMFDistGrid()
	 * @generated
	 */
	EReference getESMFDistGrid_DeLayout();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getRegularDecompositionSize <em>Regular Decomposition Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Regular Decomposition Size</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getRegularDecompositionSize()
	 * @see #getESMFDistGrid()
	 * @generated
	 */
	EAttribute getESMFDistGrid_RegularDecompositionSize();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFWorkspace
	 * @generated
	 */
	EClass getESMFWorkspace();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getComponent()
	 * @see #getESMFWorkspace()
	 * @generated
	 */
	EReference getESMFWorkspace_Component();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calendar</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getCalendar()
	 * @see #getESMFWorkspace()
	 * @generated
	 */
	EReference getESMFWorkspace_Calendar();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getStateItem <em>State Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Item</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getStateItem()
	 * @see #getESMFWorkspace()
	 * @generated
	 */
	EReference getESMFWorkspace_StateItem();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getDistGrid <em>Dist Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dist Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getDistGrid()
	 * @see #getESMFWorkspace()
	 * @generated
	 */
	EReference getESMFWorkspace_DistGrid();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getVirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Virtual Machine</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getVirtualMachine()
	 * @see #getESMFWorkspace()
	 * @generated
	 */
	EReference getESMFWorkspace_VirtualMachine();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getPersistentExecutionThread <em>Persistent Execution Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Persistent Execution Thread</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getPersistentExecutionThread()
	 * @see #getESMFWorkspace()
	 * @generated
	 */
	EReference getESMFWorkspace_PersistentExecutionThread();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getDeLayout <em>De Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>De Layout</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getDeLayout()
	 * @see #getESMFWorkspace()
	 * @generated
	 */
	EReference getESMFWorkspace_DeLayout();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getGrid()
	 * @see #getESMFWorkspace()
	 * @generated
	 */
	EReference getESMFWorkspace_Grid();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getClock()
	 * @see #getESMFWorkspace()
	 * @generated
	 */
	EReference getESMFWorkspace_Clock();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine
	 * @generated
	 */
	EClass getESMFVirtualMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine#getName()
	 * @see #getESMFVirtualMachine()
	 * @generated
	 */
	EAttribute getESMFVirtualMachine_Name();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine#getParentVM <em>Parent VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent VM</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine#getParentVM()
	 * @see #getESMFVirtualMachine()
	 * @generated
	 */
	EReference getESMFVirtualMachine_ParentVM();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine#getPetID <em>Pet ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pet ID</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine#getPetID()
	 * @see #getESMFVirtualMachine()
	 * @generated
	 */
	EAttribute getESMFVirtualMachine_PetID();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFPersistentExecutionThread <em>Persistent Execution Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistent Execution Thread</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPersistentExecutionThread
	 * @generated
	 */
	EClass getESMFPersistentExecutionThread();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFPersistentExecutionThread#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPersistentExecutionThread#getId()
	 * @see #getESMFPersistentExecutionThread()
	 * @generated
	 */
	EAttribute getESMFPersistentExecutionThread_Id();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFDELayout <em>DE Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DE Layout</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDELayout
	 * @generated
	 */
	EClass getESMFDELayout();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFDELayout#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDELayout#getName()
	 * @see #getESMFDELayout()
	 * @generated
	 */
	EAttribute getESMFDELayout_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFDELayout#getDecompositionElement <em>Decomposition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decomposition Element</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDELayout#getDecompositionElement()
	 * @see #getESMFDELayout()
	 * @generated
	 */
	EReference getESMFDELayout_DecompositionElement();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFDELayout#getDeToPet <em>De To Pet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>De To Pet</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDELayout#getDeToPet()
	 * @see #getESMFDELayout()
	 * @generated
	 */
	EAttribute getESMFDELayout_DeToPet();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement <em>Decomposition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition Element</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement
	 * @generated
	 */
	EClass getESMFDecompositionElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extent</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement#getExtent()
	 * @see #getESMFDecompositionElement()
	 * @generated
	 */
	EReference getESMFDecompositionElement_Extent();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement#getParentDistGrid <em>Parent Dist Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Dist Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement#getParentDistGrid()
	 * @see #getESMFDecompositionElement()
	 * @generated
	 */
	EReference getESMFDecompositionElement_ParentDistGrid();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFVirtualAddressSpace <em>Virtual Address Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Address Space</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFVirtualAddressSpace
	 * @generated
	 */
	EClass getESMFVirtualAddressSpace();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFAction
	 * @generated
	 */
	EClass getESMFAction();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.esmf.ESMFAction#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFAction#getContext()
	 * @see #getESMFAction()
	 * @generated
	 */
	EReference getESMFAction_Context();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionAPI <em>Action API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action API</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionAPI
	 * @generated
	 */
	EClass getESMFActionAPI();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionAPI#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionAPI#getRc()
	 * @see #getESMFActionAPI()
	 * @generated
	 */
	EAttribute getESMFActionAPI_Rc();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokePattern <em>Action Method Invoke Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Method Invoke Pattern</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokePattern
	 * @generated
	 */
	EClass getESMFActionMethodInvokePattern();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokeSequence <em>Action Method Invoke Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Method Invoke Sequence</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokeSequence
	 * @generated
	 */
	EClass getESMFActionMethodInvokeSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokeSequence#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokeSequence#getPattern()
	 * @see #getESMFActionMethodInvokeSequence()
	 * @generated
	 */
	EReference getESMFActionMethodInvokeSequence_Pattern();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokeIteration <em>Action Method Invoke Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Method Invoke Iteration</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokeIteration
	 * @generated
	 */
	EClass getESMFActionMethodInvokeIteration();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateAdd <em>Action State Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action State Add</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateAdd
	 * @generated
	 */
	EClass getESMFActionStateAdd();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateAdd#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateAdd#getState()
	 * @see #getESMFActionStateAdd()
	 * @generated
	 */
	EReference getESMFActionStateAdd_State();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateAdd#getItemList <em>Item List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item List</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateAdd#getItemList()
	 * @see #getESMFActionStateAdd()
	 * @generated
	 */
	EReference getESMFActionStateAdd_ItemList();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateCreate <em>Action State Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action State Create</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateCreate
	 * @generated
	 */
	EClass getESMFActionStateCreate();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateCreate#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateCreate#getState()
	 * @see #getESMFActionStateCreate()
	 * @generated
	 */
	EReference getESMFActionStateCreate_State();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateCreate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateCreate#getName()
	 * @see #getESMFActionStateCreate()
	 * @generated
	 */
	EAttribute getESMFActionStateCreate_Name();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateGet <em>Action State Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action State Get</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateGet
	 * @generated
	 */
	EClass getESMFActionStateGet();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateGet#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateGet#getState()
	 * @see #getESMFActionStateGet()
	 * @generated
	 */
	EReference getESMFActionStateGet_State();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateGet#getItemName <em>Item Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Name</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateGet#getItemName()
	 * @see #getESMFActionStateGet()
	 * @generated
	 */
	EAttribute getESMFActionStateGet_ItemName();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateGet#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateGet#getItem()
	 * @see #getESMFActionStateGet()
	 * @generated
	 */
	EReference getESMFActionStateGet_Item();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateReconcile <em>Action State Reconcile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action State Reconcile</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateReconcile
	 * @generated
	 */
	EClass getESMFActionStateReconcile();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateReconcile#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateReconcile#getState()
	 * @see #getESMFActionStateReconcile()
	 * @generated
	 */
	EReference getESMFActionStateReconcile_State();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreate <em>Action Array Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Array Create</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreate
	 * @generated
	 */
	EClass getESMFActionArrayCreate();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreate#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreate#getArray()
	 * @see #getESMFActionArrayCreate()
	 * @generated
	 */
	EReference getESMFActionArrayCreate_Array();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS <em>Action Array Create Allocate AS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Array Create Allocate AS</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS
	 * @generated
	 */
	EClass getESMFActionArrayCreateAllocateAS();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getArray()
	 * @see #getESMFActionArrayCreateAllocateAS()
	 * @generated
	 */
	EReference getESMFActionArrayCreateAllocateAS_Array();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getDistGrid <em>Dist Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dist Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getDistGrid()
	 * @see #getESMFActionArrayCreateAllocateAS()
	 * @generated
	 */
	EReference getESMFActionArrayCreateAllocateAS_DistGrid();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getArraySpec <em>Array Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array Spec</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getArraySpec()
	 * @see #getESMFActionArrayCreateAllocateAS()
	 * @generated
	 */
	EReference getESMFActionArrayCreateAllocateAS_ArraySpec();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getIndexflag <em>Indexflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indexflag</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getIndexflag()
	 * @see #getESMFActionArrayCreateAllocateAS()
	 * @generated
	 */
	EAttribute getESMFActionArrayCreateAllocateAS_Indexflag();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getTotalLWidth <em>Total LWidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Total LWidth</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getTotalLWidth()
	 * @see #getESMFActionArrayCreateAllocateAS()
	 * @generated
	 */
	EAttribute getESMFActionArrayCreateAllocateAS_TotalLWidth();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getTotalUWidth <em>Total UWidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Total UWidth</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS#getTotalUWidth()
	 * @see #getESMFActionArrayCreateAllocateAS()
	 * @generated
	 */
	EAttribute getESMFActionArrayCreateAllocateAS_TotalUWidth();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet <em>Action Array Spec Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Array Spec Set</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet
	 * @generated
	 */
	EClass getESMFActionArraySpecSet();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet#getArraySpec <em>Array Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array Spec</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet#getArraySpec()
	 * @see #getESMFActionArraySpecSet()
	 * @generated
	 */
	EReference getESMFActionArraySpecSet_ArraySpec();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet#getTypekind <em>Typekind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typekind</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet#getTypekind()
	 * @see #getESMFActionArraySpecSet()
	 * @generated
	 */
	EAttribute getESMFActionArraySpecSet_Typekind();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet#getRank()
	 * @see #getESMFActionArraySpecSet()
	 * @generated
	 */
	EAttribute getESMFActionArraySpecSet_Rank();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate <em>Action Clock Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Clock Create</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate
	 * @generated
	 */
	EClass getESMFActionClockCreate();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getClock()
	 * @see #getESMFActionClockCreate()
	 * @generated
	 */
	EReference getESMFActionClockCreate_Clock();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getTimeStep <em>Time Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Step</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getTimeStep()
	 * @see #getESMFActionClockCreate()
	 * @generated
	 */
	EReference getESMFActionClockCreate_TimeStep();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Time</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getStartTime()
	 * @see #getESMFActionClockCreate()
	 * @generated
	 */
	EReference getESMFActionClockCreate_StartTime();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getStopTime <em>Stop Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stop Time</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getStopTime()
	 * @see #getESMFActionClockCreate()
	 * @generated
	 */
	EReference getESMFActionClockCreate_StopTime();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGet <em>Action Clock Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Clock Get</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockGet
	 * @generated
	 */
	EClass getESMFActionClockGet();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGet#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockGet#getClock()
	 * @see #getESMFActionClockGet()
	 * @generated
	 */
	EReference getESMFActionClockGet_Clock();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGet#getTimeStep <em>Time Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Step</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockGet#getTimeStep()
	 * @see #getESMFActionClockGet()
	 * @generated
	 */
	EReference getESMFActionClockGet_TimeStep();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGet#getCurrTime <em>Curr Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Curr Time</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockGet#getCurrTime()
	 * @see #getESMFActionClockGet()
	 * @generated
	 */
	EReference getESMFActionClockGet_CurrTime();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGetTimestep <em>Action Clock Get Timestep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Clock Get Timestep</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockGetTimestep
	 * @generated
	 */
	EClass getESMFActionClockGetTimestep();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGetTimestep#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockGetTimestep#getClock()
	 * @see #getESMFActionClockGetTimestep()
	 * @generated
	 */
	EReference getESMFActionClockGetTimestep_Clock();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompCreate <em>Action Cpl Comp Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Cpl Comp Create</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompCreate
	 * @generated
	 */
	EClass getESMFActionCplCompCreate();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompCreate#getCplcomp <em>Cplcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cplcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompCreate#getCplcomp()
	 * @see #getESMFActionCplCompCreate()
	 * @generated
	 */
	EReference getESMFActionCplCompCreate_Cplcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompCreate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompCreate#getName()
	 * @see #getESMFActionCplCompCreate()
	 * @generated
	 */
	EAttribute getESMFActionCplCompCreate_Name();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize <em>Action Cpl Comp Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Cpl Comp Initialize</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize
	 * @generated
	 */
	EClass getESMFActionCplCompInitialize();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize#getCplcomp <em>Cplcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cplcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize#getCplcomp()
	 * @see #getESMFActionCplCompInitialize()
	 * @generated
	 */
	EReference getESMFActionCplCompInitialize_Cplcomp();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize#getImportState <em>Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize#getImportState()
	 * @see #getESMFActionCplCompInitialize()
	 * @generated
	 */
	EReference getESMFActionCplCompInitialize_ImportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize#getExportState <em>Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize#getExportState()
	 * @see #getESMFActionCplCompInitialize()
	 * @generated
	 */
	EReference getESMFActionCplCompInitialize_ExportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize#getClock()
	 * @see #getESMFActionCplCompInitialize()
	 * @generated
	 */
	EReference getESMFActionCplCompInitialize_Clock();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize#getPhase()
	 * @see #getESMFActionCplCompInitialize()
	 * @generated
	 */
	EAttribute getESMFActionCplCompInitialize_Phase();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun <em>Action Cpl Comp Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Cpl Comp Run</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun
	 * @generated
	 */
	EClass getESMFActionCplCompRun();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getCplcomp <em>Cplcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cplcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getCplcomp()
	 * @see #getESMFActionCplCompRun()
	 * @generated
	 */
	EReference getESMFActionCplCompRun_Cplcomp();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getImportState <em>Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getImportState()
	 * @see #getESMFActionCplCompRun()
	 * @generated
	 */
	EReference getESMFActionCplCompRun_ImportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getExportState <em>Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getExportState()
	 * @see #getESMFActionCplCompRun()
	 * @generated
	 */
	EReference getESMFActionCplCompRun_ExportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getClock()
	 * @see #getESMFActionCplCompRun()
	 * @generated
	 */
	EReference getESMFActionCplCompRun_Clock();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getPhase()
	 * @see #getESMFActionCplCompRun()
	 * @generated
	 */
	EAttribute getESMFActionCplCompRun_Phase();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize <em>Action Cpl Comp Finalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Cpl Comp Finalize</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize
	 * @generated
	 */
	EClass getESMFActionCplCompFinalize();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize#getCplcomp <em>Cplcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cplcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize#getCplcomp()
	 * @see #getESMFActionCplCompFinalize()
	 * @generated
	 */
	EReference getESMFActionCplCompFinalize_Cplcomp();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize#getImportState <em>Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize#getImportState()
	 * @see #getESMFActionCplCompFinalize()
	 * @generated
	 */
	EReference getESMFActionCplCompFinalize_ImportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize#getExportState <em>Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize#getExportState()
	 * @see #getESMFActionCplCompFinalize()
	 * @generated
	 */
	EReference getESMFActionCplCompFinalize_ExportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize#getClock()
	 * @see #getESMFActionCplCompFinalize()
	 * @generated
	 */
	EReference getESMFActionCplCompFinalize_Clock();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize#getPhase()
	 * @see #getESMFActionCplCompFinalize()
	 * @generated
	 */
	EAttribute getESMFActionCplCompFinalize_Phase();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices <em>Action Cpl Comp Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Cpl Comp Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices
	 * @generated
	 */
	EClass getESMFActionCplCompSetServices();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices#getCplcomp <em>Cplcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cplcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices#getCplcomp()
	 * @see #getESMFActionCplCompSetServices()
	 * @generated
	 */
	EReference getESMFActionCplCompSetServices_Cplcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices#getUserRoutine <em>User Routine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Routine</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices#getUserRoutine()
	 * @see #getESMFActionCplCompSetServices()
	 * @generated
	 */
	EAttribute getESMFActionCplCompSetServices_UserRoutine();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices#getUserRC <em>User RC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User RC</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices#getUserRC()
	 * @see #getESMFActionCplCompSetServices()
	 * @generated
	 */
	EAttribute getESMFActionCplCompSetServices_UserRC();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate <em>Action Dist Grid Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Dist Grid Create</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate
	 * @generated
	 */
	EClass getESMFActionDistGridCreate();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate#getDistGrid <em>Dist Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dist Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate#getDistGrid()
	 * @see #getESMFActionDistGridCreate()
	 * @generated
	 */
	EReference getESMFActionDistGridCreate_DistGrid();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate#getMinIndex <em>Min Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Min Index</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate#getMinIndex()
	 * @see #getESMFActionDistGridCreate()
	 * @generated
	 */
	EAttribute getESMFActionDistGridCreate_MinIndex();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate#getMaxIndex <em>Max Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Max Index</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate#getMaxIndex()
	 * @see #getESMFActionDistGridCreate()
	 * @generated
	 */
	EAttribute getESMFActionDistGridCreate_MaxIndex();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate#getRegDecomp <em>Reg Decomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reg Decomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate#getRegDecomp()
	 * @see #getESMFActionDistGridCreate()
	 * @generated
	 */
	EAttribute getESMFActionDistGridCreate_RegDecomp();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreate <em>Action Field Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Field Create</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreate
	 * @generated
	 */
	EClass getESMFActionFieldCreate();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreate#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreate#getField()
	 * @see #getESMFActionFieldCreate()
	 * @generated
	 */
	EReference getESMFActionFieldCreate_Field();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray <em>Action Field Create Grid Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Field Create Grid Array</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray
	 * @generated
	 */
	EClass getESMFActionFieldCreateGridArray();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getField()
	 * @see #getESMFActionFieldCreateGridArray()
	 * @generated
	 */
	EReference getESMFActionFieldCreateGridArray_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getName()
	 * @see #getESMFActionFieldCreateGridArray()
	 * @generated
	 */
	EAttribute getESMFActionFieldCreateGridArray_Name();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getGrid()
	 * @see #getESMFActionFieldCreateGridArray()
	 * @generated
	 */
	EReference getESMFActionFieldCreateGridArray_Grid();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getArray()
	 * @see #getESMFActionFieldCreateGridArray()
	 * @generated
	 */
	EReference getESMFActionFieldCreateGridArray_Array();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec <em>Action Field Create Grid Array Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Field Create Grid Array Spec</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec
	 * @generated
	 */
	EClass getESMFActionFieldCreateGridArraySpec();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getField()
	 * @see #getESMFActionFieldCreateGridArraySpec()
	 * @generated
	 */
	EReference getESMFActionFieldCreateGridArraySpec_Field();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getGrid()
	 * @see #getESMFActionFieldCreateGridArraySpec()
	 * @generated
	 */
	EReference getESMFActionFieldCreateGridArraySpec_Grid();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getArraySpec <em>Array Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array Spec</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getArraySpec()
	 * @see #getESMFActionFieldCreateGridArraySpec()
	 * @generated
	 */
	EReference getESMFActionFieldCreateGridArraySpec_ArraySpec();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getIndexflag <em>Indexflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indexflag</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getIndexflag()
	 * @see #getESMFActionFieldCreateGridArraySpec()
	 * @generated
	 */
	EAttribute getESMFActionFieldCreateGridArraySpec_Indexflag();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getTotalLWidth <em>Total LWidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Total LWidth</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getTotalLWidth()
	 * @see #getESMFActionFieldCreateGridArraySpec()
	 * @generated
	 */
	EAttribute getESMFActionFieldCreateGridArraySpec_TotalLWidth();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getTotalUWidth <em>Total UWidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Total UWidth</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getTotalUWidth()
	 * @see #getESMFActionFieldCreateGridArraySpec()
	 * @generated
	 */
	EAttribute getESMFActionFieldCreateGridArraySpec_TotalUWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getName()
	 * @see #getESMFActionFieldCreateGridArraySpec()
	 * @generated
	 */
	EAttribute getESMFActionFieldCreateGridArraySpec_Name();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR <em>Action Field Create TKR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Field Create TKR</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR
	 * @generated
	 */
	EClass getESMFActionFieldCreateTKR();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR#getField()
	 * @see #getESMFActionFieldCreateTKR()
	 * @generated
	 */
	EReference getESMFActionFieldCreateTKR_Field();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR#getGrid()
	 * @see #getESMFActionFieldCreateTKR()
	 * @generated
	 */
	EReference getESMFActionFieldCreateTKR_Grid();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR#getTypekind <em>Typekind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typekind</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR#getTypekind()
	 * @see #getESMFActionFieldCreateTKR()
	 * @generated
	 */
	EAttribute getESMFActionFieldCreateTKR_Typekind();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGet <em>Action Field Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Field Get</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldGet
	 * @generated
	 */
	EClass getESMFActionFieldGet();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGet#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldGet#getField()
	 * @see #getESMFActionFieldGet()
	 * @generated
	 */
	EReference getESMFActionFieldGet_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGet#getFarrayPtr <em>Farray Ptr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farray Ptr</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldGet#getFarrayPtr()
	 * @see #getESMFActionFieldGet()
	 * @generated
	 */
	EAttribute getESMFActionFieldGet_FarrayPtr();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds <em>Action Field Get Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Field Get Bounds</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds
	 * @generated
	 */
	EClass getESMFActionFieldGetBounds();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getField()
	 * @see #getESMFActionFieldGetBounds()
	 * @generated
	 */
	EReference getESMFActionFieldGetBounds_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getExclusiveLBound <em>Exclusive LBound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive LBound</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getExclusiveLBound()
	 * @see #getESMFActionFieldGetBounds()
	 * @generated
	 */
	EAttribute getESMFActionFieldGetBounds_ExclusiveLBound();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getExclusiveUBound <em>Exclusive UBound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive UBound</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getExclusiveUBound()
	 * @see #getESMFActionFieldGetBounds()
	 * @generated
	 */
	EAttribute getESMFActionFieldGetBounds_ExclusiveUBound();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getComputationalLBound <em>Computational LBound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computational LBound</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getComputationalLBound()
	 * @see #getESMFActionFieldGetBounds()
	 * @generated
	 */
	EAttribute getESMFActionFieldGetBounds_ComputationalLBound();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getComputationalUBound <em>Computational UBound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computational UBound</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getComputationalUBound()
	 * @see #getESMFActionFieldGetBounds()
	 * @generated
	 */
	EAttribute getESMFActionFieldGetBounds_ComputationalUBound();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getTotalLBound <em>Total LBound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total LBound</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getTotalLBound()
	 * @see #getESMFActionFieldGetBounds()
	 * @generated
	 */
	EAttribute getESMFActionFieldGetBounds_TotalLBound();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getTotalUBound <em>Total UBound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total UBound</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getTotalUBound()
	 * @see #getESMFActionFieldGetBounds()
	 * @generated
	 */
	EAttribute getESMFActionFieldGetBounds_TotalUBound();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloStore <em>Action Field Halo Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Field Halo Store</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloStore
	 * @generated
	 */
	EClass getESMFActionFieldHaloStore();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloStore#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloStore#getField()
	 * @see #getESMFActionFieldHaloStore()
	 * @generated
	 */
	EReference getESMFActionFieldHaloStore_Field();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloStore#getRouteHandle <em>Route Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route Handle</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloStore#getRouteHandle()
	 * @see #getESMFActionFieldHaloStore()
	 * @generated
	 */
	EReference getESMFActionFieldHaloStore_RouteHandle();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldHalo <em>Action Field Halo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Field Halo</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldHalo
	 * @generated
	 */
	EClass getESMFActionFieldHalo();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldHalo#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldHalo#getField()
	 * @see #getESMFActionFieldHalo()
	 * @generated
	 */
	EReference getESMFActionFieldHalo_Field();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldHalo#getRouteHandle <em>Route Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route Handle</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldHalo#getRouteHandle()
	 * @see #getESMFActionFieldHalo()
	 * @generated
	 */
	EReference getESMFActionFieldHalo_RouteHandle();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloRelease <em>Action Field Halo Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Field Halo Release</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloRelease
	 * @generated
	 */
	EClass getESMFActionFieldHaloRelease();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloRelease#getRouteHandle <em>Route Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route Handle</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloRelease#getRouteHandle()
	 * @see #getESMFActionFieldHaloRelease()
	 * @generated
	 */
	EReference getESMFActionFieldHaloRelease_RouteHandle();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore <em>Action Field Redist Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Field Redist Store</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore
	 * @generated
	 */
	EClass getESMFActionFieldRedistStore();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore#getSrcField <em>Src Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore#getSrcField()
	 * @see #getESMFActionFieldRedistStore()
	 * @generated
	 */
	EReference getESMFActionFieldRedistStore_SrcField();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore#getDstField <em>Dst Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dst Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore#getDstField()
	 * @see #getESMFActionFieldRedistStore()
	 * @generated
	 */
	EReference getESMFActionFieldRedistStore_DstField();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore#getRouteHandle <em>Route Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route Handle</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore#getRouteHandle()
	 * @see #getESMFActionFieldRedistStore()
	 * @generated
	 */
	EReference getESMFActionFieldRedistStore_RouteHandle();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedist <em>Action Field Redist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Field Redist</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedist
	 * @generated
	 */
	EClass getESMFActionFieldRedist();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedist#getSrcField <em>Src Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedist#getSrcField()
	 * @see #getESMFActionFieldRedist()
	 * @generated
	 */
	EReference getESMFActionFieldRedist_SrcField();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedist#getDstField <em>Dst Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dst Field</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedist#getDstField()
	 * @see #getESMFActionFieldRedist()
	 * @generated
	 */
	EReference getESMFActionFieldRedist_DstField();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedist#getRouteHandle <em>Route Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route Handle</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedist#getRouteHandle()
	 * @see #getESMFActionFieldRedist()
	 * @generated
	 */
	EReference getESMFActionFieldRedist_RouteHandle();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistRelease <em>Action Field Redist Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Field Redist Release</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistRelease
	 * @generated
	 */
	EClass getESMFActionFieldRedistRelease();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistRelease#getRouteHandle <em>Route Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route Handle</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistRelease#getRouteHandle()
	 * @see #getESMFActionFieldRedistRelease()
	 * @generated
	 */
	EReference getESMFActionFieldRedistRelease_RouteHandle();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkInit <em>Action Framework Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Framework Init</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkInit
	 * @generated
	 */
	EClass getESMFActionFrameworkInit();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkInit#getDefaultCalKind <em>Default Cal Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Cal Kind</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkInit#getDefaultCalKind()
	 * @see #getESMFActionFrameworkInit()
	 * @generated
	 */
	EAttribute getESMFActionFrameworkInit_DefaultCalKind();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkFinalize <em>Action Framework Finalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Framework Finalize</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkFinalize
	 * @generated
	 */
	EClass getESMFActionFrameworkFinalize();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate <em>Action Grid Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Grid Create</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate
	 * @generated
	 */
	EClass getESMFActionGridCreate();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getGrid()
	 * @see #getESMFActionGridCreate()
	 * @generated
	 */
	EReference getESMFActionGridCreate_Grid();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getDistGrid <em>Dist Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dist Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getDistGrid()
	 * @see #getESMFActionGridCreate()
	 * @generated
	 */
	EReference getESMFActionGridCreate_DistGrid();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getName()
	 * @see #getESMFActionGridCreate()
	 * @generated
	 */
	EAttribute getESMFActionGridCreate_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getIndexflag <em>Indexflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indexflag</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate#getIndexflag()
	 * @see #getESMFActionGridCreate()
	 * @generated
	 */
	EAttribute getESMFActionGridCreate_Indexflag();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGet <em>Action Grid Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Grid Get</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGet
	 * @generated
	 */
	EClass getESMFActionGridGet();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGet#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGet#getGrid()
	 * @see #getESMFActionGridGet()
	 * @generated
	 */
	EReference getESMFActionGridGet_Grid();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe <em>Action Grid Get PLocal De</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Grid Get PLocal De</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe
	 * @generated
	 */
	EClass getESMFActionGridGetPLocalDe();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe#getLocalDE <em>Local DE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local DE</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe#getLocalDE()
	 * @see #getESMFActionGridGetPLocalDe()
	 * @generated
	 */
	EAttribute getESMFActionGridGetPLocalDe_LocalDE();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe#getIsLBound <em>Is LBound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is LBound</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe#getIsLBound()
	 * @see #getESMFActionGridGetPLocalDe()
	 * @generated
	 */
	EAttribute getESMFActionGridGetPLocalDe_IsLBound();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe#getIsUBound <em>Is UBound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is UBound</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe#getIsUBound()
	 * @see #getESMFActionGridGetPLocalDe()
	 * @generated
	 */
	EAttribute getESMFActionGridGetPLocalDe_IsUBound();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc <em>Action Grid Get PLocal De PSloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Grid Get PLocal De PSloc</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc
	 * @generated
	 */
	EClass getESMFActionGridGetPLocalDePSloc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getStaggerloc <em>Staggerloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Staggerloc</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getStaggerloc()
	 * @see #getESMFActionGridGetPLocalDePSloc()
	 * @generated
	 */
	EAttribute getESMFActionGridGetPLocalDePSloc_Staggerloc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getExclusiveLBound <em>Exclusive LBound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive LBound</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getExclusiveLBound()
	 * @see #getESMFActionGridGetPLocalDePSloc()
	 * @generated
	 */
	EAttribute getESMFActionGridGetPLocalDePSloc_ExclusiveLBound();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getExclusiveUBound <em>Exclusive UBound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive UBound</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getExclusiveUBound()
	 * @see #getESMFActionGridGetPLocalDePSloc()
	 * @generated
	 */
	EAttribute getESMFActionGridGetPLocalDePSloc_ExclusiveUBound();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getComputationalLBound <em>Computational LBound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computational LBound</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getComputationalLBound()
	 * @see #getESMFActionGridGetPLocalDePSloc()
	 * @generated
	 */
	EAttribute getESMFActionGridGetPLocalDePSloc_ComputationalLBound();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getComputationalUBound <em>Computational UBound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computational UBound</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getComputationalUBound()
	 * @see #getESMFActionGridGetPLocalDePSloc()
	 * @generated
	 */
	EAttribute getESMFActionGridGetPLocalDePSloc_ComputationalUBound();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord <em>Action Grid Get Coord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Grid Get Coord</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord
	 * @generated
	 */
	EClass getESMFActionGridGetCoord();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grid</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord#getGrid()
	 * @see #getESMFActionGridGetCoord()
	 * @generated
	 */
	EReference getESMFActionGridGetCoord_Grid();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord#getCoordDim <em>Coord Dim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord Dim</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord#getCoordDim()
	 * @see #getESMFActionGridGetCoord()
	 * @generated
	 */
	EAttribute getESMFActionGridGetCoord_CoordDim();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord#getFarrayPtr <em>Farray Ptr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farray Ptr</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord#getFarrayPtr()
	 * @see #getESMFActionGridGetCoord()
	 * @generated
	 */
	EAttribute getESMFActionGridGetCoord_FarrayPtr();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompCreate <em>Action Grid Comp Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Grid Comp Create</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompCreate
	 * @generated
	 */
	EClass getESMFActionGridCompCreate();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompCreate#getGridcomp <em>Gridcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gridcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompCreate#getGridcomp()
	 * @see #getESMFActionGridCompCreate()
	 * @generated
	 */
	EReference getESMFActionGridCompCreate_Gridcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompCreate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompCreate#getName()
	 * @see #getESMFActionGridCompCreate()
	 * @generated
	 */
	EAttribute getESMFActionGridCompCreate_Name();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize <em>Action Grid Comp Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Grid Comp Initialize</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize
	 * @generated
	 */
	EClass getESMFActionGridCompInitialize();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize#getGridcomp <em>Gridcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gridcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize#getGridcomp()
	 * @see #getESMFActionGridCompInitialize()
	 * @generated
	 */
	EReference getESMFActionGridCompInitialize_Gridcomp();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize#getImportState <em>Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize#getImportState()
	 * @see #getESMFActionGridCompInitialize()
	 * @generated
	 */
	EReference getESMFActionGridCompInitialize_ImportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize#getExportState <em>Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize#getExportState()
	 * @see #getESMFActionGridCompInitialize()
	 * @generated
	 */
	EReference getESMFActionGridCompInitialize_ExportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize#getClock()
	 * @see #getESMFActionGridCompInitialize()
	 * @generated
	 */
	EReference getESMFActionGridCompInitialize_Clock();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize#getPhase()
	 * @see #getESMFActionGridCompInitialize()
	 * @generated
	 */
	EAttribute getESMFActionGridCompInitialize_Phase();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun <em>Action Grid Comp Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Grid Comp Run</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun
	 * @generated
	 */
	EClass getESMFActionGridCompRun();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun#getGridcomp <em>Gridcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gridcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun#getGridcomp()
	 * @see #getESMFActionGridCompRun()
	 * @generated
	 */
	EReference getESMFActionGridCompRun_Gridcomp();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun#getImportState <em>Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun#getImportState()
	 * @see #getESMFActionGridCompRun()
	 * @generated
	 */
	EReference getESMFActionGridCompRun_ImportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun#getExportState <em>Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun#getExportState()
	 * @see #getESMFActionGridCompRun()
	 * @generated
	 */
	EReference getESMFActionGridCompRun_ExportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun#getClock()
	 * @see #getESMFActionGridCompRun()
	 * @generated
	 */
	EReference getESMFActionGridCompRun_Clock();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun#getPhase()
	 * @see #getESMFActionGridCompRun()
	 * @generated
	 */
	EAttribute getESMFActionGridCompRun_Phase();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize <em>Action Grid Comp Finalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Grid Comp Finalize</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize
	 * @generated
	 */
	EClass getESMFActionGridCompFinalize();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize#getGridcomp <em>Gridcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gridcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize#getGridcomp()
	 * @see #getESMFActionGridCompFinalize()
	 * @generated
	 */
	EReference getESMFActionGridCompFinalize_Gridcomp();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize#getImportState <em>Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize#getImportState()
	 * @see #getESMFActionGridCompFinalize()
	 * @generated
	 */
	EReference getESMFActionGridCompFinalize_ImportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize#getExportState <em>Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize#getExportState()
	 * @see #getESMFActionGridCompFinalize()
	 * @generated
	 */
	EReference getESMFActionGridCompFinalize_ExportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize#getClock()
	 * @see #getESMFActionGridCompFinalize()
	 * @generated
	 */
	EReference getESMFActionGridCompFinalize_Clock();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize#getPhase()
	 * @see #getESMFActionGridCompFinalize()
	 * @generated
	 */
	EAttribute getESMFActionGridCompFinalize_Phase();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompSetServices <em>Action Grid Comp Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Grid Comp Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompSetServices
	 * @generated
	 */
	EClass getESMFActionGridCompSetServices();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompSetServices#getGridcomp <em>Gridcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gridcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompSetServices#getGridcomp()
	 * @see #getESMFActionGridCompSetServices()
	 * @generated
	 */
	EReference getESMFActionGridCompSetServices_Gridcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompSetServices#getUserRoutine <em>User Routine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Routine</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompSetServices#getUserRoutine()
	 * @see #getESMFActionGridCompSetServices()
	 * @generated
	 */
	EAttribute getESMFActionGridCompSetServices_UserRoutine();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompSetServices#getUserRC <em>User RC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User RC</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompSetServices#getUserRC()
	 * @see #getESMFActionGridCompSetServices()
	 * @generated
	 */
	EAttribute getESMFActionGridCompSetServices_UserRC();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvoke <em>Action Method Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Method Invoke</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvoke
	 * @generated
	 */
	EClass getESMFActionMethodInvoke();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvoke#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvoke#getMethod()
	 * @see #getESMFActionMethodInvoke()
	 * @generated
	 */
	EReference getESMFActionMethodInvoke_Method();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvoke#getImportState <em>Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvoke#getImportState()
	 * @see #getESMFActionMethodInvoke()
	 * @generated
	 */
	EReference getESMFActionMethodInvoke_ImportState();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvoke#getExportState <em>Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export State</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvoke#getExportState()
	 * @see #getESMFActionMethodInvoke()
	 * @generated
	 */
	EReference getESMFActionMethodInvoke_ExportState();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet <em>Action Time Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Time Set</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet
	 * @generated
	 */
	EClass getESMFActionTimeSet();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getTime()
	 * @see #getESMFActionTimeSet()
	 * @generated
	 */
	EReference getESMFActionTimeSet_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getYy <em>Yy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yy</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getYy()
	 * @see #getESMFActionTimeSet()
	 * @generated
	 */
	EAttribute getESMFActionTimeSet_Yy();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getMm <em>Mm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mm</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getMm()
	 * @see #getESMFActionTimeSet()
	 * @generated
	 */
	EAttribute getESMFActionTimeSet_Mm();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getDd <em>Dd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dd</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getDd()
	 * @see #getESMFActionTimeSet()
	 * @generated
	 */
	EAttribute getESMFActionTimeSet_Dd();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getH()
	 * @see #getESMFActionTimeSet()
	 * @generated
	 */
	EAttribute getESMFActionTimeSet_H();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getM()
	 * @see #getESMFActionTimeSet()
	 * @generated
	 */
	EAttribute getESMFActionTimeSet_M();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet#getS()
	 * @see #getESMFActionTimeSet()
	 * @generated
	 */
	EAttribute getESMFActionTimeSet_S();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet <em>Action Time Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Time Get</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet
	 * @generated
	 */
	EClass getESMFActionTimeGet();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getTime()
	 * @see #getESMFActionTimeGet()
	 * @generated
	 */
	EReference getESMFActionTimeGet_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getYy <em>Yy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yy</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getYy()
	 * @see #getESMFActionTimeGet()
	 * @generated
	 */
	EAttribute getESMFActionTimeGet_Yy();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getMm <em>Mm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mm</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getMm()
	 * @see #getESMFActionTimeGet()
	 * @generated
	 */
	EAttribute getESMFActionTimeGet_Mm();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getDd <em>Dd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dd</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getDd()
	 * @see #getESMFActionTimeGet()
	 * @generated
	 */
	EAttribute getESMFActionTimeGet_Dd();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getH()
	 * @see #getESMFActionTimeGet()
	 * @generated
	 */
	EAttribute getESMFActionTimeGet_H();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getM()
	 * @see #getESMFActionTimeGet()
	 * @generated
	 */
	EAttribute getESMFActionTimeGet_M();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getS()
	 * @see #getESMFActionTimeGet()
	 * @generated
	 */
	EAttribute getESMFActionTimeGet_S();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalSet <em>Action Time Interval Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Time Interval Set</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalSet
	 * @generated
	 */
	EClass getESMFActionTimeIntervalSet();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalSet#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Interval</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalSet#getTimeInterval()
	 * @see #getESMFActionTimeIntervalSet()
	 * @generated
	 */
	EReference getESMFActionTimeIntervalSet_TimeInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalSet#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalSet#getH()
	 * @see #getESMFActionTimeIntervalSet()
	 * @generated
	 */
	EAttribute getESMFActionTimeIntervalSet_H();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalSet#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalSet#getM()
	 * @see #getESMFActionTimeIntervalSet()
	 * @generated
	 */
	EAttribute getESMFActionTimeIntervalSet_M();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalSet#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalSet#getS()
	 * @see #getESMFActionTimeIntervalSet()
	 * @generated
	 */
	EAttribute getESMFActionTimeIntervalSet_S();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet <em>Action Time Interval Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Time Interval Get</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet
	 * @generated
	 */
	EClass getESMFActionTimeIntervalGet();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Interval</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getTimeInterval()
	 * @see #getESMFActionTimeIntervalGet()
	 * @generated
	 */
	EReference getESMFActionTimeIntervalGet_TimeInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getH()
	 * @see #getESMFActionTimeIntervalGet()
	 * @generated
	 */
	EAttribute getESMFActionTimeIntervalGet_H();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getM()
	 * @see #getESMFActionTimeIntervalGet()
	 * @generated
	 */
	EAttribute getESMFActionTimeIntervalGet_M();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getS()
	 * @see #getESMFActionTimeIntervalGet()
	 * @generated
	 */
	EAttribute getESMFActionTimeIntervalGet_S();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionUserServiceInvoke <em>Action User Service Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action User Service Invoke</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionUserServiceInvoke
	 * @generated
	 */
	EClass getESMFActionUserServiceInvoke();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.esmf.ESMFActionUserServiceInvoke#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Declaration</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionUserServiceInvoke#getDeclaration()
	 * @see #getESMFActionUserServiceInvoke()
	 * @generated
	 */
	EAttribute getESMFActionUserServiceInvoke_Declaration();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.esmf.ESMFActionUserServiceInvoke#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Execution</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionUserServiceInvoke#getExecution()
	 * @see #getESMFActionUserServiceInvoke()
	 * @generated
	 */
	EAttribute getESMFActionUserServiceInvoke_Execution();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCall
	 * @generated
	 */
	EClass getESMFCall();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallGridCompCreate <em>Call Grid Comp Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Grid Comp Create</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallGridCompCreate
	 * @generated
	 */
	EClass getESMFCallGridCompCreate();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFCallGridCompCreate#getGridcomp <em>Gridcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gridcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallGridCompCreate#getGridcomp()
	 * @see #getESMFCallGridCompCreate()
	 * @generated
	 */
	EReference getESMFCallGridCompCreate_Gridcomp();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallGridCompInitialize <em>Call Grid Comp Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Grid Comp Initialize</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallGridCompInitialize
	 * @generated
	 */
	EClass getESMFCallGridCompInitialize();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFCallGridCompInitialize#getGridcomp <em>Gridcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gridcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallGridCompInitialize#getGridcomp()
	 * @see #getESMFCallGridCompInitialize()
	 * @generated
	 */
	EReference getESMFCallGridCompInitialize_Gridcomp();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallGridCompSetServices <em>Call Grid Comp Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Grid Comp Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallGridCompSetServices
	 * @generated
	 */
	EClass getESMFCallGridCompSetServices();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFCallGridCompSetServices#getGridcomp <em>Gridcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gridcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallGridCompSetServices#getGridcomp()
	 * @see #getESMFCallGridCompSetServices()
	 * @generated
	 */
	EReference getESMFCallGridCompSetServices_Gridcomp();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallCplCompCreate <em>Call Cpl Comp Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Cpl Comp Create</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallCplCompCreate
	 * @generated
	 */
	EClass getESMFCallCplCompCreate();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFCallCplCompCreate#getCplcomp <em>Cplcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cplcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallCplCompCreate#getCplcomp()
	 * @see #getESMFCallCplCompCreate()
	 * @generated
	 */
	EReference getESMFCallCplCompCreate_Cplcomp();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallCplCompInitialize <em>Call Cpl Comp Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Cpl Comp Initialize</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallCplCompInitialize
	 * @generated
	 */
	EClass getESMFCallCplCompInitialize();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFCallCplCompInitialize#getCplcomp <em>Cplcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cplcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallCplCompInitialize#getCplcomp()
	 * @see #getESMFCallCplCompInitialize()
	 * @generated
	 */
	EReference getESMFCallCplCompInitialize_Cplcomp();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallCplCompSetServices <em>Call Cpl Comp Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Cpl Comp Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallCplCompSetServices
	 * @generated
	 */
	EClass getESMFCallCplCompSetServices();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFCallCplCompSetServices#getCplcomp <em>Cplcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cplcomp</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallCplCompSetServices#getCplcomp()
	 * @see #getESMFCallCplCompSetServices()
	 * @generated
	 */
	EReference getESMFCallCplCompSetServices_Cplcomp();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallFieldCreateSIDL <em>Call Field Create SIDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Field Create SIDL</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallFieldCreateSIDL
	 * @generated
	 */
	EClass getESMFCallFieldCreateSIDL();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFCallFieldCreateSIDL#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallFieldCreateSIDL#getArgument()
	 * @see #getESMFCallFieldCreateSIDL()
	 * @generated
	 */
	EReference getESMFCallFieldCreateSIDL_Argument();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallSIDLMethod <em>Call SIDL Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call SIDL Method</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallSIDLMethod
	 * @generated
	 */
	EClass getESMFCallSIDLMethod();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.esmf.ESMFCallSIDLMethod#getSIDLMethod <em>SIDL Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SIDL Method</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallSIDLMethod#getSIDLMethod()
	 * @see #getESMFCallSIDLMethod()
	 * @generated
	 */
	EReference getESMFCallSIDLMethod_SIDLMethod();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.esmf.ESMFNamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFNamedEntity
	 * @generated
	 */
	EClass getESMFNamedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.esmf.ESMFNamedEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFNamedEntity#getName()
	 * @see #getESMFNamedEntity()
	 * @generated
	 */
	EAttribute getESMFNamedEntity_Name();

	/**
	 * Returns the meta object for enum '{@link org.earthsystemcurator.cupid.esmf.ESMFCalKind <em>Cal Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cal Kind</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCalKind
	 * @generated
	 */
	EEnum getESMFCalKind();

	/**
	 * Returns the meta object for enum '{@link org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc <em>Stagger Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stagger Loc</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc
	 * @generated
	 */
	EEnum getESMFStaggerLoc();

	/**
	 * Returns the meta object for enum '{@link org.earthsystemcurator.cupid.esmf.ESMFTypeKind <em>Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Kind</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTypeKind
	 * @generated
	 */
	EEnum getESMFTypeKind();

	/**
	 * Returns the meta object for enum '{@link org.earthsystemcurator.cupid.esmf.ESMF_INDEX <em>ESMF INDEX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESMF INDEX</em>'.
	 * @see org.earthsystemcurator.cupid.esmf.ESMF_INDEX
	 * @generated
	 */
	EEnum getESMF_INDEX();

	/**
	 * Returns the meta object for data type '<em>EInt Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInt Array</em>'.
	 * @model instanceClass="int[]"
	 * @generated
	 */
	EDataType getEIntArray();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>User Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>User Token</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getESMFUserToken();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ESMFFactory getESMFFactory();

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
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFComponent()
		 * @generated
		 */
		EClass ESMF_COMPONENT = eINSTANCE.getESMFComponent();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__METHOD = eINSTANCE.getESMFComponent_Method();

		/**
		 * The meta object literal for the '<em><b>Register Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__REGISTER_METHOD = eINSTANCE.getESMFComponent_RegisterMethod();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__STATE = eINSTANCE.getESMFComponent_State();

		/**
		 * The meta object literal for the '<em><b>Import State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__IMPORT_STATE = eINSTANCE.getESMFComponent_ImportState();

		/**
		 * The meta object literal for the '<em><b>Export State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__EXPORT_STATE = eINSTANCE.getESMFComponent_ExportState();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__COMPONENT = eINSTANCE.getESMFComponent_Component();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__PARENT = eINSTANCE.getESMFComponent_Parent();

		/**
		 * The meta object literal for the '<em><b>Array Spec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__ARRAY_SPEC = eINSTANCE.getESMFComponent_ArraySpec();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__ARRAY = eINSTANCE.getESMFComponent_Array();

		/**
		 * The meta object literal for the '<em><b>Dist Grid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__DIST_GRID = eINSTANCE.getESMFComponent_DistGrid();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__FIELD = eINSTANCE.getESMFComponent_Field();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__GRID = eINSTANCE.getESMFComponent_Grid();

		/**
		 * The meta object literal for the '<em><b>Route Handle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__ROUTE_HANDLE = eINSTANCE.getESMFComponent_RouteHandle();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__CLOCK = eINSTANCE.getESMFComponent_Clock();

		/**
		 * The meta object literal for the '<em><b>Model Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__MODEL_CLOCK = eINSTANCE.getESMFComponent_ModelClock();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__TIME = eINSTANCE.getESMFComponent_Time();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__TIME_INTERVAL = eINSTANCE.getESMFComponent_TimeInterval();

		/**
		 * The meta object literal for the '<em><b>SIDL Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_COMPONENT__SIDL_CLASS = eINSTANCE.getESMFComponent_SIDLClass();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFGriddedComponentImpl <em>Gridded Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFGriddedComponentImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFGriddedComponent()
		 * @generated
		 */
		EClass ESMF_GRIDDED_COMPONENT = eINSTANCE.getESMFGriddedComponent();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCouplerComponentImpl <em>Coupler Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCouplerComponentImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCouplerComponent()
		 * @generated
		 */
		EClass ESMF_COUPLER_COMPONENT = eINSTANCE.getESMFCouplerComponent();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFSimpleCouplerComponentImpl <em>Simple Coupler Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFSimpleCouplerComponentImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFSimpleCouplerComponent()
		 * @generated
		 */
		EClass ESMF_SIMPLE_COUPLER_COMPONENT = eINSTANCE.getESMFSimpleCouplerComponent();

		/**
		 * The meta object literal for the '<em><b>Field Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_SIMPLE_COUPLER_COMPONENT__FIELD_CONNECTION = eINSTANCE.getESMFSimpleCouplerComponent_FieldConnection();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFMethod()
		 * @generated
		 */
		EClass ESMF_METHOD = eINSTANCE.getESMFMethod();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_METHOD__COMPONENT = eINSTANCE.getESMFMethod_Component();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_METHOD__PHASE = eINSTANCE.getESMFMethod_Phase();

		/**
		 * The meta object literal for the '<em><b>Import State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_METHOD__IMPORT_STATE = eINSTANCE.getESMFMethod_ImportState();

		/**
		 * The meta object literal for the '<em><b>Export State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_METHOD__EXPORT_STATE = eINSTANCE.getESMFMethod_ExportState();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_METHOD__CLOCK = eINSTANCE.getESMFMethod_Clock();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_METHOD__ACTION = eINSTANCE.getESMFMethod_Action();

		/**
		 * The meta object literal for the '<em><b>SIDL Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_METHOD__SIDL_METHOD = eINSTANCE.getESMFMethod_SIDLMethod();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFInitMethodImpl <em>Init Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFInitMethodImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFInitMethod()
		 * @generated
		 */
		EClass ESMF_INIT_METHOD = eINSTANCE.getESMFInitMethod();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFPreInitMethodSIDLImpl <em>Pre Init Method SIDL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPreInitMethodSIDLImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFPreInitMethodSIDL()
		 * @generated
		 */
		EClass ESMF_PRE_INIT_METHOD_SIDL = eINSTANCE.getESMFPreInitMethodSIDL();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFPostInitMethodSIDLImpl <em>Post Init Method SIDL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPostInitMethodSIDLImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFPostInitMethodSIDL()
		 * @generated
		 */
		EClass ESMF_POST_INIT_METHOD_SIDL = eINSTANCE.getESMFPostInitMethodSIDL();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFRunMethodImpl <em>Run Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFRunMethodImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFRunMethod()
		 * @generated
		 */
		EClass ESMF_RUN_METHOD = eINSTANCE.getESMFRunMethod();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFinalizeMethodImpl <em>Finalize Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFFinalizeMethodImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFFinalizeMethod()
		 * @generated
		 */
		EClass ESMF_FINALIZE_METHOD = eINSTANCE.getESMFFinalizeMethod();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFinalizeMethodSIDLImpl <em>Finalize Method SIDL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFFinalizeMethodSIDLImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFFinalizeMethodSIDL()
		 * @generated
		 */
		EClass ESMF_FINALIZE_METHOD_SIDL = eINSTANCE.getESMFFinalizeMethodSIDL();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFRegisterMethodImpl <em>Register Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFRegisterMethodImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFRegisterMethod()
		 * @generated
		 */
		EClass ESMF_REGISTER_METHOD = eINSTANCE.getESMFRegisterMethod();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_REGISTER_METHOD__COMPONENT = eINSTANCE.getESMFRegisterMethod_Component();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCalendarImpl <em>Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCalendarImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCalendar()
		 * @generated
		 */
		EClass ESMF_CALENDAR = eINSTANCE.getESMFCalendar();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFTimeIntervalImpl <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFTimeIntervalImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFTimeInterval()
		 * @generated
		 */
		EClass ESMF_TIME_INTERVAL = eINSTANCE.getESMFTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_TIME_INTERVAL__HOURS = eINSTANCE.getESMFTimeInterval_Hours();

		/**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_TIME_INTERVAL__MINUTES = eINSTANCE.getESMFTimeInterval_Minutes();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_TIME_INTERVAL__SECONDS = eINSTANCE.getESMFTimeInterval_Seconds();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFTimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFTimeImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFTime()
		 * @generated
		 */
		EClass ESMF_TIME = eINSTANCE.getESMFTime();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_TIME__YEAR = eINSTANCE.getESMFTime_Year();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_TIME__MONTH = eINSTANCE.getESMFTime_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_TIME__DAY = eINSTANCE.getESMFTime_Day();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_TIME__HOUR = eINSTANCE.getESMFTime_Hour();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_TIME__MINUTE = eINSTANCE.getESMFTime_Minute();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_TIME__SECOND = eINSTANCE.getESMFTime_Second();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_TIME__CALENDAR = eINSTANCE.getESMFTime_Calendar();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFClockImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFClock()
		 * @generated
		 */
		EClass ESMF_CLOCK = eINSTANCE.getESMFClock();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_CLOCK__START_TIME = eINSTANCE.getESMFClock_StartTime();

		/**
		 * The meta object literal for the '<em><b>Stop Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_CLOCK__STOP_TIME = eINSTANCE.getESMFClock_StopTime();

		/**
		 * The meta object literal for the '<em><b>Time Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_CLOCK__TIME_STEP = eINSTANCE.getESMFClock_TimeStep();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_CLOCK__COMPONENT = eINSTANCE.getESMFClock_Component();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFStateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFStateImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFState()
		 * @generated
		 */
		EClass ESMF_STATE = eINSTANCE.getESMFState();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_STATE__COMPONENT = eINSTANCE.getESMFState_Component();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_STATE__ITEM = eINSTANCE.getESMFState_Item();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.ESMFStateItem <em>State Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.ESMFStateItem
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFStateItem()
		 * @generated
		 */
		EClass ESMF_STATE_ITEM = eINSTANCE.getESMFStateItem();

		/**
		 * The meta object literal for the '<em><b>Workspace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_STATE_ITEM__WORKSPACE = eINSTANCE.getESMFStateItem_Workspace();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFFieldImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFField()
		 * @generated
		 */
		EClass ESMF_FIELD = eINSTANCE.getESMFField();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_FIELD__COMPONENT = eINSTANCE.getESMFField_Component();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_FIELD__GRID = eINSTANCE.getESMFField_Grid();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_FIELD__ARRAY = eINSTANCE.getESMFField_Array();

		/**
		 * The meta object literal for the '<em><b>Stagger Loc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_FIELD__STAGGER_LOC = eINSTANCE.getESMFField_StaggerLoc();

		/**
		 * The meta object literal for the '<em><b>Array Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_FIELD__ARRAY_SPEC = eINSTANCE.getESMFField_ArraySpec();

		/**
		 * The meta object literal for the '<em><b>SIDL Argument</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_FIELD__SIDL_ARGUMENT = eINSTANCE.getESMFField_SIDLArgument();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldConnectionImpl <em>Field Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFFieldConnectionImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFFieldConnection()
		 * @generated
		 */
		EClass ESMF_FIELD_CONNECTION = eINSTANCE.getESMFFieldConnection();

		/**
		 * The meta object literal for the '<em><b>Src Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_FIELD_CONNECTION__SRC_FIELD = eINSTANCE.getESMFFieldConnection_SrcField();

		/**
		 * The meta object literal for the '<em><b>Dst Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_FIELD_CONNECTION__DST_FIELD = eINSTANCE.getESMFFieldConnection_DstField();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_FIELD_CONNECTION__COMPONENT = eINSTANCE.getESMFFieldConnection_Component();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFArrayImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFArray()
		 * @generated
		 */
		EClass ESMF_ARRAY = eINSTANCE.getESMFArray();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ARRAY__COMPONENT = eINSTANCE.getESMFArray_Component();

		/**
		 * The meta object literal for the '<em><b>Array Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ARRAY__ARRAY_SPEC = eINSTANCE.getESMFArray_ArraySpec();

		/**
		 * The meta object literal for the '<em><b>Dist Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ARRAY__DIST_GRID = eINSTANCE.getESMFArray_DistGrid();

		/**
		 * The meta object literal for the '<em><b>Farray</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ARRAY__FARRAY = eINSTANCE.getESMFArray_Farray();

		/**
		 * The meta object literal for the '<em><b>Indexflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ARRAY__INDEXFLAG = eINSTANCE.getESMFArray_Indexflag();

		/**
		 * The meta object literal for the '<em><b>Halo LWidth</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ARRAY__HALO_LWIDTH = eINSTANCE.getESMFArray_HaloLWidth();

		/**
		 * The meta object literal for the '<em><b>Halo UWidth</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ARRAY__HALO_UWIDTH = eINSTANCE.getESMFArray_HaloUWidth();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFRouteHandleImpl <em>Route Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFRouteHandleImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFRouteHandle()
		 * @generated
		 */
		EClass ESMF_ROUTE_HANDLE = eINSTANCE.getESMFRouteHandle();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ROUTE_HANDLE__COMPONENT = eINSTANCE.getESMFRouteHandle_Component();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArraySpecImpl <em>Array Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFArraySpecImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFArraySpec()
		 * @generated
		 */
		EClass ESMF_ARRAY_SPEC = eINSTANCE.getESMFArraySpec();

		/**
		 * The meta object literal for the '<em><b>Typekind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ARRAY_SPEC__TYPEKIND = eINSTANCE.getESMFArraySpec_Typekind();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ARRAY_SPEC__RANK = eINSTANCE.getESMFArraySpec_Rank();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ARRAY_SPEC__COMPONENT = eINSTANCE.getESMFArraySpec_Component();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFGridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFGridImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFGrid()
		 * @generated
		 */
		EClass ESMF_GRID = eINSTANCE.getESMFGrid();

		/**
		 * The meta object literal for the '<em><b>Dist Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_GRID__DIST_GRID = eINSTANCE.getESMFGrid_DistGrid();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ExtentImpl <em>Extent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ExtentImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getExtent()
		 * @generated
		 */
		EClass EXTENT = eINSTANCE.getExtent();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENT__MIN = eINSTANCE.getExtent_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENT__MAX = eINSTANCE.getExtent_Max();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDistGridImpl <em>Dist Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFDistGridImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFDistGrid()
		 * @generated
		 */
		EClass ESMF_DIST_GRID = eINSTANCE.getESMFDistGrid();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_DIST_GRID__EXTENT = eINSTANCE.getESMFDistGrid_Extent();

		/**
		 * The meta object literal for the '<em><b>De</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_DIST_GRID__DE = eINSTANCE.getESMFDistGrid_De();

		/**
		 * The meta object literal for the '<em><b>De Layout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_DIST_GRID__DE_LAYOUT = eINSTANCE.getESMFDistGrid_DeLayout();

		/**
		 * The meta object literal for the '<em><b>Regular Decomposition Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_DIST_GRID__REGULAR_DECOMPOSITION_SIZE = eINSTANCE.getESMFDistGrid_RegularDecompositionSize();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFWorkspaceImpl <em>Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFWorkspaceImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFWorkspace()
		 * @generated
		 */
		EClass ESMF_WORKSPACE = eINSTANCE.getESMFWorkspace();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_WORKSPACE__COMPONENT = eINSTANCE.getESMFWorkspace_Component();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_WORKSPACE__CALENDAR = eINSTANCE.getESMFWorkspace_Calendar();

		/**
		 * The meta object literal for the '<em><b>State Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_WORKSPACE__STATE_ITEM = eINSTANCE.getESMFWorkspace_StateItem();

		/**
		 * The meta object literal for the '<em><b>Dist Grid</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_WORKSPACE__DIST_GRID = eINSTANCE.getESMFWorkspace_DistGrid();

		/**
		 * The meta object literal for the '<em><b>Virtual Machine</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_WORKSPACE__VIRTUAL_MACHINE = eINSTANCE.getESMFWorkspace_VirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Persistent Execution Thread</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_WORKSPACE__PERSISTENT_EXECUTION_THREAD = eINSTANCE.getESMFWorkspace_PersistentExecutionThread();

		/**
		 * The meta object literal for the '<em><b>De Layout</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_WORKSPACE__DE_LAYOUT = eINSTANCE.getESMFWorkspace_DeLayout();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_WORKSPACE__GRID = eINSTANCE.getESMFWorkspace_Grid();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_WORKSPACE__CLOCK = eINSTANCE.getESMFWorkspace_Clock();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFVirtualMachineImpl <em>Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFVirtualMachineImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFVirtualMachine()
		 * @generated
		 */
		EClass ESMF_VIRTUAL_MACHINE = eINSTANCE.getESMFVirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_VIRTUAL_MACHINE__NAME = eINSTANCE.getESMFVirtualMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Parent VM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_VIRTUAL_MACHINE__PARENT_VM = eINSTANCE.getESMFVirtualMachine_ParentVM();

		/**
		 * The meta object literal for the '<em><b>Pet ID</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_VIRTUAL_MACHINE__PET_ID = eINSTANCE.getESMFVirtualMachine_PetID();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFPersistentExecutionThreadImpl <em>Persistent Execution Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPersistentExecutionThreadImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFPersistentExecutionThread()
		 * @generated
		 */
		EClass ESMF_PERSISTENT_EXECUTION_THREAD = eINSTANCE.getESMFPersistentExecutionThread();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_PERSISTENT_EXECUTION_THREAD__ID = eINSTANCE.getESMFPersistentExecutionThread_Id();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDELayoutImpl <em>DE Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFDELayoutImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFDELayout()
		 * @generated
		 */
		EClass ESMF_DE_LAYOUT = eINSTANCE.getESMFDELayout();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_DE_LAYOUT__NAME = eINSTANCE.getESMFDELayout_Name();

		/**
		 * The meta object literal for the '<em><b>Decomposition Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_DE_LAYOUT__DECOMPOSITION_ELEMENT = eINSTANCE.getESMFDELayout_DecompositionElement();

		/**
		 * The meta object literal for the '<em><b>De To Pet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_DE_LAYOUT__DE_TO_PET = eINSTANCE.getESMFDELayout_DeToPet();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDecompositionElementImpl <em>Decomposition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFDecompositionElementImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFDecompositionElement()
		 * @generated
		 */
		EClass ESMF_DECOMPOSITION_ELEMENT = eINSTANCE.getESMFDecompositionElement();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_DECOMPOSITION_ELEMENT__EXTENT = eINSTANCE.getESMFDecompositionElement_Extent();

		/**
		 * The meta object literal for the '<em><b>Parent Dist Grid</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID = eINSTANCE.getESMFDecompositionElement_ParentDistGrid();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFVirtualAddressSpaceImpl <em>Virtual Address Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFVirtualAddressSpaceImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFVirtualAddressSpace()
		 * @generated
		 */
		EClass ESMF_VIRTUAL_ADDRESS_SPACE = eINSTANCE.getESMFVirtualAddressSpace();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFAction()
		 * @generated
		 */
		EClass ESMF_ACTION = eINSTANCE.getESMFAction();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION__CONTEXT = eINSTANCE.getESMFAction_Context();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionAPIImpl <em>Action API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionAPIImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionAPI()
		 * @generated
		 */
		EClass ESMF_ACTION_API = eINSTANCE.getESMFActionAPI();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_API__RC = eINSTANCE.getESMFActionAPI_Rc();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokePatternImpl <em>Action Method Invoke Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokePatternImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionMethodInvokePattern()
		 * @generated
		 */
		EClass ESMF_ACTION_METHOD_INVOKE_PATTERN = eINSTANCE.getESMFActionMethodInvokePattern();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeSequenceImpl <em>Action Method Invoke Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeSequenceImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionMethodInvokeSequence()
		 * @generated
		 */
		EClass ESMF_ACTION_METHOD_INVOKE_SEQUENCE = eINSTANCE.getESMFActionMethodInvokeSequence();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_METHOD_INVOKE_SEQUENCE__PATTERN = eINSTANCE.getESMFActionMethodInvokeSequence_Pattern();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeIterationImpl <em>Action Method Invoke Iteration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeIterationImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionMethodInvokeIteration()
		 * @generated
		 */
		EClass ESMF_ACTION_METHOD_INVOKE_ITERATION = eINSTANCE.getESMFActionMethodInvokeIteration();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateAddImpl <em>Action State Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateAddImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionStateAdd()
		 * @generated
		 */
		EClass ESMF_ACTION_STATE_ADD = eINSTANCE.getESMFActionStateAdd();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_STATE_ADD__STATE = eINSTANCE.getESMFActionStateAdd_State();

		/**
		 * The meta object literal for the '<em><b>Item List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_STATE_ADD__ITEM_LIST = eINSTANCE.getESMFActionStateAdd_ItemList();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateCreateImpl <em>Action State Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateCreateImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionStateCreate()
		 * @generated
		 */
		EClass ESMF_ACTION_STATE_CREATE = eINSTANCE.getESMFActionStateCreate();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_STATE_CREATE__STATE = eINSTANCE.getESMFActionStateCreate_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_STATE_CREATE__NAME = eINSTANCE.getESMFActionStateCreate_Name();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateGetImpl <em>Action State Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateGetImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionStateGet()
		 * @generated
		 */
		EClass ESMF_ACTION_STATE_GET = eINSTANCE.getESMFActionStateGet();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_STATE_GET__STATE = eINSTANCE.getESMFActionStateGet_State();

		/**
		 * The meta object literal for the '<em><b>Item Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_STATE_GET__ITEM_NAME = eINSTANCE.getESMFActionStateGet_ItemName();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_STATE_GET__ITEM = eINSTANCE.getESMFActionStateGet_Item();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateReconcileImpl <em>Action State Reconcile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateReconcileImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionStateReconcile()
		 * @generated
		 */
		EClass ESMF_ACTION_STATE_RECONCILE = eINSTANCE.getESMFActionStateReconcile();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_STATE_RECONCILE__STATE = eINSTANCE.getESMFActionStateReconcile_State();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateImpl <em>Action Array Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionArrayCreate()
		 * @generated
		 */
		EClass ESMF_ACTION_ARRAY_CREATE = eINSTANCE.getESMFActionArrayCreate();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_ARRAY_CREATE__ARRAY = eINSTANCE.getESMFActionArrayCreate_Array();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateAllocateASImpl <em>Action Array Create Allocate AS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateAllocateASImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionArrayCreateAllocateAS()
		 * @generated
		 */
		EClass ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS = eINSTANCE.getESMFActionArrayCreateAllocateAS();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY = eINSTANCE.getESMFActionArrayCreateAllocateAS_Array();

		/**
		 * The meta object literal for the '<em><b>Dist Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__DIST_GRID = eINSTANCE.getESMFActionArrayCreateAllocateAS_DistGrid();

		/**
		 * The meta object literal for the '<em><b>Array Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY_SPEC = eINSTANCE.getESMFActionArrayCreateAllocateAS_ArraySpec();

		/**
		 * The meta object literal for the '<em><b>Indexflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__INDEXFLAG = eINSTANCE.getESMFActionArrayCreateAllocateAS_Indexflag();

		/**
		 * The meta object literal for the '<em><b>Total LWidth</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_LWIDTH = eINSTANCE.getESMFActionArrayCreateAllocateAS_TotalLWidth();

		/**
		 * The meta object literal for the '<em><b>Total UWidth</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_UWIDTH = eINSTANCE.getESMFActionArrayCreateAllocateAS_TotalUWidth();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArraySpecSetImpl <em>Action Array Spec Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionArraySpecSetImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionArraySpecSet()
		 * @generated
		 */
		EClass ESMF_ACTION_ARRAY_SPEC_SET = eINSTANCE.getESMFActionArraySpecSet();

		/**
		 * The meta object literal for the '<em><b>Array Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_ARRAY_SPEC_SET__ARRAY_SPEC = eINSTANCE.getESMFActionArraySpecSet_ArraySpec();

		/**
		 * The meta object literal for the '<em><b>Typekind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_ARRAY_SPEC_SET__TYPEKIND = eINSTANCE.getESMFActionArraySpecSet_Typekind();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_ARRAY_SPEC_SET__RANK = eINSTANCE.getESMFActionArraySpecSet_Rank();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockCreateImpl <em>Action Clock Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockCreateImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionClockCreate()
		 * @generated
		 */
		EClass ESMF_ACTION_CLOCK_CREATE = eINSTANCE.getESMFActionClockCreate();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CLOCK_CREATE__CLOCK = eINSTANCE.getESMFActionClockCreate_Clock();

		/**
		 * The meta object literal for the '<em><b>Time Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CLOCK_CREATE__TIME_STEP = eINSTANCE.getESMFActionClockCreate_TimeStep();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CLOCK_CREATE__START_TIME = eINSTANCE.getESMFActionClockCreate_StartTime();

		/**
		 * The meta object literal for the '<em><b>Stop Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CLOCK_CREATE__STOP_TIME = eINSTANCE.getESMFActionClockCreate_StopTime();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockGetImpl <em>Action Clock Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockGetImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionClockGet()
		 * @generated
		 */
		EClass ESMF_ACTION_CLOCK_GET = eINSTANCE.getESMFActionClockGet();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CLOCK_GET__CLOCK = eINSTANCE.getESMFActionClockGet_Clock();

		/**
		 * The meta object literal for the '<em><b>Time Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CLOCK_GET__TIME_STEP = eINSTANCE.getESMFActionClockGet_TimeStep();

		/**
		 * The meta object literal for the '<em><b>Curr Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CLOCK_GET__CURR_TIME = eINSTANCE.getESMFActionClockGet_CurrTime();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockGetTimestepImpl <em>Action Clock Get Timestep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockGetTimestepImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionClockGetTimestep()
		 * @generated
		 */
		EClass ESMF_ACTION_CLOCK_GET_TIMESTEP = eINSTANCE.getESMFActionClockGetTimestep();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CLOCK_GET_TIMESTEP__CLOCK = eINSTANCE.getESMFActionClockGetTimestep_Clock();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompCreateImpl <em>Action Cpl Comp Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompCreateImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionCplCompCreate()
		 * @generated
		 */
		EClass ESMF_ACTION_CPL_COMP_CREATE = eINSTANCE.getESMFActionCplCompCreate();

		/**
		 * The meta object literal for the '<em><b>Cplcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_CREATE__CPLCOMP = eINSTANCE.getESMFActionCplCompCreate_Cplcomp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_CPL_COMP_CREATE__NAME = eINSTANCE.getESMFActionCplCompCreate_Name();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompInitializeImpl <em>Action Cpl Comp Initialize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompInitializeImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionCplCompInitialize()
		 * @generated
		 */
		EClass ESMF_ACTION_CPL_COMP_INITIALIZE = eINSTANCE.getESMFActionCplCompInitialize();

		/**
		 * The meta object literal for the '<em><b>Cplcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_INITIALIZE__CPLCOMP = eINSTANCE.getESMFActionCplCompInitialize_Cplcomp();

		/**
		 * The meta object literal for the '<em><b>Import State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_INITIALIZE__IMPORT_STATE = eINSTANCE.getESMFActionCplCompInitialize_ImportState();

		/**
		 * The meta object literal for the '<em><b>Export State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_INITIALIZE__EXPORT_STATE = eINSTANCE.getESMFActionCplCompInitialize_ExportState();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_INITIALIZE__CLOCK = eINSTANCE.getESMFActionCplCompInitialize_Clock();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_CPL_COMP_INITIALIZE__PHASE = eINSTANCE.getESMFActionCplCompInitialize_Phase();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompRunImpl <em>Action Cpl Comp Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompRunImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionCplCompRun()
		 * @generated
		 */
		EClass ESMF_ACTION_CPL_COMP_RUN = eINSTANCE.getESMFActionCplCompRun();

		/**
		 * The meta object literal for the '<em><b>Cplcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_RUN__CPLCOMP = eINSTANCE.getESMFActionCplCompRun_Cplcomp();

		/**
		 * The meta object literal for the '<em><b>Import State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_RUN__IMPORT_STATE = eINSTANCE.getESMFActionCplCompRun_ImportState();

		/**
		 * The meta object literal for the '<em><b>Export State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_RUN__EXPORT_STATE = eINSTANCE.getESMFActionCplCompRun_ExportState();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_RUN__CLOCK = eINSTANCE.getESMFActionCplCompRun_Clock();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_CPL_COMP_RUN__PHASE = eINSTANCE.getESMFActionCplCompRun_Phase();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompFinalizeImpl <em>Action Cpl Comp Finalize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompFinalizeImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionCplCompFinalize()
		 * @generated
		 */
		EClass ESMF_ACTION_CPL_COMP_FINALIZE = eINSTANCE.getESMFActionCplCompFinalize();

		/**
		 * The meta object literal for the '<em><b>Cplcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_FINALIZE__CPLCOMP = eINSTANCE.getESMFActionCplCompFinalize_Cplcomp();

		/**
		 * The meta object literal for the '<em><b>Import State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_FINALIZE__IMPORT_STATE = eINSTANCE.getESMFActionCplCompFinalize_ImportState();

		/**
		 * The meta object literal for the '<em><b>Export State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_FINALIZE__EXPORT_STATE = eINSTANCE.getESMFActionCplCompFinalize_ExportState();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_FINALIZE__CLOCK = eINSTANCE.getESMFActionCplCompFinalize_Clock();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_CPL_COMP_FINALIZE__PHASE = eINSTANCE.getESMFActionCplCompFinalize_Phase();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompSetServicesImpl <em>Action Cpl Comp Set Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompSetServicesImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionCplCompSetServices()
		 * @generated
		 */
		EClass ESMF_ACTION_CPL_COMP_SET_SERVICES = eINSTANCE.getESMFActionCplCompSetServices();

		/**
		 * The meta object literal for the '<em><b>Cplcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_CPL_COMP_SET_SERVICES__CPLCOMP = eINSTANCE.getESMFActionCplCompSetServices_Cplcomp();

		/**
		 * The meta object literal for the '<em><b>User Routine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_ROUTINE = eINSTANCE.getESMFActionCplCompSetServices_UserRoutine();

		/**
		 * The meta object literal for the '<em><b>User RC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_RC = eINSTANCE.getESMFActionCplCompSetServices_UserRC();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionDistGridCreateImpl <em>Action Dist Grid Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionDistGridCreateImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionDistGridCreate()
		 * @generated
		 */
		EClass ESMF_ACTION_DIST_GRID_CREATE = eINSTANCE.getESMFActionDistGridCreate();

		/**
		 * The meta object literal for the '<em><b>Dist Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_DIST_GRID_CREATE__DIST_GRID = eINSTANCE.getESMFActionDistGridCreate_DistGrid();

		/**
		 * The meta object literal for the '<em><b>Min Index</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_DIST_GRID_CREATE__MIN_INDEX = eINSTANCE.getESMFActionDistGridCreate_MinIndex();

		/**
		 * The meta object literal for the '<em><b>Max Index</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_DIST_GRID_CREATE__MAX_INDEX = eINSTANCE.getESMFActionDistGridCreate_MaxIndex();

		/**
		 * The meta object literal for the '<em><b>Reg Decomp</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_DIST_GRID_CREATE__REG_DECOMP = eINSTANCE.getESMFActionDistGridCreate_RegDecomp();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateImpl <em>Action Field Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldCreate()
		 * @generated
		 */
		EClass ESMF_ACTION_FIELD_CREATE = eINSTANCE.getESMFActionFieldCreate();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_CREATE__FIELD = eINSTANCE.getESMFActionFieldCreate_Field();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArrayImpl <em>Action Field Create Grid Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArrayImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldCreateGridArray()
		 * @generated
		 */
		EClass ESMF_ACTION_FIELD_CREATE_GRID_ARRAY = eINSTANCE.getESMFActionFieldCreateGridArray();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__FIELD = eINSTANCE.getESMFActionFieldCreateGridArray_Field();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__NAME = eINSTANCE.getESMFActionFieldCreateGridArray_Name();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__GRID = eINSTANCE.getESMFActionFieldCreateGridArray_Grid();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__ARRAY = eINSTANCE.getESMFActionFieldCreateGridArray_Array();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArraySpecImpl <em>Action Field Create Grid Array Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArraySpecImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldCreateGridArraySpec()
		 * @generated
		 */
		EClass ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC = eINSTANCE.getESMFActionFieldCreateGridArraySpec();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__FIELD = eINSTANCE.getESMFActionFieldCreateGridArraySpec_Field();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__GRID = eINSTANCE.getESMFActionFieldCreateGridArraySpec_Grid();

		/**
		 * The meta object literal for the '<em><b>Array Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__ARRAY_SPEC = eINSTANCE.getESMFActionFieldCreateGridArraySpec_ArraySpec();

		/**
		 * The meta object literal for the '<em><b>Indexflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__INDEXFLAG = eINSTANCE.getESMFActionFieldCreateGridArraySpec_Indexflag();

		/**
		 * The meta object literal for the '<em><b>Total LWidth</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_LWIDTH = eINSTANCE.getESMFActionFieldCreateGridArraySpec_TotalLWidth();

		/**
		 * The meta object literal for the '<em><b>Total UWidth</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_UWIDTH = eINSTANCE.getESMFActionFieldCreateGridArraySpec_TotalUWidth();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__NAME = eINSTANCE.getESMFActionFieldCreateGridArraySpec_Name();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateTKRImpl <em>Action Field Create TKR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateTKRImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldCreateTKR()
		 * @generated
		 */
		EClass ESMF_ACTION_FIELD_CREATE_TKR = eINSTANCE.getESMFActionFieldCreateTKR();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_CREATE_TKR__FIELD = eINSTANCE.getESMFActionFieldCreateTKR_Field();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_CREATE_TKR__GRID = eINSTANCE.getESMFActionFieldCreateTKR_Grid();

		/**
		 * The meta object literal for the '<em><b>Typekind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FIELD_CREATE_TKR__TYPEKIND = eINSTANCE.getESMFActionFieldCreateTKR_Typekind();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetImpl <em>Action Field Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldGet()
		 * @generated
		 */
		EClass ESMF_ACTION_FIELD_GET = eINSTANCE.getESMFActionFieldGet();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_GET__FIELD = eINSTANCE.getESMFActionFieldGet_Field();

		/**
		 * The meta object literal for the '<em><b>Farray Ptr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FIELD_GET__FARRAY_PTR = eINSTANCE.getESMFActionFieldGet_FarrayPtr();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetBoundsImpl <em>Action Field Get Bounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetBoundsImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldGetBounds()
		 * @generated
		 */
		EClass ESMF_ACTION_FIELD_GET_BOUNDS = eINSTANCE.getESMFActionFieldGetBounds();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_GET_BOUNDS__FIELD = eINSTANCE.getESMFActionFieldGetBounds_Field();

		/**
		 * The meta object literal for the '<em><b>Exclusive LBound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_LBOUND = eINSTANCE.getESMFActionFieldGetBounds_ExclusiveLBound();

		/**
		 * The meta object literal for the '<em><b>Exclusive UBound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_UBOUND = eINSTANCE.getESMFActionFieldGetBounds_ExclusiveUBound();

		/**
		 * The meta object literal for the '<em><b>Computational LBound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_LBOUND = eINSTANCE.getESMFActionFieldGetBounds_ComputationalLBound();

		/**
		 * The meta object literal for the '<em><b>Computational UBound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_UBOUND = eINSTANCE.getESMFActionFieldGetBounds_ComputationalUBound();

		/**
		 * The meta object literal for the '<em><b>Total LBound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_LBOUND = eINSTANCE.getESMFActionFieldGetBounds_TotalLBound();

		/**
		 * The meta object literal for the '<em><b>Total UBound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_UBOUND = eINSTANCE.getESMFActionFieldGetBounds_TotalUBound();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloStoreImpl <em>Action Field Halo Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloStoreImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldHaloStore()
		 * @generated
		 */
		EClass ESMF_ACTION_FIELD_HALO_STORE = eINSTANCE.getESMFActionFieldHaloStore();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_HALO_STORE__FIELD = eINSTANCE.getESMFActionFieldHaloStore_Field();

		/**
		 * The meta object literal for the '<em><b>Route Handle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_HALO_STORE__ROUTE_HANDLE = eINSTANCE.getESMFActionFieldHaloStore_RouteHandle();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloImpl <em>Action Field Halo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldHalo()
		 * @generated
		 */
		EClass ESMF_ACTION_FIELD_HALO = eINSTANCE.getESMFActionFieldHalo();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_HALO__FIELD = eINSTANCE.getESMFActionFieldHalo_Field();

		/**
		 * The meta object literal for the '<em><b>Route Handle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_HALO__ROUTE_HANDLE = eINSTANCE.getESMFActionFieldHalo_RouteHandle();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloReleaseImpl <em>Action Field Halo Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloReleaseImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldHaloRelease()
		 * @generated
		 */
		EClass ESMF_ACTION_FIELD_HALO_RELEASE = eINSTANCE.getESMFActionFieldHaloRelease();

		/**
		 * The meta object literal for the '<em><b>Route Handle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_HALO_RELEASE__ROUTE_HANDLE = eINSTANCE.getESMFActionFieldHaloRelease_RouteHandle();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistStoreImpl <em>Action Field Redist Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistStoreImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldRedistStore()
		 * @generated
		 */
		EClass ESMF_ACTION_FIELD_REDIST_STORE = eINSTANCE.getESMFActionFieldRedistStore();

		/**
		 * The meta object literal for the '<em><b>Src Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_REDIST_STORE__SRC_FIELD = eINSTANCE.getESMFActionFieldRedistStore_SrcField();

		/**
		 * The meta object literal for the '<em><b>Dst Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_REDIST_STORE__DST_FIELD = eINSTANCE.getESMFActionFieldRedistStore_DstField();

		/**
		 * The meta object literal for the '<em><b>Route Handle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_REDIST_STORE__ROUTE_HANDLE = eINSTANCE.getESMFActionFieldRedistStore_RouteHandle();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistImpl <em>Action Field Redist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldRedist()
		 * @generated
		 */
		EClass ESMF_ACTION_FIELD_REDIST = eINSTANCE.getESMFActionFieldRedist();

		/**
		 * The meta object literal for the '<em><b>Src Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_REDIST__SRC_FIELD = eINSTANCE.getESMFActionFieldRedist_SrcField();

		/**
		 * The meta object literal for the '<em><b>Dst Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_REDIST__DST_FIELD = eINSTANCE.getESMFActionFieldRedist_DstField();

		/**
		 * The meta object literal for the '<em><b>Route Handle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_REDIST__ROUTE_HANDLE = eINSTANCE.getESMFActionFieldRedist_RouteHandle();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistReleaseImpl <em>Action Field Redist Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistReleaseImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFieldRedistRelease()
		 * @generated
		 */
		EClass ESMF_ACTION_FIELD_REDIST_RELEASE = eINSTANCE.getESMFActionFieldRedistRelease();

		/**
		 * The meta object literal for the '<em><b>Route Handle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_FIELD_REDIST_RELEASE__ROUTE_HANDLE = eINSTANCE.getESMFActionFieldRedistRelease_RouteHandle();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFrameworkInitImpl <em>Action Framework Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFrameworkInitImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFrameworkInit()
		 * @generated
		 */
		EClass ESMF_ACTION_FRAMEWORK_INIT = eINSTANCE.getESMFActionFrameworkInit();

		/**
		 * The meta object literal for the '<em><b>Default Cal Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_FRAMEWORK_INIT__DEFAULT_CAL_KIND = eINSTANCE.getESMFActionFrameworkInit_DefaultCalKind();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFrameworkFinalizeImpl <em>Action Framework Finalize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionFrameworkFinalizeImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionFrameworkFinalize()
		 * @generated
		 */
		EClass ESMF_ACTION_FRAMEWORK_FINALIZE = eINSTANCE.getESMFActionFrameworkFinalize();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCreateImpl <em>Action Grid Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCreateImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridCreate()
		 * @generated
		 */
		EClass ESMF_ACTION_GRID_CREATE = eINSTANCE.getESMFActionGridCreate();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_CREATE__GRID = eINSTANCE.getESMFActionGridCreate_Grid();

		/**
		 * The meta object literal for the '<em><b>Dist Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_CREATE__DIST_GRID = eINSTANCE.getESMFActionGridCreate_DistGrid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_CREATE__NAME = eINSTANCE.getESMFActionGridCreate_Name();

		/**
		 * The meta object literal for the '<em><b>Indexflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_CREATE__INDEXFLAG = eINSTANCE.getESMFActionGridCreate_Indexflag();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetImpl <em>Action Grid Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridGet()
		 * @generated
		 */
		EClass ESMF_ACTION_GRID_GET = eINSTANCE.getESMFActionGridGet();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_GET__GRID = eINSTANCE.getESMFActionGridGet_Grid();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDeImpl <em>Action Grid Get PLocal De</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDeImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridGetPLocalDe()
		 * @generated
		 */
		EClass ESMF_ACTION_GRID_GET_PLOCAL_DE = eINSTANCE.getESMFActionGridGetPLocalDe();

		/**
		 * The meta object literal for the '<em><b>Local DE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_GET_PLOCAL_DE__LOCAL_DE = eINSTANCE.getESMFActionGridGetPLocalDe_LocalDE();

		/**
		 * The meta object literal for the '<em><b>Is LBound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_LBOUND = eINSTANCE.getESMFActionGridGetPLocalDe_IsLBound();

		/**
		 * The meta object literal for the '<em><b>Is UBound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_UBOUND = eINSTANCE.getESMFActionGridGetPLocalDe_IsUBound();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDePSlocImpl <em>Action Grid Get PLocal De PSloc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDePSlocImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridGetPLocalDePSloc()
		 * @generated
		 */
		EClass ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC = eINSTANCE.getESMFActionGridGetPLocalDePSloc();

		/**
		 * The meta object literal for the '<em><b>Staggerloc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__STAGGERLOC = eINSTANCE.getESMFActionGridGetPLocalDePSloc_Staggerloc();

		/**
		 * The meta object literal for the '<em><b>Exclusive LBound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_LBOUND = eINSTANCE.getESMFActionGridGetPLocalDePSloc_ExclusiveLBound();

		/**
		 * The meta object literal for the '<em><b>Exclusive UBound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_UBOUND = eINSTANCE.getESMFActionGridGetPLocalDePSloc_ExclusiveUBound();

		/**
		 * The meta object literal for the '<em><b>Computational LBound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_LBOUND = eINSTANCE.getESMFActionGridGetPLocalDePSloc_ComputationalLBound();

		/**
		 * The meta object literal for the '<em><b>Computational UBound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_UBOUND = eINSTANCE.getESMFActionGridGetPLocalDePSloc_ComputationalUBound();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetCoordImpl <em>Action Grid Get Coord</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetCoordImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridGetCoord()
		 * @generated
		 */
		EClass ESMF_ACTION_GRID_GET_COORD = eINSTANCE.getESMFActionGridGetCoord();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_GET_COORD__GRID = eINSTANCE.getESMFActionGridGetCoord_Grid();

		/**
		 * The meta object literal for the '<em><b>Coord Dim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_GET_COORD__COORD_DIM = eINSTANCE.getESMFActionGridGetCoord_CoordDim();

		/**
		 * The meta object literal for the '<em><b>Farray Ptr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_GET_COORD__FARRAY_PTR = eINSTANCE.getESMFActionGridGetCoord_FarrayPtr();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompCreateImpl <em>Action Grid Comp Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompCreateImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridCompCreate()
		 * @generated
		 */
		EClass ESMF_ACTION_GRID_COMP_CREATE = eINSTANCE.getESMFActionGridCompCreate();

		/**
		 * The meta object literal for the '<em><b>Gridcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_CREATE__GRIDCOMP = eINSTANCE.getESMFActionGridCompCreate_Gridcomp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_COMP_CREATE__NAME = eINSTANCE.getESMFActionGridCompCreate_Name();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompInitializeImpl <em>Action Grid Comp Initialize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompInitializeImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridCompInitialize()
		 * @generated
		 */
		EClass ESMF_ACTION_GRID_COMP_INITIALIZE = eINSTANCE.getESMFActionGridCompInitialize();

		/**
		 * The meta object literal for the '<em><b>Gridcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_INITIALIZE__GRIDCOMP = eINSTANCE.getESMFActionGridCompInitialize_Gridcomp();

		/**
		 * The meta object literal for the '<em><b>Import State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_INITIALIZE__IMPORT_STATE = eINSTANCE.getESMFActionGridCompInitialize_ImportState();

		/**
		 * The meta object literal for the '<em><b>Export State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_INITIALIZE__EXPORT_STATE = eINSTANCE.getESMFActionGridCompInitialize_ExportState();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_INITIALIZE__CLOCK = eINSTANCE.getESMFActionGridCompInitialize_Clock();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_COMP_INITIALIZE__PHASE = eINSTANCE.getESMFActionGridCompInitialize_Phase();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompRunImpl <em>Action Grid Comp Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompRunImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridCompRun()
		 * @generated
		 */
		EClass ESMF_ACTION_GRID_COMP_RUN = eINSTANCE.getESMFActionGridCompRun();

		/**
		 * The meta object literal for the '<em><b>Gridcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_RUN__GRIDCOMP = eINSTANCE.getESMFActionGridCompRun_Gridcomp();

		/**
		 * The meta object literal for the '<em><b>Import State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_RUN__IMPORT_STATE = eINSTANCE.getESMFActionGridCompRun_ImportState();

		/**
		 * The meta object literal for the '<em><b>Export State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_RUN__EXPORT_STATE = eINSTANCE.getESMFActionGridCompRun_ExportState();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_RUN__CLOCK = eINSTANCE.getESMFActionGridCompRun_Clock();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_COMP_RUN__PHASE = eINSTANCE.getESMFActionGridCompRun_Phase();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompFinalizeImpl <em>Action Grid Comp Finalize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompFinalizeImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridCompFinalize()
		 * @generated
		 */
		EClass ESMF_ACTION_GRID_COMP_FINALIZE = eINSTANCE.getESMFActionGridCompFinalize();

		/**
		 * The meta object literal for the '<em><b>Gridcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_FINALIZE__GRIDCOMP = eINSTANCE.getESMFActionGridCompFinalize_Gridcomp();

		/**
		 * The meta object literal for the '<em><b>Import State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_FINALIZE__IMPORT_STATE = eINSTANCE.getESMFActionGridCompFinalize_ImportState();

		/**
		 * The meta object literal for the '<em><b>Export State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_FINALIZE__EXPORT_STATE = eINSTANCE.getESMFActionGridCompFinalize_ExportState();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_FINALIZE__CLOCK = eINSTANCE.getESMFActionGridCompFinalize_Clock();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_COMP_FINALIZE__PHASE = eINSTANCE.getESMFActionGridCompFinalize_Phase();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompSetServicesImpl <em>Action Grid Comp Set Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCompSetServicesImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionGridCompSetServices()
		 * @generated
		 */
		EClass ESMF_ACTION_GRID_COMP_SET_SERVICES = eINSTANCE.getESMFActionGridCompSetServices();

		/**
		 * The meta object literal for the '<em><b>Gridcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_GRID_COMP_SET_SERVICES__GRIDCOMP = eINSTANCE.getESMFActionGridCompSetServices_Gridcomp();

		/**
		 * The meta object literal for the '<em><b>User Routine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_COMP_SET_SERVICES__USER_ROUTINE = eINSTANCE.getESMFActionGridCompSetServices_UserRoutine();

		/**
		 * The meta object literal for the '<em><b>User RC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_GRID_COMP_SET_SERVICES__USER_RC = eINSTANCE.getESMFActionGridCompSetServices_UserRC();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeImpl <em>Action Method Invoke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionMethodInvoke()
		 * @generated
		 */
		EClass ESMF_ACTION_METHOD_INVOKE = eINSTANCE.getESMFActionMethodInvoke();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_METHOD_INVOKE__METHOD = eINSTANCE.getESMFActionMethodInvoke_Method();

		/**
		 * The meta object literal for the '<em><b>Import State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_METHOD_INVOKE__IMPORT_STATE = eINSTANCE.getESMFActionMethodInvoke_ImportState();

		/**
		 * The meta object literal for the '<em><b>Export State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_METHOD_INVOKE__EXPORT_STATE = eINSTANCE.getESMFActionMethodInvoke_ExportState();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeSetImpl <em>Action Time Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeSetImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionTimeSet()
		 * @generated
		 */
		EClass ESMF_ACTION_TIME_SET = eINSTANCE.getESMFActionTimeSet();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_TIME_SET__TIME = eINSTANCE.getESMFActionTimeSet_Time();

		/**
		 * The meta object literal for the '<em><b>Yy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_SET__YY = eINSTANCE.getESMFActionTimeSet_Yy();

		/**
		 * The meta object literal for the '<em><b>Mm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_SET__MM = eINSTANCE.getESMFActionTimeSet_Mm();

		/**
		 * The meta object literal for the '<em><b>Dd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_SET__DD = eINSTANCE.getESMFActionTimeSet_Dd();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_SET__H = eINSTANCE.getESMFActionTimeSet_H();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_SET__M = eINSTANCE.getESMFActionTimeSet_M();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_SET__S = eINSTANCE.getESMFActionTimeSet_S();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeGetImpl <em>Action Time Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeGetImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionTimeGet()
		 * @generated
		 */
		EClass ESMF_ACTION_TIME_GET = eINSTANCE.getESMFActionTimeGet();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_TIME_GET__TIME = eINSTANCE.getESMFActionTimeGet_Time();

		/**
		 * The meta object literal for the '<em><b>Yy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_GET__YY = eINSTANCE.getESMFActionTimeGet_Yy();

		/**
		 * The meta object literal for the '<em><b>Mm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_GET__MM = eINSTANCE.getESMFActionTimeGet_Mm();

		/**
		 * The meta object literal for the '<em><b>Dd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_GET__DD = eINSTANCE.getESMFActionTimeGet_Dd();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_GET__H = eINSTANCE.getESMFActionTimeGet_H();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_GET__M = eINSTANCE.getESMFActionTimeGet_M();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_GET__S = eINSTANCE.getESMFActionTimeGet_S();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeIntervalSetImpl <em>Action Time Interval Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeIntervalSetImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionTimeIntervalSet()
		 * @generated
		 */
		EClass ESMF_ACTION_TIME_INTERVAL_SET = eINSTANCE.getESMFActionTimeIntervalSet();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_TIME_INTERVAL_SET__TIME_INTERVAL = eINSTANCE.getESMFActionTimeIntervalSet_TimeInterval();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_INTERVAL_SET__H = eINSTANCE.getESMFActionTimeIntervalSet_H();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_INTERVAL_SET__M = eINSTANCE.getESMFActionTimeIntervalSet_M();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_INTERVAL_SET__S = eINSTANCE.getESMFActionTimeIntervalSet_S();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeIntervalGetImpl <em>Action Time Interval Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeIntervalGetImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionTimeIntervalGet()
		 * @generated
		 */
		EClass ESMF_ACTION_TIME_INTERVAL_GET = eINSTANCE.getESMFActionTimeIntervalGet();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_ACTION_TIME_INTERVAL_GET__TIME_INTERVAL = eINSTANCE.getESMFActionTimeIntervalGet_TimeInterval();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_INTERVAL_GET__H = eINSTANCE.getESMFActionTimeIntervalGet_H();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_INTERVAL_GET__M = eINSTANCE.getESMFActionTimeIntervalGet_M();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_TIME_INTERVAL_GET__S = eINSTANCE.getESMFActionTimeIntervalGet_S();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionUserServiceInvokeImpl <em>Action User Service Invoke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFActionUserServiceInvokeImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFActionUserServiceInvoke()
		 * @generated
		 */
		EClass ESMF_ACTION_USER_SERVICE_INVOKE = eINSTANCE.getESMFActionUserServiceInvoke();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_USER_SERVICE_INVOKE__DECLARATION = eINSTANCE.getESMFActionUserServiceInvoke_Declaration();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_ACTION_USER_SERVICE_INVOKE__EXECUTION = eINSTANCE.getESMFActionUserServiceInvoke_Execution();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCall()
		 * @generated
		 */
		EClass ESMF_CALL = eINSTANCE.getESMFCall();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallGridCompCreateImpl <em>Call Grid Comp Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallGridCompCreateImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallGridCompCreate()
		 * @generated
		 */
		EClass ESMF_CALL_GRID_COMP_CREATE = eINSTANCE.getESMFCallGridCompCreate();

		/**
		 * The meta object literal for the '<em><b>Gridcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_CALL_GRID_COMP_CREATE__GRIDCOMP = eINSTANCE.getESMFCallGridCompCreate_Gridcomp();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallGridCompInitializeImpl <em>Call Grid Comp Initialize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallGridCompInitializeImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallGridCompInitialize()
		 * @generated
		 */
		EClass ESMF_CALL_GRID_COMP_INITIALIZE = eINSTANCE.getESMFCallGridCompInitialize();

		/**
		 * The meta object literal for the '<em><b>Gridcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_CALL_GRID_COMP_INITIALIZE__GRIDCOMP = eINSTANCE.getESMFCallGridCompInitialize_Gridcomp();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallGridCompSetServicesImpl <em>Call Grid Comp Set Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallGridCompSetServicesImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallGridCompSetServices()
		 * @generated
		 */
		EClass ESMF_CALL_GRID_COMP_SET_SERVICES = eINSTANCE.getESMFCallGridCompSetServices();

		/**
		 * The meta object literal for the '<em><b>Gridcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_CALL_GRID_COMP_SET_SERVICES__GRIDCOMP = eINSTANCE.getESMFCallGridCompSetServices_Gridcomp();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallCplCompCreateImpl <em>Call Cpl Comp Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallCplCompCreateImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallCplCompCreate()
		 * @generated
		 */
		EClass ESMF_CALL_CPL_COMP_CREATE = eINSTANCE.getESMFCallCplCompCreate();

		/**
		 * The meta object literal for the '<em><b>Cplcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_CALL_CPL_COMP_CREATE__CPLCOMP = eINSTANCE.getESMFCallCplCompCreate_Cplcomp();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallCplCompInitializeImpl <em>Call Cpl Comp Initialize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallCplCompInitializeImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallCplCompInitialize()
		 * @generated
		 */
		EClass ESMF_CALL_CPL_COMP_INITIALIZE = eINSTANCE.getESMFCallCplCompInitialize();

		/**
		 * The meta object literal for the '<em><b>Cplcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_CALL_CPL_COMP_INITIALIZE__CPLCOMP = eINSTANCE.getESMFCallCplCompInitialize_Cplcomp();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallCplCompSetServicesImpl <em>Call Cpl Comp Set Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallCplCompSetServicesImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallCplCompSetServices()
		 * @generated
		 */
		EClass ESMF_CALL_CPL_COMP_SET_SERVICES = eINSTANCE.getESMFCallCplCompSetServices();

		/**
		 * The meta object literal for the '<em><b>Cplcomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_CALL_CPL_COMP_SET_SERVICES__CPLCOMP = eINSTANCE.getESMFCallCplCompSetServices_Cplcomp();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallFieldCreateSIDLImpl <em>Call Field Create SIDL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallFieldCreateSIDLImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallFieldCreateSIDL()
		 * @generated
		 */
		EClass ESMF_CALL_FIELD_CREATE_SIDL = eINSTANCE.getESMFCallFieldCreateSIDL();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_CALL_FIELD_CREATE_SIDL__ARGUMENT = eINSTANCE.getESMFCallFieldCreateSIDL_Argument();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallSIDLMethodImpl <em>Call SIDL Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFCallSIDLMethodImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCallSIDLMethod()
		 * @generated
		 */
		EClass ESMF_CALL_SIDL_METHOD = eINSTANCE.getESMFCallSIDLMethod();

		/**
		 * The meta object literal for the '<em><b>SIDL Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESMF_CALL_SIDL_METHOD__SIDL_METHOD = eINSTANCE.getESMFCallSIDLMethod_SIDLMethod();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.impl.ESMFNamedEntityImpl <em>Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFNamedEntityImpl
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFNamedEntity()
		 * @generated
		 */
		EClass ESMF_NAMED_ENTITY = eINSTANCE.getESMFNamedEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESMF_NAMED_ENTITY__NAME = eINSTANCE.getESMFNamedEntity_Name();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.ESMFCalKind <em>Cal Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.ESMFCalKind
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFCalKind()
		 * @generated
		 */
		EEnum ESMF_CAL_KIND = eINSTANCE.getESMFCalKind();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc <em>Stagger Loc</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFStaggerLoc()
		 * @generated
		 */
		EEnum ESMF_STAGGER_LOC = eINSTANCE.getESMFStaggerLoc();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.ESMFTypeKind <em>Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.ESMFTypeKind
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFTypeKind()
		 * @generated
		 */
		EEnum ESMF_TYPE_KIND = eINSTANCE.getESMFTypeKind();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.esmf.ESMF_INDEX <em>ESMF INDEX</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.ESMF_INDEX
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMF_INDEX()
		 * @generated
		 */
		EEnum ESMF_INDEX = eINSTANCE.getESMF_INDEX();

		/**
		 * The meta object literal for the '<em>EInt Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getEIntArray()
		 * @generated
		 */
		EDataType EINT_ARRAY = eINSTANCE.getEIntArray();

		/**
		 * The meta object literal for the '<em>User Token</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.earthsystemcurator.cupid.esmf.impl.ESMFPackageImpl#getESMFUserToken()
		 * @generated
		 */
		EDataType ESMF_USER_TOKEN = eINSTANCE.getESMFUserToken();

	}

} //ESMFPackage
