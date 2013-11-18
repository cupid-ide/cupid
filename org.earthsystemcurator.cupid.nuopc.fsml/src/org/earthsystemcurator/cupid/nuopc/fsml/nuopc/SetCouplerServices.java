/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Coupler Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices#getCplComp <em>Cpl Comp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices#getSubroutineName <em>Subroutine Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getSetCouplerServices()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Set Coupler Services'"
 * @generated
 */
public interface SetCouplerServices extends EObject {
	/**
	 * Returns the value of the '<em><b>Cpl Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpl Comp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpl Comp</em>' attribute.
	 * @see #setCplComp(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getSetCouplerServices_CplComp()
	 * @model required="true"
	 * @generated
	 */
	String getCplComp();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices#getCplComp <em>Cpl Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpl Comp</em>' attribute.
	 * @see #getCplComp()
	 * @generated
	 */
	void setCplComp(String value);

	/**
	 * Returns the value of the '<em><b>Subroutine Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subroutine Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subroutine Name</em>' attribute.
	 * @see #setSubroutineName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getSetCouplerServices_SubroutineName()
	 * @model required="true"
	 * @generated
	 */
	String getSubroutineName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices#getSubroutineName <em>Subroutine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subroutine Name</em>' attribute.
	 * @see #getSubroutineName()
	 * @generated
	 */
	void setSubroutineName(String value);

} // SetCouplerServices
