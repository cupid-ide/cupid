/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action User Service Invoke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionUserServiceInvoke#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionUserServiceInvoke#getExecution <em>Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionUserServiceInvoke()
 * @model
 * @generated
 */
public interface ESMFActionUserServiceInvoke extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionUserServiceInvoke_Declaration()
	 * @model
	 * @generated
	 */
	EList<String> getDeclaration();

	/**
	 * Returns the value of the '<em><b>Execution</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionUserServiceInvoke_Execution()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getExecution();

} // ESMFActionUserServiceInvoke
