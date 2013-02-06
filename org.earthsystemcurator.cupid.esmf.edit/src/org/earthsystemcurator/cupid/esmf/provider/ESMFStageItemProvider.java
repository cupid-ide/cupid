/**
 */
package org.earthsystemcurator.cupid.esmf.provider;


import java.util.Collection;
import java.util.List;

import org.earthsystemcurator.cupid.esmf.ESMFFactory;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFStage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.earthsystemcurator.cupid.esmf.ESMFStage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ESMFStageItemProvider
	extends ESMFNamedEntityItemProvider
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
	public ESMFStageItemProvider(AdapterFactory adapterFactory) {
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

			addPhasePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Phase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFStage_phase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFStage_phase_feature", "_UI_ESMFStage_type"),
				 ESMFPackage.Literals.ESMF_STAGE__PHASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(ESMFPackage.Literals.ESMF_SCOPE__ITEM);
			childrenFeatures.add(ESMFPackage.Literals.ESMF_STAGE__ACTIONS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ESMFStage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ESMFStage_type") :
			getString("_UI_ESMFStage_type") + " " + label;
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

		switch (notification.getFeatureID(ESMFStage.class)) {
			case ESMFPackage.ESMF_STAGE__PHASE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ESMFPackage.ESMF_STAGE__ITEM:
			case ESMFPackage.ESMF_STAGE__ACTIONS:
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
				(ESMFPackage.Literals.ESMF_SCOPE__ITEM,
				 ESMFFactory.eINSTANCE.createESMFState()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_SCOPE__ITEM,
				 ESMFFactory.eINSTANCE.createESMFField()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_SCOPE__ITEM,
				 ESMFFactory.eINSTANCE.createESMFArray()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_SCOPE__ITEM,
				 ESMFFactory.eINSTANCE.createESMFRouteHandle()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_SCOPE__ITEM,
				 ESMFFactory.eINSTANCE.createESMFArraySpec()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_SCOPE__ITEM,
				 ESMFFactory.eINSTANCE.createESMFGrid()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_SCOPE__ITEM,
				 ESMFFactory.eINSTANCE.createESMFDistGrid()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_STAGE__ACTIONS,
				 ESMFFactory.eINSTANCE.createESMFStageActionSequence()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_STAGE__ACTIONS,
				 ESMFFactory.eINSTANCE.createESMFStageActionIterate()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_STAGE__ACTIONS,
				 ESMFFactory.eINSTANCE.createESMFStageActionIterateClock()));
	}

}
