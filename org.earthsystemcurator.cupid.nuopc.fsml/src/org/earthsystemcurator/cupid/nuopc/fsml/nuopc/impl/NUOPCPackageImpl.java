/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.lang.Comparable;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NUOPCPackageImpl extends EPackageImpl implements NUOPCPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelImplementsSetServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelImplementsInitP1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelImplementsInitP2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advertisesImportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advertisesExportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizesImportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizesExportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachesModelAdvanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelAdvanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcApplicationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NUOPCPackageImpl() {
		super(eNS_URI, NUOPCFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link NUOPCPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NUOPCPackage init() {
		if (isInited) return (NUOPCPackage)EPackage.Registry.INSTANCE.getEPackage(NUOPCPackage.eNS_URI);

		// Obtain or create and register package
		NUOPCPackageImpl theNUOPCPackage = (NUOPCPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NUOPCPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NUOPCPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNUOPCPackage.createPackageContents();

		// Initialize created meta-data
		theNUOPCPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNUOPCPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NUOPCPackage.eNS_URI, theNUOPCPackage);
		return theNUOPCPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel() {
		return nuopcModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel_Name() {
		return (EAttribute)nuopcModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel_UsesAllImports() {
		return (EAttribute)nuopcModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel_SinglePublicSubroutine() {
		return (EAttribute)nuopcModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel_ImplementsSetServices() {
		return (EReference)nuopcModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel_ImplementsInitP1() {
		return (EReference)nuopcModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel_ImplementsInitP2() {
		return (EReference)nuopcModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel_ImplementsModelAdvance() {
		return (EReference)nuopcModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelImplementsSetServices() {
		return modelImplementsSetServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsSetServices_Parent() {
		return (EReference)modelImplementsSetServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsSetServices_Name() {
		return (EAttribute)modelImplementsSetServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsSetServices_Param_gcomp() {
		return (EAttribute)modelImplementsSetServicesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsSetServices_Param_rc() {
		return (EAttribute)modelImplementsSetServicesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsSetServices_CallsGenericSetServices() {
		return (EAttribute)modelImplementsSetServicesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsSetServices_CallsSetEntryPointPhase1() {
		return (EAttribute)modelImplementsSetServicesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsSetServices_CallsSetEntryPointPhase2() {
		return (EAttribute)modelImplementsSetServicesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsSetServices_AttachesModelAdvance() {
		return (EReference)modelImplementsSetServicesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelImplementsInitP1() {
		return modelImplementsInitP1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP1_Name() {
		return (EAttribute)modelImplementsInitP1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP1_ImportParam() {
		return (EAttribute)modelImplementsInitP1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP1_ExportParam() {
		return (EAttribute)modelImplementsInitP1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsInitP1_AdvertisesImportField() {
		return (EReference)modelImplementsInitP1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsInitP1_AdvertisesExportField() {
		return (EReference)modelImplementsInitP1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP1_AdvertisesAtLeastOneField() {
		return (EAttribute)modelImplementsInitP1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelImplementsInitP2() {
		return modelImplementsInitP2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP2_Name() {
		return (EAttribute)modelImplementsInitP2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP2_ImportParam() {
		return (EAttribute)modelImplementsInitP2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP2_ExportParam() {
		return (EAttribute)modelImplementsInitP2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsInitP2_RealizesImportField() {
		return (EReference)modelImplementsInitP2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsInitP2_RealizesExportField() {
		return (EReference)modelImplementsInitP2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP2_RealizesAtLeastOneField() {
		return (EAttribute)modelImplementsInitP2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvertisesImportField() {
		return advertisesImportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvertisesImportField_Parent() {
		return (EReference)advertisesImportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesImportField_AddsToState() {
		return (EAttribute)advertisesImportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesImportField_AddsToImportState() {
		return (EAttribute)advertisesImportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesImportField_StandardName() {
		return (EAttribute)advertisesImportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvertisesExportField() {
		return advertisesExportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvertisesExportField_Parent() {
		return (EReference)advertisesExportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesExportField_AddsToState() {
		return (EAttribute)advertisesExportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesExportField_AddsToExportState() {
		return (EAttribute)advertisesExportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesExportField_StandardName() {
		return (EAttribute)advertisesExportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealizesImportField() {
		return realizesImportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizesImportField_Parent() {
		return (EReference)realizesImportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesImportField_RealizedInState() {
		return (EAttribute)realizesImportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesImportField_RealizedInImportState() {
		return (EAttribute)realizesImportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesImportField_Field() {
		return (EAttribute)realizesImportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealizesExportField() {
		return realizesExportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizesExportField_Parent() {
		return (EReference)realizesExportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesExportField_RealizedInState() {
		return (EAttribute)realizesExportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesExportField_RealizedInExportState() {
		return (EAttribute)realizesExportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesExportField_Field() {
		return (EAttribute)realizesExportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachesModelAdvance() {
		return attachesModelAdvanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachesModelAdvance_Parent() {
		return (EReference)attachesModelAdvanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachesModelAdvance_Label() {
		return (EAttribute)attachesModelAdvanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachesModelAdvance_UserRoutine() {
		return (EAttribute)attachesModelAdvanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelAdvance() {
		return modelAdvanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelAdvance_Parent() {
		return (EReference)modelAdvanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelAdvance_Name() {
		return (EAttribute)modelAdvanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelAdvance_AttachedInSetServices() {
		return (EAttribute)modelAdvanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriver() {
		return nuopcDriverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCApplication() {
		return nuopcApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCApplication_NuopcDriver() {
		return (EReference)nuopcApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCApplication_NuopcModel() {
		return (EReference)nuopcApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCFactory getNUOPCFactory() {
		return (NUOPCFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nuopcModelEClass = createEClass(NUOPC_MODEL);
		createEAttribute(nuopcModelEClass, NUOPC_MODEL__NAME);
		createEAttribute(nuopcModelEClass, NUOPC_MODEL__USES_ALL_IMPORTS);
		createEAttribute(nuopcModelEClass, NUOPC_MODEL__SINGLE_PUBLIC_SUBROUTINE);
		createEReference(nuopcModelEClass, NUOPC_MODEL__IMPLEMENTS_SET_SERVICES);
		createEReference(nuopcModelEClass, NUOPC_MODEL__IMPLEMENTS_INIT_P1);
		createEReference(nuopcModelEClass, NUOPC_MODEL__IMPLEMENTS_INIT_P2);
		createEReference(nuopcModelEClass, NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE);

		modelImplementsSetServicesEClass = createEClass(MODEL_IMPLEMENTS_SET_SERVICES);
		createEReference(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__PARENT);
		createEAttribute(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__NAME);
		createEAttribute(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP);
		createEAttribute(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__PARAM_RC);
		createEAttribute(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES);
		createEAttribute(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1);
		createEAttribute(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2);
		createEReference(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE);

		modelImplementsInitP1EClass = createEClass(MODEL_IMPLEMENTS_INIT_P1);
		createEAttribute(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__NAME);
		createEAttribute(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM);
		createEAttribute(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM);
		createEReference(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD);
		createEReference(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD);
		createEAttribute(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD);

		modelImplementsInitP2EClass = createEClass(MODEL_IMPLEMENTS_INIT_P2);
		createEAttribute(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__NAME);
		createEAttribute(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__IMPORT_PARAM);
		createEAttribute(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__EXPORT_PARAM);
		createEReference(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD);
		createEReference(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD);
		createEAttribute(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD);

		advertisesImportFieldEClass = createEClass(ADVERTISES_IMPORT_FIELD);
		createEReference(advertisesImportFieldEClass, ADVERTISES_IMPORT_FIELD__PARENT);
		createEAttribute(advertisesImportFieldEClass, ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE);
		createEAttribute(advertisesImportFieldEClass, ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE);
		createEAttribute(advertisesImportFieldEClass, ADVERTISES_IMPORT_FIELD__STANDARD_NAME);

		advertisesExportFieldEClass = createEClass(ADVERTISES_EXPORT_FIELD);
		createEReference(advertisesExportFieldEClass, ADVERTISES_EXPORT_FIELD__PARENT);
		createEAttribute(advertisesExportFieldEClass, ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE);
		createEAttribute(advertisesExportFieldEClass, ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE);
		createEAttribute(advertisesExportFieldEClass, ADVERTISES_EXPORT_FIELD__STANDARD_NAME);

		realizesImportFieldEClass = createEClass(REALIZES_IMPORT_FIELD);
		createEReference(realizesImportFieldEClass, REALIZES_IMPORT_FIELD__PARENT);
		createEAttribute(realizesImportFieldEClass, REALIZES_IMPORT_FIELD__REALIZED_IN_STATE);
		createEAttribute(realizesImportFieldEClass, REALIZES_IMPORT_FIELD__REALIZED_IN_IMPORT_STATE);
		createEAttribute(realizesImportFieldEClass, REALIZES_IMPORT_FIELD__FIELD);

		realizesExportFieldEClass = createEClass(REALIZES_EXPORT_FIELD);
		createEReference(realizesExportFieldEClass, REALIZES_EXPORT_FIELD__PARENT);
		createEAttribute(realizesExportFieldEClass, REALIZES_EXPORT_FIELD__REALIZED_IN_STATE);
		createEAttribute(realizesExportFieldEClass, REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE);
		createEAttribute(realizesExportFieldEClass, REALIZES_EXPORT_FIELD__FIELD);

		attachesModelAdvanceEClass = createEClass(ATTACHES_MODEL_ADVANCE);
		createEReference(attachesModelAdvanceEClass, ATTACHES_MODEL_ADVANCE__PARENT);
		createEAttribute(attachesModelAdvanceEClass, ATTACHES_MODEL_ADVANCE__LABEL);
		createEAttribute(attachesModelAdvanceEClass, ATTACHES_MODEL_ADVANCE__USER_ROUTINE);

		modelAdvanceEClass = createEClass(MODEL_ADVANCE);
		createEReference(modelAdvanceEClass, MODEL_ADVANCE__PARENT);
		createEAttribute(modelAdvanceEClass, MODEL_ADVANCE__NAME);
		createEAttribute(modelAdvanceEClass, MODEL_ADVANCE__ATTACHED_IN_SET_SERVICES);

		nuopcDriverEClass = createEClass(NUOPC_DRIVER);

		nuopcApplicationEClass = createEClass(NUOPC_APPLICATION);
		createEReference(nuopcApplicationEClass, NUOPC_APPLICATION__NUOPC_DRIVER);
		createEReference(nuopcApplicationEClass, NUOPC_APPLICATION__NUOPC_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(nuopcModelEClass, NUOPCModel.class, "NUOPCModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCModel_Name(), ecorePackage.getEString(), "name", "ModelDefault", 1, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel_UsesAllImports(), ecorePackage.getEBoolean(), "usesAllImports", null, 1, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel_SinglePublicSubroutine(), ecorePackage.getEString(), "singlePublicSubroutine", null, 0, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel_ImplementsSetServices(), this.getModelImplementsSetServices(), this.getModelImplementsSetServices_Parent(), "implementsSetServices", null, 0, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNUOPCModel_ImplementsSetServices().getEKeys().add(this.getModelImplementsSetServices_Name());
		initEReference(getNUOPCModel_ImplementsInitP1(), this.getModelImplementsInitP1(), null, "implementsInitP1", null, 0, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel_ImplementsInitP2(), this.getModelImplementsInitP2(), null, "implementsInitP2", null, 0, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel_ImplementsModelAdvance(), this.getModelAdvance(), this.getModelAdvance_Parent(), "implementsModelAdvance", null, 0, -1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelImplementsSetServicesEClass, ModelImplementsSetServices.class, "ModelImplementsSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelImplementsSetServices_Parent(), this.getNUOPCModel(), this.getNUOPCModel_ImplementsSetServices(), "parent", null, 1, 1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsSetServices_Name(), ecorePackage.getEString(), "name", "SetServicesDefault", 1, 1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsSetServices_Param_gcomp(), ecorePackage.getEString(), "param_gcomp", "gcompDefault", 0, 1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsSetServices_Param_rc(), ecorePackage.getEString(), "param_rc", "rcDefault", 0, 1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsSetServices_CallsGenericSetServices(), ecorePackage.getEBoolean(), "callsGenericSetServices", null, 1, 1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsSetServices_CallsSetEntryPointPhase1(), ecorePackage.getEBoolean(), "callsSetEntryPointPhase1", null, 1, 1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsSetServices_CallsSetEntryPointPhase2(), ecorePackage.getEBoolean(), "callsSetEntryPointPhase2", null, 1, 1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsSetServices_AttachesModelAdvance(), this.getAttachesModelAdvance(), this.getAttachesModelAdvance_Parent(), "attachesModelAdvance", null, 0, 1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelImplementsInitP1EClass, ModelImplementsInitP1.class, "ModelImplementsInitP1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelImplementsInitP1_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP1_ImportParam(), ecorePackage.getEString(), "importParam", null, 1, 1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP1_ExportParam(), ecorePackage.getEString(), "exportParam", null, 1, 1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsInitP1_AdvertisesImportField(), this.getAdvertisesImportField(), this.getAdvertisesImportField_Parent(), "advertisesImportField", null, 0, -1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsInitP1_AdvertisesExportField(), this.getAdvertisesExportField(), this.getAdvertisesExportField_Parent(), "advertisesExportField", null, 0, -1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP1_AdvertisesAtLeastOneField(), ecorePackage.getEBoolean(), "advertisesAtLeastOneField", null, 0, 1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(modelImplementsInitP2EClass, ModelImplementsInitP2.class, "ModelImplementsInitP2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelImplementsInitP2_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP2_ImportParam(), ecorePackage.getEString(), "importParam", null, 1, 1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP2_ExportParam(), ecorePackage.getEString(), "exportParam", null, 1, 1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsInitP2_RealizesImportField(), this.getRealizesImportField(), this.getRealizesImportField_Parent(), "realizesImportField", null, 0, -1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsInitP2_RealizesExportField(), this.getRealizesExportField(), this.getRealizesExportField_Parent(), "realizesExportField", null, 0, -1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP2_RealizesAtLeastOneField(), ecorePackage.getEBoolean(), "realizesAtLeastOneField", null, 0, 1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(advertisesImportFieldEClass, AdvertisesImportField.class, "AdvertisesImportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdvertisesImportField_Parent(), this.getModelImplementsInitP1(), this.getModelImplementsInitP1_AdvertisesImportField(), "parent", null, 1, 1, AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesImportField_AddsToState(), ecorePackage.getEString(), "addsToState", null, 1, 1, AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesImportField_AddsToImportState(), ecorePackage.getEBoolean(), "addsToImportState", null, 0, 1, AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesImportField_StandardName(), ecorePackage.getEString(), "standardName", null, 0, 1, AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(advertisesExportFieldEClass, AdvertisesExportField.class, "AdvertisesExportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdvertisesExportField_Parent(), this.getModelImplementsInitP1(), this.getModelImplementsInitP1_AdvertisesExportField(), "parent", null, 1, 1, AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesExportField_AddsToState(), ecorePackage.getEString(), "addsToState", null, 1, 1, AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesExportField_AddsToExportState(), ecorePackage.getEBoolean(), "addsToExportState", null, 0, 1, AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesExportField_StandardName(), ecorePackage.getEString(), "standardName", null, 0, 1, AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realizesImportFieldEClass, RealizesImportField.class, "RealizesImportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealizesImportField_Parent(), this.getModelImplementsInitP2(), this.getModelImplementsInitP2_RealizesImportField(), "parent", null, 1, 1, RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesImportField_RealizedInState(), ecorePackage.getEString(), "realizedInState", null, 1, 1, RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesImportField_RealizedInImportState(), ecorePackage.getEBoolean(), "realizedInImportState", null, 0, 1, RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesImportField_Field(), ecorePackage.getEString(), "field", null, 0, 1, RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realizesExportFieldEClass, RealizesExportField.class, "RealizesExportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealizesExportField_Parent(), this.getModelImplementsInitP2(), this.getModelImplementsInitP2_RealizesExportField(), "parent", null, 1, 1, RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesExportField_RealizedInState(), ecorePackage.getEString(), "realizedInState", null, 1, 1, RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesExportField_RealizedInExportState(), ecorePackage.getEBoolean(), "realizedInExportState", null, 0, 1, RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesExportField_Field(), ecorePackage.getEString(), "field", null, 0, 1, RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachesModelAdvanceEClass, AttachesModelAdvance.class, "AttachesModelAdvance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachesModelAdvance_Parent(), this.getModelImplementsSetServices(), this.getModelImplementsSetServices_AttachesModelAdvance(), "parent", null, 1, 1, AttachesModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachesModelAdvance_Label(), ecorePackage.getEString(), "label", null, 0, 1, AttachesModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachesModelAdvance_UserRoutine(), ecorePackage.getEString(), "userRoutine", null, 0, 1, AttachesModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelAdvanceEClass, ModelAdvance.class, "ModelAdvance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelAdvance_Parent(), this.getNUOPCModel(), this.getNUOPCModel_ImplementsModelAdvance(), "parent", null, 1, 1, ModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelAdvance_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelAdvance_AttachedInSetServices(), ecorePackage.getEBoolean(), "attachedInSetServices", null, 1, 1, ModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriverEClass, NUOPCDriver.class, "NUOPCDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nuopcApplicationEClass, NUOPCApplication.class, "NUOPCApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCApplication_NuopcDriver(), this.getNUOPCDriver(), null, "nuopcDriver", null, 0, -1, NUOPCApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCApplication_NuopcModel(), this.getNUOPCModel(), null, "nuopcModel", null, 0, -1, NUOPCApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.earthsystemcog.org/projects/nuopc
		createNuopcAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });																																																						
	}

	/**
	 * Initializes the annotations for <b>http://www.earthsystemcog.org/projects/nuopc</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNuopcAnnotations() {
		String source = "http://www.earthsystemcog.org/projects/nuopc";			
		addAnnotation
		  (nuopcModelEClass, 
		   source, 
		   new String[] {
			 "mapping", "module"
		   });		
		addAnnotation
		  (getNUOPCModel_Name(), 
		   source, 
		   new String[] {
			 "mapping", "moduleName"
		   });		
		addAnnotation
		  (getNUOPCModel_SinglePublicSubroutine(), 
		   source, 
		   new String[] {
			 "mapping", "hasSinglePublicMember",
			 "transform", "addPublicMember"
		   });		
		addAnnotation
		  (getNUOPCModel_ImplementsSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"*(type(ESMF_GridComp), integer)\""
		   });		
		addAnnotation
		  (getNUOPCModel_ImplementsInitP1(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"*(type(ESMF_GridComp), type(ESMF_State), type(ESMF_State), type(ESMF_Clock), integer)\""
		   });		
		addAnnotation
		  (getNUOPCModel_ImplementsInitP2(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"*(type(ESMF_GridComp), type(ESMF_State), type(ESMF_State), type(ESMF_Clock), integer)\""
		   });		
		addAnnotation
		  (getNUOPCModel_ImplementsModelAdvance(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"*(type(ESMF_GridComp), integer)\""
		   });		
		addAnnotation
		  (modelImplementsSetServicesEClass, 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"*(type(ESMF_GridComp), integer)\""
		   });		
		addAnnotation
		  (getModelImplementsSetServices_Name(), 
		   source, 
		   new String[] {
			 "mapping", "subroutineName"
		   });		
		addAnnotation
		  (getModelImplementsSetServices_Param_gcomp(), 
		   source, 
		   new String[] {
			 "mapping", "formalParam: 1"
		   });		
		addAnnotation
		  (getModelImplementsSetServices_Param_rc(), 
		   source, 
		   new String[] {
			 "mapping", "formalParam: 2"
		   });		
		addAnnotation
		  (getModelImplementsSetServices_CallsGenericSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "calls: \"routine_SetServices\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getModelImplementsSetServices_CallsSetEntryPointPhase1(), 
		   source, 
		   new String[] {
			 "mapping", "calls: \"ESMF_GridCompSetEntryPoint\""
		   });		
		addAnnotation
		  (getModelImplementsSetServices_CallsSetEntryPointPhase2(), 
		   source, 
		   new String[] {
			 "mapping", "calls: \"ESMF_GridCompSetEntryPoint\""
		   });		
		addAnnotation
		  (getModelImplementsSetServices_AttachesModelAdvance(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_MethodAdd\""
		   });		
		addAnnotation
		  (getModelImplementsInitP1_Name(), 
		   source, 
		   new String[] {
			 "mapping", "subroutineName"
		   });		
		addAnnotation
		  (getModelImplementsInitP1_ImportParam(), 
		   source, 
		   new String[] {
			 "mapping", "formalParam: 2"
		   });		
		addAnnotation
		  (getModelImplementsInitP1_ExportParam(), 
		   source, 
		   new String[] {
			 "mapping", "formalParam: 3"
		   });		
		addAnnotation
		  (getModelImplementsInitP1_AdvertisesImportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateAdvertiseField\""
		   });		
		addAnnotation
		  (getModelImplementsInitP1_AdvertisesExportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateAdvertiseField\""
		   });		
		addAnnotation
		  (getModelImplementsInitP1_AdvertisesAtLeastOneField(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (modelImplementsInitP2EClass, 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"*(type(ESMF_GridComp), type(ESMF_State), type(ESMF_State), type(ESMF_Clock), integer)\""
		   });		
		addAnnotation
		  (getModelImplementsInitP2_Name(), 
		   source, 
		   new String[] {
			 "mapping", "subroutineName"
		   });		
		addAnnotation
		  (getModelImplementsInitP2_ImportParam(), 
		   source, 
		   new String[] {
			 "mapping", "formalParam: 2"
		   });		
		addAnnotation
		  (getModelImplementsInitP2_ExportParam(), 
		   source, 
		   new String[] {
			 "mapping", "formalParam: 3"
		   });		
		addAnnotation
		  (getModelImplementsInitP2_RealizesImportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateRealizeField\""
		   });		
		addAnnotation
		  (getModelImplementsInitP2_RealizesExportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateRealizeField\""
		   });		
		addAnnotation
		  (getModelImplementsInitP2_RealizesAtLeastOneField(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (getAdvertisesImportField_AddsToState(), 
		   source, 
		   new String[] {
			 "mapping", "argByIndex: 1"
		   });		
		addAnnotation
		  (getAdvertisesImportField_AddsToImportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (getAdvertisesImportField_StandardName(), 
		   source, 
		   new String[] {
			 "mapping", "argByKeyword: \"StandardName\""
		   });		
		addAnnotation
		  (getAdvertisesExportField_AddsToState(), 
		   source, 
		   new String[] {
			 "mapping", "argByIndex: 1"
		   });		
		addAnnotation
		  (getAdvertisesExportField_AddsToExportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (getAdvertisesExportField_StandardName(), 
		   source, 
		   new String[] {
			 "mapping", "argByKeyword: \"StandardName\""
		   });		
		addAnnotation
		  (realizesImportFieldEClass, 
		   source, 
		   new String[] {
			 "mapping", "call: NUOPC_StateRealizeField"
		   });		
		addAnnotation
		  (getRealizesImportField_RealizedInState(), 
		   source, 
		   new String[] {
			 "mapping", "argByIndex: 1"
		   });		
		addAnnotation
		  (getRealizesImportField_RealizedInImportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (getRealizesImportField_Field(), 
		   source, 
		   new String[] {
			 "mapping", "argByIndex: 2"
		   });		
		addAnnotation
		  (getRealizesExportField_RealizedInState(), 
		   source, 
		   new String[] {
			 "mapping", "argByIndex: 1"
		   });		
		addAnnotation
		  (getRealizesExportField_RealizedInExportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (getRealizesExportField_Field(), 
		   source, 
		   new String[] {
			 "mapping", "argByIndex: 2"
		   });		
		addAnnotation
		  (getAttachesModelAdvance_Label(), 
		   source, 
		   new String[] {
			 "mapping", "argByIndex: 2"
		   });		
		addAnnotation
		  (getAttachesModelAdvance_UserRoutine(), 
		   source, 
		   new String[] {
			 "mapping", "argByIndex: 3"
		   });		
		addAnnotation
		  (getModelAdvance_Name(), 
		   source, 
		   new String[] {
			 "mapping", "subroutineName"
		   });			
		addAnnotation
		  (nuopcDriverEClass, 
		   source, 
		   new String[] {
			 "mapping", "module"
		   });		
		addAnnotation
		  (getNUOPCApplication_NuopcDriver(), 
		   source, 
		   new String[] {
			 "mapping", "module"
		   });		
		addAnnotation
		  (getNUOPCApplication_NuopcModel(), 
		   source, 
		   new String[] {
			 "mapping", "module"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";																								
		addAnnotation
		  (getModelImplementsInitP1_AdvertisesAtLeastOneField(), 
		   source, 
		   new String[] {
			 "derivation", "self.advertisesExportField->size() > 0 or self.advertisesImportField->size() > 0"
		   });									
		addAnnotation
		  (getModelImplementsInitP2_RealizesAtLeastOneField(), 
		   source, 
		   new String[] {
			 "derivation", "self.realizesImportField->size() > 0 or self.realizesExportField->size() > 0"
		   });				
		addAnnotation
		  (getAdvertisesImportField_AddsToImportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.addsToState = self.parent.importParam"
		   });					
		addAnnotation
		  (getAdvertisesExportField_AddsToExportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.addsToState = self.parent.exportParam"
		   });						
		addAnnotation
		  (getRealizesImportField_RealizedInImportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.realizedInState = self.parent.importParam"
		   });					
		addAnnotation
		  (getRealizesExportField_RealizedInExportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.realizedInState = self.parent.exportParam"
		   });						
		addAnnotation
		  (getModelAdvance_AttachedInSetServices(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent.implementsSetServices.attachesModelAdvance.userRoutine = self.name"
		   });			
	}

} //NUOPCPackageImpl
