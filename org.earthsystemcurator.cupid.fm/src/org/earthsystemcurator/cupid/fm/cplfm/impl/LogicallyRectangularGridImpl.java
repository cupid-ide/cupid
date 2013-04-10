/**
 */
package org.earthsystemcurator.cupid.fm.cplfm.impl;

import org.earthsystemcurator.cupid.fm.cplfm.Coordinates;
import org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage;
import org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logically Rectangular Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.LogicallyRectangularGridImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.LogicallyRectangularGridImpl#getMinX <em>Min X</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.LogicallyRectangularGridImpl#getMaxX <em>Max X</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.LogicallyRectangularGridImpl#getMinY <em>Min Y</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.LogicallyRectangularGridImpl#getMaxY <em>Max Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicallyRectangularGridImpl extends StructuredGridImpl implements LogicallyRectangularGrid {
	/**
	 * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected Coordinates coordinates;

	/**
	 * The default value of the '{@link #getMinX() <em>Min X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinX()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinX() <em>Min X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinX()
	 * @generated
	 * @ordered
	 */
	protected int minX = MIN_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxX() <em>Max X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxX()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxX() <em>Max X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxX()
	 * @generated
	 * @ordered
	 */
	protected int maxX = MAX_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinY() <em>Min Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinY()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinY() <em>Min Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinY()
	 * @generated
	 * @ordered
	 */
	protected int minY = MIN_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxY() <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxY()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxY() <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxY()
	 * @generated
	 * @ordered
	 */
	protected int maxY = MAX_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicallyRectangularGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CplfmPackage.Literals.LOGICALLY_RECTANGULAR_GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinates getCoordinates() {
		if (coordinates != null && coordinates.eIsProxy()) {
			InternalEObject oldCoordinates = (InternalEObject)coordinates;
			coordinates = (Coordinates)eResolveProxy(oldCoordinates);
			if (coordinates != oldCoordinates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CplfmPackage.LOGICALLY_RECTANGULAR_GRID__COORDINATES, oldCoordinates, coordinates));
			}
		}
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinates basicGetCoordinates() {
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinates(Coordinates newCoordinates) {
		Coordinates oldCoordinates = coordinates;
		coordinates = newCoordinates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CplfmPackage.LOGICALLY_RECTANGULAR_GRID__COORDINATES, oldCoordinates, coordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinX() {
		return minX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinX(int newMinX) {
		int oldMinX = minX;
		minX = newMinX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MIN_X, oldMinX, minX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxX() {
		return maxX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxX(int newMaxX) {
		int oldMaxX = maxX;
		maxX = newMaxX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MAX_X, oldMaxX, maxX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinY() {
		return minY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinY(int newMinY) {
		int oldMinY = minY;
		minY = newMinY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MIN_Y, oldMinY, minY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxY() {
		return maxY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxY(int newMaxY) {
		int oldMaxY = maxY;
		maxY = newMaxY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MAX_Y, oldMaxY, maxY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__COORDINATES:
				if (resolve) return getCoordinates();
				return basicGetCoordinates();
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MIN_X:
				return getMinX();
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MAX_X:
				return getMaxX();
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MIN_Y:
				return getMinY();
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MAX_Y:
				return getMaxY();
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
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__COORDINATES:
				setCoordinates((Coordinates)newValue);
				return;
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MIN_X:
				setMinX((Integer)newValue);
				return;
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MAX_X:
				setMaxX((Integer)newValue);
				return;
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MIN_Y:
				setMinY((Integer)newValue);
				return;
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MAX_Y:
				setMaxY((Integer)newValue);
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
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__COORDINATES:
				setCoordinates((Coordinates)null);
				return;
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MIN_X:
				setMinX(MIN_X_EDEFAULT);
				return;
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MAX_X:
				setMaxX(MAX_X_EDEFAULT);
				return;
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MIN_Y:
				setMinY(MIN_Y_EDEFAULT);
				return;
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MAX_Y:
				setMaxY(MAX_Y_EDEFAULT);
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
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__COORDINATES:
				return coordinates != null;
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MIN_X:
				return minX != MIN_X_EDEFAULT;
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MAX_X:
				return maxX != MAX_X_EDEFAULT;
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MIN_Y:
				return minY != MIN_Y_EDEFAULT;
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID__MAX_Y:
				return maxY != MAX_Y_EDEFAULT;
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
		result.append(" (minX: ");
		result.append(minX);
		result.append(", maxX: ");
		result.append(maxX);
		result.append(", minY: ");
		result.append(minY);
		result.append(", maxY: ");
		result.append(maxY);
		result.append(')');
		return result.toString();
	}

} //LogicallyRectangularGridImpl
