/**
 */
package org.earthsystemmodeling.cupid.NUOPC.impl;

import org.earthsystemmodeling.cupid.NUOPC.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case NUOPCPackage.DRIVER: return createDriver();
			case NUOPCPackage.MODEL: return createModel();
			case NUOPCPackage.MEDIATOR: return createMediator();
			case NUOPCPackage.CONNECTOR: return createConnector();
			case NUOPCPackage.APPLICATION: return createApplication();
			case NUOPCPackage.FIELD: return createField();
			case NUOPCPackage.UNIFORM_GRID: return createUniformGrid();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NUOPCPackage.IPD_VERSION:
				return createIPDVersionFromString(eDataType, initialValue);
			case NUOPCPackage.ESMF_STAGGERLOC:
				return createESMF_STAGGERLOCFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NUOPCPackage.IPD_VERSION:
				return convertIPDVersionToString(eDataType, instanceValue);
			case NUOPCPackage.ESMF_STAGGERLOC:
				return convertESMF_STAGGERLOCToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Driver createDriver() {
		DriverImpl driver = new DriverImpl();
		return driver;
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
	public Mediator createMediator() {
		MediatorImpl mediator = new MediatorImpl();
		return mediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformGrid createUniformGrid() {
		UniformGridImpl uniformGrid = new UniformGridImpl();
		return uniformGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPDVersion createIPDVersionFromString(EDataType eDataType, String initialValue) {
		IPDVersion result = IPDVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIPDVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMF_STAGGERLOC createESMF_STAGGERLOCFromString(EDataType eDataType, String initialValue) {
		ESMF_STAGGERLOC result = ESMF_STAGGERLOC.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESMF_STAGGERLOCToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
