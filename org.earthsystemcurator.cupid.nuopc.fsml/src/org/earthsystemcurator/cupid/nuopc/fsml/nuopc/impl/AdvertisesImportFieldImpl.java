/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advertises Import Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AdvertisesImportFieldImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AdvertisesImportFieldImpl#getAddsToState <em>Adds To State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AdvertisesImportFieldImpl#isAddsToImportState <em>Adds To Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AdvertisesImportFieldImpl#getStandardName <em>Standard Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvertisesImportFieldImpl extends EObjectImpl implements AdvertisesImportField {
	/**
	 * The default value of the '{@link #getAddsToState() <em>Adds To State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddsToState()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDS_TO_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddsToState() <em>Adds To State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddsToState()
	 * @generated
	 * @ordered
	 */
	protected String addsToState = ADDS_TO_STATE_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #isAddsToImportState() <em>Adds To Import State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddsToImportState()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ADDS_TO_IMPORT_STATE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE).getSettingDelegate();

	/**
	 * The default value of the '{@link #getStandardName() <em>Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardName()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardName() <em>Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardName()
	 * @generated
	 * @ordered
	 */
	protected String standardName = STANDARD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvertisesImportFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.ADVERTISES_IMPORT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelImplementsInitP1 getParent() {
		if (eContainerFeatureID() != NUOPCPackage.ADVERTISES_IMPORT_FIELD__PARENT) return null;
		return (ModelImplementsInitP1)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ModelImplementsInitP1 newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.ADVERTISES_IMPORT_FIELD__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ModelImplementsInitP1 newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.ADVERTISES_IMPORT_FIELD__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD, ModelImplementsInitP1.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.ADVERTISES_IMPORT_FIELD__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddsToState() {
		return addsToState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddsToState(String newAddsToState) {
		String oldAddsToState = addsToState;
		addsToState = newAddsToState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE, oldAddsToState, addsToState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAddsToImportState() {
		return (Boolean)ADDS_TO_IMPORT_STATE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddsToImportState(boolean newAddsToImportState) {
		ADDS_TO_IMPORT_STATE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newAddsToImportState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStandardName() {
		return standardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardName(String newStandardName) {
		String oldStandardName = standardName;
		standardName = newStandardName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.ADVERTISES_IMPORT_FIELD__STANDARD_NAME, oldStandardName, standardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ModelImplementsInitP1)otherEnd, msgs);
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
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__PARENT:
				return basicSetParent(null, msgs);
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
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD, ModelImplementsInitP1.class, msgs);
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
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__PARENT:
				return getParent();
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE:
				return getAddsToState();
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE:
				return isAddsToImportState();
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__STANDARD_NAME:
				return getStandardName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__PARENT:
				setParent((ModelImplementsInitP1)newValue);
				return;
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE:
				setAddsToState((String)newValue);
				return;
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE:
				setAddsToImportState((Boolean)newValue);
				return;
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__STANDARD_NAME:
				setStandardName((String)newValue);
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
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__PARENT:
				setParent((ModelImplementsInitP1)null);
				return;
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE:
				setAddsToState(ADDS_TO_STATE_EDEFAULT);
				return;
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE:
				ADDS_TO_IMPORT_STATE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__STANDARD_NAME:
				setStandardName(STANDARD_NAME_EDEFAULT);
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
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__PARENT:
				return getParent() != null;
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE:
				return ADDS_TO_STATE_EDEFAULT == null ? addsToState != null : !ADDS_TO_STATE_EDEFAULT.equals(addsToState);
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE:
				return ADDS_TO_IMPORT_STATE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD__STANDARD_NAME:
				return STANDARD_NAME_EDEFAULT == null ? standardName != null : !STANDARD_NAME_EDEFAULT.equals(standardName);
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
		result.append(" (addsToState: ");
		result.append(addsToState);
		result.append(", standardName: ");
		result.append(standardName);
		result.append(')');
		return result.toString();
	}

} //AdvertisesImportFieldImpl
