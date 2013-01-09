/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Field Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGet#getField <em>Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGet#getFarrayPtr <em>Farray Ptr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldGet()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_FieldGet'"
 * @generated
 */
public interface ESMFActionFieldGet extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(ESMFField)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldGet_Field()
	 * @model required="true"
	 * @generated
	 */
	ESMFField getField();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGet#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(ESMFField value);

	/**
	 * Returns the value of the '<em><b>Farray Ptr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Farray Ptr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farray Ptr</em>' attribute.
	 * @see #setFarrayPtr(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldGet_FarrayPtr()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken" required="true"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='real' kind='self.field.array.arraySpec.typekind.toFortranKind()' pointer='true' dim='self.field.grid.distGrid.extent->size()'"
	 * @generated
	 */
	String getFarrayPtr();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGet#getFarrayPtr <em>Farray Ptr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Farray Ptr</em>' attribute.
	 * @see #getFarrayPtr()
	 * @generated
	 */
	void setFarrayPtr(String value);

} // ESMFActionFieldGet
