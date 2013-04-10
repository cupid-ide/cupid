/**
 */
package org.earthsystemcurator.cupid.fm.cplfm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coupler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.Coupler#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getCoupler()
 * @model
 * @generated
 */
public interface Coupler extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getCoupler_Connector()
	 * @model required="true"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.fm.cplfm.Coupler#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

} // Coupler
