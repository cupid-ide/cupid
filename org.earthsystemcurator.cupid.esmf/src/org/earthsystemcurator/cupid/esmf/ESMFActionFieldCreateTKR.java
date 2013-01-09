/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Field Create TKR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR#getField <em>Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR#getTypekind <em>Typekind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateTKR()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_FieldCreate'"
 * @generated
 */
public interface ESMFActionFieldCreateTKR extends ESMFActionAPI {
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateTKR_Field()
	 * @model required="true"
	 * @generated
	 */
	ESMFField getField();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(ESMFField value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateTKR_Grid()
	 * @model required="true"
	 * @generated
	 */
	ESMFGrid getGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR#getGrid <em>Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(ESMFGrid value);

	/**
	 * Returns the value of the '<em><b>Typekind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.earthsystemcurator.cupid.esmf.ESMFTypeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typekind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typekind</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTypeKind
	 * @see #setTypekind(ESMFTypeKind)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateTKR_Typekind()
	 * @model required="true"
	 * @generated
	 */
	ESMFTypeKind getTypekind();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR#getTypekind <em>Typekind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typekind</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTypeKind
	 * @see #getTypekind()
	 * @generated
	 */
	void setTypekind(ESMFTypeKind value);

} // ESMFActionFieldCreateTKR
