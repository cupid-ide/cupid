/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage
 * @generated
 */
public interface NUOPCFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NUOPCFactory eINSTANCE = org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Model Defines Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Defines Set Services</em>'.
	 * @generated
	 */
	ModelDefinesSetServices createModelDefinesSetServices();

	/**
	 * Returns a new object of class '<em>Model Implements Init P1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Implements Init P1</em>'.
	 * @generated
	 */
	ModelImplementsInitP1 createModelImplementsInitP1();

	/**
	 * Returns a new object of class '<em>Model Implements Init P2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Implements Init P2</em>'.
	 * @generated
	 */
	ModelImplementsInitP2 createModelImplementsInitP2();

	/**
	 * Returns a new object of class '<em>Advertises Import Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advertises Import Field</em>'.
	 * @generated
	 */
	AdvertisesImportField createAdvertisesImportField();

	/**
	 * Returns a new object of class '<em>Advertises Export Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advertises Export Field</em>'.
	 * @generated
	 */
	AdvertisesExportField createAdvertisesExportField();

	/**
	 * Returns a new object of class '<em>Realizes Import Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realizes Import Field</em>'.
	 * @generated
	 */
	RealizesImportField createRealizesImportField();

	/**
	 * Returns a new object of class '<em>Realizes Export Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realizes Export Field</em>'.
	 * @generated
	 */
	RealizesExportField createRealizesExportField();

	/**
	 * Returns a new object of class '<em>Attaches Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attaches Method</em>'.
	 * @generated
	 */
	AttachesMethod createAttachesMethod();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NUOPCPackage getNUOPCPackage();

} //NUOPCFactory
