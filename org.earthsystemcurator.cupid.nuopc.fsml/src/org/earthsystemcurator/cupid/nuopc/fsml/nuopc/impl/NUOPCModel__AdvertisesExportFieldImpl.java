/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1;
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
 * An implementation of the model object '<em><b>Model Advertises Export Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__AdvertisesExportFieldImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__AdvertisesExportFieldImpl#getRc <em>Rc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__AdvertisesExportFieldImpl#getAddsToState <em>Adds To State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__AdvertisesExportFieldImpl#isAddsToExportState <em>Adds To Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__AdvertisesExportFieldImpl#getStandardName <em>Standard Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCModel__AdvertisesExportFieldImpl extends EObjectImpl implements NUOPCModel__AdvertisesExportField {
	/**
	 * The default value of the '{@link #getRc() <em>Rc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRc()
	 * @generated
	 * @ordered
	 */
	protected static final String RC_EDEFAULT = "rc";

	/**
	 * The cached value of the '{@link #getRc() <em>Rc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRc()
	 * @generated
	 * @ordered
	 */
	protected String rc = RC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddsToState() <em>Adds To State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddsToState()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDS_TO_STATE_EDEFAULT = "exportState";

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
	 * The cached setting delegate for the '{@link #isAddsToExportState() <em>Adds To Export State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddsToExportState()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ADDS_TO_EXPORT_STATE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE).getSettingDelegate();

	/**
	 * The default value of the '{@link #getStandardName() <em>Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardName()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_NAME_EDEFAULT = "\"Standard_Name\"";

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
	protected NUOPCModel__AdvertisesExportFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__ImplementsInitP1 getParent() {
		if (eContainerFeatureID() != NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT) return null;
		return (NUOPCModel__ImplementsInitP1)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCModel__ImplementsInitP1 newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCModel__ImplementsInitP1 newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD, NUOPCModel__ImplementsInitP1.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRc() {
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRc(String newRc) {
		String oldRc = rc;
		rc = newRc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__RC, oldRc, rc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE, oldAddsToState, addsToState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAddsToExportState() {
		return (Boolean)ADDS_TO_EXPORT_STATE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddsToExportState(boolean newAddsToExportState) {
		ADDS_TO_EXPORT_STATE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newAddsToExportState);
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__STANDARD_NAME, oldStandardName, standardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCModel__ImplementsInitP1)otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT:
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
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD, NUOPCModel__ImplementsInitP1.class, msgs);
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
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT:
				return getParent();
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__RC:
				return getRc();
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE:
				return getAddsToState();
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE:
				return isAddsToExportState();
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__STANDARD_NAME:
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
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT:
				setParent((NUOPCModel__ImplementsInitP1)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__RC:
				setRc((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE:
				setAddsToState((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE:
				setAddsToExportState((Boolean)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__STANDARD_NAME:
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
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT:
				setParent((NUOPCModel__ImplementsInitP1)null);
				return;
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__RC:
				setRc(RC_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE:
				setAddsToState(ADDS_TO_STATE_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE:
				ADDS_TO_EXPORT_STATE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__STANDARD_NAME:
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
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT:
				return getParent() != null;
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__RC:
				return RC_EDEFAULT == null ? rc != null : !RC_EDEFAULT.equals(rc);
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE:
				return ADDS_TO_STATE_EDEFAULT == null ? addsToState != null : !ADDS_TO_STATE_EDEFAULT.equals(addsToState);
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE:
				return ADDS_TO_EXPORT_STATE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__STANDARD_NAME:
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
		result.append(" (rc: ");
		result.append(rc);
		result.append(", addsToState: ");
		result.append(addsToState);
		result.append(", standardName: ");
		result.append(standardName);
		result.append(')');
		return result.toString();
	}

} //NUOPCModel__AdvertisesExportFieldImpl
