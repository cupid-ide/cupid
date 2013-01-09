/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFTimeInterval#getHours <em>Hours</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFTimeInterval#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFTimeInterval#getSeconds <em>Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFTimeInterval()
 * @model
 * @generated
 */
public interface ESMFTimeInterval extends ESMFNamedEntity {
	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see #setHours(int)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFTimeInterval_Hours()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getHours();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFTimeInterval#getHours <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours</em>' attribute.
	 * @see #getHours()
	 * @generated
	 */
	void setHours(int value);

	/**
	 * Returns the value of the '<em><b>Minutes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minutes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes</em>' attribute.
	 * @see #setMinutes(int)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFTimeInterval_Minutes()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMinutes();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFTimeInterval#getMinutes <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes</em>' attribute.
	 * @see #getMinutes()
	 * @generated
	 */
	void setMinutes(int value);

	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(int)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFTimeInterval_Seconds()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getSeconds();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFTimeInterval#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(int value);

} // ESMFTimeInterval
