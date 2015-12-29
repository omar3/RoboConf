/**
 */
package com.roboConf.roboConfdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.Instance#getNstanceName <em>Nstance Name</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.Instance#getInstanceProperties <em>Instance Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends Feature, Instances
{
  /**
   * Returns the value of the '<em><b>Nstance Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nstance Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nstance Name</em>' reference.
   * @see #setNstanceName(Component)
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getInstance_NstanceName()
   * @model
   * @generated
   */
  Component getNstanceName();

  /**
   * Sets the value of the '{@link com.roboConf.roboConfdsl.Instance#getNstanceName <em>Nstance Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nstance Name</em>' reference.
   * @see #getNstanceName()
   * @generated
   */
  void setNstanceName(Component value);

  /**
   * Returns the value of the '<em><b>Instance Properties</b></em>' containment reference list.
   * The list contents are of type {@link com.roboConf.roboConfdsl.InstancePropertie}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance Properties</em>' containment reference list.
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getInstance_InstanceProperties()
   * @model containment="true"
   * @generated
   */
  EList<InstancePropertie> getInstanceProperties();

} // Instance
