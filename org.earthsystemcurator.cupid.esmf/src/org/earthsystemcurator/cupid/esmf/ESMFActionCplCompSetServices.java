/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Cpl Comp Set Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices#getCplcomp <em>Cplcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices#getUserRoutine <em>User Routine</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices#getUserRC <em>User RC</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionCplCompSetServices()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_CplCompSetServices'"
 * @generated
 */
public interface ESMFActionCplCompSetServices extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Cplcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cplcomp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cplcomp</em>' reference.
	 * @see #setCplcomp(ESMFComponent)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionCplCompSetServices_Cplcomp()
	 * @model required="true"
	 * @generated
	 */
	ESMFComponent getCplcomp();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices#getCplcomp <em>Cplcomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cplcomp</em>' reference.
	 * @see #getCplcomp()
	 * @generated
	 */
	void setCplcomp(ESMFComponent value);

	/**
	 * Returns the value of the '<em><b>User Routine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Routine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Routine</em>' attribute.
	 * @see #setUserRoutine(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionCplCompSetServices_UserRoutine()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken" required="true"
	 * @generated
	 */
	String getUserRoutine();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices#getUserRoutine <em>User Routine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Routine</em>' attribute.
	 * @see #getUserRoutine()
	 * @generated
	 */
	void setUserRoutine(String value);

	/**
	 * Returns the value of the '<em><b>User RC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User RC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User RC</em>' attribute.
	 * @see #setUserRC(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionCplCompSetServices_UserRC()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	String getUserRC();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices#getUserRC <em>User RC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User RC</em>' attribute.
	 * @see #getUserRC()
	 * @generated
	 */
	void setUserRC(String value);

} // ESMFActionCplCompSetServices
