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
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Connector#getSource <em>Source</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Connector#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Component {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(BaseModel)
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getConnector_Source()
	 * @model required="true"
	 * @generated
	 */
	BaseModel getSource();

	/**
	 * Sets the value of the '{@link org.earthsystemmodeling.cupid.NUOPC.Connector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(BaseModel value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(BaseModel)
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getConnector_Target()
	 * @model required="true"
	 * @generated
	 */
	BaseModel getTarget();

	/**
	 * Sets the value of the '{@link org.earthsystemmodeling.cupid.NUOPC.Connector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(BaseModel value);

} // Connector
