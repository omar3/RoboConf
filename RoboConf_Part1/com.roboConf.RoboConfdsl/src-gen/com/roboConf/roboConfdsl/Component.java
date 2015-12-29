/**
 */
package com.roboConf.roboConfdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.Component#getName <em>Name</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.Component#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Feature
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.roboConf.roboConfdsl.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link com.roboConf.roboConfdsl.Propertie}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getComponent_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Propertie> getProperties();

} // Component
