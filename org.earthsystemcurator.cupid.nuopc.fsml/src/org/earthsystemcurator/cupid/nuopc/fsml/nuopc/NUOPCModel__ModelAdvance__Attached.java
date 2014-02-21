/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Model Advance Attached</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance__Attached#getUserRoutine <em>User Routine</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance__Attached#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ModelAdvance__Attached()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Registered in Set Services'"
 * @generated
 */
public interface NUOPCModel__ModelAdvance__Attached extends EObject {
	/**
	 * Returns the value of the '<em><b>User Routine</b></em>' attribute.
	 * The default value is <code>"ModelAdvanceDefault"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Routine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Routine</em>' attribute.
	 * @see #setUserRoutine(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ModelAdvance__Attached_UserRoutine()
	 * @model default="ModelAdvanceDefault" required="true"
	 * @generated
	 */
	String getUserRoutine();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance__Attached#getUserRoutine <em>User Routine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Routine</em>' attribute.
	 * @see #getUserRoutine()
	 * @generated
	 */
	void setUserRoutine(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ModelAdvance__Attached_Index()
	 * @model
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance__Attached#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

} // NUOPCModel__ModelAdvance__Attached
