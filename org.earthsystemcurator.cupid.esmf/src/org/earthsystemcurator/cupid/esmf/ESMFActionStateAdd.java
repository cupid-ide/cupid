/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action State Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateAdd#getState <em>State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateAdd#getItemList <em>Item List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionStateAdd()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_StateAdd'"
 * @generated
 */
public interface ESMFActionStateAdd extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(ESMFState)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionStateAdd_State()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam keyword='null'"
	 * @generated
	 */
	ESMFState getState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateAdd#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(ESMFState value);

	/**
	 * Returns the value of the '<em><b>Item List</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFStateItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item List</em>' reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionStateAdd_ItemList()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam keyword='null'"
	 * @generated
	 */
	EList<ESMFStateItem> getItemList();

} // ESMFActionStateAdd
