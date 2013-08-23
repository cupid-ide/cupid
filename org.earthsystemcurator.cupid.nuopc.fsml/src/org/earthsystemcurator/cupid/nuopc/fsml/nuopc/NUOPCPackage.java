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
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uses All Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__USES_ALL_IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Defines Set Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEFINES_SET_SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Single Public Subroutine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SINGLE_PUBLIC_SUBROUTINE = 3;

	/**
	 * The feature id for the '<em><b>Implements Init P1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IMPLEMENTS_INIT_P1 = 4;

	/**
	 * The feature id for the '<em><b>Implements Init P2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IMPLEMENTS_INIT_P2 = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl <em>Model Defines Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModelDefinesSetServices()
	 * @generated
	 */
	int MODEL_DEFINES_SET_SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINES_SET_SERVICES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINES_SET_SERVICES__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Param Name gcomp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINES_SET_SERVICES__PARAM_NAME_GCOMP = 2;

	/**
	 * The feature id for the '<em><b>Param Name rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINES_SET_SERVICES__PARAM_NAME_RC = 3;

	/**
	 * The feature id for the '<em><b>Calls Generic Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINES_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Calls Set Entry Point Phase1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1 = 5;

	/**
	 * The feature id for the '<em><b>Calls Set Entry Point Phase2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2 = 6;

	/**
	 * The feature id for the '<em><b>Attaches Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINES_SET_SERVICES__ATTACHES_METHOD = 7;

	/**
	 * The number of structural features of the '<em>Model Defines Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINES_SET_SERVICES_FEATURE_COUNT = 8;


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
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesMethodImpl <em>Attaches Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesMethodImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getAttachesMethod()
	 * @generated
	 */
	int ATTACHES_METHOD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_METHOD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Attaches Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHES_METHOD_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#isUsesAllImports <em>Uses All Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses All Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#isUsesAllImports()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_UsesAllImports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getDefinesSetServices <em>Defines Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defines Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getDefinesSetServices()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DefinesSetServices();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getSinglePublicSubroutine <em>Single Public Subroutine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Public Subroutine</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getSinglePublicSubroutine()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_SinglePublicSubroutine();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getImplementsInitP1 <em>Implements Init P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Init P1</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getImplementsInitP1()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ImplementsInitP1();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getImplementsInitP2 <em>Implements Init P2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements Init P2</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getImplementsInitP2()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ImplementsInitP2();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices <em>Model Defines Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Defines Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices
	 * @generated
	 */
	EClass getModelDefinesSetServices();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#getName()
	 * @see #getModelDefinesSetServices()
	 * @generated
	 */
	EAttribute getModelDefinesSetServices_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#isParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#isParameters()
	 * @see #getModelDefinesSetServices()
	 * @generated
	 */
	EAttribute getModelDefinesSetServices_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#getParamName_gcomp <em>Param Name gcomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Name gcomp</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#getParamName_gcomp()
	 * @see #getModelDefinesSetServices()
	 * @generated
	 */
	EAttribute getModelDefinesSetServices_ParamName_gcomp();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#getParamName_rc <em>Param Name rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Name rc</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#getParamName_rc()
	 * @see #getModelDefinesSetServices()
	 * @generated
	 */
	EAttribute getModelDefinesSetServices_ParamName_rc();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#isCallsGenericSetServices <em>Calls Generic Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calls Generic Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#isCallsGenericSetServices()
	 * @see #getModelDefinesSetServices()
	 * @generated
	 */
	EAttribute getModelDefinesSetServices_CallsGenericSetServices();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#isCallsSetEntryPointPhase1 <em>Calls Set Entry Point Phase1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calls Set Entry Point Phase1</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#isCallsSetEntryPointPhase1()
	 * @see #getModelDefinesSetServices()
	 * @generated
	 */
	EAttribute getModelDefinesSetServices_CallsSetEntryPointPhase1();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#isCallsSetEntryPointPhase2 <em>Calls Set Entry Point Phase2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calls Set Entry Point Phase2</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#isCallsSetEntryPointPhase2()
	 * @see #getModelDefinesSetServices()
	 * @generated
	 */
	EAttribute getModelDefinesSetServices_CallsSetEntryPointPhase2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#getAttachesMethod <em>Attaches Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attaches Method</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#getAttachesMethod()
	 * @see #getModelDefinesSetServices()
	 * @generated
	 */
	EReference getModelDefinesSetServices_AttachesMethod();

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
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Uses All Imports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__USES_ALL_IMPORTS = eINSTANCE.getModel_UsesAllImports();

		/**
		 * The meta object literal for the '<em><b>Defines Set Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DEFINES_SET_SERVICES = eINSTANCE.getModel_DefinesSetServices();

		/**
		 * The meta object literal for the '<em><b>Single Public Subroutine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__SINGLE_PUBLIC_SUBROUTINE = eINSTANCE.getModel_SinglePublicSubroutine();

		/**
		 * The meta object literal for the '<em><b>Implements Init P1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__IMPLEMENTS_INIT_P1 = eINSTANCE.getModel_ImplementsInitP1();

		/**
		 * The meta object literal for the '<em><b>Implements Init P2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__IMPLEMENTS_INIT_P2 = eINSTANCE.getModel_ImplementsInitP2();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl <em>Model Defines Set Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModelDefinesSetServices()
		 * @generated
		 */
		EClass MODEL_DEFINES_SET_SERVICES = eINSTANCE.getModelDefinesSetServices();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DEFINES_SET_SERVICES__NAME = eINSTANCE.getModelDefinesSetServices_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DEFINES_SET_SERVICES__PARAMETERS = eINSTANCE.getModelDefinesSetServices_Parameters();

		/**
		 * The meta object literal for the '<em><b>Param Name gcomp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DEFINES_SET_SERVICES__PARAM_NAME_GCOMP = eINSTANCE.getModelDefinesSetServices_ParamName_gcomp();

		/**
		 * The meta object literal for the '<em><b>Param Name rc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DEFINES_SET_SERVICES__PARAM_NAME_RC = eINSTANCE.getModelDefinesSetServices_ParamName_rc();

		/**
		 * The meta object literal for the '<em><b>Calls Generic Set Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DEFINES_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = eINSTANCE.getModelDefinesSetServices_CallsGenericSetServices();

		/**
		 * The meta object literal for the '<em><b>Calls Set Entry Point Phase1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1 = eINSTANCE.getModelDefinesSetServices_CallsSetEntryPointPhase1();

		/**
		 * The meta object literal for the '<em><b>Calls Set Entry Point Phase2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2 = eINSTANCE.getModelDefinesSetServices_CallsSetEntryPointPhase2();

		/**
		 * The meta object literal for the '<em><b>Attaches Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DEFINES_SET_SERVICES__ATTACHES_METHOD = eINSTANCE.getModelDefinesSetServices_AttachesMethod();

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

	}

} //NUOPCPackage
