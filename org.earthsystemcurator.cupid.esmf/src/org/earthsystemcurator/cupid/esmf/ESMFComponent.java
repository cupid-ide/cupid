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
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getState <em>State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getImportState <em>Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getExportState <em>Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getArraySpec <em>Array Spec</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getArray <em>Array</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getDistGrid <em>Dist Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getField <em>Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getRouteHandle <em>Route Handle</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getClock <em>Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getModelClock <em>Model Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getTime <em>Time</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getSIDLClass <em>SIDL Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent()
 * @model abstract="true"
 * @generated
 */
public interface ESMFComponent extends ESMFNamedEntity {
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
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFState}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFState#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_State()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFState#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<ESMFState> getState();

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
	 * Returns the value of the '<em><b>Array Spec</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFArraySpec}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Spec</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Spec</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_ArraySpec()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArraySpec#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<ESMFArraySpec> getArraySpec();

	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFArray}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFArray#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_Array()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArray#getComponent
	 * @model opposite="component" containment="true" ordered="false"
	 * @generated
	 */
	EList<ESMFArray> getArray();

	/**
	 * Returns the value of the '<em><b>Dist Grid</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dist Grid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dist Grid</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_DistGrid()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ESMFDistGrid> getDistGrid();

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFField}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFField#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_Field()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFField#getComponent
	 * @model opposite="component" containment="true" ordered="false"
	 * @generated
	 */
	EList<ESMFField> getField();

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFGrid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_Grid()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ESMFGrid> getGrid();

	/**
	 * Returns the value of the '<em><b>Route Handle</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFRouteHandle}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFRouteHandle#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Handle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Handle</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFComponent_RouteHandle()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFRouteHandle#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<ESMFRouteHandle> getRouteHandle();

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

} // ESMFComponent
