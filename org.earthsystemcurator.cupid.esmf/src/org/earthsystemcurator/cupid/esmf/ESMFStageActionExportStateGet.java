/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage Action Export State Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionExportStateGet#getItemName <em>Item Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionExportStateGet#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStageActionExportStateGet()
 * @model
 * @generated
 */
public interface ESMFStageActionExportStateGet extends ESMFStageAction {
	/**
	 * Returns the value of the '<em><b>Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Name</em>' attribute.
	 * @see #setItemName(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStageActionExportStateGet_ItemName()
	 * @model required="true"
	 * @generated
	 */
	String getItemName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionExportStateGet#getItemName <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Name</em>' attribute.
	 * @see #getItemName()
	 * @generated
	 */
	void setItemName(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(ESMFStateItem)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStageActionExportStateGet_Item()
	 * @model required="true"
	 * @generated
	 */
	ESMFStateItem getItem();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionExportStateGet#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(ESMFStateItem value);

} // ESMFStageActionExportStateGet
