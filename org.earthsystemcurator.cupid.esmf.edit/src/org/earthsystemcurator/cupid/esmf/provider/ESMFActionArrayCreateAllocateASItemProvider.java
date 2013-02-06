/**
 */
package org.earthsystemcurator.cupid.esmf.provider;


import java.util.Collection;
import java.util.List;

import org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS;
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
 * This is the item provider adapter for a {@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ESMFActionArrayCreateAllocateASItemProvider
	extends ESMFActionAPIItemProvider
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
	public ESMFActionArrayCreateAllocateASItemProvider(AdapterFactory adapterFactory) {
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

			addArrayPropertyDescriptor(object);
			addDistGridPropertyDescriptor(object);
			addArraySpecPropertyDescriptor(object);
			addIndexflagPropertyDescriptor(object);
			addTotalLWidthPropertyDescriptor(object);
			addTotalUWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Array feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArrayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionArrayCreateAllocateAS_array_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionArrayCreateAllocateAS_array_feature", "_UI_ESMFActionArrayCreateAllocateAS_type"),
				 ESMFPackage.Literals.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dist Grid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistGridPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionArrayCreateAllocateAS_distGrid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionArrayCreateAllocateAS_distGrid_feature", "_UI_ESMFActionArrayCreateAllocateAS_type"),
				 ESMFPackage.Literals.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__DIST_GRID,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Array Spec feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArraySpecPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionArrayCreateAllocateAS_arraySpec_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionArrayCreateAllocateAS_arraySpec_feature", "_UI_ESMFActionArrayCreateAllocateAS_type"),
				 ESMFPackage.Literals.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY_SPEC,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Indexflag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexflagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionArrayCreateAllocateAS_indexflag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionArrayCreateAllocateAS_indexflag_feature", "_UI_ESMFActionArrayCreateAllocateAS_type"),
				 ESMFPackage.Literals.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__INDEXFLAG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total LWidth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalLWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionArrayCreateAllocateAS_totalLWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionArrayCreateAllocateAS_totalLWidth_feature", "_UI_ESMFActionArrayCreateAllocateAS_type"),
				 ESMFPackage.Literals.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_LWIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total UWidth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalUWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionArrayCreateAllocateAS_totalUWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionArrayCreateAllocateAS_totalUWidth_feature", "_UI_ESMFActionArrayCreateAllocateAS_type"),
				 ESMFPackage.Literals.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_UWIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ESMFActionArrayCreateAllocateAS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ESMFActionArrayCreateAllocateAS"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ESMFActionArrayCreateAllocateAS)object).getRc();
		return label == null || label.length() == 0 ?
			getString("_UI_ESMFActionArrayCreateAllocateAS_type") :
			getString("_UI_ESMFActionArrayCreateAllocateAS_type") + " " + label;
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

		switch (notification.getFeatureID(ESMFActionArrayCreateAllocateAS.class)) {
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__INDEXFLAG:
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_LWIDTH:
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_UWIDTH:
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
