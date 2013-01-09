/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Grid Get PLocal De PSloc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getStaggerloc <em>Staggerloc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getExclusiveLBound <em>Exclusive LBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getExclusiveUBound <em>Exclusive UBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getComputationalLBound <em>Computational LBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getComputationalUBound <em>Computational UBound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetPLocalDePSloc()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_GridGet'"
 * @generated
 */
public interface ESMFActionGridGetPLocalDePSloc extends ESMFActionGridGetPLocalDe {
	/**
	 * Returns the value of the '<em><b>Staggerloc</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staggerloc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staggerloc</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc
	 * @see #setStaggerloc(ESMFStaggerLoc)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetPLocalDePSloc_Staggerloc()
	 * @model default="0" required="true"
	 * @generated
	 */
	ESMFStaggerLoc getStaggerloc();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getStaggerloc <em>Staggerloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staggerloc</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc
	 * @see #getStaggerloc()
	 * @generated
	 */
	void setStaggerloc(ESMFStaggerLoc value);

	/**
	 * Returns the value of the '<em><b>Exclusive LBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive LBound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive LBound</em>' attribute.
	 * @see #setExclusiveLBound(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetPLocalDePSloc_ExclusiveLBound()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' arraySize='self.grid.distGrid.extent->size().toString()'"
	 * @generated
	 */
	String getExclusiveLBound();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getExclusiveLBound <em>Exclusive LBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive LBound</em>' attribute.
	 * @see #getExclusiveLBound()
	 * @generated
	 */
	void setExclusiveLBound(String value);

	/**
	 * Returns the value of the '<em><b>Exclusive UBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive UBound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive UBound</em>' attribute.
	 * @see #setExclusiveUBound(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetPLocalDePSloc_ExclusiveUBound()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' arraySize='self.grid.distGrid.extent->size().toString()'"
	 * @generated
	 */
	String getExclusiveUBound();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getExclusiveUBound <em>Exclusive UBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive UBound</em>' attribute.
	 * @see #getExclusiveUBound()
	 * @generated
	 */
	void setExclusiveUBound(String value);

	/**
	 * Returns the value of the '<em><b>Computational LBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computational LBound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computational LBound</em>' attribute.
	 * @see #setComputationalLBound(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetPLocalDePSloc_ComputationalLBound()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' arraySize='self.grid.distGrid.extent->size().toString()'"
	 * @generated
	 */
	String getComputationalLBound();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getComputationalLBound <em>Computational LBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computational LBound</em>' attribute.
	 * @see #getComputationalLBound()
	 * @generated
	 */
	void setComputationalLBound(String value);

	/**
	 * Returns the value of the '<em><b>Computational UBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computational UBound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computational UBound</em>' attribute.
	 * @see #setComputationalUBound(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetPLocalDePSloc_ComputationalUBound()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' arraySize='self.grid.distGrid.extent->size().toString()'"
	 * @generated
	 */
	String getComputationalUBound();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc#getComputationalUBound <em>Computational UBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computational UBound</em>' attribute.
	 * @see #getComputationalUBound()
	 * @generated
	 */
	void setComputationalUBound(String value);

} // ESMFActionGridGetPLocalDePSloc
