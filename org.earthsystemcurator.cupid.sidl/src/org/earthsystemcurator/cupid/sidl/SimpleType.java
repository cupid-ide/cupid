/**
 */
package org.earthsystemcurator.cupid.sidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.SimpleType#getSimpleType <em>Simple Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getSimpleType()
 * @model
 * @generated
 */
public interface SimpleType extends SIDLType {
	/**
	 * Returns the value of the '<em><b>Simple Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.earthsystemcurator.cupid.sidl.SimpleTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Type</em>' attribute.
	 * @see org.earthsystemcurator.cupid.sidl.SimpleTypeEnum
	 * @see #setSimpleType(SimpleTypeEnum)
	 * @see org.earthsystemcurator.cupid.sidl.SIDLPackage#getSimpleType_SimpleType()
	 * @model required="true"
	 * @generated
	 */
	SimpleTypeEnum getSimpleType();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.sidl.SimpleType#getSimpleType <em>Simple Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Type</em>' attribute.
	 * @see org.earthsystemcurator.cupid.sidl.SimpleTypeEnum
	 * @see #getSimpleType()
	 * @generated
	 */
	void setSimpleType(SimpleTypeEnum value);

} // SimpleType
