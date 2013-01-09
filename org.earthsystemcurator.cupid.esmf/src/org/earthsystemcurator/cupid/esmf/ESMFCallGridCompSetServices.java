/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Grid Comp Set Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFCallGridCompSetServices#getGridcomp <em>Gridcomp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFCallGridCompSetServices()
 * @model
 * @generated
 */
public interface ESMFCallGridCompSetServices extends ESMFCall {
	/**
	 * Returns the value of the '<em><b>Gridcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gridcomp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gridcomp</em>' reference.
	 * @see #setGridcomp(ESMFComponent)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFCallGridCompSetServices_Gridcomp()
	 * @model required="true"
	 * @generated
	 */
	ESMFComponent getGridcomp();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFCallGridCompSetServices#getGridcomp <em>Gridcomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gridcomp</em>' reference.
	 * @see #getGridcomp()
	 * @generated
	 */
	void setGridcomp(ESMFComponent value);

} // ESMFCallGridCompSetServices
