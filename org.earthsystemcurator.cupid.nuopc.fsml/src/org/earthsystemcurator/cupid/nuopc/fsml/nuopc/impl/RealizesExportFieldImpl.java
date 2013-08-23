/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField;

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
 * An implementation of the model object '<em><b>Realizes Export Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.RealizesExportFieldImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.RealizesExportFieldImpl#getRealizedInState <em>Realized In State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.RealizesExportFieldImpl#isRealizedInExportState <em>Realized In Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.RealizesExportFieldImpl#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealizesExportFieldImpl extends EObjectImpl implements RealizesExportField {
	/**
	 * The default value of the '{@link #getRealizedInState() <em>Realized In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedInState()
	 * @generated
	 * @ordered
	 */
	protected static final String REALIZED_IN_STATE_EDEFAULT = null;

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
	 * The cached setting delegate for the '{@link #isRealizedInExportState() <em>Realized In Export State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRealizedInExportState()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REALIZED_IN_EXPORT_STATE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE).getSettingDelegate();

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
	protected RealizesExportFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.REALIZES_EXPORT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelImplementsInitP2 getParent() {
		if (eContainerFeatureID() != NUOPCPackage.REALIZES_EXPORT_FIELD__PARENT) return null;
		return (ModelImplementsInitP2)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ModelImplementsInitP2 newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.REALIZES_EXPORT_FIELD__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ModelImplementsInitP2 newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.REALIZES_EXPORT_FIELD__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD, ModelImplementsInitP2.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.REALIZES_EXPORT_FIELD__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.REALIZES_EXPORT_FIELD__REALIZED_IN_STATE, oldRealizedInState, realizedInState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.REALIZES_EXPORT_FIELD__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.REALIZES_EXPORT_FIELD__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ModelImplementsInitP2)otherEnd, msgs);
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
			case NUOPCPackage.REALIZES_EXPORT_FIELD__PARENT:
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
			case NUOPCPackage.REALIZES_EXPORT_FIELD__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD, ModelImplementsInitP2.class, msgs);
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
			case NUOPCPackage.REALIZES_EXPORT_FIELD__PARENT:
				return getParent();
			case NUOPCPackage.REALIZES_EXPORT_FIELD__REALIZED_IN_STATE:
				return getRealizedInState();
			case NUOPCPackage.REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE:
				return isRealizedInExportState();
			case NUOPCPackage.REALIZES_EXPORT_FIELD__FIELD:
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
			case NUOPCPackage.REALIZES_EXPORT_FIELD__PARENT:
				setParent((ModelImplementsInitP2)newValue);
				return;
			case NUOPCPackage.REALIZES_EXPORT_FIELD__REALIZED_IN_STATE:
				setRealizedInState((String)newValue);
				return;
			case NUOPCPackage.REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE:
				setRealizedInExportState((Boolean)newValue);
				return;
			case NUOPCPackage.REALIZES_EXPORT_FIELD__FIELD:
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
			case NUOPCPackage.REALIZES_EXPORT_FIELD__PARENT:
				setParent((ModelImplementsInitP2)null);
				return;
			case NUOPCPackage.REALIZES_EXPORT_FIELD__REALIZED_IN_STATE:
				setRealizedInState(REALIZED_IN_STATE_EDEFAULT);
				return;
			case NUOPCPackage.REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE:
				REALIZED_IN_EXPORT_STATE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case NUOPCPackage.REALIZES_EXPORT_FIELD__FIELD:
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
			case NUOPCPackage.REALIZES_EXPORT_FIELD__PARENT:
				return getParent() != null;
			case NUOPCPackage.REALIZES_EXPORT_FIELD__REALIZED_IN_STATE:
				return REALIZED_IN_STATE_EDEFAULT == null ? realizedInState != null : !REALIZED_IN_STATE_EDEFAULT.equals(realizedInState);
			case NUOPCPackage.REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE:
				return REALIZED_IN_EXPORT_STATE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case NUOPCPackage.REALIZES_EXPORT_FIELD__FIELD:
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
		result.append(", field: ");
		result.append(field);
		result.append(')');
		return result.toString();
	}

} //RealizesExportFieldImpl
