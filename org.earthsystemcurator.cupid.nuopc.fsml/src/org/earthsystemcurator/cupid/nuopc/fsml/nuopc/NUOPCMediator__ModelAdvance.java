/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mediator Model Advance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#isAttachedModelAdvance <em>Attached Model Advance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator__ModelAdvance()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Model Advance' doc='A subroutine called to advance the model ahead by the timestep interval.'"
 * @generated
 */
public interface NUOPCMediator__ModelAdvance extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getImplementsModelAdvance <em>Implements Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCMediator)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator__ModelAdvance_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getImplementsModelAdvance
	 * @model opposite="implementsModelAdvance" required="true" transient="false"
	 * @generated
	 */
	NUOPCMediator getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCMediator value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"ModelAdvance"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator__ModelAdvance_Name()
	 * @model default="ModelAdvance" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutineName' essential='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attached Model Advance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached Model Advance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached Model Advance</em>' attribute.
	 * @see #setAttachedModelAdvance(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator__ModelAdvance_AttachedModelAdvance()
	 * @model required="true" derived="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc essential='true' derivation_real='self.name = \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelModelAdvance).userRoutine->asSequence()->first()'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.parent <> null and self.parent.implementsSetServices <> null and \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.implementsSetServices.attachesMethod->size() > 0 \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tand\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.genericImports <> null and self.parent.genericImports.importsLabelModelAdvance <> null and\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelModelAdvance).userRoutine->includes(self.name)'"
	 * @generated
	 */
	boolean isAttachedModelAdvance();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#isAttachedModelAdvance <em>Attached Model Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached Model Advance</em>' attribute.
	 * @see #isAttachedModelAdvance()
	 * @generated
	 */
	void setAttachedModelAdvance(boolean value);

} // NUOPCMediator__ModelAdvance
