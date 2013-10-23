/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.util;

import java.util.Map;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.*;
import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.examples.xtext.oclinecore.validation.OCLinEcoreEObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage
 * @generated not
 */
public class NUOPCValidator extends OCLinEcoreEObjectValidator {
	//START HERE - dealing with custom validation messages
	
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
			case NUOPCPackage.NUOPC_MODEL:
				return validateNUOPCModel((NUOPCModel)value, diagnostics, context);
			case NUOPCPackage.NUOPC_MODEL_GENERIC_IMPORTS:
				return validateNUOPCModel__GenericImports((NUOPCModel__GenericImports)value, diagnostics, context);
			case NUOPCPackage.MODEL_INIT:
				return validateModel_Init((Model_Init)value, diagnostics, context);
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES:
				return validateModelImplementsSetServices((ModelImplementsSetServices)value, diagnostics, context);
			case NUOPCPackage.CALLS_GENERIC_SET_SERVICES:
				return validateCallsGenericSetServices((CallsGenericSetServices)value, diagnostics, context);
			case NUOPCPackage.CALLS_SET_ENTRY_POINT:
				return validateCallsSetEntryPoint((CallsSetEntryPoint)value, diagnostics, context);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1:
				return validateModelImplementsInitP1((ModelImplementsInitP1)value, diagnostics, context);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2:
				return validateModelImplementsInitP2((ModelImplementsInitP2)value, diagnostics, context);
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD:
				return validateAdvertisesImportField((AdvertisesImportField)value, diagnostics, context);
			case NUOPCPackage.ADVERTISES_EXPORT_FIELD:
				return validateAdvertisesExportField((AdvertisesExportField)value, diagnostics, context);
			case NUOPCPackage.REALIZES_IMPORT_FIELD:
				return validateRealizesImportField((RealizesImportField)value, diagnostics, context);
			case NUOPCPackage.REALIZES_EXPORT_FIELD:
				return validateRealizesExportField((RealizesExportField)value, diagnostics, context);
			case NUOPCPackage.MODEL_ADVANCE:
				return validateModelAdvance((ModelAdvance)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER:
				return validateNUOPCDriver((NUOPCDriver)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS:
				return validateNUOPCDriver__GenericImports((NUOPCDriver__GenericImports)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES:
				return validateNUOPCDriver__ImplementsSetServices((NUOPCDriver__ImplementsSetServices)value, diagnostics, context);
			case NUOPCPackage.ATTACHES_METHOD:
				return validateAttachesMethod((AttachesMethod)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT:
				return validateNUOPCDriver__ImplementsSetModelCount((NUOPCDriver__ImplementsSetModelCount)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES:
				return validateNUOPCDriver__ImplementsSetModelServices((NUOPCDriver__ImplementsSetModelServices)value, diagnostics, context);
			case NUOPCPackage.GETS_INTERNAL_STATE:
				return validateGetsInternalState((GetsInternalState)value, diagnostics, context);
			case NUOPCPackage.NUOPC_APPLICATION:
				return validateNUOPCApplication((NUOPCApplication)value, diagnostics, context);
			case NUOPCPackage.TOP:
				return validateTop((Top)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN:
				return validateNUOPCDriverAtmOcn((NUOPCDriverAtmOcn)value, diagnostics, context);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES:
				return validateNUOPCDriverAtmOcn__ImplementsSetServices((NUOPCDriverAtmOcn__ImplementsSetServices)value, diagnostics, context);
			default:
				return true;
		}
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
	public boolean validateModelImplementsSetServices(ModelImplementsSetServices modelImplementsSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modelImplementsSetServices, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modelImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modelImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modelImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modelImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modelImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modelImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modelImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modelImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelImplementsSetServices_registersInitP1(modelImplementsSetServices, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelImplementsSetServices_registersInitP2(modelImplementsSetServices, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the registersInitP1 constraint of '<em>Model Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL_IMPLEMENTS_SET_SERVICES__REGISTERS_INIT_P1__EEXPRESSION = "self.parent.initialize.implementsInitP1=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP1.name)->notEmpty()";

	/**
	 * Validates the registersInitP1 constraint of '<em>Model Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelImplementsSetServices_registersInitP1(ModelImplementsSetServices modelImplementsSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(NUOPCPackage.Literals.MODEL_IMPLEMENTS_SET_SERVICES,
				 modelImplementsSetServices,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "registersInitP1",
				 MODEL_IMPLEMENTS_SET_SERVICES__REGISTERS_INIT_P1__EEXPRESSION,
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
	protected static final String MODEL_IMPLEMENTS_SET_SERVICES__REGISTERS_INIT_P2__EEXPRESSION = "self.parent.initialize.implementsInitP2=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP2.name)->notEmpty()";

	/**
	 * Validates the registersInitP2 constraint of '<em>Model Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelImplementsSetServices_registersInitP2(ModelImplementsSetServices modelImplementsSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(NUOPCPackage.Literals.MODEL_IMPLEMENTS_SET_SERVICES,
				 modelImplementsSetServices,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "registersInitP2",
				 MODEL_IMPLEMENTS_SET_SERVICES__REGISTERS_INIT_P2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	public boolean validateModel_Init(Model_Init model_Init, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model_Init, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelImplementsInitP1(ModelImplementsInitP1 modelImplementsInitP1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelImplementsInitP1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelImplementsInitP2(ModelImplementsInitP2 modelImplementsInitP2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelImplementsInitP2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvertisesImportField(AdvertisesImportField advertisesImportField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(advertisesImportField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvertisesExportField(AdvertisesExportField advertisesExportField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(advertisesExportField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealizesImportField(RealizesImportField realizesImportField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realizesImportField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealizesExportField(RealizesExportField realizesExportField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realizesExportField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelAdvance(ModelAdvance modelAdvance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelAdvance, diagnostics, context);
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
	public boolean validateNUOPCDriver__ImplementsSetServices(NUOPCDriver__ImplementsSetServices nuopcDriver__ImplementsSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriver__ImplementsSetServices, diagnostics, context);
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
	public boolean validateGetsInternalState(GetsInternalState getsInternalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getsInternalState, diagnostics, context);
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
	public boolean validateTop(Top top, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(top, diagnostics, context);
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
	public boolean validateNUOPCDriverAtmOcn__ImplementsSetServices(NUOPCDriverAtmOcn__ImplementsSetServices nuopcDriverAtmOcn__ImplementsSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nuopcDriverAtmOcn__ImplementsSetServices, diagnostics, context);
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
	
	@Override
	//This method should not have to exist, but I believe there is a bug preventing the current
	//Ecore implementation from correctly reading the message.
	//For now this does not support a computed validation message, which requires executing OCL.
	protected void reportConstraintDelegateViolation(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context, String constraint, int severity, String source, int code)
	  {
	    String validationMessage = getValidationMessage(eClass, constraint);
	    if (validationMessage == null) {
	    	validationMessage = getString("_UI_GenericConstraint_diagnostic", new Object[] { constraint, getObjectLabel(eObject, context) });
	    }
		diagnostics.add
	      (new BasicDiagnostic
	        (severity,
	         source,
	         code,
	         validationMessage,
	         new Object [] { eObject }));
	  }
	
	protected String getValidationMessage(EClass eClass, String constraint) {
		EAnnotation ann = eClass.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore/OCL");
		if (ann != null) {
			String msg = ann.getDetails().get(constraint + "$message");
			if (msg != null) {
				if (msg.startsWith("'") && msg.endsWith("'")) {
					return msg.substring(1, msg.length()-1);
				}
			}
		}
		return null;
	}

} //NUOPCValidator
