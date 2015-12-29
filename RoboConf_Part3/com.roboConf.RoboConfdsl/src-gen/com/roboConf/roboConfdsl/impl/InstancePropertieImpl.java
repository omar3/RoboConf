/**
 */
package com.roboConf.roboConfdsl.impl;

import com.roboConf.roboConfdsl.Count;
import com.roboConf.roboConfdsl.InstancePropertie;
import com.roboConf.roboConfdsl.Instances;
import com.roboConf.roboConfdsl.Name;
import com.roboConf.roboConfdsl.RoboConfdslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Propertie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.impl.InstancePropertieImpl#getNameInst <em>Name Inst</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.impl.InstancePropertieImpl#getCount <em>Count</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.impl.InstancePropertieImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstancePropertieImpl extends MinimalEObjectImpl.Container implements InstancePropertie
{
  /**
   * The cached value of the '{@link #getNameInst() <em>Name Inst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameInst()
   * @generated
   * @ordered
   */
  protected Name nameInst;

  /**
   * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected Count count;

  /**
   * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstance()
   * @generated
   * @ordered
   */
  protected Instances instance;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstancePropertieImpl()
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
    return RoboConfdslPackage.Literals.INSTANCE_PROPERTIE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getNameInst()
  {
    return nameInst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameInst(Name newNameInst, NotificationChain msgs)
  {
    Name oldNameInst = nameInst;
    nameInst = newNameInst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.INSTANCE_PROPERTIE__NAME_INST, oldNameInst, newNameInst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameInst(Name newNameInst)
  {
    if (newNameInst != nameInst)
    {
      NotificationChain msgs = null;
      if (nameInst != null)
        msgs = ((InternalEObject)nameInst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboConfdslPackage.INSTANCE_PROPERTIE__NAME_INST, null, msgs);
      if (newNameInst != null)
        msgs = ((InternalEObject)newNameInst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboConfdslPackage.INSTANCE_PROPERTIE__NAME_INST, null, msgs);
      msgs = basicSetNameInst(newNameInst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.INSTANCE_PROPERTIE__NAME_INST, newNameInst, newNameInst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Count getCount()
  {
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCount(Count newCount, NotificationChain msgs)
  {
    Count oldCount = count;
    count = newCount;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.INSTANCE_PROPERTIE__COUNT, oldCount, newCount);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCount(Count newCount)
  {
    if (newCount != count)
    {
      NotificationChain msgs = null;
      if (count != null)
        msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboConfdslPackage.INSTANCE_PROPERTIE__COUNT, null, msgs);
      if (newCount != null)
        msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboConfdslPackage.INSTANCE_PROPERTIE__COUNT, null, msgs);
      msgs = basicSetCount(newCount, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.INSTANCE_PROPERTIE__COUNT, newCount, newCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instances getInstance()
  {
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstance(Instances newInstance, NotificationChain msgs)
  {
    Instances oldInstance = instance;
    instance = newInstance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.INSTANCE_PROPERTIE__INSTANCE, oldInstance, newInstance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstance(Instances newInstance)
  {
    if (newInstance != instance)
    {
      NotificationChain msgs = null;
      if (instance != null)
        msgs = ((InternalEObject)instance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboConfdslPackage.INSTANCE_PROPERTIE__INSTANCE, null, msgs);
      if (newInstance != null)
        msgs = ((InternalEObject)newInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboConfdslPackage.INSTANCE_PROPERTIE__INSTANCE, null, msgs);
      msgs = basicSetInstance(newInstance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.INSTANCE_PROPERTIE__INSTANCE, newInstance, newInstance));
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
      case RoboConfdslPackage.INSTANCE_PROPERTIE__NAME_INST:
        return basicSetNameInst(null, msgs);
      case RoboConfdslPackage.INSTANCE_PROPERTIE__COUNT:
        return basicSetCount(null, msgs);
      case RoboConfdslPackage.INSTANCE_PROPERTIE__INSTANCE:
        return basicSetInstance(null, msgs);
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
      case RoboConfdslPackage.INSTANCE_PROPERTIE__NAME_INST:
        return getNameInst();
      case RoboConfdslPackage.INSTANCE_PROPERTIE__COUNT:
        return getCount();
      case RoboConfdslPackage.INSTANCE_PROPERTIE__INSTANCE:
        return getInstance();
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
      case RoboConfdslPackage.INSTANCE_PROPERTIE__NAME_INST:
        setNameInst((Name)newValue);
        return;
      case RoboConfdslPackage.INSTANCE_PROPERTIE__COUNT:
        setCount((Count)newValue);
        return;
      case RoboConfdslPackage.INSTANCE_PROPERTIE__INSTANCE:
        setInstance((Instances)newValue);
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
      case RoboConfdslPackage.INSTANCE_PROPERTIE__NAME_INST:
        setNameInst((Name)null);
        return;
      case RoboConfdslPackage.INSTANCE_PROPERTIE__COUNT:
        setCount((Count)null);
        return;
      case RoboConfdslPackage.INSTANCE_PROPERTIE__INSTANCE:
        setInstance((Instances)null);
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
      case RoboConfdslPackage.INSTANCE_PROPERTIE__NAME_INST:
        return nameInst != null;
      case RoboConfdslPackage.INSTANCE_PROPERTIE__COUNT:
        return count != null;
      case RoboConfdslPackage.INSTANCE_PROPERTIE__INSTANCE:
        return instance != null;
    }
    return super.eIsSet(featureID);
  }

} //InstancePropertieImpl
