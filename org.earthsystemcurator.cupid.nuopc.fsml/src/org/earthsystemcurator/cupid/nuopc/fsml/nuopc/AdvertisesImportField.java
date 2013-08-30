/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advertises Import Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getAddsToState <em>Adds To State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#isAddsToImportState <em>Adds To Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getStandardName <em>Standard Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getAdvertisesImportField()
 * @model
 * @generated
 */
public interface AdvertisesImportField extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getAdvertisesImportField <em>Advertises Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ModelImplementsInitP1)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getAdvertisesImportField_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getAdvertisesImportField
	 * @model opposite="advertisesImportField" required="true" transient="false"
	 * @generated
	 */
	ModelImplementsInitP1 getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ModelImplementsInitP1 value);

	/**
	 * Returns the value of the '<em><b>Adds To State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adds To State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adds To State</em>' attribute.
	 * @see #setAddsToState(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getAdvertisesImportField_AddsToState()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='argByIndex: 1'"
	 * @generated
	 */
	String getAddsToState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getAddsToState <em>Adds To State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adds To State</em>' attribute.
	 * @see #getAddsToState()
	 * @generated
	 */
	void setAddsToState(String value);

	/**
	 * Returns the value of the '<em><b>Adds To Import State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adds To Import State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adds To Import State</em>' attribute.
	 * @see #setAddsToImportState(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getAdvertisesImportField_AddsToImportState()
	 * @model derived="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc essential='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.addsToState = self.parent.importParam'"
	 * @generated
	 */
	boolean isAddsToImportState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#isAddsToImportState <em>Adds To Import State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adds To Import State</em>' attribute.
	 * @see #isAddsToImportState()
	 * @generated
	 */
	void setAddsToImportState(boolean value);

	/**
	 * Returns the value of the '<em><b>Standard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Name</em>' attribute.
	 * @see #setStandardName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getAdvertisesImportField_StandardName()
	 * @model annotation="http://www.earthsystemcog.org/projects/nuopc mapping='argByKeyword: \"StandardName\"'"
	 * @generated
	 */
	String getStandardName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getStandardName <em>Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Name</em>' attribute.
	 * @see #getStandardName()
	 * @generated
	 */
	void setStandardName(String value);

} // AdvertisesImportField
