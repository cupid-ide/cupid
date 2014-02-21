/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Model Advance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance#getAttached <em>Attached</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance#getImplementsSubroutine <em>Implements Subroutine</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ModelAdvance()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Model Advance' doc='A subroutine called to advance the model ahead by the timestep interval.'"
 * @generated
 */
public interface NUOPCModel__ModelAdvance extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getModelAdvance <em>Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCModel)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ModelAdvance_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getModelAdvance
	 * @model opposite="modelAdvance" required="true" transient="false"
	 * @generated
	 */
	NUOPCModel getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCModel value);

	/**
	 * Returns the value of the '<em><b>Implements Subroutine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Subroutine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Subroutine</em>' containment reference.
	 * @see #setImplementsSubroutine(NUOPCModel__ModelAdvance__ImplementsSubroutine)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ModelAdvance_ImplementsSubroutine()
	 * @model containment="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingNew='subroutine(#../attached/userRoutine(inout type(ESMF_GridComp) gcomp, out integer rc)' essential='true'"
	 * @generated
	 */
	NUOPCModel__ModelAdvance__ImplementsSubroutine getImplementsSubroutine();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance#getImplementsSubroutine <em>Implements Subroutine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Subroutine</em>' containment reference.
	 * @see #getImplementsSubroutine()
	 * @generated
	 */
	void setImplementsSubroutine(NUOPCModel__ModelAdvance__ImplementsSubroutine value);

	/**
	 * Returns the value of the '<em><b>Attached</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached</em>' containment reference.
	 * @see #setAttached(NUOPCModel__ModelAdvance__Attached)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ModelAdvance_Attached()
	 * @model containment="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingNew='#../../implementsSetServices call(ESMF_MethodAdd(#ignore, index?=#index, label=#../../genericImports/importsLabelModelAdvance, userRoutine=#userRoutine, rc=#../../implementsSetServices/rc))' essential='true'"
	 * @generated
	 */
	NUOPCModel__ModelAdvance__Attached getAttached();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance#getAttached <em>Attached</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached</em>' containment reference.
	 * @see #getAttached()
	 * @generated
	 */
	void setAttached(NUOPCModel__ModelAdvance__Attached value);

} // NUOPCModel__ModelAdvance
