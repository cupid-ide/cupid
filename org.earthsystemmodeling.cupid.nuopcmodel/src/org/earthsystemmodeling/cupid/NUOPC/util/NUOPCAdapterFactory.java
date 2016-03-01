/**
 */
package org.earthsystemmodeling.cupid.NUOPC.util;

import org.earthsystemmodeling.cupid.NUOPC.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage
 * @generated
 */
public class NUOPCAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NUOPCPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NUOPCPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCSwitch<Adapter> modelSwitch =
		new NUOPCSwitch<Adapter>() {
			@Override
			public Adapter caseNUOPCComponent(NUOPCComponent object) {
				return createNUOPCComponentAdapter();
			}
			@Override
			public Adapter caseNUOPCBaseModel(NUOPCBaseModel object) {
				return createNUOPCBaseModelAdapter();
			}
			@Override
			public Adapter caseNUOPCDriver(NUOPCDriver object) {
				return createNUOPCDriverAdapter();
			}
			@Override
			public Adapter caseNUOPCModel(NUOPCModel object) {
				return createNUOPCModelAdapter();
			}
			@Override
			public Adapter caseNUOPCMediator(NUOPCMediator object) {
				return createNUOPCMediatorAdapter();
			}
			@Override
			public Adapter caseNUOPCConnector(NUOPCConnector object) {
				return createNUOPCConnectorAdapter();
			}
			@Override
			public Adapter caseNUOPCApplication(NUOPCApplication object) {
				return createNUOPCApplicationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCComponent
	 * @generated
	 */
	public Adapter createNUOPCComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCBaseModel <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCBaseModel
	 * @generated
	 */
	public Adapter createNUOPCBaseModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCDriver
	 * @generated
	 */
	public Adapter createNUOPCDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCModel
	 * @generated
	 */
	public Adapter createNUOPCModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCMediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCMediator
	 * @generated
	 */
	public Adapter createNUOPCMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCConnector
	 * @generated
	 */
	public Adapter createNUOPCConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.cupid.NUOPC.NUOPCApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCApplication
	 * @generated
	 */
	public Adapter createNUOPCApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NUOPCAdapterFactory
