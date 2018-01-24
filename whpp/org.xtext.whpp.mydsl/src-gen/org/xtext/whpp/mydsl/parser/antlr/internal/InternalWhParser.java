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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWhParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOLE", "RULE_VARIABLE", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'while'", "'do'", "'od'", "'for'", "'if'", "'then'", "'else'", "'fi'", "'foreach'", "'in'", "'=?'", "'nil'", "'('", "'cons'", "'list'", "')'", "'hd'", "'tl'", "'and'", "'or'", "'not'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int RULE_DIGIT=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SYMBOLE=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalWhParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWhParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWhParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWh.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

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




    // $ANTLR start "entryRuleModel"
    // InternalWh.g:70:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalWh.g:70:46: (iv_ruleModel= ruleModel EOF )
            // InternalWh.g:71:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalWh.g:77:1: ruleModel returns [EObject current=null] : ( (lv_functions_0_0= ruleFunction ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;



        	enterRule();

        try {
            // InternalWh.g:83:2: ( ( (lv_functions_0_0= ruleFunction ) )* )
            // InternalWh.g:84:2: ( (lv_functions_0_0= ruleFunction ) )*
            {
            // InternalWh.g:84:2: ( (lv_functions_0_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWh.g:85:3: (lv_functions_0_0= ruleFunction )
            	    {
            	    // InternalWh.g:85:3: (lv_functions_0_0= ruleFunction )
            	    // InternalWh.g:86:4: lv_functions_0_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_functions_0_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"functions",
            	      					lv_functions_0_0,
            	      					"org.xtext.whpp.mydsl.Wh.Function");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFunction"
    // InternalWh.g:106:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalWh.g:106:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalWh.g:107:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalWh.g:113:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOLE ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:119:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOLE ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) )
            // InternalWh.g:120:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOLE ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            {
            // InternalWh.g:120:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOLE ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            // InternalWh.g:121:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOLE ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
              		
            }
            // InternalWh.g:125:3: ( (lv_name_1_0= RULE_SYMBOLE ) )
            // InternalWh.g:126:4: (lv_name_1_0= RULE_SYMBOLE )
            {
            // InternalWh.g:126:4: (lv_name_1_0= RULE_SYMBOLE )
            // InternalWh.g:127:5: lv_name_1_0= RULE_SYMBOLE
            {
            lv_name_1_0=(Token)match(input,RULE_SYMBOLE,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameSYMBOLETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.whpp.mydsl.Wh.SYMBOLE");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
              		
            }
            // InternalWh.g:147:3: ( (lv_definition_3_0= ruleDefinition ) )
            // InternalWh.g:148:4: (lv_definition_3_0= ruleDefinition )
            {
            // InternalWh.g:148:4: (lv_definition_3_0= ruleDefinition )
            // InternalWh.g:149:5: lv_definition_3_0= ruleDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_definition_3_0=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"definition",
              						lv_definition_3_0,
              						"org.xtext.whpp.mydsl.Wh.Definition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefinition"
    // InternalWh.g:170:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalWh.g:170:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalWh.g:171:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalWh.g:177:1: ruleDefinition returns [EObject current=null] : ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) ) (otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) ) (otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_input_1_0 = null;

        EObject lv_commands_3_0 = null;

        EObject lv_output_6_0 = null;



        	enterRule();

        try {
            // InternalWh.g:183:2: ( ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) ) (otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) ) (otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) ) )
            // InternalWh.g:184:2: ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) ) (otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) ) (otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) )
            {
            // InternalWh.g:184:2: ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) ) (otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) ) (otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) )
            // InternalWh.g:185:3: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) ) (otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) ) (otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            {
            // InternalWh.g:185:3: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) )
            // InternalWh.g:186:4: otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0_0());
              			
            }
            // InternalWh.g:190:4: ( (lv_input_1_0= ruleInput ) )
            // InternalWh.g:191:5: (lv_input_1_0= ruleInput )
            {
            // InternalWh.g:191:5: (lv_input_1_0= ruleInput )
            // InternalWh.g:192:6: lv_input_1_0= ruleInput
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_0_1_0());
              					
            }
            pushFollow(FOLLOW_8);
            lv_input_1_0=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getDefinitionRule());
              						}
              						set(
              							current,
              							"input",
              							lv_input_1_0,
              							"org.xtext.whpp.mydsl.Wh.Input");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }


            }

            // InternalWh.g:210:3: (otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) )
            // InternalWh.g:211:4: otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) )
            {
            otherlv_2=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_1_0());
              			
            }
            // InternalWh.g:215:4: ( (lv_commands_3_0= ruleCommands ) )
            // InternalWh.g:216:5: (lv_commands_3_0= ruleCommands )
            {
            // InternalWh.g:216:5: (lv_commands_3_0= ruleCommands )
            // InternalWh.g:217:6: lv_commands_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_1_1_0());
              					
            }
            pushFollow(FOLLOW_8);
            lv_commands_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getDefinitionRule());
              						}
              						set(
              							current,
              							"commands",
              							lv_commands_3_0,
              							"org.xtext.whpp.mydsl.Wh.Commands");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }


            }

            // InternalWh.g:235:3: (otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            // InternalWh.g:236:4: otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) )
            {
            otherlv_4=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2_0());
              			
            }
            otherlv_5=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_2_1());
              			
            }
            // InternalWh.g:244:4: ( (lv_output_6_0= ruleOutput ) )
            // InternalWh.g:245:5: (lv_output_6_0= ruleOutput )
            {
            // InternalWh.g:245:5: (lv_output_6_0= ruleOutput )
            // InternalWh.g:246:6: lv_output_6_0= ruleOutput
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_2_2_0());
              					
            }
            pushFollow(FOLLOW_2);
            lv_output_6_0=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getDefinitionRule());
              						}
              						set(
              							current,
              							"output",
              							lv_output_6_0,
              							"org.xtext.whpp.mydsl.Wh.Output");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // InternalWh.g:268:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalWh.g:268:46: (iv_ruleInput= ruleInput EOF )
            // InternalWh.g:269:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalWh.g:275:1: ruleInput returns [EObject current=null] : ( (lv_variables_0_0= ruleVariables ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0_0 = null;



        	enterRule();

        try {
            // InternalWh.g:281:2: ( ( (lv_variables_0_0= ruleVariables ) ) )
            // InternalWh.g:282:2: ( (lv_variables_0_0= ruleVariables ) )
            {
            // InternalWh.g:282:2: ( (lv_variables_0_0= ruleVariables ) )
            // InternalWh.g:283:3: (lv_variables_0_0= ruleVariables )
            {
            // InternalWh.g:283:3: (lv_variables_0_0= ruleVariables )
            // InternalWh.g:284:4: lv_variables_0_0= ruleVariables
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getInputAccess().getVariablesVariablesParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_variables_0_0=ruleVariables();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getInputRule());
              				}
              				set(
              					current,
              					"variables",
              					lv_variables_0_0,
              					"org.xtext.whpp.mydsl.Wh.Variables");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalWh.g:304:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalWh.g:304:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalWh.g:305:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalWh.g:311:1: ruleOutput returns [EObject current=null] : ( (lv_variables_0_0= ruleVariables ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0_0 = null;



        	enterRule();

        try {
            // InternalWh.g:317:2: ( ( (lv_variables_0_0= ruleVariables ) ) )
            // InternalWh.g:318:2: ( (lv_variables_0_0= ruleVariables ) )
            {
            // InternalWh.g:318:2: ( (lv_variables_0_0= ruleVariables ) )
            // InternalWh.g:319:3: (lv_variables_0_0= ruleVariables )
            {
            // InternalWh.g:319:3: (lv_variables_0_0= ruleVariables )
            // InternalWh.g:320:4: lv_variables_0_0= ruleVariables
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getOutputAccess().getVariablesVariablesParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_variables_0_0=ruleVariables();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getOutputRule());
              				}
              				set(
              					current,
              					"variables",
              					lv_variables_0_0,
              					"org.xtext.whpp.mydsl.Wh.Variables");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleVariables"
    // InternalWh.g:340:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalWh.g:340:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalWh.g:341:2: iv_ruleVariables= ruleVariables EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariablesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariables=ruleVariables();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariables; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // InternalWh.g:347:1: ruleVariables returns [EObject current=null] : ( ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        Token lv_variables_0_0=null;
        Token otherlv_1=null;
        Token lv_variables_2_0=null;


        	enterRule();

        try {
            // InternalWh.g:353:2: ( ( ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWh.g:354:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWh.g:354:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )* )
            // InternalWh.g:355:3: ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWh.g:355:3: ( (lv_variables_0_0= RULE_VARIABLE ) )
            // InternalWh.g:356:4: (lv_variables_0_0= RULE_VARIABLE )
            {
            // InternalWh.g:356:4: (lv_variables_0_0= RULE_VARIABLE )
            // InternalWh.g:357:5: lv_variables_0_0= RULE_VARIABLE
            {
            lv_variables_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variables_0_0, grammarAccess.getVariablesAccess().getVariablesVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariablesRule());
              					}
              					addWithLastConsumed(
              						current,
              						"variables",
              						lv_variables_0_0,
              						"org.xtext.whpp.mydsl.Wh.VARIABLE");
              				
            }

            }


            }

            // InternalWh.g:373:3: (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWh.g:374:4: otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVariablesAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:378:4: ( (lv_variables_2_0= RULE_VARIABLE ) )
            	    // InternalWh.g:379:5: (lv_variables_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWh.g:379:5: (lv_variables_2_0= RULE_VARIABLE )
            	    // InternalWh.g:380:6: lv_variables_2_0= RULE_VARIABLE
            	    {
            	    lv_variables_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_variables_2_0, grammarAccess.getVariablesAccess().getVariablesVARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getVariablesRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"variables",
            	      							lv_variables_2_0,
            	      							"org.xtext.whpp.mydsl.Wh.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleCommands"
    // InternalWh.g:401:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalWh.g:401:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalWh.g:402:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalWh.g:408:1: ruleCommands returns [EObject current=null] : ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_commands_0_0 = null;

        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:414:2: ( ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) )
            // InternalWh.g:415:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            {
            // InternalWh.g:415:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            // InternalWh.g:416:3: ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            {
            // InternalWh.g:416:3: ( (lv_commands_0_0= ruleCommand ) )
            // InternalWh.g:417:4: (lv_commands_0_0= ruleCommand )
            {
            // InternalWh.g:417:4: (lv_commands_0_0= ruleCommand )
            // InternalWh.g:418:5: lv_commands_0_0= ruleCommand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_commands_0_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCommandsRule());
              					}
              					add(
              						current,
              						"commands",
              						lv_commands_0_0,
              						"org.xtext.whpp.mydsl.Wh.Command");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:435:3: (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWh.g:436:4: otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:440:4: ( (lv_commands_2_0= ruleCommand ) )
            	    // InternalWh.g:441:5: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalWh.g:441:5: (lv_commands_2_0= ruleCommand )
            	    // InternalWh.g:442:6: lv_commands_2_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCommandsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"commands",
            	      							lv_commands_2_0,
            	      							"org.xtext.whpp.mydsl.Wh.Command");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalWh.g:464:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalWh.g:464:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalWh.g:465:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalWh.g:471:1: ruleCommand returns [EObject current=null] : ( ( (lv_command_0_0= 'nop' ) ) | ( ( (lv_variables_1_0= ruleVariables ) ) ( (lv_command_2_0= ':=' ) ) ( (lv_exrps_3_0= ruleExprs ) ) ) | ( ( (lv_command_4_0= 'while' ) ) ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= 'do' ( (lv_commands_7_0= ruleCommands ) ) otherlv_8= 'od' ) | ( ( (lv_command_9_0= 'for' ) ) ( (lv_expr_10_0= ruleExpr ) ) otherlv_11= 'do' ( (lv_commands_12_0= ruleCommands ) ) otherlv_13= 'od' ) | ( ( (lv_command_14_0= 'if' ) ) ( (lv_expr_15_0= ruleExpr ) ) otherlv_16= 'then' ( (lv_commands_then_17_0= ruleCommands ) ) (otherlv_18= 'else' ( (lv_commands_else_19_0= ruleCommands ) ) )? otherlv_20= 'fi' ) | ( ( (lv_command_21_0= 'foreach' ) ) ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= 'in' ( (lv_expr_in_24_0= ruleExpr ) ) otherlv_25= 'do' ( (lv_commands_26_0= ruleCommands ) ) otherlv_27= 'od' ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_command_0_0=null;
        Token lv_command_2_0=null;
        Token lv_command_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_command_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_command_14_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_command_21_0=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_variables_1_0 = null;

        EObject lv_exrps_3_0 = null;

        EObject lv_expr_5_0 = null;

        EObject lv_commands_7_0 = null;

        EObject lv_expr_10_0 = null;

        EObject lv_commands_12_0 = null;

        EObject lv_expr_15_0 = null;

        EObject lv_commands_then_17_0 = null;

        EObject lv_commands_else_19_0 = null;

        EObject lv_expr_22_0 = null;

        EObject lv_expr_in_24_0 = null;

        EObject lv_commands_26_0 = null;



        	enterRule();

        try {
            // InternalWh.g:477:2: ( ( ( (lv_command_0_0= 'nop' ) ) | ( ( (lv_variables_1_0= ruleVariables ) ) ( (lv_command_2_0= ':=' ) ) ( (lv_exrps_3_0= ruleExprs ) ) ) | ( ( (lv_command_4_0= 'while' ) ) ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= 'do' ( (lv_commands_7_0= ruleCommands ) ) otherlv_8= 'od' ) | ( ( (lv_command_9_0= 'for' ) ) ( (lv_expr_10_0= ruleExpr ) ) otherlv_11= 'do' ( (lv_commands_12_0= ruleCommands ) ) otherlv_13= 'od' ) | ( ( (lv_command_14_0= 'if' ) ) ( (lv_expr_15_0= ruleExpr ) ) otherlv_16= 'then' ( (lv_commands_then_17_0= ruleCommands ) ) (otherlv_18= 'else' ( (lv_commands_else_19_0= ruleCommands ) ) )? otherlv_20= 'fi' ) | ( ( (lv_command_21_0= 'foreach' ) ) ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= 'in' ( (lv_expr_in_24_0= ruleExpr ) ) otherlv_25= 'do' ( (lv_commands_26_0= ruleCommands ) ) otherlv_27= 'od' ) ) )
            // InternalWh.g:478:2: ( ( (lv_command_0_0= 'nop' ) ) | ( ( (lv_variables_1_0= ruleVariables ) ) ( (lv_command_2_0= ':=' ) ) ( (lv_exrps_3_0= ruleExprs ) ) ) | ( ( (lv_command_4_0= 'while' ) ) ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= 'do' ( (lv_commands_7_0= ruleCommands ) ) otherlv_8= 'od' ) | ( ( (lv_command_9_0= 'for' ) ) ( (lv_expr_10_0= ruleExpr ) ) otherlv_11= 'do' ( (lv_commands_12_0= ruleCommands ) ) otherlv_13= 'od' ) | ( ( (lv_command_14_0= 'if' ) ) ( (lv_expr_15_0= ruleExpr ) ) otherlv_16= 'then' ( (lv_commands_then_17_0= ruleCommands ) ) (otherlv_18= 'else' ( (lv_commands_else_19_0= ruleCommands ) ) )? otherlv_20= 'fi' ) | ( ( (lv_command_21_0= 'foreach' ) ) ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= 'in' ( (lv_expr_in_24_0= ruleExpr ) ) otherlv_25= 'do' ( (lv_commands_26_0= ruleCommands ) ) otherlv_27= 'od' ) )
            {
            // InternalWh.g:478:2: ( ( (lv_command_0_0= 'nop' ) ) | ( ( (lv_variables_1_0= ruleVariables ) ) ( (lv_command_2_0= ':=' ) ) ( (lv_exrps_3_0= ruleExprs ) ) ) | ( ( (lv_command_4_0= 'while' ) ) ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= 'do' ( (lv_commands_7_0= ruleCommands ) ) otherlv_8= 'od' ) | ( ( (lv_command_9_0= 'for' ) ) ( (lv_expr_10_0= ruleExpr ) ) otherlv_11= 'do' ( (lv_commands_12_0= ruleCommands ) ) otherlv_13= 'od' ) | ( ( (lv_command_14_0= 'if' ) ) ( (lv_expr_15_0= ruleExpr ) ) otherlv_16= 'then' ( (lv_commands_then_17_0= ruleCommands ) ) (otherlv_18= 'else' ( (lv_commands_else_19_0= ruleCommands ) ) )? otherlv_20= 'fi' ) | ( ( (lv_command_21_0= 'foreach' ) ) ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= 'in' ( (lv_expr_in_24_0= ruleExpr ) ) otherlv_25= 'do' ( (lv_commands_26_0= ruleCommands ) ) otherlv_27= 'od' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 27:
                {
                alt5=5;
                }
                break;
            case 31:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWh.g:479:3: ( (lv_command_0_0= 'nop' ) )
                    {
                    // InternalWh.g:479:3: ( (lv_command_0_0= 'nop' ) )
                    // InternalWh.g:480:4: (lv_command_0_0= 'nop' )
                    {
                    // InternalWh.g:480:4: (lv_command_0_0= 'nop' )
                    // InternalWh.g:481:5: lv_command_0_0= 'nop'
                    {
                    lv_command_0_0=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_command_0_0, grammarAccess.getCommandAccess().getCommandNopKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCommandRule());
                      					}
                      					setWithLastConsumed(current, "command", lv_command_0_0, "nop");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWh.g:494:3: ( ( (lv_variables_1_0= ruleVariables ) ) ( (lv_command_2_0= ':=' ) ) ( (lv_exrps_3_0= ruleExprs ) ) )
                    {
                    // InternalWh.g:494:3: ( ( (lv_variables_1_0= ruleVariables ) ) ( (lv_command_2_0= ':=' ) ) ( (lv_exrps_3_0= ruleExprs ) ) )
                    // InternalWh.g:495:4: ( (lv_variables_1_0= ruleVariables ) ) ( (lv_command_2_0= ':=' ) ) ( (lv_exrps_3_0= ruleExprs ) )
                    {
                    // InternalWh.g:495:4: ( (lv_variables_1_0= ruleVariables ) )
                    // InternalWh.g:496:5: (lv_variables_1_0= ruleVariables )
                    {
                    // InternalWh.g:496:5: (lv_variables_1_0= ruleVariables )
                    // InternalWh.g:497:6: lv_variables_1_0= ruleVariables
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getVariablesVariablesParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_variables_1_0=ruleVariables();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"variables",
                      							lv_variables_1_0,
                      							"org.xtext.whpp.mydsl.Wh.Variables");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalWh.g:514:4: ( (lv_command_2_0= ':=' ) )
                    // InternalWh.g:515:5: (lv_command_2_0= ':=' )
                    {
                    // InternalWh.g:515:5: (lv_command_2_0= ':=' )
                    // InternalWh.g:516:6: lv_command_2_0= ':='
                    {
                    lv_command_2_0=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_command_2_0, grammarAccess.getCommandAccess().getCommandColonEqualsSignKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCommandRule());
                      						}
                      						setWithLastConsumed(current, "command", lv_command_2_0, ":=");
                      					
                    }

                    }


                    }

                    // InternalWh.g:528:4: ( (lv_exrps_3_0= ruleExprs ) )
                    // InternalWh.g:529:5: (lv_exrps_3_0= ruleExprs )
                    {
                    // InternalWh.g:529:5: (lv_exrps_3_0= ruleExprs )
                    // InternalWh.g:530:6: lv_exrps_3_0= ruleExprs
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getExrpsExprsParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exrps_3_0=ruleExprs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"exrps",
                      							lv_exrps_3_0,
                      							"org.xtext.whpp.mydsl.Wh.Exprs");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWh.g:549:3: ( ( (lv_command_4_0= 'while' ) ) ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= 'do' ( (lv_commands_7_0= ruleCommands ) ) otherlv_8= 'od' )
                    {
                    // InternalWh.g:549:3: ( ( (lv_command_4_0= 'while' ) ) ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= 'do' ( (lv_commands_7_0= ruleCommands ) ) otherlv_8= 'od' )
                    // InternalWh.g:550:4: ( (lv_command_4_0= 'while' ) ) ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= 'do' ( (lv_commands_7_0= ruleCommands ) ) otherlv_8= 'od'
                    {
                    // InternalWh.g:550:4: ( (lv_command_4_0= 'while' ) )
                    // InternalWh.g:551:5: (lv_command_4_0= 'while' )
                    {
                    // InternalWh.g:551:5: (lv_command_4_0= 'while' )
                    // InternalWh.g:552:6: lv_command_4_0= 'while'
                    {
                    lv_command_4_0=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_command_4_0, grammarAccess.getCommandAccess().getCommandWhileKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCommandRule());
                      						}
                      						setWithLastConsumed(current, "command", lv_command_4_0, "while");
                      					
                    }

                    }


                    }

                    // InternalWh.g:564:4: ( (lv_expr_5_0= ruleExpr ) )
                    // InternalWh.g:565:5: (lv_expr_5_0= ruleExpr )
                    {
                    // InternalWh.g:565:5: (lv_expr_5_0= ruleExpr )
                    // InternalWh.g:566:6: lv_expr_5_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getExprExprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_expr_5_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_5_0,
                      							"org.xtext.whpp.mydsl.Wh.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getDoKeyword_2_2());
                      			
                    }
                    // InternalWh.g:587:4: ( (lv_commands_7_0= ruleCommands ) )
                    // InternalWh.g:588:5: (lv_commands_7_0= ruleCommands )
                    {
                    // InternalWh.g:588:5: (lv_commands_7_0= ruleCommands )
                    // InternalWh.g:589:6: lv_commands_7_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandsParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_commands_7_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"commands",
                      							lv_commands_7_0,
                      							"org.xtext.whpp.mydsl.Wh.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getCommandAccess().getOdKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalWh.g:612:3: ( ( (lv_command_9_0= 'for' ) ) ( (lv_expr_10_0= ruleExpr ) ) otherlv_11= 'do' ( (lv_commands_12_0= ruleCommands ) ) otherlv_13= 'od' )
                    {
                    // InternalWh.g:612:3: ( ( (lv_command_9_0= 'for' ) ) ( (lv_expr_10_0= ruleExpr ) ) otherlv_11= 'do' ( (lv_commands_12_0= ruleCommands ) ) otherlv_13= 'od' )
                    // InternalWh.g:613:4: ( (lv_command_9_0= 'for' ) ) ( (lv_expr_10_0= ruleExpr ) ) otherlv_11= 'do' ( (lv_commands_12_0= ruleCommands ) ) otherlv_13= 'od'
                    {
                    // InternalWh.g:613:4: ( (lv_command_9_0= 'for' ) )
                    // InternalWh.g:614:5: (lv_command_9_0= 'for' )
                    {
                    // InternalWh.g:614:5: (lv_command_9_0= 'for' )
                    // InternalWh.g:615:6: lv_command_9_0= 'for'
                    {
                    lv_command_9_0=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_command_9_0, grammarAccess.getCommandAccess().getCommandForKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCommandRule());
                      						}
                      						setWithLastConsumed(current, "command", lv_command_9_0, "for");
                      					
                    }

                    }


                    }

                    // InternalWh.g:627:4: ( (lv_expr_10_0= ruleExpr ) )
                    // InternalWh.g:628:5: (lv_expr_10_0= ruleExpr )
                    {
                    // InternalWh.g:628:5: (lv_expr_10_0= ruleExpr )
                    // InternalWh.g:629:6: lv_expr_10_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getExprExprParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_expr_10_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_10_0,
                      							"org.xtext.whpp.mydsl.Wh.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getCommandAccess().getDoKeyword_3_2());
                      			
                    }
                    // InternalWh.g:650:4: ( (lv_commands_12_0= ruleCommands ) )
                    // InternalWh.g:651:5: (lv_commands_12_0= ruleCommands )
                    {
                    // InternalWh.g:651:5: (lv_commands_12_0= ruleCommands )
                    // InternalWh.g:652:6: lv_commands_12_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandsParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_commands_12_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"commands",
                      							lv_commands_12_0,
                      							"org.xtext.whpp.mydsl.Wh.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getCommandAccess().getOdKeyword_3_4());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalWh.g:675:3: ( ( (lv_command_14_0= 'if' ) ) ( (lv_expr_15_0= ruleExpr ) ) otherlv_16= 'then' ( (lv_commands_then_17_0= ruleCommands ) ) (otherlv_18= 'else' ( (lv_commands_else_19_0= ruleCommands ) ) )? otherlv_20= 'fi' )
                    {
                    // InternalWh.g:675:3: ( ( (lv_command_14_0= 'if' ) ) ( (lv_expr_15_0= ruleExpr ) ) otherlv_16= 'then' ( (lv_commands_then_17_0= ruleCommands ) ) (otherlv_18= 'else' ( (lv_commands_else_19_0= ruleCommands ) ) )? otherlv_20= 'fi' )
                    // InternalWh.g:676:4: ( (lv_command_14_0= 'if' ) ) ( (lv_expr_15_0= ruleExpr ) ) otherlv_16= 'then' ( (lv_commands_then_17_0= ruleCommands ) ) (otherlv_18= 'else' ( (lv_commands_else_19_0= ruleCommands ) ) )? otherlv_20= 'fi'
                    {
                    // InternalWh.g:676:4: ( (lv_command_14_0= 'if' ) )
                    // InternalWh.g:677:5: (lv_command_14_0= 'if' )
                    {
                    // InternalWh.g:677:5: (lv_command_14_0= 'if' )
                    // InternalWh.g:678:6: lv_command_14_0= 'if'
                    {
                    lv_command_14_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_command_14_0, grammarAccess.getCommandAccess().getCommandIfKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCommandRule());
                      						}
                      						setWithLastConsumed(current, "command", lv_command_14_0, "if");
                      					
                    }

                    }


                    }

                    // InternalWh.g:690:4: ( (lv_expr_15_0= ruleExpr ) )
                    // InternalWh.g:691:5: (lv_expr_15_0= ruleExpr )
                    {
                    // InternalWh.g:691:5: (lv_expr_15_0= ruleExpr )
                    // InternalWh.g:692:6: lv_expr_15_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getExprExprParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_expr_15_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_15_0,
                      							"org.xtext.whpp.mydsl.Wh.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,28,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getCommandAccess().getThenKeyword_4_2());
                      			
                    }
                    // InternalWh.g:713:4: ( (lv_commands_then_17_0= ruleCommands ) )
                    // InternalWh.g:714:5: (lv_commands_then_17_0= ruleCommands )
                    {
                    // InternalWh.g:714:5: (lv_commands_then_17_0= ruleCommands )
                    // InternalWh.g:715:6: lv_commands_then_17_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getCommands_thenCommandsParserRuleCall_4_3_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_commands_then_17_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"commands_then",
                      							lv_commands_then_17_0,
                      							"org.xtext.whpp.mydsl.Wh.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalWh.g:732:4: (otherlv_18= 'else' ( (lv_commands_else_19_0= ruleCommands ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==29) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalWh.g:733:5: otherlv_18= 'else' ( (lv_commands_else_19_0= ruleCommands ) )
                            {
                            otherlv_18=(Token)match(input,29,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_18, grammarAccess.getCommandAccess().getElseKeyword_4_4_0());
                              				
                            }
                            // InternalWh.g:737:5: ( (lv_commands_else_19_0= ruleCommands ) )
                            // InternalWh.g:738:6: (lv_commands_else_19_0= ruleCommands )
                            {
                            // InternalWh.g:738:6: (lv_commands_else_19_0= ruleCommands )
                            // InternalWh.g:739:7: lv_commands_else_19_0= ruleCommands
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getCommandAccess().getCommands_elseCommandsParserRuleCall_4_4_1_0());
                              						
                            }
                            pushFollow(FOLLOW_19);
                            lv_commands_else_19_0=ruleCommands();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getCommandRule());
                              							}
                              							set(
                              								current,
                              								"commands_else",
                              								lv_commands_else_19_0,
                              								"org.xtext.whpp.mydsl.Wh.Commands");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getCommandAccess().getFiKeyword_4_5());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalWh.g:763:3: ( ( (lv_command_21_0= 'foreach' ) ) ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= 'in' ( (lv_expr_in_24_0= ruleExpr ) ) otherlv_25= 'do' ( (lv_commands_26_0= ruleCommands ) ) otherlv_27= 'od' )
                    {
                    // InternalWh.g:763:3: ( ( (lv_command_21_0= 'foreach' ) ) ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= 'in' ( (lv_expr_in_24_0= ruleExpr ) ) otherlv_25= 'do' ( (lv_commands_26_0= ruleCommands ) ) otherlv_27= 'od' )
                    // InternalWh.g:764:4: ( (lv_command_21_0= 'foreach' ) ) ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= 'in' ( (lv_expr_in_24_0= ruleExpr ) ) otherlv_25= 'do' ( (lv_commands_26_0= ruleCommands ) ) otherlv_27= 'od'
                    {
                    // InternalWh.g:764:4: ( (lv_command_21_0= 'foreach' ) )
                    // InternalWh.g:765:5: (lv_command_21_0= 'foreach' )
                    {
                    // InternalWh.g:765:5: (lv_command_21_0= 'foreach' )
                    // InternalWh.g:766:6: lv_command_21_0= 'foreach'
                    {
                    lv_command_21_0=(Token)match(input,31,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_command_21_0, grammarAccess.getCommandAccess().getCommandForeachKeyword_5_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCommandRule());
                      						}
                      						setWithLastConsumed(current, "command", lv_command_21_0, "foreach");
                      					
                    }

                    }


                    }

                    // InternalWh.g:778:4: ( (lv_expr_22_0= ruleExpr ) )
                    // InternalWh.g:779:5: (lv_expr_22_0= ruleExpr )
                    {
                    // InternalWh.g:779:5: (lv_expr_22_0= ruleExpr )
                    // InternalWh.g:780:6: lv_expr_22_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getExprExprParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_expr_22_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_22_0,
                      							"org.xtext.whpp.mydsl.Wh.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_23=(Token)match(input,32,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getCommandAccess().getInKeyword_5_2());
                      			
                    }
                    // InternalWh.g:801:4: ( (lv_expr_in_24_0= ruleExpr ) )
                    // InternalWh.g:802:5: (lv_expr_in_24_0= ruleExpr )
                    {
                    // InternalWh.g:802:5: (lv_expr_in_24_0= ruleExpr )
                    // InternalWh.g:803:6: lv_expr_in_24_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getExpr_inExprParserRuleCall_5_3_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_expr_in_24_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"expr_in",
                      							lv_expr_in_24_0,
                      							"org.xtext.whpp.mydsl.Wh.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getCommandAccess().getDoKeyword_5_4());
                      			
                    }
                    // InternalWh.g:824:4: ( (lv_commands_26_0= ruleCommands ) )
                    // InternalWh.g:825:5: (lv_commands_26_0= ruleCommands )
                    {
                    // InternalWh.g:825:5: (lv_commands_26_0= ruleCommands )
                    // InternalWh.g:826:6: lv_commands_26_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandsParserRuleCall_5_5_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_commands_26_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"commands",
                      							lv_commands_26_0,
                      							"org.xtext.whpp.mydsl.Wh.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_27=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getCommandAccess().getOdKeyword_5_6());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleExprs"
    // InternalWh.g:852:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalWh.g:852:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalWh.g:853:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // InternalWh.g:859:1: ruleExprs returns [EObject current=null] : ( ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprs_0_0 = null;

        EObject lv_exprs_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:865:2: ( ( ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* ) )
            // InternalWh.g:866:2: ( ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* )
            {
            // InternalWh.g:866:2: ( ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* )
            // InternalWh.g:867:3: ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )*
            {
            // InternalWh.g:867:3: ( (lv_exprs_0_0= ruleExpr ) )
            // InternalWh.g:868:4: (lv_exprs_0_0= ruleExpr )
            {
            // InternalWh.g:868:4: (lv_exprs_0_0= ruleExpr )
            // InternalWh.g:869:5: lv_exprs_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprsAccess().getExprsExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_exprs_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprsRule());
              					}
              					add(
              						current,
              						"exprs",
              						lv_exprs_0_0,
              						"org.xtext.whpp.mydsl.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:886:3: (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWh.g:887:4: otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:891:4: ( (lv_exprs_2_0= ruleExpr ) )
            	    // InternalWh.g:892:5: (lv_exprs_2_0= ruleExpr )
            	    {
            	    // InternalWh.g:892:5: (lv_exprs_2_0= ruleExpr )
            	    // InternalWh.g:893:6: lv_exprs_2_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprsAccess().getExprsExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_exprs_2_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExprsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exprs",
            	      							lv_exprs_2_0,
            	      							"org.xtext.whpp.mydsl.Wh.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpr"
    // InternalWh.g:915:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalWh.g:915:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalWh.g:916:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalWh.g:922:1: ruleExpr returns [EObject current=null] : ( ( ( ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple ) ) ( ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) ) )? ) | ( (lv_exprand_3_0= ruleExprand ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token lv_expr_1_0=null;
        EObject lv_exprsimple1_0_0 = null;

        EObject lv_exprsimple2_2_0 = null;

        EObject lv_exprand_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:928:2: ( ( ( ( ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple ) ) ( ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) ) )? ) | ( (lv_exprand_3_0= ruleExprand ) ) ) )
            // InternalWh.g:929:2: ( ( ( ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple ) ) ( ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) ) )? ) | ( (lv_exprand_3_0= ruleExprand ) ) )
            {
            // InternalWh.g:929:2: ( ( ( ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple ) ) ( ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) ) )? ) | ( (lv_exprand_3_0= ruleExprand ) ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case RULE_SYMBOLE:
            case RULE_VARIABLE:
            case 34:
                {
                alt8=1;
                }
                break;
            case 35:
                {
                int LA8_4 = input.LA(2);

                if ( (synpred14_InternalWh()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt8=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalWh.g:930:3: ( ( ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple ) ) ( ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) ) )? )
                    {
                    // InternalWh.g:930:3: ( ( ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple ) ) ( ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) ) )? )
                    // InternalWh.g:931:4: ( ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple ) ) ( ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) ) )?
                    {
                    // InternalWh.g:931:4: ( ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple ) )
                    // InternalWh.g:932:5: ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple )
                    {
                    // InternalWh.g:936:5: (lv_exprsimple1_0_0= ruleExprsimple )
                    // InternalWh.g:937:6: lv_exprsimple1_0_0= ruleExprsimple
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getExprsimple1ExprsimpleParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_exprsimple1_0_0=ruleExprsimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"exprsimple1",
                      							lv_exprsimple1_0_0,
                      							"org.xtext.whpp.mydsl.Wh.Exprsimple");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalWh.g:954:4: ( ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==33) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalWh.g:955:5: ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) )
                            {
                            // InternalWh.g:955:5: ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) )
                            // InternalWh.g:956:6: ( ( '=?' ) )=> (lv_expr_1_0= '=?' )
                            {
                            // InternalWh.g:960:6: (lv_expr_1_0= '=?' )
                            // InternalWh.g:961:7: lv_expr_1_0= '=?'
                            {
                            lv_expr_1_0=(Token)match(input,33,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_expr_1_0, grammarAccess.getExprAccess().getExprEqualsSignQuestionMarkKeyword_0_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExprRule());
                              							}
                              							setWithLastConsumed(current, "expr", lv_expr_1_0, "=?");
                              						
                            }

                            }


                            }

                            // InternalWh.g:973:5: ( (lv_exprsimple2_2_0= ruleExprsimple ) )
                            // InternalWh.g:974:6: (lv_exprsimple2_2_0= ruleExprsimple )
                            {
                            // InternalWh.g:974:6: (lv_exprsimple2_2_0= ruleExprsimple )
                            // InternalWh.g:975:7: lv_exprsimple2_2_0= ruleExprsimple
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExprAccess().getExprsimple2ExprsimpleParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_exprsimple2_2_0=ruleExprsimple();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExprRule());
                              							}
                              							set(
                              								current,
                              								"exprsimple2",
                              								lv_exprsimple2_2_0,
                              								"org.xtext.whpp.mydsl.Wh.Exprsimple");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWh.g:995:3: ( (lv_exprand_3_0= ruleExprand ) )
                    {
                    // InternalWh.g:995:3: ( (lv_exprand_3_0= ruleExprand ) )
                    // InternalWh.g:996:4: (lv_exprand_3_0= ruleExprand )
                    {
                    // InternalWh.g:996:4: (lv_exprand_3_0= ruleExprand )
                    // InternalWh.g:997:5: lv_exprand_3_0= ruleExprand
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprandExprandParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprand_3_0=ruleExprand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"exprand",
                      						lv_exprand_3_0,
                      						"org.xtext.whpp.mydsl.Wh.Exprand");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprsimple"
    // InternalWh.g:1018:1: entryRuleExprsimple returns [EObject current=null] : iv_ruleExprsimple= ruleExprsimple EOF ;
    public final EObject entryRuleExprsimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprsimple = null;


        try {
            // InternalWh.g:1018:51: (iv_ruleExprsimple= ruleExprsimple EOF )
            // InternalWh.g:1019:2: iv_ruleExprsimple= ruleExprsimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsimpleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprsimple=ruleExprsimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprsimple; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprsimple"


    // $ANTLR start "ruleExprsimple"
    // InternalWh.g:1025:1: ruleExprsimple returns [EObject current=null] : ( ( ( (lv_expr_0_1= 'nil' | lv_expr_0_2= RULE_VARIABLE | lv_expr_0_3= RULE_SYMBOLE ) ) ) | (otherlv_1= '(' ( ( (lv_expr_2_1= 'cons' | lv_expr_2_2= 'list' ) ) ) ( (lv_exprs_3_0= ruleLexpr ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( ( (lv_expr_6_1= 'hd' | lv_expr_6_2= 'tl' ) ) ) ( (lv_expr2_7_0= ruleExpr ) ) otherlv_8= ')' ) | (otherlv_9= '(' ( (lv_expr_10_0= RULE_SYMBOLE ) ) ( (lv_exprs_11_0= ruleLexpr ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleExprsimple() throws RecognitionException {
        EObject current = null;

        Token lv_expr_0_1=null;
        Token lv_expr_0_2=null;
        Token lv_expr_0_3=null;
        Token otherlv_1=null;
        Token lv_expr_2_1=null;
        Token lv_expr_2_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_expr_6_1=null;
        Token lv_expr_6_2=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_expr_10_0=null;
        Token otherlv_12=null;
        EObject lv_exprs_3_0 = null;

        EObject lv_expr2_7_0 = null;

        EObject lv_exprs_11_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1031:2: ( ( ( ( (lv_expr_0_1= 'nil' | lv_expr_0_2= RULE_VARIABLE | lv_expr_0_3= RULE_SYMBOLE ) ) ) | (otherlv_1= '(' ( ( (lv_expr_2_1= 'cons' | lv_expr_2_2= 'list' ) ) ) ( (lv_exprs_3_0= ruleLexpr ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( ( (lv_expr_6_1= 'hd' | lv_expr_6_2= 'tl' ) ) ) ( (lv_expr2_7_0= ruleExpr ) ) otherlv_8= ')' ) | (otherlv_9= '(' ( (lv_expr_10_0= RULE_SYMBOLE ) ) ( (lv_exprs_11_0= ruleLexpr ) ) otherlv_12= ')' ) ) )
            // InternalWh.g:1032:2: ( ( ( (lv_expr_0_1= 'nil' | lv_expr_0_2= RULE_VARIABLE | lv_expr_0_3= RULE_SYMBOLE ) ) ) | (otherlv_1= '(' ( ( (lv_expr_2_1= 'cons' | lv_expr_2_2= 'list' ) ) ) ( (lv_exprs_3_0= ruleLexpr ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( ( (lv_expr_6_1= 'hd' | lv_expr_6_2= 'tl' ) ) ) ( (lv_expr2_7_0= ruleExpr ) ) otherlv_8= ')' ) | (otherlv_9= '(' ( (lv_expr_10_0= RULE_SYMBOLE ) ) ( (lv_exprs_11_0= ruleLexpr ) ) otherlv_12= ')' ) )
            {
            // InternalWh.g:1032:2: ( ( ( (lv_expr_0_1= 'nil' | lv_expr_0_2= RULE_VARIABLE | lv_expr_0_3= RULE_SYMBOLE ) ) ) | (otherlv_1= '(' ( ( (lv_expr_2_1= 'cons' | lv_expr_2_2= 'list' ) ) ) ( (lv_exprs_3_0= ruleLexpr ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( ( (lv_expr_6_1= 'hd' | lv_expr_6_2= 'tl' ) ) ) ( (lv_expr2_7_0= ruleExpr ) ) otherlv_8= ')' ) | (otherlv_9= '(' ( (lv_expr_10_0= RULE_SYMBOLE ) ) ( (lv_exprs_11_0= ruleLexpr ) ) otherlv_12= ')' ) )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_SYMBOLE && LA12_0<=RULE_VARIABLE)||LA12_0==34) ) {
                alt12=1;
            }
            else if ( (LA12_0==35) ) {
                switch ( input.LA(2) ) {
                case 36:
                case 37:
                    {
                    alt12=2;
                    }
                    break;
                case 39:
                case 40:
                    {
                    alt12=3;
                    }
                    break;
                case RULE_SYMBOLE:
                    {
                    alt12=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalWh.g:1033:3: ( ( (lv_expr_0_1= 'nil' | lv_expr_0_2= RULE_VARIABLE | lv_expr_0_3= RULE_SYMBOLE ) ) )
                    {
                    // InternalWh.g:1033:3: ( ( (lv_expr_0_1= 'nil' | lv_expr_0_2= RULE_VARIABLE | lv_expr_0_3= RULE_SYMBOLE ) ) )
                    // InternalWh.g:1034:4: ( (lv_expr_0_1= 'nil' | lv_expr_0_2= RULE_VARIABLE | lv_expr_0_3= RULE_SYMBOLE ) )
                    {
                    // InternalWh.g:1034:4: ( (lv_expr_0_1= 'nil' | lv_expr_0_2= RULE_VARIABLE | lv_expr_0_3= RULE_SYMBOLE ) )
                    // InternalWh.g:1035:5: (lv_expr_0_1= 'nil' | lv_expr_0_2= RULE_VARIABLE | lv_expr_0_3= RULE_SYMBOLE )
                    {
                    // InternalWh.g:1035:5: (lv_expr_0_1= 'nil' | lv_expr_0_2= RULE_VARIABLE | lv_expr_0_3= RULE_SYMBOLE )
                    int alt9=3;
                    switch ( input.LA(1) ) {
                    case 34:
                        {
                        alt9=1;
                        }
                        break;
                    case RULE_VARIABLE:
                        {
                        alt9=2;
                        }
                        break;
                    case RULE_SYMBOLE:
                        {
                        alt9=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // InternalWh.g:1036:6: lv_expr_0_1= 'nil'
                            {
                            lv_expr_0_1=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_expr_0_1, grammarAccess.getExprsimpleAccess().getExprNilKeyword_0_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getExprsimpleRule());
                              						}
                              						setWithLastConsumed(current, "expr", lv_expr_0_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalWh.g:1047:6: lv_expr_0_2= RULE_VARIABLE
                            {
                            lv_expr_0_2=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_expr_0_2, grammarAccess.getExprsimpleAccess().getExprVARIABLETerminalRuleCall_0_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getExprsimpleRule());
                              						}
                              						setWithLastConsumed(
                              							current,
                              							"expr",
                              							lv_expr_0_2,
                              							"org.xtext.whpp.mydsl.Wh.VARIABLE");
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalWh.g:1062:6: lv_expr_0_3= RULE_SYMBOLE
                            {
                            lv_expr_0_3=(Token)match(input,RULE_SYMBOLE,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_expr_0_3, grammarAccess.getExprsimpleAccess().getExprSYMBOLETerminalRuleCall_0_0_2());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getExprsimpleRule());
                              						}
                              						setWithLastConsumed(
                              							current,
                              							"expr",
                              							lv_expr_0_3,
                              							"org.xtext.whpp.mydsl.Wh.SYMBOLE");
                              					
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWh.g:1080:3: (otherlv_1= '(' ( ( (lv_expr_2_1= 'cons' | lv_expr_2_2= 'list' ) ) ) ( (lv_exprs_3_0= ruleLexpr ) ) otherlv_4= ')' )
                    {
                    // InternalWh.g:1080:3: (otherlv_1= '(' ( ( (lv_expr_2_1= 'cons' | lv_expr_2_2= 'list' ) ) ) ( (lv_exprs_3_0= ruleLexpr ) ) otherlv_4= ')' )
                    // InternalWh.g:1081:4: otherlv_1= '(' ( ( (lv_expr_2_1= 'cons' | lv_expr_2_2= 'list' ) ) ) ( (lv_exprs_3_0= ruleLexpr ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getExprsimpleAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalWh.g:1085:4: ( ( (lv_expr_2_1= 'cons' | lv_expr_2_2= 'list' ) ) )
                    // InternalWh.g:1086:5: ( (lv_expr_2_1= 'cons' | lv_expr_2_2= 'list' ) )
                    {
                    // InternalWh.g:1086:5: ( (lv_expr_2_1= 'cons' | lv_expr_2_2= 'list' ) )
                    // InternalWh.g:1087:6: (lv_expr_2_1= 'cons' | lv_expr_2_2= 'list' )
                    {
                    // InternalWh.g:1087:6: (lv_expr_2_1= 'cons' | lv_expr_2_2= 'list' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==36) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==37) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalWh.g:1088:7: lv_expr_2_1= 'cons'
                            {
                            lv_expr_2_1=(Token)match(input,36,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_expr_2_1, grammarAccess.getExprsimpleAccess().getExprConsKeyword_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExprsimpleRule());
                              							}
                              							setWithLastConsumed(current, "expr", lv_expr_2_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalWh.g:1099:7: lv_expr_2_2= 'list'
                            {
                            lv_expr_2_2=(Token)match(input,37,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_expr_2_2, grammarAccess.getExprsimpleAccess().getExprListKeyword_1_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExprsimpleRule());
                              							}
                              							setWithLastConsumed(current, "expr", lv_expr_2_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalWh.g:1112:4: ( (lv_exprs_3_0= ruleLexpr ) )
                    // InternalWh.g:1113:5: (lv_exprs_3_0= ruleLexpr )
                    {
                    // InternalWh.g:1113:5: (lv_exprs_3_0= ruleLexpr )
                    // InternalWh.g:1114:6: lv_exprs_3_0= ruleLexpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprsimpleAccess().getExprsLexprParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_exprs_3_0=ruleLexpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprsimpleRule());
                      						}
                      						set(
                      							current,
                      							"exprs",
                      							lv_exprs_3_0,
                      							"org.xtext.whpp.mydsl.Wh.Lexpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getExprsimpleAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalWh.g:1137:3: (otherlv_5= '(' ( ( (lv_expr_6_1= 'hd' | lv_expr_6_2= 'tl' ) ) ) ( (lv_expr2_7_0= ruleExpr ) ) otherlv_8= ')' )
                    {
                    // InternalWh.g:1137:3: (otherlv_5= '(' ( ( (lv_expr_6_1= 'hd' | lv_expr_6_2= 'tl' ) ) ) ( (lv_expr2_7_0= ruleExpr ) ) otherlv_8= ')' )
                    // InternalWh.g:1138:4: otherlv_5= '(' ( ( (lv_expr_6_1= 'hd' | lv_expr_6_2= 'tl' ) ) ) ( (lv_expr2_7_0= ruleExpr ) ) otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getExprsimpleAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalWh.g:1142:4: ( ( (lv_expr_6_1= 'hd' | lv_expr_6_2= 'tl' ) ) )
                    // InternalWh.g:1143:5: ( (lv_expr_6_1= 'hd' | lv_expr_6_2= 'tl' ) )
                    {
                    // InternalWh.g:1143:5: ( (lv_expr_6_1= 'hd' | lv_expr_6_2= 'tl' ) )
                    // InternalWh.g:1144:6: (lv_expr_6_1= 'hd' | lv_expr_6_2= 'tl' )
                    {
                    // InternalWh.g:1144:6: (lv_expr_6_1= 'hd' | lv_expr_6_2= 'tl' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==39) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==40) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalWh.g:1145:7: lv_expr_6_1= 'hd'
                            {
                            lv_expr_6_1=(Token)match(input,39,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_expr_6_1, grammarAccess.getExprsimpleAccess().getExprHdKeyword_2_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExprsimpleRule());
                              							}
                              							setWithLastConsumed(current, "expr", lv_expr_6_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalWh.g:1156:7: lv_expr_6_2= 'tl'
                            {
                            lv_expr_6_2=(Token)match(input,40,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_expr_6_2, grammarAccess.getExprsimpleAccess().getExprTlKeyword_2_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExprsimpleRule());
                              							}
                              							setWithLastConsumed(current, "expr", lv_expr_6_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalWh.g:1169:4: ( (lv_expr2_7_0= ruleExpr ) )
                    // InternalWh.g:1170:5: (lv_expr2_7_0= ruleExpr )
                    {
                    // InternalWh.g:1170:5: (lv_expr2_7_0= ruleExpr )
                    // InternalWh.g:1171:6: lv_expr2_7_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprsimpleAccess().getExpr2ExprParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_expr2_7_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprsimpleRule());
                      						}
                      						set(
                      							current,
                      							"expr2",
                      							lv_expr2_7_0,
                      							"org.xtext.whpp.mydsl.Wh.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getExprsimpleAccess().getRightParenthesisKeyword_2_3());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalWh.g:1194:3: (otherlv_9= '(' ( (lv_expr_10_0= RULE_SYMBOLE ) ) ( (lv_exprs_11_0= ruleLexpr ) ) otherlv_12= ')' )
                    {
                    // InternalWh.g:1194:3: (otherlv_9= '(' ( (lv_expr_10_0= RULE_SYMBOLE ) ) ( (lv_exprs_11_0= ruleLexpr ) ) otherlv_12= ')' )
                    // InternalWh.g:1195:4: otherlv_9= '(' ( (lv_expr_10_0= RULE_SYMBOLE ) ) ( (lv_exprs_11_0= ruleLexpr ) ) otherlv_12= ')'
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getExprsimpleAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalWh.g:1199:4: ( (lv_expr_10_0= RULE_SYMBOLE ) )
                    // InternalWh.g:1200:5: (lv_expr_10_0= RULE_SYMBOLE )
                    {
                    // InternalWh.g:1200:5: (lv_expr_10_0= RULE_SYMBOLE )
                    // InternalWh.g:1201:6: lv_expr_10_0= RULE_SYMBOLE
                    {
                    lv_expr_10_0=(Token)match(input,RULE_SYMBOLE,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_expr_10_0, grammarAccess.getExprsimpleAccess().getExprSYMBOLETerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprsimpleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"expr",
                      							lv_expr_10_0,
                      							"org.xtext.whpp.mydsl.Wh.SYMBOLE");
                      					
                    }

                    }


                    }

                    // InternalWh.g:1217:4: ( (lv_exprs_11_0= ruleLexpr ) )
                    // InternalWh.g:1218:5: (lv_exprs_11_0= ruleLexpr )
                    {
                    // InternalWh.g:1218:5: (lv_exprs_11_0= ruleLexpr )
                    // InternalWh.g:1219:6: lv_exprs_11_0= ruleLexpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprsimpleAccess().getExprsLexprParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_exprs_11_0=ruleLexpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprsimpleRule());
                      						}
                      						set(
                      							current,
                      							"exprs",
                      							lv_exprs_11_0,
                      							"org.xtext.whpp.mydsl.Wh.Lexpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getExprsimpleAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprsimple"


    // $ANTLR start "entryRuleExprand"
    // InternalWh.g:1245:1: entryRuleExprand returns [EObject current=null] : iv_ruleExprand= ruleExprand EOF ;
    public final EObject entryRuleExprand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprand = null;


        try {
            // InternalWh.g:1245:48: (iv_ruleExprand= ruleExprand EOF )
            // InternalWh.g:1246:2: iv_ruleExprand= ruleExprand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprand=ruleExprand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprand"


    // $ANTLR start "ruleExprand"
    // InternalWh.g:1252:1: ruleExprand returns [EObject current=null] : ( ( (lv_exprG_0_0= ruleExpror ) ) ( ( (lv_expr_1_0= 'and' ) ) ( (lv_exprD_2_0= ruleExprand ) ) )? ) ;
    public final EObject ruleExprand() throws RecognitionException {
        EObject current = null;

        Token lv_expr_1_0=null;
        EObject lv_exprG_0_0 = null;

        EObject lv_exprD_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1258:2: ( ( ( (lv_exprG_0_0= ruleExpror ) ) ( ( (lv_expr_1_0= 'and' ) ) ( (lv_exprD_2_0= ruleExprand ) ) )? ) )
            // InternalWh.g:1259:2: ( ( (lv_exprG_0_0= ruleExpror ) ) ( ( (lv_expr_1_0= 'and' ) ) ( (lv_exprD_2_0= ruleExprand ) ) )? )
            {
            // InternalWh.g:1259:2: ( ( (lv_exprG_0_0= ruleExpror ) ) ( ( (lv_expr_1_0= 'and' ) ) ( (lv_exprD_2_0= ruleExprand ) ) )? )
            // InternalWh.g:1260:3: ( (lv_exprG_0_0= ruleExpror ) ) ( ( (lv_expr_1_0= 'and' ) ) ( (lv_exprD_2_0= ruleExprand ) ) )?
            {
            // InternalWh.g:1260:3: ( (lv_exprG_0_0= ruleExpror ) )
            // InternalWh.g:1261:4: (lv_exprG_0_0= ruleExpror )
            {
            // InternalWh.g:1261:4: (lv_exprG_0_0= ruleExpror )
            // InternalWh.g:1262:5: lv_exprG_0_0= ruleExpror
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprandAccess().getExprGExprorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_exprG_0_0=ruleExpror();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprandRule());
              					}
              					set(
              						current,
              						"exprG",
              						lv_exprG_0_0,
              						"org.xtext.whpp.mydsl.Wh.Expror");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:1279:3: ( ( (lv_expr_1_0= 'and' ) ) ( (lv_exprD_2_0= ruleExprand ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalWh.g:1280:4: ( (lv_expr_1_0= 'and' ) ) ( (lv_exprD_2_0= ruleExprand ) )
                    {
                    // InternalWh.g:1280:4: ( (lv_expr_1_0= 'and' ) )
                    // InternalWh.g:1281:5: (lv_expr_1_0= 'and' )
                    {
                    // InternalWh.g:1281:5: (lv_expr_1_0= 'and' )
                    // InternalWh.g:1282:6: lv_expr_1_0= 'and'
                    {
                    lv_expr_1_0=(Token)match(input,41,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_expr_1_0, grammarAccess.getExprandAccess().getExprAndKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprandRule());
                      						}
                      						setWithLastConsumed(current, "expr", lv_expr_1_0, "and");
                      					
                    }

                    }


                    }

                    // InternalWh.g:1294:4: ( (lv_exprD_2_0= ruleExprand ) )
                    // InternalWh.g:1295:5: (lv_exprD_2_0= ruleExprand )
                    {
                    // InternalWh.g:1295:5: (lv_exprD_2_0= ruleExprand )
                    // InternalWh.g:1296:6: lv_exprD_2_0= ruleExprand
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprandAccess().getExprDExprandParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprD_2_0=ruleExprand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprandRule());
                      						}
                      						set(
                      							current,
                      							"exprD",
                      							lv_exprD_2_0,
                      							"org.xtext.whpp.mydsl.Wh.Exprand");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprand"


    // $ANTLR start "entryRuleExpror"
    // InternalWh.g:1318:1: entryRuleExpror returns [EObject current=null] : iv_ruleExpror= ruleExpror EOF ;
    public final EObject entryRuleExpror() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpror = null;


        try {
            // InternalWh.g:1318:47: (iv_ruleExpror= ruleExpror EOF )
            // InternalWh.g:1319:2: iv_ruleExpror= ruleExpror EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpror=ruleExpror();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpror; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpror"


    // $ANTLR start "ruleExpror"
    // InternalWh.g:1325:1: ruleExpror returns [EObject current=null] : ( ( (lv_exprG_0_0= ruleExprnot ) ) ( ( (lv_expr_1_0= 'or' ) ) ( (lv_exprD_2_0= ruleExpror ) ) )? ) ;
    public final EObject ruleExpror() throws RecognitionException {
        EObject current = null;

        Token lv_expr_1_0=null;
        EObject lv_exprG_0_0 = null;

        EObject lv_exprD_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1331:2: ( ( ( (lv_exprG_0_0= ruleExprnot ) ) ( ( (lv_expr_1_0= 'or' ) ) ( (lv_exprD_2_0= ruleExpror ) ) )? ) )
            // InternalWh.g:1332:2: ( ( (lv_exprG_0_0= ruleExprnot ) ) ( ( (lv_expr_1_0= 'or' ) ) ( (lv_exprD_2_0= ruleExpror ) ) )? )
            {
            // InternalWh.g:1332:2: ( ( (lv_exprG_0_0= ruleExprnot ) ) ( ( (lv_expr_1_0= 'or' ) ) ( (lv_exprD_2_0= ruleExpror ) ) )? )
            // InternalWh.g:1333:3: ( (lv_exprG_0_0= ruleExprnot ) ) ( ( (lv_expr_1_0= 'or' ) ) ( (lv_exprD_2_0= ruleExpror ) ) )?
            {
            // InternalWh.g:1333:3: ( (lv_exprG_0_0= ruleExprnot ) )
            // InternalWh.g:1334:4: (lv_exprG_0_0= ruleExprnot )
            {
            // InternalWh.g:1334:4: (lv_exprG_0_0= ruleExprnot )
            // InternalWh.g:1335:5: lv_exprG_0_0= ruleExprnot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprorAccess().getExprGExprnotParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_exprG_0_0=ruleExprnot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprorRule());
              					}
              					set(
              						current,
              						"exprG",
              						lv_exprG_0_0,
              						"org.xtext.whpp.mydsl.Wh.Exprnot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:1352:3: ( ( (lv_expr_1_0= 'or' ) ) ( (lv_exprD_2_0= ruleExpror ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalWh.g:1353:4: ( (lv_expr_1_0= 'or' ) ) ( (lv_exprD_2_0= ruleExpror ) )
                    {
                    // InternalWh.g:1353:4: ( (lv_expr_1_0= 'or' ) )
                    // InternalWh.g:1354:5: (lv_expr_1_0= 'or' )
                    {
                    // InternalWh.g:1354:5: (lv_expr_1_0= 'or' )
                    // InternalWh.g:1355:6: lv_expr_1_0= 'or'
                    {
                    lv_expr_1_0=(Token)match(input,42,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_expr_1_0, grammarAccess.getExprorAccess().getExprOrKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprorRule());
                      						}
                      						setWithLastConsumed(current, "expr", lv_expr_1_0, "or");
                      					
                    }

                    }


                    }

                    // InternalWh.g:1367:4: ( (lv_exprD_2_0= ruleExpror ) )
                    // InternalWh.g:1368:5: (lv_exprD_2_0= ruleExpror )
                    {
                    // InternalWh.g:1368:5: (lv_exprD_2_0= ruleExpror )
                    // InternalWh.g:1369:6: lv_exprD_2_0= ruleExpror
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprorAccess().getExprDExprorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprD_2_0=ruleExpror();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprorRule());
                      						}
                      						set(
                      							current,
                      							"exprD",
                      							lv_exprD_2_0,
                      							"org.xtext.whpp.mydsl.Wh.Expror");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpror"


    // $ANTLR start "entryRuleExprnot"
    // InternalWh.g:1391:1: entryRuleExprnot returns [EObject current=null] : iv_ruleExprnot= ruleExprnot EOF ;
    public final EObject entryRuleExprnot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprnot = null;


        try {
            // InternalWh.g:1391:48: (iv_ruleExprnot= ruleExprnot EOF )
            // InternalWh.g:1392:2: iv_ruleExprnot= ruleExprnot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprnotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprnot=ruleExprnot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprnot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprnot"


    // $ANTLR start "ruleExprnot"
    // InternalWh.g:1398:1: ruleExprnot returns [EObject current=null] : ( ( (lv_expr_0_0= 'not' ) )? ( (lv_expr2_1_0= ruleExpreq ) ) ) ;
    public final EObject ruleExprnot() throws RecognitionException {
        EObject current = null;

        Token lv_expr_0_0=null;
        EObject lv_expr2_1_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1404:2: ( ( ( (lv_expr_0_0= 'not' ) )? ( (lv_expr2_1_0= ruleExpreq ) ) ) )
            // InternalWh.g:1405:2: ( ( (lv_expr_0_0= 'not' ) )? ( (lv_expr2_1_0= ruleExpreq ) ) )
            {
            // InternalWh.g:1405:2: ( ( (lv_expr_0_0= 'not' ) )? ( (lv_expr2_1_0= ruleExpreq ) ) )
            // InternalWh.g:1406:3: ( (lv_expr_0_0= 'not' ) )? ( (lv_expr2_1_0= ruleExpreq ) )
            {
            // InternalWh.g:1406:3: ( (lv_expr_0_0= 'not' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalWh.g:1407:4: (lv_expr_0_0= 'not' )
                    {
                    // InternalWh.g:1407:4: (lv_expr_0_0= 'not' )
                    // InternalWh.g:1408:5: lv_expr_0_0= 'not'
                    {
                    lv_expr_0_0=(Token)match(input,43,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_expr_0_0, grammarAccess.getExprnotAccess().getExprNotKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprnotRule());
                      					}
                      					setWithLastConsumed(current, "expr", lv_expr_0_0, "not");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalWh.g:1420:3: ( (lv_expr2_1_0= ruleExpreq ) )
            // InternalWh.g:1421:4: (lv_expr2_1_0= ruleExpreq )
            {
            // InternalWh.g:1421:4: (lv_expr2_1_0= ruleExpreq )
            // InternalWh.g:1422:5: lv_expr2_1_0= ruleExpreq
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprnotAccess().getExpr2ExpreqParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr2_1_0=ruleExpreq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprnotRule());
              					}
              					set(
              						current,
              						"expr2",
              						lv_expr2_1_0,
              						"org.xtext.whpp.mydsl.Wh.Expreq");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprnot"


    // $ANTLR start "entryRuleExpreq"
    // InternalWh.g:1443:1: entryRuleExpreq returns [EObject current=null] : iv_ruleExpreq= ruleExpreq EOF ;
    public final EObject entryRuleExpreq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpreq = null;


        try {
            // InternalWh.g:1443:47: (iv_ruleExpreq= ruleExpreq EOF )
            // InternalWh.g:1444:2: iv_ruleExpreq= ruleExpreq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpreqRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpreq=ruleExpreq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpreq; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpreq"


    // $ANTLR start "ruleExpreq"
    // InternalWh.g:1450:1: ruleExpreq returns [EObject current=null] : (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' ) ;
    public final EObject ruleExpreq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1456:2: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' ) )
            // InternalWh.g:1457:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' )
            {
            // InternalWh.g:1457:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' )
            // InternalWh.g:1458:3: otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpreqAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalWh.g:1462:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWh.g:1463:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWh.g:1463:4: (lv_expr_1_0= ruleExpr )
            // InternalWh.g:1464:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpreqAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpreqRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.whpp.mydsl.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExpreqAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpreq"


    // $ANTLR start "entryRuleLexpr"
    // InternalWh.g:1489:1: entryRuleLexpr returns [EObject current=null] : iv_ruleLexpr= ruleLexpr EOF ;
    public final EObject entryRuleLexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexpr = null;


        try {
            // InternalWh.g:1489:46: (iv_ruleLexpr= ruleLexpr EOF )
            // InternalWh.g:1490:2: iv_ruleLexpr= ruleLexpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLexprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLexpr=ruleLexpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLexpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexpr"


    // $ANTLR start "ruleLexpr"
    // InternalWh.g:1496:1: ruleLexpr returns [EObject current=null] : ( (lv_exprs_0_0= ruleExpr ) )+ ;
    public final EObject ruleLexpr() throws RecognitionException {
        EObject current = null;

        EObject lv_exprs_0_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1502:2: ( ( (lv_exprs_0_0= ruleExpr ) )+ )
            // InternalWh.g:1503:2: ( (lv_exprs_0_0= ruleExpr ) )+
            {
            // InternalWh.g:1503:2: ( (lv_exprs_0_0= ruleExpr ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_SYMBOLE && LA16_0<=RULE_VARIABLE)||(LA16_0>=34 && LA16_0<=35)||LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalWh.g:1504:3: (lv_exprs_0_0= ruleExpr )
            	    {
            	    // InternalWh.g:1504:3: (lv_exprs_0_0= ruleExpr )
            	    // InternalWh.g:1505:4: lv_exprs_0_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLexprAccess().getExprsExprParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_exprs_0_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getLexprRule());
            	      				}
            	      				add(
            	      					current,
            	      					"exprs",
            	      					lv_exprs_0_0,
            	      					"org.xtext.whpp.mydsl.Wh.Expr");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexpr"

    // $ANTLR start synpred14_InternalWh
    public final void synpred14_InternalWh_fragment() throws RecognitionException {   
        Token lv_expr_1_0=null;
        EObject lv_exprsimple1_0_0 = null;

        EObject lv_exprsimple2_2_0 = null;


        // InternalWh.g:930:3: ( ( ( ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple ) ) ( ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) ) )? ) )
        // InternalWh.g:930:3: ( ( ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple ) ) ( ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) ) )? )
        {
        // InternalWh.g:930:3: ( ( ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple ) ) ( ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) ) )? )
        // InternalWh.g:931:4: ( ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple ) ) ( ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) ) )?
        {
        // InternalWh.g:931:4: ( ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple ) )
        // InternalWh.g:932:5: ( ( ruleExprsimple ) )=> (lv_exprsimple1_0_0= ruleExprsimple )
        {
        // InternalWh.g:936:5: (lv_exprsimple1_0_0= ruleExprsimple )
        // InternalWh.g:937:6: lv_exprsimple1_0_0= ruleExprsimple
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getExprAccess().getExprsimple1ExprsimpleParserRuleCall_0_0_0());
          					
        }
        pushFollow(FOLLOW_21);
        lv_exprsimple1_0_0=ruleExprsimple();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalWh.g:954:4: ( ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) ) )?
        int alt18=2;
        int LA18_0 = input.LA(1);

        if ( (LA18_0==33) ) {
            alt18=1;
        }
        switch (alt18) {
            case 1 :
                // InternalWh.g:955:5: ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) ) ( (lv_exprsimple2_2_0= ruleExprsimple ) )
                {
                // InternalWh.g:955:5: ( ( ( '=?' ) )=> (lv_expr_1_0= '=?' ) )
                // InternalWh.g:956:6: ( ( '=?' ) )=> (lv_expr_1_0= '=?' )
                {
                // InternalWh.g:960:6: (lv_expr_1_0= '=?' )
                // InternalWh.g:961:7: lv_expr_1_0= '=?'
                {
                lv_expr_1_0=(Token)match(input,33,FOLLOW_22); if (state.failed) return ;

                }


                }

                // InternalWh.g:973:5: ( (lv_exprsimple2_2_0= ruleExprsimple ) )
                // InternalWh.g:974:6: (lv_exprsimple2_2_0= ruleExprsimple )
                {
                // InternalWh.g:974:6: (lv_exprsimple2_2_0= ruleExprsimple )
                // InternalWh.g:975:7: lv_exprsimple2_2_0= ruleExprsimple
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getExprAccess().getExprsimple2ExprsimpleParserRuleCall_0_1_1_0());
                  						
                }
                pushFollow(FOLLOW_2);
                lv_exprsimple2_2_0=ruleExprsimple();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalWh

    // Delegated rules

    public final boolean synpred14_InternalWh() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalWh_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000008CA00020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080C00000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000C00000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080C00000032L});

}