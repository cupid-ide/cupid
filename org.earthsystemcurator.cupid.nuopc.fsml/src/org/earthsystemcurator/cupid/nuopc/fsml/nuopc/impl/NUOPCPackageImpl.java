/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.lang.Comparable;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Candidate;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

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
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelDefinesSetServicesEClass = null;

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
	private EClass attachesMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candidateEClass = null;

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
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_UsesAllImports() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_DefinesSetServices() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_SinglePublicSubroutine() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ImplementsInitP1() {
		return (EReference)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ImplementsInitP2() {
		return (EReference)modelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelDefinesSetServices() {
		return modelDefinesSetServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelDefinesSetServices_Name() {
		return (EAttribute)modelDefinesSetServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelDefinesSetServices_Parameters() {
		return (EAttribute)modelDefinesSetServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelDefinesSetServices_ParamName_gcomp() {
		return (EAttribute)modelDefinesSetServicesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelDefinesSetServices_ParamName_rc() {
		return (EAttribute)modelDefinesSetServicesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelDefinesSetServices_CallsGenericSetServices() {
		return (EAttribute)modelDefinesSetServicesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelDefinesSetServices_CallsSetEntryPointPhase1() {
		return (EAttribute)modelDefinesSetServicesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelDefinesSetServices_CallsSetEntryPointPhase2() {
		return (EAttribute)modelDefinesSetServicesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelDefinesSetServices_AttachesMethod() {
		return (EReference)modelDefinesSetServicesEClass.getEStructuralFeatures().get(7);
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
	public EReference getModelImplementsInitP1_AdvertisesImportField() {
		return (EReference)modelImplementsInitP1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsInitP1_AdvertisesExportField() {
		return (EReference)modelImplementsInitP1EClass.getEStructuralFeatures().get(2);
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
	public EClass getAdvertisesImportField() {
		return advertisesImportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesImportField_StandardName() {
		return (EAttribute)advertisesImportFieldEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAdvertisesExportField_StandardName() {
		return (EAttribute)advertisesExportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachesMethod() {
		return attachesMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachesMethod_Name() {
		return (EAttribute)attachesMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparable() {
		return comparableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCandidate() {
		return candidateEClass;
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
		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__NAME);
		createEAttribute(modelEClass, MODEL__USES_ALL_IMPORTS);
		createEReference(modelEClass, MODEL__DEFINES_SET_SERVICES);
		createEAttribute(modelEClass, MODEL__SINGLE_PUBLIC_SUBROUTINE);
		createEReference(modelEClass, MODEL__IMPLEMENTS_INIT_P1);
		createEReference(modelEClass, MODEL__IMPLEMENTS_INIT_P2);

		modelDefinesSetServicesEClass = createEClass(MODEL_DEFINES_SET_SERVICES);
		createEAttribute(modelDefinesSetServicesEClass, MODEL_DEFINES_SET_SERVICES__NAME);
		createEAttribute(modelDefinesSetServicesEClass, MODEL_DEFINES_SET_SERVICES__PARAMETERS);
		createEAttribute(modelDefinesSetServicesEClass, MODEL_DEFINES_SET_SERVICES__PARAM_NAME_GCOMP);
		createEAttribute(modelDefinesSetServicesEClass, MODEL_DEFINES_SET_SERVICES__PARAM_NAME_RC);
		createEAttribute(modelDefinesSetServicesEClass, MODEL_DEFINES_SET_SERVICES__CALLS_GENERIC_SET_SERVICES);
		createEAttribute(modelDefinesSetServicesEClass, MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1);
		createEAttribute(modelDefinesSetServicesEClass, MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2);
		createEReference(modelDefinesSetServicesEClass, MODEL_DEFINES_SET_SERVICES__ATTACHES_METHOD);

		modelImplementsInitP1EClass = createEClass(MODEL_IMPLEMENTS_INIT_P1);
		createEAttribute(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__NAME);
		createEReference(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD);
		createEReference(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD);

		modelImplementsInitP2EClass = createEClass(MODEL_IMPLEMENTS_INIT_P2);
		createEAttribute(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__NAME);

		advertisesImportFieldEClass = createEClass(ADVERTISES_IMPORT_FIELD);
		createEAttribute(advertisesImportFieldEClass, ADVERTISES_IMPORT_FIELD__STANDARD_NAME);

		advertisesExportFieldEClass = createEClass(ADVERTISES_EXPORT_FIELD);
		createEAttribute(advertisesExportFieldEClass, ADVERTISES_EXPORT_FIELD__STANDARD_NAME);

		attachesMethodEClass = createEClass(ATTACHES_METHOD);
		createEAttribute(attachesMethodEClass, ATTACHES_METHOD__NAME);

		comparableEClass = createEClass(COMPARABLE);

		candidateEClass = createEClass(CANDIDATE);
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
		ETypeParameter comparableEClass_c = addETypeParameter(comparableEClass, "c");
		ETypeParameter candidateEClass_c = addETypeParameter(candidateEClass, "c");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getCandidate());
		EGenericType g2 = createEGenericType(this.getModelDefinesSetServices());
		g1.getETypeArguments().add(g2);
		modelDefinesSetServicesEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getComparable());
		g2 = createEGenericType(candidateEClass_c);
		g1.getETypeArguments().add(g2);
		candidateEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_UsesAllImports(), ecorePackage.getEBoolean(), "usesAllImports", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_DefinesSetServices(), this.getModelDefinesSetServices(), null, "definesSetServices", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getModel_DefinesSetServices().getEKeys().add(this.getModelDefinesSetServices_Name());
		initEAttribute(getModel_SinglePublicSubroutine(), ecorePackage.getEString(), "singlePublicSubroutine", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ImplementsInitP1(), this.getModelImplementsInitP1(), null, "implementsInitP1", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ImplementsInitP2(), this.getModelImplementsInitP2(), null, "implementsInitP2", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelDefinesSetServicesEClass, ModelDefinesSetServices.class, "ModelDefinesSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelDefinesSetServices_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelDefinesSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelDefinesSetServices_Parameters(), ecorePackage.getEBoolean(), "parameters", null, 1, 1, ModelDefinesSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelDefinesSetServices_ParamName_gcomp(), ecorePackage.getEString(), "paramName_gcomp", null, 0, 1, ModelDefinesSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelDefinesSetServices_ParamName_rc(), ecorePackage.getEString(), "paramName_rc", null, 0, 1, ModelDefinesSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelDefinesSetServices_CallsGenericSetServices(), ecorePackage.getEBoolean(), "callsGenericSetServices", null, 1, 1, ModelDefinesSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelDefinesSetServices_CallsSetEntryPointPhase1(), ecorePackage.getEBoolean(), "callsSetEntryPointPhase1", null, 1, 1, ModelDefinesSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelDefinesSetServices_CallsSetEntryPointPhase2(), ecorePackage.getEBoolean(), "callsSetEntryPointPhase2", null, 1, 1, ModelDefinesSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelDefinesSetServices_AttachesMethod(), this.getAttachesMethod(), null, "attachesMethod", null, 0, -1, ModelDefinesSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelImplementsInitP1EClass, ModelImplementsInitP1.class, "ModelImplementsInitP1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelImplementsInitP1_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsInitP1_AdvertisesImportField(), this.getAdvertisesImportField(), null, "advertisesImportField", null, 0, -1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsInitP1_AdvertisesExportField(), this.getAdvertisesExportField(), null, "advertisesExportField", null, 0, -1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelImplementsInitP2EClass, ModelImplementsInitP2.class, "ModelImplementsInitP2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelImplementsInitP2_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(advertisesImportFieldEClass, AdvertisesImportField.class, "AdvertisesImportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdvertisesImportField_StandardName(), ecorePackage.getEString(), "standardName", null, 0, 1, AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(advertisesExportFieldEClass, AdvertisesExportField.class, "AdvertisesExportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdvertisesExportField_StandardName(), ecorePackage.getEString(), "standardName", null, 0, 1, AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachesMethodEClass, AttachesMethod.class, "AttachesMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachesMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, AttachesMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparableEClass, Comparable.class, "Comparable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(comparableEClass, ecorePackage.getEInt(), "compareTo", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(comparableEClass_c);
		addEParameter(op, g1, "other", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(candidateEClass, Candidate.class, "Candidate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(candidateEClass, ecorePackage.getEInt(), "score", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.earthsystemcog.org/projects/nuopc
		createNuopcAnnotations();
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
		  (modelEClass, 
		   source, 
		   new String[] {
			 "query", "module"
		   });		
		addAnnotation
		  (getModel_Name(), 
		   source, 
		   new String[] {
			 "query", "moduleName"
		   });		
		addAnnotation
		  (getModel_DefinesSetServices(), 
		   source, 
		   new String[] {
			 "query", "subroutine: *(type(ESMF_GridComp), integer)"
		   });		
		addAnnotation
		  (getModel_SinglePublicSubroutine(), 
		   source, 
		   new String[] {
			 "query", "hasSinglePublicMember",
			 "transform", "addPublicMember"
		   });		
		addAnnotation
		  (getModel_ImplementsInitP1(), 
		   source, 
		   new String[] {
			 "query", "subroutine: *(type(ESMF_GridComp), type(ESMF_State), type(ESMF_State), type(ESMF_Clock), integer)"
		   });		
		addAnnotation
		  (getModel_ImplementsInitP2(), 
		   source, 
		   new String[] {
			 "query", "subroutine: *(type(ESMF_GridComp), type(ESMF_State), type(ESMF_State), type(ESMF_Clock), integer)"
		   });		
		addAnnotation
		  (getModelDefinesSetServices_Name(), 
		   source, 
		   new String[] {
			 "query", "subroutineName"
		   });		
		addAnnotation
		  (getModelDefinesSetServices_CallsGenericSetServices(), 
		   source, 
		   new String[] {
			 "query", "calls: routine_SetServices",
			 "essential", "true"
		   });		
		addAnnotation
		  (getModelDefinesSetServices_CallsSetEntryPointPhase1(), 
		   source, 
		   new String[] {
			 "query", "calls: ESMF_GridCompSetEntryPoint"
		   });		
		addAnnotation
		  (getModelDefinesSetServices_CallsSetEntryPointPhase2(), 
		   source, 
		   new String[] {
			 "query", "calls: ESMF_GridCompSetEntryPoint"
		   });		
		addAnnotation
		  (getModelImplementsInitP1_Name(), 
		   source, 
		   new String[] {
			 "query", "subroutineName"
		   });		
		addAnnotation
		  (getModelImplementsInitP1_AdvertisesImportField(), 
		   source, 
		   new String[] {
			 "query", "call: NUOPC_StateAdvertiseField"
		   });		
		addAnnotation
		  (getModelImplementsInitP1_AdvertisesExportField(), 
		   source, 
		   new String[] {
			 "query", "call: NUOPC_StateAdvertiseField"
		   });		
		addAnnotation
		  (getModelImplementsInitP2_Name(), 
		   source, 
		   new String[] {
			 "query", "subroutineName"
		   });		
		addAnnotation
		  (getAdvertisesImportField_StandardName(), 
		   source, 
		   new String[] {
			 "query", "argByKeyword: StandardName"
		   });		
		addAnnotation
		  (getAdvertisesExportField_StandardName(), 
		   source, 
		   new String[] {
			 "query", "argByKeyword: StandardName"
		   });
	}

} //NUOPCPackageImpl
