/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.util;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage
 * @generated
 */
public class NUOPCSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NUOPCPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCSwitch() {
		if (modelPackage == null) {
			modelPackage = NUOPCPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NUOPCPackage.NUOPC_MODEL: {
				NUOPCModel nuopcModel = (NUOPCModel)theEObject;
				T result = caseNUOPCModel(nuopcModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES: {
				ModelImplementsSetServices modelImplementsSetServices = (ModelImplementsSetServices)theEObject;
				T result = caseModelImplementsSetServices(modelImplementsSetServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1: {
				ModelImplementsInitP1 modelImplementsInitP1 = (ModelImplementsInitP1)theEObject;
				T result = caseModelImplementsInitP1(modelImplementsInitP1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2: {
				ModelImplementsInitP2 modelImplementsInitP2 = (ModelImplementsInitP2)theEObject;
				T result = caseModelImplementsInitP2(modelImplementsInitP2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD: {
				AdvertisesImportField advertisesImportField = (AdvertisesImportField)theEObject;
				T result = caseAdvertisesImportField(advertisesImportField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.ADVERTISES_EXPORT_FIELD: {
				AdvertisesExportField advertisesExportField = (AdvertisesExportField)theEObject;
				T result = caseAdvertisesExportField(advertisesExportField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.REALIZES_IMPORT_FIELD: {
				RealizesImportField realizesImportField = (RealizesImportField)theEObject;
				T result = caseRealizesImportField(realizesImportField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.REALIZES_EXPORT_FIELD: {
				RealizesExportField realizesExportField = (RealizesExportField)theEObject;
				T result = caseRealizesExportField(realizesExportField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE: {
				AttachesModelAdvance attachesModelAdvance = (AttachesModelAdvance)theEObject;
				T result = caseAttachesModelAdvance(attachesModelAdvance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.MODEL_ADVANCE: {
				ModelAdvance modelAdvance = (ModelAdvance)theEObject;
				T result = caseModelAdvance(modelAdvance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.NUOPC_DRIVER: {
				NUOPCDriver nuopcDriver = (NUOPCDriver)theEObject;
				T result = caseNUOPCDriver(nuopcDriver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES: {
				NUOPCDriver__ImplementsSetServices nuopcDriver__ImplementsSetServices = (NUOPCDriver__ImplementsSetServices)theEObject;
				T result = caseNUOPCDriver__ImplementsSetServices(nuopcDriver__ImplementsSetServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT: {
				NUOPCDriver__ImplementsSetModelCount nuopcDriver__ImplementsSetModelCount = (NUOPCDriver__ImplementsSetModelCount)theEObject;
				T result = caseNUOPCDriver__ImplementsSetModelCount(nuopcDriver__ImplementsSetModelCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.GETS_INTERNAL_STATE: {
				GetsInternalState getsInternalState = (GetsInternalState)theEObject;
				T result = caseGetsInternalState(getsInternalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.NUOPC_APPLICATION: {
				NUOPCApplication nuopcApplication = (NUOPCApplication)theEObject;
				T result = caseNUOPCApplication(nuopcApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN: {
				NUOPCDriverAtmOcn nuopcDriverAtmOcn = (NUOPCDriverAtmOcn)theEObject;
				T result = caseNUOPCDriverAtmOcn(nuopcDriverAtmOcn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES: {
				NUOPCDriverAtmOcn__ImplementsSetServices nuopcDriverAtmOcn__ImplementsSetServices = (NUOPCDriverAtmOcn__ImplementsSetServices)theEObject;
				T result = caseNUOPCDriverAtmOcn__ImplementsSetServices(nuopcDriverAtmOcn__ImplementsSetServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUOPCModel(NUOPCModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Implements Set Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelImplementsSetServices(ModelImplementsSetServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Implements Init P1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Implements Init P1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelImplementsInitP1(ModelImplementsInitP1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Implements Init P2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Implements Init P2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelImplementsInitP2(ModelImplementsInitP2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advertises Import Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advertises Import Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvertisesImportField(AdvertisesImportField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advertises Export Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advertises Export Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvertisesExportField(AdvertisesExportField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realizes Import Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realizes Import Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealizesImportField(RealizesImportField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realizes Export Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realizes Export Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealizesExportField(RealizesExportField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attaches Model Advance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attaches Model Advance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachesModelAdvance(AttachesModelAdvance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Advance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Advance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelAdvance(ModelAdvance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Driver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Driver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUOPCDriver(NUOPCDriver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Driver Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Driver Implements Set Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUOPCDriver__ImplementsSetServices(NUOPCDriver__ImplementsSetServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Driver Implements Set Model Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Driver Implements Set Model Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUOPCDriver__ImplementsSetModelCount(NUOPCDriver__ImplementsSetModelCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gets Internal State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gets Internal State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetsInternalState(GetsInternalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUOPCApplication(NUOPCApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Driver Atm Ocn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Driver Atm Ocn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUOPCDriverAtmOcn(NUOPCDriverAtmOcn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Driver Atm Ocn Implements Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Driver Atm Ocn Implements Set Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUOPCDriverAtmOcn__ImplementsSetServices(NUOPCDriverAtmOcn__ImplementsSetServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NUOPCSwitch
