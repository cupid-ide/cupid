/**
 */
package org.earthsystemcurator.cupid.fm.cplfm.impl;

import java.util.Collection;
import org.earthsystemcurator.cupid.fm.cplfm.Connector;
import org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel;
import org.earthsystemcurator.cupid.fm.cplfm.Coupler;
import org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage;

import org.earthsystemcurator.cupid.fm.cplfm.Transformation;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coupler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.CouplerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.CouplerImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.CouplerImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.CouplerImpl#getConstituentModel <em>Constituent Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CouplerImpl extends EObjectImpl implements Coupler {
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
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector connector;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Transformation transformation;
	/**
	 * The cached value of the '{@link #getConstituentModel() <em>Constituent Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstituentModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstituentModel> constituentModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CouplerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CplfmPackage.Literals.COUPLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CplfmPackage.COUPLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		if (connector != null && connector.eIsProxy()) {
			InternalEObject oldConnector = (InternalEObject)connector;
			connector = (Connector)eResolveProxy(oldConnector);
			if (connector != oldConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CplfmPackage.COUPLER__CONNECTOR, oldConnector, connector));
			}
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		Connector oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CplfmPackage.COUPLER__CONNECTOR, oldConnector, connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject)transformation;
			transformation = (Transformation)eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CplfmPackage.COUPLER__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Transformation newTransformation) {
		Transformation oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CplfmPackage.COUPLER__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstituentModel> getConstituentModel() {
		if (constituentModel == null) {
			constituentModel = new EObjectResolvingEList<ConstituentModel>(ConstituentModel.class, this, CplfmPackage.COUPLER__CONSTITUENT_MODEL);
		}
		return constituentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CplfmPackage.COUPLER__NAME:
				return getName();
			case CplfmPackage.COUPLER__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case CplfmPackage.COUPLER__TRANSFORMATION:
				if (resolve) return getTransformation();
				return basicGetTransformation();
			case CplfmPackage.COUPLER__CONSTITUENT_MODEL:
				return getConstituentModel();
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
			case CplfmPackage.COUPLER__NAME:
				setName((String)newValue);
				return;
			case CplfmPackage.COUPLER__CONNECTOR:
				setConnector((Connector)newValue);
				return;
			case CplfmPackage.COUPLER__TRANSFORMATION:
				setTransformation((Transformation)newValue);
				return;
			case CplfmPackage.COUPLER__CONSTITUENT_MODEL:
				getConstituentModel().clear();
				getConstituentModel().addAll((Collection<? extends ConstituentModel>)newValue);
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
			case CplfmPackage.COUPLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CplfmPackage.COUPLER__CONNECTOR:
				setConnector((Connector)null);
				return;
			case CplfmPackage.COUPLER__TRANSFORMATION:
				setTransformation((Transformation)null);
				return;
			case CplfmPackage.COUPLER__CONSTITUENT_MODEL:
				getConstituentModel().clear();
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
			case CplfmPackage.COUPLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CplfmPackage.COUPLER__CONNECTOR:
				return connector != null;
			case CplfmPackage.COUPLER__TRANSFORMATION:
				return transformation != null;
			case CplfmPackage.COUPLER__CONSTITUENT_MODEL:
				return constituentModel != null && !constituentModel.isEmpty();
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

} //CouplerImpl
