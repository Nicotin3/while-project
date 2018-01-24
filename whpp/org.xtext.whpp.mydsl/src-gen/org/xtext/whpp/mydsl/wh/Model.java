/**
 * generated by Xtext 2.13.0
 */
package org.xtext.whpp.mydsl.wh;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.whpp.mydsl.wh.Model#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see org.xtext.whpp.mydsl.wh.WhPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.whpp.mydsl.wh.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.xtext.whpp.mydsl.wh.WhPackage#getModel_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

} // Model
