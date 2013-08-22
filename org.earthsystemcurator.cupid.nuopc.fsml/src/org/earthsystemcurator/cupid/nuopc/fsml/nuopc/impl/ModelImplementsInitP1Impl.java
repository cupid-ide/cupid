/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Implements Init P1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl#getAdvertisesImportField <em>Advertises Import Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl#getAdvertisesExportField <em>Advertises Export Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsInitP1Impl#isAdvertisesAtLeastOneField <em>Advertises At Least One Field</em>}</li>
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
	protected static final String NAME_EDEFAULT = null;

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
	public EList<AdvertisesImportField> getAdvertisesImportField() {
		if (advertisesImportField == null) {
			advertisesImportField = new EObjectContainmentEList<AdvertisesImportField>(AdvertisesImportField.class, this, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD);
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
			advertisesExportField = new EObjectContainmentEList<AdvertisesExportField>(AdvertisesExportField.class, this, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__NAME:
				return getName();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				return getAdvertisesImportField();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
				return getAdvertisesExportField();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD:
				return isAdvertisesAtLeastOneField();
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__NAME:
				setName((String)newValue);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__NAME:
				setName(NAME_EDEFAULT);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD:
				return advertisesImportField != null && !advertisesImportField.isEmpty();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD:
				return advertisesExportField != null && !advertisesExportField.isEmpty();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD:
				return ADVERTISES_AT_LEAST_ONE_FIELD__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(')');
		return result.toString();
	}

} //ModelImplementsInitP1Impl
