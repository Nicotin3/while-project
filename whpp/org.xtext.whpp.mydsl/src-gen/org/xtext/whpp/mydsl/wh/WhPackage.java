/**
 * generated by Xtext 2.13.0
 */
package org.xtext.whpp.mydsl.wh;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.whpp.mydsl.wh.WhFactory
 * @model kind="package"
 * @generated
 */
public interface WhPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "wh";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/whpp/mydsl/Wh";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "wh";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WhPackage eINSTANCE = org.xtext.whpp.mydsl.wh.impl.WhPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.whpp.mydsl.wh.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.whpp.mydsl.wh.impl.ModelImpl
   * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROGRAM = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.whpp.mydsl.wh.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.whpp.mydsl.wh.impl.ProgramImpl
   * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 1;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__FUNCTION = 0;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PROGRAM = 1;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.whpp.mydsl.wh.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.whpp.mydsl.wh.impl.FunctionImpl
   * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.whpp.mydsl.wh.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.whpp.mydsl.wh.impl.DefinitionImpl
   * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__INPUT = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__COMMANDS = 1;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__OUTPUT = 2;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.whpp.mydsl.wh.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.whpp.mydsl.wh.impl.InputImpl
   * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getInput()
   * @generated
   */
  int INPUT = 4;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__INPUT = 1;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.whpp.mydsl.wh.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.whpp.mydsl.wh.impl.OutputImpl
   * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 5;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__OUTPUT = 1;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.whpp.mydsl.wh.impl.CommandsImpl <em>Commands</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.whpp.mydsl.wh.impl.CommandsImpl
   * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getCommands()
   * @generated
   */
  int COMMANDS = 6;

  /**
   * The feature id for the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS__COMMAND = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS__COMMANDS = 1;

  /**
   * The number of structural features of the '<em>Commands</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.whpp.mydsl.wh.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.whpp.mydsl.wh.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.whpp.mydsl.wh.Model#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Program</em>'.
   * @see org.xtext.whpp.mydsl.wh.Model#getProgram()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Program();

  /**
   * Returns the meta object for class '{@link org.xtext.whpp.mydsl.wh.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.xtext.whpp.mydsl.wh.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.whpp.mydsl.wh.Program#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.xtext.whpp.mydsl.wh.Program#getFunction()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Function();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.whpp.mydsl.wh.Program#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Program</em>'.
   * @see org.xtext.whpp.mydsl.wh.Program#getProgram()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Program();

  /**
   * Returns the meta object for class '{@link org.xtext.whpp.mydsl.wh.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.whpp.mydsl.wh.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.whpp.mydsl.wh.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.whpp.mydsl.wh.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.whpp.mydsl.wh.Function#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see org.xtext.whpp.mydsl.wh.Function#getDefinition()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Definition();

  /**
   * Returns the meta object for class '{@link org.xtext.whpp.mydsl.wh.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.xtext.whpp.mydsl.wh.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.whpp.mydsl.wh.Definition#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see org.xtext.whpp.mydsl.wh.Definition#getInput()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Input();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.whpp.mydsl.wh.Definition#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Commands</em>'.
   * @see org.xtext.whpp.mydsl.wh.Definition#getCommands()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Commands();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.whpp.mydsl.wh.Definition#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see org.xtext.whpp.mydsl.wh.Definition#getOutput()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Output();

  /**
   * Returns the meta object for class '{@link org.xtext.whpp.mydsl.wh.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see org.xtext.whpp.mydsl.wh.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.whpp.mydsl.wh.Input#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.xtext.whpp.mydsl.wh.Input#getVariable()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.whpp.mydsl.wh.Input#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see org.xtext.whpp.mydsl.wh.Input#getInput()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Input();

  /**
   * Returns the meta object for class '{@link org.xtext.whpp.mydsl.wh.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see org.xtext.whpp.mydsl.wh.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.whpp.mydsl.wh.Output#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.xtext.whpp.mydsl.wh.Output#getVariable()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.whpp.mydsl.wh.Output#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see org.xtext.whpp.mydsl.wh.Output#getOutput()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_Output();

  /**
   * Returns the meta object for class '{@link org.xtext.whpp.mydsl.wh.Commands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commands</em>'.
   * @see org.xtext.whpp.mydsl.wh.Commands
   * @generated
   */
  EClass getCommands();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.whpp.mydsl.wh.Commands#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command</em>'.
   * @see org.xtext.whpp.mydsl.wh.Commands#getCommand()
   * @see #getCommands()
   * @generated
   */
  EAttribute getCommands_Command();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.whpp.mydsl.wh.Commands#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Commands</em>'.
   * @see org.xtext.whpp.mydsl.wh.Commands#getCommands()
   * @see #getCommands()
   * @generated
   */
  EReference getCommands_Commands();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WhFactory getWhFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.whpp.mydsl.wh.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.whpp.mydsl.wh.impl.ModelImpl
     * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROGRAM = eINSTANCE.getModel_Program();

    /**
     * The meta object literal for the '{@link org.xtext.whpp.mydsl.wh.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.whpp.mydsl.wh.impl.ProgramImpl
     * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__FUNCTION = eINSTANCE.getProgram_Function();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PROGRAM = eINSTANCE.getProgram_Program();

    /**
     * The meta object literal for the '{@link org.xtext.whpp.mydsl.wh.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.whpp.mydsl.wh.impl.FunctionImpl
     * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__DEFINITION = eINSTANCE.getFunction_Definition();

    /**
     * The meta object literal for the '{@link org.xtext.whpp.mydsl.wh.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.whpp.mydsl.wh.impl.DefinitionImpl
     * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__INPUT = eINSTANCE.getDefinition_Input();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__COMMANDS = eINSTANCE.getDefinition_Commands();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__OUTPUT = eINSTANCE.getDefinition_Output();

    /**
     * The meta object literal for the '{@link org.xtext.whpp.mydsl.wh.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.whpp.mydsl.wh.impl.InputImpl
     * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__VARIABLE = eINSTANCE.getInput_Variable();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__INPUT = eINSTANCE.getInput_Input();

    /**
     * The meta object literal for the '{@link org.xtext.whpp.mydsl.wh.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.whpp.mydsl.wh.impl.OutputImpl
     * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__VARIABLE = eINSTANCE.getOutput_Variable();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__OUTPUT = eINSTANCE.getOutput_Output();

    /**
     * The meta object literal for the '{@link org.xtext.whpp.mydsl.wh.impl.CommandsImpl <em>Commands</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.whpp.mydsl.wh.impl.CommandsImpl
     * @see org.xtext.whpp.mydsl.wh.impl.WhPackageImpl#getCommands()
     * @generated
     */
    EClass COMMANDS = eINSTANCE.getCommands();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMANDS__COMMAND = eINSTANCE.getCommands_Command();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDS__COMMANDS = eINSTANCE.getCommands_Commands();

  }

} //WhPackage
