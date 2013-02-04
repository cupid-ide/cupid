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
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getRegisterMethod <em>Register Method</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getImportState <em>Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getExportState <em>Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getModelClock <em>Model Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getSIDLClass <em>SIDL Class</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFComponentImpl#getStage <em>Stage</em>}</li>
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESMFPackage.ESMF_COMPONENT__ITEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItem()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__METHOD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD:
				if (registerMethod != null)
					msgs = ((InternalEObject)registerMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD, null, msgs);
				return basicSetRegisterMethod((ESMFRegisterMethod)otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponent()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, ESMFPackage.ESMF_COMPONENT__COMPONENT, ESMFComponent.class, msgs);
				return basicSetParent((ESMFComponent)otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__CLOCK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClock()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__STAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStage()).basicAdd(otherEnd, msgs);
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
			case ESMFPackage.ESMF_COMPONENT__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD:
				return basicSetRegisterMethod(null, msgs);
			case ESMFPackage.ESMF_COMPONENT__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__PARENT:
				return basicSetParent(null, msgs);
			case ESMFPackage.ESMF_COMPONENT__CLOCK:
				return ((InternalEList<?>)getClock()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__TIME:
				return ((InternalEList<?>)getTime()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__TIME_INTERVAL:
				return ((InternalEList<?>)getTimeInterval()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_COMPONENT__STAGE:
				return ((InternalEList<?>)getStage()).basicRemove(otherEnd, msgs);
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
			case ESMFPackage.ESMF_COMPONENT__ITEM:
				return getItem();
			case ESMFPackage.ESMF_COMPONENT__METHOD:
				return getMethod();
			case ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD:
				return getRegisterMethod();
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
			case ESMFPackage.ESMF_COMPONENT__STAGE:
				return getStage();
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
			case ESMFPackage.ESMF_COMPONENT__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends ESMFMethod>)newValue);
				return;
			case ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD:
				setRegisterMethod((ESMFRegisterMethod)newValue);
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
			case ESMFPackage.ESMF_COMPONENT__STAGE:
				getStage().clear();
				getStage().addAll((Collection<? extends ESMFStage>)newValue);
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
			case ESMFPackage.ESMF_COMPONENT__METHOD:
				getMethod().clear();
				return;
			case ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD:
				setRegisterMethod((ESMFRegisterMethod)null);
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
			case ESMFPackage.ESMF_COMPONENT__STAGE:
				getStage().clear();
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
			case ESMFPackage.ESMF_COMPONENT__METHOD:
				return method != null && !method.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__REGISTER_METHOD:
				return registerMethod != null;
			case ESMFPackage.ESMF_COMPONENT__IMPORT_STATE:
				return importState != null;
			case ESMFPackage.ESMF_COMPONENT__EXPORT_STATE:
				return exportState != null;
			case ESMFPackage.ESMF_COMPONENT__COMPONENT:
				return component != null && !component.isEmpty();
			case ESMFPackage.ESMF_COMPONENT__PARENT:
				return parent != null;
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
			case ESMFPackage.ESMF_COMPONENT__STAGE:
				return stage != null && !stage.isEmpty();
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
