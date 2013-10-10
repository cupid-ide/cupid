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
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model_Init#getImplementsInitP1 <em>Implements Init P1</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model_Init#getImplementsInitP2 <em>Implements Init P2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModel_Init()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Model Initialization'"
 * @generated
 */
public interface Model_Init extends EObject {
	/**
	 * Returns the value of the '<em><b>Implements Init P1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Init P1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Init P1</em>' containment reference.
	 * @see #setImplementsInitP1(ModelImplementsInitP1)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModel_Init_ImplementsInitP1()
	 * @model containment="true" keys="name" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\"'"
	 * @generated
	 */
	ModelImplementsInitP1 getImplementsInitP1();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model_Init#getImplementsInitP1 <em>Implements Init P1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Init P1</em>' containment reference.
	 * @see #getImplementsInitP1()
	 * @generated
	 */
	void setImplementsInitP1(ModelImplementsInitP1 value);

	/**
	 * Returns the value of the '<em><b>Implements Init P2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Init P2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Init P2</em>' containment reference.
	 * @see #setImplementsInitP2(ModelImplementsInitP2)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModel_Init_ImplementsInitP2()
	 * @model containment="true" keys="name" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\"'"
	 * @generated
	 */
	ModelImplementsInitP2 getImplementsInitP2();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model_Init#getImplementsInitP2 <em>Implements Init P2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Init P2</em>' containment reference.
	 * @see #getImplementsInitP2()
	 * @generated
	 */
	void setImplementsInitP2(ModelImplementsInitP2 value);

} // Model_Init
