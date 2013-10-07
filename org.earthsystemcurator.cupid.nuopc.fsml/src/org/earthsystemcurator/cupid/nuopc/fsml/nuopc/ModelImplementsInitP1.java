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
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getImportParam <em>Import Param</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getExportParam <em>Export Param</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getAdvertisesImportField <em>Advertises Import Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getAdvertisesExportField <em>Advertises Export Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#isAdvertisesAtLeastOneField <em>Advertises At Least One Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP1()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\"' doc='Initialize Phase Definition: IPDv01p1\r\n\r\nIn this phase, models should advertise the set of import and export fields. This is the list of fields that may potentially be exchanged during coupling, although some fields may not be connected for a particular configuration.' label='Initialize Phase Definition - IPDv01p1' iconAdd='cog_add.png' task='Implement Init Phase Definition (IPDv01p1)'"
 * @generated
 */
public interface ModelImplementsInitP1 extends EObject {
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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP1_Name()
	 * @model default="InitP1" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='subroutineName'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getName <em>Name</em>}' attribute.
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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP1_ImportParam()
	 * @model default="importState" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='formalParam: 2'"
	 * @generated
	 */
	String getImportParam();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getImportParam <em>Import Param</em>}' attribute.
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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP1_ExportParam()
	 * @model default="exportState" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='formalParam: 3'"
	 * @generated
	 */
	String getExportParam();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getExportParam <em>Export Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export Param</em>' attribute.
	 * @see #getExportParam()
	 * @generated
	 */
	void setExportParam(String value);

	/**
	 * Returns the value of the '<em><b>Advertises Import Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advertises Import Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advertises Import Field</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP1_AdvertisesImportField()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='call: \"NUOPC_StateAdvertiseField(#addsToState, StandardName=#standardName, #rc)\"'"
	 * @generated
	 */
	EList<AdvertisesImportField> getAdvertisesImportField();

	/**
	 * Returns the value of the '<em><b>Advertises Export Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advertises Export Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advertises Export Field</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP1_AdvertisesExportField()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='call: \"NUOPC_StateAdvertiseField(#addsToState, StandardName=#standardName, #rc)\"'"
	 * @generated
	 */
	EList<AdvertisesExportField> getAdvertisesExportField();

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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP1_AdvertisesAtLeastOneField()
	 * @model derived="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc essential='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.advertisesExportField->size() > 0 or self.advertisesImportField->size() > 0'"
	 * @generated
	 */
	boolean isAdvertisesAtLeastOneField();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#isAdvertisesAtLeastOneField <em>Advertises At Least One Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advertises At Least One Field</em>' attribute.
	 * @see #isAdvertisesAtLeastOneField()
	 * @generated
	 */
	void setAdvertisesAtLeastOneField(boolean value);

} // ModelImplementsInitP1
