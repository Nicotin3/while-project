package org.xtext.whpp.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWhLexer extends Lexer {
    public static final int RULE_MAJUSCULE=4;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
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

    public InternalWhLexer() {;} 
    public InternalWhLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalWhLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalWh.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:11:7: ( 'nop' )
            // InternalWh.g:11:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:12:7: ( '\\n' )
            // InternalWh.g:12:9: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:13:7: ( 'function' )
            // InternalWh.g:13:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:14:7: ( ':' )
            // InternalWh.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:15:7: ( 'read' )
            // InternalWh.g:15:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:16:7: ( '%' )
            // InternalWh.g:16:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:17:7: ( 'write' )
            // InternalWh.g:17:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:18:7: ( ',' )
            // InternalWh.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:19:7: ( ';' )
            // InternalWh.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_MAJUSCULE"
    public final void mRULE_MAJUSCULE() throws RecognitionException {
        try {
            int _type = RULE_MAJUSCULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1304:16: ( 'A' .. 'Z' )
            // InternalWh.g:1304:18: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAJUSCULE"

    // $ANTLR start "RULE_MINUSCULE"
    public final void mRULE_MINUSCULE() throws RecognitionException {
        try {
            int _type = RULE_MINUSCULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1306:16: ( 'a' .. 'z' )
            // InternalWh.g:1306:18: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUSCULE"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1308:12: ( '0' .. '9' )
            // InternalWh.g:1308:14: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1310:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalWh.g:1310:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalWh.g:1310:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalWh.g:1310:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalWh.g:1310:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWh.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1312:10: ( ( '0' .. '9' )+ )
            // InternalWh.g:1312:12: ( '0' .. '9' )+
            {
            // InternalWh.g:1312:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWh.g:1312:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1314:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalWh.g:1314:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalWh.g:1314:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalWh.g:1314:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalWh.g:1314:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalWh.g:1314:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWh.g:1314:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalWh.g:1314:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalWh.g:1314:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalWh.g:1314:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWh.g:1314:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1316:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalWh.g:1316:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalWh.g:1316:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWh.g:1316:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1318:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalWh.g:1318:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalWh.g:1318:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWh.g:1318:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalWh.g:1318:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalWh.g:1318:41: ( '\\r' )? '\\n'
                    {
                    // InternalWh.g:1318:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalWh.g:1318:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1320:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalWh.g:1320:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalWh.g:1320:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalWh.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1322:16: ( . )
            // InternalWh.g:1322:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalWh.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_MAJUSCULE | RULE_MINUSCULE | RULE_DIGIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=19;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalWh.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalWh.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalWh.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalWh.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalWh.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalWh.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalWh.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalWh.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalWh.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalWh.g:1:64: RULE_MAJUSCULE
                {
                mRULE_MAJUSCULE(); 

                }
                break;
            case 11 :
                // InternalWh.g:1:79: RULE_MINUSCULE
                {
                mRULE_MINUSCULE(); 

                }
                break;
            case 12 :
                // InternalWh.g:1:94: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 13 :
                // InternalWh.g:1:105: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // InternalWh.g:1:113: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 15 :
                // InternalWh.g:1:122: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // InternalWh.g:1:134: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // InternalWh.g:1:150: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // InternalWh.g:1:166: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // InternalWh.g:1:174: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\25\1\27\1\25\1\uffff\1\25\1\uffff\1\25\2\uffff\1\40\1\25\1\41\1\23\1\uffff\3\23\2\uffff\1\26\4\uffff\1\26\1\uffff\1\26\1\uffff\1\26\10\uffff\1\52\3\26\1\uffff\1\26\1\57\2\26\1\uffff\1\62\1\26\1\uffff\1\26\1\65\1\uffff";
    static final String DFA12_eofS =
        "\66\uffff";
    static final String DFA12_minS =
        "\1\0\1\60\1\11\1\60\1\uffff\1\60\1\uffff\1\60\2\uffff\3\60\1\101\1\uffff\2\0\1\52\2\uffff\1\160\4\uffff\1\156\1\uffff\1\141\1\uffff\1\151\10\uffff\1\60\1\143\1\144\1\164\1\uffff\1\164\1\60\1\145\1\151\1\uffff\1\60\1\157\1\uffff\1\156\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\172\1\40\1\172\1\uffff\1\172\1\uffff\1\172\2\uffff\2\172\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\160\4\uffff\1\156\1\uffff\1\141\1\uffff\1\151\10\uffff\1\172\1\143\1\144\1\164\1\uffff\1\164\1\172\1\145\1\151\1\uffff\1\172\1\157\1\uffff\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\uffff\1\10\1\11\4\uffff\1\15\3\uffff\1\22\1\23\1\uffff\1\13\1\15\1\2\1\22\1\uffff\1\4\1\uffff\1\6\1\uffff\1\10\1\11\1\12\1\14\1\16\1\17\1\20\1\21\4\uffff\1\1\4\uffff\1\5\2\uffff\1\7\2\uffff\1\3";
    static final String DFA12_specialS =
        "\1\2\16\uffff\1\0\1\1\45\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\23\1\22\1\2\2\23\1\22\22\23\1\22\1\23\1\17\2\23\1\6\1\23\1\20\4\23\1\10\2\23\1\21\12\14\1\4\1\11\5\23\32\12\3\23\1\15\1\16\1\23\5\13\1\3\7\13\1\1\3\13\1\5\4\13\1\7\3\13\uff85\23",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\16\26\1\24\13\26",
            "\2\30\2\uffff\1\30\22\uffff\1\30",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\24\26\1\31\5\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\4\26\1\33\25\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\21\26\1\35\10\26",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\42",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\0\43",
            "\0\43",
            "\1\44\4\uffff\1\45",
            "",
            "",
            "\1\46",
            "",
            "",
            "",
            "",
            "\1\47",
            "",
            "\1\50",
            "",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "\1\56",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\60",
            "\1\61",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\63",
            "",
            "\1\64",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_MAJUSCULE | RULE_MINUSCULE | RULE_DIGIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_15 = input.LA(1);

                        s = -1;
                        if ( ((LA12_15>='\u0000' && LA12_15<='\uFFFF')) ) {s = 35;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( ((LA12_16>='\u0000' && LA12_16<='\uFFFF')) ) {s = 35;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='n') ) {s = 1;}

                        else if ( (LA12_0=='\n') ) {s = 2;}

                        else if ( (LA12_0=='f') ) {s = 3;}

                        else if ( (LA12_0==':') ) {s = 4;}

                        else if ( (LA12_0=='r') ) {s = 5;}

                        else if ( (LA12_0=='%') ) {s = 6;}

                        else if ( (LA12_0=='w') ) {s = 7;}

                        else if ( (LA12_0==',') ) {s = 8;}

                        else if ( (LA12_0==';') ) {s = 9;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')) ) {s = 10;}

                        else if ( ((LA12_0>='a' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='m')||(LA12_0>='o' && LA12_0<='q')||(LA12_0>='s' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 11;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 12;}

                        else if ( (LA12_0=='^') ) {s = 13;}

                        else if ( (LA12_0=='_') ) {s = 14;}

                        else if ( (LA12_0=='\"') ) {s = 15;}

                        else if ( (LA12_0=='\'') ) {s = 16;}

                        else if ( (LA12_0=='/') ) {s = 17;}

                        else if ( (LA12_0=='\t'||LA12_0=='\r'||LA12_0==' ') ) {s = 18;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='$')||LA12_0=='&'||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}