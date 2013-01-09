/**
 */
package org.earthsystemcurator.cupid.sidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.ArrayType#getDim <em>Dim</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.ArrayType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends SIDLType {
	/**
	 * Returns the value of the '<em><b>Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim</em>' attribute.
	 * @see #setDim(int)
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getArrayType_Dim()
	 * @model required="true"
	 * @generated
	 */
	int getDim();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.sidl.ArrayType#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' attribute.
	 * @see #getDim()
	 * @generated
	 */
	void setDim(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(SIDLType)
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getArrayType_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SIDLType getType();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.sidl.ArrayType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SIDLType value);

} // ArrayType
