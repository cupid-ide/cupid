/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Time Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getTime <em>Time</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getYy <em>Yy</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getMm <em>Mm</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getDd <em>Dd</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getH <em>H</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getM <em>M</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionTimeGet()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_TimeGet'"
 * @generated
 */
public interface ESMFActionTimeGet extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' reference.
	 * @see #setTime(ESMFTime)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionTimeGet_Time()
	 * @model required="true"
	 * @generated
	 */
	ESMFTime getTime();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getTime <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(ESMFTime value);

	/**
	 * Returns the value of the '<em><b>Yy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yy</em>' attribute.
	 * @see #setYy(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionTimeGet_Yy()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apimethod type='integer' kind='\"ESMF_KIND_I4\"'"
	 * @generated
	 */
	String getYy();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getYy <em>Yy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yy</em>' attribute.
	 * @see #getYy()
	 * @generated
	 */
	void setYy(String value);

	/**
	 * Returns the value of the '<em><b>Mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mm</em>' attribute.
	 * @see #setMm(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionTimeGet_Mm()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	String getMm();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getMm <em>Mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mm</em>' attribute.
	 * @see #getMm()
	 * @generated
	 */
	void setMm(String value);

	/**
	 * Returns the value of the '<em><b>Dd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dd</em>' attribute.
	 * @see #setDd(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionTimeGet_Dd()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	String getDd();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getDd <em>Dd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dd</em>' attribute.
	 * @see #getDd()
	 * @generated
	 */
	void setDd(String value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionTimeGet_H()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' kind='\"ESMF_KIND_I4\"'"
	 * @generated
	 */
	String getH();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getH <em>H</em>}' attribute.
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionTimeGet_M()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' kind='\"ESMF_KIND_I4\"'"
	 * @generated
	 */
	String getM();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getM <em>M</em>}' attribute.
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionTimeGet_S()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' kind='\"ESMF_KIND_I4\"'"
	 * @generated
	 */
	String getS();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' attribute.
	 * @see #getS()
	 * @generated
	 */
	void setS(String value);

} // ESMFActionTimeGet
