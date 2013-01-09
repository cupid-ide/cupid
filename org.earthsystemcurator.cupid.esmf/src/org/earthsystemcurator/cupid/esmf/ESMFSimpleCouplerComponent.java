/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Coupler Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFSimpleCouplerComponent#getFieldConnection <em>Field Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFSimpleCouplerComponent()
 * @model
 * @generated
 */
public interface ESMFSimpleCouplerComponent extends ESMFCouplerComponent {
	/**
	 * Returns the value of the '<em><b>Field Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFFieldConnection}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Connection</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFSimpleCouplerComponent_FieldConnection()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFFieldConnection#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<ESMFFieldConnection> getFieldConnection();

} // ESMFSimpleCouplerComponent
