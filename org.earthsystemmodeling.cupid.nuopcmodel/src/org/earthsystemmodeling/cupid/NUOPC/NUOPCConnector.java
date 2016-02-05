/**
 */
package org.earthsystemmodeling.cupid.NUOPC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCConnector#getSource <em>Source</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCConnector#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getNUOPCConnector()
 * @model
 * @generated
 */
public interface NUOPCConnector extends NUOPCComponent {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NUOPCBaseModel)
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getNUOPCConnector_Source()
	 * @model required="true"
	 * @generated
	 */
	NUOPCBaseModel getSource();

	/**
	 * Sets the value of the '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCConnector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NUOPCBaseModel value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NUOPCBaseModel)
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getNUOPCConnector_Target()
	 * @model required="true"
	 * @generated
	 */
	NUOPCBaseModel getTarget();

	/**
	 * Sets the value of the '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCConnector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NUOPCBaseModel value);

} // NUOPCConnector
