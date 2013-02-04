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
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getMethod <em>Method</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getRegisterMethod <em>Register Method</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getImportState <em>Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getExportState <em>Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getClock <em>Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getModelClock <em>Model Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getTime <em>Time</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getSIDLClass <em>SIDL Class</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getStage <em>Stage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent()
 * @model abstract="true"
 * @generated
 */
public interface ESMFComponent extends ESMFNamedEntity, ESMFScope {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFMethod}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_Method()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFMethod#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<ESMFMethod> getMethod();

	/**
	 * Returns the value of the '<em><b>Register Method</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFRegisterMethod#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Method</em>' containment reference.
	 * @see #setRegisterMethod(ESMFRegisterMethod)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_RegisterMethod()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFRegisterMethod#getComponent
	 * @model opposite="component" containment="true" required="true"
	 * @generated
	 */
	ESMFRegisterMethod getRegisterMethod();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getRegisterMethod <em>Register Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Method</em>' containment reference.
	 * @see #getRegisterMethod()
	 * @generated
	 */
	void setRegisterMethod(ESMFRegisterMethod value);

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
	 * Returns the value of the '<em><b>Clock</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFClock}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFClock#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_Clock()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFClock#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<ESMFClock> getClock();

	/**
	 * Returns the value of the '<em><b>Model Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Clock</em>' reference.
	 * @see #setModelClock(ESMFClock)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_ModelClock()
	 * @model
	 * @generated
	 */
	ESMFClock getModelClock();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getModelClock <em>Model Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Clock</em>' reference.
	 * @see #getModelClock()
	 * @generated
	 */
	void setModelClock(ESMFClock value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_Time()
	 * @model containment="true"
	 * @generated
	 */
	EList<ESMFTime> getTime();

	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFTimeInterval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Interval</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Interval</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_TimeInterval()
	 * @model containment="true"
	 * @generated
	 */
	EList<ESMFTimeInterval> getTimeInterval();

	/**
	 * Returns the value of the '<em><b>SIDL Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SIDL Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SIDL Class</em>' reference.
	 * @see #setSIDLClass(org.earthsystemcurator.cupid.sidl.Class)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_SIDLClass()
	 * @model
	 * @generated
	 */
	org.earthsystemcurator.cupid.sidl.Class getSIDLClass();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getSIDLClass <em>SIDL Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SIDL Class</em>' reference.
	 * @see #getSIDLClass()
	 * @generated
	 */
	void setSIDLClass(org.earthsystemcurator.cupid.sidl.Class value);

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

} // ESMFComponent
