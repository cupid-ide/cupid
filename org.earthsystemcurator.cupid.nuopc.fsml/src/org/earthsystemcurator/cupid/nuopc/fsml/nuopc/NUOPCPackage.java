/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface NUOPCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nuopc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.earthsystemcurator.org/nuopc";

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
	NUOPCPackage eINSTANCE = org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModelImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel()
	 * @generated
	 */
	int NUOPC_MODEL = 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__GenericImportsImpl <em>Model Generic Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__GenericImportsImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__GenericImports()
	 * @generated
	 */
	int NUOPC_MODEL_GENERIC_IMPORTS = 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__InitImpl <em>Model Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__InitImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__Init()
	 * @generated
	 */
	int NUOPC_MODEL_INIT = 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsSetServicesImpl <em>Model Implements Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsSetServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__ImplementsSetServices()
	 * @generated
	 */
	int NUOPC_MODEL_IMPLEMENTS_SET_SERVICES = 5;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsInitP1Impl <em>Model Implements Init P1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsInitP1Impl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__ImplementsInitP1()
	 * @generated
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P1 = 6;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsInitP2Impl <em>Model Implements Init P2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsInitP2Impl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__ImplementsInitP2()
	 * @generated
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P2 = 7;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__AdvertisesImportFieldImpl <em>Model Advertises Import Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__AdvertisesImportFieldImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__AdvertisesImportField()
	 * @generated
	 */
	int NUOPC_MODEL_ADVERTISES_IMPORT_FIELD = 8;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__AdvertisesExportFieldImpl <em>Model Advertises Export Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__AdvertisesExportFieldImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__AdvertisesExportField()
	 * @generated
	 */
	int NUOPC_MODEL_ADVERTISES_EXPORT_FIELD = 9;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__RealizesImportFieldImpl <em>Model Realizes Import Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__RealizesImportFieldImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__RealizesImportField()
	 * @generated
	 */
	int NUOPC_MODEL_REALIZES_IMPORT_FIELD = 10;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__RealizesExportFieldImpl <em>Model Realizes Export Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__RealizesExportFieldImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__RealizesExportField()
	 * @generated
	 */
	int NUOPC_MODEL_REALIZES_EXPORT_FIELD = 11;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ModelAdvanceImpl <em>Model Model Advance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ModelAdvanceImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__ModelAdvance()
	 * @generated
	 */
	int NUOPC_MODEL_MODEL_ADVANCE = 12;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.CallsGenericSetServicesImpl <em>Calls Generic Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.CallsGenericSetServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getCallsGenericSetServices()
	 * @generated
	 */
	int CALLS_GENERIC_SET_SERVICES = 29;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.CallsSetEntryPointImpl <em>Calls Set Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.CallsSetEntryPointImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getCallsSetEntryPoint()
	 * @generated
	 */
	int CALLS_SET_ENTRY_POINT = 30;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver()
	 * @generated
	 */
	int NUOPC_DRIVER = 13;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__GenericImportsImpl <em>Driver Generic Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__GenericImportsImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__GenericImports()
	 * @generated
	 */
	int NUOPC_DRIVER_GENERIC_IMPORTS = 14;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ModelImportsImpl <em>Driver Model Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ModelImportsImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ModelImports()
	 * @generated
	 */
	int NUOPC_DRIVER_MODEL_IMPORTS = 15;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ModelImports__ModelImportImpl <em>Driver Model Imports Model Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ModelImports__ModelImportImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ModelImports__ModelImport()
	 * @generated
	 */
	int NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT = 16;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ConnectorImportsImpl <em>Driver Connector Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ConnectorImportsImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ConnectorImports()
	 * @generated
	 */
	int NUOPC_DRIVER_CONNECTOR_IMPORTS = 17;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ConnectorImports__ConnectorImportImpl <em>Driver Connector Imports Connector Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ConnectorImports__ConnectorImportImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ConnectorImports__ConnectorImport()
	 * @generated
	 */
	int NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT = 18;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetServicesImpl <em>Driver Implements Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ImplementsSetServices()
	 * @generated
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES = 19;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesMethodImpl <em>Attaches Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesMethodImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getAttachesMethod()
	 * @generated
	 */
	int ATTACHES_METHOD = 31;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelCountImpl <em>Driver Implements Set Model Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelCountImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ImplementsSetModelCount()
	 * @generated
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT = 20;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelServicesImpl <em>Driver Implements Set Model Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ImplementsSetModelServices()
	 * @generated
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES = 21;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.SetModelServicesImpl <em>Set Model Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.SetModelServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getSetModelServices()
	 * @generated
	 */
	int SET_MODEL_SERVICES = 32;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.SetCouplerServicesImpl <em>Set Coupler Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.SetCouplerServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getSetCouplerServices()
	 * @generated
	 */
	int SET_COUPLER_SERVICES = 33;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.GetsInternalStateImpl <em>Gets Internal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.GetsInternalStateImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getGetsInternalState()
	 * @generated
	 */
	int GETS_INTERNAL_STATE = 34;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCApplicationImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCApplication()
	 * @generated
	 */
	int NUOPC_APPLICATION = 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.TopImpl <em>Top</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.TopImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getTop()
	 * @generated
	 */
	int TOP = 0;

	/**
	 * The feature id for the '<em><b>Apps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP__APPS = 0;

	/**
	 * The number of structural features of the '<em>Top</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Top</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nuopc Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION__NUOPC_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Nuopc Driver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION__NUOPC_DRIVER = 2;

	/**
	 * The feature id for the '<em><b>Nuopc Driver Atm Ocn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION__NUOPC_DRIVER_ATM_OCN = 3;

	/**
	 * The feature id for the '<em><b>Nuopc Mediator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION__NUOPC_MEDIATOR = 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Generic Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL__GENERIC_IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Implements Set Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL__IMPLEMENTS_SET_SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Initialize</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL__INITIALIZE = 3;

	/**
	 * The feature id for the '<em><b>Implements Model Advance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Imports Generic SS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_GENERIC_SS = 0;

	/**
	 * The feature id for the '<em><b>Imports Label Model Advance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_LABEL_MODEL_ADVANCE = 1;

	/**
	 * The number of structural features of the '<em>Model Generic Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_GENERIC_IMPORTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Generic Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_GENERIC_IMPORTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_INIT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Implements Init P1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_INIT__IMPLEMENTS_INIT_P1 = 1;

	/**
	 * The feature id for the '<em><b>Implements Init P2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_INIT__IMPLEMENTS_INIT_P2 = 2;

	/**
	 * The number of structural features of the '<em>Model Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_INIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_INIT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Param gcomp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP = 2;

	/**
	 * The feature id for the '<em><b>Param rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARAM_RC = 3;

	/**
	 * The feature id for the '<em><b>Calls Generic Set Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Calls Set Entry Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT = 5;

	/**
	 * The feature id for the '<em><b>Attaches Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD = 6;

	/**
	 * The number of structural features of the '<em>Model Implements Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_SET_SERVICES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Model Implements Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_SET_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P1__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P1__NAME = 1;

	/**
	 * The feature id for the '<em><b>Import Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Export Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM = 3;

	/**
	 * The feature id for the '<em><b>Advertises Import Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Advertises Export Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Advertises At Least One Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Registered In Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES = 7;

	/**
	 * The feature id for the '<em><b>Advertises Or Registered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED = 8;

	/**
	 * The number of structural features of the '<em>Model Implements Init P1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P1_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Model Implements Init P1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P1_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P2__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P2__NAME = 1;

	/**
	 * The feature id for the '<em><b>Import Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P2__IMPORT_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Export Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P2__EXPORT_PARAM = 3;

	/**
	 * The feature id for the '<em><b>Realizes Import Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Realizes Export Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Realizes At Least One Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Registered In Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P2__REGISTERED_IN_SET_SERVICES = 7;

	/**
	 * The feature id for the '<em><b>Realizes Or Registered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_OR_REGISTERED = 8;

	/**
	 * The number of structural features of the '<em>Model Implements Init P2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P2_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Model Implements Init P2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_IMPLEMENTS_INIT_P2_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Adds To State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE = 1;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__RC = 2;

	/**
	 * The feature id for the '<em><b>Adds To Import State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE = 3;

	/**
	 * The feature id for the '<em><b>Standard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__STANDARD_NAME = 4;

	/**
	 * The number of structural features of the '<em>Model Advertises Import Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_IMPORT_FIELD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Model Advertises Import Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_IMPORT_FIELD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__RC = 1;

	/**
	 * The feature id for the '<em><b>Adds To State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE = 2;

	/**
	 * The feature id for the '<em><b>Adds To Export State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE = 3;

	/**
	 * The feature id for the '<em><b>Standard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__STANDARD_NAME = 4;

	/**
	 * The number of structural features of the '<em>Model Advertises Export Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_EXPORT_FIELD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Model Advertises Export Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_ADVERTISES_EXPORT_FIELD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_IMPORT_FIELD__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Realized In State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_IMPORT_FIELD__REALIZED_IN_STATE = 1;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_IMPORT_FIELD__RC = 2;

	/**
	 * The feature id for the '<em><b>Realized In Import State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_IMPORT_FIELD__REALIZED_IN_IMPORT_STATE = 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_IMPORT_FIELD__FIELD = 4;

	/**
	 * The number of structural features of the '<em>Model Realizes Import Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_IMPORT_FIELD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Model Realizes Import Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_IMPORT_FIELD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Realized In State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_STATE = 1;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_EXPORT_FIELD__RC = 2;

	/**
	 * The feature id for the '<em><b>Realized In Export State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE = 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_EXPORT_FIELD__FIELD = 4;

	/**
	 * The number of structural features of the '<em>Model Realizes Export Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_EXPORT_FIELD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Model Realizes Export Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_REALIZES_EXPORT_FIELD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_MODEL_ADVANCE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_MODEL_ADVANCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Attached Model Advance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_MODEL_ADVANCE__ATTACHED_MODEL_ADVANCE = 2;

	/**
	 * The number of structural features of the '<em>Model Model Advance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_MODEL_ADVANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model Model Advance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_MODEL_ADVANCE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Generic Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__GENERIC_IMPORTS = 2;

	/**
	 * The feature id for the '<em><b>Model Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__MODEL_IMPORTS = 3;

	/**
	 * The feature id for the '<em><b>Connector Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__CONNECTOR_IMPORTS = 4;

	/**
	 * The feature id for the '<em><b>Implements Set Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES = 5;

	/**
	 * The feature id for the '<em><b>Implements Set Model Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Implements Set Model Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_SERVICES = 7;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Imports Generic SS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_GENERIC_SS = 0;

	/**
	 * The feature id for the '<em><b>Imports Type Driver IS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS = 1;

	/**
	 * The feature id for the '<em><b>Imports Label Set Model Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Imports Label Set Model Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES = 3;

	/**
	 * The number of structural features of the '<em>Driver Generic Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_GENERIC_IMPORTS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Driver Generic Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_GENERIC_IMPORTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_MODEL_IMPORTS__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Model Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_MODEL_IMPORTS__MODEL_IMPORT = 1;

	/**
	 * The number of structural features of the '<em>Driver Model Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_MODEL_IMPORTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Driver Model Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_MODEL_IMPORTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT__SET_SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Model Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT__MODEL_REF = 3;

	/**
	 * The number of structural features of the '<em>Driver Model Imports Model Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Driver Model Imports Model Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Connector Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_CONNECTOR_IMPORTS__CONNECTOR_IMPORT = 1;

	/**
	 * The number of structural features of the '<em>Driver Connector Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_CONNECTOR_IMPORTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Driver Connector Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_CONNECTOR_IMPORTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__SET_SERVICES = 2;

	/**
	 * The number of structural features of the '<em>Driver Connector Imports Connector Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Driver Connector Imports Connector Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Param gcomp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP = 2;

	/**
	 * The feature id for the '<em><b>Param rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARAM_RC = 3;

	/**
	 * The feature id for the '<em><b>Calls Generic Set Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Attaches Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD = 5;

	/**
	 * The number of structural features of the '<em>Driver Implements Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Driver Implements Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Gcomp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GCOMP = 1;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__RC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Driver Internal State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__DRIVER_INTERNAL_STATE = 4;

	/**
	 * The feature id for the '<em><b>Gets Internal State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE = 5;

	/**
	 * The feature id for the '<em><b>Assigns Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__ASSIGNS_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Attached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__ATTACHED = 7;

	/**
	 * The number of structural features of the '<em>Driver Implements Set Model Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Driver Implements Set Model Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Gcomp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__GCOMP = 1;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__RC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__NAME = 3;

	/**
	 * The feature id for the '<em><b>Driver Internal State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__DRIVER_INTERNAL_STATE = 4;

	/**
	 * The feature id for the '<em><b>Gets Internal State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__GETS_INTERNAL_STATE = 5;

	/**
	 * The feature id for the '<em><b>Assigns Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__ASSIGNS_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Attached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__ATTACHED = 7;

	/**
	 * The feature id for the '<em><b>Set Model Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__SET_MODEL_SERVICES = 8;

	/**
	 * The feature id for the '<em><b>Set Coupler Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__SET_COUPLER_SERVICES = 9;

	/**
	 * The number of structural features of the '<em>Driver Implements Set Model Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Driver Implements Set Model Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl <em>Driver Atm Ocn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn()
	 * @generated
	 */
	int NUOPC_DRIVER_ATM_OCN = 22;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Generic Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS = 2;

	/**
	 * The feature id for the '<em><b>Model Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS = 3;

	/**
	 * The feature id for the '<em><b>Implements Set Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Implements Set Model Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Implements Set Model Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES = 6;

	/**
	 * The number of structural features of the '<em>Driver Atm Ocn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Driver Atm Ocn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__GenericImportsImpl <em>Driver Atm Ocn Generic Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__GenericImportsImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn__GenericImports()
	 * @generated
	 */
	int NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS = 23;

	/**
	 * The feature id for the '<em><b>Imports Generic SS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_GENERIC_SS = 0;

	/**
	 * The feature id for the '<em><b>Imports Type Driver IS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS = 1;

	/**
	 * The feature id for the '<em><b>Imports Label Set Model Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Imports Label Set Model Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES = 3;

	/**
	 * The number of structural features of the '<em>Driver Atm Ocn Generic Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Driver Atm Ocn Generic Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ModelImportsImpl <em>Driver Atm Ocn Model Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ModelImportsImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn__ModelImports()
	 * @generated
	 */
	int NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS = 24;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Model Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__MODEL_IMPORT = 1;

	/**
	 * The number of structural features of the '<em>Driver Atm Ocn Model Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Driver Atm Ocn Model Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetServicesImpl <em>Driver Atm Ocn Implements Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn__ImplementsSetServices()
	 * @generated
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES = 25;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Param gcomp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP = 2;

	/**
	 * The feature id for the '<em><b>Param rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_RC = 3;

	/**
	 * The feature id for the '<em><b>Calls Generic Set Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Attaches Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD = 5;

	/**
	 * The number of structural features of the '<em>Driver Atm Ocn Implements Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES_FEATURE_COUNT = 6;


	/**
	 * The number of operations of the '<em>Driver Atm Ocn Implements Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetModelCountImpl <em>Driver Atm Ocn Implements Set Model Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetModelCountImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn__ImplementsSetModelCount()
	 * @generated
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT = 26;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Gcomp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__GCOMP = 1;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__RC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Driver Internal State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__DRIVER_INTERNAL_STATE = 4;

	/**
	 * The feature id for the '<em><b>Gets Internal State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE = 5;

	/**
	 * The feature id for the '<em><b>Assigns Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__ASSIGNS_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Attached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__ATTACHED = 7;

	/**
	 * The number of structural features of the '<em>Driver Atm Ocn Implements Set Model Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Driver Atm Ocn Implements Set Model Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetModelServicesImpl <em>Driver Atm Ocn Implements Set Model Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetModelServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn__ImplementsSetModelServices()
	 * @generated
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES = 27;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Gcomp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__GCOMP = 1;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__RC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__NAME = 3;

	/**
	 * The feature id for the '<em><b>Driver Internal State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__DRIVER_INTERNAL_STATE = 4;

	/**
	 * The feature id for the '<em><b>Gets Internal State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__GETS_INTERNAL_STATE = 5;

	/**
	 * The feature id for the '<em><b>Assigns Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__ASSIGNS_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Attached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__ATTACHED = 7;

	/**
	 * The feature id for the '<em><b>Set Model Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__SET_MODEL_SERVICES = 8;

	/**
	 * The feature id for the '<em><b>Set Coupler Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__SET_COUPLER_SERVICES = 9;

	/**
	 * The number of structural features of the '<em>Driver Atm Ocn Implements Set Model Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Driver Atm Ocn Implements Set Model Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ModelImports__ModelImportImpl <em>Driver Atm Ocn Model Imports Model Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ModelImports__ModelImportImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn__ModelImports__ModelImport()
	 * @generated
	 */
	int NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT = 28;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT__SET_SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Model Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT__MODEL_REF = 3;

	/**
	 * The number of structural features of the '<em>Driver Atm Ocn Model Imports Model Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Driver Atm Ocn Model Imports Model Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Gcomp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_GENERIC_SET_SERVICES__GCOMP = 0;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_GENERIC_SET_SERVICES__RC = 1;

	/**
	 * The number of structural features of the '<em>Calls Generic Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_GENERIC_SET_SERVICES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Calls Generic Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_GENERIC_SET_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_SET_ENTRY_POINT__METHOD = 0;

	/**
	 * The feature id for the '<em><b>User Routine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_SET_ENTRY_POINT__USER_ROUTINE = 1;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_SET_ENTRY_POINT__PHASE = 2;

	/**
	 * The number of structural features of the '<em>Calls Set Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_SET_ENTRY_POINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Calls Set Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_SET_ENTRY_POINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>User Routine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_METHOD__USER_ROUTINE = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_METHOD__INDEX = 2;

	/**
	 * The number of structural features of the '<em>Attaches Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_METHOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attaches Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_METHOD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Model Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MODEL_SERVICES__MODEL_COMP = 0;

	/**
	 * The feature id for the '<em><b>Subroutine Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MODEL_SERVICES__SUBROUTINE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Set Model Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MODEL_SERVICES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Set Model Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MODEL_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Cpl Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COUPLER_SERVICES__CPL_COMP = 0;

	/**
	 * The feature id for the '<em><b>Subroutine Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COUPLER_SERVICES__SUBROUTINE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Set Coupler Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COUPLER_SERVICES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Set Coupler Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COUPLER_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETS_INTERNAL_STATE__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Gets Internal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETS_INTERNAL_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gets Internal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETS_INTERNAL_STATE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediatorImpl <em>Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediatorImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator()
	 * @generated
	 */
	int NUOPC_MEDIATOR = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Generic Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR__GENERIC_IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Implements Set Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR__IMPLEMENTS_SET_SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Initialize</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR__INITIALIZE = 3;

	/**
	 * The feature id for the '<em><b>Implements Model Advance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR__IMPLEMENTS_MODEL_ADVANCE = 4;

	/**
	 * The number of structural features of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__GenericImportsImpl <em>Mediator Generic Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__GenericImportsImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__GenericImports()
	 * @generated
	 */
	int NUOPC_MEDIATOR_GENERIC_IMPORTS = 36;

	/**
	 * The feature id for the '<em><b>Imports Generic SS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_GENERIC_IMPORTS__IMPORTS_GENERIC_SS = 0;

	/**
	 * The feature id for the '<em><b>Imports Label Model Advance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_GENERIC_IMPORTS__IMPORTS_LABEL_MODEL_ADVANCE = 1;

	/**
	 * The number of structural features of the '<em>Mediator Generic Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_GENERIC_IMPORTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mediator Generic Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_GENERIC_IMPORTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__InitImpl <em>Mediator Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__InitImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__Init()
	 * @generated
	 */
	int NUOPC_MEDIATOR_INIT = 37;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_INIT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Implements Init P1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1 = 1;

	/**
	 * The feature id for the '<em><b>Implements Init P2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P2 = 2;

	/**
	 * The number of structural features of the '<em>Mediator Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_INIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mediator Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_INIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsSetServicesImpl <em>Mediator Implements Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsSetServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__ImplementsSetServices()
	 * @generated
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES = 38;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Param gcomp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP = 2;

	/**
	 * The feature id for the '<em><b>Param rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__PARAM_RC = 3;

	/**
	 * The feature id for the '<em><b>Calls Generic Set Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Calls Set Entry Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT = 5;

	/**
	 * The feature id for the '<em><b>Attaches Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD = 6;

	/**
	 * The number of structural features of the '<em>Mediator Implements Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Mediator Implements Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP1Impl <em>Mediator Implements Init P1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP1Impl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__ImplementsInitP1()
	 * @generated
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1 = 39;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__NAME = 1;

	/**
	 * The feature id for the '<em><b>Import Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__IMPORT_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Export Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__EXPORT_PARAM = 3;

	/**
	 * The feature id for the '<em><b>Advertises Import Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Advertises Export Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Advertises At Least One Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Registered In Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES = 7;

	/**
	 * The feature id for the '<em><b>Advertises Or Registered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED = 8;

	/**
	 * The number of structural features of the '<em>Mediator Implements Init P1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Mediator Implements Init P1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP2Impl <em>Mediator Implements Init P2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP2Impl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__ImplementsInitP2()
	 * @generated
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2 = 40;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__NAME = 1;

	/**
	 * The feature id for the '<em><b>Import Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__IMPORT_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Export Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__EXPORT_PARAM = 3;

	/**
	 * The feature id for the '<em><b>Realizes Import Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Realizes Export Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Realizes At Least One Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Registered In Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REGISTERED_IN_SET_SERVICES = 7;

	/**
	 * The feature id for the '<em><b>Realizes Or Registered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REALIZES_OR_REGISTERED = 8;

	/**
	 * The number of structural features of the '<em>Mediator Implements Init P2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Mediator Implements Init P2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__AdvertisesImportFieldImpl <em>Mediator Advertises Import Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__AdvertisesImportFieldImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__AdvertisesImportField()
	 * @generated
	 */
	int NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD = 41;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Adds To State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE = 1;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__RC = 2;

	/**
	 * The feature id for the '<em><b>Adds To Import State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE = 3;

	/**
	 * The feature id for the '<em><b>Standard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__STANDARD_NAME = 4;

	/**
	 * The number of structural features of the '<em>Mediator Advertises Import Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mediator Advertises Import Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__AdvertisesExportFieldImpl <em>Mediator Advertises Export Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__AdvertisesExportFieldImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__AdvertisesExportField()
	 * @generated
	 */
	int NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD = 42;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__RC = 1;

	/**
	 * The feature id for the '<em><b>Adds To State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE = 2;

	/**
	 * The feature id for the '<em><b>Adds To Export State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE = 3;

	/**
	 * The feature id for the '<em><b>Standard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__STANDARD_NAME = 4;

	/**
	 * The number of structural features of the '<em>Mediator Advertises Export Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mediator Advertises Export Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__RealizesImportFieldImpl <em>Mediator Realizes Import Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__RealizesImportFieldImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__RealizesImportField()
	 * @generated
	 */
	int NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD = 43;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Realized In State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__REALIZED_IN_STATE = 1;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__RC = 2;

	/**
	 * The feature id for the '<em><b>Realized In Import State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__REALIZED_IN_IMPORT_STATE = 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__FIELD = 4;

	/**
	 * The number of structural features of the '<em>Mediator Realizes Import Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mediator Realizes Import Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__RealizesExportFieldImpl <em>Mediator Realizes Export Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__RealizesExportFieldImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__RealizesExportField()
	 * @generated
	 */
	int NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD = 44;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Realized In State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__REALIZED_IN_STATE = 1;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__RC = 2;

	/**
	 * The feature id for the '<em><b>Realized In Export State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE = 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__FIELD = 4;

	/**
	 * The number of structural features of the '<em>Mediator Realizes Export Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mediator Realizes Export Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ModelAdvanceImpl <em>Mediator Model Advance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ModelAdvanceImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__ModelAdvance()
	 * @generated
	 */
	int NUOPC_MEDIATOR_MODEL_ADVANCE = 45;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_MODEL_ADVANCE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_MODEL_ADVANCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Attached Model Advance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_MODEL_ADVANCE__ATTACHED_MODEL_ADVANCE = 2;

	/**
	 * The number of structural features of the '<em>Mediator Model Advance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_MODEL_ADVANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mediator Model Advance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_MODEL_ADVANCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel
	 * @generated
	 */
	EClass getNUOPCModel();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getName()
	 * @see #getNUOPCModel()
	 * @generated
	 */
	EAttribute getNUOPCModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getGenericImports <em>Generic Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getGenericImports()
	 * @see #getNUOPCModel()
	 * @generated
	 */
	EReference getNUOPCModel_GenericImports();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsSetServices <em>Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsSetServices()
	 * @see #getNUOPCModel()
	 * @generated
	 */
	EReference getNUOPCModel_ImplementsSetServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsModelAdvance <em>Implements Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements Model Advance</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsModelAdvance()
	 * @see #getNUOPCModel()
	 * @generated
	 */
	EReference getNUOPCModel_ImplementsModelAdvance();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__GenericImports <em>Model Generic Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Generic Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__GenericImports
	 * @generated
	 */
	EClass getNUOPCModel__GenericImports();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__GenericImports#getImportsGenericSS <em>Imports Generic SS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports Generic SS</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__GenericImports#getImportsGenericSS()
	 * @see #getNUOPCModel__GenericImports()
	 * @generated
	 */
	EAttribute getNUOPCModel__GenericImports_ImportsGenericSS();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__GenericImports#getImportsLabelModelAdvance <em>Imports Label Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports Label Model Advance</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__GenericImports#getImportsLabelModelAdvance()
	 * @see #getNUOPCModel__GenericImports()
	 * @generated
	 */
	EAttribute getNUOPCModel__GenericImports_ImportsLabelModelAdvance();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init <em>Model Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Init</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init
	 * @generated
	 */
	EClass getNUOPCModel__Init();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getParent()
	 * @see #getNUOPCModel__Init()
	 * @generated
	 */
	EReference getNUOPCModel__Init_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getImplementsInitP1 <em>Implements Init P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Init P1</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getImplementsInitP1()
	 * @see #getNUOPCModel__Init()
	 * @generated
	 */
	EReference getNUOPCModel__Init_ImplementsInitP1();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getImplementsInitP2 <em>Implements Init P2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Init P2</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getImplementsInitP2()
	 * @see #getNUOPCModel__Init()
	 * @generated
	 */
	EReference getNUOPCModel__Init_ImplementsInitP2();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices <em>Model Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Implements Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices
	 * @generated
	 */
	EClass getNUOPCModel__ImplementsSetServices();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getParent()
	 * @see #getNUOPCModel__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCModel__ImplementsSetServices_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getName()
	 * @see #getNUOPCModel__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsSetServices_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getParam_gcomp <em>Param gcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param gcomp</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getParam_gcomp()
	 * @see #getNUOPCModel__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsSetServices_Param_gcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getParam_rc <em>Param rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getParam_rc()
	 * @see #getNUOPCModel__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsSetServices_Param_rc();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getCallsGenericSetServices <em>Calls Generic Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calls Generic Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getCallsGenericSetServices()
	 * @see #getNUOPCModel__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCModel__ImplementsSetServices_CallsGenericSetServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getCallsSetEntryPoint <em>Calls Set Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls Set Entry Point</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getCallsSetEntryPoint()
	 * @see #getNUOPCModel__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCModel__ImplementsSetServices_CallsSetEntryPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getAttachesMethod <em>Attaches Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attaches Method</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getAttachesMethod()
	 * @see #getNUOPCModel__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCModel__ImplementsSetServices_AttachesMethod();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1 <em>Model Implements Init P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Implements Init P1</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1
	 * @generated
	 */
	EClass getNUOPCModel__ImplementsInitP1();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getParent()
	 * @see #getNUOPCModel__ImplementsInitP1()
	 * @generated
	 */
	EReference getNUOPCModel__ImplementsInitP1_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getName()
	 * @see #getNUOPCModel__ImplementsInitP1()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsInitP1_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getImportParam <em>Import Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Param</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getImportParam()
	 * @see #getNUOPCModel__ImplementsInitP1()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsInitP1_ImportParam();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getExportParam <em>Export Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Export Param</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getExportParam()
	 * @see #getNUOPCModel__ImplementsInitP1()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsInitP1_ExportParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getAdvertisesImportField <em>Advertises Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advertises Import Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getAdvertisesImportField()
	 * @see #getNUOPCModel__ImplementsInitP1()
	 * @generated
	 */
	EReference getNUOPCModel__ImplementsInitP1_AdvertisesImportField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getAdvertisesExportField <em>Advertises Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advertises Export Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getAdvertisesExportField()
	 * @see #getNUOPCModel__ImplementsInitP1()
	 * @generated
	 */
	EReference getNUOPCModel__ImplementsInitP1_AdvertisesExportField();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#isAdvertisesAtLeastOneField <em>Advertises At Least One Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advertises At Least One Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#isAdvertisesAtLeastOneField()
	 * @see #getNUOPCModel__ImplementsInitP1()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsInitP1_AdvertisesAtLeastOneField();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#isRegisteredInSetServices <em>Registered In Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registered In Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#isRegisteredInSetServices()
	 * @see #getNUOPCModel__ImplementsInitP1()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsInitP1_RegisteredInSetServices();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#isAdvertisesOrRegistered <em>Advertises Or Registered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advertises Or Registered</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#isAdvertisesOrRegistered()
	 * @see #getNUOPCModel__ImplementsInitP1()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsInitP1_AdvertisesOrRegistered();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2 <em>Model Implements Init P2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Implements Init P2</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2
	 * @generated
	 */
	EClass getNUOPCModel__ImplementsInitP2();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getParent()
	 * @see #getNUOPCModel__ImplementsInitP2()
	 * @generated
	 */
	EReference getNUOPCModel__ImplementsInitP2_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getName()
	 * @see #getNUOPCModel__ImplementsInitP2()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsInitP2_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getImportParam <em>Import Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Param</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getImportParam()
	 * @see #getNUOPCModel__ImplementsInitP2()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsInitP2_ImportParam();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getExportParam <em>Export Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Export Param</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getExportParam()
	 * @see #getNUOPCModel__ImplementsInitP2()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsInitP2_ExportParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getRealizesImportField <em>Realizes Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realizes Import Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getRealizesImportField()
	 * @see #getNUOPCModel__ImplementsInitP2()
	 * @generated
	 */
	EReference getNUOPCModel__ImplementsInitP2_RealizesImportField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getRealizesExportField <em>Realizes Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realizes Export Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getRealizesExportField()
	 * @see #getNUOPCModel__ImplementsInitP2()
	 * @generated
	 */
	EReference getNUOPCModel__ImplementsInitP2_RealizesExportField();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#isRealizesAtLeastOneField <em>Realizes At Least One Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realizes At Least One Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#isRealizesAtLeastOneField()
	 * @see #getNUOPCModel__ImplementsInitP2()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsInitP2_RealizesAtLeastOneField();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#isRegisteredInSetServices <em>Registered In Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registered In Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#isRegisteredInSetServices()
	 * @see #getNUOPCModel__ImplementsInitP2()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsInitP2_RegisteredInSetServices();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#isRealizesOrRegistered <em>Realizes Or Registered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realizes Or Registered</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#isRealizesOrRegistered()
	 * @see #getNUOPCModel__ImplementsInitP2()
	 * @generated
	 */
	EAttribute getNUOPCModel__ImplementsInitP2_RealizesOrRegistered();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField <em>Model Advertises Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Advertises Import Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField
	 * @generated
	 */
	EClass getNUOPCModel__AdvertisesImportField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField#getParent()
	 * @see #getNUOPCModel__AdvertisesImportField()
	 * @generated
	 */
	EReference getNUOPCModel__AdvertisesImportField_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField#getAddsToState <em>Adds To State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adds To State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField#getAddsToState()
	 * @see #getNUOPCModel__AdvertisesImportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__AdvertisesImportField_AddsToState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField#getRc()
	 * @see #getNUOPCModel__AdvertisesImportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__AdvertisesImportField_Rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField#isAddsToImportState <em>Adds To Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adds To Import State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField#isAddsToImportState()
	 * @see #getNUOPCModel__AdvertisesImportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__AdvertisesImportField_AddsToImportState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField#getStandardName <em>Standard Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField#getStandardName()
	 * @see #getNUOPCModel__AdvertisesImportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__AdvertisesImportField_StandardName();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField <em>Model Advertises Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Advertises Export Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField
	 * @generated
	 */
	EClass getNUOPCModel__AdvertisesExportField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField#getParent()
	 * @see #getNUOPCModel__AdvertisesExportField()
	 * @generated
	 */
	EReference getNUOPCModel__AdvertisesExportField_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField#getRc()
	 * @see #getNUOPCModel__AdvertisesExportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__AdvertisesExportField_Rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField#getAddsToState <em>Adds To State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adds To State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField#getAddsToState()
	 * @see #getNUOPCModel__AdvertisesExportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__AdvertisesExportField_AddsToState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField#isAddsToExportState <em>Adds To Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adds To Export State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField#isAddsToExportState()
	 * @see #getNUOPCModel__AdvertisesExportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__AdvertisesExportField_AddsToExportState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField#getStandardName <em>Standard Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField#getStandardName()
	 * @see #getNUOPCModel__AdvertisesExportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__AdvertisesExportField_StandardName();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField <em>Model Realizes Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Realizes Import Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField
	 * @generated
	 */
	EClass getNUOPCModel__RealizesImportField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField#getParent()
	 * @see #getNUOPCModel__RealizesImportField()
	 * @generated
	 */
	EReference getNUOPCModel__RealizesImportField_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField#getRealizedInState <em>Realized In State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized In State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField#getRealizedInState()
	 * @see #getNUOPCModel__RealizesImportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__RealizesImportField_RealizedInState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField#getRc()
	 * @see #getNUOPCModel__RealizesImportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__RealizesImportField_Rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField#isRealizedInImportState <em>Realized In Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized In Import State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField#isRealizedInImportState()
	 * @see #getNUOPCModel__RealizesImportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__RealizesImportField_RealizedInImportState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField#getField()
	 * @see #getNUOPCModel__RealizesImportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__RealizesImportField_Field();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField <em>Model Realizes Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Realizes Export Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField
	 * @generated
	 */
	EClass getNUOPCModel__RealizesExportField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField#getParent()
	 * @see #getNUOPCModel__RealizesExportField()
	 * @generated
	 */
	EReference getNUOPCModel__RealizesExportField_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField#getRealizedInState <em>Realized In State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized In State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField#getRealizedInState()
	 * @see #getNUOPCModel__RealizesExportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__RealizesExportField_RealizedInState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField#getRc()
	 * @see #getNUOPCModel__RealizesExportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__RealizesExportField_Rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField#isRealizedInExportState <em>Realized In Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized In Export State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField#isRealizedInExportState()
	 * @see #getNUOPCModel__RealizesExportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__RealizesExportField_RealizedInExportState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField#getField()
	 * @see #getNUOPCModel__RealizesExportField()
	 * @generated
	 */
	EAttribute getNUOPCModel__RealizesExportField_Field();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance <em>Model Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Model Advance</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance
	 * @generated
	 */
	EClass getNUOPCModel__ModelAdvance();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance#getParent()
	 * @see #getNUOPCModel__ModelAdvance()
	 * @generated
	 */
	EReference getNUOPCModel__ModelAdvance_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance#getName()
	 * @see #getNUOPCModel__ModelAdvance()
	 * @generated
	 */
	EAttribute getNUOPCModel__ModelAdvance_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance#isAttachedModelAdvance <em>Attached Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached Model Advance</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance#isAttachedModelAdvance()
	 * @see #getNUOPCModel__ModelAdvance()
	 * @generated
	 */
	EAttribute getNUOPCModel__ModelAdvance_AttachedModelAdvance();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getInitialize <em>Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialize</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getInitialize()
	 * @see #getNUOPCModel()
	 * @generated
	 */
	EReference getNUOPCModel_Initialize();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices <em>Calls Generic Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calls Generic Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices
	 * @generated
	 */
	EClass getCallsGenericSetServices();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices#getGcomp <em>Gcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gcomp</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices#getGcomp()
	 * @see #getCallsGenericSetServices()
	 * @generated
	 */
	EAttribute getCallsGenericSetServices_Gcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices#getRc()
	 * @see #getCallsGenericSetServices()
	 * @generated
	 */
	EAttribute getCallsGenericSetServices_Rc();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint <em>Calls Set Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calls Set Entry Point</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint
	 * @generated
	 */
	EClass getCallsSetEntryPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint#getMethod()
	 * @see #getCallsSetEntryPoint()
	 * @generated
	 */
	EAttribute getCallsSetEntryPoint_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint#getUserRoutine <em>User Routine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Routine</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint#getUserRoutine()
	 * @see #getCallsSetEntryPoint()
	 * @generated
	 */
	EAttribute getCallsSetEntryPoint_UserRoutine();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint#getPhase()
	 * @see #getCallsSetEntryPoint()
	 * @generated
	 */
	EAttribute getCallsSetEntryPoint_Phase();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver
	 * @generated
	 */
	EClass getNUOPCDriver();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getParent()
	 * @see #getNUOPCDriver()
	 * @generated
	 */
	EReference getNUOPCDriver_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getName()
	 * @see #getNUOPCDriver()
	 * @generated
	 */
	EAttribute getNUOPCDriver_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getGenericImports <em>Generic Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getGenericImports()
	 * @see #getNUOPCDriver()
	 * @generated
	 */
	EReference getNUOPCDriver_GenericImports();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getModelImports <em>Model Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getModelImports()
	 * @see #getNUOPCDriver()
	 * @generated
	 */
	EReference getNUOPCDriver_ModelImports();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getConnectorImports <em>Connector Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getConnectorImports()
	 * @see #getNUOPCDriver()
	 * @generated
	 */
	EReference getNUOPCDriver_ConnectorImports();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetServices <em>Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetServices()
	 * @see #getNUOPCDriver()
	 * @generated
	 */
	EReference getNUOPCDriver_ImplementsSetServices();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetModelCount <em>Implements Set Model Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Set Model Count</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetModelCount()
	 * @see #getNUOPCDriver()
	 * @generated
	 */
	EReference getNUOPCDriver_ImplementsSetModelCount();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetModelServices <em>Implements Set Model Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Set Model Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetModelServices()
	 * @see #getNUOPCDriver()
	 * @generated
	 */
	EReference getNUOPCDriver_ImplementsSetModelServices();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports <em>Driver Generic Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Generic Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports
	 * @generated
	 */
	EClass getNUOPCDriver__GenericImports();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports#getImportsGenericSS <em>Imports Generic SS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports Generic SS</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports#getImportsGenericSS()
	 * @see #getNUOPCDriver__GenericImports()
	 * @generated
	 */
	EAttribute getNUOPCDriver__GenericImports_ImportsGenericSS();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports#getImportsTypeDriverIS <em>Imports Type Driver IS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports Type Driver IS</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports#getImportsTypeDriverIS()
	 * @see #getNUOPCDriver__GenericImports()
	 * @generated
	 */
	EAttribute getNUOPCDriver__GenericImports_ImportsTypeDriverIS();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports#getImportsLabelSetModelCount <em>Imports Label Set Model Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports Label Set Model Count</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports#getImportsLabelSetModelCount()
	 * @see #getNUOPCDriver__GenericImports()
	 * @generated
	 */
	EAttribute getNUOPCDriver__GenericImports_ImportsLabelSetModelCount();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports#getImportsLabelSetModelServices <em>Imports Label Set Model Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports Label Set Model Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports#getImportsLabelSetModelServices()
	 * @see #getNUOPCDriver__GenericImports()
	 * @generated
	 */
	EAttribute getNUOPCDriver__GenericImports_ImportsLabelSetModelServices();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports <em>Driver Model Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Model Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports
	 * @generated
	 */
	EClass getNUOPCDriver__ModelImports();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports#getParent()
	 * @see #getNUOPCDriver__ModelImports()
	 * @generated
	 */
	EReference getNUOPCDriver__ModelImports_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports#getModelImport <em>Model Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Import</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports#getModelImport()
	 * @see #getNUOPCDriver__ModelImports()
	 * @generated
	 */
	EReference getNUOPCDriver__ModelImports_ModelImport();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport <em>Driver Model Imports Model Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Model Imports Model Import</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport
	 * @generated
	 */
	EClass getNUOPCDriver__ModelImports__ModelImport();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport#getParent()
	 * @see #getNUOPCDriver__ModelImports__ModelImport()
	 * @generated
	 */
	EReference getNUOPCDriver__ModelImports__ModelImport_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport#getName()
	 * @see #getNUOPCDriver__ModelImports__ModelImport()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ModelImports__ModelImport_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport#getSetServices <em>Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport#getSetServices()
	 * @see #getNUOPCDriver__ModelImports__ModelImport()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ModelImports__ModelImport_SetServices();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport#getModelRef <em>Model Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Ref</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport#getModelRef()
	 * @see #getNUOPCDriver__ModelImports__ModelImport()
	 * @generated
	 */
	EReference getNUOPCDriver__ModelImports__ModelImport_ModelRef();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports <em>Driver Connector Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Connector Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports
	 * @generated
	 */
	EClass getNUOPCDriver__ConnectorImports();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports#getParent()
	 * @see #getNUOPCDriver__ConnectorImports()
	 * @generated
	 */
	EReference getNUOPCDriver__ConnectorImports_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports#getConnectorImport <em>Connector Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector Import</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports#getConnectorImport()
	 * @see #getNUOPCDriver__ConnectorImports()
	 * @generated
	 */
	EReference getNUOPCDriver__ConnectorImports_ConnectorImport();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport <em>Driver Connector Imports Connector Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Connector Imports Connector Import</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport
	 * @generated
	 */
	EClass getNUOPCDriver__ConnectorImports__ConnectorImport();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport#getParent()
	 * @see #getNUOPCDriver__ConnectorImports__ConnectorImport()
	 * @generated
	 */
	EReference getNUOPCDriver__ConnectorImports__ConnectorImport_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport#getName()
	 * @see #getNUOPCDriver__ConnectorImports__ConnectorImport()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ConnectorImports__ConnectorImport_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport#getSetServices <em>Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport#getSetServices()
	 * @see #getNUOPCDriver__ConnectorImports__ConnectorImport()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ConnectorImports__ConnectorImport_SetServices();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices <em>Driver Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Implements Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices
	 * @generated
	 */
	EClass getNUOPCDriver__ImplementsSetServices();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParent()
	 * @see #getNUOPCDriver__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCDriver__ImplementsSetServices_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getName()
	 * @see #getNUOPCDriver__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetServices_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParam_gcomp <em>Param gcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param gcomp</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParam_gcomp()
	 * @see #getNUOPCDriver__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetServices_Param_gcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParam_rc <em>Param rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParam_rc()
	 * @see #getNUOPCDriver__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetServices_Param_rc();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getCallsGenericSetServices <em>Calls Generic Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calls Generic Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getCallsGenericSetServices()
	 * @see #getNUOPCDriver__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCDriver__ImplementsSetServices_CallsGenericSetServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getAttachesMethod <em>Attaches Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attaches Method</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getAttachesMethod()
	 * @see #getNUOPCDriver__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCDriver__ImplementsSetServices_AttachesMethod();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod <em>Attaches Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attaches Method</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod
	 * @generated
	 */
	EClass getAttachesMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod#getName()
	 * @see #getAttachesMethod()
	 * @generated
	 */
	EAttribute getAttachesMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod#getUserRoutine <em>User Routine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Routine</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod#getUserRoutine()
	 * @see #getAttachesMethod()
	 * @generated
	 */
	EAttribute getAttachesMethod_UserRoutine();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod#getIndex()
	 * @see #getAttachesMethod()
	 * @generated
	 */
	EAttribute getAttachesMethod_Index();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount <em>Driver Implements Set Model Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Implements Set Model Count</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount
	 * @generated
	 */
	EClass getNUOPCDriver__ImplementsSetModelCount();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getParent()
	 * @see #getNUOPCDriver__ImplementsSetModelCount()
	 * @generated
	 */
	EReference getNUOPCDriver__ImplementsSetModelCount_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getGcomp <em>Gcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gcomp</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getGcomp()
	 * @see #getNUOPCDriver__ImplementsSetModelCount()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetModelCount_Gcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getRc()
	 * @see #getNUOPCDriver__ImplementsSetModelCount()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetModelCount_Rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getName()
	 * @see #getNUOPCDriver__ImplementsSetModelCount()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetModelCount_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getDriverInternalState <em>Driver Internal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Internal State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getDriverInternalState()
	 * @see #getNUOPCDriver__ImplementsSetModelCount()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetModelCount_DriverInternalState();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getGetsInternalState <em>Gets Internal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gets Internal State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getGetsInternalState()
	 * @see #getNUOPCDriver__ImplementsSetModelCount()
	 * @generated
	 */
	EReference getNUOPCDriver__ImplementsSetModelCount_GetsInternalState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#isAssignsValue <em>Assigns Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigns Value</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#isAssignsValue()
	 * @see #getNUOPCDriver__ImplementsSetModelCount()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetModelCount_AssignsValue();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#isAttached <em>Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#isAttached()
	 * @see #getNUOPCDriver__ImplementsSetModelCount()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetModelCount_Attached();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices <em>Driver Implements Set Model Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Implements Set Model Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices
	 * @generated
	 */
	EClass getNUOPCDriver__ImplementsSetModelServices();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getParent()
	 * @see #getNUOPCDriver__ImplementsSetModelServices()
	 * @generated
	 */
	EReference getNUOPCDriver__ImplementsSetModelServices_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getGcomp <em>Gcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gcomp</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getGcomp()
	 * @see #getNUOPCDriver__ImplementsSetModelServices()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetModelServices_Gcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getRc()
	 * @see #getNUOPCDriver__ImplementsSetModelServices()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetModelServices_Rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getName()
	 * @see #getNUOPCDriver__ImplementsSetModelServices()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetModelServices_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getDriverInternalState <em>Driver Internal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Internal State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getDriverInternalState()
	 * @see #getNUOPCDriver__ImplementsSetModelServices()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetModelServices_DriverInternalState();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getGetsInternalState <em>Gets Internal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gets Internal State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getGetsInternalState()
	 * @see #getNUOPCDriver__ImplementsSetModelServices()
	 * @generated
	 */
	EReference getNUOPCDriver__ImplementsSetModelServices_GetsInternalState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#isAssignsValue <em>Assigns Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigns Value</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#isAssignsValue()
	 * @see #getNUOPCDriver__ImplementsSetModelServices()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetModelServices_AssignsValue();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#isAttached <em>Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#isAttached()
	 * @see #getNUOPCDriver__ImplementsSetModelServices()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetModelServices_Attached();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getSetModelServices <em>Set Model Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Model Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getSetModelServices()
	 * @see #getNUOPCDriver__ImplementsSetModelServices()
	 * @generated
	 */
	EReference getNUOPCDriver__ImplementsSetModelServices_SetModelServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getSetCouplerServices <em>Set Coupler Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Coupler Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getSetCouplerServices()
	 * @see #getNUOPCDriver__ImplementsSetModelServices()
	 * @generated
	 */
	EReference getNUOPCDriver__ImplementsSetModelServices_SetCouplerServices();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices <em>Set Model Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Model Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices
	 * @generated
	 */
	EClass getSetModelServices();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices#getModelComp <em>Model Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Comp</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices#getModelComp()
	 * @see #getSetModelServices()
	 * @generated
	 */
	EAttribute getSetModelServices_ModelComp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices#getSubroutineName <em>Subroutine Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subroutine Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices#getSubroutineName()
	 * @see #getSetModelServices()
	 * @generated
	 */
	EAttribute getSetModelServices_SubroutineName();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices <em>Set Coupler Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Coupler Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices
	 * @generated
	 */
	EClass getSetCouplerServices();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices#getCplComp <em>Cpl Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpl Comp</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices#getCplComp()
	 * @see #getSetCouplerServices()
	 * @generated
	 */
	EAttribute getSetCouplerServices_CplComp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices#getSubroutineName <em>Subroutine Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subroutine Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices#getSubroutineName()
	 * @see #getSetCouplerServices()
	 * @generated
	 */
	EAttribute getSetCouplerServices_SubroutineName();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.GetsInternalState <em>Gets Internal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gets Internal State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.GetsInternalState
	 * @generated
	 */
	EClass getGetsInternalState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.GetsInternalState#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.GetsInternalState#getLabel()
	 * @see #getGetsInternalState()
	 * @generated
	 */
	EAttribute getGetsInternalState_Label();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator
	 * @generated
	 */
	EClass getNUOPCMediator();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getName()
	 * @see #getNUOPCMediator()
	 * @generated
	 */
	EAttribute getNUOPCMediator_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getGenericImports <em>Generic Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getGenericImports()
	 * @see #getNUOPCMediator()
	 * @generated
	 */
	EReference getNUOPCMediator_GenericImports();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getImplementsSetServices <em>Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getImplementsSetServices()
	 * @see #getNUOPCMediator()
	 * @generated
	 */
	EReference getNUOPCMediator_ImplementsSetServices();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getInitialize <em>Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialize</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getInitialize()
	 * @see #getNUOPCMediator()
	 * @generated
	 */
	EReference getNUOPCMediator_Initialize();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getImplementsModelAdvance <em>Implements Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements Model Advance</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getImplementsModelAdvance()
	 * @see #getNUOPCMediator()
	 * @generated
	 */
	EReference getNUOPCMediator_ImplementsModelAdvance();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports <em>Mediator Generic Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Generic Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports
	 * @generated
	 */
	EClass getNUOPCMediator__GenericImports();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports#getImportsGenericSS <em>Imports Generic SS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports Generic SS</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports#getImportsGenericSS()
	 * @see #getNUOPCMediator__GenericImports()
	 * @generated
	 */
	EAttribute getNUOPCMediator__GenericImports_ImportsGenericSS();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports#getImportsLabelModelAdvance <em>Imports Label Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports Label Model Advance</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports#getImportsLabelModelAdvance()
	 * @see #getNUOPCMediator__GenericImports()
	 * @generated
	 */
	EAttribute getNUOPCMediator__GenericImports_ImportsLabelModelAdvance();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init <em>Mediator Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Init</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init
	 * @generated
	 */
	EClass getNUOPCMediator__Init();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init#getParent()
	 * @see #getNUOPCMediator__Init()
	 * @generated
	 */
	EReference getNUOPCMediator__Init_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init#getImplementsInitP1 <em>Implements Init P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Init P1</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init#getImplementsInitP1()
	 * @see #getNUOPCMediator__Init()
	 * @generated
	 */
	EReference getNUOPCMediator__Init_ImplementsInitP1();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init#getImplementsInitP2 <em>Implements Init P2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Init P2</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init#getImplementsInitP2()
	 * @see #getNUOPCMediator__Init()
	 * @generated
	 */
	EReference getNUOPCMediator__Init_ImplementsInitP2();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices <em>Mediator Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Implements Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices
	 * @generated
	 */
	EClass getNUOPCMediator__ImplementsSetServices();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getParent()
	 * @see #getNUOPCMediator__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCMediator__ImplementsSetServices_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getName()
	 * @see #getNUOPCMediator__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsSetServices_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getParam_gcomp <em>Param gcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param gcomp</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getParam_gcomp()
	 * @see #getNUOPCMediator__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsSetServices_Param_gcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getParam_rc <em>Param rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getParam_rc()
	 * @see #getNUOPCMediator__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsSetServices_Param_rc();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getCallsGenericSetServices <em>Calls Generic Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calls Generic Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getCallsGenericSetServices()
	 * @see #getNUOPCMediator__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCMediator__ImplementsSetServices_CallsGenericSetServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getCallsSetEntryPoint <em>Calls Set Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls Set Entry Point</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getCallsSetEntryPoint()
	 * @see #getNUOPCMediator__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCMediator__ImplementsSetServices_CallsSetEntryPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getAttachesMethod <em>Attaches Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attaches Method</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getAttachesMethod()
	 * @see #getNUOPCMediator__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCMediator__ImplementsSetServices_AttachesMethod();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1 <em>Mediator Implements Init P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Implements Init P1</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1
	 * @generated
	 */
	EClass getNUOPCMediator__ImplementsInitP1();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getParent()
	 * @see #getNUOPCMediator__ImplementsInitP1()
	 * @generated
	 */
	EReference getNUOPCMediator__ImplementsInitP1_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getName()
	 * @see #getNUOPCMediator__ImplementsInitP1()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsInitP1_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getImportParam <em>Import Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Param</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getImportParam()
	 * @see #getNUOPCMediator__ImplementsInitP1()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsInitP1_ImportParam();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getExportParam <em>Export Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Export Param</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getExportParam()
	 * @see #getNUOPCMediator__ImplementsInitP1()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsInitP1_ExportParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getAdvertisesImportField <em>Advertises Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advertises Import Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getAdvertisesImportField()
	 * @see #getNUOPCMediator__ImplementsInitP1()
	 * @generated
	 */
	EReference getNUOPCMediator__ImplementsInitP1_AdvertisesImportField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getAdvertisesExportField <em>Advertises Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advertises Export Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getAdvertisesExportField()
	 * @see #getNUOPCMediator__ImplementsInitP1()
	 * @generated
	 */
	EReference getNUOPCMediator__ImplementsInitP1_AdvertisesExportField();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#isAdvertisesAtLeastOneField <em>Advertises At Least One Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advertises At Least One Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#isAdvertisesAtLeastOneField()
	 * @see #getNUOPCMediator__ImplementsInitP1()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsInitP1_AdvertisesAtLeastOneField();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#isRegisteredInSetServices <em>Registered In Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registered In Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#isRegisteredInSetServices()
	 * @see #getNUOPCMediator__ImplementsInitP1()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsInitP1_RegisteredInSetServices();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#isAdvertisesOrRegistered <em>Advertises Or Registered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advertises Or Registered</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#isAdvertisesOrRegistered()
	 * @see #getNUOPCMediator__ImplementsInitP1()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsInitP1_AdvertisesOrRegistered();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2 <em>Mediator Implements Init P2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Implements Init P2</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2
	 * @generated
	 */
	EClass getNUOPCMediator__ImplementsInitP2();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#getParent()
	 * @see #getNUOPCMediator__ImplementsInitP2()
	 * @generated
	 */
	EReference getNUOPCMediator__ImplementsInitP2_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#getName()
	 * @see #getNUOPCMediator__ImplementsInitP2()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsInitP2_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#getImportParam <em>Import Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Param</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#getImportParam()
	 * @see #getNUOPCMediator__ImplementsInitP2()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsInitP2_ImportParam();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#getExportParam <em>Export Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Export Param</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#getExportParam()
	 * @see #getNUOPCMediator__ImplementsInitP2()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsInitP2_ExportParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#getRealizesImportField <em>Realizes Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realizes Import Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#getRealizesImportField()
	 * @see #getNUOPCMediator__ImplementsInitP2()
	 * @generated
	 */
	EReference getNUOPCMediator__ImplementsInitP2_RealizesImportField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#getRealizesExportField <em>Realizes Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realizes Export Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#getRealizesExportField()
	 * @see #getNUOPCMediator__ImplementsInitP2()
	 * @generated
	 */
	EReference getNUOPCMediator__ImplementsInitP2_RealizesExportField();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#isRealizesAtLeastOneField <em>Realizes At Least One Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realizes At Least One Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#isRealizesAtLeastOneField()
	 * @see #getNUOPCMediator__ImplementsInitP2()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsInitP2_RealizesAtLeastOneField();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#isRegisteredInSetServices <em>Registered In Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registered In Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#isRegisteredInSetServices()
	 * @see #getNUOPCMediator__ImplementsInitP2()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsInitP2_RegisteredInSetServices();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#isRealizesOrRegistered <em>Realizes Or Registered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realizes Or Registered</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2#isRealizesOrRegistered()
	 * @see #getNUOPCMediator__ImplementsInitP2()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ImplementsInitP2_RealizesOrRegistered();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField <em>Mediator Advertises Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Advertises Import Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField
	 * @generated
	 */
	EClass getNUOPCMediator__AdvertisesImportField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField#getParent()
	 * @see #getNUOPCMediator__AdvertisesImportField()
	 * @generated
	 */
	EReference getNUOPCMediator__AdvertisesImportField_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField#getAddsToState <em>Adds To State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adds To State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField#getAddsToState()
	 * @see #getNUOPCMediator__AdvertisesImportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__AdvertisesImportField_AddsToState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField#getRc()
	 * @see #getNUOPCMediator__AdvertisesImportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__AdvertisesImportField_Rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField#isAddsToImportState <em>Adds To Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adds To Import State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField#isAddsToImportState()
	 * @see #getNUOPCMediator__AdvertisesImportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__AdvertisesImportField_AddsToImportState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField#getStandardName <em>Standard Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField#getStandardName()
	 * @see #getNUOPCMediator__AdvertisesImportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__AdvertisesImportField_StandardName();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField <em>Mediator Advertises Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Advertises Export Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField
	 * @generated
	 */
	EClass getNUOPCMediator__AdvertisesExportField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getParent()
	 * @see #getNUOPCMediator__AdvertisesExportField()
	 * @generated
	 */
	EReference getNUOPCMediator__AdvertisesExportField_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getRc()
	 * @see #getNUOPCMediator__AdvertisesExportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__AdvertisesExportField_Rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getAddsToState <em>Adds To State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adds To State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getAddsToState()
	 * @see #getNUOPCMediator__AdvertisesExportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__AdvertisesExportField_AddsToState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#isAddsToExportState <em>Adds To Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adds To Export State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#isAddsToExportState()
	 * @see #getNUOPCMediator__AdvertisesExportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__AdvertisesExportField_AddsToExportState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getStandardName <em>Standard Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getStandardName()
	 * @see #getNUOPCMediator__AdvertisesExportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__AdvertisesExportField_StandardName();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField <em>Mediator Realizes Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Realizes Import Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField
	 * @generated
	 */
	EClass getNUOPCMediator__RealizesImportField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField#getParent()
	 * @see #getNUOPCMediator__RealizesImportField()
	 * @generated
	 */
	EReference getNUOPCMediator__RealizesImportField_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField#getRealizedInState <em>Realized In State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized In State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField#getRealizedInState()
	 * @see #getNUOPCMediator__RealizesImportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__RealizesImportField_RealizedInState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField#getRc()
	 * @see #getNUOPCMediator__RealizesImportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__RealizesImportField_Rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField#isRealizedInImportState <em>Realized In Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized In Import State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField#isRealizedInImportState()
	 * @see #getNUOPCMediator__RealizesImportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__RealizesImportField_RealizedInImportState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField#getField()
	 * @see #getNUOPCMediator__RealizesImportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__RealizesImportField_Field();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField <em>Mediator Realizes Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Realizes Export Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField
	 * @generated
	 */
	EClass getNUOPCMediator__RealizesExportField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField#getParent()
	 * @see #getNUOPCMediator__RealizesExportField()
	 * @generated
	 */
	EReference getNUOPCMediator__RealizesExportField_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField#getRealizedInState <em>Realized In State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized In State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField#getRealizedInState()
	 * @see #getNUOPCMediator__RealizesExportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__RealizesExportField_RealizedInState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField#getRc()
	 * @see #getNUOPCMediator__RealizesExportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__RealizesExportField_Rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField#isRealizedInExportState <em>Realized In Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized In Export State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField#isRealizedInExportState()
	 * @see #getNUOPCMediator__RealizesExportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__RealizesExportField_RealizedInExportState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField#getField()
	 * @see #getNUOPCMediator__RealizesExportField()
	 * @generated
	 */
	EAttribute getNUOPCMediator__RealizesExportField_Field();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance <em>Mediator Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Model Advance</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance
	 * @generated
	 */
	EClass getNUOPCMediator__ModelAdvance();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#getParent()
	 * @see #getNUOPCMediator__ModelAdvance()
	 * @generated
	 */
	EReference getNUOPCMediator__ModelAdvance_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#getName()
	 * @see #getNUOPCMediator__ModelAdvance()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ModelAdvance_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#isAttachedModelAdvance <em>Attached Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached Model Advance</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#isAttachedModelAdvance()
	 * @see #getNUOPCMediator__ModelAdvance()
	 * @generated
	 */
	EAttribute getNUOPCMediator__ModelAdvance_AttachedModelAdvance();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication
	 * @generated
	 */
	EClass getNUOPCApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getName()
	 * @see #getNUOPCApplication()
	 * @generated
	 */
	EAttribute getNUOPCApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcDriver <em>Nuopc Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nuopc Driver</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcDriver()
	 * @see #getNUOPCApplication()
	 * @generated
	 */
	EReference getNUOPCApplication_NuopcDriver();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcModel <em>Nuopc Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nuopc Model</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcModel()
	 * @see #getNUOPCApplication()
	 * @generated
	 */
	EReference getNUOPCApplication_NuopcModel();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Top <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Top
	 * @generated
	 */
	EClass getTop();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Top#getApps <em>Apps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Apps</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Top#getApps()
	 * @see #getTop()
	 * @generated
	 */
	EReference getTop_Apps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcDriverAtmOcn <em>Nuopc Driver Atm Ocn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nuopc Driver Atm Ocn</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcDriverAtmOcn()
	 * @see #getNUOPCApplication()
	 * @generated
	 */
	EReference getNUOPCApplication_NuopcDriverAtmOcn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcMediator <em>Nuopc Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nuopc Mediator</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcMediator()
	 * @see #getNUOPCApplication()
	 * @generated
	 */
	EReference getNUOPCApplication_NuopcMediator();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn <em>Driver Atm Ocn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Atm Ocn</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn
	 * @generated
	 */
	EClass getNUOPCDriverAtmOcn();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getParent()
	 * @see #getNUOPCDriverAtmOcn()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getName()
	 * @see #getNUOPCDriverAtmOcn()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getGenericImports <em>Generic Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getGenericImports()
	 * @see #getNUOPCDriverAtmOcn()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn_GenericImports();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getModelImports <em>Model Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getModelImports()
	 * @see #getNUOPCDriverAtmOcn()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn_ModelImports();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetServices <em>Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetServices()
	 * @see #getNUOPCDriverAtmOcn()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn_ImplementsSetServices();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetModelCount <em>Implements Set Model Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Set Model Count</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetModelCount()
	 * @see #getNUOPCDriverAtmOcn()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn_ImplementsSetModelCount();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetModelServices <em>Implements Set Model Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Set Model Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetModelServices()
	 * @see #getNUOPCDriverAtmOcn()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn_ImplementsSetModelServices();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports <em>Driver Atm Ocn Generic Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Atm Ocn Generic Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports
	 * @generated
	 */
	EClass getNUOPCDriverAtmOcn__GenericImports();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsGenericSS <em>Imports Generic SS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports Generic SS</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsGenericSS()
	 * @see #getNUOPCDriverAtmOcn__GenericImports()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__GenericImports_ImportsGenericSS();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsTypeDriverIS <em>Imports Type Driver IS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports Type Driver IS</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsTypeDriverIS()
	 * @see #getNUOPCDriverAtmOcn__GenericImports()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__GenericImports_ImportsTypeDriverIS();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsLabelSetModelCount <em>Imports Label Set Model Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports Label Set Model Count</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsLabelSetModelCount()
	 * @see #getNUOPCDriverAtmOcn__GenericImports()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelCount();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsLabelSetModelServices <em>Imports Label Set Model Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports Label Set Model Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsLabelSetModelServices()
	 * @see #getNUOPCDriverAtmOcn__GenericImports()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelServices();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports <em>Driver Atm Ocn Model Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Atm Ocn Model Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports
	 * @generated
	 */
	EClass getNUOPCDriverAtmOcn__ModelImports();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports#getParent()
	 * @see #getNUOPCDriverAtmOcn__ModelImports()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn__ModelImports_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports#getModelImport <em>Model Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Import</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports#getModelImport()
	 * @see #getNUOPCDriverAtmOcn__ModelImports()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn__ModelImports_ModelImport();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices <em>Driver Atm Ocn Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Atm Ocn Implements Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices
	 * @generated
	 */
	EClass getNUOPCDriverAtmOcn__ImplementsSetServices();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getParent()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn__ImplementsSetServices_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getName()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetServices_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getParam_gcomp <em>Param gcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param gcomp</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getParam_gcomp()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetServices_Param_gcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getParam_rc <em>Param rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getParam_rc()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetServices_Param_rc();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getCallsGenericSetServices <em>Calls Generic Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calls Generic Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getCallsGenericSetServices()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn__ImplementsSetServices_CallsGenericSetServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getAttachesMethod <em>Attaches Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attaches Method</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getAttachesMethod()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetServices()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn__ImplementsSetServices_AttachesMethod();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount <em>Driver Atm Ocn Implements Set Model Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Atm Ocn Implements Set Model Count</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount
	 * @generated
	 */
	EClass getNUOPCDriverAtmOcn__ImplementsSetModelCount();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getParent()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelCount()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn__ImplementsSetModelCount_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getGcomp <em>Gcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gcomp</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getGcomp()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelCount()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelCount_Gcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getRc()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelCount()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelCount_Rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getName()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelCount()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelCount_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getDriverInternalState <em>Driver Internal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Internal State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getDriverInternalState()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelCount()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelCount_DriverInternalState();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getGetsInternalState <em>Gets Internal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gets Internal State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getGetsInternalState()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelCount()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn__ImplementsSetModelCount_GetsInternalState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#isAssignsValue <em>Assigns Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigns Value</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#isAssignsValue()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelCount()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelCount_AssignsValue();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#isAttached <em>Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#isAttached()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelCount()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelCount_Attached();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices <em>Driver Atm Ocn Implements Set Model Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Atm Ocn Implements Set Model Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices
	 * @generated
	 */
	EClass getNUOPCDriverAtmOcn__ImplementsSetModelServices();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getParent()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelServices()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn__ImplementsSetModelServices_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getGcomp <em>Gcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gcomp</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getGcomp()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelServices()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelServices_Gcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getRc()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelServices()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelServices_Rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getName()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelServices()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelServices_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getDriverInternalState <em>Driver Internal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Internal State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getDriverInternalState()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelServices()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelServices_DriverInternalState();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getGetsInternalState <em>Gets Internal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gets Internal State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getGetsInternalState()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelServices()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn__ImplementsSetModelServices_GetsInternalState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#isAssignsValue <em>Assigns Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigns Value</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#isAssignsValue()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelServices()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelServices_AssignsValue();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#isAttached <em>Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#isAttached()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelServices()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelServices_Attached();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getSetModelServices <em>Set Model Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Model Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getSetModelServices()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelServices()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn__ImplementsSetModelServices_SetModelServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getSetCouplerServices <em>Set Coupler Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Coupler Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getSetCouplerServices()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetModelServices()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn__ImplementsSetModelServices_SetCouplerServices();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport <em>Driver Atm Ocn Model Imports Model Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Atm Ocn Model Imports Model Import</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport
	 * @generated
	 */
	EClass getNUOPCDriverAtmOcn__ModelImports__ModelImport();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport#getParent()
	 * @see #getNUOPCDriverAtmOcn__ModelImports__ModelImport()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn__ModelImports__ModelImport_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport#getName()
	 * @see #getNUOPCDriverAtmOcn__ModelImports__ModelImport()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ModelImports__ModelImport_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport#getSetServices <em>Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport#getSetServices()
	 * @see #getNUOPCDriverAtmOcn__ModelImports__ModelImport()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ModelImports__ModelImport_SetServices();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport#getModelRef <em>Model Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Ref</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport#getModelRef()
	 * @see #getNUOPCDriverAtmOcn__ModelImports__ModelImport()
	 * @generated
	 */
	EReference getNUOPCDriverAtmOcn__ModelImports__ModelImport_ModelRef();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModelImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel()
		 * @generated
		 */
		EClass NUOPC_MODEL = eINSTANCE.getNUOPCModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL__NAME = eINSTANCE.getNUOPCModel_Name();

		/**
		 * The meta object literal for the '<em><b>Generic Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL__GENERIC_IMPORTS = eINSTANCE.getNUOPCModel_GenericImports();

		/**
		 * The meta object literal for the '<em><b>Implements Set Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL__IMPLEMENTS_SET_SERVICES = eINSTANCE.getNUOPCModel_ImplementsSetServices();

		/**
		 * The meta object literal for the '<em><b>Implements Model Advance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE = eINSTANCE.getNUOPCModel_ImplementsModelAdvance();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__GenericImportsImpl <em>Model Generic Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__GenericImportsImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__GenericImports()
		 * @generated
		 */
		EClass NUOPC_MODEL_GENERIC_IMPORTS = eINSTANCE.getNUOPCModel__GenericImports();

		/**
		 * The meta object literal for the '<em><b>Imports Generic SS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_GENERIC_SS = eINSTANCE.getNUOPCModel__GenericImports_ImportsGenericSS();

		/**
		 * The meta object literal for the '<em><b>Imports Label Model Advance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_LABEL_MODEL_ADVANCE = eINSTANCE.getNUOPCModel__GenericImports_ImportsLabelModelAdvance();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__InitImpl <em>Model Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__InitImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__Init()
		 * @generated
		 */
		EClass NUOPC_MODEL_INIT = eINSTANCE.getNUOPCModel__Init();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_INIT__PARENT = eINSTANCE.getNUOPCModel__Init_Parent();

		/**
		 * The meta object literal for the '<em><b>Implements Init P1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_INIT__IMPLEMENTS_INIT_P1 = eINSTANCE.getNUOPCModel__Init_ImplementsInitP1();

		/**
		 * The meta object literal for the '<em><b>Implements Init P2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_INIT__IMPLEMENTS_INIT_P2 = eINSTANCE.getNUOPCModel__Init_ImplementsInitP2();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsSetServicesImpl <em>Model Implements Set Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsSetServicesImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__ImplementsSetServices()
		 * @generated
		 */
		EClass NUOPC_MODEL_IMPLEMENTS_SET_SERVICES = eINSTANCE.getNUOPCModel__ImplementsSetServices();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT = eINSTANCE.getNUOPCModel__ImplementsSetServices_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__NAME = eINSTANCE.getNUOPCModel__ImplementsSetServices_Name();

		/**
		 * The meta object literal for the '<em><b>Param gcomp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP = eINSTANCE.getNUOPCModel__ImplementsSetServices_Param_gcomp();

		/**
		 * The meta object literal for the '<em><b>Param rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARAM_RC = eINSTANCE.getNUOPCModel__ImplementsSetServices_Param_rc();

		/**
		 * The meta object literal for the '<em><b>Calls Generic Set Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = eINSTANCE.getNUOPCModel__ImplementsSetServices_CallsGenericSetServices();

		/**
		 * The meta object literal for the '<em><b>Calls Set Entry Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT = eINSTANCE.getNUOPCModel__ImplementsSetServices_CallsSetEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Attaches Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD = eINSTANCE.getNUOPCModel__ImplementsSetServices_AttachesMethod();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsInitP1Impl <em>Model Implements Init P1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsInitP1Impl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__ImplementsInitP1()
		 * @generated
		 */
		EClass NUOPC_MODEL_IMPLEMENTS_INIT_P1 = eINSTANCE.getNUOPCModel__ImplementsInitP1();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_IMPLEMENTS_INIT_P1__PARENT = eINSTANCE.getNUOPCModel__ImplementsInitP1_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_INIT_P1__NAME = eINSTANCE.getNUOPCModel__ImplementsInitP1_Name();

		/**
		 * The meta object literal for the '<em><b>Import Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM = eINSTANCE.getNUOPCModel__ImplementsInitP1_ImportParam();

		/**
		 * The meta object literal for the '<em><b>Export Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM = eINSTANCE.getNUOPCModel__ImplementsInitP1_ExportParam();

		/**
		 * The meta object literal for the '<em><b>Advertises Import Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD = eINSTANCE.getNUOPCModel__ImplementsInitP1_AdvertisesImportField();

		/**
		 * The meta object literal for the '<em><b>Advertises Export Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD = eINSTANCE.getNUOPCModel__ImplementsInitP1_AdvertisesExportField();

		/**
		 * The meta object literal for the '<em><b>Advertises At Least One Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD = eINSTANCE.getNUOPCModel__ImplementsInitP1_AdvertisesAtLeastOneField();

		/**
		 * The meta object literal for the '<em><b>Registered In Set Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES = eINSTANCE.getNUOPCModel__ImplementsInitP1_RegisteredInSetServices();

		/**
		 * The meta object literal for the '<em><b>Advertises Or Registered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED = eINSTANCE.getNUOPCModel__ImplementsInitP1_AdvertisesOrRegistered();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsInitP2Impl <em>Model Implements Init P2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsInitP2Impl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__ImplementsInitP2()
		 * @generated
		 */
		EClass NUOPC_MODEL_IMPLEMENTS_INIT_P2 = eINSTANCE.getNUOPCModel__ImplementsInitP2();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_IMPLEMENTS_INIT_P2__PARENT = eINSTANCE.getNUOPCModel__ImplementsInitP2_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_INIT_P2__NAME = eINSTANCE.getNUOPCModel__ImplementsInitP2_Name();

		/**
		 * The meta object literal for the '<em><b>Import Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_INIT_P2__IMPORT_PARAM = eINSTANCE.getNUOPCModel__ImplementsInitP2_ImportParam();

		/**
		 * The meta object literal for the '<em><b>Export Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_INIT_P2__EXPORT_PARAM = eINSTANCE.getNUOPCModel__ImplementsInitP2_ExportParam();

		/**
		 * The meta object literal for the '<em><b>Realizes Import Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD = eINSTANCE.getNUOPCModel__ImplementsInitP2_RealizesImportField();

		/**
		 * The meta object literal for the '<em><b>Realizes Export Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD = eINSTANCE.getNUOPCModel__ImplementsInitP2_RealizesExportField();

		/**
		 * The meta object literal for the '<em><b>Realizes At Least One Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD = eINSTANCE.getNUOPCModel__ImplementsInitP2_RealizesAtLeastOneField();

		/**
		 * The meta object literal for the '<em><b>Registered In Set Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_INIT_P2__REGISTERED_IN_SET_SERVICES = eINSTANCE.getNUOPCModel__ImplementsInitP2_RegisteredInSetServices();

		/**
		 * The meta object literal for the '<em><b>Realizes Or Registered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_OR_REGISTERED = eINSTANCE.getNUOPCModel__ImplementsInitP2_RealizesOrRegistered();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__AdvertisesImportFieldImpl <em>Model Advertises Import Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__AdvertisesImportFieldImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__AdvertisesImportField()
		 * @generated
		 */
		EClass NUOPC_MODEL_ADVERTISES_IMPORT_FIELD = eINSTANCE.getNUOPCModel__AdvertisesImportField();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__PARENT = eINSTANCE.getNUOPCModel__AdvertisesImportField_Parent();

		/**
		 * The meta object literal for the '<em><b>Adds To State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE = eINSTANCE.getNUOPCModel__AdvertisesImportField_AddsToState();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__RC = eINSTANCE.getNUOPCModel__AdvertisesImportField_Rc();

		/**
		 * The meta object literal for the '<em><b>Adds To Import State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE = eINSTANCE.getNUOPCModel__AdvertisesImportField_AddsToImportState();

		/**
		 * The meta object literal for the '<em><b>Standard Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__STANDARD_NAME = eINSTANCE.getNUOPCModel__AdvertisesImportField_StandardName();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__AdvertisesExportFieldImpl <em>Model Advertises Export Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__AdvertisesExportFieldImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__AdvertisesExportField()
		 * @generated
		 */
		EClass NUOPC_MODEL_ADVERTISES_EXPORT_FIELD = eINSTANCE.getNUOPCModel__AdvertisesExportField();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT = eINSTANCE.getNUOPCModel__AdvertisesExportField_Parent();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__RC = eINSTANCE.getNUOPCModel__AdvertisesExportField_Rc();

		/**
		 * The meta object literal for the '<em><b>Adds To State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE = eINSTANCE.getNUOPCModel__AdvertisesExportField_AddsToState();

		/**
		 * The meta object literal for the '<em><b>Adds To Export State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE = eINSTANCE.getNUOPCModel__AdvertisesExportField_AddsToExportState();

		/**
		 * The meta object literal for the '<em><b>Standard Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__STANDARD_NAME = eINSTANCE.getNUOPCModel__AdvertisesExportField_StandardName();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__RealizesImportFieldImpl <em>Model Realizes Import Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__RealizesImportFieldImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__RealizesImportField()
		 * @generated
		 */
		EClass NUOPC_MODEL_REALIZES_IMPORT_FIELD = eINSTANCE.getNUOPCModel__RealizesImportField();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_REALIZES_IMPORT_FIELD__PARENT = eINSTANCE.getNUOPCModel__RealizesImportField_Parent();

		/**
		 * The meta object literal for the '<em><b>Realized In State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_REALIZES_IMPORT_FIELD__REALIZED_IN_STATE = eINSTANCE.getNUOPCModel__RealizesImportField_RealizedInState();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_REALIZES_IMPORT_FIELD__RC = eINSTANCE.getNUOPCModel__RealizesImportField_Rc();

		/**
		 * The meta object literal for the '<em><b>Realized In Import State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_REALIZES_IMPORT_FIELD__REALIZED_IN_IMPORT_STATE = eINSTANCE.getNUOPCModel__RealizesImportField_RealizedInImportState();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_REALIZES_IMPORT_FIELD__FIELD = eINSTANCE.getNUOPCModel__RealizesImportField_Field();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__RealizesExportFieldImpl <em>Model Realizes Export Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__RealizesExportFieldImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__RealizesExportField()
		 * @generated
		 */
		EClass NUOPC_MODEL_REALIZES_EXPORT_FIELD = eINSTANCE.getNUOPCModel__RealizesExportField();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT = eINSTANCE.getNUOPCModel__RealizesExportField_Parent();

		/**
		 * The meta object literal for the '<em><b>Realized In State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_STATE = eINSTANCE.getNUOPCModel__RealizesExportField_RealizedInState();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_REALIZES_EXPORT_FIELD__RC = eINSTANCE.getNUOPCModel__RealizesExportField_Rc();

		/**
		 * The meta object literal for the '<em><b>Realized In Export State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE = eINSTANCE.getNUOPCModel__RealizesExportField_RealizedInExportState();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_REALIZES_EXPORT_FIELD__FIELD = eINSTANCE.getNUOPCModel__RealizesExportField_Field();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ModelAdvanceImpl <em>Model Model Advance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ModelAdvanceImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCModel__ModelAdvance()
		 * @generated
		 */
		EClass NUOPC_MODEL_MODEL_ADVANCE = eINSTANCE.getNUOPCModel__ModelAdvance();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL_MODEL_ADVANCE__PARENT = eINSTANCE.getNUOPCModel__ModelAdvance_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_MODEL_ADVANCE__NAME = eINSTANCE.getNUOPCModel__ModelAdvance_Name();

		/**
		 * The meta object literal for the '<em><b>Attached Model Advance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL_MODEL_ADVANCE__ATTACHED_MODEL_ADVANCE = eINSTANCE.getNUOPCModel__ModelAdvance_AttachedModelAdvance();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL__INITIALIZE = eINSTANCE.getNUOPCModel_Initialize();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.CallsGenericSetServicesImpl <em>Calls Generic Set Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.CallsGenericSetServicesImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getCallsGenericSetServices()
		 * @generated
		 */
		EClass CALLS_GENERIC_SET_SERVICES = eINSTANCE.getCallsGenericSetServices();

		/**
		 * The meta object literal for the '<em><b>Gcomp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLS_GENERIC_SET_SERVICES__GCOMP = eINSTANCE.getCallsGenericSetServices_Gcomp();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLS_GENERIC_SET_SERVICES__RC = eINSTANCE.getCallsGenericSetServices_Rc();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.CallsSetEntryPointImpl <em>Calls Set Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.CallsSetEntryPointImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getCallsSetEntryPoint()
		 * @generated
		 */
		EClass CALLS_SET_ENTRY_POINT = eINSTANCE.getCallsSetEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLS_SET_ENTRY_POINT__METHOD = eINSTANCE.getCallsSetEntryPoint_Method();

		/**
		 * The meta object literal for the '<em><b>User Routine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLS_SET_ENTRY_POINT__USER_ROUTINE = eINSTANCE.getCallsSetEntryPoint_UserRoutine();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLS_SET_ENTRY_POINT__PHASE = eINSTANCE.getCallsSetEntryPoint_Phase();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver()
		 * @generated
		 */
		EClass NUOPC_DRIVER = eINSTANCE.getNUOPCDriver();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER__PARENT = eINSTANCE.getNUOPCDriver_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER__NAME = eINSTANCE.getNUOPCDriver_Name();

		/**
		 * The meta object literal for the '<em><b>Generic Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER__GENERIC_IMPORTS = eINSTANCE.getNUOPCDriver_GenericImports();

		/**
		 * The meta object literal for the '<em><b>Model Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER__MODEL_IMPORTS = eINSTANCE.getNUOPCDriver_ModelImports();

		/**
		 * The meta object literal for the '<em><b>Connector Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER__CONNECTOR_IMPORTS = eINSTANCE.getNUOPCDriver_ConnectorImports();

		/**
		 * The meta object literal for the '<em><b>Implements Set Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES = eINSTANCE.getNUOPCDriver_ImplementsSetServices();

		/**
		 * The meta object literal for the '<em><b>Implements Set Model Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT = eINSTANCE.getNUOPCDriver_ImplementsSetModelCount();

		/**
		 * The meta object literal for the '<em><b>Implements Set Model Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_SERVICES = eINSTANCE.getNUOPCDriver_ImplementsSetModelServices();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__GenericImportsImpl <em>Driver Generic Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__GenericImportsImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__GenericImports()
		 * @generated
		 */
		EClass NUOPC_DRIVER_GENERIC_IMPORTS = eINSTANCE.getNUOPCDriver__GenericImports();

		/**
		 * The meta object literal for the '<em><b>Imports Generic SS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_GENERIC_SS = eINSTANCE.getNUOPCDriver__GenericImports_ImportsGenericSS();

		/**
		 * The meta object literal for the '<em><b>Imports Type Driver IS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS = eINSTANCE.getNUOPCDriver__GenericImports_ImportsTypeDriverIS();

		/**
		 * The meta object literal for the '<em><b>Imports Label Set Model Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT = eINSTANCE.getNUOPCDriver__GenericImports_ImportsLabelSetModelCount();

		/**
		 * The meta object literal for the '<em><b>Imports Label Set Model Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES = eINSTANCE.getNUOPCDriver__GenericImports_ImportsLabelSetModelServices();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ModelImportsImpl <em>Driver Model Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ModelImportsImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ModelImports()
		 * @generated
		 */
		EClass NUOPC_DRIVER_MODEL_IMPORTS = eINSTANCE.getNUOPCDriver__ModelImports();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_MODEL_IMPORTS__PARENT = eINSTANCE.getNUOPCDriver__ModelImports_Parent();

		/**
		 * The meta object literal for the '<em><b>Model Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_MODEL_IMPORTS__MODEL_IMPORT = eINSTANCE.getNUOPCDriver__ModelImports_ModelImport();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ModelImports__ModelImportImpl <em>Driver Model Imports Model Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ModelImports__ModelImportImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ModelImports__ModelImport()
		 * @generated
		 */
		EClass NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT = eINSTANCE.getNUOPCDriver__ModelImports__ModelImport();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT__PARENT = eINSTANCE.getNUOPCDriver__ModelImports__ModelImport_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT__NAME = eINSTANCE.getNUOPCDriver__ModelImports__ModelImport_Name();

		/**
		 * The meta object literal for the '<em><b>Set Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT__SET_SERVICES = eINSTANCE.getNUOPCDriver__ModelImports__ModelImport_SetServices();

		/**
		 * The meta object literal for the '<em><b>Model Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT__MODEL_REF = eINSTANCE.getNUOPCDriver__ModelImports__ModelImport_ModelRef();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ConnectorImportsImpl <em>Driver Connector Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ConnectorImportsImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ConnectorImports()
		 * @generated
		 */
		EClass NUOPC_DRIVER_CONNECTOR_IMPORTS = eINSTANCE.getNUOPCDriver__ConnectorImports();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT = eINSTANCE.getNUOPCDriver__ConnectorImports_Parent();

		/**
		 * The meta object literal for the '<em><b>Connector Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_CONNECTOR_IMPORTS__CONNECTOR_IMPORT = eINSTANCE.getNUOPCDriver__ConnectorImports_ConnectorImport();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ConnectorImports__ConnectorImportImpl <em>Driver Connector Imports Connector Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ConnectorImports__ConnectorImportImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ConnectorImports__ConnectorImport()
		 * @generated
		 */
		EClass NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT = eINSTANCE.getNUOPCDriver__ConnectorImports__ConnectorImport();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT = eINSTANCE.getNUOPCDriver__ConnectorImports__ConnectorImport_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__NAME = eINSTANCE.getNUOPCDriver__ConnectorImports__ConnectorImport_Name();

		/**
		 * The meta object literal for the '<em><b>Set Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__SET_SERVICES = eINSTANCE.getNUOPCDriver__ConnectorImports__ConnectorImport_SetServices();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetServicesImpl <em>Driver Implements Set Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetServicesImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ImplementsSetServices()
		 * @generated
		 */
		EClass NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES = eINSTANCE.getNUOPCDriver__ImplementsSetServices();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARENT = eINSTANCE.getNUOPCDriver__ImplementsSetServices_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__NAME = eINSTANCE.getNUOPCDriver__ImplementsSetServices_Name();

		/**
		 * The meta object literal for the '<em><b>Param gcomp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP = eINSTANCE.getNUOPCDriver__ImplementsSetServices_Param_gcomp();

		/**
		 * The meta object literal for the '<em><b>Param rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARAM_RC = eINSTANCE.getNUOPCDriver__ImplementsSetServices_Param_rc();

		/**
		 * The meta object literal for the '<em><b>Calls Generic Set Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = eINSTANCE.getNUOPCDriver__ImplementsSetServices_CallsGenericSetServices();

		/**
		 * The meta object literal for the '<em><b>Attaches Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD = eINSTANCE.getNUOPCDriver__ImplementsSetServices_AttachesMethod();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesMethodImpl <em>Attaches Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesMethodImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getAttachesMethod()
		 * @generated
		 */
		EClass ATTACHES_METHOD = eINSTANCE.getAttachesMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHES_METHOD__NAME = eINSTANCE.getAttachesMethod_Name();

		/**
		 * The meta object literal for the '<em><b>User Routine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHES_METHOD__USER_ROUTINE = eINSTANCE.getAttachesMethod_UserRoutine();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHES_METHOD__INDEX = eINSTANCE.getAttachesMethod_Index();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelCountImpl <em>Driver Implements Set Model Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelCountImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ImplementsSetModelCount()
		 * @generated
		 */
		EClass NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT = eINSTANCE.getNUOPCDriver__ImplementsSetModelCount();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT = eINSTANCE.getNUOPCDriver__ImplementsSetModelCount_Parent();

		/**
		 * The meta object literal for the '<em><b>Gcomp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GCOMP = eINSTANCE.getNUOPCDriver__ImplementsSetModelCount_Gcomp();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__RC = eINSTANCE.getNUOPCDriver__ImplementsSetModelCount_Rc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__NAME = eINSTANCE.getNUOPCDriver__ImplementsSetModelCount_Name();

		/**
		 * The meta object literal for the '<em><b>Driver Internal State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__DRIVER_INTERNAL_STATE = eINSTANCE.getNUOPCDriver__ImplementsSetModelCount_DriverInternalState();

		/**
		 * The meta object literal for the '<em><b>Gets Internal State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE = eINSTANCE.getNUOPCDriver__ImplementsSetModelCount_GetsInternalState();

		/**
		 * The meta object literal for the '<em><b>Assigns Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__ASSIGNS_VALUE = eINSTANCE.getNUOPCDriver__ImplementsSetModelCount_AssignsValue();

		/**
		 * The meta object literal for the '<em><b>Attached</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__ATTACHED = eINSTANCE.getNUOPCDriver__ImplementsSetModelCount_Attached();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelServicesImpl <em>Driver Implements Set Model Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelServicesImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ImplementsSetModelServices()
		 * @generated
		 */
		EClass NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES = eINSTANCE.getNUOPCDriver__ImplementsSetModelServices();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__PARENT = eINSTANCE.getNUOPCDriver__ImplementsSetModelServices_Parent();

		/**
		 * The meta object literal for the '<em><b>Gcomp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__GCOMP = eINSTANCE.getNUOPCDriver__ImplementsSetModelServices_Gcomp();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__RC = eINSTANCE.getNUOPCDriver__ImplementsSetModelServices_Rc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__NAME = eINSTANCE.getNUOPCDriver__ImplementsSetModelServices_Name();

		/**
		 * The meta object literal for the '<em><b>Driver Internal State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__DRIVER_INTERNAL_STATE = eINSTANCE.getNUOPCDriver__ImplementsSetModelServices_DriverInternalState();

		/**
		 * The meta object literal for the '<em><b>Gets Internal State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__GETS_INTERNAL_STATE = eINSTANCE.getNUOPCDriver__ImplementsSetModelServices_GetsInternalState();

		/**
		 * The meta object literal for the '<em><b>Assigns Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__ASSIGNS_VALUE = eINSTANCE.getNUOPCDriver__ImplementsSetModelServices_AssignsValue();

		/**
		 * The meta object literal for the '<em><b>Attached</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__ATTACHED = eINSTANCE.getNUOPCDriver__ImplementsSetModelServices_Attached();

		/**
		 * The meta object literal for the '<em><b>Set Model Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__SET_MODEL_SERVICES = eINSTANCE.getNUOPCDriver__ImplementsSetModelServices_SetModelServices();

		/**
		 * The meta object literal for the '<em><b>Set Coupler Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__SET_COUPLER_SERVICES = eINSTANCE.getNUOPCDriver__ImplementsSetModelServices_SetCouplerServices();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.SetModelServicesImpl <em>Set Model Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.SetModelServicesImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getSetModelServices()
		 * @generated
		 */
		EClass SET_MODEL_SERVICES = eINSTANCE.getSetModelServices();

		/**
		 * The meta object literal for the '<em><b>Model Comp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_MODEL_SERVICES__MODEL_COMP = eINSTANCE.getSetModelServices_ModelComp();

		/**
		 * The meta object literal for the '<em><b>Subroutine Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_MODEL_SERVICES__SUBROUTINE_NAME = eINSTANCE.getSetModelServices_SubroutineName();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.SetCouplerServicesImpl <em>Set Coupler Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.SetCouplerServicesImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getSetCouplerServices()
		 * @generated
		 */
		EClass SET_COUPLER_SERVICES = eINSTANCE.getSetCouplerServices();

		/**
		 * The meta object literal for the '<em><b>Cpl Comp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_COUPLER_SERVICES__CPL_COMP = eINSTANCE.getSetCouplerServices_CplComp();

		/**
		 * The meta object literal for the '<em><b>Subroutine Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_COUPLER_SERVICES__SUBROUTINE_NAME = eINSTANCE.getSetCouplerServices_SubroutineName();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.GetsInternalStateImpl <em>Gets Internal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.GetsInternalStateImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getGetsInternalState()
		 * @generated
		 */
		EClass GETS_INTERNAL_STATE = eINSTANCE.getGetsInternalState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GETS_INTERNAL_STATE__LABEL = eINSTANCE.getGetsInternalState_Label();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediatorImpl <em>Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediatorImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator()
		 * @generated
		 */
		EClass NUOPC_MEDIATOR = eINSTANCE.getNUOPCMediator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR__NAME = eINSTANCE.getNUOPCMediator_Name();

		/**
		 * The meta object literal for the '<em><b>Generic Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR__GENERIC_IMPORTS = eINSTANCE.getNUOPCMediator_GenericImports();

		/**
		 * The meta object literal for the '<em><b>Implements Set Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR__IMPLEMENTS_SET_SERVICES = eINSTANCE.getNUOPCMediator_ImplementsSetServices();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR__INITIALIZE = eINSTANCE.getNUOPCMediator_Initialize();

		/**
		 * The meta object literal for the '<em><b>Implements Model Advance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR__IMPLEMENTS_MODEL_ADVANCE = eINSTANCE.getNUOPCMediator_ImplementsModelAdvance();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__GenericImportsImpl <em>Mediator Generic Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__GenericImportsImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__GenericImports()
		 * @generated
		 */
		EClass NUOPC_MEDIATOR_GENERIC_IMPORTS = eINSTANCE.getNUOPCMediator__GenericImports();

		/**
		 * The meta object literal for the '<em><b>Imports Generic SS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_GENERIC_IMPORTS__IMPORTS_GENERIC_SS = eINSTANCE.getNUOPCMediator__GenericImports_ImportsGenericSS();

		/**
		 * The meta object literal for the '<em><b>Imports Label Model Advance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_GENERIC_IMPORTS__IMPORTS_LABEL_MODEL_ADVANCE = eINSTANCE.getNUOPCMediator__GenericImports_ImportsLabelModelAdvance();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__InitImpl <em>Mediator Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__InitImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__Init()
		 * @generated
		 */
		EClass NUOPC_MEDIATOR_INIT = eINSTANCE.getNUOPCMediator__Init();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_INIT__PARENT = eINSTANCE.getNUOPCMediator__Init_Parent();

		/**
		 * The meta object literal for the '<em><b>Implements Init P1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1 = eINSTANCE.getNUOPCMediator__Init_ImplementsInitP1();

		/**
		 * The meta object literal for the '<em><b>Implements Init P2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P2 = eINSTANCE.getNUOPCMediator__Init_ImplementsInitP2();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsSetServicesImpl <em>Mediator Implements Set Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsSetServicesImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__ImplementsSetServices()
		 * @generated
		 */
		EClass NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES = eINSTANCE.getNUOPCMediator__ImplementsSetServices();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__PARENT = eINSTANCE.getNUOPCMediator__ImplementsSetServices_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__NAME = eINSTANCE.getNUOPCMediator__ImplementsSetServices_Name();

		/**
		 * The meta object literal for the '<em><b>Param gcomp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP = eINSTANCE.getNUOPCMediator__ImplementsSetServices_Param_gcomp();

		/**
		 * The meta object literal for the '<em><b>Param rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__PARAM_RC = eINSTANCE.getNUOPCMediator__ImplementsSetServices_Param_rc();

		/**
		 * The meta object literal for the '<em><b>Calls Generic Set Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = eINSTANCE.getNUOPCMediator__ImplementsSetServices_CallsGenericSetServices();

		/**
		 * The meta object literal for the '<em><b>Calls Set Entry Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT = eINSTANCE.getNUOPCMediator__ImplementsSetServices_CallsSetEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Attaches Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD = eINSTANCE.getNUOPCMediator__ImplementsSetServices_AttachesMethod();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP1Impl <em>Mediator Implements Init P1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP1Impl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__ImplementsInitP1()
		 * @generated
		 */
		EClass NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1 = eINSTANCE.getNUOPCMediator__ImplementsInitP1();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT = eINSTANCE.getNUOPCMediator__ImplementsInitP1_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__NAME = eINSTANCE.getNUOPCMediator__ImplementsInitP1_Name();

		/**
		 * The meta object literal for the '<em><b>Import Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__IMPORT_PARAM = eINSTANCE.getNUOPCMediator__ImplementsInitP1_ImportParam();

		/**
		 * The meta object literal for the '<em><b>Export Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__EXPORT_PARAM = eINSTANCE.getNUOPCMediator__ImplementsInitP1_ExportParam();

		/**
		 * The meta object literal for the '<em><b>Advertises Import Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD = eINSTANCE.getNUOPCMediator__ImplementsInitP1_AdvertisesImportField();

		/**
		 * The meta object literal for the '<em><b>Advertises Export Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD = eINSTANCE.getNUOPCMediator__ImplementsInitP1_AdvertisesExportField();

		/**
		 * The meta object literal for the '<em><b>Advertises At Least One Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD = eINSTANCE.getNUOPCMediator__ImplementsInitP1_AdvertisesAtLeastOneField();

		/**
		 * The meta object literal for the '<em><b>Registered In Set Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES = eINSTANCE.getNUOPCMediator__ImplementsInitP1_RegisteredInSetServices();

		/**
		 * The meta object literal for the '<em><b>Advertises Or Registered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED = eINSTANCE.getNUOPCMediator__ImplementsInitP1_AdvertisesOrRegistered();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP2Impl <em>Mediator Implements Init P2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP2Impl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__ImplementsInitP2()
		 * @generated
		 */
		EClass NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2 = eINSTANCE.getNUOPCMediator__ImplementsInitP2();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__PARENT = eINSTANCE.getNUOPCMediator__ImplementsInitP2_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__NAME = eINSTANCE.getNUOPCMediator__ImplementsInitP2_Name();

		/**
		 * The meta object literal for the '<em><b>Import Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__IMPORT_PARAM = eINSTANCE.getNUOPCMediator__ImplementsInitP2_ImportParam();

		/**
		 * The meta object literal for the '<em><b>Export Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__EXPORT_PARAM = eINSTANCE.getNUOPCMediator__ImplementsInitP2_ExportParam();

		/**
		 * The meta object literal for the '<em><b>Realizes Import Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD = eINSTANCE.getNUOPCMediator__ImplementsInitP2_RealizesImportField();

		/**
		 * The meta object literal for the '<em><b>Realizes Export Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD = eINSTANCE.getNUOPCMediator__ImplementsInitP2_RealizesExportField();

		/**
		 * The meta object literal for the '<em><b>Realizes At Least One Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD = eINSTANCE.getNUOPCMediator__ImplementsInitP2_RealizesAtLeastOneField();

		/**
		 * The meta object literal for the '<em><b>Registered In Set Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REGISTERED_IN_SET_SERVICES = eINSTANCE.getNUOPCMediator__ImplementsInitP2_RegisteredInSetServices();

		/**
		 * The meta object literal for the '<em><b>Realizes Or Registered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REALIZES_OR_REGISTERED = eINSTANCE.getNUOPCMediator__ImplementsInitP2_RealizesOrRegistered();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__AdvertisesImportFieldImpl <em>Mediator Advertises Import Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__AdvertisesImportFieldImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__AdvertisesImportField()
		 * @generated
		 */
		EClass NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD = eINSTANCE.getNUOPCMediator__AdvertisesImportField();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__PARENT = eINSTANCE.getNUOPCMediator__AdvertisesImportField_Parent();

		/**
		 * The meta object literal for the '<em><b>Adds To State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE = eINSTANCE.getNUOPCMediator__AdvertisesImportField_AddsToState();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__RC = eINSTANCE.getNUOPCMediator__AdvertisesImportField_Rc();

		/**
		 * The meta object literal for the '<em><b>Adds To Import State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE = eINSTANCE.getNUOPCMediator__AdvertisesImportField_AddsToImportState();

		/**
		 * The meta object literal for the '<em><b>Standard Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__STANDARD_NAME = eINSTANCE.getNUOPCMediator__AdvertisesImportField_StandardName();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__AdvertisesExportFieldImpl <em>Mediator Advertises Export Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__AdvertisesExportFieldImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__AdvertisesExportField()
		 * @generated
		 */
		EClass NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD = eINSTANCE.getNUOPCMediator__AdvertisesExportField();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__PARENT = eINSTANCE.getNUOPCMediator__AdvertisesExportField_Parent();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__RC = eINSTANCE.getNUOPCMediator__AdvertisesExportField_Rc();

		/**
		 * The meta object literal for the '<em><b>Adds To State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE = eINSTANCE.getNUOPCMediator__AdvertisesExportField_AddsToState();

		/**
		 * The meta object literal for the '<em><b>Adds To Export State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE = eINSTANCE.getNUOPCMediator__AdvertisesExportField_AddsToExportState();

		/**
		 * The meta object literal for the '<em><b>Standard Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__STANDARD_NAME = eINSTANCE.getNUOPCMediator__AdvertisesExportField_StandardName();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__RealizesImportFieldImpl <em>Mediator Realizes Import Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__RealizesImportFieldImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__RealizesImportField()
		 * @generated
		 */
		EClass NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD = eINSTANCE.getNUOPCMediator__RealizesImportField();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__PARENT = eINSTANCE.getNUOPCMediator__RealizesImportField_Parent();

		/**
		 * The meta object literal for the '<em><b>Realized In State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__REALIZED_IN_STATE = eINSTANCE.getNUOPCMediator__RealizesImportField_RealizedInState();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__RC = eINSTANCE.getNUOPCMediator__RealizesImportField_Rc();

		/**
		 * The meta object literal for the '<em><b>Realized In Import State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__REALIZED_IN_IMPORT_STATE = eINSTANCE.getNUOPCMediator__RealizesImportField_RealizedInImportState();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__FIELD = eINSTANCE.getNUOPCMediator__RealizesImportField_Field();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__RealizesExportFieldImpl <em>Mediator Realizes Export Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__RealizesExportFieldImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__RealizesExportField()
		 * @generated
		 */
		EClass NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD = eINSTANCE.getNUOPCMediator__RealizesExportField();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__PARENT = eINSTANCE.getNUOPCMediator__RealizesExportField_Parent();

		/**
		 * The meta object literal for the '<em><b>Realized In State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__REALIZED_IN_STATE = eINSTANCE.getNUOPCMediator__RealizesExportField_RealizedInState();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__RC = eINSTANCE.getNUOPCMediator__RealizesExportField_Rc();

		/**
		 * The meta object literal for the '<em><b>Realized In Export State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE = eINSTANCE.getNUOPCMediator__RealizesExportField_RealizedInExportState();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__FIELD = eINSTANCE.getNUOPCMediator__RealizesExportField_Field();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ModelAdvanceImpl <em>Mediator Model Advance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ModelAdvanceImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCMediator__ModelAdvance()
		 * @generated
		 */
		EClass NUOPC_MEDIATOR_MODEL_ADVANCE = eINSTANCE.getNUOPCMediator__ModelAdvance();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MEDIATOR_MODEL_ADVANCE__PARENT = eINSTANCE.getNUOPCMediator__ModelAdvance_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_MODEL_ADVANCE__NAME = eINSTANCE.getNUOPCMediator__ModelAdvance_Name();

		/**
		 * The meta object literal for the '<em><b>Attached Model Advance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MEDIATOR_MODEL_ADVANCE__ATTACHED_MODEL_ADVANCE = eINSTANCE.getNUOPCMediator__ModelAdvance_AttachedModelAdvance();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCApplicationImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCApplication()
		 * @generated
		 */
		EClass NUOPC_APPLICATION = eINSTANCE.getNUOPCApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_APPLICATION__NAME = eINSTANCE.getNUOPCApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Nuopc Driver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_APPLICATION__NUOPC_DRIVER = eINSTANCE.getNUOPCApplication_NuopcDriver();

		/**
		 * The meta object literal for the '<em><b>Nuopc Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_APPLICATION__NUOPC_MODEL = eINSTANCE.getNUOPCApplication_NuopcModel();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.TopImpl <em>Top</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.TopImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getTop()
		 * @generated
		 */
		EClass TOP = eINSTANCE.getTop();

		/**
		 * The meta object literal for the '<em><b>Apps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP__APPS = eINSTANCE.getTop_Apps();

		/**
		 * The meta object literal for the '<em><b>Nuopc Driver Atm Ocn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_APPLICATION__NUOPC_DRIVER_ATM_OCN = eINSTANCE.getNUOPCApplication_NuopcDriverAtmOcn();

		/**
		 * The meta object literal for the '<em><b>Nuopc Mediator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_APPLICATION__NUOPC_MEDIATOR = eINSTANCE.getNUOPCApplication_NuopcMediator();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl <em>Driver Atm Ocn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn()
		 * @generated
		 */
		EClass NUOPC_DRIVER_ATM_OCN = eINSTANCE.getNUOPCDriverAtmOcn();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN__PARENT = eINSTANCE.getNUOPCDriverAtmOcn_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN__NAME = eINSTANCE.getNUOPCDriverAtmOcn_Name();

		/**
		 * The meta object literal for the '<em><b>Generic Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS = eINSTANCE.getNUOPCDriverAtmOcn_GenericImports();

		/**
		 * The meta object literal for the '<em><b>Model Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS = eINSTANCE.getNUOPCDriverAtmOcn_ModelImports();

		/**
		 * The meta object literal for the '<em><b>Implements Set Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES = eINSTANCE.getNUOPCDriverAtmOcn_ImplementsSetServices();

		/**
		 * The meta object literal for the '<em><b>Implements Set Model Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT = eINSTANCE.getNUOPCDriverAtmOcn_ImplementsSetModelCount();

		/**
		 * The meta object literal for the '<em><b>Implements Set Model Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES = eINSTANCE.getNUOPCDriverAtmOcn_ImplementsSetModelServices();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__GenericImportsImpl <em>Driver Atm Ocn Generic Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__GenericImportsImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn__GenericImports()
		 * @generated
		 */
		EClass NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS = eINSTANCE.getNUOPCDriverAtmOcn__GenericImports();

		/**
		 * The meta object literal for the '<em><b>Imports Generic SS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_GENERIC_SS = eINSTANCE.getNUOPCDriverAtmOcn__GenericImports_ImportsGenericSS();

		/**
		 * The meta object literal for the '<em><b>Imports Type Driver IS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS = eINSTANCE.getNUOPCDriverAtmOcn__GenericImports_ImportsTypeDriverIS();

		/**
		 * The meta object literal for the '<em><b>Imports Label Set Model Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT = eINSTANCE.getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelCount();

		/**
		 * The meta object literal for the '<em><b>Imports Label Set Model Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES = eINSTANCE.getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelServices();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ModelImportsImpl <em>Driver Atm Ocn Model Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ModelImportsImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn__ModelImports()
		 * @generated
		 */
		EClass NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS = eINSTANCE.getNUOPCDriverAtmOcn__ModelImports();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT = eINSTANCE.getNUOPCDriverAtmOcn__ModelImports_Parent();

		/**
		 * The meta object literal for the '<em><b>Model Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__MODEL_IMPORT = eINSTANCE.getNUOPCDriverAtmOcn__ModelImports_ModelImport();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetServicesImpl <em>Driver Atm Ocn Implements Set Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetServicesImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn__ImplementsSetServices()
		 * @generated
		 */
		EClass NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetServices();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetServices_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__NAME = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetServices_Name();

		/**
		 * The meta object literal for the '<em><b>Param gcomp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetServices_Param_gcomp();

		/**
		 * The meta object literal for the '<em><b>Param rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_RC = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetServices_Param_rc();

		/**
		 * The meta object literal for the '<em><b>Calls Generic Set Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetServices_CallsGenericSetServices();

		/**
		 * The meta object literal for the '<em><b>Attaches Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetServices_AttachesMethod();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetModelCountImpl <em>Driver Atm Ocn Implements Set Model Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetModelCountImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn__ImplementsSetModelCount()
		 * @generated
		 */
		EClass NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelCount();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__PARENT = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelCount_Parent();

		/**
		 * The meta object literal for the '<em><b>Gcomp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__GCOMP = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelCount_Gcomp();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__RC = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelCount_Rc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__NAME = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelCount_Name();

		/**
		 * The meta object literal for the '<em><b>Driver Internal State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__DRIVER_INTERNAL_STATE = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelCount_DriverInternalState();

		/**
		 * The meta object literal for the '<em><b>Gets Internal State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelCount_GetsInternalState();

		/**
		 * The meta object literal for the '<em><b>Assigns Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__ASSIGNS_VALUE = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelCount_AssignsValue();

		/**
		 * The meta object literal for the '<em><b>Attached</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__ATTACHED = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelCount_Attached();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetModelServicesImpl <em>Driver Atm Ocn Implements Set Model Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetModelServicesImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn__ImplementsSetModelServices()
		 * @generated
		 */
		EClass NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelServices();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__PARENT = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelServices_Parent();

		/**
		 * The meta object literal for the '<em><b>Gcomp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__GCOMP = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelServices_Gcomp();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__RC = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelServices_Rc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__NAME = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelServices_Name();

		/**
		 * The meta object literal for the '<em><b>Driver Internal State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__DRIVER_INTERNAL_STATE = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelServices_DriverInternalState();

		/**
		 * The meta object literal for the '<em><b>Gets Internal State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__GETS_INTERNAL_STATE = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelServices_GetsInternalState();

		/**
		 * The meta object literal for the '<em><b>Assigns Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__ASSIGNS_VALUE = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelServices_AssignsValue();

		/**
		 * The meta object literal for the '<em><b>Attached</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__ATTACHED = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelServices_Attached();

		/**
		 * The meta object literal for the '<em><b>Set Model Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__SET_MODEL_SERVICES = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelServices_SetModelServices();

		/**
		 * The meta object literal for the '<em><b>Set Coupler Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__SET_COUPLER_SERVICES = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetModelServices_SetCouplerServices();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ModelImports__ModelImportImpl <em>Driver Atm Ocn Model Imports Model Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ModelImports__ModelImportImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn__ModelImports__ModelImport()
		 * @generated
		 */
		EClass NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT = eINSTANCE.getNUOPCDriverAtmOcn__ModelImports__ModelImport();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT__PARENT = eINSTANCE.getNUOPCDriverAtmOcn__ModelImports__ModelImport_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT__NAME = eINSTANCE.getNUOPCDriverAtmOcn__ModelImports__ModelImport_Name();

		/**
		 * The meta object literal for the '<em><b>Set Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT__SET_SERVICES = eINSTANCE.getNUOPCDriverAtmOcn__ModelImports__ModelImport_SetServices();

		/**
		 * The meta object literal for the '<em><b>Model Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT__MODEL_REF = eINSTANCE.getNUOPCDriverAtmOcn__ModelImports__ModelImport_ModelRef();

	}

} //NUOPCPackage
