/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Advance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#isAttachedInSetServices <em>Attached In Set Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelAdvance()
 * @model
 * @generated
 */
public interface ModelAdvance extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsModelAdvance <em>Implements Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCModel)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelAdvance_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsModelAdvance
	 * @model opposite="implementsModelAdvance" required="true" transient="false"
	 * @generated
	 */
	NUOPCModel getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCModel value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelAdvance_Name()
	 * @model id="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutineName'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attached In Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached In Set Services</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached In Set Services</em>' attribute.
	 * @see #setAttachedInSetServices(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelAdvance_AttachedInSetServices()
	 * @model required="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.parent.implementsSetServices.attachesModelAdvance.userRoutine = self.name'"
	 * @generated
	 */
	boolean isAttachedInSetServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#isAttachedInSetServices <em>Attached In Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached In Set Services</em>' attribute.
	 * @see #isAttachedInSetServices()
	 * @generated
	 */
	void setAttachedInSetServices(boolean value);

} // ModelAdvance
