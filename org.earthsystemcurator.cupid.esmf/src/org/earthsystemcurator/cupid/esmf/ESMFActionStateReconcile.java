/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action State Reconcile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateReconcile#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionStateReconcile()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_StateReconcile'"
 * @generated
 */
public interface ESMFActionStateReconcile extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(ESMFState)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionStateReconcile_State()
	 * @model required="true"
	 * @generated
	 */
	ESMFState getState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateReconcile#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(ESMFState value);

} // ESMFActionStateReconcile
