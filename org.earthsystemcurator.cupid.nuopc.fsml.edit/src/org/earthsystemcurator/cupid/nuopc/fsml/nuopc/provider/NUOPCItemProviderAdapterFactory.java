/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.util.NUOPCAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NUOPCItemProviderAdapterFactory extends NUOPCAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCModelItemProvider nuopcModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNUOPCModelAdapter() {
		if (nuopcModelItemProvider == null) {
			nuopcModelItemProvider = new NUOPCModelItemProvider(this);
		}

		return nuopcModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImplementsSetServicesItemProvider modelImplementsSetServicesItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelImplementsSetServicesAdapter() {
		if (modelImplementsSetServicesItemProvider == null) {
			modelImplementsSetServicesItemProvider = new ModelImplementsSetServicesItemProvider(this);
		}

		return modelImplementsSetServicesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallsGenericSetServicesItemProvider callsGenericSetServicesItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallsGenericSetServicesAdapter() {
		if (callsGenericSetServicesItemProvider == null) {
			callsGenericSetServicesItemProvider = new CallsGenericSetServicesItemProvider(this);
		}

		return callsGenericSetServicesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model_Init} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Model_InitItemProvider model_InitItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model_Init}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModel_InitAdapter() {
		if (model_InitItemProvider == null) {
			model_InitItemProvider = new Model_InitItemProvider(this);
		}

		return model_InitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImplementsInitP1ItemProvider modelImplementsInitP1ItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelImplementsInitP1Adapter() {
		if (modelImplementsInitP1ItemProvider == null) {
			modelImplementsInitP1ItemProvider = new ModelImplementsInitP1ItemProvider(this);
		}

		return modelImplementsInitP1ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImplementsInitP2ItemProvider modelImplementsInitP2ItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelImplementsInitP2Adapter() {
		if (modelImplementsInitP2ItemProvider == null) {
			modelImplementsInitP2ItemProvider = new ModelImplementsInitP2ItemProvider(this);
		}

		return modelImplementsInitP2ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvertisesImportFieldItemProvider advertisesImportFieldItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdvertisesImportFieldAdapter() {
		if (advertisesImportFieldItemProvider == null) {
			advertisesImportFieldItemProvider = new AdvertisesImportFieldItemProvider(this);
		}

		return advertisesImportFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvertisesExportFieldItemProvider advertisesExportFieldItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdvertisesExportFieldAdapter() {
		if (advertisesExportFieldItemProvider == null) {
			advertisesExportFieldItemProvider = new AdvertisesExportFieldItemProvider(this);
		}

		return advertisesExportFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizesImportFieldItemProvider realizesImportFieldItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealizesImportFieldAdapter() {
		if (realizesImportFieldItemProvider == null) {
			realizesImportFieldItemProvider = new RealizesImportFieldItemProvider(this);
		}

		return realizesImportFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizesExportFieldItemProvider realizesExportFieldItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealizesExportFieldAdapter() {
		if (realizesExportFieldItemProvider == null) {
			realizesExportFieldItemProvider = new RealizesExportFieldItemProvider(this);
		}

		return realizesExportFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachesModelAdvanceItemProvider attachesModelAdvanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttachesModelAdvanceAdapter() {
		if (attachesModelAdvanceItemProvider == null) {
			attachesModelAdvanceItemProvider = new AttachesModelAdvanceItemProvider(this);
		}

		return attachesModelAdvanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelAdvanceItemProvider modelAdvanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelAdvanceAdapter() {
		if (modelAdvanceItemProvider == null) {
			modelAdvanceItemProvider = new ModelAdvanceItemProvider(this);
		}

		return modelAdvanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCDriverItemProvider nuopcDriverItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNUOPCDriverAdapter() {
		if (nuopcDriverItemProvider == null) {
			nuopcDriverItemProvider = new NUOPCDriverItemProvider(this);
		}

		return nuopcDriverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCDriver__ImplementsSetServicesItemProvider nuopcDriver__ImplementsSetServicesItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNUOPCDriver__ImplementsSetServicesAdapter() {
		if (nuopcDriver__ImplementsSetServicesItemProvider == null) {
			nuopcDriver__ImplementsSetServicesItemProvider = new NUOPCDriver__ImplementsSetServicesItemProvider(this);
		}

		return nuopcDriver__ImplementsSetServicesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachesMethodItemProvider attachesMethodItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttachesMethodAdapter() {
		if (attachesMethodItemProvider == null) {
			attachesMethodItemProvider = new AttachesMethodItemProvider(this);
		}

		return attachesMethodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCDriver__ImplementsSetModelCountItemProvider nuopcDriver__ImplementsSetModelCountItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNUOPCDriver__ImplementsSetModelCountAdapter() {
		if (nuopcDriver__ImplementsSetModelCountItemProvider == null) {
			nuopcDriver__ImplementsSetModelCountItemProvider = new NUOPCDriver__ImplementsSetModelCountItemProvider(this);
		}

		return nuopcDriver__ImplementsSetModelCountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.GetsInternalState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetsInternalStateItemProvider getsInternalStateItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.GetsInternalState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGetsInternalStateAdapter() {
		if (getsInternalStateItemProvider == null) {
			getsInternalStateItemProvider = new GetsInternalStateItemProvider(this);
		}

		return getsInternalStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCApplicationItemProvider nuopcApplicationItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNUOPCApplicationAdapter() {
		if (nuopcApplicationItemProvider == null) {
			nuopcApplicationItemProvider = new NUOPCApplicationItemProvider(this);
		}

		return nuopcApplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Top} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopItemProvider topItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Top}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTopAdapter() {
		if (topItemProvider == null) {
			topItemProvider = new TopItemProvider(this);
		}

		return topItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCDriverAtmOcnItemProvider nuopcDriverAtmOcnItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNUOPCDriverAtmOcnAdapter() {
		if (nuopcDriverAtmOcnItemProvider == null) {
			nuopcDriverAtmOcnItemProvider = new NUOPCDriverAtmOcnItemProvider(this);
		}

		return nuopcDriverAtmOcnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCDriverAtmOcn__ImplementsSetServicesItemProvider nuopcDriverAtmOcn__ImplementsSetServicesItemProvider;

	/**
	 * This creates an adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNUOPCDriverAtmOcn__ImplementsSetServicesAdapter() {
		if (nuopcDriverAtmOcn__ImplementsSetServicesItemProvider == null) {
			nuopcDriverAtmOcn__ImplementsSetServicesItemProvider = new NUOPCDriverAtmOcn__ImplementsSetServicesItemProvider(this);
		}

		return nuopcDriverAtmOcn__ImplementsSetServicesItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (nuopcModelItemProvider != null) nuopcModelItemProvider.dispose();
		if (modelImplementsSetServicesItemProvider != null) modelImplementsSetServicesItemProvider.dispose();
		if (callsGenericSetServicesItemProvider != null) callsGenericSetServicesItemProvider.dispose();
		if (model_InitItemProvider != null) model_InitItemProvider.dispose();
		if (modelImplementsInitP1ItemProvider != null) modelImplementsInitP1ItemProvider.dispose();
		if (modelImplementsInitP2ItemProvider != null) modelImplementsInitP2ItemProvider.dispose();
		if (advertisesImportFieldItemProvider != null) advertisesImportFieldItemProvider.dispose();
		if (advertisesExportFieldItemProvider != null) advertisesExportFieldItemProvider.dispose();
		if (realizesImportFieldItemProvider != null) realizesImportFieldItemProvider.dispose();
		if (realizesExportFieldItemProvider != null) realizesExportFieldItemProvider.dispose();
		if (attachesModelAdvanceItemProvider != null) attachesModelAdvanceItemProvider.dispose();
		if (modelAdvanceItemProvider != null) modelAdvanceItemProvider.dispose();
		if (nuopcDriverItemProvider != null) nuopcDriverItemProvider.dispose();
		if (nuopcDriver__ImplementsSetServicesItemProvider != null) nuopcDriver__ImplementsSetServicesItemProvider.dispose();
		if (attachesMethodItemProvider != null) attachesMethodItemProvider.dispose();
		if (nuopcDriver__ImplementsSetModelCountItemProvider != null) nuopcDriver__ImplementsSetModelCountItemProvider.dispose();
		if (getsInternalStateItemProvider != null) getsInternalStateItemProvider.dispose();
		if (nuopcApplicationItemProvider != null) nuopcApplicationItemProvider.dispose();
		if (topItemProvider != null) topItemProvider.dispose();
		if (nuopcDriverAtmOcnItemProvider != null) nuopcDriverAtmOcnItemProvider.dispose();
		if (nuopcDriverAtmOcn__ImplementsSetServicesItemProvider != null) nuopcDriverAtmOcn__ImplementsSetServicesItemProvider.dispose();
	}

}
