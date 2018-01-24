/**
 * generated by Xtext 2.13.0
 */
package org.xtext.whpp.mydsl.wh;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexpr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.whpp.mydsl.wh.Lexpr#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see org.xtext.whpp.mydsl.wh.WhPackage#getLexpr()
 * @model
 * @generated
 */
public interface Lexpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.whpp.mydsl.wh.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see org.xtext.whpp.mydsl.wh.WhPackage#getLexpr_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getExprs();

} // Lexpr
