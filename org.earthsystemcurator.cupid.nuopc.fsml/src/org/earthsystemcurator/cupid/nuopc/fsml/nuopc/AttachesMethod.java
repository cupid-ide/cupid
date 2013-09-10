/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attaches Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod#getMethodLabel <em>Method Label</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod#getUserRoutine <em>User Routine</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getAttachesMethod()
 * @model
 * @generated
 */
public interface AttachesMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Method Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Label</em>' attribute.
	 * @see #setMethodLabel(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getAttachesMethod_MethodLabel()
	 * @model annotation="http://www.earthsystemcog.org/projects/nuopc mapping='argByIndex: 2'"
	 * @generated
	 */
	String getMethodLabel();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod#getMethodLabel <em>Method Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Label</em>' attribute.
	 * @see #getMethodLabel()
	 * @generated
	 */
	void setMethodLabel(String value);

	/**
	 * Returns the value of the '<em><b>User Routine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Routine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Routine</em>' attribute.
	 * @see #setUserRoutine(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getAttachesMethod_UserRoutine()
	 * @model annotation="http://www.earthsystemcog.org/projects/nuopc mapping='argByIndex: 3'"
	 * @generated
	 */
	String getUserRoutine();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod#getUserRoutine <em>User Routine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Routine</em>' attribute.
	 * @see #getUserRoutine()
	 * @generated
	 */
	void setUserRoutine(String value);

} // AttachesMethod
