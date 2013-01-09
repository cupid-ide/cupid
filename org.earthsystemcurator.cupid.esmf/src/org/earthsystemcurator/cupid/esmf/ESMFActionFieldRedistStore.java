/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Field Redist Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore#getSrcField <em>Src Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore#getDstField <em>Dst Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore#getRouteHandle <em>Route Handle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldRedistStore()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_FieldRedistStore'"
 * @generated
 */
public interface ESMFActionFieldRedistStore extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Src Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Field</em>' reference.
	 * @see #setSrcField(ESMFField)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldRedistStore_SrcField()
	 * @model required="true"
	 * @generated
	 */
	ESMFField getSrcField();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore#getSrcField <em>Src Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Field</em>' reference.
	 * @see #getSrcField()
	 * @generated
	 */
	void setSrcField(ESMFField value);

	/**
	 * Returns the value of the '<em><b>Dst Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst Field</em>' reference.
	 * @see #setDstField(ESMFField)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldRedistStore_DstField()
	 * @model required="true"
	 * @generated
	 */
	ESMFField getDstField();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore#getDstField <em>Dst Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst Field</em>' reference.
	 * @see #getDstField()
	 * @generated
	 */
	void setDstField(ESMFField value);

	/**
	 * Returns the value of the '<em><b>Route Handle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Handle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Handle</em>' reference.
	 * @see #setRouteHandle(ESMFRouteHandle)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldRedistStore_RouteHandle()
	 * @model required="true"
	 * @generated
	 */
	ESMFRouteHandle getRouteHandle();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore#getRouteHandle <em>Route Handle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Handle</em>' reference.
	 * @see #getRouteHandle()
	 * @generated
	 */
	void setRouteHandle(ESMFRouteHandle value);

} // ESMFActionFieldRedistStore
