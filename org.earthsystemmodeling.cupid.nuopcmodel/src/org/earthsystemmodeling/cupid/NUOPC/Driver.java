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
 * </ul>
 *
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getDriver()
 * @model
 * @generated
 */
public interface Driver extends Component {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemmodeling.cupid.NUOPC.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getDriver_Children()
	 * @model
	 * @generated
	 */
	EList<Component> getChildren();

} // Driver
