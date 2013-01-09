/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dist Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getDe <em>De</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getDeLayout <em>De Layout</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getRegularDecompositionSize <em>Regular Decomposition Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFDistGrid()
 * @model
 * @generated
 */
public interface ESMFDistGrid extends ESMFNamedEntity {
	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.Extent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFDistGrid_Extent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Extent> getExtent();

	/**
	 * Returns the value of the '<em><b>De</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement#getParentDistGrid <em>Parent Dist Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>De</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>De</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFDistGrid_De()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement#getParentDistGrid
	 * @model opposite="parentDistGrid" containment="true"
	 * @generated
	 */
	EList<ESMFDecompositionElement> getDe();

	/**
	 * Returns the value of the '<em><b>De Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>De Layout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>De Layout</em>' reference.
	 * @see #setDeLayout(ESMFDELayout)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFDistGrid_DeLayout()
	 * @model
	 * @generated
	 */
	ESMFDELayout getDeLayout();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getDeLayout <em>De Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>De Layout</em>' reference.
	 * @see #getDeLayout()
	 * @generated
	 */
	void setDeLayout(ESMFDELayout value);

	/**
	 * Returns the value of the '<em><b>Regular Decomposition Size</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regular Decomposition Size</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Decomposition Size</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFDistGrid_RegularDecompositionSize()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getRegularDecompositionSize();

} // ESMFDistGrid
