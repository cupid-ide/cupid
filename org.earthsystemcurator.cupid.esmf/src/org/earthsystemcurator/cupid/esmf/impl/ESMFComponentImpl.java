/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFArray;
import org.earthsystemcurator.cupid.esmf.ESMFArraySpec;
import org.earthsystemcurator.cupid.esmf.ESMFClock;
import org.earthsystemcurator.cupid.esmf.ESMFComponent;
import org.earthsystemcurator.cupid.esmf.ESMFDistGrid;
import org.earthsystemcurator.cupid.esmf.ESMFField;
import org.earthsystemcurator.cupid.esmf.ESMFGrid;
import org.earthsystemcurator.cupid.esmf.ESMFMethod;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFRegisterMethod;
import org.earthsystemcurator.cupid.esmf.ESMFRouteHandle;
import org.earthsystemcurator.cupid.esmf.ESMFScope;
import org.earthsystemcurator.cupid.esmf.ESMFScopedItem;
import org.earthsystemcurator.cupid.esmf.ESMFStage;
import org.earthsystemcurator.cupid.esmf.ESMFState;
import org.earthsystemcurator.cupid.esmf.ESMFTime;
import org.earthsystemcurator.cupid.esmf.ESMFTimeInterval;

import org.earthsystemcurator.cupid.esmf.ESMFWorkspace;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getImportState <em>Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getExportState <em>Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getWorkspace <em>Workspace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ESMFComponentImpl extends ESMFNamedEntityImpl implements ESMFComponent {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFScopedItem> item;

	/**
	 * The cached value of the '{@link #getImportState() <em>Import State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportState()
	 * @generated
	 * @ordered
	 */
	protected ESMFState importState;

	/**
	 * The cached value of the '{@link #getExportState() <em>Export State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportState()
	 * @generated
	 * @ordered
	 */
	protected ESMFState exportState;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFComponent> component;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected ESMFComponent parent;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFStage> stage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState getImportState() {
		if (importState != null && importState.eIsProxy()) {
			InternalEObject oldImportState = (InternalEObject)importState;
			importState = (ESMFState)eResolveProxy(oldImportState);
			if (importState != oldImportState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_COMPONENT__IMPORT_STATE, oldImportState, importState));
			}
		}
		return importState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState basicGetImportState() {
		return importState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportState(ESMFState newImportState) {
		ESMFState oldImportState = importState;
		importState = newImportState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_COMPONENT__IMPORT_STATE, oldImportState, importState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState getExportState() {
		if (exportState != null && exportState.eIsProxy()) {
			InternalEObject oldExportState = (InternalEObject)exportState;
			exportState = (ESMFState)eResolveProxy(oldExportState);
			if (exportState != oldExportState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_COMPONENT__EXPORT_STATE, oldExportState, exportState));
			}
		}
		return exportState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState basicGetExportState() {
		return exportState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportState(ESMFState newExportState) {
		ESMFState oldExportState = exportState;
		exportState = newExportState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_COMPONENT__EXPORT_STATE, oldExportState, exportState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFComponent> getComponent() {
		if (component == null) {
			component = new EObjectWithInverseResolvingEList<ESMFComponent>(ESMFComponent.class, this, ESMFPackage.ESMF_COMPONENT__COMPONENT, ESMFPackage.ESMF_COMPONENT__PARENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFComponent getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (ESMFComponent)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_COMPONENT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFComponent basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ESMFComponent newParent, NotificationChain msgs) {
		ESMFComponent oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_COMPONENT__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ESMFComponent newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, ESMFPackage.ESMF_COMPONENT__COMPONENT, ESMFComponent.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ESMFPackage.ESMF_COMPONENT__COMPONENT, ESMFComponent.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_COMPONENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFScopedItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentWithInverseEList<ESMFScopedItem>(ESMFScopedItem.class, this, ESMFPackage.ESMF_COMPONENT__ITEM, ESMFPackage.ESMF_SCOPED_ITEM__SCOPE);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFStage> getStage() {
		if (stage == null) {
			stage = new EObjectContainmentWithInverseEList<ESMFStage>(ESMFStage.class, this, ESMFPackage.ESMF_COMPONENT__STAGE, ESMFPackage.ESMF_STAGE__COMPONENT);
		}
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFWorkspace getWorkspace() {
		if (eContainerFeatureID() != ESMFPackage.ESMF_COMPONENT__WORKSPACE) return null;
		return (ESMFWorkspace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkspace(ESMFWorkspace newWorkspace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWorkspace, ESMFPackage.ESMF_COMPONENT__WORKSPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkspace(ESMFWorkspace newWorkspace) {
		if (newWorkspace != eInternalContainer() || (eContainerFeatureID() != ESMFPackage.ESMF_COMPONENT__WORKSPACE && newWorkspace != null)) {
			if (EcoreUtil.isAncestor(this, newWorkspace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkspace != null)
				msgs = ((InternalEObject)newWorkspace).eInverseAdd(this, ESMFPackage.ESMF_WORKSPACE__COMPONENT, ESMFWorkspace.class, msgs);
			msgs = basicSetWorkspace(newWorkspace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_COMPONENT__WORKSPACE, newWorkspace, newWorkspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESMFPackage.ESMF_COMPONENT__ITEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItem()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponent()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, ESMFPackage.ESMF_COMPONENT__COMPONENT, ESMFComponent.class, msgs);
				return basicSetParent((ESMFComponent)otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__STAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStage()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__WORKSPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWorkspace((ESMFWorkspace)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESMFPackage.ESMF_COMPONENT__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__PARENT:
				return basicSetParent(null, msgs);
			case ESMFPackage.ESMF_COMPONENT__STAGE:
				return ((InternalEList<?>)getStage()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__WORKSPACE:
				return basicSetWorkspace(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ESMFPackage.ESMF_COMPONENT__WORKSPACE:
				return eInternalContainer().eInverseRemove(this, ESMFPackage.ESMF_WORKSPACE__COMPONENT, ESMFWorkspace.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_COMPONENT__ITEM:
				return getItem();
			case ESMFPackage.ESMF_COMPONENT__IMPORT_STATE:
				if (resolve) return getImportState();
				return basicGetImportState();
			case ESMFPackage.ESMF_COMPONENT__EXPORT_STATE:
				if (resolve) return getExportState();
				return basicGetExportState();
			case ESMFPackage.ESMF_COMPONENT__COMPONENT:
				return getComponent();
			case ESMFPackage.ESMF_COMPONENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case ESMFPackage.ESMF_COMPONENT__STAGE:
				return getStage();
			case ESMFPackage.ESMF_COMPONENT__WORKSPACE:
				return getWorkspace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ESMFPackage.ESMF_COMPONENT__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ESMFScopedItem>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__IMPORT_STATE:
				setImportState((ESMFState)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__EXPORT_STATE:
				setExportState((ESMFState)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ESMFComponent>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__PARENT:
				setParent((ESMFComponent)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__STAGE:
				getStage().clear();
				getStage().addAll((Collection<? extends ESMFStage>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__WORKSPACE:
				setWorkspace((ESMFWorkspace)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ESMFPackage.ESMF_COMPONENT__ITEM:
				getItem().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__IMPORT_STATE:
				setImportState((ESMFState)null);
				return;
			case ESMFPackage.ESMF_COMPONENT__EXPORT_STATE:
				setExportState((ESMFState)null);
				return;
			case ESMFPackage.ESMF_COMPONENT__COMPONENT:
				getComponent().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__PARENT:
				setParent((ESMFComponent)null);
				return;
			case ESMFPackage.ESMF_COMPONENT__STAGE:
				getStage().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__WORKSPACE:
				setWorkspace((ESMFWorkspace)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ESMFPackage.ESMF_COMPONENT__ITEM:
				return item != null && !item.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__IMPORT_STATE:
				return importState != null;
			case ESMFPackage.ESMF_COMPONENT__EXPORT_STATE:
				return exportState != null;
			case ESMFPackage.ESMF_COMPONENT__COMPONENT:
				return component != null && !component.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__PARENT:
				return parent != null;
			case ESMFPackage.ESMF_COMPONENT__STAGE:
				return stage != null && !stage.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__WORKSPACE:
				return getWorkspace() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ESMFScope.class) {
			switch (derivedFeatureID) {
				case ESMFPackage.ESMF_COMPONENT__ITEM: return ESMFPackage.ESMF_SCOPE__ITEM;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ESMFScope.class) {
			switch (baseFeatureID) {
				case ESMFPackage.ESMF_SCOPE__ITEM: return ESMFPackage.ESMF_COMPONENT__ITEM;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ESMFComponentImpl
