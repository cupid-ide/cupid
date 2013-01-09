/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFStateItem#getWorkspace <em>Workspace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStateItem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ESMFStateItem extends ESMFNamedEntity {
	/**
	 * Returns the value of the '<em><b>Workspace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getStateItem <em>State Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workspace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workspace</em>' reference.
	 * @see #setWorkspace(ESMFWorkspace)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStateItem_Workspace()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getStateItem
	 * @model opposite="stateItem"
	 * @generated
	 */
	ESMFWorkspace getWorkspace();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFStateItem#getWorkspace <em>Workspace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workspace</em>' reference.
	 * @see #getWorkspace()
	 * @generated
	 */
	void setWorkspace(ESMFWorkspace value);

} // ESMFStateItem
