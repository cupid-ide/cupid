/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Time Interval Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getH <em>H</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getM <em>M</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionTimeIntervalGet()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_TimeIntervalGet'"
 * @generated
 */
public interface ESMFActionTimeIntervalGet extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Interval</em>' reference.
	 * @see #setTimeInterval(ESMFTimeInterval)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionTimeIntervalGet_TimeInterval()
	 * @model required="true"
	 * @generated
	 */
	ESMFTimeInterval getTimeInterval();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getTimeInterval <em>Time Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' reference.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(ESMFTimeInterval value);

	/**
	 * Returns the value of the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H</em>' attribute.
	 * @see #setH(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionTimeIntervalGet_H()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' kind='\"ESMF_KIND_I4\"'"
	 * @generated
	 */
	String getH();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getH <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H</em>' attribute.
	 * @see #getH()
	 * @generated
	 */
	void setH(String value);

	/**
	 * Returns the value of the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M</em>' attribute.
	 * @see #setM(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionTimeIntervalGet_M()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' kind='\"ESMF_KIND_I4\"'"
	 * @generated
	 */
	String getM();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getM <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M</em>' attribute.
	 * @see #getM()
	 * @generated
	 */
	void setM(String value);

	/**
	 * Returns the value of the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' attribute.
	 * @see #setS(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionTimeIntervalGet_S()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' kind='\"ESMF_KIND_I4\"'"
	 * @generated
	 */
	String getS();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' attribute.
	 * @see #getS()
	 * @generated
	 */
	void setS(String value);

} // ESMFActionTimeIntervalGet
