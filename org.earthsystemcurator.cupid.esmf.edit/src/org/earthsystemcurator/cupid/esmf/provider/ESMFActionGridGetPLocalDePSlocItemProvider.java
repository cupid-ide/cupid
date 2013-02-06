/**
 */
package org.earthsystemcurator.cupid.esmf.provider;


import java.util.Collection;
import java.util.List;

import org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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
 * This is the item provider adapter for a {@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ESMFActionGridGetPLocalDePSlocItemProvider
	extends ESMFActionGridGetPLocalDeItemProvider
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
	public ESMFActionGridGetPLocalDePSlocItemProvider(AdapterFactory adapterFactory) {
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

			addStaggerlocPropertyDescriptor(object);
			addExclusiveLBoundPropertyDescriptor(object);
			addExclusiveUBoundPropertyDescriptor(object);
			addComputationalLBoundPropertyDescriptor(object);
			addComputationalUBoundPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Staggerloc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaggerlocPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionGridGetPLocalDePSloc_staggerloc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionGridGetPLocalDePSloc_staggerloc_feature", "_UI_ESMFActionGridGetPLocalDePSloc_type"),
				 ESMFPackage.Literals.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__STAGGERLOC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exclusive LBound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExclusiveLBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionGridGetPLocalDePSloc_exclusiveLBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionGridGetPLocalDePSloc_exclusiveLBound_feature", "_UI_ESMFActionGridGetPLocalDePSloc_type"),
				 ESMFPackage.Literals.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_LBOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exclusive UBound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExclusiveUBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionGridGetPLocalDePSloc_exclusiveUBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionGridGetPLocalDePSloc_exclusiveUBound_feature", "_UI_ESMFActionGridGetPLocalDePSloc_type"),
				 ESMFPackage.Literals.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_UBOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Computational LBound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComputationalLBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionGridGetPLocalDePSloc_computationalLBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionGridGetPLocalDePSloc_computationalLBound_feature", "_UI_ESMFActionGridGetPLocalDePSloc_type"),
				 ESMFPackage.Literals.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_LBOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Computational UBound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComputationalUBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionGridGetPLocalDePSloc_computationalUBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionGridGetPLocalDePSloc_computationalUBound_feature", "_UI_ESMFActionGridGetPLocalDePSloc_type"),
				 ESMFPackage.Literals.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_UBOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ESMFActionGridGetPLocalDePSloc.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ESMFActionGridGetPLocalDePSloc"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ESMFActionGridGetPLocalDePSloc)object).getRc();
		return label == null || label.length() == 0 ?
			getString("_UI_ESMFActionGridGetPLocalDePSloc_type") :
			getString("_UI_ESMFActionGridGetPLocalDePSloc_type") + " " + label;
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

		switch (notification.getFeatureID(ESMFActionGridGetPLocalDePSloc.class)) {
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__STAGGERLOC:
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_LBOUND:
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_UBOUND:
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_LBOUND:
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_UBOUND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
