/**
 */
package org.earthsystemmodeling.cupid.NUOPC;

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
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCFactory
 * @model kind="package"
 * @generated
 */
public interface NUOPCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "NUOPC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.earthsystemcog.org/projects/nuopc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nuopc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NUOPCPackage eINSTANCE = org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.ComponentImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>IPD Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IPD_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Advance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ADVANCE = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.BaseModelImpl <em>Base Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.BaseModelImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getBaseModel()
	 * @generated
	 */
	int BASE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>IPD Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL__IPD_VERSION = COMPONENT__IPD_VERSION;

	/**
	 * The feature id for the '<em><b>Advance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL__ADVANCE = COMPONENT__ADVANCE;

	/**
	 * The feature id for the '<em><b>Grids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL__GRIDS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL__IMPORT_FIELDS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Export Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL__EXPORT_FIELDS = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Base Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Base Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.DriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.DriverImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getDriver()
	 * @generated
	 */
	int DRIVER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>IPD Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__IPD_VERSION = COMPONENT__IPD_VERSION;

	/**
	 * The feature id for the '<em><b>Advance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__ADVANCE = COMPONENT__ADVANCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__CHILDREN = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Run Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__RUN_SEQUENCE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.ModelImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = BASE_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>IPD Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IPD_VERSION = BASE_MODEL__IPD_VERSION;

	/**
	 * The feature id for the '<em><b>Advance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ADVANCE = BASE_MODEL__ADVANCE;

	/**
	 * The feature id for the '<em><b>Grids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GRIDS = BASE_MODEL__GRIDS;

	/**
	 * The feature id for the '<em><b>Import Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IMPORT_FIELDS = BASE_MODEL__IMPORT_FIELDS;

	/**
	 * The feature id for the '<em><b>Export Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EXPORT_FIELDS = BASE_MODEL__EXPORT_FIELDS;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = BASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = BASE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.MediatorImpl <em>Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.MediatorImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getMediator()
	 * @generated
	 */
	int MEDIATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__NAME = BASE_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>IPD Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__IPD_VERSION = BASE_MODEL__IPD_VERSION;

	/**
	 * The feature id for the '<em><b>Advance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__ADVANCE = BASE_MODEL__ADVANCE;

	/**
	 * The feature id for the '<em><b>Grids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__GRIDS = BASE_MODEL__GRIDS;

	/**
	 * The feature id for the '<em><b>Import Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__IMPORT_FIELDS = BASE_MODEL__IMPORT_FIELDS;

	/**
	 * The feature id for the '<em><b>Export Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__EXPORT_FIELDS = BASE_MODEL__EXPORT_FIELDS;

	/**
	 * The number of structural features of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_FEATURE_COUNT = BASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_OPERATION_COUNT = BASE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.ConnectorImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>IPD Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IPD_VERSION = COMPONENT__IPD_VERSION;

	/**
	 * The feature id for the '<em><b>Advance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ADVANCE = COMPONENT__ADVANCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DESTINATION = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.ApplicationImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CHILDREN = 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___GET_ALL_CHILDREN = 0;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.FieldImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Imported By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IMPORTED_BY = 1;

	/**
	 * The feature id for the '<em><b>Exported By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__EXPORTED_BY = 2;

	/**
	 * The feature id for the '<em><b>Import</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__EXPORT = 4;

	/**
	 * The feature id for the '<em><b>Standard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__STANDARD_NAME = 5;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__GRID = 6;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.GridImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__NAME = 0;

	/**
	 * The feature id for the '<em><b>Min Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__MIN_INDEX = 1;

	/**
	 * The feature id for the '<em><b>Max Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__MAX_INDEX = 2;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.UniformGridImpl <em>Uniform Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.UniformGridImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getUniformGrid()
	 * @generated
	 */
	int UNIFORM_GRID = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_GRID__NAME = GRID__NAME;

	/**
	 * The feature id for the '<em><b>Min Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_GRID__MIN_INDEX = GRID__MIN_INDEX;

	/**
	 * The feature id for the '<em><b>Max Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_GRID__MAX_INDEX = GRID__MAX_INDEX;

	/**
	 * The feature id for the '<em><b>Min Corner Coord</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_GRID__MIN_CORNER_COORD = GRID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Corner Coord</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_GRID__MAX_CORNER_COORD = GRID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stagger Loc To Fill Coords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_GRID__STAGGER_LOC_TO_FILL_COORDS = GRID_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Uniform Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_GRID_FEATURE_COUNT = GRID_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Uniform Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_GRID_OPERATION_COUNT = GRID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.SpecializationImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 10;

	/**
	 * The feature id for the '<em><b>Phase Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__PHASE_LABEL = 0;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.AdvanceImpl <em>Advance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.AdvanceImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getAdvance()
	 * @generated
	 */
	int ADVANCE = 11;

	/**
	 * The feature id for the '<em><b>Phase Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE__PHASE_LABEL = SPECIALIZATION__PHASE_LABEL;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE__COMPONENT = SPECIALIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Advance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_FEATURE_COUNT = SPECIALIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Advance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_OPERATION_COUNT = SPECIALIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.IPDVersion <em>IPD Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.IPDVersion
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getIPDVersion()
	 * @generated
	 */
	int IPD_VERSION = 12;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.ESMF_STAGGERLOC <em>ESMF STAGGERLOC</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.ESMF_STAGGERLOC
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getESMF_STAGGERLOC()
	 * @generated
	 */
	int ESMF_STAGGERLOC = 13;

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemmodeling.cupid.NUOPC.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemmodeling.cupid.NUOPC.Component#getIPDVersion <em>IPD Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IPD Version</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Component#getIPDVersion()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_IPDVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.cupid.NUOPC.Component#getAdvance <em>Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advance</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Component#getAdvance()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Advance();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.BaseModel <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Model</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.BaseModel
	 * @generated
	 */
	EClass getBaseModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.cupid.NUOPC.BaseModel#getGrids <em>Grids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grids</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.BaseModel#getGrids()
	 * @see #getBaseModel()
	 * @generated
	 */
	EReference getBaseModel_Grids();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.cupid.NUOPC.BaseModel#getImportFields <em>Import Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import Fields</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.BaseModel#getImportFields()
	 * @see #getBaseModel()
	 * @generated
	 */
	EReference getBaseModel_ImportFields();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.cupid.NUOPC.BaseModel#getExportFields <em>Export Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Export Fields</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.BaseModel#getExportFields()
	 * @see #getBaseModel()
	 * @generated
	 */
	EReference getBaseModel_ExportFields();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Driver
	 * @generated
	 */
	EClass getDriver();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.cupid.NUOPC.Driver#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Driver#getChildren()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.earthsystemmodeling.cupid.NUOPC.Driver#getRunSequence <em>Run Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Run Sequence</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Driver#getRunSequence()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_RunSequence();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.Mediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Mediator
	 * @generated
	 */
	EClass getMediator();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemmodeling.cupid.NUOPC.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Connector#getSource()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemmodeling.cupid.NUOPC.Connector#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Connector#getDestination()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Destination();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemmodeling.cupid.NUOPC.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.cupid.NUOPC.Application#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Application#getChildren()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Children();

	/**
	 * Returns the meta object for the '{@link org.earthsystemmodeling.cupid.NUOPC.Application#getAllChildren() <em>Get All Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Children</em>' operation.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Application#getAllChildren()
	 * @generated
	 */
	EOperation getApplication__GetAllChildren();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemmodeling.cupid.NUOPC.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemmodeling.cupid.NUOPC.Field#getImportedBy <em>Imported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Imported By</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Field#getImportedBy()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_ImportedBy();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemmodeling.cupid.NUOPC.Field#getExportedBy <em>Exported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Exported By</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Field#getExportedBy()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_ExportedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemmodeling.cupid.NUOPC.Field#isImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Field#isImport()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Import();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemmodeling.cupid.NUOPC.Field#isExport <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Export</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Field#isExport()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Export();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemmodeling.cupid.NUOPC.Field#getStandardName <em>Standard Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Name</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Field#getStandardName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_StandardName();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemmodeling.cupid.NUOPC.Field#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grid</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Field#getGrid()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Grid();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemmodeling.cupid.NUOPC.Grid#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Grid#getName()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemmodeling.cupid.NUOPC.Grid#getMinIndex <em>Min Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Min Index</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Grid#getMinIndex()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_MinIndex();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemmodeling.cupid.NUOPC.Grid#getMaxIndex <em>Max Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Max Index</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Grid#getMaxIndex()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_MaxIndex();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.UniformGrid <em>Uniform Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform Grid</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.UniformGrid
	 * @generated
	 */
	EClass getUniformGrid();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemmodeling.cupid.NUOPC.UniformGrid#getMinCornerCoord <em>Min Corner Coord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Min Corner Coord</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.UniformGrid#getMinCornerCoord()
	 * @see #getUniformGrid()
	 * @generated
	 */
	EAttribute getUniformGrid_MinCornerCoord();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemmodeling.cupid.NUOPC.UniformGrid#getMaxCornerCoord <em>Max Corner Coord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Max Corner Coord</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.UniformGrid#getMaxCornerCoord()
	 * @see #getUniformGrid()
	 * @generated
	 */
	EAttribute getUniformGrid_MaxCornerCoord();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemmodeling.cupid.NUOPC.UniformGrid#getStaggerLocToFillCoords <em>Stagger Loc To Fill Coords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stagger Loc To Fill Coords</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.UniformGrid#getStaggerLocToFillCoords()
	 * @see #getUniformGrid()
	 * @generated
	 */
	EAttribute getUniformGrid_StaggerLocToFillCoords();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemmodeling.cupid.NUOPC.Specialization#getPhaseLabel <em>Phase Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Label</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Specialization#getPhaseLabel()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_PhaseLabel();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.Advance <em>Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Advance
	 * @generated
	 */
	EClass getAdvance();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemmodeling.cupid.NUOPC.Advance#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.Advance#getComponent()
	 * @see #getAdvance()
	 * @generated
	 */
	EReference getAdvance_Component();

	/**
	 * Returns the meta object for enum '{@link org.earthsystemmodeling.cupid.NUOPC.IPDVersion <em>IPD Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IPD Version</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.IPDVersion
	 * @generated
	 */
	EEnum getIPDVersion();

	/**
	 * Returns the meta object for enum '{@link org.earthsystemmodeling.cupid.NUOPC.ESMF_STAGGERLOC <em>ESMF STAGGERLOC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESMF STAGGERLOC</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.ESMF_STAGGERLOC
	 * @generated
	 */
	EEnum getESMF_STAGGERLOC();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NUOPCFactory getNUOPCFactory();

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
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.ComponentImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>IPD Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__IPD_VERSION = eINSTANCE.getComponent_IPDVersion();

		/**
		 * The meta object literal for the '<em><b>Advance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ADVANCE = eINSTANCE.getComponent_Advance();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.BaseModelImpl <em>Base Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.BaseModelImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getBaseModel()
		 * @generated
		 */
		EClass BASE_MODEL = eINSTANCE.getBaseModel();

		/**
		 * The meta object literal for the '<em><b>Grids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_MODEL__GRIDS = eINSTANCE.getBaseModel_Grids();

		/**
		 * The meta object literal for the '<em><b>Import Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_MODEL__IMPORT_FIELDS = eINSTANCE.getBaseModel_ImportFields();

		/**
		 * The meta object literal for the '<em><b>Export Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_MODEL__EXPORT_FIELDS = eINSTANCE.getBaseModel_ExportFields();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.DriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.DriverImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getDriver()
		 * @generated
		 */
		EClass DRIVER = eINSTANCE.getDriver();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER__CHILDREN = eINSTANCE.getDriver_Children();

		/**
		 * The meta object literal for the '<em><b>Run Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER__RUN_SEQUENCE = eINSTANCE.getDriver_RunSequence();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.ModelImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.MediatorImpl <em>Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.MediatorImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getMediator()
		 * @generated
		 */
		EClass MEDIATOR = eINSTANCE.getMediator();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.ConnectorImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE = eINSTANCE.getConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__DESTINATION = eINSTANCE.getConnector_Destination();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.ApplicationImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CHILDREN = eINSTANCE.getApplication_Children();

		/**
		 * The meta object literal for the '<em><b>Get All Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___GET_ALL_CHILDREN = eINSTANCE.getApplication__GetAllChildren();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.FieldImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Imported By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__IMPORTED_BY = eINSTANCE.getField_ImportedBy();

		/**
		 * The meta object literal for the '<em><b>Exported By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__EXPORTED_BY = eINSTANCE.getField_ExportedBy();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IMPORT = eINSTANCE.getField_Import();

		/**
		 * The meta object literal for the '<em><b>Export</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__EXPORT = eINSTANCE.getField_Export();

		/**
		 * The meta object literal for the '<em><b>Standard Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__STANDARD_NAME = eINSTANCE.getField_StandardName();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__GRID = eINSTANCE.getField_Grid();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.GridImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__NAME = eINSTANCE.getGrid_Name();

		/**
		 * The meta object literal for the '<em><b>Min Index</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__MIN_INDEX = eINSTANCE.getGrid_MinIndex();

		/**
		 * The meta object literal for the '<em><b>Max Index</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__MAX_INDEX = eINSTANCE.getGrid_MaxIndex();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.UniformGridImpl <em>Uniform Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.UniformGridImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getUniformGrid()
		 * @generated
		 */
		EClass UNIFORM_GRID = eINSTANCE.getUniformGrid();

		/**
		 * The meta object literal for the '<em><b>Min Corner Coord</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_GRID__MIN_CORNER_COORD = eINSTANCE.getUniformGrid_MinCornerCoord();

		/**
		 * The meta object literal for the '<em><b>Max Corner Coord</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_GRID__MAX_CORNER_COORD = eINSTANCE.getUniformGrid_MaxCornerCoord();

		/**
		 * The meta object literal for the '<em><b>Stagger Loc To Fill Coords</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_GRID__STAGGER_LOC_TO_FILL_COORDS = eINSTANCE.getUniformGrid_StaggerLocToFillCoords();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.SpecializationImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Phase Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__PHASE_LABEL = eINSTANCE.getSpecialization_PhaseLabel();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.AdvanceImpl <em>Advance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.AdvanceImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getAdvance()
		 * @generated
		 */
		EClass ADVANCE = eINSTANCE.getAdvance();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVANCE__COMPONENT = eINSTANCE.getAdvance_Component();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.IPDVersion <em>IPD Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.IPDVersion
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getIPDVersion()
		 * @generated
		 */
		EEnum IPD_VERSION = eINSTANCE.getIPDVersion();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.ESMF_STAGGERLOC <em>ESMF STAGGERLOC</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.ESMF_STAGGERLOC
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getESMF_STAGGERLOC()
		 * @generated
		 */
		EEnum ESMF_STAGGERLOC = eINSTANCE.getESMF_STAGGERLOC();

	}

} //NUOPCPackage
