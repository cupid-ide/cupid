/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mediator Implements Init P1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP1Impl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP1Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP1Impl#getImportParam <em>Import Param</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP1Impl#getExportParam <em>Export Param</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP1Impl#getAdvertisesImportField <em>Advertises Import Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP1Impl#getAdvertisesExportField <em>Advertises Export Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP1Impl#isAdvertisesAtLeastOneField <em>Advertises At Least One Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP1Impl#isRegisteredInSetServices <em>Registered In Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__ImplementsInitP1Impl#isAdvertisesOrRegistered <em>Advertises Or Registered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCMediator__ImplementsInitP1Impl extends EObjectImpl implements NUOPCMediator__ImplementsInitP1 {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "InitP1";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportParam() <em>Import Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportParam()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_PARAM_EDEFAULT = "importState";

	/**
	 * The cached value of the '{@link #getImportParam() <em>Import Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportParam()
	 * @generated
	 * @ordered
	 */
	protected String importParam = IMPORT_PARAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getExportParam() <em>Export Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportParam()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORT_PARAM_EDEFAULT = "exportState";

	/**
	 * The cached value of the '{@link #getExportParam() <em>Export Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportParam()
	 * @generated
	 * @ordered
	 */
	protected String exportParam = EXPORT_PARAM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdvertisesImportField() <em>Advertises Import Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvertisesImportField()
	 * @generated
	 * @ordered
	 */
	protected EList<NUOPCMediator__AdvertisesImportField> advertisesImportField;

	/**
	 * The cached value of the '{@link #getAdvertisesExportField() <em>Advertises Export Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvertisesExportField()
	 * @generated
	 * @ordered
	 */
	protected EList<NUOPCMediator__AdvertisesExportField> advertisesExportField;

	/**
	 * The cached setting delegate for the '{@link #isAdvertisesAtLeastOneField() <em>Advertises At Least One Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdvertisesAtLeastOneField()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ADVERTISES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isRegisteredInSetServices() <em>Registered In Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegisteredInSetServices()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REGISTERED_IN_SET_SERVICES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isAdvertisesOrRegistered() <em>Advertises Or Registered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdvertisesOrRegistered()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ADVERTISES_OR_REGISTERED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCMediator__ImplementsInitP1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__Init getParent() {
		if (eContainerFeatureID() != NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT) return null;
		return (NUOPCMediator__Init)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCMediator__Init newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCMediator__Init newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1, NUOPCMediator__Init.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportParam() {
		return importParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportParam(String newImportParam) {
		String oldImportParam = importParam;
		importParam = newImportParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__IMPORT_PARAM, oldImportParam, importParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExportParam() {
		return exportParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportParam(String newExportParam) {
		String oldExportParam = exportParam;
		exportParam = newExportParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__EXPORT_PARAM, oldExportParam, exportParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NUOPCMediator__AdvertisesImportField> getAdvertisesImportField() {
		if (advertisesImportField == null) {
			advertisesImportField = new EObjectContainmentWithInverseEList<NUOPCMediator__AdvertisesImportField>(NUOPCMediator__AdvertisesImportField.class, this, NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD, NUOPCPackage.NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__PARENT);
		}
		return advertisesImportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NUOPCMediator__AdvertisesExportField> getAdvertisesExportField() {
		if (advertisesExportField == null) {
			advertisesExportField = new EObjectContainmentWithInverseEList<NUOPCMediator__AdvertisesExportField>(NUOPCMediator__AdvertisesExportField.class, this, NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD, NUOPCPackage.NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__PARENT);
		}
		return advertisesExportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdvertisesAtLeastOneField() {
		return (Boolean)ADVERTISES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvertisesAtLeastOneField(boolean newAdvertisesAtLeastOneField) {
		ADVERTISES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE.dynamicSet(this, null, 0, newAdvertisesAtLeastOneField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRegisteredInSetServices() {
		return (Boolean)REGISTERED_IN_SET_SERVICES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredInSetServices(boolean newRegisteredInSetServices) {
		REGISTERED_IN_SET_SERVICES__ESETTING_DELEGATE.dynamicSet(this, null, 0, newRegisteredInSetServices);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdvertisesOrRegistered() {
		return (Boolean)ADVERTISES_OR_REGISTERED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvertisesOrRegistered(boolean newAdvertisesOrRegistered) {
		ADVERTISES_OR_REGISTERED__ESETTING_DELEGATE.dynamicSet(this, null, 0, newAdvertisesOrRegistered);
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
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCMediator__Init)otherEnd, msgs);
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAdvertisesImportField()).basicAdd(otherEnd, msgs);
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAdvertisesExportField()).basicAdd(otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT:
				return basicSetParent(null, msgs);
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				return ((InternalEList<?>)getAdvertisesImportField()).basicRemove(otherEnd, msgs);
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
				return ((InternalEList<?>)getAdvertisesExportField()).basicRemove(otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1, NUOPCMediator__Init.class, msgs);
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
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT:
				return getParent();
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__NAME:
				return getName();
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__IMPORT_PARAM:
				return getImportParam();
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__EXPORT_PARAM:
				return getExportParam();
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				return getAdvertisesImportField();
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
				return getAdvertisesExportField();
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD:
				return isAdvertisesAtLeastOneField();
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES:
				return isRegisteredInSetServices();
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED:
				return isAdvertisesOrRegistered();
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
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT:
				setParent((NUOPCMediator__Init)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__IMPORT_PARAM:
				setImportParam((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__EXPORT_PARAM:
				setExportParam((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				getAdvertisesImportField().clear();
				getAdvertisesImportField().addAll((Collection<? extends NUOPCMediator__AdvertisesImportField>)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
				getAdvertisesExportField().clear();
				getAdvertisesExportField().addAll((Collection<? extends NUOPCMediator__AdvertisesExportField>)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD:
				setAdvertisesAtLeastOneField((Boolean)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES:
				setRegisteredInSetServices((Boolean)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED:
				setAdvertisesOrRegistered((Boolean)newValue);
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
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT:
				setParent((NUOPCMediator__Init)null);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__IMPORT_PARAM:
				setImportParam(IMPORT_PARAM_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__EXPORT_PARAM:
				setExportParam(EXPORT_PARAM_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				getAdvertisesImportField().clear();
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
				getAdvertisesExportField().clear();
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD:
				ADVERTISES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES:
				REGISTERED_IN_SET_SERVICES__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED:
				ADVERTISES_OR_REGISTERED__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT:
				return getParent() != null;
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__IMPORT_PARAM:
				return IMPORT_PARAM_EDEFAULT == null ? importParam != null : !IMPORT_PARAM_EDEFAULT.equals(importParam);
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__EXPORT_PARAM:
				return EXPORT_PARAM_EDEFAULT == null ? exportParam != null : !EXPORT_PARAM_EDEFAULT.equals(exportParam);
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				return advertisesImportField != null && !advertisesImportField.isEmpty();
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
				return advertisesExportField != null && !advertisesExportField.isEmpty();
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD:
				return ADVERTISES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES:
				return REGISTERED_IN_SET_SERVICES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED:
				return ADVERTISES_OR_REGISTERED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", importParam: ");
		result.append(importParam);
		result.append(", exportParam: ");
		result.append(exportParam);
		result.append(')');
		return result.toString();
	}

} //NUOPCMediator__ImplementsInitP1Impl
