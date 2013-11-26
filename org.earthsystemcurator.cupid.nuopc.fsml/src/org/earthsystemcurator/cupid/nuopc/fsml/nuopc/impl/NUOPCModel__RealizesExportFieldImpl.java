/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField;
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
 * An implementation of the model object '<em><b>Model Realizes Export Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__RealizesExportFieldImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__RealizesExportFieldImpl#getRealizedInState <em>Realized In State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__RealizesExportFieldImpl#getRc <em>Rc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__RealizesExportFieldImpl#isRealizedInExportState <em>Realized In Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__RealizesExportFieldImpl#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCModel__RealizesExportFieldImpl extends EObjectImpl implements NUOPCModel__RealizesExportField {
	/**
	 * The default value of the '{@link #getRealizedInState() <em>Realized In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedInState()
	 * @generated
	 * @ordered
	 */
	protected static final String REALIZED_IN_STATE_EDEFAULT = "exportState";

	/**
	 * The cached value of the '{@link #getRealizedInState() <em>Realized In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedInState()
	 * @generated
	 * @ordered
	 */
	protected String realizedInState = REALIZED_IN_STATE_EDEFAULT;

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
	 * The cached setting delegate for the '{@link #isRealizedInExportState() <em>Realized In Export State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRealizedInExportState()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REALIZED_IN_EXPORT_STATE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE).getSettingDelegate();

	/**
	 * The default value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected String field = FIELD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCModel__RealizesExportFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_MODEL_REALIZES_EXPORT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__ImplementsInitP2 getParent() {
		if (eContainerFeatureID() != NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT) return null;
		return (NUOPCModel__ImplementsInitP2)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCModel__ImplementsInitP2 newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCModel__ImplementsInitP2 newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD, NUOPCModel__ImplementsInitP2.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRealizedInState() {
		return realizedInState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizedInState(String newRealizedInState) {
		String oldRealizedInState = realizedInState;
		realizedInState = newRealizedInState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_STATE, oldRealizedInState, realizedInState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__RC, oldRc, rc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRealizedInExportState() {
		return (Boolean)REALIZED_IN_EXPORT_STATE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizedInExportState(boolean newRealizedInExportState) {
		REALIZED_IN_EXPORT_STATE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newRealizedInExportState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(String newField) {
		String oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCModel__ImplementsInitP2)otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT:
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
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD, NUOPCModel__ImplementsInitP2.class, msgs);
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
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT:
				return getParent();
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_STATE:
				return getRealizedInState();
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__RC:
				return getRc();
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE:
				return isRealizedInExportState();
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__FIELD:
				return getField();
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
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT:
				setParent((NUOPCModel__ImplementsInitP2)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_STATE:
				setRealizedInState((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__RC:
				setRc((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE:
				setRealizedInExportState((Boolean)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__FIELD:
				setField((String)newValue);
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
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT:
				setParent((NUOPCModel__ImplementsInitP2)null);
				return;
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_STATE:
				setRealizedInState(REALIZED_IN_STATE_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__RC:
				setRc(RC_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE:
				REALIZED_IN_EXPORT_STATE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__FIELD:
				setField(FIELD_EDEFAULT);
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
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT:
				return getParent() != null;
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_STATE:
				return REALIZED_IN_STATE_EDEFAULT == null ? realizedInState != null : !REALIZED_IN_STATE_EDEFAULT.equals(realizedInState);
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__RC:
				return RC_EDEFAULT == null ? rc != null : !RC_EDEFAULT.equals(rc);
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE:
				return REALIZED_IN_EXPORT_STATE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD__FIELD:
				return FIELD_EDEFAULT == null ? field != null : !FIELD_EDEFAULT.equals(field);
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
		result.append(" (realizedInState: ");
		result.append(realizedInState);
		result.append(", rc: ");
		result.append(rc);
		result.append(", field: ");
		result.append(field);
		result.append(')');
		return result.toString();
	}

} //NUOPCModel__RealizesExportFieldImpl
