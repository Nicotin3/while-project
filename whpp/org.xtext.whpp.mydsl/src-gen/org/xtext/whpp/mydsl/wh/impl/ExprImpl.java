/**
 * generated by Xtext 2.12.0
 */
package org.xtext.whpp.mydsl.wh.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.whpp.mydsl.wh.Expr;
import org.xtext.whpp.mydsl.wh.Exprand;
import org.xtext.whpp.mydsl.wh.Exprsimple;
import org.xtext.whpp.mydsl.wh.WhPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.whpp.mydsl.wh.impl.ExprImpl#getExprsimple1 <em>Exprsimple1</em>}</li>
 *   <li>{@link org.xtext.whpp.mydsl.wh.impl.ExprImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.whpp.mydsl.wh.impl.ExprImpl#getExprsimple2 <em>Exprsimple2</em>}</li>
 *   <li>{@link org.xtext.whpp.mydsl.wh.impl.ExprImpl#getExprand <em>Exprand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprImpl extends MinimalEObjectImpl.Container implements Expr
{
  /**
   * The cached value of the '{@link #getExprsimple1() <em>Exprsimple1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprsimple1()
   * @generated
   * @ordered
   */
  protected Exprsimple exprsimple1;

  /**
   * The default value of the '{@link #getExpr() <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected static final String EXPR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected String expr = EXPR_EDEFAULT;

  /**
   * The cached value of the '{@link #getExprsimple2() <em>Exprsimple2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprsimple2()
   * @generated
   * @ordered
   */
  protected Exprsimple exprsimple2;

  /**
   * The cached value of the '{@link #getExprand() <em>Exprand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprand()
   * @generated
   * @ordered
   */
  protected Exprand exprand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprImpl()
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
    return WhPackage.Literals.EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exprsimple getExprsimple1()
  {
    return exprsimple1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprsimple1(Exprsimple newExprsimple1, NotificationChain msgs)
  {
    Exprsimple oldExprsimple1 = exprsimple1;
    exprsimple1 = newExprsimple1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhPackage.EXPR__EXPRSIMPLE1, oldExprsimple1, newExprsimple1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprsimple1(Exprsimple newExprsimple1)
  {
    if (newExprsimple1 != exprsimple1)
    {
      NotificationChain msgs = null;
      if (exprsimple1 != null)
        msgs = ((InternalEObject)exprsimple1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR__EXPRSIMPLE1, null, msgs);
      if (newExprsimple1 != null)
        msgs = ((InternalEObject)newExprsimple1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR__EXPRSIMPLE1, null, msgs);
      msgs = basicSetExprsimple1(newExprsimple1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.EXPR__EXPRSIMPLE1, newExprsimple1, newExprsimple1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(String newExpr)
  {
    String oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.EXPR__EXPR, oldExpr, expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exprsimple getExprsimple2()
  {
    return exprsimple2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprsimple2(Exprsimple newExprsimple2, NotificationChain msgs)
  {
    Exprsimple oldExprsimple2 = exprsimple2;
    exprsimple2 = newExprsimple2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhPackage.EXPR__EXPRSIMPLE2, oldExprsimple2, newExprsimple2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprsimple2(Exprsimple newExprsimple2)
  {
    if (newExprsimple2 != exprsimple2)
    {
      NotificationChain msgs = null;
      if (exprsimple2 != null)
        msgs = ((InternalEObject)exprsimple2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR__EXPRSIMPLE2, null, msgs);
      if (newExprsimple2 != null)
        msgs = ((InternalEObject)newExprsimple2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR__EXPRSIMPLE2, null, msgs);
      msgs = basicSetExprsimple2(newExprsimple2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.EXPR__EXPRSIMPLE2, newExprsimple2, newExprsimple2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exprand getExprand()
  {
    return exprand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprand(Exprand newExprand, NotificationChain msgs)
  {
    Exprand oldExprand = exprand;
    exprand = newExprand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhPackage.EXPR__EXPRAND, oldExprand, newExprand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprand(Exprand newExprand)
  {
    if (newExprand != exprand)
    {
      NotificationChain msgs = null;
      if (exprand != null)
        msgs = ((InternalEObject)exprand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR__EXPRAND, null, msgs);
      if (newExprand != null)
        msgs = ((InternalEObject)newExprand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR__EXPRAND, null, msgs);
      msgs = basicSetExprand(newExprand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.EXPR__EXPRAND, newExprand, newExprand));
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
      case WhPackage.EXPR__EXPRSIMPLE1:
        return basicSetExprsimple1(null, msgs);
      case WhPackage.EXPR__EXPRSIMPLE2:
        return basicSetExprsimple2(null, msgs);
      case WhPackage.EXPR__EXPRAND:
        return basicSetExprand(null, msgs);
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
      case WhPackage.EXPR__EXPRSIMPLE1:
        return getExprsimple1();
      case WhPackage.EXPR__EXPR:
        return getExpr();
      case WhPackage.EXPR__EXPRSIMPLE2:
        return getExprsimple2();
      case WhPackage.EXPR__EXPRAND:
        return getExprand();
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
      case WhPackage.EXPR__EXPRSIMPLE1:
        setExprsimple1((Exprsimple)newValue);
        return;
      case WhPackage.EXPR__EXPR:
        setExpr((String)newValue);
        return;
      case WhPackage.EXPR__EXPRSIMPLE2:
        setExprsimple2((Exprsimple)newValue);
        return;
      case WhPackage.EXPR__EXPRAND:
        setExprand((Exprand)newValue);
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
      case WhPackage.EXPR__EXPRSIMPLE1:
        setExprsimple1((Exprsimple)null);
        return;
      case WhPackage.EXPR__EXPR:
        setExpr(EXPR_EDEFAULT);
        return;
      case WhPackage.EXPR__EXPRSIMPLE2:
        setExprsimple2((Exprsimple)null);
        return;
      case WhPackage.EXPR__EXPRAND:
        setExprand((Exprand)null);
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
      case WhPackage.EXPR__EXPRSIMPLE1:
        return exprsimple1 != null;
      case WhPackage.EXPR__EXPR:
        return EXPR_EDEFAULT == null ? expr != null : !EXPR_EDEFAULT.equals(expr);
      case WhPackage.EXPR__EXPRSIMPLE2:
        return exprsimple2 != null;
      case WhPackage.EXPR__EXPRAND:
        return exprand != null;
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
    result.append(" (expr: ");
    result.append(expr);
    result.append(')');
    return result.toString();
  }

} //ExprImpl
