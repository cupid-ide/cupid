/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action State Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateCreate#getState <em>State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateCreate#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionStateCreate()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_StateCreate'"
 * @generated
 */
public interface ESMFActionStateCreate extends ESMFActionAPI {
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionStateCreate_State()
	 * @model required="true"
	 * @generated
	 */
	ESMFState getState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateCreate#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(ESMFState value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionStateCreate_Name()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='character'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateCreate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ESMFActionStateCreate
