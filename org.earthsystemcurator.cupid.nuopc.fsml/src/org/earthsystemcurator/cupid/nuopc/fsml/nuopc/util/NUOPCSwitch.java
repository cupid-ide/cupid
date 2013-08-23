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
			case NUOPCPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES: {
				ModelDefinesSetServices modelDefinesSetServices = (ModelDefinesSetServices)theEObject;
				T result = caseModelDefinesSetServices(modelDefinesSetServices);
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
			case NUOPCPackage.ATTACHES_METHOD: {
				AttachesMethod attachesMethod = (AttachesMethod)theEObject;
				T result = caseAttachesMethod(attachesMethod);
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
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Defines Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Defines Set Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelDefinesSetServices(ModelDefinesSetServices object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Attaches Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attaches Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachesMethod(AttachesMethod object) {
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
