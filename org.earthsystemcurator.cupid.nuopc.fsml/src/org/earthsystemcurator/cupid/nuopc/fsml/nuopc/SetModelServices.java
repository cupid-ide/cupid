/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Model Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices#getModelComp <em>Model Comp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices#getSubroutineName <em>Subroutine Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getSetModelServices()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Set Model Services'"
 * @generated
 */
public interface SetModelServices extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Comp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Comp</em>' attribute.
	 * @see #setModelComp(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getSetModelServices_ModelComp()
	 * @model required="true"
	 * @generated
	 */
	String getModelComp();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices#getModelComp <em>Model Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Comp</em>' attribute.
	 * @see #getModelComp()
	 * @generated
	 */
	void setModelComp(String value);

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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getSetModelServices_SubroutineName()
	 * @model required="true"
	 * @generated
	 */
	String getSubroutineName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices#getSubroutineName <em>Subroutine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subroutine Name</em>' attribute.
	 * @see #getSubroutineName()
	 * @generated
	 */
	void setSubroutineName(String value);

} // SetModelServices
