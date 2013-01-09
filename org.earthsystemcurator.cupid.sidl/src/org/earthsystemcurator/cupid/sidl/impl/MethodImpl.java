/**
 */
package org.earthsystemcurator.cupid.sidl.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.sidl.Argument;
import org.earthsystemcurator.cupid.sidl.Method;
import org.earthsystemcurator.cupid.sidl.SIDLPackage;
import org.earthsystemcurator.cupid.sidl.SIDLType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.impl.MethodImpl#getShortname <em>Shortname</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.impl.MethodImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.impl.MethodImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.impl.MethodImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends EObjectImpl implements Method {
	/**
	 * The default value of the '{@link #getShortname() <em>Shortname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortname()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortname() <em>Shortname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortname()
	 * @generated
	 * @ordered
	 */
	protected String shortname = SHORTNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SIDLType type;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SIDLPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortname() {
		return shortname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortname(String newShortname) {
		String oldShortname = shortname;
		shortname = newShortname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SIDLPackage.METHOD__SHORTNAME, oldShortname, shortname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIDLType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(SIDLType newType, NotificationChain msgs) {
		SIDLType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SIDLPackage.METHOD__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SIDLType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SIDLPackage.METHOD__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SIDLPackage.METHOD__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SIDLPackage.METHOD__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentWithInverseEList<Argument>(Argument.class, this, SIDLPackage.METHOD__ARGUMENT, SIDLPackage.ARGUMENT__METHOD);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.earthsystemcurator.cupid.sidl.Class getClass_() {
		if (eContainerFeatureID() != SIDLPackage.METHOD__CLASS) return null;
		return (org.earthsystemcurator.cupid.sidl.Class)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(org.earthsystemcurator.cupid.sidl.Class newClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClass, SIDLPackage.METHOD__CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(org.earthsystemcurator.cupid.sidl.Class newClass) {
		if (newClass != eInternalContainer() || (eContainerFeatureID() != SIDLPackage.METHOD__CLASS && newClass != null)) {
			if (EcoreUtil.isAncestor(this, newClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, SIDLPackage.CLASS__METHOD, org.earthsystemcurator.cupid.sidl.Class.class, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SIDLPackage.METHOD__CLASS, newClass, newClass));
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
			case SIDLPackage.METHOD__ARGUMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArgument()).basicAdd(otherEnd, msgs);
			case SIDLPackage.METHOD__CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClass((org.earthsystemcurator.cupid.sidl.Class)otherEnd, msgs);
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
			case SIDLPackage.METHOD__TYPE:
				return basicSetType(null, msgs);
			case SIDLPackage.METHOD__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
			case SIDLPackage.METHOD__CLASS:
				return basicSetClass(null, msgs);
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
			case SIDLPackage.METHOD__CLASS:
				return eInternalContainer().eInverseRemove(this, SIDLPackage.CLASS__METHOD, org.earthsystemcurator.cupid.sidl.Class.class, msgs);
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
			case SIDLPackage.METHOD__SHORTNAME:
				return getShortname();
			case SIDLPackage.METHOD__TYPE:
				return getType();
			case SIDLPackage.METHOD__ARGUMENT:
				return getArgument();
			case SIDLPackage.METHOD__CLASS:
				return getClass_();
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
			case SIDLPackage.METHOD__SHORTNAME:
				setShortname((String)newValue);
				return;
			case SIDLPackage.METHOD__TYPE:
				setType((SIDLType)newValue);
				return;
			case SIDLPackage.METHOD__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends Argument>)newValue);
				return;
			case SIDLPackage.METHOD__CLASS:
				setClass((org.earthsystemcurator.cupid.sidl.Class)newValue);
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
			case SIDLPackage.METHOD__SHORTNAME:
				setShortname(SHORTNAME_EDEFAULT);
				return;
			case SIDLPackage.METHOD__TYPE:
				setType((SIDLType)null);
				return;
			case SIDLPackage.METHOD__ARGUMENT:
				getArgument().clear();
				return;
			case SIDLPackage.METHOD__CLASS:
				setClass((org.earthsystemcurator.cupid.sidl.Class)null);
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
			case SIDLPackage.METHOD__SHORTNAME:
				return SHORTNAME_EDEFAULT == null ? shortname != null : !SHORTNAME_EDEFAULT.equals(shortname);
			case SIDLPackage.METHOD__TYPE:
				return type != null;
			case SIDLPackage.METHOD__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case SIDLPackage.METHOD__CLASS:
				return getClass_() != null;
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
		result.append(" (shortname: ");
		result.append(shortname);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
