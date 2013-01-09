/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Grid Get PLocal De</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe#getLocalDE <em>Local DE</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe#getIsLBound <em>Is LBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe#getIsUBound <em>Is UBound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetPLocalDe()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_GridGet'"
 * @generated
 */
public interface ESMFActionGridGetPLocalDe extends ESMFActionGridGet {
	/**
	 * Returns the value of the '<em><b>Local DE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local DE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local DE</em>' attribute.
	 * @see #setLocalDE(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetPLocalDe_LocalDE()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken" required="true"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	String getLocalDE();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe#getLocalDE <em>Local DE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local DE</em>' attribute.
	 * @see #getLocalDE()
	 * @generated
	 */
	void setLocalDE(String value);

	/**
	 * Returns the value of the '<em><b>Is LBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is LBound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is LBound</em>' attribute.
	 * @see #setIsLBound(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetPLocalDe_IsLBound()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='logical' arraySize='self.grid.distGrid.extent->size().toString()'"
	 * @generated
	 */
	String getIsLBound();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe#getIsLBound <em>Is LBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is LBound</em>' attribute.
	 * @see #getIsLBound()
	 * @generated
	 */
	void setIsLBound(String value);

	/**
	 * Returns the value of the '<em><b>Is UBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is UBound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is UBound</em>' attribute.
	 * @see #setIsUBound(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetPLocalDe_IsUBound()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='logical' arraySize='self.grid.distGrid.extent->size().toString()'"
	 * @generated
	 */
	String getIsUBound();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe#getIsUBound <em>Is UBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is UBound</em>' attribute.
	 * @see #getIsUBound()
	 * @generated
	 */
	void setIsUBound(String value);

} // ESMFActionGridGetPLocalDe
