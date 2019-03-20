package dk.sdu.mdsd.guilang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuilangLexer extends Lexer {
    public static final int RULE_CHECKBOX_TYPE=10;
    public static final int RULE_BUTTON_TYPE=8;
    public static final int RULE_LABEL_TYPE=7;
    public static final int RULE_OPEN=4;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int RULE_INPUT_TYPE=9;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_CLOSE=5;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=14;
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
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalGuilangLexer() {;} 
    public InternalGuilangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGuilangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGuilang.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:11:7: ( 'main' )
            // InternalGuilang.g:11:9: 'main'
            {
            match("main"); 


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
            // InternalGuilang.g:12:7: ( 'layout' )
            // InternalGuilang.g:12:9: 'layout'
            {
            match("layout"); 


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
            // InternalGuilang.g:13:7: ( 'vertical' )
            // InternalGuilang.g:13:9: 'vertical'
            {
            match("vertical"); 


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
            // InternalGuilang.g:14:7: ( 'vert' )
            // InternalGuilang.g:14:9: 'vert'
            {
            match("vert"); 


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
            // InternalGuilang.g:15:7: ( 'horizontal' )
            // InternalGuilang.g:15:9: 'horizontal'
            {
            match("horizontal"); 


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
            // InternalGuilang.g:16:7: ( 'hori' )
            // InternalGuilang.g:16:9: 'hori'
            {
            match("hori"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:17:7: ( 'elements' )
            // InternalGuilang.g:17:9: 'elements'
            {
            match("elements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:18:7: ( 'layout-spec' )
            // InternalGuilang.g:18:9: 'layout-spec'
            {
            match("layout-spec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:19:7: ( 'vertical-spec' )
            // InternalGuilang.g:19:9: 'vertical-spec'
            {
            match("vertical-spec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:20:7: ( 'horizontal-spec' )
            // InternalGuilang.g:20:9: 'horizontal-spec'
            {
            match("horizontal-spec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:21:7: ( 'label-spec' )
            // InternalGuilang.g:21:9: 'label-spec'
            {
            match("label-spec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:22:7: ( 'button-spec' )
            // InternalGuilang.g:22:9: 'button-spec'
            {
            match("button-spec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:23:7: ( 'input-spec' )
            // InternalGuilang.g:23:9: 'input-spec'
            {
            match("input-spec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:24:7: ( 'checkbox-spec' )
            // InternalGuilang.g:24:9: 'checkbox-spec'
            {
            match("checkbox-spec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:25:7: ( 'validate' )
            // InternalGuilang.g:25:9: 'validate'
            {
            match("validate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:26:7: ( 'regex' )
            // InternalGuilang.g:26:9: 'regex'
            {
            match("regex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:27:7: ( '=' )
            // InternalGuilang.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:28:7: ( 'val-password' )
            // InternalGuilang.g:28:9: 'val-password'
            {
            match("val-password"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:29:7: ( 'val-email' )
            // InternalGuilang.g:29:9: 'val-email'
            {
            match("val-email"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:30:7: ( 'is-checked' )
            // InternalGuilang.g:30:9: 'is-checked'
            {
            match("is-checked"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:31:7: ( 'is-unchecked' )
            // InternalGuilang.g:31:9: 'is-unchecked'
            {
            match("is-unchecked"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:32:7: ( 'require' )
            // InternalGuilang.g:32:9: 'require'
            {
            match("require"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:33:7: ( '||' )
            // InternalGuilang.g:33:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:34:7: ( '&&' )
            // InternalGuilang.g:34:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:35:7: ( '(' )
            // InternalGuilang.g:35:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:36:7: ( ')' )
            // InternalGuilang.g:36:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:37:7: ( '!' )
            // InternalGuilang.g:37:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:38:7: ( 'NOT' )
            // InternalGuilang.g:38:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_OPEN"
    public final void mRULE_OPEN() throws RecognitionException {
        try {
            int _type = RULE_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:1898:11: ( '{' )
            // InternalGuilang.g:1898:13: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPEN"

    // $ANTLR start "RULE_CLOSE"
    public final void mRULE_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:1900:12: ( '}' )
            // InternalGuilang.g:1900:14: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSE"

    // $ANTLR start "RULE_BUTTON_TYPE"
    public final void mRULE_BUTTON_TYPE() throws RecognitionException {
        try {
            int _type = RULE_BUTTON_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:1902:18: ( ( 'btn' | 'button' ) )
            // InternalGuilang.g:1902:20: ( 'btn' | 'button' )
            {
            // InternalGuilang.g:1902:20: ( 'btn' | 'button' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='b') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='t') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='u') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGuilang.g:1902:21: 'btn'
                    {
                    match("btn"); 


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1902:27: 'button'
                    {
                    match("button"); 


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
    // $ANTLR end "RULE_BUTTON_TYPE"

    // $ANTLR start "RULE_INPUT_TYPE"
    public final void mRULE_INPUT_TYPE() throws RecognitionException {
        try {
            int _type = RULE_INPUT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:1904:17: ( ( 'field' | 'input' ) )
            // InternalGuilang.g:1904:19: ( 'field' | 'input' )
            {
            // InternalGuilang.g:1904:19: ( 'field' | 'input' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='f') ) {
                alt2=1;
            }
            else if ( (LA2_0=='i') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGuilang.g:1904:20: 'field'
                    {
                    match("field"); 


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1904:28: 'input'
                    {
                    match("input"); 


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
    // $ANTLR end "RULE_INPUT_TYPE"

    // $ANTLR start "RULE_LABEL_TYPE"
    public final void mRULE_LABEL_TYPE() throws RecognitionException {
        try {
            int _type = RULE_LABEL_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:1906:17: ( ( 'lbl' | 'label' ) )
            // InternalGuilang.g:1906:19: ( 'lbl' | 'label' )
            {
            // InternalGuilang.g:1906:19: ( 'lbl' | 'label' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='l') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='b') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='a') ) {
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
                    // InternalGuilang.g:1906:20: 'lbl'
                    {
                    match("lbl"); 


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1906:26: 'label'
                    {
                    match("label"); 


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
    // $ANTLR end "RULE_LABEL_TYPE"

    // $ANTLR start "RULE_CHECKBOX_TYPE"
    public final void mRULE_CHECKBOX_TYPE() throws RecognitionException {
        try {
            int _type = RULE_CHECKBOX_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:1908:20: ( ( 'chk' | 'checkbox' ) )
            // InternalGuilang.g:1908:22: ( 'chk' | 'checkbox' )
            {
            // InternalGuilang.g:1908:22: ( 'chk' | 'checkbox' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='c') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='h') ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2=='k') ) {
                        alt4=1;
                    }
                    else if ( (LA4_2=='e') ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
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
                    // InternalGuilang.g:1908:23: 'chk'
                    {
                    match("chk"); 


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1908:29: 'checkbox'
                    {
                    match("checkbox"); 


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
    // $ANTLR end "RULE_CHECKBOX_TYPE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuilang.g:1910:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGuilang.g:1910:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGuilang.g:1910:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGuilang.g:1910:11: '^'
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

            // InternalGuilang.g:1910:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGuilang.g:
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
            	    break loop6;
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
            // InternalGuilang.g:1912:10: ( ( '0' .. '9' )+ )
            // InternalGuilang.g:1912:12: ( '0' .. '9' )+
            {
            // InternalGuilang.g:1912:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGuilang.g:1912:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalGuilang.g:1914:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGuilang.g:1914:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGuilang.g:1914:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGuilang.g:1914:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGuilang.g:1914:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGuilang.g:1914:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGuilang.g:1914:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1914:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGuilang.g:1914:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGuilang.g:1914:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGuilang.g:1914:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalGuilang.g:1916:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGuilang.g:1916:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGuilang.g:1916:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGuilang.g:1916:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalGuilang.g:1918:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGuilang.g:1918:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGuilang.g:1918:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGuilang.g:1918:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalGuilang.g:1918:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGuilang.g:1918:41: ( '\\r' )? '\\n'
                    {
                    // InternalGuilang.g:1918:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalGuilang.g:1918:41: '\\r'
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
            // InternalGuilang.g:1920:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGuilang.g:1920:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGuilang.g:1920:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGuilang.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalGuilang.g:1922:16: ( . )
            // InternalGuilang.g:1922:18: .
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
        // InternalGuilang.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_OPEN | RULE_CLOSE | RULE_BUTTON_TYPE | RULE_INPUT_TYPE | RULE_LABEL_TYPE | RULE_CHECKBOX_TYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=41;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalGuilang.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalGuilang.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalGuilang.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalGuilang.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalGuilang.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalGuilang.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalGuilang.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalGuilang.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalGuilang.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalGuilang.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalGuilang.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalGuilang.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalGuilang.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalGuilang.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalGuilang.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalGuilang.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalGuilang.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalGuilang.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalGuilang.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalGuilang.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalGuilang.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalGuilang.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalGuilang.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalGuilang.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalGuilang.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalGuilang.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalGuilang.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalGuilang.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalGuilang.g:1:178: RULE_OPEN
                {
                mRULE_OPEN(); 

                }
                break;
            case 30 :
                // InternalGuilang.g:1:188: RULE_CLOSE
                {
                mRULE_CLOSE(); 

                }
                break;
            case 31 :
                // InternalGuilang.g:1:199: RULE_BUTTON_TYPE
                {
                mRULE_BUTTON_TYPE(); 

                }
                break;
            case 32 :
                // InternalGuilang.g:1:216: RULE_INPUT_TYPE
                {
                mRULE_INPUT_TYPE(); 

                }
                break;
            case 33 :
                // InternalGuilang.g:1:232: RULE_LABEL_TYPE
                {
                mRULE_LABEL_TYPE(); 

                }
                break;
            case 34 :
                // InternalGuilang.g:1:248: RULE_CHECKBOX_TYPE
                {
                mRULE_CHECKBOX_TYPE(); 

                }
                break;
            case 35 :
                // InternalGuilang.g:1:267: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // InternalGuilang.g:1:275: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // InternalGuilang.g:1:284: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // InternalGuilang.g:1:296: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // InternalGuilang.g:1:312: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // InternalGuilang.g:1:328: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // InternalGuilang.g:1:336: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\11\35\1\uffff\2\33\3\uffff\1\35\2\uffff\1\35\1\33\2\uffff\3\33\2\uffff\1\35\1\uffff\14\35\6\uffff\1\35\2\uffff\1\35\5\uffff\3\35\1\116\5\35\1\125\1\35\1\uffff\1\35\1\132\2\35\1\135\1\35\1\137\2\35\1\uffff\1\143\1\35\1\uffff\1\150\2\35\1\uffff\1\35\2\uffff\1\35\1\uffff\2\35\1\uffff\1\35\1\uffff\1\35\1\116\1\35\1\uffff\1\35\2\uffff\1\35\1\uffff\2\35\1\170\1\35\1\172\1\35\1\170\1\175\1\uffff\4\35\1\125\2\uffff\1\35\1\uffff\1\35\2\uffff\4\35\1\uffff\1\35\1\u008a\1\u008c\1\u008d\1\35\1\u008f\1\132\4\uffff\1\35\2\uffff\1\u0093\2\uffff";
    static final String DFA16_eofS =
        "\u0094\uffff";
    static final String DFA16_minS =
        "\1\0\3\141\1\157\1\154\1\164\1\156\1\150\1\145\1\uffff\1\174\1\46\3\uffff\1\117\2\uffff\1\151\1\101\2\uffff\2\0\1\52\2\uffff\1\151\1\uffff\1\142\1\154\1\162\1\154\1\162\1\145\1\164\1\156\1\160\1\55\1\145\1\147\6\uffff\1\124\2\uffff\1\145\5\uffff\1\156\1\157\1\145\1\60\1\164\1\55\1\151\1\155\1\164\1\60\1\165\2\143\1\60\1\145\1\165\1\60\1\154\1\60\1\165\1\154\1\uffff\1\60\1\144\1\145\1\60\1\145\1\157\1\uffff\1\164\2\uffff\1\153\1\uffff\1\170\1\151\1\uffff\1\144\1\uffff\1\164\1\55\1\143\1\uffff\1\141\2\uffff\1\157\1\uffff\2\156\1\55\1\142\1\60\1\162\1\60\1\55\1\uffff\1\141\1\164\1\156\1\164\1\55\2\uffff\1\157\1\uffff\1\145\2\uffff\1\154\1\145\1\164\1\163\1\uffff\1\170\1\60\1\55\1\60\1\141\1\60\1\55\4\uffff\1\154\2\uffff\1\55\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\141\1\142\1\145\1\157\1\154\1\165\1\163\1\150\1\145\1\uffff\1\174\1\46\3\uffff\1\117\2\uffff\1\151\1\172\2\uffff\2\uffff\1\57\2\uffff\1\151\1\uffff\1\171\1\154\1\162\1\154\1\162\1\145\1\164\1\156\1\160\1\55\1\153\1\161\6\uffff\1\124\2\uffff\1\145\5\uffff\1\156\1\157\1\145\1\172\1\164\2\151\1\155\1\164\1\172\2\165\1\143\1\172\1\145\1\165\1\172\1\154\1\172\1\165\1\154\1\uffff\1\172\1\144\1\160\1\172\1\145\1\157\1\uffff\1\164\2\uffff\1\153\1\uffff\1\170\1\151\1\uffff\1\144\1\uffff\1\164\1\172\1\143\1\uffff\1\141\2\uffff\1\157\1\uffff\2\156\1\172\1\142\1\172\1\162\2\172\1\uffff\1\141\1\164\1\156\1\164\1\172\2\uffff\1\157\1\uffff\1\145\2\uffff\1\154\1\145\1\164\1\163\1\uffff\1\170\3\172\1\141\2\172\4\uffff\1\154\2\uffff\1\172\2\uffff";
    static final String DFA16_acceptS =
        "\12\uffff\1\21\2\uffff\1\31\1\32\1\33\1\uffff\1\35\1\36\2\uffff\1\43\1\44\3\uffff\1\50\1\51\1\uffff\1\43\14\uffff\1\21\1\27\1\30\1\31\1\32\1\33\1\uffff\1\35\1\36\1\uffff\1\44\1\45\1\46\1\47\1\50\25\uffff\1\41\6\uffff\1\37\1\uffff\1\24\1\25\1\uffff\1\42\2\uffff\1\34\1\uffff\1\1\3\uffff\1\4\1\uffff\1\22\1\23\1\uffff\1\6\10\uffff\1\13\5\uffff\1\15\1\40\1\uffff\1\20\1\uffff\1\10\1\2\4\uffff\1\14\7\uffff\1\26\1\11\1\3\1\17\1\uffff\1\7\1\16\1\uffff\1\12\1\5";
    static final String DFA16_specialS =
        "\1\2\26\uffff\1\0\1\1\173\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\17\1\27\3\33\1\14\1\30\1\15\1\16\5\33\1\31\12\26\3\33\1\12\3\33\15\25\1\20\14\25\3\33\1\24\1\25\1\33\1\25\1\6\1\10\1\25\1\5\1\23\1\25\1\4\1\7\2\25\1\2\1\1\4\25\1\11\3\25\1\3\4\25\1\21\1\13\1\22\uff82\33",
            "\1\34",
            "\1\36\1\37",
            "\1\41\3\uffff\1\40",
            "\1\42",
            "\1\43",
            "\1\45\1\44",
            "\1\46\4\uffff\1\47",
            "\1\50",
            "\1\51",
            "",
            "\1\53",
            "\1\54",
            "",
            "",
            "",
            "\1\60",
            "",
            "",
            "\1\63",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\0\65",
            "\0\65",
            "\1\66\4\uffff\1\67",
            "",
            "",
            "\1\71",
            "",
            "\1\73\26\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105\5\uffff\1\106",
            "\1\107\11\uffff\1\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "",
            "",
            "\1\112",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\117",
            "\1\121\73\uffff\1\120",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\126",
            "\1\127\21\uffff\1\130",
            "\1\131",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\133",
            "\1\134",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\136",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\140",
            "\1\141",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\142\21\35",
            "\1\144",
            "\1\146\12\uffff\1\145",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\31\35\1\147",
            "\1\151",
            "\1\152",
            "",
            "\1\153",
            "",
            "",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "",
            "\1\160",
            "\1\161\2\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\162",
            "",
            "\1\163",
            "",
            "",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167\2\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\171",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\173",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\174\2\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\2\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\1\u0083",
            "",
            "\1\u0084",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u008b\2\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u008e",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0090\2\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "",
            "",
            "\1\u0092\2\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_OPEN | RULE_CLOSE | RULE_BUTTON_TYPE | RULE_INPUT_TYPE | RULE_LABEL_TYPE | RULE_CHECKBOX_TYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_23 = input.LA(1);

                        s = -1;
                        if ( ((LA16_23>='\u0000' && LA16_23<='\uFFFF')) ) {s = 53;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_24 = input.LA(1);

                        s = -1;
                        if ( ((LA16_24>='\u0000' && LA16_24<='\uFFFF')) ) {s = 53;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='m') ) {s = 1;}

                        else if ( (LA16_0=='l') ) {s = 2;}

                        else if ( (LA16_0=='v') ) {s = 3;}

                        else if ( (LA16_0=='h') ) {s = 4;}

                        else if ( (LA16_0=='e') ) {s = 5;}

                        else if ( (LA16_0=='b') ) {s = 6;}

                        else if ( (LA16_0=='i') ) {s = 7;}

                        else if ( (LA16_0=='c') ) {s = 8;}

                        else if ( (LA16_0=='r') ) {s = 9;}

                        else if ( (LA16_0=='=') ) {s = 10;}

                        else if ( (LA16_0=='|') ) {s = 11;}

                        else if ( (LA16_0=='&') ) {s = 12;}

                        else if ( (LA16_0=='(') ) {s = 13;}

                        else if ( (LA16_0==')') ) {s = 14;}

                        else if ( (LA16_0=='!') ) {s = 15;}

                        else if ( (LA16_0=='N') ) {s = 16;}

                        else if ( (LA16_0=='{') ) {s = 17;}

                        else if ( (LA16_0=='}') ) {s = 18;}

                        else if ( (LA16_0=='f') ) {s = 19;}

                        else if ( (LA16_0=='^') ) {s = 20;}

                        else if ( ((LA16_0>='A' && LA16_0<='M')||(LA16_0>='O' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='a'||LA16_0=='d'||LA16_0=='g'||(LA16_0>='j' && LA16_0<='k')||(LA16_0>='n' && LA16_0<='q')||(LA16_0>='s' && LA16_0<='u')||(LA16_0>='w' && LA16_0<='z')) ) {s = 21;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 22;}

                        else if ( (LA16_0=='\"') ) {s = 23;}

                        else if ( (LA16_0=='\'') ) {s = 24;}

                        else if ( (LA16_0=='/') ) {s = 25;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 26;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='%')||(LA16_0>='*' && LA16_0<='.')||(LA16_0>=':' && LA16_0<='<')||(LA16_0>='>' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}