/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NUOPC Mediator
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getGenericImports <em>Generic Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getImplementsSetServices <em>Implements Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getInitialize <em>Initialize</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getImplementsModelAdvance <em>Implements Model Advance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc mapping='module' label='NUOPC Mediator'"
 * @generated
 */
public interface NUOPCMediator extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Model"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator_Name()
	 * @model default="Model" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='moduleName'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Generic Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Imports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Imports</em>' containment reference.
	 * @see #setGenericImports(NUOPCMediator__GenericImports)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator_GenericImports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NUOPCMediator__GenericImports getGenericImports();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getGenericImports <em>Generic Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Imports</em>' containment reference.
	 * @see #getGenericImports()
	 * @generated
	 */
	void setGenericImports(NUOPCMediator__GenericImports value);

	/**
	 * Returns the value of the '<em><b>Implements Set Services</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Set Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Set Services</em>' containment reference.
	 * @see #setImplementsSetServices(NUOPCMediator__ImplementsSetServices)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator_ImplementsSetServices()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices#getParent
	 * @model opposite="parent" containment="true" keys="name" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(inout type(ESMF_GridComp) #param_gcomp, out integer #param_rc)\"' essential='true'"
	 * @generated
	 */
	NUOPCMediator__ImplementsSetServices getImplementsSetServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getImplementsSetServices <em>Implements Set Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Set Services</em>' containment reference.
	 * @see #getImplementsSetServices()
	 * @generated
	 */
	void setImplementsSetServices(NUOPCMediator__ImplementsSetServices value);

	/**
	 * Returns the value of the '<em><b>Initialize</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialize</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialize</em>' containment reference.
	 * @see #setInitialize(NUOPCMediator__Init)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator_Initialize()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	NUOPCMediator__Init getInitialize();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator#getInitialize <em>Initialize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialize</em>' containment reference.
	 * @see #getInitialize()
	 * @generated
	 */
	void setInitialize(NUOPCMediator__Init value);

	/**
	 * Returns the value of the '<em><b>Implements Model Advance</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Model Advance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Model Advance</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator_ImplementsModelAdvance()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(type(ESMF_GridComp), integer)\"'"
	 * @generated
	 */
	EList<NUOPCMediator__ModelAdvance> getImplementsModelAdvance();

} // NUOPCMediator
