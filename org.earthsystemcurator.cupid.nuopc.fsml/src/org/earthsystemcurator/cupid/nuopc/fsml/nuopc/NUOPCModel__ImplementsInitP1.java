/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Implements Init P1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getImportParam <em>Import Param</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getExportParam <em>Export Param</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getAdvertisesImportField <em>Advertises Import Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getAdvertisesExportField <em>Advertises Export Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#isAdvertisesAtLeastOneField <em>Advertises At Least One Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#isRegisteredInSetServices <em>Registered In Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#isAdvertisesOrRegistered <em>Advertises Or Registered</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsInitP1()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\"' doc='Initialize Phase Definition: IPDv01p1\r\n\r\nIn this phase, models should advertise the set of import and export fields. This is the list of fields that may potentially be exchanged during coupling, although some fields may not be connected for a particular configuration.' label='Initialize Phase Definition - IPDv01p1' task='Implement Init Phase Definition (IPDv01p1)'"
 * @generated
 */
public interface NUOPCModel__ImplementsInitP1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getImplementsInitP1 <em>Implements Init P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCModel__Init)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsInitP1_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init#getImplementsInitP1
	 * @model opposite="implementsInitP1" required="true" transient="false"
	 * @generated
	 */
	NUOPCModel__Init getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCModel__Init value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"InitP1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsInitP1_Name()
	 * @model default="InitP1" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='subroutineName'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Import Param</b></em>' attribute.
	 * The default value is <code>"importState"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Param</em>' attribute.
	 * @see #setImportParam(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsInitP1_ImportParam()
	 * @model default="importState" required="true"
	 * @generated
	 */
	String getImportParam();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getImportParam <em>Import Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Param</em>' attribute.
	 * @see #getImportParam()
	 * @generated
	 */
	void setImportParam(String value);

	/**
	 * Returns the value of the '<em><b>Export Param</b></em>' attribute.
	 * The default value is <code>"exportState"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Param</em>' attribute.
	 * @see #setExportParam(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsInitP1_ExportParam()
	 * @model default="exportState" required="true"
	 * @generated
	 */
	String getExportParam();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#getExportParam <em>Export Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export Param</em>' attribute.
	 * @see #getExportParam()
	 * @generated
	 */
	void setExportParam(String value);

	/**
	 * Returns the value of the '<em><b>Advertises Import Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advertises Import Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advertises Import Field</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsInitP1_AdvertisesImportField()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='call: \"NUOPC_StateAdvertiseField(#addsToState, StandardName=#standardName, #rc)\"'"
	 * @generated
	 */
	EList<NUOPCModel__AdvertisesImportField> getAdvertisesImportField();

	/**
	 * Returns the value of the '<em><b>Advertises Export Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advertises Export Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advertises Export Field</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsInitP1_AdvertisesExportField()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='call: \"NUOPC_StateAdvertiseField(#addsToState, StandardName=#standardName, #rc)\"'"
	 * @generated
	 */
	EList<NUOPCModel__AdvertisesExportField> getAdvertisesExportField();

	/**
	 * Returns the value of the '<em><b>Advertises At Least One Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advertises At Least One Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advertises At Least One Field</em>' attribute.
	 * @see #setAdvertisesAtLeastOneField(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsInitP1_AdvertisesAtLeastOneField()
	 * @model required="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.advertisesExportField->size() > 0 or self.advertisesImportField->size() > 0'"
	 * @generated
	 */
	boolean isAdvertisesAtLeastOneField();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#isAdvertisesAtLeastOneField <em>Advertises At Least One Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advertises At Least One Field</em>' attribute.
	 * @see #isAdvertisesAtLeastOneField()
	 * @generated
	 */
	void setAdvertisesAtLeastOneField(boolean value);

	/**
	 * Returns the value of the '<em><b>Registered In Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered In Set Services</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered In Set Services</em>' attribute.
	 * @see #setRegisteredInSetServices(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsInitP1_RegisteredInSetServices()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.parent.parent.implementsSetServices <> null and self.parent.parent.implementsSetServices.callsSetEntryPoint->select(c|c.userRoutine=self.name and c.phase=\'1\')->notEmpty()'"
	 * @generated
	 */
	boolean isRegisteredInSetServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#isRegisteredInSetServices <em>Registered In Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered In Set Services</em>' attribute.
	 * @see #isRegisteredInSetServices()
	 * @generated
	 */
	void setRegisteredInSetServices(boolean value);

	/**
	 * Returns the value of the '<em><b>Advertises Or Registered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advertises Or Registered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advertises Or Registered</em>' attribute.
	 * @see #setAdvertisesOrRegistered(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsInitP1_AdvertisesOrRegistered()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc essential='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.registeredInSetServices or self.advertisesAtLeastOneField'"
	 * @generated
	 */
	boolean isAdvertisesOrRegistered();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1#isAdvertisesOrRegistered <em>Advertises Or Registered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advertises Or Registered</em>' attribute.
	 * @see #isAdvertisesOrRegistered()
	 * @generated
	 */
	void setAdvertisesOrRegistered(boolean value);

} // NUOPCModel__ImplementsInitP1
