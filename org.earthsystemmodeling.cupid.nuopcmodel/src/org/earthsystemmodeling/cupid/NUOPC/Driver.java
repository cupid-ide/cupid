/**
 */
package org.earthsystemmodeling.cupid.NUOPC;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Driver#getChildren <em>Children</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Driver#getRunSequence <em>Run Sequence</em>}</li>
 * </ul>
 *
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getDriver()
 * @model
 * @generated
 */
public interface Driver extends Component {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemmodeling.cupid.NUOPC.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getDriver_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getChildren();

	/**
	 * Returns the value of the '<em><b>Run Sequence</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemmodeling.cupid.NUOPC.Advance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Sequence</em>' reference list.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getDriver_RunSequence()
	 * @model
	 * @generated
	 */
	EList<Advance> getRunSequence();

} // Driver
