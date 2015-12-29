/**
 */
package com.roboConf.roboConfdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECA Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.ECARule#getEca_rule_name <em>Eca rule name</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.ECARule#getEcaproperties <em>Ecaproperties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getECARule()
 * @model
 * @generated
 */
public interface ECARule extends EObject
{
  /**
   * Returns the value of the '<em><b>Eca rule name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eca rule name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eca rule name</em>' reference.
   * @see #setEca_rule_name(Component)
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getECARule_Eca_rule_name()
   * @model
   * @generated
   */
  Component getEca_rule_name();

  /**
   * Sets the value of the '{@link com.roboConf.roboConfdsl.ECARule#getEca_rule_name <em>Eca rule name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eca rule name</em>' reference.
   * @see #getEca_rule_name()
   * @generated
   */
  void setEca_rule_name(Component value);

  /**
   * Returns the value of the '<em><b>Ecaproperties</b></em>' containment reference list.
   * The list contents are of type {@link com.roboConf.roboConfdsl.ECAProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ecaproperties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ecaproperties</em>' containment reference list.
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getECARule_Ecaproperties()
   * @model containment="true"
   * @generated
   */
  EList<ECAProperty> getEcaproperties();

} // ECARule
