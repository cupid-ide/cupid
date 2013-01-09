/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Clock Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGet#getClock <em>Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGet#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGet#getCurrTime <em>Curr Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionClockGet()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_ClockGet'"
 * @generated
 */
public interface ESMFActionClockGet extends ESMFActionAPI {
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionClockGet_Clock()
	 * @model required="true"
	 * @generated
	 */
	ESMFClock getClock();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGet#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(ESMFClock value);

	/**
	 * Returns the value of the '<em><b>Time Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Step</em>' reference.
	 * @see #setTimeStep(ESMFTimeInterval)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionClockGet_TimeStep()
	 * @model
	 * @generated
	 */
	ESMFTimeInterval getTimeStep();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGet#getTimeStep <em>Time Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Step</em>' reference.
	 * @see #getTimeStep()
	 * @generated
	 */
	void setTimeStep(ESMFTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Curr Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curr Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curr Time</em>' reference.
	 * @see #setCurrTime(ESMFTime)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionClockGet_CurrTime()
	 * @model
	 * @generated
	 */
	ESMFTime getCurrTime();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGet#getCurrTime <em>Curr Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curr Time</em>' reference.
	 * @see #getCurrTime()
	 * @generated
	 */
	void setCurrTime(ESMFTime value);

} // ESMFActionClockGet
