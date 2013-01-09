/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getCalendar <em>Calendar</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getStateItem <em>State Item</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getDistGrid <em>Dist Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getVirtualMachine <em>Virtual Machine</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getPersistentExecutionThread <em>Persistent Execution Thread</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getDeLayout <em>De Layout</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace#getClock <em>Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFWorkspace()
 * @model
 * @generated
 */
public interface ESMFWorkspace extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFWorkspace_Component()
	 * @model
	 * @generated
	 */
	EList<ESMFComponent> getComponent();

	/**
	 * Returns the value of the '<em><b>Calendar</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFCalendar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendar</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar</em>' reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFWorkspace_Calendar()
	 * @model
	 * @generated
	 */
	EList<ESMFCalendar> getCalendar();

	/**
	 * Returns the value of the '<em><b>State Item</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFStateItem}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFStateItem#getWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Item</em>' reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFWorkspace_StateItem()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStateItem#getWorkspace
	 * @model opposite="workspace"
	 * @generated
	 */
	EList<ESMFStateItem> getStateItem();

	/**
	 * Returns the value of the '<em><b>Dist Grid</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dist Grid</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dist Grid</em>' reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFWorkspace_DistGrid()
	 * @model
	 * @generated
	 */
	EList<ESMFDistGrid> getDistGrid();

	/**
	 * Returns the value of the '<em><b>Virtual Machine</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Machine</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Machine</em>' reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFWorkspace_VirtualMachine()
	 * @model
	 * @generated
	 */
	EList<ESMFVirtualMachine> getVirtualMachine();

	/**
	 * Returns the value of the '<em><b>Persistent Execution Thread</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFPersistentExecutionThread}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent Execution Thread</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent Execution Thread</em>' reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFWorkspace_PersistentExecutionThread()
	 * @model
	 * @generated
	 */
	EList<ESMFPersistentExecutionThread> getPersistentExecutionThread();

	/**
	 * Returns the value of the '<em><b>De Layout</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFDELayout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>De Layout</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>De Layout</em>' reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFWorkspace_DeLayout()
	 * @model
	 * @generated
	 */
	EList<ESMFDELayout> getDeLayout();

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFWorkspace_Grid()
	 * @model
	 * @generated
	 */
	EList<ESMFGrid> getGrid();

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFClock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFWorkspace_Clock()
	 * @model
	 * @generated
	 */
	EList<ESMFClock> getClock();

} // ESMFWorkspace
