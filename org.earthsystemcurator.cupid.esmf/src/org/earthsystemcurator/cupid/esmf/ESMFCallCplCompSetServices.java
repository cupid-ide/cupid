/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Cpl Comp Set Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFCallCplCompSetServices#getCplcomp <em>Cplcomp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFCallCplCompSetServices()
 * @model
 * @generated
 */
public interface ESMFCallCplCompSetServices extends ESMFCall {
	/**
	 * Returns the value of the '<em><b>Cplcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cplcomp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cplcomp</em>' reference.
	 * @see #setCplcomp(ESMFComponent)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFCallCplCompSetServices_Cplcomp()
	 * @model required="true"
	 * @generated
	 */
	ESMFComponent getCplcomp();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFCallCplCompSetServices#getCplcomp <em>Cplcomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cplcomp</em>' reference.
	 * @see #getCplcomp()
	 * @generated
	 */
	void setCplcomp(ESMFComponent value);

} // ESMFCallCplCompSetServices
