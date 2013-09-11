/**
 */
package org.earthsystemcurator.cupid.fm.cplfm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coupler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.Coupler#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.Coupler#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.Coupler#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.Coupler#getConstituentModel <em>Constituent Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getCoupler()
 * @model
 * @generated
 */
public interface Coupler extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getCoupler_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.fm.cplfm.Coupler#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(Transformation)
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getCoupler_Transformation()
	 * @model required="true"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.fm.cplfm.Coupler#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

	/**
	 * Returns the value of the '<em><b>Constituent Model</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constituent Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constituent Model</em>' reference list.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getCoupler_ConstituentModel()
	 * @model
	 * @generated
	 */
	EList<ConstituentModel> getConstituentModel();

} // Coupler
