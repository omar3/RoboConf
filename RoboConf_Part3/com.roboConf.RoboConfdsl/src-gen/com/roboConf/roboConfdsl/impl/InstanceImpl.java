/**
 */
package com.roboConf.roboConfdsl.impl;

import com.roboConf.roboConfdsl.Component;
import com.roboConf.roboConfdsl.Instance;
import com.roboConf.roboConfdsl.InstancePropertie;
import com.roboConf.roboConfdsl.RoboConfdslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.impl.InstanceImpl#getNstanceName <em>Nstance Name</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.impl.InstanceImpl#getInstanceProperties <em>Instance Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceImpl extends FeatureImpl implements Instance
{
  /**
   * The cached value of the '{@link #getNstanceName() <em>Nstance Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNstanceName()
   * @generated
   * @ordered
   */
  protected Component nstanceName;

  /**
   * The cached value of the '{@link #getInstanceProperties() <em>Instance Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstanceProperties()
   * @generated
   * @ordered
   */
  protected EList<InstancePropertie> instanceProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanceImpl()
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
    return RoboConfdslPackage.Literals.INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getNstanceName()
  {
    if (nstanceName != null && nstanceName.eIsProxy())
    {
      InternalEObject oldNstanceName = (InternalEObject)nstanceName;
      nstanceName = (Component)eResolveProxy(oldNstanceName);
      if (nstanceName != oldNstanceName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoboConfdslPackage.INSTANCE__NSTANCE_NAME, oldNstanceName, nstanceName));
      }
    }
    return nstanceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetNstanceName()
  {
    return nstanceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNstanceName(Component newNstanceName)
  {
    Component oldNstanceName = nstanceName;
    nstanceName = newNstanceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.INSTANCE__NSTANCE_NAME, oldNstanceName, nstanceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InstancePropertie> getInstanceProperties()
  {
    if (instanceProperties == null)
    {
      instanceProperties = new EObjectContainmentEList<InstancePropertie>(InstancePropertie.class, this, RoboConfdslPackage.INSTANCE__INSTANCE_PROPERTIES);
    }
    return instanceProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RoboConfdslPackage.INSTANCE__INSTANCE_PROPERTIES:
        return ((InternalEList<?>)getInstanceProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RoboConfdslPackage.INSTANCE__NSTANCE_NAME:
        if (resolve) return getNstanceName();
        return basicGetNstanceName();
      case RoboConfdslPackage.INSTANCE__INSTANCE_PROPERTIES:
        return getInstanceProperties();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RoboConfdslPackage.INSTANCE__NSTANCE_NAME:
        setNstanceName((Component)newValue);
        return;
      case RoboConfdslPackage.INSTANCE__INSTANCE_PROPERTIES:
        getInstanceProperties().clear();
        getInstanceProperties().addAll((Collection<? extends InstancePropertie>)newValue);
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
      case RoboConfdslPackage.INSTANCE__NSTANCE_NAME:
        setNstanceName((Component)null);
        return;
      case RoboConfdslPackage.INSTANCE__INSTANCE_PROPERTIES:
        getInstanceProperties().clear();
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
      case RoboConfdslPackage.INSTANCE__NSTANCE_NAME:
        return nstanceName != null;
      case RoboConfdslPackage.INSTANCE__INSTANCE_PROPERTIES:
        return instanceProperties != null && !instanceProperties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InstanceImpl
