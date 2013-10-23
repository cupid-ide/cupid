/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model_Init;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Implements Init P1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl#getImportParam <em>Import Param</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl#getExportParam <em>Export Param</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl#getAdvertisesImportField <em>Advertises Import Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl#getAdvertisesExportField <em>Advertises Export Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl#isAdvertisesAtLeastOneField <em>Advertises At Least One Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl#isRegisteredInSetServices <em>Registered In Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl#isAdvertisesOrRegistered <em>Advertises Or Registered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImplementsInitP1Impl extends EObjectImpl implements ModelImplementsInitP1 {
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
	protected EList<AdvertisesImportField> advertisesImportField;

	/**
	 * The cached value of the '{@link #getAdvertisesExportField() <em>Advertises Export Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvertisesExportField()
	 * @generated
	 * @ordered
	 */
	protected EList<AdvertisesExportField> advertisesExportField;

	/**
	 * The cached setting delegate for the '{@link #isAdvertisesAtLeastOneField() <em>Advertises At Least One Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdvertisesAtLeastOneField()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ADVERTISES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isRegisteredInSetServices() <em>Registered In Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegisteredInSetServices()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REGISTERED_IN_SET_SERVICES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isAdvertisesOrRegistered() <em>Advertises Or Registered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdvertisesOrRegistered()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ADVERTISES_OR_REGISTERED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImplementsInitP1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model_Init getParent() {
		if (eContainerFeatureID() != NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__PARENT) return null;
		return (Model_Init)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Model_Init newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Model_Init newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P1, Model_Init.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM, oldImportParam, importParam));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM, oldExportParam, exportParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdvertisesImportField> getAdvertisesImportField() {
		if (advertisesImportField == null) {
			advertisesImportField = new EObjectContainmentWithInverseEList<AdvertisesImportField>(AdvertisesImportField.class, this, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD, NUOPCPackage.ADVERTISES_IMPORT_FIELD__PARENT);
		}
		return advertisesImportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdvertisesExportField> getAdvertisesExportField() {
		if (advertisesExportField == null) {
			advertisesExportField = new EObjectContainmentWithInverseEList<AdvertisesExportField>(AdvertisesExportField.class, this, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD, NUOPCPackage.ADVERTISES_EXPORT_FIELD__PARENT);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Model_Init)otherEnd, msgs);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAdvertisesImportField()).basicAdd(otherEnd, msgs);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__PARENT:
				return basicSetParent(null, msgs);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				return ((InternalEList<?>)getAdvertisesImportField()).basicRemove(otherEnd, msgs);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P1, Model_Init.class, msgs);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__PARENT:
				return getParent();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__NAME:
				return getName();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM:
				return getImportParam();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM:
				return getExportParam();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				return getAdvertisesImportField();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
				return getAdvertisesExportField();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD:
				return isAdvertisesAtLeastOneField();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES:
				return isRegisteredInSetServices();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED:
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__PARENT:
				setParent((Model_Init)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM:
				setImportParam((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM:
				setExportParam((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				getAdvertisesImportField().clear();
				getAdvertisesImportField().addAll((Collection<? extends AdvertisesImportField>)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
				getAdvertisesExportField().clear();
				getAdvertisesExportField().addAll((Collection<? extends AdvertisesExportField>)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD:
				setAdvertisesAtLeastOneField((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES:
				setRegisteredInSetServices((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED:
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__PARENT:
				setParent((Model_Init)null);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM:
				setImportParam(IMPORT_PARAM_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM:
				setExportParam(EXPORT_PARAM_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				getAdvertisesImportField().clear();
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
				getAdvertisesExportField().clear();
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD:
				ADVERTISES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES:
				REGISTERED_IN_SET_SERVICES__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED:
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__PARENT:
				return getParent() != null;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM:
				return IMPORT_PARAM_EDEFAULT == null ? importParam != null : !IMPORT_PARAM_EDEFAULT.equals(importParam);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM:
				return EXPORT_PARAM_EDEFAULT == null ? exportParam != null : !EXPORT_PARAM_EDEFAULT.equals(exportParam);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				return advertisesImportField != null && !advertisesImportField.isEmpty();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
				return advertisesExportField != null && !advertisesExportField.isEmpty();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD:
				return ADVERTISES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES:
				return REGISTERED_IN_SET_SERVICES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED:
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

} //ModelImplementsInitP1Impl
