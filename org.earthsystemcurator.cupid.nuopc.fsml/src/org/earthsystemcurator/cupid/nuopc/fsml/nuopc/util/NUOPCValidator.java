/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.util;

import java.util.Map;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage
 * @generated
 */
public class NUOPCValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final NUOPCValidator INSTANCE = new NUOPCValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.earthsystemcurator.cupid.nuopc.fsml.nuopc";

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
	public NUOPCValidator() {
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
	  return NUOPCPackage.eINSTANCE;
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
			case NUOPCPackage.TOP:
				return validateTop((Top)value, diagnostics, context);
			case NUOPCPackage.NUOPC_APPLICATION:
				return validateNUOPCApplication((NUOPCApplication)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL:
				return validateNUOPCModel((NUOPCModel)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_GENERIC_IMPORTS:
				return validateNUOPCModel__GenericImports((NUOPCModel__GenericImports)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_INIT:
				return validateNUOPCModel__Init((NUOPCModel__Init)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES:
				return validateNUOPCModel__ImplementsSetServices((NUOPCModel__ImplementsSetServices)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_INIT_P1:
				return validateNUOPCModel__ImplementsInitP1((NUOPCModel__ImplementsInitP1)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_INIT_P2:
				return validateNUOPCModel__ImplementsInitP2((NUOPCModel__ImplementsInitP2)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_IMPORT_FIELD:
				return validateNUOPCModel__AdvertisesImportField((NUOPCModel__AdvertisesImportField)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD:
				return validateNUOPCModel__AdvertisesExportField((NUOPCModel__AdvertisesExportField)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_REALIZES_IMPORT_FIELD:
				return validateNUOPCModel__RealizesImportField((NUOPCModel__RealizesImportField)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD:
				return validateNUOPCModel__RealizesExportField((NUOPCModel__RealizesExportField)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_MODEL_ADVANCE:
				return validateNUOPCModel__ImplementsModelAdvance((NUOPCModel__ImplementsModelAdvance)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE:
				return validateNUOPCModel__ModelAdvance((NUOPCModel__ModelAdvance)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE_IMPLEMENTS_SUBROUTINE:
				return validateNUOPCModel__ModelAdvance__ImplementsSubroutine((NUOPCModel__ModelAdvance__ImplementsSubroutine)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE_ATTACHED:
				return validateNUOPCModel__ModelAdvance__Attached((NUOPCModel__ModelAdvance__Attached)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER:
				return validateNUOPCDriver((NUOPCDriver)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS:
				return validateNUOPCDriver__GenericImports((NUOPCDriver__GenericImports)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_MODEL_IMPORTS:
				return validateNUOPCDriver__ModelImports((NUOPCDriver__ModelImports)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT:
				return validateNUOPCDriver__ModelImports__ModelImport((NUOPCDriver__ModelImports__ModelImport)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS:
				return validateNUOPCDriver__ConnectorImports((NUOPCDriver__ConnectorImports)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT:
				return validateNUOPCDriver__ConnectorImports__ConnectorImport((NUOPCDriver__ConnectorImports__ConnectorImport)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES:
				return validateNUOPCDriver__ImplementsSetServices((NUOPCDriver__ImplementsSetServices)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT:
				return validateNUOPCDriver__ImplementsSetModelCount((NUOPCDriver__ImplementsSetModelCount)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES:
				return validateNUOPCDriver__ImplementsSetModelServices((NUOPCDriver__ImplementsSetModelServices)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN:
				return validateNUOPCDriverAtmOcn((NUOPCDriverAtmOcn)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS:
				return validateNUOPCDriverAtmOcn__GenericImports((NUOPCDriverAtmOcn__GenericImports)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS:
				return validateNUOPCDriverAtmOcn__ModelImports((NUOPCDriverAtmOcn__ModelImports)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES:
				return validateNUOPCDriverAtmOcn__ImplementsSetServices((NUOPCDriverAtmOcn__ImplementsSetServices)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT:
				return validateNUOPCDriverAtmOcn__ImplementsSetModelCount((NUOPCDriverAtmOcn__ImplementsSetModelCount)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES:
				return validateNUOPCDriverAtmOcn__ImplementsSetModelServices((NUOPCDriverAtmOcn__ImplementsSetModelServices)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_PET_LISTS:
				return validateNUOPCDriverAtmOcn__ImplementsSetModelPetLists((NUOPCDriverAtmOcn__ImplementsSetModelPetLists)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT:
				return validateNUOPCDriverAtmOcn__ModelImports__ModelImport((NUOPCDriverAtmOcn__ModelImports__ModelImport)value, diagnostics, context);
			case NUOPCPackage.CALLS_GENERIC_SET_SERVICES:
				return validateCallsGenericSetServices((CallsGenericSetServices)value, diagnostics, context);
			case NUOPCPackage.CALLS_SET_ENTRY_POINT:
				return validateCallsSetEntryPoint((CallsSetEntryPoint)value, diagnostics, context);
			case NUOPCPackage.ATTACHES_METHOD:
				return validateAttachesMethod((AttachesMethod)value, diagnostics, context);
			case NUOPCPackage.SET_MODEL_SERVICES:
				return validateSetModelServices((SetModelServices)value, diagnostics, context);
			case NUOPCPackage.SET_COUPLER_SERVICES:
				return validateSetCouplerServices((SetCouplerServices)value, diagnostics, context);
			case NUOPCPackage.GETS_INTERNAL_STATE:
				return validateGetsInternalState((GetsInternalState)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MEDIATOR:
				return validateNUOPCMediator((NUOPCMediator)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MEDIATOR_GENERIC_IMPORTS:
				return validateNUOPCMediator__GenericImports((NUOPCMediator__GenericImports)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MEDIATOR_INIT:
				return validateNUOPCMediator__Init((NUOPCMediator__Init)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES:
				return validateNUOPCMediator__ImplementsSetServices((NUOPCMediator__ImplementsSetServices)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1:
				return validateNUOPCMediator__ImplementsInitP1((NUOPCMediator__ImplementsInitP1)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2:
				return validateNUOPCMediator__ImplementsInitP2((NUOPCMediator__ImplementsInitP2)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD:
				return validateNUOPCMediator__AdvertisesImportField((NUOPCMediator__AdvertisesImportField)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD:
				return validateNUOPCMediator__AdvertisesExportField((NUOPCMediator__AdvertisesExportField)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD:
				return validateNUOPCMediator__RealizesImportField((NUOPCMediator__RealizesImportField)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD:
				return validateNUOPCMediator__RealizesExportField((NUOPCMediator__RealizesExportField)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MEDIATOR_MODEL_ADVANCE:
				return validateNUOPCMediator__ModelAdvance((NUOPCMediator__ModelAdvance)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTop(Top top, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(top, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCApplication(NUOPCApplication nuopcApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcApplication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel(NUOPCModel nuopcModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__GenericImports(NUOPCModel__GenericImports nuopcModel__GenericImports, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcModel__GenericImports, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__Init(NUOPCModel__Init nuopcModel__Init, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcModel__Init, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__ImplementsSetServices(NUOPCModel__ImplementsSetServices nuopcModel__ImplementsSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nuopcModel__ImplementsSetServices, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nuopcModel__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nuopcModel__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nuopcModel__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nuopcModel__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nuopcModel__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nuopcModel__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nuopcModel__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nuopcModel__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validateNUOPCModel__ImplementsSetServices_registersInitP1(nuopcModel__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validateNUOPCModel__ImplementsSetServices_registersInitP2(nuopcModel__ImplementsSetServices, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the registersInitP1 constraint of '<em>Model Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__REGISTERS_INIT_P1__EEXPRESSION = "self.parent.initialize.implementsInitP1=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP1.name)->notEmpty()";

	/**
	 * Validates the registersInitP1 constraint of '<em>Model Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__ImplementsSetServices_registersInitP1(NUOPCModel__ImplementsSetServices nuopcModel__ImplementsSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(NUOPCPackage.Literals.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES,
				 nuopcModel__ImplementsSetServices,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "registersInitP1",
				 NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__REGISTERS_INIT_P1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the registersInitP2 constraint of '<em>Model Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__REGISTERS_INIT_P2__EEXPRESSION = "self.parent.initialize.implementsInitP2=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP2.name)->notEmpty()";

	/**
	 * Validates the registersInitP2 constraint of '<em>Model Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__ImplementsSetServices_registersInitP2(NUOPCModel__ImplementsSetServices nuopcModel__ImplementsSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(NUOPCPackage.Literals.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES,
				 nuopcModel__ImplementsSetServices,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "registersInitP2",
				 NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__REGISTERS_INIT_P2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__ImplementsInitP1(NUOPCModel__ImplementsInitP1 nuopcModel__ImplementsInitP1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcModel__ImplementsInitP1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__ImplementsInitP2(NUOPCModel__ImplementsInitP2 nuopcModel__ImplementsInitP2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcModel__ImplementsInitP2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__AdvertisesImportField(NUOPCModel__AdvertisesImportField nuopcModel__AdvertisesImportField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcModel__AdvertisesImportField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__AdvertisesExportField(NUOPCModel__AdvertisesExportField nuopcModel__AdvertisesExportField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcModel__AdvertisesExportField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__RealizesImportField(NUOPCModel__RealizesImportField nuopcModel__RealizesImportField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcModel__RealizesImportField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__RealizesExportField(NUOPCModel__RealizesExportField nuopcModel__RealizesExportField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcModel__RealizesExportField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__ImplementsModelAdvance(NUOPCModel__ImplementsModelAdvance nuopcModel__ImplementsModelAdvance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcModel__ImplementsModelAdvance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__ModelAdvance(NUOPCModel__ModelAdvance nuopcModel__ModelAdvance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcModel__ModelAdvance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__ModelAdvance__ImplementsSubroutine(NUOPCModel__ModelAdvance__ImplementsSubroutine nuopcModel__ModelAdvance__ImplementsSubroutine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcModel__ModelAdvance__ImplementsSubroutine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCModel__ModelAdvance__Attached(NUOPCModel__ModelAdvance__Attached nuopcModel__ModelAdvance__Attached, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcModel__ModelAdvance__Attached, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriver(NUOPCDriver nuopcDriver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriver, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriver__GenericImports(NUOPCDriver__GenericImports nuopcDriver__GenericImports, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriver__GenericImports, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriver__ModelImports(NUOPCDriver__ModelImports nuopcDriver__ModelImports, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriver__ModelImports, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriver__ModelImports__ModelImport(NUOPCDriver__ModelImports__ModelImport nuopcDriver__ModelImports__ModelImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriver__ModelImports__ModelImport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriver__ConnectorImports(NUOPCDriver__ConnectorImports nuopcDriver__ConnectorImports, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriver__ConnectorImports, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriver__ConnectorImports__ConnectorImport(NUOPCDriver__ConnectorImports__ConnectorImport nuopcDriver__ConnectorImports__ConnectorImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriver__ConnectorImports__ConnectorImport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriver__ImplementsSetServices(NUOPCDriver__ImplementsSetServices nuopcDriver__ImplementsSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriver__ImplementsSetServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriver__ImplementsSetModelCount(NUOPCDriver__ImplementsSetModelCount nuopcDriver__ImplementsSetModelCount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriver__ImplementsSetModelCount, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriver__ImplementsSetModelServices(NUOPCDriver__ImplementsSetModelServices nuopcDriver__ImplementsSetModelServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriver__ImplementsSetModelServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriverAtmOcn(NUOPCDriverAtmOcn nuopcDriverAtmOcn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriverAtmOcn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriverAtmOcn__GenericImports(NUOPCDriverAtmOcn__GenericImports nuopcDriverAtmOcn__GenericImports, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriverAtmOcn__GenericImports, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriverAtmOcn__ModelImports(NUOPCDriverAtmOcn__ModelImports nuopcDriverAtmOcn__ModelImports, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriverAtmOcn__ModelImports, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriverAtmOcn__ImplementsSetServices(NUOPCDriverAtmOcn__ImplementsSetServices nuopcDriverAtmOcn__ImplementsSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriverAtmOcn__ImplementsSetServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriverAtmOcn__ImplementsSetModelCount(NUOPCDriverAtmOcn__ImplementsSetModelCount nuopcDriverAtmOcn__ImplementsSetModelCount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriverAtmOcn__ImplementsSetModelCount, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriverAtmOcn__ImplementsSetModelServices(NUOPCDriverAtmOcn__ImplementsSetModelServices nuopcDriverAtmOcn__ImplementsSetModelServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriverAtmOcn__ImplementsSetModelServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriverAtmOcn__ImplementsSetModelPetLists(NUOPCDriverAtmOcn__ImplementsSetModelPetLists nuopcDriverAtmOcn__ImplementsSetModelPetLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriverAtmOcn__ImplementsSetModelPetLists, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCDriverAtmOcn__ModelImports__ModelImport(NUOPCDriverAtmOcn__ModelImports__ModelImport nuopcDriverAtmOcn__ModelImports__ModelImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriverAtmOcn__ModelImports__ModelImport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallsGenericSetServices(CallsGenericSetServices callsGenericSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callsGenericSetServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallsSetEntryPoint(CallsSetEntryPoint callsSetEntryPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callsSetEntryPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttachesMethod(AttachesMethod attachesMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attachesMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetModelServices(SetModelServices setModelServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setModelServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetCouplerServices(SetCouplerServices setCouplerServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setCouplerServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetsInternalState(GetsInternalState getsInternalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getsInternalState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCMediator(NUOPCMediator nuopcMediator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcMediator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCMediator__GenericImports(NUOPCMediator__GenericImports nuopcMediator__GenericImports, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcMediator__GenericImports, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCMediator__Init(NUOPCMediator__Init nuopcMediator__Init, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcMediator__Init, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCMediator__ImplementsSetServices(NUOPCMediator__ImplementsSetServices nuopcMediator__ImplementsSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nuopcMediator__ImplementsSetServices, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nuopcMediator__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nuopcMediator__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nuopcMediator__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nuopcMediator__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nuopcMediator__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nuopcMediator__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nuopcMediator__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nuopcMediator__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validateNUOPCMediator__ImplementsSetServices_registersInitP1(nuopcMediator__ImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validateNUOPCMediator__ImplementsSetServices_registersInitP2(nuopcMediator__ImplementsSetServices, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the registersInitP1 constraint of '<em>Mediator Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__REGISTERS_INIT_P1__EEXPRESSION = "self.parent.initialize.implementsInitP1=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP1.name)->notEmpty()";

	/**
	 * Validates the registersInitP1 constraint of '<em>Mediator Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCMediator__ImplementsSetServices_registersInitP1(NUOPCMediator__ImplementsSetServices nuopcMediator__ImplementsSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(NUOPCPackage.Literals.NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES,
				 nuopcMediator__ImplementsSetServices,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "registersInitP1",
				 NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__REGISTERS_INIT_P1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the registersInitP2 constraint of '<em>Mediator Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__REGISTERS_INIT_P2__EEXPRESSION = "self.parent.initialize.implementsInitP2=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP2.name)->notEmpty()";

	/**
	 * Validates the registersInitP2 constraint of '<em>Mediator Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCMediator__ImplementsSetServices_registersInitP2(NUOPCMediator__ImplementsSetServices nuopcMediator__ImplementsSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(NUOPCPackage.Literals.NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES,
				 nuopcMediator__ImplementsSetServices,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "registersInitP2",
				 NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__REGISTERS_INIT_P2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCMediator__ImplementsInitP1(NUOPCMediator__ImplementsInitP1 nuopcMediator__ImplementsInitP1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcMediator__ImplementsInitP1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCMediator__ImplementsInitP2(NUOPCMediator__ImplementsInitP2 nuopcMediator__ImplementsInitP2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcMediator__ImplementsInitP2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCMediator__AdvertisesImportField(NUOPCMediator__AdvertisesImportField nuopcMediator__AdvertisesImportField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcMediator__AdvertisesImportField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCMediator__AdvertisesExportField(NUOPCMediator__AdvertisesExportField nuopcMediator__AdvertisesExportField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcMediator__AdvertisesExportField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCMediator__RealizesImportField(NUOPCMediator__RealizesImportField nuopcMediator__RealizesImportField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcMediator__RealizesImportField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCMediator__RealizesExportField(NUOPCMediator__RealizesExportField nuopcMediator__RealizesExportField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcMediator__RealizesExportField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUOPCMediator__ModelAdvance(NUOPCMediator__ModelAdvance nuopcMediator__ModelAdvance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcMediator__ModelAdvance, diagnostics, context);
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

} //NUOPCValidator
