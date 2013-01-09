/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.earthsystemcurator.cupid.sidl.Argument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Field Create SIDL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFCallFieldCreateSIDL#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFCallFieldCreateSIDL()
 * @model
 * @generated
 */
public interface ESMFCallFieldCreateSIDL extends ESMFCall {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(Argument)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFCallFieldCreateSIDL_Argument()
	 * @model required="true"
	 * @generated
	 */
	Argument getArgument();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFCallFieldCreateSIDL#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Argument value);

} // ESMFCallFieldCreateSIDL
