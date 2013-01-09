/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine#getParentVM <em>Parent VM</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine#getPetID <em>Pet ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFVirtualMachine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PETsAreSubsetOfParentVMPETs'"
 *        annotation="http://www.eclipse.org/ocl/examples/OCL PETsAreSubsetOfParentVMPETs='parentVM.oclIsUndefined() or parentVM.petID->includesAll(petID)'"
 * @generated
 */
public interface ESMFVirtualMachine extends EObject {
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFVirtualMachine_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent VM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent VM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent VM</em>' reference.
	 * @see #setParentVM(ESMFVirtualMachine)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFVirtualMachine_ParentVM()
	 * @model
	 * @generated
	 */
	ESMFVirtualMachine getParentVM();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine#getParentVM <em>Parent VM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent VM</em>' reference.
	 * @see #getParentVM()
	 * @generated
	 */
	void setParentVM(ESMFVirtualMachine value);

	/**
	 * Returns the value of the '<em><b>Pet ID</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pet ID</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pet ID</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFVirtualMachine_PetID()
	 * @model
	 * @generated
	 */
	EList<Integer> getPetID();

} // ESMFVirtualMachine
