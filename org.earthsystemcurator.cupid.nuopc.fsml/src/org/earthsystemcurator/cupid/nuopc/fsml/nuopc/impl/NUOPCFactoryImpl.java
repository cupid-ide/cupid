/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NUOPCFactoryImpl extends EFactoryImpl implements NUOPCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NUOPCFactory init() {
		try {
			NUOPCFactory theNUOPCFactory = (NUOPCFactory)EPackage.Registry.INSTANCE.getEFactory(NUOPCPackage.eNS_URI);
			if (theNUOPCFactory != null) {
				return theNUOPCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NUOPCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NUOPCPackage.MODEL: return createModel();
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES: return createModelDefinesSetServices();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1: return createModelImplementsInitP1();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2: return createModelImplementsInitP2();
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD: return createAdvertisesImportField();
			case NUOPCPackage.ADVERTISES_EXPORT_FIELD: return createAdvertisesExportField();
			case NUOPCPackage.ATTACHES_METHOD: return createAttachesMethod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDefinesSetServices createModelDefinesSetServices() {
		ModelDefinesSetServicesImpl modelDefinesSetServices = new ModelDefinesSetServicesImpl();
		return modelDefinesSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelImplementsInitP1 createModelImplementsInitP1() {
		ModelImplementsInitP1Impl modelImplementsInitP1 = new ModelImplementsInitP1Impl();
		return modelImplementsInitP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelImplementsInitP2 createModelImplementsInitP2() {
		ModelImplementsInitP2Impl modelImplementsInitP2 = new ModelImplementsInitP2Impl();
		return modelImplementsInitP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvertisesImportField createAdvertisesImportField() {
		AdvertisesImportFieldImpl advertisesImportField = new AdvertisesImportFieldImpl();
		return advertisesImportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvertisesExportField createAdvertisesExportField() {
		AdvertisesExportFieldImpl advertisesExportField = new AdvertisesExportFieldImpl();
		return advertisesExportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachesMethod createAttachesMethod() {
		AttachesMethodImpl attachesMethod = new AttachesMethodImpl();
		return attachesMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCPackage getNUOPCPackage() {
		return (NUOPCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NUOPCPackage getPackage() {
		return NUOPCPackage.eINSTANCE;
	}

} //NUOPCFactoryImpl
