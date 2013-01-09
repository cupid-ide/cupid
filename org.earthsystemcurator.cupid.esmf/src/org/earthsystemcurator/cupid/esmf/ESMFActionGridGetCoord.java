/**
 */
package org.earthsystemcurator.cupid.esmf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Grid Get Coord</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord#getCoordDim <em>Coord Dim</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord#getFarrayPtr <em>Farray Ptr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetCoord()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_GridGetCoord'"
 * @generated
 */
public interface ESMFActionGridGetCoord extends ESMFActionAPI {
	/**
	 * Returns the value of the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' reference.
	 * @see #setGrid(ESMFGrid)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetCoord_Grid()
	 * @model required="true"
	 * @generated
	 */
	ESMFGrid getGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord#getGrid <em>Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(ESMFGrid value);

	/**
	 * Returns the value of the '<em><b>Coord Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coord Dim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord Dim</em>' attribute.
	 * @see #setCoordDim(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetCoord_CoordDim()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	String getCoordDim();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord#getCoordDim <em>Coord Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord Dim</em>' attribute.
	 * @see #getCoordDim()
	 * @generated
	 */
	void setCoordDim(String value);

	/**
	 * Returns the value of the '<em><b>Farray Ptr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Farray Ptr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farray Ptr</em>' attribute.
	 * @see #setFarrayPtr(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionGridGetCoord_FarrayPtr()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='real' pointer='true' dim='1'"
	 * @generated
	 */
	String getFarrayPtr();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord#getFarrayPtr <em>Farray Ptr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Farray Ptr</em>' attribute.
	 * @see #getFarrayPtr()
	 * @generated
	 */
	void setFarrayPtr(String value);

} // ESMFActionGridGetCoord
