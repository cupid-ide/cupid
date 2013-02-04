/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scoped Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFScopedItem#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFScopedItem()
 * @model abstract="true"
 * @generated
 */
public interface ESMFScopedItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFScope#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(ESMFScope)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFScopedItem_Scope()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFScope#getItem
	 * @model opposite="item" required="true" transient="false"
	 * @generated
	 */
	ESMFScope getScope();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFScopedItem#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ESMFScope value);

} // ESMFScopedItem
