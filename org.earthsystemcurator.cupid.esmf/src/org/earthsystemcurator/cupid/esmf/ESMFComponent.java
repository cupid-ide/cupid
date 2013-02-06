/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getImportState <em>Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getExportState <em>Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getStage <em>Stage</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getWorkspace <em>Workspace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent()
 * @model abstract="true"
 * @generated
 */
public interface ESMFComponent extends ESMFNamedEntity, ESMFScope {
	/**
	 * Returns the value of the '<em><b>Import State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import State</em>' reference.
	 * @see #setImportState(ESMFState)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_ImportState()
	 * @model
	 * @generated
	 */
	ESMFState getImportState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getImportState <em>Import State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import State</em>' reference.
	 * @see #getImportState()
	 * @generated
	 */
	void setImportState(ESMFState value);

	/**
	 * Returns the value of the '<em><b>Export State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export State</em>' reference.
	 * @see #setExportState(ESMFState)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_ExportState()
	 * @model
	 * @generated
	 */
	ESMFState getExportState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getExportState <em>Export State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export State</em>' reference.
	 * @see #getExportState()
	 * @generated
	 */
	void setExportState(ESMFState value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFComponent}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_Component()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<ESMFComponent> getComponent();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(ESMFComponent)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_Parent()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getComponent
	 * @model opposite="component"
	 * @generated
	 */
	ESMFComponent getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ESMFComponent value);

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFStage}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFStage#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_Stage()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStage#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<ESMFStage> getStage();

	/**
	 * Returns the value of the '<em><b>Workspace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workspace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workspace</em>' container reference.
	 * @see #setWorkspace(ESMFWorkspace)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_Workspace()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getComponent
	 * @model opposite="component" required="true" transient="false"
	 * @generated
	 */
	ESMFWorkspace getWorkspace();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getWorkspace <em>Workspace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workspace</em>' container reference.
	 * @see #getWorkspace()
	 * @generated
	 */
	void setWorkspace(ESMFWorkspace value);

} // ESMFComponent
