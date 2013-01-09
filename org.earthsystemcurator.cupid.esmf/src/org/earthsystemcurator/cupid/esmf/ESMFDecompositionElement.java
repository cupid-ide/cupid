/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposition Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement#getParentDistGrid <em>Parent Dist Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFDecompositionElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ExtentSizeEqualsParentDistGridExtentSize'"
 *        annotation="http://www.eclipse.org/ocl/examples/OCL ExtentSizeEqualsParentDistGridExtentSize='parentDistGrid.oclIsUndefined() or extent->size() = parentDistGrid.extent->size()'"
 * @generated
 */
public interface ESMFDecompositionElement extends EObject {
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFDecompositionElement_Extent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Extent> getExtent();

	/**
	 * Returns the value of the '<em><b>Parent Dist Grid</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getDe <em>De</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Dist Grid</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Dist Grid</em>' container reference.
	 * @see #setParentDistGrid(ESMFDistGrid)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFDecompositionElement_ParentDistGrid()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDistGrid#getDe
	 * @model opposite="de" transient="false"
	 * @generated
	 */
	ESMFDistGrid getParentDistGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement#getParentDistGrid <em>Parent Dist Grid</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Dist Grid</em>' container reference.
	 * @see #getParentDistGrid()
	 * @generated
	 */
	void setParentDistGrid(ESMFDistGrid value);

} // ESMFDecompositionElement
