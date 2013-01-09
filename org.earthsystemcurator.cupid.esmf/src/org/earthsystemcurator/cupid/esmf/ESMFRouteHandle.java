/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Handle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFRouteHandle#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFRouteHandle()
 * @model
 * @generated
 */
public interface ESMFRouteHandle extends ESMFNamedEntity {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getRouteHandle <em>Route Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(ESMFComponent)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFRouteHandle_Component()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getRouteHandle
	 * @model opposite="routeHandle" required="true" transient="false"
	 * @generated
	 */
	ESMFComponent getComponent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFRouteHandle#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ESMFComponent value);

} // ESMFRouteHandle
