/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Field Create Grid Array Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getField <em>Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getArraySpec <em>Array Spec</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getIndexflag <em>Indexflag</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getTotalLWidth <em>Total LWidth</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getTotalUWidth <em>Total UWidth</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateGridArraySpec()
 * @model annotation="http://www.earthsystemcurator.org/metapattern/apimethod name='ESMF_FieldCreate'"
 * @generated
 */
public interface ESMFActionFieldCreateGridArraySpec extends ESMFActionAPI {
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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateGridArraySpec_Field()
	 * @model required="true"
	 * @generated
	 */
	ESMFField getField();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(ESMFField value);

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateGridArraySpec_Grid()
	 * @model required="true"
	 * @generated
	 */
	ESMFGrid getGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getGrid <em>Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(ESMFGrid value);

	/**
	 * Returns the value of the '<em><b>Array Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Spec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Spec</em>' reference.
	 * @see #setArraySpec(ESMFArraySpec)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateGridArraySpec_ArraySpec()
	 * @model required="true"
	 * @generated
	 */
	ESMFArraySpec getArraySpec();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getArraySpec <em>Array Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Spec</em>' reference.
	 * @see #getArraySpec()
	 * @generated
	 */
	void setArraySpec(ESMFArraySpec value);

	/**
	 * Returns the value of the '<em><b>Indexflag</b></em>' attribute.
	 * The literals are from the enumeration {@link org.earthsystemcurator.cupid.esmf.ESMF_INDEX}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexflag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexflag</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMF_INDEX
	 * @see #setIndexflag(ESMF_INDEX)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateGridArraySpec_Indexflag()
	 * @model
	 * @generated
	 */
	ESMF_INDEX getIndexflag();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getIndexflag <em>Indexflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexflag</em>' attribute.
	 * @see org.earthsystemcurator.cupid.esmf.ESMF_INDEX
	 * @see #getIndexflag()
	 * @generated
	 */
	void setIndexflag(ESMF_INDEX value);

	/**
	 * Returns the value of the '<em><b>Total LWidth</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total LWidth</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total LWidth</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateGridArraySpec_TotalLWidth()
	 * @model unique="false" dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	EList<String> getTotalLWidth();

	/**
	 * Returns the value of the '<em><b>Total UWidth</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total UWidth</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total UWidth</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateGridArraySpec_TotalUWidth()
	 * @model unique="false" dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='integer'"
	 * @generated
	 */
	EList<String> getTotalUWidth();

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
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFActionFieldCreateGridArraySpec_Name()
	 * @model dataType="org.earthsystemcurator.cupid.esmf.ESMFUserToken"
	 *        annotation="http://www.earthsystemcurator.org/metapattern/apiparam type='character'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ESMFActionFieldCreateGridArraySpec
