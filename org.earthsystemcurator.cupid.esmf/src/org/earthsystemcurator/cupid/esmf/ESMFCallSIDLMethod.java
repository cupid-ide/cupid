/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.earthsystemcurator.cupid.sidl.Method;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call SIDL Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFCallSIDLMethod#getSIDLMethod <em>SIDL Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFCallSIDLMethod()
 * @model
 * @generated
 */
public interface ESMFCallSIDLMethod extends ESMFCall {
	/**
	 * Returns the value of the '<em><b>SIDL Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SIDL Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SIDL Method</em>' reference.
	 * @see #setSIDLMethod(Method)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFCallSIDLMethod_SIDLMethod()
	 * @model required="true"
	 * @generated
	 */
	Method getSIDLMethod();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFCallSIDLMethod#getSIDLMethod <em>SIDL Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SIDL Method</em>' reference.
	 * @see #getSIDLMethod()
	 * @generated
	 */
	void setSIDLMethod(Method value);

} // ESMFCallSIDLMethod
