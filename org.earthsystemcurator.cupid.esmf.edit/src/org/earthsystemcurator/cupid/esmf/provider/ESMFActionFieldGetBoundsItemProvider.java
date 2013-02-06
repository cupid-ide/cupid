/**
 */
package org.earthsystemcurator.cupid.esmf.provider;


import java.util.Collection;
import java.util.List;

import org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds;
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
 * This is the item provider adapter for a {@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ESMFActionFieldGetBoundsItemProvider
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
	public ESMFActionFieldGetBoundsItemProvider(AdapterFactory adapterFactory) {
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

			addFieldPropertyDescriptor(object);
			addExclusiveLBoundPropertyDescriptor(object);
			addExclusiveUBoundPropertyDescriptor(object);
			addComputationalLBoundPropertyDescriptor(object);
			addComputationalUBoundPropertyDescriptor(object);
			addTotalLBoundPropertyDescriptor(object);
			addTotalUBoundPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Field feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionFieldGetBounds_field_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionFieldGetBounds_field_feature", "_UI_ESMFActionFieldGetBounds_type"),
				 ESMFPackage.Literals.ESMF_ACTION_FIELD_GET_BOUNDS__FIELD,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_ESMFActionFieldGetBounds_exclusiveLBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionFieldGetBounds_exclusiveLBound_feature", "_UI_ESMFActionFieldGetBounds_type"),
				 ESMFPackage.Literals.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_LBOUND,
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
				 getString("_UI_ESMFActionFieldGetBounds_exclusiveUBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionFieldGetBounds_exclusiveUBound_feature", "_UI_ESMFActionFieldGetBounds_type"),
				 ESMFPackage.Literals.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_UBOUND,
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
				 getString("_UI_ESMFActionFieldGetBounds_computationalLBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionFieldGetBounds_computationalLBound_feature", "_UI_ESMFActionFieldGetBounds_type"),
				 ESMFPackage.Literals.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_LBOUND,
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
				 getString("_UI_ESMFActionFieldGetBounds_computationalUBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionFieldGetBounds_computationalUBound_feature", "_UI_ESMFActionFieldGetBounds_type"),
				 ESMFPackage.Literals.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_UBOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total LBound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalLBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionFieldGetBounds_totalLBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionFieldGetBounds_totalLBound_feature", "_UI_ESMFActionFieldGetBounds_type"),
				 ESMFPackage.Literals.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_LBOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total UBound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalUBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFActionFieldGetBounds_totalUBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFActionFieldGetBounds_totalUBound_feature", "_UI_ESMFActionFieldGetBounds_type"),
				 ESMFPackage.Literals.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_UBOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ESMFActionFieldGetBounds.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ESMFActionFieldGetBounds"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ESMFActionFieldGetBounds)object).getRc();
		return label == null || label.length() == 0 ?
			getString("_UI_ESMFActionFieldGetBounds_type") :
			getString("_UI_ESMFActionFieldGetBounds_type") + " " + label;
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

		switch (notification.getFeatureID(ESMFActionFieldGetBounds.class)) {
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_LBOUND:
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_UBOUND:
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_LBOUND:
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_UBOUND:
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_LBOUND:
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_UBOUND:
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
