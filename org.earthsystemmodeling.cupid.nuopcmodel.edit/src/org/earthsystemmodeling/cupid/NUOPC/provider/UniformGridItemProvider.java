/**
 */
package org.earthsystemmodeling.cupid.NUOPC.provider;


import java.util.Collection;
import java.util.List;

import org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage;
import org.earthsystemmodeling.cupid.NUOPC.UniformGrid;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.earthsystemmodeling.cupid.NUOPC.UniformGrid} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UniformGridItemProvider extends GridItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformGridItemProvider(AdapterFactory adapterFactory) {
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

			addMinCornerCoordPropertyDescriptor(object);
			addMaxCornerCoordPropertyDescriptor(object);
			addStaggerLocToFillCoordsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min Corner Coord feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinCornerCoordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UniformGrid_minCornerCoord_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UniformGrid_minCornerCoord_feature", "_UI_UniformGrid_type"),
				 NUOPCPackage.Literals.UNIFORM_GRID__MIN_CORNER_COORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Corner Coord feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxCornerCoordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UniformGrid_maxCornerCoord_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UniformGrid_maxCornerCoord_feature", "_UI_UniformGrid_type"),
				 NUOPCPackage.Literals.UNIFORM_GRID__MAX_CORNER_COORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stagger Loc To Fill Coords feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaggerLocToFillCoordsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UniformGrid_staggerLocToFillCoords_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UniformGrid_staggerLocToFillCoords_feature", "_UI_UniformGrid_type"),
				 NUOPCPackage.Literals.UNIFORM_GRID__STAGGER_LOC_TO_FILL_COORDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns UniformGrid.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UniformGrid"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UniformGrid)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UniformGrid_type") :
			getString("_UI_UniformGrid_type") + " " + label;
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

		switch (notification.getFeatureID(UniformGrid.class)) {
			case NUOPCPackage.UNIFORM_GRID__MIN_CORNER_COORD:
			case NUOPCPackage.UNIFORM_GRID__MAX_CORNER_COORD:
			case NUOPCPackage.UNIFORM_GRID__STAGGER_LOC_TO_FILL_COORDS:
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
