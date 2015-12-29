/**
 */
package com.roboConf.roboConfdsl.impl;

import com.roboConf.roboConfdsl.Name;
import com.roboConf.roboConfdsl.RoboConfdslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.impl.NameImpl#getNameN <em>Name N</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameImpl extends MinimalEObjectImpl.Container implements Name
{
  /**
   * The default value of the '{@link #getNameN() <em>Name N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameN()
   * @generated
   * @ordered
   */
  protected static final String NAME_N_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameN() <em>Name N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameN()
   * @generated
   * @ordered
   */
  protected String nameN = NAME_N_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RoboConfdslPackage.Literals.NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameN()
  {
    return nameN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameN(String newNameN)
  {
    String oldNameN = nameN;
    nameN = newNameN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.NAME__NAME_N, oldNameN, nameN));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RoboConfdslPackage.NAME__NAME_N:
        return getNameN();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RoboConfdslPackage.NAME__NAME_N:
        setNameN((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RoboConfdslPackage.NAME__NAME_N:
        setNameN(NAME_N_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RoboConfdslPackage.NAME__NAME_N:
        return NAME_N_EDEFAULT == null ? nameN != null : !NAME_N_EDEFAULT.equals(nameN);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nameN: ");
    result.append(nameN);
    result.append(')');
    return result.toString();
  }

} //NameImpl
