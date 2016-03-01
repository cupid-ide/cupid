/**
 */
package org.earthsystemmodeling.cupid.NUOPC;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCApplication#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getNUOPCApplication()
 * @model
 * @generated
 */
public interface NUOPCApplication extends EObject {

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemmodeling.cupid.NUOPC.NUOPCComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getNUOPCApplication_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<NUOPCComponent> getChildren();

} // NUOPCApplication
