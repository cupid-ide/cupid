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
import org.earthsystemcurator.cupid.esmf.ESMFState;
import org.earthsystemcurator.cupid.esmf.ESMFTime;
import org.earthsystemcurator.cupid.esmf.ESMFTimeInterval;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getRegisterMethod <em>Register Method</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getState <em>State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getImportState <em>Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getExportState <em>Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getArraySpec <em>Array Spec</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getDistGrid <em>Dist Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getRouteHandle <em>Route Handle</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getModelClock <em>Model Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getSIDLClass <em>SIDL Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ESMFComponentImpl extends ESMFNamedEntityImpl implements ESMFComponent {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFMethod> method;

	/**
	 * The cached value of the '{@link #getRegisterMethod() <em>Register Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterMethod()
	 * @generated
	 * @ordered
	 */
	protected ESMFRegisterMethod registerMethod;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFState> state;

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
	 * The cached value of the '{@link #getArraySpec() <em>Array Spec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySpec()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFArraySpec> arraySpec;

	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFArray> array;

	/**
	 * The cached value of the '{@link #getDistGrid() <em>Dist Grid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistGrid()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFDistGrid> distGrid;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFField> field;

	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFGrid> grid;

	/**
	 * The cached value of the '{@link #getRouteHandle() <em>Route Handle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteHandle()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFRouteHandle> routeHandle;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFClock> clock;

	/**
	 * The cached value of the '{@link #getModelClock() <em>Model Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelClock()
	 * @generated
	 * @ordered
	 */
	protected ESMFClock modelClock;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFTime> time;

	/**
	 * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFTimeInterval> timeInterval;

	/**
	 * The cached value of the '{@link #getSIDLClass() <em>SIDL Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIDLClass()
	 * @generated
	 * @ordered
	 */
	protected org.earthsystemcurator.cupid.sidl.Class sidlClass;

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
	public EList<ESMFMethod> getMethod() {
		if (method == null) {
			method = new EObjectContainmentWithInverseEList<ESMFMethod>(ESMFMethod.class, this, ESMFPackage.ESMF_COMPONENT__METHOD, ESMFPackage.ESMF_METHOD__COMPONENT);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFRegisterMethod getRegisterMethod() {
		return registerMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterMethod(ESMFRegisterMethod newRegisterMethod, NotificationChain msgs) {
		ESMFRegisterMethod oldRegisterMethod = registerMethod;
		registerMethod = newRegisterMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD, oldRegisterMethod, newRegisterMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterMethod(ESMFRegisterMethod newRegisterMethod) {
		if (newRegisterMethod != registerMethod) {
			NotificationChain msgs = null;
			if (registerMethod != null)
				msgs = ((InternalEObject)registerMethod).eInverseRemove(this, ESMFPackage.ESMF_REGISTER_METHOD__COMPONENT, ESMFRegisterMethod.class, msgs);
			if (newRegisterMethod != null)
				msgs = ((InternalEObject)newRegisterMethod).eInverseAdd(this, ESMFPackage.ESMF_REGISTER_METHOD__COMPONENT, ESMFRegisterMethod.class, msgs);
			msgs = basicSetRegisterMethod(newRegisterMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD, newRegisterMethod, newRegisterMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFState> getState() {
		if (state == null) {
			state = new EObjectContainmentWithInverseEList<ESMFState>(ESMFState.class, this, ESMFPackage.ESMF_COMPONENT__STATE, ESMFPackage.ESMF_STATE__COMPONENT);
		}
		return state;
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
	public EList<ESMFArraySpec> getArraySpec() {
		if (arraySpec == null) {
			arraySpec = new EObjectContainmentWithInverseEList<ESMFArraySpec>(ESMFArraySpec.class, this, ESMFPackage.ESMF_COMPONENT__ARRAY_SPEC, ESMFPackage.ESMF_ARRAY_SPEC__COMPONENT);
		}
		return arraySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFArray> getArray() {
		if (array == null) {
			array = new EObjectContainmentWithInverseEList<ESMFArray>(ESMFArray.class, this, ESMFPackage.ESMF_COMPONENT__ARRAY, ESMFPackage.ESMF_ARRAY__COMPONENT);
		}
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFDistGrid> getDistGrid() {
		if (distGrid == null) {
			distGrid = new EObjectContainmentEList<ESMFDistGrid>(ESMFDistGrid.class, this, ESMFPackage.ESMF_COMPONENT__DIST_GRID);
		}
		return distGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFField> getField() {
		if (field == null) {
			field = new EObjectContainmentWithInverseEList<ESMFField>(ESMFField.class, this, ESMFPackage.ESMF_COMPONENT__FIELD, ESMFPackage.ESMF_FIELD__COMPONENT);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFGrid> getGrid() {
		if (grid == null) {
			grid = new EObjectContainmentEList<ESMFGrid>(ESMFGrid.class, this, ESMFPackage.ESMF_COMPONENT__GRID);
		}
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFRouteHandle> getRouteHandle() {
		if (routeHandle == null) {
			routeHandle = new EObjectContainmentWithInverseEList<ESMFRouteHandle>(ESMFRouteHandle.class, this, ESMFPackage.ESMF_COMPONENT__ROUTE_HANDLE, ESMFPackage.ESMF_ROUTE_HANDLE__COMPONENT);
		}
		return routeHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFClock> getClock() {
		if (clock == null) {
			clock = new EObjectContainmentWithInverseEList<ESMFClock>(ESMFClock.class, this, ESMFPackage.ESMF_COMPONENT__CLOCK, ESMFPackage.ESMF_CLOCK__COMPONENT);
		}
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFClock getModelClock() {
		if (modelClock != null && modelClock.eIsProxy()) {
			InternalEObject oldModelClock = (InternalEObject)modelClock;
			modelClock = (ESMFClock)eResolveProxy(oldModelClock);
			if (modelClock != oldModelClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_COMPONENT__MODEL_CLOCK, oldModelClock, modelClock));
			}
		}
		return modelClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFClock basicGetModelClock() {
		return modelClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelClock(ESMFClock newModelClock) {
		ESMFClock oldModelClock = modelClock;
		modelClock = newModelClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_COMPONENT__MODEL_CLOCK, oldModelClock, modelClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFTime> getTime() {
		if (time == null) {
			time = new EObjectContainmentEList<ESMFTime>(ESMFTime.class, this, ESMFPackage.ESMF_COMPONENT__TIME);
		}
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFTimeInterval> getTimeInterval() {
		if (timeInterval == null) {
			timeInterval = new EObjectContainmentEList<ESMFTimeInterval>(ESMFTimeInterval.class, this, ESMFPackage.ESMF_COMPONENT__TIME_INTERVAL);
		}
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.earthsystemcurator.cupid.sidl.Class getSIDLClass() {
		if (sidlClass != null && sidlClass.eIsProxy()) {
			InternalEObject oldSIDLClass = (InternalEObject)sidlClass;
			sidlClass = (org.earthsystemcurator.cupid.sidl.Class)eResolveProxy(oldSIDLClass);
			if (sidlClass != oldSIDLClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_COMPONENT__SIDL_CLASS, oldSIDLClass, sidlClass));
			}
		}
		return sidlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.earthsystemcurator.cupid.sidl.Class basicGetSIDLClass() {
		return sidlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSIDLClass(org.earthsystemcurator.cupid.sidl.Class newSIDLClass) {
		org.earthsystemcurator.cupid.sidl.Class oldSIDLClass = sidlClass;
		sidlClass = newSIDLClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_COMPONENT__SIDL_CLASS, oldSIDLClass, sidlClass));
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
			case ESMFPackage.ESMF_COMPONENT__METHOD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD:
				if (registerMethod != null)
					msgs = ((InternalEObject)registerMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD, null, msgs);
				return basicSetRegisterMethod((ESMFRegisterMethod)otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getState()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponent()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, ESMFPackage.ESMF_COMPONENT__COMPONENT, ESMFComponent.class, msgs);
				return basicSetParent((ESMFComponent)otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__ARRAY_SPEC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArraySpec()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__ARRAY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArray()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__FIELD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getField()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__ROUTE_HANDLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRouteHandle()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__CLOCK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClock()).basicAdd(otherEnd, msgs);
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
			case ESMFPackage.ESMF_COMPONENT__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD:
				return basicSetRegisterMethod(null, msgs);
			case ESMFPackage.ESMF_COMPONENT__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__PARENT:
				return basicSetParent(null, msgs);
			case ESMFPackage.ESMF_COMPONENT__ARRAY_SPEC:
				return ((InternalEList<?>)getArraySpec()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__DIST_GRID:
				return ((InternalEList<?>)getDistGrid()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__FIELD:
				return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__GRID:
				return ((InternalEList<?>)getGrid()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__ROUTE_HANDLE:
				return ((InternalEList<?>)getRouteHandle()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__CLOCK:
				return ((InternalEList<?>)getClock()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__TIME:
				return ((InternalEList<?>)getTime()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__TIME_INTERVAL:
				return ((InternalEList<?>)getTimeInterval()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_COMPONENT__METHOD:
				return getMethod();
			case ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD:
				return getRegisterMethod();
			case ESMFPackage.ESMF_COMPONENT__STATE:
				return getState();
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
			case ESMFPackage.ESMF_COMPONENT__ARRAY_SPEC:
				return getArraySpec();
			case ESMFPackage.ESMF_COMPONENT__ARRAY:
				return getArray();
			case ESMFPackage.ESMF_COMPONENT__DIST_GRID:
				return getDistGrid();
			case ESMFPackage.ESMF_COMPONENT__FIELD:
				return getField();
			case ESMFPackage.ESMF_COMPONENT__GRID:
				return getGrid();
			case ESMFPackage.ESMF_COMPONENT__ROUTE_HANDLE:
				return getRouteHandle();
			case ESMFPackage.ESMF_COMPONENT__CLOCK:
				return getClock();
			case ESMFPackage.ESMF_COMPONENT__MODEL_CLOCK:
				if (resolve) return getModelClock();
				return basicGetModelClock();
			case ESMFPackage.ESMF_COMPONENT__TIME:
				return getTime();
			case ESMFPackage.ESMF_COMPONENT__TIME_INTERVAL:
				return getTimeInterval();
			case ESMFPackage.ESMF_COMPONENT__SIDL_CLASS:
				if (resolve) return getSIDLClass();
				return basicGetSIDLClass();
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
			case ESMFPackage.ESMF_COMPONENT__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends ESMFMethod>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD:
				setRegisterMethod((ESMFRegisterMethod)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__STATE:
				getState().clear();
				getState().addAll((Collection<? extends ESMFState>)newValue);
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
			case ESMFPackage.ESMF_COMPONENT__ARRAY_SPEC:
				getArraySpec().clear();
				getArraySpec().addAll((Collection<? extends ESMFArraySpec>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ESMFArray>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__DIST_GRID:
				getDistGrid().clear();
				getDistGrid().addAll((Collection<? extends ESMFDistGrid>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__FIELD:
				getField().clear();
				getField().addAll((Collection<? extends ESMFField>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__GRID:
				getGrid().clear();
				getGrid().addAll((Collection<? extends ESMFGrid>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__ROUTE_HANDLE:
				getRouteHandle().clear();
				getRouteHandle().addAll((Collection<? extends ESMFRouteHandle>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__CLOCK:
				getClock().clear();
				getClock().addAll((Collection<? extends ESMFClock>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__MODEL_CLOCK:
				setModelClock((ESMFClock)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__TIME:
				getTime().clear();
				getTime().addAll((Collection<? extends ESMFTime>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__TIME_INTERVAL:
				getTimeInterval().clear();
				getTimeInterval().addAll((Collection<? extends ESMFTimeInterval>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__SIDL_CLASS:
				setSIDLClass((org.earthsystemcurator.cupid.sidl.Class)newValue);
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
			case ESMFPackage.ESMF_COMPONENT__METHOD:
				getMethod().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD:
				setRegisterMethod((ESMFRegisterMethod)null);
				return;
			case ESMFPackage.ESMF_COMPONENT__STATE:
				getState().clear();
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
			case ESMFPackage.ESMF_COMPONENT__ARRAY_SPEC:
				getArraySpec().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__ARRAY:
				getArray().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__DIST_GRID:
				getDistGrid().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__FIELD:
				getField().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__GRID:
				getGrid().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__ROUTE_HANDLE:
				getRouteHandle().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__CLOCK:
				getClock().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__MODEL_CLOCK:
				setModelClock((ESMFClock)null);
				return;
			case ESMFPackage.ESMF_COMPONENT__TIME:
				getTime().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__TIME_INTERVAL:
				getTimeInterval().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__SIDL_CLASS:
				setSIDLClass((org.earthsystemcurator.cupid.sidl.Class)null);
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
			case ESMFPackage.ESMF_COMPONENT__METHOD:
				return method != null && !method.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD:
				return registerMethod != null;
			case ESMFPackage.ESMF_COMPONENT__STATE:
				return state != null && !state.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__IMPORT_STATE:
				return importState != null;
			case ESMFPackage.ESMF_COMPONENT__EXPORT_STATE:
				return exportState != null;
			case ESMFPackage.ESMF_COMPONENT__COMPONENT:
				return component != null && !component.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__PARENT:
				return parent != null;
			case ESMFPackage.ESMF_COMPONENT__ARRAY_SPEC:
				return arraySpec != null && !arraySpec.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__ARRAY:
				return array != null && !array.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__DIST_GRID:
				return distGrid != null && !distGrid.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__FIELD:
				return field != null && !field.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__GRID:
				return grid != null && !grid.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__ROUTE_HANDLE:
				return routeHandle != null && !routeHandle.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__CLOCK:
				return clock != null && !clock.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__MODEL_CLOCK:
				return modelClock != null;
			case ESMFPackage.ESMF_COMPONENT__TIME:
				return time != null && !time.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__TIME_INTERVAL:
				return timeInterval != null && !timeInterval.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__SIDL_CLASS:
				return sidlClass != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFComponentImpl
