/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Array Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreate#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionArrayCreate()
 * @model
 * @generated
 */
public interface ESMFActionArrayCreate extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' reference.
	 * @see #setArray(ESMFArray)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionArrayCreate_Array()
	 * @model required="true"
	 * @generated
	 */
	ESMFArray getArray();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreate#getArray <em>Array</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(ESMFArray value);

} // ESMFActionArrayCreate
