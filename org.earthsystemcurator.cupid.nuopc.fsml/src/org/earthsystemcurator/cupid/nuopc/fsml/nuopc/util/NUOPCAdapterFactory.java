/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.util;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage
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
			public Adapter caseNUOPCModel(NUOPCModel object) {
				return createNUOPCModelAdapter();
			}
			@Override
			public Adapter caseModelImplementsSetServices(ModelImplementsSetServices object) {
				return createModelImplementsSetServicesAdapter();
			}
			@Override
			public Adapter caseModelImplementsInitP1(ModelImplementsInitP1 object) {
				return createModelImplementsInitP1Adapter();
			}
			@Override
			public Adapter caseModelImplementsInitP2(ModelImplementsInitP2 object) {
				return createModelImplementsInitP2Adapter();
			}
			@Override
			public Adapter caseAdvertisesImportField(AdvertisesImportField object) {
				return createAdvertisesImportFieldAdapter();
			}
			@Override
			public Adapter caseAdvertisesExportField(AdvertisesExportField object) {
				return createAdvertisesExportFieldAdapter();
			}
			@Override
			public Adapter caseRealizesImportField(RealizesImportField object) {
				return createRealizesImportFieldAdapter();
			}
			@Override
			public Adapter caseRealizesExportField(RealizesExportField object) {
				return createRealizesExportFieldAdapter();
			}
			@Override
			public Adapter caseAttachesModelAdvance(AttachesModelAdvance object) {
				return createAttachesModelAdvanceAdapter();
			}
			@Override
			public Adapter caseModelAdvance(ModelAdvance object) {
				return createModelAdvanceAdapter();
			}
			@Override
			public Adapter caseNUOPCDriver(NUOPCDriver object) {
				return createNUOPCDriverAdapter();
			}
			@Override
			public Adapter caseNUOPCDriver__ImplementsSetServices(NUOPCDriver__ImplementsSetServices object) {
				return createNUOPCDriver__ImplementsSetServicesAdapter();
			}
			@Override
			public Adapter caseNUOPCDriver__ImplementsSetModelCount(NUOPCDriver__ImplementsSetModelCount object) {
				return createNUOPCDriver__ImplementsSetModelCountAdapter();
			}
			@Override
			public Adapter caseGetsInternalState(GetsInternalState object) {
				return createGetsInternalStateAdapter();
			}
			@Override
			public Adapter caseNUOPCApplication(NUOPCApplication object) {
				return createNUOPCApplicationAdapter();
			}
			@Override
			public Adapter caseNUOPCDriverAtmOcn(NUOPCDriverAtmOcn object) {
				return createNUOPCDriverAtmOcnAdapter();
			}
			@Override
			public Adapter caseNUOPCDriverAtmOcn__ImplementsSetServices(NUOPCDriverAtmOcn__ImplementsSetServices object) {
				return createNUOPCDriverAtmOcn__ImplementsSetServicesAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel
	 * @generated
	 */
	public Adapter createNUOPCModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices <em>Model Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices
	 * @generated
	 */
	public Adapter createModelImplementsSetServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1 <em>Model Implements Init P1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1
	 * @generated
	 */
	public Adapter createModelImplementsInitP1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2 <em>Model Implements Init P2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2
	 * @generated
	 */
	public Adapter createModelImplementsInitP2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField <em>Advertises Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField
	 * @generated
	 */
	public Adapter createAdvertisesImportFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField <em>Advertises Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField
	 * @generated
	 */
	public Adapter createAdvertisesExportFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField <em>Realizes Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField
	 * @generated
	 */
	public Adapter createRealizesImportFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField <em>Realizes Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField
	 * @generated
	 */
	public Adapter createRealizesExportFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance <em>Attaches Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance
	 * @generated
	 */
	public Adapter createAttachesModelAdvanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance <em>Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance
	 * @generated
	 */
	public Adapter createModelAdvanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver
	 * @generated
	 */
	public Adapter createNUOPCDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices <em>Driver Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices
	 * @generated
	 */
	public Adapter createNUOPCDriver__ImplementsSetServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount <em>Driver Implements Set Model Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount
	 * @generated
	 */
	public Adapter createNUOPCDriver__ImplementsSetModelCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.GetsInternalState <em>Gets Internal State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.GetsInternalState
	 * @generated
	 */
	public Adapter createGetsInternalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication
	 * @generated
	 */
	public Adapter createNUOPCApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn <em>Driver Atm Ocn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn
	 * @generated
	 */
	public Adapter createNUOPCDriverAtmOcnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices <em>Driver Atm Ocn Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices
	 * @generated
	 */
	public Adapter createNUOPCDriverAtmOcn__ImplementsSetServicesAdapter() {
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
