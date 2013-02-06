/**
 */
package org.earthsystemcurator.cupid.esmf.provider;


import java.util.Collection;
import java.util.List;

import org.earthsystemcurator.cupid.esmf.ESMFFactory;
import org.earthsystemcurator.cupid.esmf.ESMFMethod;
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.earthsystemcurator.cupid.esmf.ESMFMethod} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ESMFMethodItemProvider
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
	public ESMFMethodItemProvider(AdapterFactory adapterFactory) {
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
			addSIDLMethodPropertyDescriptor(object);
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
				 getString("_UI_ESMFMethod_phase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFMethod_phase_feature", "_UI_ESMFMethod_type"),
				 ESMFPackage.Literals.ESMF_METHOD__PHASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SIDL Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSIDLMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESMFMethod_SIDLMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESMFMethod_SIDLMethod_feature", "_UI_ESMFMethod_type"),
				 ESMFPackage.Literals.ESMF_METHOD__SIDL_METHOD,
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
			childrenFeatures.add(ESMFPackage.Literals.ESMF_METHOD__IMPORT_STATE);
			childrenFeatures.add(ESMFPackage.Literals.ESMF_METHOD__EXPORT_STATE);
			childrenFeatures.add(ESMFPackage.Literals.ESMF_METHOD__CLOCK);
			childrenFeatures.add(ESMFPackage.Literals.ESMF_METHOD__ACTION);
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
	 * This returns ESMFMethod.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ESMFMethod"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ESMFMethod)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ESMFMethod_type") :
			getString("_UI_ESMFMethod_type") + " " + label;
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

		switch (notification.getFeatureID(ESMFMethod.class)) {
			case ESMFPackage.ESMF_METHOD__PHASE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ESMFPackage.ESMF_METHOD__IMPORT_STATE:
			case ESMFPackage.ESMF_METHOD__EXPORT_STATE:
			case ESMFPackage.ESMF_METHOD__CLOCK:
			case ESMFPackage.ESMF_METHOD__ACTION:
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
				(ESMFPackage.Literals.ESMF_METHOD__IMPORT_STATE,
				 ESMFFactory.eINSTANCE.createESMFState()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__EXPORT_STATE,
				 ESMFFactory.eINSTANCE.createESMFState()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__CLOCK,
				 ESMFFactory.eINSTANCE.createESMFClock()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFAction()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionMethodInvokePattern()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionMethodInvokeSequence()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionMethodInvokeIteration()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionStateAdd()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionStateCreate()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionStateGet()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionStateReconcile()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionArrayCreate()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionArrayCreateAllocateAS()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionArraySpecSet()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionClockCreate()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionClockGet()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionClockGetTimestep()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionCplCompCreate()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionCplCompInitialize()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionCplCompRun()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionCplCompFinalize()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionCplCompSetServices()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionDistGridCreate()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFieldCreate()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFieldCreateGridArray()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFieldCreateGridArraySpec()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFieldCreateTKR()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFieldGet()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFieldGetBounds()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFieldHaloStore()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFieldHalo()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFieldHaloRelease()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFieldRedistStore()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFieldRedist()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFieldRedistRelease()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFrameworkInit()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionFrameworkFinalize()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionGridCreate()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionGridGetPLocalDe()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionGridGetPLocalDePSloc()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionGridGetCoord()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionGridCompCreate()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionGridCompInitialize()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionGridCompRun()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionGridCompFinalize()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionGridCompSetServices()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionMethodInvoke()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionTimeSet()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionTimeGet()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionTimeIntervalSet()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionTimeIntervalGet()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFActionUserServiceInvoke()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFCall()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFCallGridCompCreate()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFCallGridCompInitialize()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFCallGridCompSetServices()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFCallCplCompCreate()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFCallCplCompInitialize()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFCallCplCompSetServices()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFCallFieldCreateSIDL()));

		newChildDescriptors.add
			(createChildParameter
				(ESMFPackage.Literals.ESMF_METHOD__ACTION,
				 ESMFFactory.eINSTANCE.createESMFCallSIDLMethod()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ESMFPackage.Literals.ESMF_METHOD__IMPORT_STATE ||
			childFeature == ESMFPackage.Literals.ESMF_METHOD__EXPORT_STATE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
