/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage Action Grid Inherit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionGridInherit#getGrid <em>Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStageActionGridInherit()
 * @model
 * @generated
 */
public interface ESMFStageActionGridInherit extends ESMFStageAction {
	/**
	 * Returns the value of the '<em><b>Grid</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFGrid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStageActionGridInherit_Grid()
	 * @model required="true"
	 * @generated
	 */
	EList<ESMFGrid> getGrid();

} // ESMFStageActionGridInherit