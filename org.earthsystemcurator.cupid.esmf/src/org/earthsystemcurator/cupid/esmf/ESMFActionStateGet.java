/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action State Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateGet#getState <em>State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateGet#getItemName <em>Item Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateGet#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionStateGet()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_StateGet'"
 * @generated
 */
public interface ESMFActionStateGet extends ESMFActionAPI {
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionStateGet_State()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam keyword='null'"
	 * @generated
	 */
	ESMFState getState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateGet#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(ESMFState value);

	/**
	 * Returns the value of the '<em><b>Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Name</em>' attribute.
	 * @see #setItemName(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionStateGet_ItemName()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken" required="true"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='character' keyword='null'"
	 * @generated
	 */
	String getItemName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateGet#getItemName <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Name</em>' attribute.
	 * @see #getItemName()
	 * @generated
	 */
	void setItemName(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(ESMFStateItem)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionStateGet_Item()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam keyword='null'"
	 * @generated
	 */
	ESMFStateItem getItem();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateGet#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(ESMFStateItem value);

} // ESMFActionStateGet
