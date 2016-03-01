/**
 */
package org.earthsystemmodeling.cupid.NUOPC;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCFactory
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
	String eNAME = "NUOPC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.earthsystemcog.org/projects/nuopc";

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
	NUOPCPackage eINSTANCE = org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCComponentImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCComponent()
	 * @generated
	 */
	int NUOPC_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_COMPONENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCBaseModelImpl <em>Base Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCBaseModelImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCBaseModel()
	 * @generated
	 */
	int NUOPC_BASE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_BASE_MODEL__NAME = NUOPC_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Base Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_BASE_MODEL_FEATURE_COUNT = NUOPC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Base Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_BASE_MODEL_OPERATION_COUNT = NUOPC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCDriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCDriverImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCDriver()
	 * @generated
	 */
	int NUOPC_DRIVER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__NAME = NUOPC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER__CHILDREN = NUOPC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_FEATURE_COUNT = NUOPC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_DRIVER_OPERATION_COUNT = NUOPC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCModelImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCModel()
	 * @generated
	 */
	int NUOPC_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL__NAME = NUOPC_BASE_MODEL__NAME;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_FEATURE_COUNT = NUOPC_BASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MODEL_OPERATION_COUNT = NUOPC_BASE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCMediatorImpl <em>Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCMediatorImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCMediator()
	 * @generated
	 */
	int NUOPC_MEDIATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR__NAME = NUOPC_BASE_MODEL__NAME;

	/**
	 * The number of structural features of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_FEATURE_COUNT = NUOPC_BASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_MEDIATOR_OPERATION_COUNT = NUOPC_BASE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCConnectorImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCConnector()
	 * @generated
	 */
	int NUOPC_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_CONNECTOR__NAME = NUOPC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_CONNECTOR__SOURCE = NUOPC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_CONNECTOR__TARGET = NUOPC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_CONNECTOR_FEATURE_COUNT = NUOPC_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_CONNECTOR_OPERATION_COUNT = NUOPC_COMPONENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCApplicationImpl
	 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCApplication()
	 * @generated
	 */
	int NUOPC_APPLICATION = 6;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUOPC_APPLICATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCComponent
	 * @generated
	 */
	EClass getNUOPCComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCComponent#getName()
	 * @see #getNUOPCComponent()
	 * @generated
	 */
	EAttribute getNUOPCComponent_Name();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCBaseModel <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Model</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCBaseModel
	 * @generated
	 */
	EClass getNUOPCBaseModel();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCDriver
	 * @generated
	 */
	EClass getNUOPCDriver();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCDriver#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCDriver#getChildren()
	 * @see #getNUOPCDriver()
	 * @generated
	 */
	EReference getNUOPCDriver_Children();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCModel
	 * @generated
	 */
	EClass getNUOPCModel();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCMediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCMediator
	 * @generated
	 */
	EClass getNUOPCMediator();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCConnector
	 * @generated
	 */
	EClass getNUOPCConnector();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCConnector#getSource()
	 * @see #getNUOPCConnector()
	 * @generated
	 */
	EReference getNUOPCConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCConnector#getTarget()
	 * @see #getNUOPCConnector()
	 * @generated
	 */
	EReference getNUOPCConnector_Target();

	/**
	 * Returns the meta object for class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCApplication
	 * @generated
	 */
	EClass getNUOPCApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCApplication#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCApplication#getChildren()
	 * @see #getNUOPCApplication()
	 * @generated
	 */
	EReference getNUOPCApplication_Children();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCComponentImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCComponent()
		 * @generated
		 */
		EClass NUOPC_COMPONENT = eINSTANCE.getNUOPCComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUOPC_COMPONENT__NAME = eINSTANCE.getNUOPCComponent_Name();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCBaseModelImpl <em>Base Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCBaseModelImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCBaseModel()
		 * @generated
		 */
		EClass NUOPC_BASE_MODEL = eINSTANCE.getNUOPCBaseModel();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCDriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCDriverImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCDriver()
		 * @generated
		 */
		EClass NUOPC_DRIVER = eINSTANCE.getNUOPCDriver();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_DRIVER__CHILDREN = eINSTANCE.getNUOPCDriver_Children();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCModelImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCModel()
		 * @generated
		 */
		EClass NUOPC_MODEL = eINSTANCE.getNUOPCModel();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCMediatorImpl <em>Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCMediatorImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCMediator()
		 * @generated
		 */
		EClass NUOPC_MEDIATOR = eINSTANCE.getNUOPCMediator();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCConnectorImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCConnector()
		 * @generated
		 */
		EClass NUOPC_CONNECTOR = eINSTANCE.getNUOPCConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_CONNECTOR__SOURCE = eINSTANCE.getNUOPCConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_CONNECTOR__TARGET = eINSTANCE.getNUOPCConnector_Target();

		/**
		 * The meta object literal for the '{@link org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCApplicationImpl
		 * @see org.earthsystemmodeling.cupid.NUOPC.impl.NUOPCPackageImpl#getNUOPCApplication()
		 * @generated
		 */
		EClass NUOPC_APPLICATION = eINSTANCE.getNUOPCApplication();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUOPC_APPLICATION__CHILDREN = eINSTANCE.getNUOPCApplication_Children();

	}

} //NUOPCPackage
