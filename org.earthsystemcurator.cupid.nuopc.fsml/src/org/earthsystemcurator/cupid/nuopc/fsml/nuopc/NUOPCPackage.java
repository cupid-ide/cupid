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
	int NUOPC_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uses All Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL__USES_ALL_IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Single Public Subroutine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL__SINGLE_PUBLIC_SUBROUTINE = 2;

	/**
	 * The feature id for the '<em><b>Implements Set Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL__IMPLEMENTS_SET_SERVICES = 3;

	/**
	 * The feature id for the '<em><b>Implements Init P1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL__IMPLEMENTS_INIT_P1 = 4;

	/**
	 * The feature id for the '<em><b>Implements Init P2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL__IMPLEMENTS_INIT_P2 = 5;

	/**
	 * The feature id for the '<em><b>Implements Model Advance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE = 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl <em>Model Implements Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModelImplementsSetServices()
	 * @generated
	 */
	int MODEL_IMPLEMENTS_SET_SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_SET_SERVICES__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_SET_SERVICES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Param gcomp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP = 2;

	/**
	 * The feature id for the '<em><b>Param rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_SET_SERVICES__PARAM_RC = 3;

	/**
	 * The feature id for the '<em><b>Calls Generic Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Calls Set Entry Point Phase1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1 = 5;

	/**
	 * The feature id for the '<em><b>Calls Set Entry Point Phase2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2 = 6;

	/**
	 * The feature id for the '<em><b>Attaches Model Advance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE = 7;

	/**
	 * The number of structural features of the '<em>Model Implements Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_SET_SERVICES_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl <em>Model Implements Init P1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModelImplementsInitP1()
	 * @generated
	 */
	int MODEL_IMPLEMENTS_INIT_P1 = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P1__NAME = 0;

	/**
	 * The feature id for the '<em><b>Import Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM = 1;

	/**
	 * The feature id for the '<em><b>Export Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Advertises Import Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Advertises Export Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Advertises At Least One Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD = 5;

	/**
	 * The number of structural features of the '<em>Model Implements Init P1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P1_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP2Impl <em>Model Implements Init P2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP2Impl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModelImplementsInitP2()
	 * @generated
	 */
	int MODEL_IMPLEMENTS_INIT_P2 = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P2__NAME = 0;

	/**
	 * The feature id for the '<em><b>Import Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P2__IMPORT_PARAM = 1;

	/**
	 * The feature id for the '<em><b>Export Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P2__EXPORT_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Realizes Import Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Realizes Export Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Realizes At Least One Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD = 5;

	/**
	 * The number of structural features of the '<em>Model Implements Init P2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_IMPLEMENTS_INIT_P2_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AdvertisesImportFieldImpl <em>Advertises Import Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AdvertisesImportFieldImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getAdvertisesImportField()
	 * @generated
	 */
	int ADVERTISES_IMPORT_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISES_IMPORT_FIELD__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Adds To State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE = 1;

	/**
	 * The feature id for the '<em><b>Adds To Import State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE = 2;

	/**
	 * The feature id for the '<em><b>Standard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISES_IMPORT_FIELD__STANDARD_NAME = 3;

	/**
	 * The number of structural features of the '<em>Advertises Import Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISES_IMPORT_FIELD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AdvertisesExportFieldImpl <em>Advertises Export Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AdvertisesExportFieldImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getAdvertisesExportField()
	 * @generated
	 */
	int ADVERTISES_EXPORT_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISES_EXPORT_FIELD__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Adds To State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE = 1;

	/**
	 * The feature id for the '<em><b>Adds To Export State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE = 2;

	/**
	 * The feature id for the '<em><b>Standard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISES_EXPORT_FIELD__STANDARD_NAME = 3;

	/**
	 * The number of structural features of the '<em>Advertises Export Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISES_EXPORT_FIELD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.RealizesImportFieldImpl <em>Realizes Import Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.RealizesImportFieldImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getRealizesImportField()
	 * @generated
	 */
	int REALIZES_IMPORT_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_IMPORT_FIELD__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Realized In State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_IMPORT_FIELD__REALIZED_IN_STATE = 1;

	/**
	 * The feature id for the '<em><b>Realized In Import State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_IMPORT_FIELD__REALIZED_IN_IMPORT_STATE = 2;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_IMPORT_FIELD__FIELD = 3;

	/**
	 * The number of structural features of the '<em>Realizes Import Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_IMPORT_FIELD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.RealizesExportFieldImpl <em>Realizes Export Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.RealizesExportFieldImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getRealizesExportField()
	 * @generated
	 */
	int REALIZES_EXPORT_FIELD = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_EXPORT_FIELD__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Realized In State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_EXPORT_FIELD__REALIZED_IN_STATE = 1;

	/**
	 * The feature id for the '<em><b>Realized In Export State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE = 2;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_EXPORT_FIELD__FIELD = 3;

	/**
	 * The number of structural features of the '<em>Realizes Export Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_EXPORT_FIELD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesModelAdvanceImpl <em>Attaches Model Advance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesModelAdvanceImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getAttachesModelAdvance()
	 * @generated
	 */
	int ATTACHES_MODEL_ADVANCE = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_MODEL_ADVANCE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_MODEL_ADVANCE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>User Routine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_MODEL_ADVANCE__USER_ROUTINE = 2;

	/**
	 * The number of structural features of the '<em>Attaches Model Advance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_MODEL_ADVANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelAdvanceImpl <em>Model Advance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelAdvanceImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModelAdvance()
	 * @generated
	 */
	int MODEL_ADVANCE = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ADVANCE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ADVANCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Attached In Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ADVANCE__ATTACHED_IN_SET_SERVICES = 2;

	/**
	 * The number of structural features of the '<em>Model Advance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ADVANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver()
	 * @generated
	 */
	int NUOPC_DRIVER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Imports Type Driver IS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__IMPORTS_TYPE_DRIVER_IS = 1;

	/**
	 * The feature id for the '<em><b>Implements Set Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Implements Set Model Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetServicesImpl <em>Driver Implements Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ImplementsSetServices()
	 * @generated
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES = 11;

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
	 * The feature id for the '<em><b>Calls Generic Set Services</b></em>' attribute.
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
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesMethodImpl <em>Attaches Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesMethodImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getAttachesMethod()
	 * @generated
	 */
	int ATTACHES_METHOD = 12;

	/**
	 * The feature id for the '<em><b>Method Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_METHOD__METHOD_LABEL = 0;

	/**
	 * The feature id for the '<em><b>User Routine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_METHOD__USER_ROUTINE = 1;

	/**
	 * The number of structural features of the '<em>Attaches Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_METHOD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelCountImpl <em>Driver Implements Set Model Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelCountImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriver__ImplementsSetModelCount()
	 * @generated
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Driver Internal State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__DRIVER_INTERNAL_STATE = 2;

	/**
	 * The feature id for the '<em><b>Gets Internal State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE = 3;

	/**
	 * The feature id for the '<em><b>Assigns Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__ASSIGNS_VALUE = 4;

	/**
	 * The number of structural features of the '<em>Driver Implements Set Model Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.GetsInternalStateImpl <em>Gets Internal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.GetsInternalStateImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getGetsInternalState()
	 * @generated
	 */
	int GETS_INTERNAL_STATE = 14;

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
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCApplicationImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCApplication()
	 * @generated
	 */
	int NUOPC_APPLICATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nuopc Driver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION__NUOPC_DRIVER = 1;

	/**
	 * The feature id for the '<em><b>Nuopc Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION__NUOPC_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Nuopc Driver Atm Ocn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION__NUOPC_DRIVER_ATM_OCN = 3;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl <em>Driver Atm Ocn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn()
	 * @generated
	 */
	int NUOPC_DRIVER_ATM_OCN = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Implements Set Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES = 1;

	/**
	 * The number of structural features of the '<em>Driver Atm Ocn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetServicesImpl <em>Driver Atm Ocn Implements Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getNUOPCDriverAtmOcn__ImplementsSetServices()
	 * @generated
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES = 17;

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
	 * The feature id for the '<em><b>Calls Generic Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = 4;

	/**
	 * The number of structural features of the '<em>Driver Atm Ocn Implements Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES_FEATURE_COUNT = 5;


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
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#isUsesAllImports <em>Uses All Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses All Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#isUsesAllImports()
	 * @see #getNUOPCModel()
	 * @generated
	 */
	EAttribute getNUOPCModel_UsesAllImports();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getSinglePublicSubroutine <em>Single Public Subroutine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Public Subroutine</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getSinglePublicSubroutine()
	 * @see #getNUOPCModel()
	 * @generated
	 */
	EAttribute getNUOPCModel_SinglePublicSubroutine();

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
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsInitP1 <em>Implements Init P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Init P1</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsInitP1()
	 * @see #getNUOPCModel()
	 * @generated
	 */
	EReference getNUOPCModel_ImplementsInitP1();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsInitP2 <em>Implements Init P2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Init P2</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsInitP2()
	 * @see #getNUOPCModel()
	 * @generated
	 */
	EReference getNUOPCModel_ImplementsInitP2();

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
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices <em>Model Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Implements Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices
	 * @generated
	 */
	EClass getModelImplementsSetServices();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParent()
	 * @see #getModelImplementsSetServices()
	 * @generated
	 */
	EReference getModelImplementsSetServices_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getName()
	 * @see #getModelImplementsSetServices()
	 * @generated
	 */
	EAttribute getModelImplementsSetServices_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParam_gcomp <em>Param gcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param gcomp</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParam_gcomp()
	 * @see #getModelImplementsSetServices()
	 * @generated
	 */
	EAttribute getModelImplementsSetServices_Param_gcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParam_rc <em>Param rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParam_rc()
	 * @see #getModelImplementsSetServices()
	 * @generated
	 */
	EAttribute getModelImplementsSetServices_Param_rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsGenericSetServices <em>Calls Generic Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calls Generic Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsGenericSetServices()
	 * @see #getModelImplementsSetServices()
	 * @generated
	 */
	EAttribute getModelImplementsSetServices_CallsGenericSetServices();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsSetEntryPointPhase1 <em>Calls Set Entry Point Phase1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calls Set Entry Point Phase1</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsSetEntryPointPhase1()
	 * @see #getModelImplementsSetServices()
	 * @generated
	 */
	EAttribute getModelImplementsSetServices_CallsSetEntryPointPhase1();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsSetEntryPointPhase2 <em>Calls Set Entry Point Phase2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calls Set Entry Point Phase2</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsSetEntryPointPhase2()
	 * @see #getModelImplementsSetServices()
	 * @generated
	 */
	EAttribute getModelImplementsSetServices_CallsSetEntryPointPhase2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getAttachesModelAdvance <em>Attaches Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attaches Model Advance</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getAttachesModelAdvance()
	 * @see #getModelImplementsSetServices()
	 * @generated
	 */
	EReference getModelImplementsSetServices_AttachesModelAdvance();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1 <em>Model Implements Init P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Implements Init P1</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1
	 * @generated
	 */
	EClass getModelImplementsInitP1();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getName()
	 * @see #getModelImplementsInitP1()
	 * @generated
	 */
	EAttribute getModelImplementsInitP1_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getImportParam <em>Import Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Param</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getImportParam()
	 * @see #getModelImplementsInitP1()
	 * @generated
	 */
	EAttribute getModelImplementsInitP1_ImportParam();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getExportParam <em>Export Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Export Param</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getExportParam()
	 * @see #getModelImplementsInitP1()
	 * @generated
	 */
	EAttribute getModelImplementsInitP1_ExportParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getAdvertisesImportField <em>Advertises Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advertises Import Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getAdvertisesImportField()
	 * @see #getModelImplementsInitP1()
	 * @generated
	 */
	EReference getModelImplementsInitP1_AdvertisesImportField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getAdvertisesExportField <em>Advertises Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advertises Export Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getAdvertisesExportField()
	 * @see #getModelImplementsInitP1()
	 * @generated
	 */
	EReference getModelImplementsInitP1_AdvertisesExportField();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#isAdvertisesAtLeastOneField <em>Advertises At Least One Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advertises At Least One Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#isAdvertisesAtLeastOneField()
	 * @see #getModelImplementsInitP1()
	 * @generated
	 */
	EAttribute getModelImplementsInitP1_AdvertisesAtLeastOneField();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2 <em>Model Implements Init P2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Implements Init P2</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2
	 * @generated
	 */
	EClass getModelImplementsInitP2();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getName()
	 * @see #getModelImplementsInitP2()
	 * @generated
	 */
	EAttribute getModelImplementsInitP2_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getImportParam <em>Import Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Param</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getImportParam()
	 * @see #getModelImplementsInitP2()
	 * @generated
	 */
	EAttribute getModelImplementsInitP2_ImportParam();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getExportParam <em>Export Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Export Param</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getExportParam()
	 * @see #getModelImplementsInitP2()
	 * @generated
	 */
	EAttribute getModelImplementsInitP2_ExportParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getRealizesImportField <em>Realizes Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realizes Import Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getRealizesImportField()
	 * @see #getModelImplementsInitP2()
	 * @generated
	 */
	EReference getModelImplementsInitP2_RealizesImportField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getRealizesExportField <em>Realizes Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realizes Export Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getRealizesExportField()
	 * @see #getModelImplementsInitP2()
	 * @generated
	 */
	EReference getModelImplementsInitP2_RealizesExportField();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#isRealizesAtLeastOneField <em>Realizes At Least One Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realizes At Least One Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#isRealizesAtLeastOneField()
	 * @see #getModelImplementsInitP2()
	 * @generated
	 */
	EAttribute getModelImplementsInitP2_RealizesAtLeastOneField();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField <em>Advertises Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advertises Import Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField
	 * @generated
	 */
	EClass getAdvertisesImportField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getParent()
	 * @see #getAdvertisesImportField()
	 * @generated
	 */
	EReference getAdvertisesImportField_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getAddsToState <em>Adds To State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adds To State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getAddsToState()
	 * @see #getAdvertisesImportField()
	 * @generated
	 */
	EAttribute getAdvertisesImportField_AddsToState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#isAddsToImportState <em>Adds To Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adds To Import State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#isAddsToImportState()
	 * @see #getAdvertisesImportField()
	 * @generated
	 */
	EAttribute getAdvertisesImportField_AddsToImportState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getStandardName <em>Standard Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getStandardName()
	 * @see #getAdvertisesImportField()
	 * @generated
	 */
	EAttribute getAdvertisesImportField_StandardName();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField <em>Advertises Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advertises Export Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField
	 * @generated
	 */
	EClass getAdvertisesExportField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField#getParent()
	 * @see #getAdvertisesExportField()
	 * @generated
	 */
	EReference getAdvertisesExportField_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField#getAddsToState <em>Adds To State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adds To State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField#getAddsToState()
	 * @see #getAdvertisesExportField()
	 * @generated
	 */
	EAttribute getAdvertisesExportField_AddsToState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField#isAddsToExportState <em>Adds To Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adds To Export State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField#isAddsToExportState()
	 * @see #getAdvertisesExportField()
	 * @generated
	 */
	EAttribute getAdvertisesExportField_AddsToExportState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField#getStandardName <em>Standard Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField#getStandardName()
	 * @see #getAdvertisesExportField()
	 * @generated
	 */
	EAttribute getAdvertisesExportField_StandardName();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField <em>Realizes Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realizes Import Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField
	 * @generated
	 */
	EClass getRealizesImportField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField#getParent()
	 * @see #getRealizesImportField()
	 * @generated
	 */
	EReference getRealizesImportField_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField#getRealizedInState <em>Realized In State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized In State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField#getRealizedInState()
	 * @see #getRealizesImportField()
	 * @generated
	 */
	EAttribute getRealizesImportField_RealizedInState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField#isRealizedInImportState <em>Realized In Import State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized In Import State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField#isRealizedInImportState()
	 * @see #getRealizesImportField()
	 * @generated
	 */
	EAttribute getRealizesImportField_RealizedInImportState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField#getField()
	 * @see #getRealizesImportField()
	 * @generated
	 */
	EAttribute getRealizesImportField_Field();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField <em>Realizes Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realizes Export Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField
	 * @generated
	 */
	EClass getRealizesExportField();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getParent()
	 * @see #getRealizesExportField()
	 * @generated
	 */
	EReference getRealizesExportField_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getRealizedInState <em>Realized In State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized In State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getRealizedInState()
	 * @see #getRealizesExportField()
	 * @generated
	 */
	EAttribute getRealizesExportField_RealizedInState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#isRealizedInExportState <em>Realized In Export State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized In Export State</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#isRealizedInExportState()
	 * @see #getRealizesExportField()
	 * @generated
	 */
	EAttribute getRealizesExportField_RealizedInExportState();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getField()
	 * @see #getRealizesExportField()
	 * @generated
	 */
	EAttribute getRealizesExportField_Field();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance <em>Attaches Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attaches Model Advance</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance
	 * @generated
	 */
	EClass getAttachesModelAdvance();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance#getParent()
	 * @see #getAttachesModelAdvance()
	 * @generated
	 */
	EReference getAttachesModelAdvance_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance#getLabel()
	 * @see #getAttachesModelAdvance()
	 * @generated
	 */
	EAttribute getAttachesModelAdvance_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance#getUserRoutine <em>User Routine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Routine</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance#getUserRoutine()
	 * @see #getAttachesModelAdvance()
	 * @generated
	 */
	EAttribute getAttachesModelAdvance_UserRoutine();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance <em>Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Advance</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance
	 * @generated
	 */
	EClass getModelAdvance();

	/**
	 * Returns the meta object for the container reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#getParent()
	 * @see #getModelAdvance()
	 * @generated
	 */
	EReference getModelAdvance_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#getName()
	 * @see #getModelAdvance()
	 * @generated
	 */
	EAttribute getModelAdvance_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#isAttachedInSetServices <em>Attached In Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached In Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#isAttachedInSetServices()
	 * @see #getModelAdvance()
	 * @generated
	 */
	EAttribute getModelAdvance_AttachedInSetServices();

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
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImportsTypeDriverIS <em>Imports Type Driver IS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports Type Driver IS</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImportsTypeDriverIS()
	 * @see #getNUOPCDriver()
	 * @generated
	 */
	EAttribute getNUOPCDriver_ImportsTypeDriverIS();

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
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetModelCount <em>Implements Set Model Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements Set Model Count</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetModelCount()
	 * @see #getNUOPCDriver()
	 * @generated
	 */
	EReference getNUOPCDriver_ImplementsSetModelCount();

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
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#isCallsGenericSetServices <em>Calls Generic Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calls Generic Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#isCallsGenericSetServices()
	 * @see #getNUOPCDriver__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCDriver__ImplementsSetServices_CallsGenericSetServices();

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
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod#getMethodLabel <em>Method Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Label</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod#getMethodLabel()
	 * @see #getAttachesMethod()
	 * @generated
	 */
	EAttribute getAttachesMethod_MethodLabel();

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
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn <em>Driver Atm Ocn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Atm Ocn</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn
	 * @generated
	 */
	EClass getNUOPCDriverAtmOcn();

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
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#isCallsGenericSetServices <em>Calls Generic Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calls Generic Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#isCallsGenericSetServices()
	 * @see #getNUOPCDriverAtmOcn__ImplementsSetServices()
	 * @generated
	 */
	EAttribute getNUOPCDriverAtmOcn__ImplementsSetServices_CallsGenericSetServices();

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
		 * The meta object literal for the '<em><b>Uses All Imports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL__USES_ALL_IMPORTS = eINSTANCE.getNUOPCModel_UsesAllImports();

		/**
		 * The meta object literal for the '<em><b>Single Public Subroutine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_MODEL__SINGLE_PUBLIC_SUBROUTINE = eINSTANCE.getNUOPCModel_SinglePublicSubroutine();

		/**
		 * The meta object literal for the '<em><b>Implements Set Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL__IMPLEMENTS_SET_SERVICES = eINSTANCE.getNUOPCModel_ImplementsSetServices();

		/**
		 * The meta object literal for the '<em><b>Implements Init P1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL__IMPLEMENTS_INIT_P1 = eINSTANCE.getNUOPCModel_ImplementsInitP1();

		/**
		 * The meta object literal for the '<em><b>Implements Init P2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL__IMPLEMENTS_INIT_P2 = eINSTANCE.getNUOPCModel_ImplementsInitP2();

		/**
		 * The meta object literal for the '<em><b>Implements Model Advance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE = eINSTANCE.getNUOPCModel_ImplementsModelAdvance();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl <em>Model Implements Set Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModelImplementsSetServices()
		 * @generated
		 */
		EClass MODEL_IMPLEMENTS_SET_SERVICES = eINSTANCE.getModelImplementsSetServices();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_IMPLEMENTS_SET_SERVICES__PARENT = eINSTANCE.getModelImplementsSetServices_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_SET_SERVICES__NAME = eINSTANCE.getModelImplementsSetServices_Name();

		/**
		 * The meta object literal for the '<em><b>Param gcomp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP = eINSTANCE.getModelImplementsSetServices_Param_gcomp();

		/**
		 * The meta object literal for the '<em><b>Param rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_SET_SERVICES__PARAM_RC = eINSTANCE.getModelImplementsSetServices_Param_rc();

		/**
		 * The meta object literal for the '<em><b>Calls Generic Set Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = eINSTANCE.getModelImplementsSetServices_CallsGenericSetServices();

		/**
		 * The meta object literal for the '<em><b>Calls Set Entry Point Phase1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1 = eINSTANCE.getModelImplementsSetServices_CallsSetEntryPointPhase1();

		/**
		 * The meta object literal for the '<em><b>Calls Set Entry Point Phase2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2 = eINSTANCE.getModelImplementsSetServices_CallsSetEntryPointPhase2();

		/**
		 * The meta object literal for the '<em><b>Attaches Model Advance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE = eINSTANCE.getModelImplementsSetServices_AttachesModelAdvance();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl <em>Model Implements Init P1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModelImplementsInitP1()
		 * @generated
		 */
		EClass MODEL_IMPLEMENTS_INIT_P1 = eINSTANCE.getModelImplementsInitP1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_INIT_P1__NAME = eINSTANCE.getModelImplementsInitP1_Name();

		/**
		 * The meta object literal for the '<em><b>Import Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM = eINSTANCE.getModelImplementsInitP1_ImportParam();

		/**
		 * The meta object literal for the '<em><b>Export Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM = eINSTANCE.getModelImplementsInitP1_ExportParam();

		/**
		 * The meta object literal for the '<em><b>Advertises Import Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD = eINSTANCE.getModelImplementsInitP1_AdvertisesImportField();

		/**
		 * The meta object literal for the '<em><b>Advertises Export Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD = eINSTANCE.getModelImplementsInitP1_AdvertisesExportField();

		/**
		 * The meta object literal for the '<em><b>Advertises At Least One Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD = eINSTANCE.getModelImplementsInitP1_AdvertisesAtLeastOneField();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP2Impl <em>Model Implements Init P2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP2Impl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModelImplementsInitP2()
		 * @generated
		 */
		EClass MODEL_IMPLEMENTS_INIT_P2 = eINSTANCE.getModelImplementsInitP2();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_INIT_P2__NAME = eINSTANCE.getModelImplementsInitP2_Name();

		/**
		 * The meta object literal for the '<em><b>Import Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_INIT_P2__IMPORT_PARAM = eINSTANCE.getModelImplementsInitP2_ImportParam();

		/**
		 * The meta object literal for the '<em><b>Export Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_INIT_P2__EXPORT_PARAM = eINSTANCE.getModelImplementsInitP2_ExportParam();

		/**
		 * The meta object literal for the '<em><b>Realizes Import Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD = eINSTANCE.getModelImplementsInitP2_RealizesImportField();

		/**
		 * The meta object literal for the '<em><b>Realizes Export Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD = eINSTANCE.getModelImplementsInitP2_RealizesExportField();

		/**
		 * The meta object literal for the '<em><b>Realizes At Least One Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD = eINSTANCE.getModelImplementsInitP2_RealizesAtLeastOneField();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AdvertisesImportFieldImpl <em>Advertises Import Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AdvertisesImportFieldImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getAdvertisesImportField()
		 * @generated
		 */
		EClass ADVERTISES_IMPORT_FIELD = eINSTANCE.getAdvertisesImportField();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVERTISES_IMPORT_FIELD__PARENT = eINSTANCE.getAdvertisesImportField_Parent();

		/**
		 * The meta object literal for the '<em><b>Adds To State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE = eINSTANCE.getAdvertisesImportField_AddsToState();

		/**
		 * The meta object literal for the '<em><b>Adds To Import State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE = eINSTANCE.getAdvertisesImportField_AddsToImportState();

		/**
		 * The meta object literal for the '<em><b>Standard Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVERTISES_IMPORT_FIELD__STANDARD_NAME = eINSTANCE.getAdvertisesImportField_StandardName();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AdvertisesExportFieldImpl <em>Advertises Export Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AdvertisesExportFieldImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getAdvertisesExportField()
		 * @generated
		 */
		EClass ADVERTISES_EXPORT_FIELD = eINSTANCE.getAdvertisesExportField();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVERTISES_EXPORT_FIELD__PARENT = eINSTANCE.getAdvertisesExportField_Parent();

		/**
		 * The meta object literal for the '<em><b>Adds To State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE = eINSTANCE.getAdvertisesExportField_AddsToState();

		/**
		 * The meta object literal for the '<em><b>Adds To Export State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE = eINSTANCE.getAdvertisesExportField_AddsToExportState();

		/**
		 * The meta object literal for the '<em><b>Standard Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVERTISES_EXPORT_FIELD__STANDARD_NAME = eINSTANCE.getAdvertisesExportField_StandardName();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.RealizesImportFieldImpl <em>Realizes Import Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.RealizesImportFieldImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getRealizesImportField()
		 * @generated
		 */
		EClass REALIZES_IMPORT_FIELD = eINSTANCE.getRealizesImportField();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZES_IMPORT_FIELD__PARENT = eINSTANCE.getRealizesImportField_Parent();

		/**
		 * The meta object literal for the '<em><b>Realized In State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALIZES_IMPORT_FIELD__REALIZED_IN_STATE = eINSTANCE.getRealizesImportField_RealizedInState();

		/**
		 * The meta object literal for the '<em><b>Realized In Import State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALIZES_IMPORT_FIELD__REALIZED_IN_IMPORT_STATE = eINSTANCE.getRealizesImportField_RealizedInImportState();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALIZES_IMPORT_FIELD__FIELD = eINSTANCE.getRealizesImportField_Field();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.RealizesExportFieldImpl <em>Realizes Export Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.RealizesExportFieldImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getRealizesExportField()
		 * @generated
		 */
		EClass REALIZES_EXPORT_FIELD = eINSTANCE.getRealizesExportField();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZES_EXPORT_FIELD__PARENT = eINSTANCE.getRealizesExportField_Parent();

		/**
		 * The meta object literal for the '<em><b>Realized In State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALIZES_EXPORT_FIELD__REALIZED_IN_STATE = eINSTANCE.getRealizesExportField_RealizedInState();

		/**
		 * The meta object literal for the '<em><b>Realized In Export State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE = eINSTANCE.getRealizesExportField_RealizedInExportState();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALIZES_EXPORT_FIELD__FIELD = eINSTANCE.getRealizesExportField_Field();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesModelAdvanceImpl <em>Attaches Model Advance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesModelAdvanceImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getAttachesModelAdvance()
		 * @generated
		 */
		EClass ATTACHES_MODEL_ADVANCE = eINSTANCE.getAttachesModelAdvance();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHES_MODEL_ADVANCE__PARENT = eINSTANCE.getAttachesModelAdvance_Parent();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHES_MODEL_ADVANCE__LABEL = eINSTANCE.getAttachesModelAdvance_Label();

		/**
		 * The meta object literal for the '<em><b>User Routine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHES_MODEL_ADVANCE__USER_ROUTINE = eINSTANCE.getAttachesModelAdvance_UserRoutine();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelAdvanceImpl <em>Model Advance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelAdvanceImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModelAdvance()
		 * @generated
		 */
		EClass MODEL_ADVANCE = eINSTANCE.getModelAdvance();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ADVANCE__PARENT = eINSTANCE.getModelAdvance_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ADVANCE__NAME = eINSTANCE.getModelAdvance_Name();

		/**
		 * The meta object literal for the '<em><b>Attached In Set Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ADVANCE__ATTACHED_IN_SET_SERVICES = eINSTANCE.getModelAdvance_AttachedInSetServices();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER__NAME = eINSTANCE.getNUOPCDriver_Name();

		/**
		 * The meta object literal for the '<em><b>Imports Type Driver IS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER__IMPORTS_TYPE_DRIVER_IS = eINSTANCE.getNUOPCDriver_ImportsTypeDriverIS();

		/**
		 * The meta object literal for the '<em><b>Implements Set Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES = eINSTANCE.getNUOPCDriver_ImplementsSetServices();

		/**
		 * The meta object literal for the '<em><b>Implements Set Model Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT = eINSTANCE.getNUOPCDriver_ImplementsSetModelCount();

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
		 * The meta object literal for the '<em><b>Calls Generic Set Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = eINSTANCE.getNUOPCDriver__ImplementsSetServices_CallsGenericSetServices();

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
		 * The meta object literal for the '<em><b>Method Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHES_METHOD__METHOD_LABEL = eINSTANCE.getAttachesMethod_MethodLabel();

		/**
		 * The meta object literal for the '<em><b>User Routine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHES_METHOD__USER_ROUTINE = eINSTANCE.getAttachesMethod_UserRoutine();

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
		 * The meta object literal for the '<em><b>Nuopc Driver Atm Ocn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_APPLICATION__NUOPC_DRIVER_ATM_OCN = eINSTANCE.getNUOPCApplication_NuopcDriverAtmOcn();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN__NAME = eINSTANCE.getNUOPCDriverAtmOcn_Name();

		/**
		 * The meta object literal for the '<em><b>Implements Set Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES = eINSTANCE.getNUOPCDriverAtmOcn_ImplementsSetServices();

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
		 * The meta object literal for the '<em><b>Calls Generic Set Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = eINSTANCE.getNUOPCDriverAtmOcn__ImplementsSetServices_CallsGenericSetServices();

	}

} //NUOPCPackage
