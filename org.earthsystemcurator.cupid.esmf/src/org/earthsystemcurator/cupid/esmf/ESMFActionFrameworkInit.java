/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Framework Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkInit#getDefaultCalKind <em>Default Cal Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFrameworkInit()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_Initialize'"
 * @generated
 */
public interface ESMFActionFrameworkInit extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Default Cal Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.earthsystemcurator.cupid.esmf.ESMFCalKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Cal Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Cal Kind</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCalKind
	 * @see #setDefaultCalKind(ESMFCalKind)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFrameworkInit_DefaultCalKind()
	 * @model
	 * @generated
	 */
	ESMFCalKind getDefaultCalKind();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkInit#getDefaultCalKind <em>Default Cal Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Cal Kind</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCalKind
	 * @see #getDefaultCalKind()
	 * @generated
	 */
	void setDefaultCalKind(ESMFCalKind value);

} // ESMFActionFrameworkInit
