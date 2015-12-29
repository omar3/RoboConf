/**
 */
package com.roboConf.roboConfdsl.impl;

import com.roboConf.roboConfdsl.Extends;
import com.roboConf.roboConfdsl.Propertie;
import com.roboConf.roboConfdsl.RoboConfdslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extends</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.impl.ExtendsImpl#getExt <em>Ext</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.impl.ExtendsImpl#getPropertie <em>Propertie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendsImpl extends PropertieImpl implements Extends
{
  /**
   * The default value of the '{@link #getExt() <em>Ext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExt()
   * @generated
   * @ordered
   */
  protected static final String EXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExt() <em>Ext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExt()
   * @generated
   * @ordered
   */
  protected String ext = EXT_EDEFAULT;

  /**
   * The cached value of the '{@link #getPropertie() <em>Propertie</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertie()
   * @generated
   * @ordered
   */
  protected Propertie propertie;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendsImpl()
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
    return RoboConfdslPackage.Literals.EXTENDS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExt()
  {
    return ext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExt(String newExt)
  {
    String oldExt = ext;
    ext = newExt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.EXTENDS__EXT, oldExt, ext));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Propertie getPropertie()
  {
    if (propertie != null && propertie.eIsProxy())
    {
      InternalEObject oldPropertie = (InternalEObject)propertie;
      propertie = (Propertie)eResolveProxy(oldPropertie);
      if (propertie != oldPropertie)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoboConfdslPackage.EXTENDS__PROPERTIE, oldPropertie, propertie));
      }
    }
    return propertie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Propertie basicGetPropertie()
  {
    return propertie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertie(Propertie newPropertie)
  {
    Propertie oldPropertie = propertie;
    propertie = newPropertie;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.EXTENDS__PROPERTIE, oldPropertie, propertie));
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
      case RoboConfdslPackage.EXTENDS__EXT:
        return getExt();
      case RoboConfdslPackage.EXTENDS__PROPERTIE:
        if (resolve) return getPropertie();
        return basicGetPropertie();
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
      case RoboConfdslPackage.EXTENDS__EXT:
        setExt((String)newValue);
        return;
      case RoboConfdslPackage.EXTENDS__PROPERTIE:
        setPropertie((Propertie)newValue);
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
      case RoboConfdslPackage.EXTENDS__EXT:
        setExt(EXT_EDEFAULT);
        return;
      case RoboConfdslPackage.EXTENDS__PROPERTIE:
        setPropertie((Propertie)null);
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
      case RoboConfdslPackage.EXTENDS__EXT:
        return EXT_EDEFAULT == null ? ext != null : !EXT_EDEFAULT.equals(ext);
      case RoboConfdslPackage.EXTENDS__PROPERTIE:
        return propertie != null;
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
    result.append(" (ext: ");
    result.append(ext);
    result.append(')');
    return result.toString();
  }

} //ExtendsImpl
