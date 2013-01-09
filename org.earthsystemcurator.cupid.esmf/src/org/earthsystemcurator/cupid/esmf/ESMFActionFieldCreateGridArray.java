/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Field Create Grid Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getField <em>Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateGridArray()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_FieldCreate'"
 * @generated
 */
public interface ESMFActionFieldCreateGridArray extends ESMFActionAPI {
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateGridArray_Field()
	 * @model required="true"
	 * @generated
	 */
	ESMFField getField();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(ESMFField value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateGridArray_Name()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='character'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' reference.
	 * @see #setGrid(ESMFGrid)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateGridArray_Grid()
	 * @model required="true"
	 * @generated
	 */
	ESMFGrid getGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getGrid <em>Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(ESMFGrid value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateGridArray_Array()
	 * @model required="true"
	 * @generated
	 */
	ESMFArray getArray();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray#getArray <em>Array</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(ESMFArray value);

} // ESMFActionFieldCreateGridArray
