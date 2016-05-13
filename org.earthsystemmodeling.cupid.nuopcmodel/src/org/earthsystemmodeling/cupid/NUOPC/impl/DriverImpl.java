/**
 */
package org.earthsystemmodeling.cupid.NUOPC.impl;

import java.util.Collection;

import org.earthsystemmodeling.cupid.NUOPC.Advance;
import org.earthsystemmodeling.cupid.NUOPC.Component;
import org.earthsystemmodeling.cupid.NUOPC.Driver;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.DriverImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.DriverImpl#getRunSequence <em>Run Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriverImpl extends ComponentImpl implements Driver {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> children;

	/**
	 * The cached value of the '{@link #getRunSequence() <em>Run Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Advance> runSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.DRIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Component>(Component.class, this, NUOPCPackage.DRIVER__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Advance> getRunSequence() {
		if (runSequence == null) {
			runSequence = new EObjectResolvingEList<Advance>(Advance.class, this, NUOPCPackage.DRIVER__RUN_SEQUENCE);
		}
		return runSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.DRIVER__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case NUOPCPackage.DRIVER__CHILDREN:
				return getChildren();
			case NUOPCPackage.DRIVER__RUN_SEQUENCE:
				return getRunSequence();
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
			case NUOPCPackage.DRIVER__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Component>)newValue);
				return;
			case NUOPCPackage.DRIVER__RUN_SEQUENCE:
				getRunSequence().clear();
				getRunSequence().addAll((Collection<? extends Advance>)newValue);
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
			case NUOPCPackage.DRIVER__CHILDREN:
				getChildren().clear();
				return;
			case NUOPCPackage.DRIVER__RUN_SEQUENCE:
				getRunSequence().clear();
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
			case NUOPCPackage.DRIVER__CHILDREN:
				return children != null && !children.isEmpty();
			case NUOPCPackage.DRIVER__RUN_SEQUENCE:
				return runSequence != null && !runSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DriverImpl
