/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model_Init;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField;
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
 * An implementation of the model object '<em><b>Model Implements Init P2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP2Impl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP2Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP2Impl#getImportParam <em>Import Param</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP2Impl#getExportParam <em>Export Param</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP2Impl#getRealizesImportField <em>Realizes Import Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP2Impl#getRealizesExportField <em>Realizes Export Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP2Impl#isRealizesAtLeastOneField <em>Realizes At Least One Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP2Impl#isRegisteredInSetServices <em>Registered In Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP2Impl#isRealizesOrRegistered <em>Realizes Or Registered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImplementsInitP2Impl extends EObjectImpl implements ModelImplementsInitP2 {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "InitP2";

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
	 * The cached value of the '{@link #getRealizesImportField() <em>Realizes Import Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizesImportField()
	 * @generated
	 * @ordered
	 */
	protected EList<RealizesImportField> realizesImportField;

	/**
	 * The cached value of the '{@link #getRealizesExportField() <em>Realizes Export Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizesExportField()
	 * @generated
	 * @ordered
	 */
	protected EList<RealizesExportField> realizesExportField;

	/**
	 * The cached setting delegate for the '{@link #isRealizesAtLeastOneField() <em>Realizes At Least One Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRealizesAtLeastOneField()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REALIZES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isRegisteredInSetServices() <em>Registered In Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegisteredInSetServices()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REGISTERED_IN_SET_SERVICES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P2__REGISTERED_IN_SET_SERVICES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isRealizesOrRegistered() <em>Realizes Or Registered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRealizesOrRegistered()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REALIZES_OR_REGISTERED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P2__REALIZES_OR_REGISTERED).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImplementsInitP2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.MODEL_IMPLEMENTS_INIT_P2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model_Init getParent() {
		if (eContainerFeatureID() != NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__PARENT) return null;
		return (Model_Init)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Model_Init newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Model_Init newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P2, Model_Init.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__IMPORT_PARAM, oldImportParam, importParam));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__EXPORT_PARAM, oldExportParam, exportParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealizesImportField> getRealizesImportField() {
		if (realizesImportField == null) {
			realizesImportField = new EObjectContainmentWithInverseEList<RealizesImportField>(RealizesImportField.class, this, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD, NUOPCPackage.REALIZES_IMPORT_FIELD__PARENT);
		}
		return realizesImportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealizesExportField> getRealizesExportField() {
		if (realizesExportField == null) {
			realizesExportField = new EObjectContainmentWithInverseEList<RealizesExportField>(RealizesExportField.class, this, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD, NUOPCPackage.REALIZES_EXPORT_FIELD__PARENT);
		}
		return realizesExportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRealizesAtLeastOneField() {
		return (Boolean)REALIZES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizesAtLeastOneField(boolean newRealizesAtLeastOneField) {
		REALIZES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE.dynamicSet(this, null, 0, newRealizesAtLeastOneField);
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
	public boolean isRealizesOrRegistered() {
		return (Boolean)REALIZES_OR_REGISTERED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizesOrRegistered(boolean newRealizesOrRegistered) {
		REALIZES_OR_REGISTERED__ESETTING_DELEGATE.dynamicSet(this, null, 0, newRealizesOrRegistered);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Model_Init)otherEnd, msgs);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizesImportField()).basicAdd(otherEnd, msgs);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizesExportField()).basicAdd(otherEnd, msgs);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__PARENT:
				return basicSetParent(null, msgs);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD:
				return ((InternalEList<?>)getRealizesImportField()).basicRemove(otherEnd, msgs);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD:
				return ((InternalEList<?>)getRealizesExportField()).basicRemove(otherEnd, msgs);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P2, Model_Init.class, msgs);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__PARENT:
				return getParent();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__NAME:
				return getName();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__IMPORT_PARAM:
				return getImportParam();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__EXPORT_PARAM:
				return getExportParam();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD:
				return getRealizesImportField();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD:
				return getRealizesExportField();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD:
				return isRealizesAtLeastOneField();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REGISTERED_IN_SET_SERVICES:
				return isRegisteredInSetServices();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_OR_REGISTERED:
				return isRealizesOrRegistered();
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__PARENT:
				setParent((Model_Init)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__IMPORT_PARAM:
				setImportParam((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__EXPORT_PARAM:
				setExportParam((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD:
				getRealizesImportField().clear();
				getRealizesImportField().addAll((Collection<? extends RealizesImportField>)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD:
				getRealizesExportField().clear();
				getRealizesExportField().addAll((Collection<? extends RealizesExportField>)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD:
				setRealizesAtLeastOneField((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REGISTERED_IN_SET_SERVICES:
				setRegisteredInSetServices((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_OR_REGISTERED:
				setRealizesOrRegistered((Boolean)newValue);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__PARENT:
				setParent((Model_Init)null);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__IMPORT_PARAM:
				setImportParam(IMPORT_PARAM_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__EXPORT_PARAM:
				setExportParam(EXPORT_PARAM_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD:
				getRealizesImportField().clear();
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD:
				getRealizesExportField().clear();
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD:
				REALIZES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REGISTERED_IN_SET_SERVICES:
				REGISTERED_IN_SET_SERVICES__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_OR_REGISTERED:
				REALIZES_OR_REGISTERED__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__PARENT:
				return getParent() != null;
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__IMPORT_PARAM:
				return IMPORT_PARAM_EDEFAULT == null ? importParam != null : !IMPORT_PARAM_EDEFAULT.equals(importParam);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__EXPORT_PARAM:
				return EXPORT_PARAM_EDEFAULT == null ? exportParam != null : !EXPORT_PARAM_EDEFAULT.equals(exportParam);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD:
				return realizesImportField != null && !realizesImportField.isEmpty();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD:
				return realizesExportField != null && !realizesExportField.isEmpty();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD:
				return REALIZES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REGISTERED_IN_SET_SERVICES:
				return REGISTERED_IN_SET_SERVICES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_OR_REGISTERED:
				return REALIZES_OR_REGISTERED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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

} //ModelImplementsInitP2Impl
