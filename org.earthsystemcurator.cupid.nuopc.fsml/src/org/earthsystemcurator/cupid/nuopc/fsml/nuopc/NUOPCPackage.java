/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory
 * @model kind="package"
 * @generated
 */
public interface NUOPCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nuopc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.earthsystemcurator.org/nuopc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nuopc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NUOPCPackage eINSTANCE = org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uses All Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__USES_ALL_IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Defines Set Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEFINES_SET_SERVICES = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl <em>Model Defines Set Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModelDefinesSetServices()
	 * @generated
	 */
	int MODEL_DEFINES_SET_SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINES_SET_SERVICES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Calls Generic Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINES_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = 1;

	/**
	 * The number of structural features of the '<em>Model Defines Set Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DEFINES_SET_SERVICES_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#isUsesAllImports <em>Uses All Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses All Imports</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#isUsesAllImports()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_UsesAllImports();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getDefinesSetServices <em>Defines Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defines Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getDefinesSetServices()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DefinesSetServices();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices <em>Model Defines Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Defines Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices
	 * @generated
	 */
	EClass getModelDefinesSetServices();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#getName()
	 * @see #getModelDefinesSetServices()
	 * @generated
	 */
	EAttribute getModelDefinesSetServices_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#isCallsGenericSetServices <em>Calls Generic Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calls Generic Set Services</em>'.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices#isCallsGenericSetServices()
	 * @see #getModelDefinesSetServices()
	 * @generated
	 */
	EAttribute getModelDefinesSetServices_CallsGenericSetServices();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NUOPCFactory getNUOPCFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Uses All Imports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__USES_ALL_IMPORTS = eINSTANCE.getModel_UsesAllImports();

		/**
		 * The meta object literal for the '<em><b>Defines Set Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DEFINES_SET_SERVICES = eINSTANCE.getModel_DefinesSetServices();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl <em>Model Defines Set Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl
		 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCPackageImpl#getModelDefinesSetServices()
		 * @generated
		 */
		EClass MODEL_DEFINES_SET_SERVICES = eINSTANCE.getModelDefinesSetServices();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DEFINES_SET_SERVICES__NAME = eINSTANCE.getModelDefinesSetServices_Name();

		/**
		 * The meta object literal for the '<em><b>Calls Generic Set Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DEFINES_SET_SERVICES__CALLS_GENERIC_SET_SERVICES = eINSTANCE.getModelDefinesSetServices_CallsGenericSetServices();

	}

} //NUOPCPackage
