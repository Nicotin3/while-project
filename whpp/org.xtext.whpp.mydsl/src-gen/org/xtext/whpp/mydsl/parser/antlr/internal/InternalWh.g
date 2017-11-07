/*
 * generated by Xtext 2.13.0
 */
grammar InternalWh;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.whpp.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.whpp.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.whpp.mydsl.services.WhGrammarAccess;

}

@parser::members {

 	private WhGrammarAccess grammarAccess;

    public InternalWhParser(TokenStream input, WhGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected WhGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_0());
			}
			lv_program_0_0=ruleProgram
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"program",
					lv_program_0_0,
					"org.xtext.whpp.mydsl.Wh.Program");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getFunctionFunctionParserRuleCall_0_0());
				}
				lv_function_0_0=ruleFunction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"function",
						lv_function_0_0,
						"org.xtext.whpp.mydsl.Wh.Function");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='\n'
			{
				newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getLineFeedKeyword_1());
			}
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getProgramProgramParserRuleCall_2_0());
				}
				lv_program_2_0=ruleProgram
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"program",
						lv_program_2_0,
						"org.xtext.whpp.mydsl.Wh.Program");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='function'
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0());
				}
				lv_definition_3_0=ruleDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"definition",
						lv_definition_3_0,
						"org.xtext.whpp.mydsl.Wh.Definition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	iv_ruleDefinition=ruleDefinition
	{ $current=$iv_ruleDefinition.current; }
	EOF;

// Rule Definition
ruleDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='read'
			{
				newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_0_1_0());
					}
					lv_input_1_0=ruleInput
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						set(
							$current,
							"input",
							lv_input_1_0,
							"org.xtext.whpp.mydsl.Wh.Input");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_2='%'
			{
				newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_1_1_0());
					}
					lv_commands_3_0=ruleCommands
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						set(
							$current,
							"commands",
							lv_commands_3_0,
							"org.xtext.whpp.mydsl.Wh.Commands");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_4='%'
			{
				newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2_0());
			}
			otherlv_5='write'
			{
				newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_2_2_0());
					}
					lv_output_6_0=ruleOutput
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						set(
							$current,
							"output",
							lv_output_6_0,
							"org.xtext.whpp.mydsl.Wh.Output");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleInput
entryRuleInput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	iv_ruleInput=ruleInput
	{ $current=$iv_ruleInput.current; }
	EOF;

// Rule Input
ruleInput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getInputAccess().getVariableVariableParserRuleCall_0_0_0());
					}
					lv_variable_0_0=ruleVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInputRule());
						}
						set(
							$current,
							"variable",
							lv_variable_0_0,
							"org.xtext.whpp.mydsl.Wh.Variable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInputAccess().getInputInputParserRuleCall_0_2_0());
					}
					lv_input_2_0=ruleInput
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInputRule());
						}
						set(
							$current,
							"input",
							lv_input_2_0,
							"org.xtext.whpp.mydsl.Wh.Input");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInputAccess().getVariableVariableParserRuleCall_1_0());
				}
				lv_variable_3_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInputRule());
					}
					set(
						$current,
						"variable",
						lv_variable_3_0,
						"org.xtext.whpp.mydsl.Wh.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleOutput
entryRuleOutput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutputRule()); }
	iv_ruleOutput=ruleOutput
	{ $current=$iv_ruleOutput.current; }
	EOF;

// Rule Output
ruleOutput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getOutputAccess().getVariableVariableParserRuleCall_0_0_0());
					}
					lv_variable_0_0=ruleVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOutputRule());
						}
						set(
							$current,
							"variable",
							lv_variable_0_0,
							"org.xtext.whpp.mydsl.Wh.Variable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOutputAccess().getOutputOutputParserRuleCall_0_2_0());
					}
					lv_output_2_0=ruleOutput
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOutputRule());
						}
						set(
							$current,
							"output",
							lv_output_2_0,
							"org.xtext.whpp.mydsl.Wh.Output");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getOutputAccess().getVariableVariableParserRuleCall_1_0());
				}
				lv_variable_3_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOutputRule());
					}
					set(
						$current,
						"variable",
						lv_variable_3_0,
						"org.xtext.whpp.mydsl.Wh.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current.getText(); }
	EOF;

// Rule Variable
ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_MAJUSCULE_0=RULE_MAJUSCULE
	{
		$current.merge(this_MAJUSCULE_0);
	}
	{
		newLeafNode(this_MAJUSCULE_0, grammarAccess.getVariableAccess().getMAJUSCULETerminalRuleCall());
	}
;

// Entry rule entryRuleCommands
entryRuleCommands returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandsRule()); }
	iv_ruleCommands=ruleCommands
	{ $current=$iv_ruleCommands.current; }
	EOF;

// Rule Commands
ruleCommands returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCommandsAccess().getCommandCommandParserRuleCall_0_0_0());
					}
					lv_command_0_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCommandsRule());
						}
						set(
							$current,
							"command",
							lv_command_0_0,
							"org.xtext.whpp.mydsl.Wh.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_1=';'
			{
				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandsParserRuleCall_0_2_0());
					}
					lv_commands_2_0=ruleCommands
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCommandsRule());
						}
						set(
							$current,
							"commands",
							lv_commands_2_0,
							"org.xtext.whpp.mydsl.Wh.Commands");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandsAccess().getCommandCommandParserRuleCall_1_0());
				}
				lv_command_3_0=ruleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandsRule());
					}
					set(
						$current,
						"command",
						lv_command_3_0,
						"org.xtext.whpp.mydsl.Wh.Command");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current.getText(); }
	EOF;

// Rule Command
ruleCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='nop'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getCommandAccess().getNopKeyword());
	}
;

RULE_MAJUSCULE : 'A'..'Z';

RULE_MINUSCULE : 'a'..'z';

RULE_DIGIT : '0'..'9';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;