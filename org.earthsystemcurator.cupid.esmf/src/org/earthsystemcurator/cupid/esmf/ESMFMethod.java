/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.earthsystemcurator.cupid.sidl.Method;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getImportState <em>Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getExportState <em>Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getClock <em>Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getAction <em>Action</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getSIDLMethod <em>SIDL Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFMethod()
 * @model
 * @generated
 */
public interface ESMFMethod extends ESMFNamedEntity {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(ESMFComponent)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFMethod_Component()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent#getMethod
	 * @model opposite="method" required="true" transient="false"
	 * @generated
	 */
	ESMFComponent getComponent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ESMFComponent value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #setPhase(int)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFMethod_Phase()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getPhase();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(int value);

	/**
	 * Returns the value of the '<em><b>Import State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import State</em>' reference.
	 * @see #setImportState(ESMFState)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFMethod_ImportState()
	 * @model
	 * @generated
	 */
	ESMFState getImportState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getImportState <em>Import State</em>}' reference.
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
	 * If the meaning of the '<em>Export State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export State</em>' reference.
	 * @see #setExportState(ESMFState)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFMethod_ExportState()
	 * @model
	 * @generated
	 */
	ESMFState getExportState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getExportState <em>Export State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export State</em>' reference.
	 * @see #getExportState()
	 * @generated
	 */
	void setExportState(ESMFState value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' containment reference.
	 * @see #setClock(ESMFClock)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFMethod_Clock()
	 * @model containment="true"
	 * @generated
	 */
	ESMFClock getClock();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getClock <em>Clock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' containment reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(ESMFClock value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFAction}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.esmf.ESMFAction#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFMethod_Action()
	 * @see org.earthsystemcurator.cupid.esmf.ESMFAction#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	EList<ESMFAction> getAction();

	/**
	 * Returns the value of the '<em><b>SIDL Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SIDL Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SIDL Method</em>' reference.
	 * @see #setSIDLMethod(Method)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFMethod_SIDLMethod()
	 * @model
	 * @generated
	 */
	Method getSIDLMethod();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod#getSIDLMethod <em>SIDL Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SIDL Method</em>' reference.
	 * @see #getSIDLMethod()
	 * @generated
	 */
	void setSIDLMethod(Method value);

} // ESMFMethod
