/**
 */
package org.earthsystemmodeling.cupid.NUOPC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Advance#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getAdvance()
 * @model
 * @generated
 */
public interface Advance extends Specialization {

	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemmodeling.cupid.NUOPC.Component#getAdvance <em>Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getAdvance_Component()
	 * @see org.earthsystemmodeling.cupid.NUOPC.Component#getAdvance
	 * @model opposite="advance" required="true" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link org.earthsystemmodeling.cupid.NUOPC.Advance#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);
} // Advance
