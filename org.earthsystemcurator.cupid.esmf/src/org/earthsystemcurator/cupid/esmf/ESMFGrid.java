/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFGrid#getDistGrid <em>Dist Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFGrid()
 * @model
 * @generated
 */
public interface ESMFGrid extends ESMFNamedEntity, ESMFScopedItem {
	/**
	 * Returns the value of the '<em><b>Dist Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dist Grid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dist Grid</em>' reference.
	 * @see #setDistGrid(ESMFDistGrid)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFGrid_DistGrid()
	 * @model
	 * @generated
	 */
	ESMFDistGrid getDistGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFGrid#getDistGrid <em>Dist Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dist Grid</em>' reference.
	 * @see #getDistGrid()
	 * @generated
	 */
	void setDistGrid(ESMFDistGrid value);

} // ESMFGrid
