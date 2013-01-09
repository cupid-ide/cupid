/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Cpl Comp Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompCreate#getCplcomp <em>Cplcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompCreate#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionCplCompCreate()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_CplCompCreate'"
 * @generated
 */
public interface ESMFActionCplCompCreate extends ESMFActionAPI {
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionCplCompCreate_Cplcomp()
	 * @model required="true"
	 * @generated
	 */
	ESMFCouplerComponent getCplcomp();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompCreate#getCplcomp <em>Cplcomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cplcomp</em>' reference.
	 * @see #getCplcomp()
	 * @generated
	 */
	void setCplcomp(ESMFCouplerComponent value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionCplCompCreate_Name()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='character'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompCreate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ESMFActionCplCompCreate
