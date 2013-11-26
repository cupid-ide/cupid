/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getImplementsInitP1 <em>Implements Init P1</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getImplementsInitP2 <em>Implements Init P2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__Init()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Model Initialization' doc='Framework concepts related to initializing this NUOPC Model'"
 * @generated
 */
public interface NUOPCModel__Init extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getInitialize <em>Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCModel)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__Init_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getInitialize
	 * @model opposite="initialize" required="true" transient="false"
	 * @generated
	 */
	NUOPCModel getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCModel value);

	/**
	 * Returns the value of the '<em><b>Implements Init P1</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Init P1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Init P1</em>' containment reference.
	 * @see #setImplementsInitP1(NUOPCModel__ImplementsInitP1)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__Init_ImplementsInitP1()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getParent
	 * @model opposite="parent" containment="true" keys="name" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\"'"
	 * @generated
	 */
	NUOPCModel__ImplementsInitP1 getImplementsInitP1();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getImplementsInitP1 <em>Implements Init P1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Init P1</em>' containment reference.
	 * @see #getImplementsInitP1()
	 * @generated
	 */
	void setImplementsInitP1(NUOPCModel__ImplementsInitP1 value);

	/**
	 * Returns the value of the '<em><b>Implements Init P2</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Init P2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Init P2</em>' containment reference.
	 * @see #setImplementsInitP2(NUOPCModel__ImplementsInitP2)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__Init_ImplementsInitP2()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2#getParent
	 * @model opposite="parent" containment="true" keys="name" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\"'"
	 * @generated
	 */
	NUOPCModel__ImplementsInitP2 getImplementsInitP2();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getImplementsInitP2 <em>Implements Init P2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Init P2</em>' containment reference.
	 * @see #getImplementsInitP2()
	 * @generated
	 */
	void setImplementsInitP2(NUOPCModel__ImplementsInitP2 value);

} // NUOPCModel__Init
