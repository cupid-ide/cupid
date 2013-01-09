/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Clock Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getClock <em>Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getStopTime <em>Stop Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionClockCreate()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_ClockCreate'"
 * @generated
 */
public interface ESMFActionClockCreate extends ESMFActionAPI {
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionClockCreate_Clock()
	 * @model required="true"
	 * @generated
	 */
	ESMFClock getClock();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getClock <em>Clock</em>}' reference.
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionClockCreate_TimeStep()
	 * @model required="true"
	 * @generated
	 */
	ESMFTimeInterval getTimeStep();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getTimeStep <em>Time Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Step</em>' reference.
	 * @see #getTimeStep()
	 * @generated
	 */
	void setTimeStep(ESMFTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' reference.
	 * @see #setStartTime(ESMFTime)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionClockCreate_StartTime()
	 * @model
	 * @generated
	 */
	ESMFTime getStartTime();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getStartTime <em>Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' reference.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(ESMFTime value);

	/**
	 * Returns the value of the '<em><b>Stop Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Time</em>' reference.
	 * @see #setStopTime(ESMFTime)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionClockCreate_StopTime()
	 * @model
	 * @generated
	 */
	ESMFTime getStopTime();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate#getStopTime <em>Stop Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Time</em>' reference.
	 * @see #getStopTime()
	 * @generated
	 */
	void setStopTime(ESMFTime value);

} // ESMFActionClockCreate
