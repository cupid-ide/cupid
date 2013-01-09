/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Field Halo Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloRelease#getRouteHandle <em>Route Handle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldHaloRelease()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_FieldHaloRelease'"
 * @generated
 */
public interface ESMFActionFieldHaloRelease extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Route Handle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Handle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Handle</em>' reference.
	 * @see #setRouteHandle(ESMFRouteHandle)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldHaloRelease_RouteHandle()
	 * @model required="true"
	 * @generated
	 */
	ESMFRouteHandle getRouteHandle();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloRelease#getRouteHandle <em>Route Handle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Handle</em>' reference.
	 * @see #getRouteHandle()
	 * @generated
	 */
	void setRouteHandle(ESMFRouteHandle value);

} // ESMFActionFieldHaloRelease
