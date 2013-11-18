/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.provider;


import java.util.Collection;
import java.util.List;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NUOPCDriver__ImplementsSetModelServicesItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ImplementsSetModelServicesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addGcompPropertyDescriptor(object);
			addRcPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDriverInternalStatePropertyDescriptor(object);
			addAssignsValuePropertyDescriptor(object);
			addAttachedPropertyDescriptor(object);
			addSetModelServicesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Gcomp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGcompPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NUOPCDriver__ImplementsSetModelServices_gcomp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NUOPCDriver__ImplementsSetModelServices_gcomp_feature", "_UI_NUOPCDriver__ImplementsSetModelServices_type"),
				 NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__GCOMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NUOPCDriver__ImplementsSetModelServices_rc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NUOPCDriver__ImplementsSetModelServices_rc_feature", "_UI_NUOPCDriver__ImplementsSetModelServices_type"),
				 NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__RC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NUOPCDriver__ImplementsSetModelServices_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NUOPCDriver__ImplementsSetModelServices_name_feature", "_UI_NUOPCDriver__ImplementsSetModelServices_type"),
				 NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Driver Internal State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDriverInternalStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NUOPCDriver__ImplementsSetModelServices_driverInternalState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NUOPCDriver__ImplementsSetModelServices_driverInternalState_feature", "_UI_NUOPCDriver__ImplementsSetModelServices_type"),
				 NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__DRIVER_INTERNAL_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assigns Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignsValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NUOPCDriver__ImplementsSetModelServices_assignsValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NUOPCDriver__ImplementsSetModelServices_assignsValue_feature", "_UI_NUOPCDriver__ImplementsSetModelServices_type"),
				 NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__ASSIGNS_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attached feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttachedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NUOPCDriver__ImplementsSetModelServices_attached_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NUOPCDriver__ImplementsSetModelServices_attached_feature", "_UI_NUOPCDriver__ImplementsSetModelServices_type"),
				 NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__ATTACHED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Set Model Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSetModelServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NUOPCDriver__ImplementsSetModelServices_setModelServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NUOPCDriver__ImplementsSetModelServices_setModelServices_feature", "_UI_NUOPCDriver__ImplementsSetModelServices_type"),
				 NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__SET_MODEL_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__GETS_INTERNAL_STATE);
			childrenFeatures.add(NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__SET_MODEL_SERVICES);
			childrenFeatures.add(NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__SET_COUPLER_SERVICES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns NUOPCDriver__ImplementsSetModelServices.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NUOPCDriver__ImplementsSetModelServices"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NUOPCDriver__ImplementsSetModelServices)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NUOPCDriver__ImplementsSetModelServices_type") :
			getString("_UI_NUOPCDriver__ImplementsSetModelServices_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NUOPCDriver__ImplementsSetModelServices.class)) {
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__GCOMP:
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__RC:
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__NAME:
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__DRIVER_INTERNAL_STATE:
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__ASSIGNS_VALUE:
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__ATTACHED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__GETS_INTERNAL_STATE:
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__SET_MODEL_SERVICES:
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__SET_COUPLER_SERVICES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__GETS_INTERNAL_STATE,
				 NUOPCFactory.eINSTANCE.createGetsInternalState()));

		newChildDescriptors.add
			(createChildParameter
				(NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__SET_MODEL_SERVICES,
				 NUOPCFactory.eINSTANCE.createSetModelServices()));

		newChildDescriptors.add
			(createChildParameter
				(NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__SET_COUPLER_SERVICES,
				 NUOPCFactory.eINSTANCE.createSetCouplerServices()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return NuopcEditPlugin.INSTANCE;
	}

}
