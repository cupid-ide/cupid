/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFArray;
import org.earthsystemcurator.cupid.esmf.ESMFArraySpec;
import org.earthsystemcurator.cupid.esmf.ESMFComponent;
import org.earthsystemcurator.cupid.esmf.ESMFDistGrid;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFWorkspace;
import org.earthsystemcurator.cupid.esmf.ESMF_INDEX;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArrayImpl#getWorkspace <em>Workspace</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArrayImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArrayImpl#getArraySpec <em>Array Spec</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArrayImpl#getDistGrid <em>Dist Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArrayImpl#getFarray <em>Farray</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArrayImpl#getIndexflag <em>Indexflag</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArrayImpl#getHaloLWidth <em>Halo LWidth</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArrayImpl#getHaloUWidth <em>Halo UWidth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFArrayImpl extends ESMFNamedEntityImpl implements ESMFArray {
	/**
	 * The cached value of the '{@link #getWorkspace() <em>Workspace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkspace()
	 * @generated
	 * @ordered
	 */
	protected ESMFWorkspace workspace;

	/**
	 * The cached value of the '{@link #getArraySpec() <em>Array Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySpec()
	 * @generated
	 * @ordered
	 */
	protected ESMFArraySpec arraySpec;

	/**
	 * The cached value of the '{@link #getDistGrid() <em>Dist Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistGrid()
	 * @generated
	 * @ordered
	 */
	protected ESMFDistGrid distGrid;

	/**
	 * The default value of the '{@link #getFarray() <em>Farray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarray()
	 * @generated
	 * @ordered
	 */
	protected static final String FARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFarray() <em>Farray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarray()
	 * @generated
	 * @ordered
	 */
	protected String farray = FARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndexflag() <em>Indexflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexflag()
	 * @generated
	 * @ordered
	 */
	protected static final ESMF_INDEX INDEXFLAG_EDEFAULT = ESMF_INDEX.ESMF_INDEX_DELOCAL;

	/**
	 * The cached value of the '{@link #getIndexflag() <em>Indexflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexflag()
	 * @generated
	 * @ordered
	 */
	protected ESMF_INDEX indexflag = INDEXFLAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHaloLWidth() <em>Halo LWidth</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaloLWidth()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> haloLWidth;

	/**
	 * The cached value of the '{@link #getHaloUWidth() <em>Halo UWidth</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaloUWidth()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> haloUWidth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFWorkspace getWorkspace() {
		if (workspace != null && workspace.eIsProxy()) {
			InternalEObject oldWorkspace = (InternalEObject)workspace;
			workspace = (ESMFWorkspace)eResolveProxy(oldWorkspace);
			if (workspace != oldWorkspace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ARRAY__WORKSPACE, oldWorkspace, workspace));
			}
		}
		return workspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFWorkspace basicGetWorkspace() {
		return workspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkspace(ESMFWorkspace newWorkspace, NotificationChain msgs) {
		ESMFWorkspace oldWorkspace = workspace;
		workspace = newWorkspace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ARRAY__WORKSPACE, oldWorkspace, newWorkspace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkspace(ESMFWorkspace newWorkspace) {
		if (newWorkspace != workspace) {
			NotificationChain msgs = null;
			if (workspace != null)
				msgs = ((InternalEObject)workspace).eInverseRemove(this, ESMFPackage.ESMF_WORKSPACE__STATE_ITEM, ESMFWorkspace.class, msgs);
			if (newWorkspace != null)
				msgs = ((InternalEObject)newWorkspace).eInverseAdd(this, ESMFPackage.ESMF_WORKSPACE__STATE_ITEM, ESMFWorkspace.class, msgs);
			msgs = basicSetWorkspace(newWorkspace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ARRAY__WORKSPACE, newWorkspace, newWorkspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFComponent getComponent() {
		if (eContainerFeatureID() != ESMFPackage.ESMF_ARRAY__COMPONENT) return null;
		return (ESMFComponent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(ESMFComponent newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent, ESMFPackage.ESMF_ARRAY__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ESMFComponent newComponent) {
		if (newComponent != eInternalContainer() || (eContainerFeatureID() != ESMFPackage.ESMF_ARRAY__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, ESMFPackage.ESMF_COMPONENT__ARRAY, ESMFComponent.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ARRAY__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFArraySpec getArraySpec() {
		if (arraySpec != null && arraySpec.eIsProxy()) {
			InternalEObject oldArraySpec = (InternalEObject)arraySpec;
			arraySpec = (ESMFArraySpec)eResolveProxy(oldArraySpec);
			if (arraySpec != oldArraySpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ARRAY__ARRAY_SPEC, oldArraySpec, arraySpec));
			}
		}
		return arraySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFArraySpec basicGetArraySpec() {
		return arraySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArraySpec(ESMFArraySpec newArraySpec) {
		ESMFArraySpec oldArraySpec = arraySpec;
		arraySpec = newArraySpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ARRAY__ARRAY_SPEC, oldArraySpec, arraySpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFDistGrid getDistGrid() {
		if (distGrid != null && distGrid.eIsProxy()) {
			InternalEObject oldDistGrid = (InternalEObject)distGrid;
			distGrid = (ESMFDistGrid)eResolveProxy(oldDistGrid);
			if (distGrid != oldDistGrid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ARRAY__DIST_GRID, oldDistGrid, distGrid));
			}
		}
		return distGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFDistGrid basicGetDistGrid() {
		return distGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistGrid(ESMFDistGrid newDistGrid) {
		ESMFDistGrid oldDistGrid = distGrid;
		distGrid = newDistGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ARRAY__DIST_GRID, oldDistGrid, distGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFarray() {
		return farray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFarray(String newFarray) {
		String oldFarray = farray;
		farray = newFarray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ARRAY__FARRAY, oldFarray, farray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMF_INDEX getIndexflag() {
		return indexflag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexflag(ESMF_INDEX newIndexflag) {
		ESMF_INDEX oldIndexflag = indexflag;
		indexflag = newIndexflag == null ? INDEXFLAG_EDEFAULT : newIndexflag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ARRAY__INDEXFLAG, oldIndexflag, indexflag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getHaloLWidth() {
		if (haloLWidth == null) {
			haloLWidth = new EDataTypeEList<Integer>(Integer.class, this, ESMFPackage.ESMF_ARRAY__HALO_LWIDTH);
		}
		return haloLWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getHaloUWidth() {
		if (haloUWidth == null) {
			haloUWidth = new EDataTypeEList<Integer>(Integer.class, this, ESMFPackage.ESMF_ARRAY__HALO_UWIDTH);
		}
		return haloUWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESMFPackage.ESMF_ARRAY__WORKSPACE:
				if (workspace != null)
					msgs = ((InternalEObject)workspace).eInverseRemove(this, ESMFPackage.ESMF_WORKSPACE__STATE_ITEM, ESMFWorkspace.class, msgs);
				return basicSetWorkspace((ESMFWorkspace)otherEnd, msgs);
			case ESMFPackage.ESMF_ARRAY__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((ESMFComponent)otherEnd, msgs);
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
			case ESMFPackage.ESMF_ARRAY__WORKSPACE:
				return basicSetWorkspace(null, msgs);
			case ESMFPackage.ESMF_ARRAY__COMPONENT:
				return basicSetComponent(null, msgs);
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
			case ESMFPackage.ESMF_ARRAY__COMPONENT:
				return eInternalContainer().eInverseRemove(this, ESMFPackage.ESMF_COMPONENT__ARRAY, ESMFComponent.class, msgs);
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
			case ESMFPackage.ESMF_ARRAY__WORKSPACE:
				if (resolve) return getWorkspace();
				return basicGetWorkspace();
			case ESMFPackage.ESMF_ARRAY__COMPONENT:
				return getComponent();
			case ESMFPackage.ESMF_ARRAY__ARRAY_SPEC:
				if (resolve) return getArraySpec();
				return basicGetArraySpec();
			case ESMFPackage.ESMF_ARRAY__DIST_GRID:
				if (resolve) return getDistGrid();
				return basicGetDistGrid();
			case ESMFPackage.ESMF_ARRAY__FARRAY:
				return getFarray();
			case ESMFPackage.ESMF_ARRAY__INDEXFLAG:
				return getIndexflag();
			case ESMFPackage.ESMF_ARRAY__HALO_LWIDTH:
				return getHaloLWidth();
			case ESMFPackage.ESMF_ARRAY__HALO_UWIDTH:
				return getHaloUWidth();
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
			case ESMFPackage.ESMF_ARRAY__WORKSPACE:
				setWorkspace((ESMFWorkspace)newValue);
				return;
			case ESMFPackage.ESMF_ARRAY__COMPONENT:
				setComponent((ESMFComponent)newValue);
				return;
			case ESMFPackage.ESMF_ARRAY__ARRAY_SPEC:
				setArraySpec((ESMFArraySpec)newValue);
				return;
			case ESMFPackage.ESMF_ARRAY__DIST_GRID:
				setDistGrid((ESMFDistGrid)newValue);
				return;
			case ESMFPackage.ESMF_ARRAY__FARRAY:
				setFarray((String)newValue);
				return;
			case ESMFPackage.ESMF_ARRAY__INDEXFLAG:
				setIndexflag((ESMF_INDEX)newValue);
				return;
			case ESMFPackage.ESMF_ARRAY__HALO_LWIDTH:
				getHaloLWidth().clear();
				getHaloLWidth().addAll((Collection<? extends Integer>)newValue);
				return;
			case ESMFPackage.ESMF_ARRAY__HALO_UWIDTH:
				getHaloUWidth().clear();
				getHaloUWidth().addAll((Collection<? extends Integer>)newValue);
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
			case ESMFPackage.ESMF_ARRAY__WORKSPACE:
				setWorkspace((ESMFWorkspace)null);
				return;
			case ESMFPackage.ESMF_ARRAY__COMPONENT:
				setComponent((ESMFComponent)null);
				return;
			case ESMFPackage.ESMF_ARRAY__ARRAY_SPEC:
				setArraySpec((ESMFArraySpec)null);
				return;
			case ESMFPackage.ESMF_ARRAY__DIST_GRID:
				setDistGrid((ESMFDistGrid)null);
				return;
			case ESMFPackage.ESMF_ARRAY__FARRAY:
				setFarray(FARRAY_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ARRAY__INDEXFLAG:
				setIndexflag(INDEXFLAG_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ARRAY__HALO_LWIDTH:
				getHaloLWidth().clear();
				return;
			case ESMFPackage.ESMF_ARRAY__HALO_UWIDTH:
				getHaloUWidth().clear();
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
			case ESMFPackage.ESMF_ARRAY__WORKSPACE:
				return workspace != null;
			case ESMFPackage.ESMF_ARRAY__COMPONENT:
				return getComponent() != null;
			case ESMFPackage.ESMF_ARRAY__ARRAY_SPEC:
				return arraySpec != null;
			case ESMFPackage.ESMF_ARRAY__DIST_GRID:
				return distGrid != null;
			case ESMFPackage.ESMF_ARRAY__FARRAY:
				return FARRAY_EDEFAULT == null ? farray != null : !FARRAY_EDEFAULT.equals(farray);
			case ESMFPackage.ESMF_ARRAY__INDEXFLAG:
				return indexflag != INDEXFLAG_EDEFAULT;
			case ESMFPackage.ESMF_ARRAY__HALO_LWIDTH:
				return haloLWidth != null && !haloLWidth.isEmpty();
			case ESMFPackage.ESMF_ARRAY__HALO_UWIDTH:
				return haloUWidth != null && !haloUWidth.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (farray: ");
		result.append(farray);
		result.append(", indexflag: ");
		result.append(indexflag);
		result.append(", haloLWidth: ");
		result.append(haloLWidth);
		result.append(", haloUWidth: ");
		result.append(haloUWidth);
		result.append(')');
		return result.toString();
	}

} //ESMFArrayImpl
