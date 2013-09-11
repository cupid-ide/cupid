/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.provider;


import java.util.Collection;
import java.util.List;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1;
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
 * This is the item provider adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelImplementsInitP1ItemProvider
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
	public ModelImplementsInitP1ItemProvider(AdapterFactory adapterFactory) {
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
			addImportParamPropertyDescriptor(object);
			addExportParamPropertyDescriptor(object);
			addAdvertisesAtLeastOneFieldPropertyDescriptor(object);
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
				 getString("_UI_ModelImplementsInitP1_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelImplementsInitP1_name_feature", "_UI_ModelImplementsInitP1_type"),
				 NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P1__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Import Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelImplementsInitP1_importParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelImplementsInitP1_importParam_feature", "_UI_ModelImplementsInitP1_type"),
				 NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Export Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExportParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelImplementsInitP1_exportParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelImplementsInitP1_exportParam_feature", "_UI_ModelImplementsInitP1_type"),
				 NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Advertises At Least One Field feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdvertisesAtLeastOneFieldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelImplementsInitP1_advertisesAtLeastOneField_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelImplementsInitP1_advertisesAtLeastOneField_feature", "_UI_ModelImplementsInitP1_type"),
				 NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD);
			childrenFeatures.add(NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD);
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
	 * This returns ModelImplementsInitP1.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelImplementsInitP1"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModelImplementsInitP1)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelImplementsInitP1_type") :
			getString("_UI_ModelImplementsInitP1_type") + " " + label;
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

		switch (notification.getFeatureID(ModelImplementsInitP1.class)) {
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__NAME:
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM:
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM:
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
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
				(NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD,
				 NUOPCFactory.eINSTANCE.createAdvertisesImportField()));

		newChildDescriptors.add
			(createChildParameter
				(NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD,
				 NUOPCFactory.eINSTANCE.createAdvertisesExportField()));
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
