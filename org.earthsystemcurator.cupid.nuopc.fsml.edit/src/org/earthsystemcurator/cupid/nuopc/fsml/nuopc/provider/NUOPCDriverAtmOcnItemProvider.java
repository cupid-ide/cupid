/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.provider;


import java.util.Collection;
import java.util.List;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn;
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
 * This is the item provider adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NUOPCDriverAtmOcnItemProvider
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
	public NUOPCDriverAtmOcnItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_NUOPCDriverAtmOcn_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NUOPCDriverAtmOcn_name_feature", "_UI_NUOPCDriverAtmOcn_type"),
				 NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS);
			childrenFeatures.add(NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS);
			childrenFeatures.add(NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES);
			childrenFeatures.add(NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT);
			childrenFeatures.add(NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES);
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
	 * This returns NUOPCDriverAtmOcn.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NUOPCDriverAtmOcn"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NUOPCDriverAtmOcn)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NUOPCDriverAtmOcn_type") :
			getString("_UI_NUOPCDriverAtmOcn_type") + " " + label;
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

		switch (notification.getFeatureID(NUOPCDriverAtmOcn.class)) {
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS:
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS:
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES:
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT:
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES:
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
				(NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS,
				 NUOPCFactory.eINSTANCE.createNUOPCDriverAtmOcn__GenericImports()));

		newChildDescriptors.add
			(createChildParameter
				(NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS,
				 NUOPCFactory.eINSTANCE.createNUOPCDriverAtmOcn__ModelImports()));

		newChildDescriptors.add
			(createChildParameter
				(NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES,
				 NUOPCFactory.eINSTANCE.createNUOPCDriverAtmOcn__ImplementsSetServices()));

		newChildDescriptors.add
			(createChildParameter
				(NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT,
				 NUOPCFactory.eINSTANCE.createNUOPCDriverAtmOcn__ImplementsSetModelCount()));

		newChildDescriptors.add
			(createChildParameter
				(NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES,
				 NUOPCFactory.eINSTANCE.createNUOPCDriverAtmOcn__ImplementsSetModelServices()));
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
