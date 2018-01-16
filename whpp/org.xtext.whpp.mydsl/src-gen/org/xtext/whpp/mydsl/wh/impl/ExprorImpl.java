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

import org.xtext.whpp.mydsl.wh.Exprnot;
import org.xtext.whpp.mydsl.wh.Expror;
import org.xtext.whpp.mydsl.wh.WhPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expror</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.whpp.mydsl.wh.impl.ExprorImpl#getExprG <em>Expr G</em>}</li>
 *   <li>{@link org.xtext.whpp.mydsl.wh.impl.ExprorImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.whpp.mydsl.wh.impl.ExprorImpl#getExprD <em>Expr D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprorImpl extends MinimalEObjectImpl.Container implements Expror
{
  /**
   * The cached value of the '{@link #getExprG() <em>Expr G</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprG()
   * @generated
   * @ordered
   */
  protected Exprnot exprG;

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
   * The cached value of the '{@link #getExprD() <em>Expr D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprD()
   * @generated
   * @ordered
   */
  protected Expror exprD;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprorImpl()
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
    return WhPackage.Literals.EXPROR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exprnot getExprG()
  {
    return exprG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprG(Exprnot newExprG, NotificationChain msgs)
  {
    Exprnot oldExprG = exprG;
    exprG = newExprG;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhPackage.EXPROR__EXPR_G, oldExprG, newExprG);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprG(Exprnot newExprG)
  {
    if (newExprG != exprG)
    {
      NotificationChain msgs = null;
      if (exprG != null)
        msgs = ((InternalEObject)exprG).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPROR__EXPR_G, null, msgs);
      if (newExprG != null)
        msgs = ((InternalEObject)newExprG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPROR__EXPR_G, null, msgs);
      msgs = basicSetExprG(newExprG, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.EXPROR__EXPR_G, newExprG, newExprG));
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
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.EXPROR__EXPR, oldExpr, expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expror getExprD()
  {
    return exprD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprD(Expror newExprD, NotificationChain msgs)
  {
    Expror oldExprD = exprD;
    exprD = newExprD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhPackage.EXPROR__EXPR_D, oldExprD, newExprD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprD(Expror newExprD)
  {
    if (newExprD != exprD)
    {
      NotificationChain msgs = null;
      if (exprD != null)
        msgs = ((InternalEObject)exprD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPROR__EXPR_D, null, msgs);
      if (newExprD != null)
        msgs = ((InternalEObject)newExprD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPROR__EXPR_D, null, msgs);
      msgs = basicSetExprD(newExprD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.EXPROR__EXPR_D, newExprD, newExprD));
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
      case WhPackage.EXPROR__EXPR_G:
        return basicSetExprG(null, msgs);
      case WhPackage.EXPROR__EXPR_D:
        return basicSetExprD(null, msgs);
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
      case WhPackage.EXPROR__EXPR_G:
        return getExprG();
      case WhPackage.EXPROR__EXPR:
        return getExpr();
      case WhPackage.EXPROR__EXPR_D:
        return getExprD();
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
      case WhPackage.EXPROR__EXPR_G:
        setExprG((Exprnot)newValue);
        return;
      case WhPackage.EXPROR__EXPR:
        setExpr((String)newValue);
        return;
      case WhPackage.EXPROR__EXPR_D:
        setExprD((Expror)newValue);
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
      case WhPackage.EXPROR__EXPR_G:
        setExprG((Exprnot)null);
        return;
      case WhPackage.EXPROR__EXPR:
        setExpr(EXPR_EDEFAULT);
        return;
      case WhPackage.EXPROR__EXPR_D:
        setExprD((Expror)null);
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
      case WhPackage.EXPROR__EXPR_G:
        return exprG != null;
      case WhPackage.EXPROR__EXPR:
        return EXPR_EDEFAULT == null ? expr != null : !EXPR_EDEFAULT.equals(expr);
      case WhPackage.EXPROR__EXPR_D:
        return exprD != null;
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

} //ExprorImpl