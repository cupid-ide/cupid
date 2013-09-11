/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFClock#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFClock#getStopTime <em>Stop Time</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFClock#getTimeStep <em>Time Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFClock()
 * @model
 * @generated
 */
public interface ESMFClock extends ESMFScopedItem {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' containment reference.
	 * @see #setStartTime(ESMFTime)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFClock_StartTime()
	 * @model containment="true"
	 * @generated
	 */
	ESMFTime getStartTime();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFClock#getStartTime <em>Start Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' containment reference.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(ESMFTime value);

	/**
	 * Returns the value of the '<em><b>Stop Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Time</em>' containment reference.
	 * @see #setStopTime(ESMFTime)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFClock_StopTime()
	 * @model containment="true"
	 * @generated
	 */
	ESMFTime getStopTime();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFClock#getStopTime <em>Stop Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Time</em>' containment reference.
	 * @see #getStopTime()
	 * @generated
	 */
	void setStopTime(ESMFTime value);

	/**
	 * Returns the value of the '<em><b>Time Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Step</em>' containment reference.
	 * @see #setTimeStep(ESMFTimeInterval)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFClock_TimeStep()
	 * @model containment="true"
	 * @generated
	 */
	ESMFTimeInterval getTimeStep();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFClock#getTimeStep <em>Time Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Step</em>' containment reference.
	 * @see #getTimeStep()
	 * @generated
	 */
	void setTimeStep(ESMFTimeInterval value);

} // ESMFClock
