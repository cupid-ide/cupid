/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Grid Comp Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompCreate#getGridcomp <em>Gridcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompCreate#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridCompCreate()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_GridCompCreate'"
 * @generated
 */
public interface ESMFActionGridCompCreate extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Gridcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gridcomp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gridcomp</em>' reference.
	 * @see #setGridcomp(ESMFGriddedComponent)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridCompCreate_Gridcomp()
	 * @model required="true"
	 * @generated
	 */
	ESMFGriddedComponent getGridcomp();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompCreate#getGridcomp <em>Gridcomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gridcomp</em>' reference.
	 * @see #getGridcomp()
	 * @generated
	 */
	void setGridcomp(ESMFGriddedComponent value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridCompCreate_Name()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='character'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompCreate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ESMFActionGridCompCreate
