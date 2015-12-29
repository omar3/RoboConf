/**
 */
package com.roboConf.roboConfdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Propertie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.InstancePropertie#getNameInst <em>Name Inst</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.InstancePropertie#getCount <em>Count</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.InstancePropertie#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getInstancePropertie()
 * @model
 * @generated
 */
public interface InstancePropertie extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Inst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Inst</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Inst</em>' containment reference.
   * @see #setNameInst(Name)
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getInstancePropertie_NameInst()
   * @model containment="true"
   * @generated
   */
  Name getNameInst();

  /**
   * Sets the value of the '{@link com.roboConf.roboConfdsl.InstancePropertie#getNameInst <em>Name Inst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Inst</em>' containment reference.
   * @see #getNameInst()
   * @generated
   */
  void setNameInst(Name value);

  /**
   * Returns the value of the '<em><b>Count</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Count</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' containment reference.
   * @see #setCount(Count)
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getInstancePropertie_Count()
   * @model containment="true"
   * @generated
   */
  Count getCount();

  /**
   * Sets the value of the '{@link com.roboConf.roboConfdsl.InstancePropertie#getCount <em>Count</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' containment reference.
   * @see #getCount()
   * @generated
   */
  void setCount(Count value);

  /**
   * Returns the value of the '<em><b>Instance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance</em>' containment reference.
   * @see #setInstance(Instances)
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getInstancePropertie_Instance()
   * @model containment="true"
   * @generated
   */
  Instances getInstance();

  /**
   * Sets the value of the '{@link com.roboConf.roboConfdsl.InstancePropertie#getInstance <em>Instance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' containment reference.
   * @see #getInstance()
   * @generated
   */
  void setInstance(Instances value);

} // InstancePropertie
