/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mediator Advertises Export Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getRc <em>Rc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getAddsToState <em>Adds To State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#isAddsToExportState <em>Adds To Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getStandardName <em>Standard Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator__AdvertisesExportField()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Advertise Export Field' task='Advertise Export Field'"
 * @generated
 */
public interface NUOPCMediator__AdvertisesExportField extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getAdvertisesExportField <em>Advertises Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCMediator__ImplementsInitP1)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator__AdvertisesExportField_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1#getAdvertisesExportField
	 * @model opposite="advertisesExportField" required="true" transient="false"
	 * @generated
	 */
	NUOPCMediator__ImplementsInitP1 getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCMediator__ImplementsInitP1 value);

	/**
	 * Returns the value of the '<em><b>Rc</b></em>' attribute.
	 * The default value is <code>"rc"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rc</em>' attribute.
	 * @see #setRc(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator__AdvertisesExportField_Rc()
	 * @model default="rc" required="true"
	 * @generated
	 */
	String getRc();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getRc <em>Rc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rc</em>' attribute.
	 * @see #getRc()
	 * @generated
	 */
	void setRc(String value);

	/**
	 * Returns the value of the '<em><b>Adds To State</b></em>' attribute.
	 * The default value is <code>"exportState"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adds To State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adds To State</em>' attribute.
	 * @see #setAddsToState(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator__AdvertisesExportField_AddsToState()
	 * @model default="exportState" required="true"
	 * @generated
	 */
	String getAddsToState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getAddsToState <em>Adds To State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adds To State</em>' attribute.
	 * @see #getAddsToState()
	 * @generated
	 */
	void setAddsToState(String value);

	/**
	 * Returns the value of the '<em><b>Adds To Export State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adds To Export State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adds To Export State</em>' attribute.
	 * @see #setAddsToExportState(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator__AdvertisesExportField_AddsToExportState()
	 * @model required="true" derived="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc essential='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.addsToState = self.parent.exportParam'"
	 * @generated
	 */
	boolean isAddsToExportState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#isAddsToExportState <em>Adds To Export State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adds To Export State</em>' attribute.
	 * @see #isAddsToExportState()
	 * @generated
	 */
	void setAddsToExportState(boolean value);

	/**
	 * Returns the value of the '<em><b>Standard Name</b></em>' attribute.
	 * The default value is <code>"\"Standard_Name\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Name</em>' attribute.
	 * @see #setStandardName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator__AdvertisesExportField_StandardName()
	 * @model default="\"Standard_Name\"" required="true"
	 * @generated
	 */
	String getStandardName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField#getStandardName <em>Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Name</em>' attribute.
	 * @see #getStandardName()
	 * @generated
	 */
	void setStandardName(String value);

} // NUOPCMediator__AdvertisesExportField
