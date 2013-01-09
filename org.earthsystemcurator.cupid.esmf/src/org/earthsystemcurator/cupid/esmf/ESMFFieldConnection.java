/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getSrcField <em>Src Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getDstField <em>Dst Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFFieldConnection()
 * @model
 * @generated
 */
public interface ESMFFieldConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Src Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Field</em>' reference.
	 * @see #setSrcField(ESMFField)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFFieldConnection_SrcField()
	 * @model required="true"
	 * @generated
	 */
	ESMFField getSrcField();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getSrcField <em>Src Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Field</em>' reference.
	 * @see #getSrcField()
	 * @generated
	 */
	void setSrcField(ESMFField value);

	/**
	 * Returns the value of the '<em><b>Dst Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst Field</em>' reference.
	 * @see #setDstField(ESMFField)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFFieldConnection_DstField()
	 * @model required="true"
	 * @generated
	 */
	ESMFField getDstField();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getDstField <em>Dst Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst Field</em>' reference.
	 * @see #getDstField()
	 * @generated
	 */
	void setDstField(ESMFField value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFSimpleCouplerComponent#getFieldConnection <em>Field Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(ESMFSimpleCouplerComponent)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFFieldConnection_Component()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFSimpleCouplerComponent#getFieldConnection
	 * @model opposite="fieldConnection" required="true" transient="false"
	 * @generated
	 */
	ESMFSimpleCouplerComponent getComponent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ESMFSimpleCouplerComponent value);

} // ESMFFieldConnection
