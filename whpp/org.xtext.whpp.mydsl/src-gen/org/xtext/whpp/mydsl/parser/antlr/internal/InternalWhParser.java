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

@SuppressWarnings("all")
public class InternalWhParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_MAJUSCULE", "RULE_MINUSCULE", "RULE_DIGIT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'"
    };
    public static final int RULE_MAJUSCULE=5;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_MINUSCULE=6;
    public static final int RULE_WS=12;
    public static final int RULE_DIGIT=7;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalWh.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalWh.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalWh.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalWh.g:71:1: ruleModel returns [EObject current=null] : ( (lv_program_0_0= ruleProgram ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;



        	enterRule();

        try {
            // InternalWh.g:77:2: ( ( (lv_program_0_0= ruleProgram ) ) )
            // InternalWh.g:78:2: ( (lv_program_0_0= ruleProgram ) )
            {
            // InternalWh.g:78:2: ( (lv_program_0_0= ruleProgram ) )
            // InternalWh.g:79:3: (lv_program_0_0= ruleProgram )
            {
            // InternalWh.g:79:3: (lv_program_0_0= ruleProgram )
            // InternalWh.g:80:4: lv_program_0_0= ruleProgram
            {

            				newCompositeNode(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_program_0_0=ruleProgram();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"program",
            					lv_program_0_0,
            					"org.xtext.whpp.mydsl.Wh.Program");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleProgram"
    // InternalWh.g:100:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalWh.g:100:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalWh.g:101:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWh.g:107:1: ruleProgram returns [EObject current=null] : ( ( (lv_function_0_0= ruleFunction ) ) (otherlv_1= '\\n' )+ ( (lv_program_2_0= ruleProgram ) )? ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_function_0_0 = null;

        EObject lv_program_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:113:2: ( ( ( (lv_function_0_0= ruleFunction ) ) (otherlv_1= '\\n' )+ ( (lv_program_2_0= ruleProgram ) )? ) )
            // InternalWh.g:114:2: ( ( (lv_function_0_0= ruleFunction ) ) (otherlv_1= '\\n' )+ ( (lv_program_2_0= ruleProgram ) )? )
            {
            // InternalWh.g:114:2: ( ( (lv_function_0_0= ruleFunction ) ) (otherlv_1= '\\n' )+ ( (lv_program_2_0= ruleProgram ) )? )
            // InternalWh.g:115:3: ( (lv_function_0_0= ruleFunction ) ) (otherlv_1= '\\n' )+ ( (lv_program_2_0= ruleProgram ) )?
            {
            // InternalWh.g:115:3: ( (lv_function_0_0= ruleFunction ) )
            // InternalWh.g:116:4: (lv_function_0_0= ruleFunction )
            {
            // InternalWh.g:116:4: (lv_function_0_0= ruleFunction )
            // InternalWh.g:117:5: lv_function_0_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getFunctionFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_function_0_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_0_0,
            						"org.xtext.whpp.mydsl.Wh.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWh.g:134:3: (otherlv_1= '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWh.g:135:4: otherlv_1= '\\n'
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getLineFeedKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalWh.g:140:3: ( (lv_program_2_0= ruleProgram ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalWh.g:141:4: (lv_program_2_0= ruleProgram )
                    {
                    // InternalWh.g:141:4: (lv_program_2_0= ruleProgram )
                    // InternalWh.g:142:5: lv_program_2_0= ruleProgram
                    {

                    					newCompositeNode(grammarAccess.getProgramAccess().getProgramProgramParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_program_2_0=ruleProgram();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProgramRule());
                    					}
                    					set(
                    						current,
                    						"program",
                    						lv_program_2_0,
                    						"org.xtext.whpp.mydsl.Wh.Program");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // InternalWh.g:163:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalWh.g:163:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalWh.g:164:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalWh.g:170:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:176:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) )
            // InternalWh.g:177:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            {
            // InternalWh.g:177:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            // InternalWh.g:178:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalWh.g:182:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWh.g:183:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWh.g:183:4: (lv_name_1_0= RULE_ID )
            // InternalWh.g:184:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
            		
            // InternalWh.g:204:3: ( (lv_definition_3_0= ruleDefinition ) )
            // InternalWh.g:205:4: (lv_definition_3_0= ruleDefinition )
            {
            // InternalWh.g:205:4: (lv_definition_3_0= ruleDefinition )
            // InternalWh.g:206:5: lv_definition_3_0= ruleDefinition
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_definition_3_0=ruleDefinition();

            state._fsp--;


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


            	leaveRule();

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
    // InternalWh.g:227:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalWh.g:227:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalWh.g:228:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalWh.g:234:1: ruleDefinition returns [EObject current=null] : ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) ) (otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) ) (otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) ) ;
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
            // InternalWh.g:240:2: ( ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) ) (otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) ) (otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) ) )
            // InternalWh.g:241:2: ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) ) (otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) ) (otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) )
            {
            // InternalWh.g:241:2: ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) ) (otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) ) (otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) )
            // InternalWh.g:242:3: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) ) (otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) ) (otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            {
            // InternalWh.g:242:3: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) )
            // InternalWh.g:243:4: otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            				newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0_0());
            			
            // InternalWh.g:247:4: ( (lv_input_1_0= ruleInput ) )
            // InternalWh.g:248:5: (lv_input_1_0= ruleInput )
            {
            // InternalWh.g:248:5: (lv_input_1_0= ruleInput )
            // InternalWh.g:249:6: lv_input_1_0= ruleInput
            {

            						newCompositeNode(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_9);
            lv_input_1_0=ruleInput();

            state._fsp--;


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

            // InternalWh.g:267:3: (otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) )
            // InternalWh.g:268:4: otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) )
            {
            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            				newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_1_0());
            			
            // InternalWh.g:272:4: ( (lv_commands_3_0= ruleCommands ) )
            // InternalWh.g:273:5: (lv_commands_3_0= ruleCommands )
            {
            // InternalWh.g:273:5: (lv_commands_3_0= ruleCommands )
            // InternalWh.g:274:6: lv_commands_3_0= ruleCommands
            {

            						newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_9);
            lv_commands_3_0=ruleCommands();

            state._fsp--;


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

            // InternalWh.g:292:3: (otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            // InternalWh.g:293:4: otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) )
            {
            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            				newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2_0());
            			
            otherlv_5=(Token)match(input,19,FOLLOW_8); 

            				newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_2_1());
            			
            // InternalWh.g:301:4: ( (lv_output_6_0= ruleOutput ) )
            // InternalWh.g:302:5: (lv_output_6_0= ruleOutput )
            {
            // InternalWh.g:302:5: (lv_output_6_0= ruleOutput )
            // InternalWh.g:303:6: lv_output_6_0= ruleOutput
            {

            						newCompositeNode(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_2);
            lv_output_6_0=ruleOutput();

            state._fsp--;


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


            	leaveRule();

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
    // InternalWh.g:325:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalWh.g:325:46: (iv_ruleInput= ruleInput EOF )
            // InternalWh.g:326:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalWh.g:332:1: ruleInput returns [EObject current=null] : ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_variable_0_0 = null;

        EObject lv_input_2_0 = null;

        AntlrDatatypeRuleToken lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:338:2: ( ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) )
            // InternalWh.g:339:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) ) ) | ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // InternalWh.g:339:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) ) ) | ( (lv_variable_3_0= ruleVariable ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_MAJUSCULE) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==20) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||LA3_1==18) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWh.g:340:3: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) ) )
                    {
                    // InternalWh.g:340:3: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) ) )
                    // InternalWh.g:341:4: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) )
                    {
                    // InternalWh.g:341:4: ( (lv_variable_0_0= ruleVariable ) )
                    // InternalWh.g:342:5: (lv_variable_0_0= ruleVariable )
                    {
                    // InternalWh.g:342:5: (lv_variable_0_0= ruleVariable )
                    // InternalWh.g:343:6: lv_variable_0_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getInputAccess().getVariableVariableParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_variable_0_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_0_0,
                    							"org.xtext.whpp.mydsl.Wh.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_0_1());
                    			
                    // InternalWh.g:364:4: ( (lv_input_2_0= ruleInput ) )
                    // InternalWh.g:365:5: (lv_input_2_0= ruleInput )
                    {
                    // InternalWh.g:365:5: (lv_input_2_0= ruleInput )
                    // InternalWh.g:366:6: lv_input_2_0= ruleInput
                    {

                    						newCompositeNode(grammarAccess.getInputAccess().getInputInputParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_input_2_0=ruleInput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputRule());
                    						}
                    						set(
                    							current,
                    							"input",
                    							lv_input_2_0,
                    							"org.xtext.whpp.mydsl.Wh.Input");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWh.g:385:3: ( (lv_variable_3_0= ruleVariable ) )
                    {
                    // InternalWh.g:385:3: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalWh.g:386:4: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalWh.g:386:4: (lv_variable_3_0= ruleVariable )
                    // InternalWh.g:387:5: lv_variable_3_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getInputAccess().getVariableVariableParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_3_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInputRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_3_0,
                    						"org.xtext.whpp.mydsl.Wh.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalWh.g:408:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalWh.g:408:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalWh.g:409:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalWh.g:415:1: ruleOutput returns [EObject current=null] : ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_variable_0_0 = null;

        EObject lv_output_2_0 = null;

        AntlrDatatypeRuleToken lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:421:2: ( ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) )
            // InternalWh.g:422:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) ) ) | ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // InternalWh.g:422:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) ) ) | ( (lv_variable_3_0= ruleVariable ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_MAJUSCULE) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==14) ) {
                    alt4=2;
                }
                else if ( (LA4_1==20) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalWh.g:423:3: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) ) )
                    {
                    // InternalWh.g:423:3: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) ) )
                    // InternalWh.g:424:4: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) )
                    {
                    // InternalWh.g:424:4: ( (lv_variable_0_0= ruleVariable ) )
                    // InternalWh.g:425:5: (lv_variable_0_0= ruleVariable )
                    {
                    // InternalWh.g:425:5: (lv_variable_0_0= ruleVariable )
                    // InternalWh.g:426:6: lv_variable_0_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getVariableVariableParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_variable_0_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_0_0,
                    							"org.xtext.whpp.mydsl.Wh.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_0_1());
                    			
                    // InternalWh.g:447:4: ( (lv_output_2_0= ruleOutput ) )
                    // InternalWh.g:448:5: (lv_output_2_0= ruleOutput )
                    {
                    // InternalWh.g:448:5: (lv_output_2_0= ruleOutput )
                    // InternalWh.g:449:6: lv_output_2_0= ruleOutput
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getOutputOutputParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_output_2_0=ruleOutput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"output",
                    							lv_output_2_0,
                    							"org.xtext.whpp.mydsl.Wh.Output");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWh.g:468:3: ( (lv_variable_3_0= ruleVariable ) )
                    {
                    // InternalWh.g:468:3: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalWh.g:469:4: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalWh.g:469:4: (lv_variable_3_0= ruleVariable )
                    // InternalWh.g:470:5: lv_variable_3_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getOutputAccess().getVariableVariableParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_3_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOutputRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_3_0,
                    						"org.xtext.whpp.mydsl.Wh.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleVariable"
    // InternalWh.g:491:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // InternalWh.g:491:48: (iv_ruleVariable= ruleVariable EOF )
            // InternalWh.g:492:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalWh.g:498:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_MAJUSCULE_0= RULE_MAJUSCULE ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MAJUSCULE_0=null;


        	enterRule();

        try {
            // InternalWh.g:504:2: (this_MAJUSCULE_0= RULE_MAJUSCULE )
            // InternalWh.g:505:2: this_MAJUSCULE_0= RULE_MAJUSCULE
            {
            this_MAJUSCULE_0=(Token)match(input,RULE_MAJUSCULE,FOLLOW_2); 

            		current.merge(this_MAJUSCULE_0);
            	

            		newLeafNode(this_MAJUSCULE_0, grammarAccess.getVariableAccess().getMAJUSCULETerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCommands"
    // InternalWh.g:515:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalWh.g:515:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalWh.g:516:2: iv_ruleCommands= ruleCommands EOF
            {
             newCompositeNode(grammarAccess.getCommandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;

             current =iv_ruleCommands; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalWh.g:522:1: ruleCommands returns [EObject current=null] : ( ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) ) | ( (lv_command_3_0= ruleCommand ) ) ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_command_0_0 = null;

        EObject lv_commands_2_0 = null;

        AntlrDatatypeRuleToken lv_command_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:528:2: ( ( ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) ) | ( (lv_command_3_0= ruleCommand ) ) ) )
            // InternalWh.g:529:2: ( ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) ) | ( (lv_command_3_0= ruleCommand ) ) )
            {
            // InternalWh.g:529:2: ( ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) ) | ( (lv_command_3_0= ruleCommand ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==18) ) {
                    alt5=2;
                }
                else if ( (LA5_1==21) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalWh.g:530:3: ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) )
                    {
                    // InternalWh.g:530:3: ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) )
                    // InternalWh.g:531:4: ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) )
                    {
                    // InternalWh.g:531:4: ( (lv_command_0_0= ruleCommand ) )
                    // InternalWh.g:532:5: (lv_command_0_0= ruleCommand )
                    {
                    // InternalWh.g:532:5: (lv_command_0_0= ruleCommand )
                    // InternalWh.g:533:6: lv_command_0_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getCommandsAccess().getCommandCommandParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_command_0_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandsRule());
                    						}
                    						set(
                    							current,
                    							"command",
                    							lv_command_0_0,
                    							"org.xtext.whpp.mydsl.Wh.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_0_1());
                    			
                    // InternalWh.g:554:4: ( (lv_commands_2_0= ruleCommands ) )
                    // InternalWh.g:555:5: (lv_commands_2_0= ruleCommands )
                    {
                    // InternalWh.g:555:5: (lv_commands_2_0= ruleCommands )
                    // InternalWh.g:556:6: lv_commands_2_0= ruleCommands
                    {

                    						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandsParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_commands_2_0=ruleCommands();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandsRule());
                    						}
                    						set(
                    							current,
                    							"commands",
                    							lv_commands_2_0,
                    							"org.xtext.whpp.mydsl.Wh.Commands");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWh.g:575:3: ( (lv_command_3_0= ruleCommand ) )
                    {
                    // InternalWh.g:575:3: ( (lv_command_3_0= ruleCommand ) )
                    // InternalWh.g:576:4: (lv_command_3_0= ruleCommand )
                    {
                    // InternalWh.g:576:4: (lv_command_3_0= ruleCommand )
                    // InternalWh.g:577:5: lv_command_3_0= ruleCommand
                    {

                    					newCompositeNode(grammarAccess.getCommandsAccess().getCommandCommandParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_command_3_0=ruleCommand();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandsRule());
                    					}
                    					set(
                    						current,
                    						"command",
                    						lv_command_3_0,
                    						"org.xtext.whpp.mydsl.Wh.Command");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalWh.g:598:1: entryRuleCommand returns [String current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final String entryRuleCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommand = null;


        try {
            // InternalWh.g:598:47: (iv_ruleCommand= ruleCommand EOF )
            // InternalWh.g:599:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalWh.g:605:1: ruleCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'nop' ;
    public final AntlrDatatypeRuleToken ruleCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWh.g:611:2: (kw= 'nop' )
            // InternalWh.g:612:2: kw= 'nop'
            {
            kw=(Token)match(input,22,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCommandAccess().getNopKeyword());
            	

            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});

}