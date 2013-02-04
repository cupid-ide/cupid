/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFCalendar;
import org.earthsystemcurator.cupid.esmf.ESMFClock;
import org.earthsystemcurator.cupid.esmf.ESMFComponent;
import org.earthsystemcurator.cupid.esmf.ESMFDELayout;
import org.earthsystemcurator.cupid.esmf.ESMFDistGrid;
import org.earthsystemcurator.cupid.esmf.ESMFGrid;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFPersistentExecutionThread;
import org.earthsystemcurator.cupid.esmf.ESMFStateItem;
import org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine;
import org.earthsystemcurator.cupid.esmf.ESMFWorkspace;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFWorkspaceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFWorkspaceImpl#getCalendar <em>Calendar</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFWorkspaceImpl#getStateItem <em>State Item</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFWorkspaceImpl#getDistGrid <em>Dist Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFWorkspaceImpl#getVirtualMachine <em>Virtual Machine</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFWorkspaceImpl#getPersistentExecutionThread <em>Persistent Execution Thread</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFWorkspaceImpl#getDeLayout <em>De Layout</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFWorkspaceImpl#getClock <em>Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFWorkspaceImpl extends EObjectImpl implements ESMFWorkspace {
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
	 * The cached value of the '{@link #getCalendar() <em>Calendar</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendar()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFCalendar> calendar;

	/**
	 * The cached value of the '{@link #getStateItem() <em>State Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFStateItem> stateItem;

	/**
	 * The cached value of the '{@link #getDistGrid() <em>Dist Grid</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistGrid()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFDistGrid> distGrid;

	/**
	 * The cached value of the '{@link #getVirtualMachine() <em>Virtual Machine</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualMachine()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFVirtualMachine> virtualMachine;

	/**
	 * The cached value of the '{@link #getPersistentExecutionThread() <em>Persistent Execution Thread</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentExecutionThread()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFPersistentExecutionThread> persistentExecutionThread;

	/**
	 * The cached value of the '{@link #getDeLayout() <em>De Layout</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeLayout()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFDELayout> deLayout;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFClock> clock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFWorkspaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_WORKSPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFComponent> getComponent() {
		if (component == null) {
			component = new EObjectResolvingEList<ESMFComponent>(ESMFComponent.class, this, ESMFPackage.ESMF_WORKSPACE__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFCalendar> getCalendar() {
		if (calendar == null) {
			calendar = new EObjectResolvingEList<ESMFCalendar>(ESMFCalendar.class, this, ESMFPackage.ESMF_WORKSPACE__CALENDAR);
		}
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFStateItem> getStateItem() {
		if (stateItem == null) {
			stateItem = new EObjectResolvingEList<ESMFStateItem>(ESMFStateItem.class, this, ESMFPackage.ESMF_WORKSPACE__STATE_ITEM);
		}
		return stateItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFDistGrid> getDistGrid() {
		if (distGrid == null) {
			distGrid = new EObjectResolvingEList<ESMFDistGrid>(ESMFDistGrid.class, this, ESMFPackage.ESMF_WORKSPACE__DIST_GRID);
		}
		return distGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFVirtualMachine> getVirtualMachine() {
		if (virtualMachine == null) {
			virtualMachine = new EObjectResolvingEList<ESMFVirtualMachine>(ESMFVirtualMachine.class, this, ESMFPackage.ESMF_WORKSPACE__VIRTUAL_MACHINE);
		}
		return virtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFPersistentExecutionThread> getPersistentExecutionThread() {
		if (persistentExecutionThread == null) {
			persistentExecutionThread = new EObjectResolvingEList<ESMFPersistentExecutionThread>(ESMFPersistentExecutionThread.class, this, ESMFPackage.ESMF_WORKSPACE__PERSISTENT_EXECUTION_THREAD);
		}
		return persistentExecutionThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFDELayout> getDeLayout() {
		if (deLayout == null) {
			deLayout = new EObjectResolvingEList<ESMFDELayout>(ESMFDELayout.class, this, ESMFPackage.ESMF_WORKSPACE__DE_LAYOUT);
		}
		return deLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFClock> getClock() {
		if (clock == null) {
			clock = new EObjectResolvingEList<ESMFClock>(ESMFClock.class, this, ESMFPackage.ESMF_WORKSPACE__CLOCK);
		}
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_WORKSPACE__COMPONENT:
				return getComponent();
			case ESMFPackage.ESMF_WORKSPACE__CALENDAR:
				return getCalendar();
			case ESMFPackage.ESMF_WORKSPACE__STATE_ITEM:
				return getStateItem();
			case ESMFPackage.ESMF_WORKSPACE__DIST_GRID:
				return getDistGrid();
			case ESMFPackage.ESMF_WORKSPACE__VIRTUAL_MACHINE:
				return getVirtualMachine();
			case ESMFPackage.ESMF_WORKSPACE__PERSISTENT_EXECUTION_THREAD:
				return getPersistentExecutionThread();
			case ESMFPackage.ESMF_WORKSPACE__DE_LAYOUT:
				return getDeLayout();
			case ESMFPackage.ESMF_WORKSPACE__CLOCK:
				return getClock();
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
			case ESMFPackage.ESMF_WORKSPACE__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ESMFComponent>)newValue);
				return;
			case ESMFPackage.ESMF_WORKSPACE__CALENDAR:
				getCalendar().clear();
				getCalendar().addAll((Collection<? extends ESMFCalendar>)newValue);
				return;
			case ESMFPackage.ESMF_WORKSPACE__STATE_ITEM:
				getStateItem().clear();
				getStateItem().addAll((Collection<? extends ESMFStateItem>)newValue);
				return;
			case ESMFPackage.ESMF_WORKSPACE__DIST_GRID:
				getDistGrid().clear();
				getDistGrid().addAll((Collection<? extends ESMFDistGrid>)newValue);
				return;
			case ESMFPackage.ESMF_WORKSPACE__VIRTUAL_MACHINE:
				getVirtualMachine().clear();
				getVirtualMachine().addAll((Collection<? extends ESMFVirtualMachine>)newValue);
				return;
			case ESMFPackage.ESMF_WORKSPACE__PERSISTENT_EXECUTION_THREAD:
				getPersistentExecutionThread().clear();
				getPersistentExecutionThread().addAll((Collection<? extends ESMFPersistentExecutionThread>)newValue);
				return;
			case ESMFPackage.ESMF_WORKSPACE__DE_LAYOUT:
				getDeLayout().clear();
				getDeLayout().addAll((Collection<? extends ESMFDELayout>)newValue);
				return;
			case ESMFPackage.ESMF_WORKSPACE__CLOCK:
				getClock().clear();
				getClock().addAll((Collection<? extends ESMFClock>)newValue);
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
			case ESMFPackage.ESMF_WORKSPACE__COMPONENT:
				getComponent().clear();
				return;
			case ESMFPackage.ESMF_WORKSPACE__CALENDAR:
				getCalendar().clear();
				return;
			case ESMFPackage.ESMF_WORKSPACE__STATE_ITEM:
				getStateItem().clear();
				return;
			case ESMFPackage.ESMF_WORKSPACE__DIST_GRID:
				getDistGrid().clear();
				return;
			case ESMFPackage.ESMF_WORKSPACE__VIRTUAL_MACHINE:
				getVirtualMachine().clear();
				return;
			case ESMFPackage.ESMF_WORKSPACE__PERSISTENT_EXECUTION_THREAD:
				getPersistentExecutionThread().clear();
				return;
			case ESMFPackage.ESMF_WORKSPACE__DE_LAYOUT:
				getDeLayout().clear();
				return;
			case ESMFPackage.ESMF_WORKSPACE__CLOCK:
				getClock().clear();
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
			case ESMFPackage.ESMF_WORKSPACE__COMPONENT:
				return component != null && !component.isEmpty();
			case ESMFPackage.ESMF_WORKSPACE__CALENDAR:
				return calendar != null && !calendar.isEmpty();
			case ESMFPackage.ESMF_WORKSPACE__STATE_ITEM:
				return stateItem != null && !stateItem.isEmpty();
			case ESMFPackage.ESMF_WORKSPACE__DIST_GRID:
				return distGrid != null && !distGrid.isEmpty();
			case ESMFPackage.ESMF_WORKSPACE__VIRTUAL_MACHINE:
				return virtualMachine != null && !virtualMachine.isEmpty();
			case ESMFPackage.ESMF_WORKSPACE__PERSISTENT_EXECUTION_THREAD:
				return persistentExecutionThread != null && !persistentExecutionThread.isEmpty();
			case ESMFPackage.ESMF_WORKSPACE__DE_LAYOUT:
				return deLayout != null && !deLayout.isEmpty();
			case ESMFPackage.ESMF_WORKSPACE__CLOCK:
				return clock != null && !clock.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ESMFWorkspaceImpl
