/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFStageAction#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStageAction()
 * @model abstract="true"
 * @generated
 */
public interface ESMFStageAction extends EObject {

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionSequence#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ESMFStageActionSequence)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStageAction_Parent()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionSequence#getAction
	 * @model opposite="action" transient="false"
	 * @generated
	 */
	ESMFStageActionSequence getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFStageAction#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ESMFStageActionSequence value);
} // ESMFStageAction
