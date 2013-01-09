/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Cpl Comp Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getCplcomp <em>Cplcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getImportState <em>Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getExportState <em>Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getClock <em>Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getPhase <em>Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionCplCompRun()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_CplCompRun'"
 * @generated
 */
public interface ESMFActionCplCompRun extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Cplcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cplcomp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cplcomp</em>' reference.
	 * @see #setCplcomp(ESMFCouplerComponent)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionCplCompRun_Cplcomp()
	 * @model required="true"
	 * @generated
	 */
	ESMFCouplerComponent getCplcomp();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getCplcomp <em>Cplcomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cplcomp</em>' reference.
	 * @see #getCplcomp()
	 * @generated
	 */
	void setCplcomp(ESMFCouplerComponent value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionCplCompRun_ImportState()
	 * @model
	 * @generated
	 */
	ESMFState getImportState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getImportState <em>Import State</em>}' reference.
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionCplCompRun_ExportState()
	 * @model
	 * @generated
	 */
	ESMFState getExportState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getExportState <em>Export State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export State</em>' reference.
	 * @see #getExportState()
	 * @generated
	 */
	void setExportState(ESMFState value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(ESMFClock)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionCplCompRun_Clock()
	 * @model
	 * @generated
	 */
	ESMFClock getClock();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(ESMFClock value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #setPhase(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionCplCompRun_Phase()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	String getPhase();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(String value);

} // ESMFActionCplCompRun
