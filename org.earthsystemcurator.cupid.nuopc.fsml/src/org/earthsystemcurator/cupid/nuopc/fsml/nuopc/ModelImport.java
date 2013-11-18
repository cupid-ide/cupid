/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImport#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImport#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImport#getSetServices <em>Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImport#getModelRef <em>Model Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImport()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Model Import'"
 * @generated
 */
public interface ModelImport extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports#getModelImport <em>Model Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCDriver__ModelImports)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImport_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports#getModelImport
	 * @model opposite="modelImport" required="true" transient="false"
	 * @generated
	 */
	NUOPCDriver__ModelImports getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImport#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCDriver__ModelImports value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImport_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImport#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Services</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Services</em>' attribute.
	 * @see #setSetServices(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImport_SetServices()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='usesEntity'"
	 * @generated
	 */
	String getSetServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImport#getSetServices <em>Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Services</em>' attribute.
	 * @see #getSetServices()
	 * @generated
	 */
	void setSetServices(String value);

	/**
	 * Returns the value of the '<em><b>Model Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Ref</em>' reference.
	 * @see #setModelRef(NUOPCModel)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImport_ModelRef()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc essential='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let models : Set(NUOPCModel) = self.parent.parent.parent.nuopcModel->select(m|m.name=self.name)\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tin\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif models <> null and models->notEmpty() then\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmodels->asSequence()->first()\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\telse \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tnull \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tendif'"
	 * @generated
	 */
	NUOPCModel getModelRef();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImport#getModelRef <em>Model Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Ref</em>' reference.
	 * @see #getModelRef()
	 * @generated
	 */
	void setModelRef(NUOPCModel value);

} // ModelImport
