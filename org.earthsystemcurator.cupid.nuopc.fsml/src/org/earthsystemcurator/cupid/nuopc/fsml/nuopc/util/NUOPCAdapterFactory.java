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
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseModelDefinesSetServices(ModelDefinesSetServices object) {
				return createModelDefinesSetServicesAdapter();
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
			public Adapter caseAttachesMethod(AttachesMethod object) {
				return createAttachesMethodAdapter();
			}
			@Override
			public <c> Adapter caseComparable(Comparable<c> object) {
				return createComparableAdapter();
			}
			@Override
			public <c> Adapter caseCandidate(Candidate<c> object) {
				return createCandidateAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices <em>Model Defines Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices
	 * @generated
	 */
	public Adapter createModelDefinesSetServicesAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod <em>Attaches Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod
	 * @generated
	 */
	public Adapter createAttachesMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Comparable
	 * @generated
	 */
	public Adapter createComparableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Candidate <em>Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Candidate
	 * @generated
	 */
	public Adapter createCandidateAdapter() {
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
