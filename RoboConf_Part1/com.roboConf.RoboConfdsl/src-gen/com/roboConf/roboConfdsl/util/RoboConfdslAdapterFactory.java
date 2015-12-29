/**
 */
package com.roboConf.roboConfdsl.util;

import com.roboConf.roboConfdsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.roboConf.roboConfdsl.RoboConfdslPackage
 * @generated
 */
public class RoboConfdslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RoboConfdslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoboConfdslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RoboConfdslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoboConfdslSwitch<Adapter> modelSwitch =
    new RoboConfdslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter casePropertie(Propertie object)
      {
        return createPropertieAdapter();
      }
      @Override
      public Adapter caseExtends(Extends object)
      {
        return createExtendsAdapter();
      }
      @Override
      public Adapter caseChildren(Children object)
      {
        return createChildrenAdapter();
      }
      @Override
      public Adapter caseInstaller(Installer object)
      {
        return createInstallerAdapter();
      }
      @Override
      public Adapter caseFacet(Facet object)
      {
        return createFacetAdapter();
      }
      @Override
      public Adapter caseInstance(Instance object)
      {
        return createInstanceAdapter();
      }
      @Override
      public Adapter caseInstancePropertie(InstancePropertie object)
      {
        return createInstancePropertieAdapter();
      }
      @Override
      public Adapter caseInstances(Instances object)
      {
        return createInstancesAdapter();
      }
      @Override
      public Adapter caseCount(Count object)
      {
        return createCountAdapter();
      }
      @Override
      public Adapter caseName(Name object)
      {
        return createNameAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.roboConf.roboConfdsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.roboConf.roboConfdsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.roboConf.roboConfdsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.roboConf.roboConfdsl.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.roboConf.roboConfdsl.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.roboConf.roboConfdsl.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.roboConf.roboConfdsl.Propertie <em>Propertie</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.roboConf.roboConfdsl.Propertie
   * @generated
   */
  public Adapter createPropertieAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.roboConf.roboConfdsl.Extends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.roboConf.roboConfdsl.Extends
   * @generated
   */
  public Adapter createExtendsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.roboConf.roboConfdsl.Children <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.roboConf.roboConfdsl.Children
   * @generated
   */
  public Adapter createChildrenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.roboConf.roboConfdsl.Installer <em>Installer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.roboConf.roboConfdsl.Installer
   * @generated
   */
  public Adapter createInstallerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.roboConf.roboConfdsl.Facet <em>Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.roboConf.roboConfdsl.Facet
   * @generated
   */
  public Adapter createFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.roboConf.roboConfdsl.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.roboConf.roboConfdsl.Instance
   * @generated
   */
  public Adapter createInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.roboConf.roboConfdsl.InstancePropertie <em>Instance Propertie</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.roboConf.roboConfdsl.InstancePropertie
   * @generated
   */
  public Adapter createInstancePropertieAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.roboConf.roboConfdsl.Instances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.roboConf.roboConfdsl.Instances
   * @generated
   */
  public Adapter createInstancesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.roboConf.roboConfdsl.Count <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.roboConf.roboConfdsl.Count
   * @generated
   */
  public Adapter createCountAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.roboConf.roboConfdsl.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.roboConf.roboConfdsl.Name
   * @generated
   */
  public Adapter createNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RoboConfdslAdapterFactory
