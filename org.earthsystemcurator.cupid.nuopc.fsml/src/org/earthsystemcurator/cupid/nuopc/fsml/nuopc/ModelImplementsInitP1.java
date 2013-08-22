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
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getAdvertisesImportField <em>Advertises Import Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#getAdvertisesExportField <em>Advertises Export Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1#isAdvertisesAtLeastOneField <em>Advertises At Least One Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP1()
 * @model
 * @generated
 */
public interface ModelImplementsInitP1 extends EObject {
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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP1_Name()
	 * @model id="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='subroutineName'"
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
	 * Returns the value of the '<em><b>Advertises Import Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advertises Import Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advertises Import Field</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP1_AdvertisesImportField()
	 * @model containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='call: NUOPC_StateAdvertiseField'"
	 * @generated
	 */
	EList<AdvertisesImportField> getAdvertisesImportField();

	/**
	 * Returns the value of the '<em><b>Advertises Export Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advertises Export Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advertises Export Field</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP1_AdvertisesExportField()
	 * @model containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='call: NUOPC_StateAdvertiseField'"
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
