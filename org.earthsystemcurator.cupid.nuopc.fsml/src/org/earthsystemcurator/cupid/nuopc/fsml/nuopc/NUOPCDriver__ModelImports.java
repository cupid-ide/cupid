/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver Model Imports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports#getModelImport <em>Model Import</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ModelImports()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Child Model Imports' icon='import.png'"
 * @generated
 */
public interface NUOPCDriver__ModelImports extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getModelImports <em>Model Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCDriver)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ModelImports_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getModelImports
	 * @model opposite="modelImports" required="true" transient="false"
	 * @generated
	 */
	NUOPCDriver getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCDriver value);

	/**
	 * Returns the value of the '<em><b>Model Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Import</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ModelImports_ModelImport()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='usesModule: \"#name\"'"
	 * @generated
	 */
	EList<NUOPCDriver__ModelImports__ModelImport> getModelImport();

} // NUOPCDriver__ModelImports
