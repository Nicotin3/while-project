/**
 * generated by Xtext 2.12.0
 */
package org.xtext.whpp.mydsl.wh;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exprsimple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.whpp.mydsl.wh.Exprsimple#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.whpp.mydsl.wh.Exprsimple#getExprs <em>Exprs</em>}</li>
 *   <li>{@link org.xtext.whpp.mydsl.wh.Exprsimple#getExpr2 <em>Expr2</em>}</li>
 * </ul>
 *
 * @see org.xtext.whpp.mydsl.wh.WhPackage#getExprsimple()
 * @model
 * @generated
 */
public interface Exprsimple extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' attribute.
   * @see #setExpr(String)
   * @see org.xtext.whpp.mydsl.wh.WhPackage#getExprsimple_Expr()
   * @model
   * @generated
   */
  String getExpr();

  /**
   * Sets the value of the '{@link org.xtext.whpp.mydsl.wh.Exprsimple#getExpr <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' attribute.
   * @see #getExpr()
   * @generated
   */
  void setExpr(String value);

  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference.
   * @see #setExprs(Lexpr)
   * @see org.xtext.whpp.mydsl.wh.WhPackage#getExprsimple_Exprs()
   * @model containment="true"
   * @generated
   */
  Lexpr getExprs();

  /**
   * Sets the value of the '{@link org.xtext.whpp.mydsl.wh.Exprsimple#getExprs <em>Exprs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exprs</em>' containment reference.
   * @see #getExprs()
   * @generated
   */
  void setExprs(Lexpr value);

  /**
   * Returns the value of the '<em><b>Expr2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr2</em>' containment reference.
   * @see #setExpr2(Expr)
   * @see org.xtext.whpp.mydsl.wh.WhPackage#getExprsimple_Expr2()
   * @model containment="true"
   * @generated
   */
  Expr getExpr2();

  /**
   * Sets the value of the '{@link org.xtext.whpp.mydsl.wh.Exprsimple#getExpr2 <em>Expr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr2</em>' containment reference.
   * @see #getExpr2()
   * @generated
   */
  void setExpr2(Expr value);

} // Exprsimple
