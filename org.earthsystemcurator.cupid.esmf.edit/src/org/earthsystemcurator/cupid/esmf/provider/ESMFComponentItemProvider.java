/**
 */
package org.earthsystemcurator.cupid.esmf.provider;


import java.util.Collection;
import java.util.List;

import org.earthsystemcurator.cupid.esmf.ESMFComponent;
import org.earthsystemcurator.cupid.esmf.ESMFFactory;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.earthsystemcurator.cupid.esmf.ESMFComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ESMFComponentItemProvider
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
	public ESMFComponentItemProvider(AdapterFactory adapterFactory) {
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

			addImportStatePropertyDescriptor(object);
			addExportStatePropertyDescriptor(object);
			addComponentPropertyDescriptor(object);
			addParentPropertyDescriptor(object);
			addModelClockPropertyDescriptor(object);
			addSIDLClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Import State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFComponent_importState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFComponent_importState_feature", "_UI_ESMFComponent_type"),
				 ESMFPackage.Literals.ESMF_COMPONENT__IMPORT_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Export State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExportStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFComponent_exportState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFComponent_exportState_feature", "_UI_ESMFComponent_type"),
				 ESMFPackage.Literals.ESMF_COMPONENT__EXPORT_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFComponent_component_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFComponent_component_feature", "_UI_ESMFComponent_type"),
				 ESMFPackage.Literals.ESMF_COMPONENT__COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFComponent_parent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFComponent_parent_feature", "_UI_ESMFComponent_type"),
				 ESMFPackage.Literals.ESMF_COMPONENT__PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model Clock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelClockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFComponent_modelClock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFComponent_modelClock_feature", "_UI_ESMFComponent_type"),
				 ESMFPackage.Literals.ESMF_COMPONENT__MODEL_CLOCK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SIDL Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSIDLClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFComponent_SIDLClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFComponent_SIDLClass_feature", "_UI_ESMFComponent_type"),
				 ESMFPackage.Literals.ESMF_COMPONENT__SIDL_CLASS,
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
			childrenFeatures.add(ESMFPackage.Literals.ESMF_SCOPE__ITEM);
			childrenFeatures.add(ESMFPackage.Literals.ESMF_COMPONENT__METHOD);
			childrenFeatures.add(ESMFPackage.Literals.ESMF_COMPONENT__REGISTER_METHOD);
			childrenFeatures.add(ESMFPackage.Literals.ESMF_COMPONENT__CLOCK);
			childrenFeatures.add(ESMFPackage.Literals.ESMF_COMPONENT__TIME);
			childrenFeatures.add(ESMFPackage.Literals.ESMF_COMPONENT__TIME_INTERVAL);
			childrenFeatures.add(ESMFPackage.Literals.ESMF_COMPONENT__STAGE);
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
		String label = ((ESMFComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ESMFComponent_type") :
			getString("_UI_ESMFComponent_type") + " " + label;
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

		switch (notification.getFeatureID(ESMFComponent.class)) {
			case ESMFPackage.ESMF_COMPONENT__ITEM:
			case ESMFPackage.ESMF_COMPONENT__METHOD:
			case ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD:
			case ESMFPackage.ESMF_COMPONENT__CLOCK:
			case ESMFPackage.ESMF_COMPONENT__TIME:
			case ESMFPackage.ESMF_COMPONENT__TIME_INTERVAL:
			case ESMFPackage.ESMF_COMPONENT__STAGE:
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
				(ESMFPackage.Literals.ESMF_COMPONENT__METHOD,
				 ESMFFactory.eINSTANCE.createESMFMethod()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_COMPONENT__METHOD,
				 ESMFFactory.eINSTANCE.createESMFInitMethod()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_COMPONENT__METHOD,
				 ESMFFactory.eINSTANCE.createESMFPreInitMethodSIDL()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_COMPONENT__METHOD,
				 ESMFFactory.eINSTANCE.createESMFPostInitMethodSIDL()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_COMPONENT__METHOD,
				 ESMFFactory.eINSTANCE.createESMFRunMethod()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_COMPONENT__METHOD,
				 ESMFFactory.eINSTANCE.createESMFFinalizeMethod()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_COMPONENT__METHOD,
				 ESMFFactory.eINSTANCE.createESMFFinalizeMethodSIDL()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_COMPONENT__REGISTER_METHOD,
				 ESMFFactory.eINSTANCE.createESMFRegisterMethod()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_COMPONENT__CLOCK,
				 ESMFFactory.eINSTANCE.createESMFClock()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_COMPONENT__TIME,
				 ESMFFactory.eINSTANCE.createESMFTime()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_COMPONENT__TIME_INTERVAL,
				 ESMFFactory.eINSTANCE.createESMFTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_COMPONENT__STAGE,
				 ESMFFactory.eINSTANCE.createESMFStageInitialize()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_COMPONENT__STAGE,
				 ESMFFactory.eINSTANCE.createESMFStageRun()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_COMPONENT__STAGE,
				 ESMFFactory.eINSTANCE.createESMFStageFinalize()));
	}

}
