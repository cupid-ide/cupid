/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Field Get Bounds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getField <em>Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getExclusiveLBound <em>Exclusive LBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getExclusiveUBound <em>Exclusive UBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getComputationalLBound <em>Computational LBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getComputationalUBound <em>Computational UBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getTotalLBound <em>Total LBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getTotalUBound <em>Total UBound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldGetBounds()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_FieldGetBounds'"
 * @generated
 */
public interface ESMFActionFieldGetBounds extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(ESMFField)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldGetBounds_Field()
	 * @model required="true"
	 * @generated
	 */
	ESMFField getField();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(ESMFField value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldGetBounds_ExclusiveLBound()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' arraySize='self.field.grid.distGrid.extent->size().toString()'"
	 * @generated
	 */
	String getExclusiveLBound();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getExclusiveLBound <em>Exclusive LBound</em>}' attribute.
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldGetBounds_ExclusiveUBound()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' arraySize='self.field.grid.distGrid.extent->size().toString()'"
	 * @generated
	 */
	String getExclusiveUBound();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getExclusiveUBound <em>Exclusive UBound</em>}' attribute.
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldGetBounds_ComputationalLBound()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' arraySize='self.field.grid.distGrid.extent->size().toString()'"
	 * @generated
	 */
	String getComputationalLBound();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getComputationalLBound <em>Computational LBound</em>}' attribute.
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldGetBounds_ComputationalUBound()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' arraySize='self.field.grid.distGrid.extent->size().toString()'"
	 * @generated
	 */
	String getComputationalUBound();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getComputationalUBound <em>Computational UBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computational UBound</em>' attribute.
	 * @see #getComputationalUBound()
	 * @generated
	 */
	void setComputationalUBound(String value);

	/**
	 * Returns the value of the '<em><b>Total LBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total LBound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total LBound</em>' attribute.
	 * @see #setTotalLBound(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldGetBounds_TotalLBound()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' arraySize='self.field.grid.distGrid.extent->size().toString()'"
	 * @generated
	 */
	String getTotalLBound();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getTotalLBound <em>Total LBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total LBound</em>' attribute.
	 * @see #getTotalLBound()
	 * @generated
	 */
	void setTotalLBound(String value);

	/**
	 * Returns the value of the '<em><b>Total UBound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total UBound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total UBound</em>' attribute.
	 * @see #setTotalUBound(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldGetBounds_TotalUBound()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer' arraySize='self.field.grid.distGrid.extent->size().toString()'"
	 * @generated
	 */
	String getTotalUBound();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds#getTotalUBound <em>Total UBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total UBound</em>' attribute.
	 * @see #getTotalUBound()
	 * @generated
	 */
	void setTotalUBound(String value);

} // ESMFActionFieldGetBounds
