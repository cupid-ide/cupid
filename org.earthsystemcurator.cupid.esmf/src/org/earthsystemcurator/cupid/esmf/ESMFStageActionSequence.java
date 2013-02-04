/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage Action Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionSequence#getAction <em>Action</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionSequence#getStage <em>Stage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStageActionSequence()
 * @model
 * @generated
 */
public interface ESMFStageActionSequence extends ESMFStageAction {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFStageAction}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFStageAction#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStageActionSequence_Action()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageAction#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	EList<ESMFStageAction> getAction();

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFStage#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' container reference.
	 * @see #setStage(ESMFStage)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStageActionSequence_Stage()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStage#getActions
	 * @model opposite="actions" transient="false"
	 * @generated
	 */
	ESMFStage getStage();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionSequence#getStage <em>Stage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' container reference.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(ESMFStage value);

} // ESMFStageActionSequence
