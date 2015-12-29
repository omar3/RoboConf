/**
 */
package com.roboConf.roboConfdsl.util;

import com.roboConf.roboConfdsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.roboConf.roboConfdsl.RoboConfdslPackage
 * @generated
 */
public class RoboConfdslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RoboConfdslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoboConfdslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RoboConfdslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RoboConfdslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoboConfdslPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoboConfdslPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = caseFeature(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoboConfdslPackage.PROPERTIE:
      {
        Propertie propertie = (Propertie)theEObject;
        T result = casePropertie(propertie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoboConfdslPackage.EXTENDS:
      {
        Extends extends_ = (Extends)theEObject;
        T result = caseExtends(extends_);
        if (result == null) result = casePropertie(extends_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoboConfdslPackage.CHILDREN:
      {
        Children children = (Children)theEObject;
        T result = caseChildren(children);
        if (result == null) result = casePropertie(children);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoboConfdslPackage.INSTALLER:
      {
        Installer installer = (Installer)theEObject;
        T result = caseInstaller(installer);
        if (result == null) result = casePropertie(installer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoboConfdslPackage.FACET:
      {
        Facet facet = (Facet)theEObject;
        T result = caseFacet(facet);
        if (result == null) result = caseFeature(facet);
        if (result == null) result = casePropertie(facet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoboConfdslPackage.INSTANCE:
      {
        Instance instance = (Instance)theEObject;
        T result = caseInstance(instance);
        if (result == null) result = caseFeature(instance);
        if (result == null) result = caseInstances(instance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoboConfdslPackage.INSTANCE_PROPERTIE:
      {
        InstancePropertie instancePropertie = (InstancePropertie)theEObject;
        T result = caseInstancePropertie(instancePropertie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoboConfdslPackage.INSTANCES:
      {
        Instances instances = (Instances)theEObject;
        T result = caseInstances(instances);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoboConfdslPackage.COUNT:
      {
        Count count = (Count)theEObject;
        T result = caseCount(count);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RoboConfdslPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Propertie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Propertie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertie(Propertie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extends</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extends</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtends(Extends object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Children</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Children</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChildren(Children object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Installer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Installer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstaller(Installer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacet(Facet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstance(Instance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Propertie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Propertie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstancePropertie(InstancePropertie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instances</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instances</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstances(Instances object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Count</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCount(Count object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RoboConfdslSwitch
