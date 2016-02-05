/**
 */
package org.earthsystemmodeling.cupid.NUOPC.util;

import org.earthsystemmodeling.cupid.NUOPC.*;

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
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage
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
	 * @param ePackage the package in question.
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
			case NUOPCPackage.NUOPC_COMPONENT: {
				NUOPCComponent nuopcComponent = (NUOPCComponent)theEObject;
				T result = caseNUOPCComponent(nuopcComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.NUOPC_BASE_MODEL: {
				NUOPCBaseModel nuopcBaseModel = (NUOPCBaseModel)theEObject;
				T result = caseNUOPCBaseModel(nuopcBaseModel);
				if (result == null) result = caseNUOPCComponent(nuopcBaseModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.NUOPC_DRIVER: {
				NUOPCDriver nuopcDriver = (NUOPCDriver)theEObject;
				T result = caseNUOPCDriver(nuopcDriver);
				if (result == null) result = caseNUOPCComponent(nuopcDriver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.NUOPC_MODEL: {
				NUOPCModel nuopcModel = (NUOPCModel)theEObject;
				T result = caseNUOPCModel(nuopcModel);
				if (result == null) result = caseNUOPCBaseModel(nuopcModel);
				if (result == null) result = caseNUOPCComponent(nuopcModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.NUOPC_MEDIATOR: {
				NUOPCMediator nuopcMediator = (NUOPCMediator)theEObject;
				T result = caseNUOPCMediator(nuopcMediator);
				if (result == null) result = caseNUOPCBaseModel(nuopcMediator);
				if (result == null) result = caseNUOPCComponent(nuopcMediator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.NUOPC_CONNECTOR: {
				NUOPCConnector nuopcConnector = (NUOPCConnector)theEObject;
				T result = caseNUOPCConnector(nuopcConnector);
				if (result == null) result = caseNUOPCComponent(nuopcConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.NUOPC_APPLICATION: {
				NUOPCApplication nuopcApplication = (NUOPCApplication)theEObject;
				T result = caseNUOPCApplication(nuopcApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUOPCComponent(NUOPCComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUOPCBaseModel(NUOPCBaseModel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mediator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUOPCMediator(NUOPCMediator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUOPCConnector(NUOPCConnector object) {
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
