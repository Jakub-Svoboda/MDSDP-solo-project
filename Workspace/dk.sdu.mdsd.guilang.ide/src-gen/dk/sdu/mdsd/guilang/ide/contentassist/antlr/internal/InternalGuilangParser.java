package dk.sdu.mdsd.guilang.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mdsd.guilang.services.GuilangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuilangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPEN", "RULE_CLOSE", "RULE_LABEL_TYPE", "RULE_BUTTON_TYPE", "RULE_INPUT_TYPE", "RULE_CHECKBOX_TYPE", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'vertical'", "'vert'", "'horizontal'", "'hori'", "'is-checked'", "'is-unchecked'", "'!'", "'NOT'", "'main'", "'layout'", "'elements'", "'layout-spec'", "'vertical-spec'", "'horizontal-spec'", "'label-spec'", "'button-spec'", "'input-spec'", "'checkbox-spec'", "'validate'", "'regex'", "'='", "'require'", "'||'", "'&&'", "'('", "')'", "'val-password'", "'val-email'"
    };
    public static final int RULE_CHECKBOX_TYPE=9;
    public static final int RULE_BUTTON_TYPE=7;
    public static final int RULE_LABEL_TYPE=6;
    public static final int RULE_OPEN=4;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int RULE_INPUT_TYPE=8;
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


        public InternalGuilangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGuilangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGuilangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGuilang.g"; }


    	private GuilangGrammarAccess grammarAccess;

    	public void setGrammarAccess(GuilangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGUI"
    // InternalGuilang.g:53:1: entryRuleGUI : ruleGUI EOF ;
    public final void entryRuleGUI() throws RecognitionException {
        try {
            // InternalGuilang.g:54:1: ( ruleGUI EOF )
            // InternalGuilang.g:55:1: ruleGUI EOF
            {
             before(grammarAccess.getGUIRule()); 
            pushFollow(FOLLOW_1);
            ruleGUI();

            state._fsp--;

             after(grammarAccess.getGUIRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGUI"


    // $ANTLR start "ruleGUI"
    // InternalGuilang.g:62:1: ruleGUI : ( ( rule__GUI__MainAssignment ) ) ;
    public final void ruleGUI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:66:2: ( ( ( rule__GUI__MainAssignment ) ) )
            // InternalGuilang.g:67:2: ( ( rule__GUI__MainAssignment ) )
            {
            // InternalGuilang.g:67:2: ( ( rule__GUI__MainAssignment ) )
            // InternalGuilang.g:68:3: ( rule__GUI__MainAssignment )
            {
             before(grammarAccess.getGUIAccess().getMainAssignment()); 
            // InternalGuilang.g:69:3: ( rule__GUI__MainAssignment )
            // InternalGuilang.g:69:4: rule__GUI__MainAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GUI__MainAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGUIAccess().getMainAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGUI"


    // $ANTLR start "entryRuleMain"
    // InternalGuilang.g:78:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalGuilang.g:79:1: ( ruleMain EOF )
            // InternalGuilang.g:80:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalGuilang.g:87:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:91:2: ( ( ( rule__Main__Group__0 ) ) )
            // InternalGuilang.g:92:2: ( ( rule__Main__Group__0 ) )
            {
            // InternalGuilang.g:92:2: ( ( rule__Main__Group__0 ) )
            // InternalGuilang.g:93:3: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // InternalGuilang.g:94:3: ( rule__Main__Group__0 )
            // InternalGuilang.g:94:4: rule__Main__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleUnit"
    // InternalGuilang.g:103:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalGuilang.g:104:1: ( ruleUnit EOF )
            // InternalGuilang.g:105:1: ruleUnit EOF
            {
             before(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getUnitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalGuilang.g:112:1: ruleUnit : ( ( rule__Unit__Group__0 ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:116:2: ( ( ( rule__Unit__Group__0 ) ) )
            // InternalGuilang.g:117:2: ( ( rule__Unit__Group__0 ) )
            {
            // InternalGuilang.g:117:2: ( ( rule__Unit__Group__0 ) )
            // InternalGuilang.g:118:3: ( rule__Unit__Group__0 )
            {
             before(grammarAccess.getUnitAccess().getGroup()); 
            // InternalGuilang.g:119:3: ( rule__Unit__Group__0 )
            // InternalGuilang.g:119:4: rule__Unit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Unit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleEntity"
    // InternalGuilang.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalGuilang.g:129:1: ( ruleEntity EOF )
            // InternalGuilang.g:130:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalGuilang.g:137:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:141:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalGuilang.g:142:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalGuilang.g:142:2: ( ( rule__Entity__Alternatives ) )
            // InternalGuilang.g:143:3: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalGuilang.g:144:3: ( rule__Entity__Alternatives )
            // InternalGuilang.g:144:4: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleLayout"
    // InternalGuilang.g:153:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // InternalGuilang.g:154:1: ( ruleLayout EOF )
            // InternalGuilang.g:155:1: ruleLayout EOF
            {
             before(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getLayoutRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalGuilang.g:162:1: ruleLayout : ( ( rule__Layout__Group__0 ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:166:2: ( ( ( rule__Layout__Group__0 ) ) )
            // InternalGuilang.g:167:2: ( ( rule__Layout__Group__0 ) )
            {
            // InternalGuilang.g:167:2: ( ( rule__Layout__Group__0 ) )
            // InternalGuilang.g:168:3: ( rule__Layout__Group__0 )
            {
             before(grammarAccess.getLayoutAccess().getGroup()); 
            // InternalGuilang.g:169:3: ( rule__Layout__Group__0 )
            // InternalGuilang.g:169:4: rule__Layout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleLayoutType"
    // InternalGuilang.g:178:1: entryRuleLayoutType : ruleLayoutType EOF ;
    public final void entryRuleLayoutType() throws RecognitionException {
        try {
            // InternalGuilang.g:179:1: ( ruleLayoutType EOF )
            // InternalGuilang.g:180:1: ruleLayoutType EOF
            {
             before(grammarAccess.getLayoutTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleLayoutType();

            state._fsp--;

             after(grammarAccess.getLayoutTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayoutType"


    // $ANTLR start "ruleLayoutType"
    // InternalGuilang.g:187:1: ruleLayoutType : ( ( rule__LayoutType__Alternatives ) ) ;
    public final void ruleLayoutType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:191:2: ( ( ( rule__LayoutType__Alternatives ) ) )
            // InternalGuilang.g:192:2: ( ( rule__LayoutType__Alternatives ) )
            {
            // InternalGuilang.g:192:2: ( ( rule__LayoutType__Alternatives ) )
            // InternalGuilang.g:193:3: ( rule__LayoutType__Alternatives )
            {
             before(grammarAccess.getLayoutTypeAccess().getAlternatives()); 
            // InternalGuilang.g:194:3: ( rule__LayoutType__Alternatives )
            // InternalGuilang.g:194:4: rule__LayoutType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LayoutType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayoutType"


    // $ANTLR start "entryRuleVertical"
    // InternalGuilang.g:203:1: entryRuleVertical : ruleVertical EOF ;
    public final void entryRuleVertical() throws RecognitionException {
        try {
            // InternalGuilang.g:204:1: ( ruleVertical EOF )
            // InternalGuilang.g:205:1: ruleVertical EOF
            {
             before(grammarAccess.getVerticalRule()); 
            pushFollow(FOLLOW_1);
            ruleVertical();

            state._fsp--;

             after(grammarAccess.getVerticalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVertical"


    // $ANTLR start "ruleVertical"
    // InternalGuilang.g:212:1: ruleVertical : ( ( rule__Vertical__Group__0 ) ) ;
    public final void ruleVertical() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:216:2: ( ( ( rule__Vertical__Group__0 ) ) )
            // InternalGuilang.g:217:2: ( ( rule__Vertical__Group__0 ) )
            {
            // InternalGuilang.g:217:2: ( ( rule__Vertical__Group__0 ) )
            // InternalGuilang.g:218:3: ( rule__Vertical__Group__0 )
            {
             before(grammarAccess.getVerticalAccess().getGroup()); 
            // InternalGuilang.g:219:3: ( rule__Vertical__Group__0 )
            // InternalGuilang.g:219:4: rule__Vertical__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vertical__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerticalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVertical"


    // $ANTLR start "entryRuleHorizontal"
    // InternalGuilang.g:228:1: entryRuleHorizontal : ruleHorizontal EOF ;
    public final void entryRuleHorizontal() throws RecognitionException {
        try {
            // InternalGuilang.g:229:1: ( ruleHorizontal EOF )
            // InternalGuilang.g:230:1: ruleHorizontal EOF
            {
             before(grammarAccess.getHorizontalRule()); 
            pushFollow(FOLLOW_1);
            ruleHorizontal();

            state._fsp--;

             after(grammarAccess.getHorizontalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHorizontal"


    // $ANTLR start "ruleHorizontal"
    // InternalGuilang.g:237:1: ruleHorizontal : ( ( rule__Horizontal__Group__0 ) ) ;
    public final void ruleHorizontal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:241:2: ( ( ( rule__Horizontal__Group__0 ) ) )
            // InternalGuilang.g:242:2: ( ( rule__Horizontal__Group__0 ) )
            {
            // InternalGuilang.g:242:2: ( ( rule__Horizontal__Group__0 ) )
            // InternalGuilang.g:243:3: ( rule__Horizontal__Group__0 )
            {
             before(grammarAccess.getHorizontalAccess().getGroup()); 
            // InternalGuilang.g:244:3: ( rule__Horizontal__Group__0 )
            // InternalGuilang.g:244:4: rule__Horizontal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Horizontal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHorizontalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHorizontal"


    // $ANTLR start "entryRuleElement"
    // InternalGuilang.g:253:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalGuilang.g:254:1: ( ruleElement EOF )
            // InternalGuilang.g:255:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalGuilang.g:262:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:266:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalGuilang.g:267:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalGuilang.g:267:2: ( ( rule__Element__Alternatives ) )
            // InternalGuilang.g:268:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalGuilang.g:269:3: ( rule__Element__Alternatives )
            // InternalGuilang.g:269:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleLabel"
    // InternalGuilang.g:278:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalGuilang.g:279:1: ( ruleLabel EOF )
            // InternalGuilang.g:280:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalGuilang.g:287:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:291:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalGuilang.g:292:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalGuilang.g:292:2: ( ( rule__Label__Group__0 ) )
            // InternalGuilang.g:293:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalGuilang.g:294:3: ( rule__Label__Group__0 )
            // InternalGuilang.g:294:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleButton"
    // InternalGuilang.g:303:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalGuilang.g:304:1: ( ruleButton EOF )
            // InternalGuilang.g:305:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalGuilang.g:312:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:316:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalGuilang.g:317:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalGuilang.g:317:2: ( ( rule__Button__Group__0 ) )
            // InternalGuilang.g:318:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalGuilang.g:319:3: ( rule__Button__Group__0 )
            // InternalGuilang.g:319:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleInput"
    // InternalGuilang.g:328:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalGuilang.g:329:1: ( ruleInput EOF )
            // InternalGuilang.g:330:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalGuilang.g:337:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:341:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalGuilang.g:342:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalGuilang.g:342:2: ( ( rule__Input__Group__0 ) )
            // InternalGuilang.g:343:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalGuilang.g:344:3: ( rule__Input__Group__0 )
            // InternalGuilang.g:344:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleCheckbox"
    // InternalGuilang.g:353:1: entryRuleCheckbox : ruleCheckbox EOF ;
    public final void entryRuleCheckbox() throws RecognitionException {
        try {
            // InternalGuilang.g:354:1: ( ruleCheckbox EOF )
            // InternalGuilang.g:355:1: ruleCheckbox EOF
            {
             before(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getCheckboxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // InternalGuilang.g:362:1: ruleCheckbox : ( ( rule__Checkbox__Group__0 ) ) ;
    public final void ruleCheckbox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:366:2: ( ( ( rule__Checkbox__Group__0 ) ) )
            // InternalGuilang.g:367:2: ( ( rule__Checkbox__Group__0 ) )
            {
            // InternalGuilang.g:367:2: ( ( rule__Checkbox__Group__0 ) )
            // InternalGuilang.g:368:3: ( rule__Checkbox__Group__0 )
            {
             before(grammarAccess.getCheckboxAccess().getGroup()); 
            // InternalGuilang.g:369:3: ( rule__Checkbox__Group__0 )
            // InternalGuilang.g:369:4: rule__Checkbox__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleSpecifications"
    // InternalGuilang.g:378:1: entryRuleSpecifications : ruleSpecifications EOF ;
    public final void entryRuleSpecifications() throws RecognitionException {
        try {
            // InternalGuilang.g:379:1: ( ruleSpecifications EOF )
            // InternalGuilang.g:380:1: ruleSpecifications EOF
            {
             before(grammarAccess.getSpecificationsRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecifications();

            state._fsp--;

             after(grammarAccess.getSpecificationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecifications"


    // $ANTLR start "ruleSpecifications"
    // InternalGuilang.g:387:1: ruleSpecifications : ( ( rule__Specifications__Group__0 ) ) ;
    public final void ruleSpecifications() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:391:2: ( ( ( rule__Specifications__Group__0 ) ) )
            // InternalGuilang.g:392:2: ( ( rule__Specifications__Group__0 ) )
            {
            // InternalGuilang.g:392:2: ( ( rule__Specifications__Group__0 ) )
            // InternalGuilang.g:393:3: ( rule__Specifications__Group__0 )
            {
             before(grammarAccess.getSpecificationsAccess().getGroup()); 
            // InternalGuilang.g:394:3: ( rule__Specifications__Group__0 )
            // InternalGuilang.g:394:4: rule__Specifications__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Specifications__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecifications"


    // $ANTLR start "entryRuleSpecification"
    // InternalGuilang.g:403:1: entryRuleSpecification : ruleSpecification EOF ;
    public final void entryRuleSpecification() throws RecognitionException {
        try {
            // InternalGuilang.g:404:1: ( ruleSpecification EOF )
            // InternalGuilang.g:405:1: ruleSpecification EOF
            {
             before(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalGuilang.g:412:1: ruleSpecification : ( ( rule__Specification__TypeAssignment ) ) ;
    public final void ruleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:416:2: ( ( ( rule__Specification__TypeAssignment ) ) )
            // InternalGuilang.g:417:2: ( ( rule__Specification__TypeAssignment ) )
            {
            // InternalGuilang.g:417:2: ( ( rule__Specification__TypeAssignment ) )
            // InternalGuilang.g:418:3: ( rule__Specification__TypeAssignment )
            {
             before(grammarAccess.getSpecificationAccess().getTypeAssignment()); 
            // InternalGuilang.g:419:3: ( rule__Specification__TypeAssignment )
            // InternalGuilang.g:419:4: rule__Specification__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Specification__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleLayoutSpec"
    // InternalGuilang.g:428:1: entryRuleLayoutSpec : ruleLayoutSpec EOF ;
    public final void entryRuleLayoutSpec() throws RecognitionException {
        try {
            // InternalGuilang.g:429:1: ( ruleLayoutSpec EOF )
            // InternalGuilang.g:430:1: ruleLayoutSpec EOF
            {
             before(grammarAccess.getLayoutSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleLayoutSpec();

            state._fsp--;

             after(grammarAccess.getLayoutSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayoutSpec"


    // $ANTLR start "ruleLayoutSpec"
    // InternalGuilang.g:437:1: ruleLayoutSpec : ( ( rule__LayoutSpec__Group__0 ) ) ;
    public final void ruleLayoutSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:441:2: ( ( ( rule__LayoutSpec__Group__0 ) ) )
            // InternalGuilang.g:442:2: ( ( rule__LayoutSpec__Group__0 ) )
            {
            // InternalGuilang.g:442:2: ( ( rule__LayoutSpec__Group__0 ) )
            // InternalGuilang.g:443:3: ( rule__LayoutSpec__Group__0 )
            {
             before(grammarAccess.getLayoutSpecAccess().getGroup()); 
            // InternalGuilang.g:444:3: ( rule__LayoutSpec__Group__0 )
            // InternalGuilang.g:444:4: rule__LayoutSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LayoutSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayoutSpec"


    // $ANTLR start "entryRuleVerticalSpec"
    // InternalGuilang.g:453:1: entryRuleVerticalSpec : ruleVerticalSpec EOF ;
    public final void entryRuleVerticalSpec() throws RecognitionException {
        try {
            // InternalGuilang.g:454:1: ( ruleVerticalSpec EOF )
            // InternalGuilang.g:455:1: ruleVerticalSpec EOF
            {
             before(grammarAccess.getVerticalSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleVerticalSpec();

            state._fsp--;

             after(grammarAccess.getVerticalSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerticalSpec"


    // $ANTLR start "ruleVerticalSpec"
    // InternalGuilang.g:462:1: ruleVerticalSpec : ( ( rule__VerticalSpec__Group__0 ) ) ;
    public final void ruleVerticalSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:466:2: ( ( ( rule__VerticalSpec__Group__0 ) ) )
            // InternalGuilang.g:467:2: ( ( rule__VerticalSpec__Group__0 ) )
            {
            // InternalGuilang.g:467:2: ( ( rule__VerticalSpec__Group__0 ) )
            // InternalGuilang.g:468:3: ( rule__VerticalSpec__Group__0 )
            {
             before(grammarAccess.getVerticalSpecAccess().getGroup()); 
            // InternalGuilang.g:469:3: ( rule__VerticalSpec__Group__0 )
            // InternalGuilang.g:469:4: rule__VerticalSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VerticalSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerticalSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerticalSpec"


    // $ANTLR start "entryRuleHorizontalSpec"
    // InternalGuilang.g:478:1: entryRuleHorizontalSpec : ruleHorizontalSpec EOF ;
    public final void entryRuleHorizontalSpec() throws RecognitionException {
        try {
            // InternalGuilang.g:479:1: ( ruleHorizontalSpec EOF )
            // InternalGuilang.g:480:1: ruleHorizontalSpec EOF
            {
             before(grammarAccess.getHorizontalSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleHorizontalSpec();

            state._fsp--;

             after(grammarAccess.getHorizontalSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHorizontalSpec"


    // $ANTLR start "ruleHorizontalSpec"
    // InternalGuilang.g:487:1: ruleHorizontalSpec : ( ( rule__HorizontalSpec__Group__0 ) ) ;
    public final void ruleHorizontalSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:491:2: ( ( ( rule__HorizontalSpec__Group__0 ) ) )
            // InternalGuilang.g:492:2: ( ( rule__HorizontalSpec__Group__0 ) )
            {
            // InternalGuilang.g:492:2: ( ( rule__HorizontalSpec__Group__0 ) )
            // InternalGuilang.g:493:3: ( rule__HorizontalSpec__Group__0 )
            {
             before(grammarAccess.getHorizontalSpecAccess().getGroup()); 
            // InternalGuilang.g:494:3: ( rule__HorizontalSpec__Group__0 )
            // InternalGuilang.g:494:4: rule__HorizontalSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHorizontalSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHorizontalSpec"


    // $ANTLR start "entryRuleLabelSpec"
    // InternalGuilang.g:503:1: entryRuleLabelSpec : ruleLabelSpec EOF ;
    public final void entryRuleLabelSpec() throws RecognitionException {
        try {
            // InternalGuilang.g:504:1: ( ruleLabelSpec EOF )
            // InternalGuilang.g:505:1: ruleLabelSpec EOF
            {
             before(grammarAccess.getLabelSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleLabelSpec();

            state._fsp--;

             after(grammarAccess.getLabelSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabelSpec"


    // $ANTLR start "ruleLabelSpec"
    // InternalGuilang.g:512:1: ruleLabelSpec : ( ( rule__LabelSpec__Group__0 ) ) ;
    public final void ruleLabelSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:516:2: ( ( ( rule__LabelSpec__Group__0 ) ) )
            // InternalGuilang.g:517:2: ( ( rule__LabelSpec__Group__0 ) )
            {
            // InternalGuilang.g:517:2: ( ( rule__LabelSpec__Group__0 ) )
            // InternalGuilang.g:518:3: ( rule__LabelSpec__Group__0 )
            {
             before(grammarAccess.getLabelSpecAccess().getGroup()); 
            // InternalGuilang.g:519:3: ( rule__LabelSpec__Group__0 )
            // InternalGuilang.g:519:4: rule__LabelSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LabelSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabelSpec"


    // $ANTLR start "entryRuleButtonSpec"
    // InternalGuilang.g:528:1: entryRuleButtonSpec : ruleButtonSpec EOF ;
    public final void entryRuleButtonSpec() throws RecognitionException {
        try {
            // InternalGuilang.g:529:1: ( ruleButtonSpec EOF )
            // InternalGuilang.g:530:1: ruleButtonSpec EOF
            {
             before(grammarAccess.getButtonSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleButtonSpec();

            state._fsp--;

             after(grammarAccess.getButtonSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButtonSpec"


    // $ANTLR start "ruleButtonSpec"
    // InternalGuilang.g:537:1: ruleButtonSpec : ( ( rule__ButtonSpec__Group__0 ) ) ;
    public final void ruleButtonSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:541:2: ( ( ( rule__ButtonSpec__Group__0 ) ) )
            // InternalGuilang.g:542:2: ( ( rule__ButtonSpec__Group__0 ) )
            {
            // InternalGuilang.g:542:2: ( ( rule__ButtonSpec__Group__0 ) )
            // InternalGuilang.g:543:3: ( rule__ButtonSpec__Group__0 )
            {
             before(grammarAccess.getButtonSpecAccess().getGroup()); 
            // InternalGuilang.g:544:3: ( rule__ButtonSpec__Group__0 )
            // InternalGuilang.g:544:4: rule__ButtonSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonSpec"


    // $ANTLR start "entryRuleButtonSpecOptions"
    // InternalGuilang.g:553:1: entryRuleButtonSpecOptions : ruleButtonSpecOptions EOF ;
    public final void entryRuleButtonSpecOptions() throws RecognitionException {
        try {
            // InternalGuilang.g:554:1: ( ruleButtonSpecOptions EOF )
            // InternalGuilang.g:555:1: ruleButtonSpecOptions EOF
            {
             before(grammarAccess.getButtonSpecOptionsRule()); 
            pushFollow(FOLLOW_1);
            ruleButtonSpecOptions();

            state._fsp--;

             after(grammarAccess.getButtonSpecOptionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButtonSpecOptions"


    // $ANTLR start "ruleButtonSpecOptions"
    // InternalGuilang.g:562:1: ruleButtonSpecOptions : ( ruleRequireElements ) ;
    public final void ruleButtonSpecOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:566:2: ( ( ruleRequireElements ) )
            // InternalGuilang.g:567:2: ( ruleRequireElements )
            {
            // InternalGuilang.g:567:2: ( ruleRequireElements )
            // InternalGuilang.g:568:3: ruleRequireElements
            {
             before(grammarAccess.getButtonSpecOptionsAccess().getRequireElementsParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleRequireElements();

            state._fsp--;

             after(grammarAccess.getButtonSpecOptionsAccess().getRequireElementsParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonSpecOptions"


    // $ANTLR start "entryRuleInputSpec"
    // InternalGuilang.g:578:1: entryRuleInputSpec : ruleInputSpec EOF ;
    public final void entryRuleInputSpec() throws RecognitionException {
        try {
            // InternalGuilang.g:579:1: ( ruleInputSpec EOF )
            // InternalGuilang.g:580:1: ruleInputSpec EOF
            {
             before(grammarAccess.getInputSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleInputSpec();

            state._fsp--;

             after(grammarAccess.getInputSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputSpec"


    // $ANTLR start "ruleInputSpec"
    // InternalGuilang.g:587:1: ruleInputSpec : ( ( rule__InputSpec__Group__0 ) ) ;
    public final void ruleInputSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:591:2: ( ( ( rule__InputSpec__Group__0 ) ) )
            // InternalGuilang.g:592:2: ( ( rule__InputSpec__Group__0 ) )
            {
            // InternalGuilang.g:592:2: ( ( rule__InputSpec__Group__0 ) )
            // InternalGuilang.g:593:3: ( rule__InputSpec__Group__0 )
            {
             before(grammarAccess.getInputSpecAccess().getGroup()); 
            // InternalGuilang.g:594:3: ( rule__InputSpec__Group__0 )
            // InternalGuilang.g:594:4: rule__InputSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputSpec"


    // $ANTLR start "entryRuleInputSpecOptions"
    // InternalGuilang.g:603:1: entryRuleInputSpecOptions : ruleInputSpecOptions EOF ;
    public final void entryRuleInputSpecOptions() throws RecognitionException {
        try {
            // InternalGuilang.g:604:1: ( ruleInputSpecOptions EOF )
            // InternalGuilang.g:605:1: ruleInputSpecOptions EOF
            {
             before(grammarAccess.getInputSpecOptionsRule()); 
            pushFollow(FOLLOW_1);
            ruleInputSpecOptions();

            state._fsp--;

             after(grammarAccess.getInputSpecOptionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputSpecOptions"


    // $ANTLR start "ruleInputSpecOptions"
    // InternalGuilang.g:612:1: ruleInputSpecOptions : ( ( rule__InputSpecOptions__Alternatives ) ) ;
    public final void ruleInputSpecOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:616:2: ( ( ( rule__InputSpecOptions__Alternatives ) ) )
            // InternalGuilang.g:617:2: ( ( rule__InputSpecOptions__Alternatives ) )
            {
            // InternalGuilang.g:617:2: ( ( rule__InputSpecOptions__Alternatives ) )
            // InternalGuilang.g:618:3: ( rule__InputSpecOptions__Alternatives )
            {
             before(grammarAccess.getInputSpecOptionsAccess().getAlternatives()); 
            // InternalGuilang.g:619:3: ( rule__InputSpecOptions__Alternatives )
            // InternalGuilang.g:619:4: rule__InputSpecOptions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InputSpecOptions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInputSpecOptionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputSpecOptions"


    // $ANTLR start "entryRuleCheckboxSpec"
    // InternalGuilang.g:628:1: entryRuleCheckboxSpec : ruleCheckboxSpec EOF ;
    public final void entryRuleCheckboxSpec() throws RecognitionException {
        try {
            // InternalGuilang.g:629:1: ( ruleCheckboxSpec EOF )
            // InternalGuilang.g:630:1: ruleCheckboxSpec EOF
            {
             before(grammarAccess.getCheckboxSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckboxSpec();

            state._fsp--;

             after(grammarAccess.getCheckboxSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckboxSpec"


    // $ANTLR start "ruleCheckboxSpec"
    // InternalGuilang.g:637:1: ruleCheckboxSpec : ( ( rule__CheckboxSpec__Group__0 ) ) ;
    public final void ruleCheckboxSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:641:2: ( ( ( rule__CheckboxSpec__Group__0 ) ) )
            // InternalGuilang.g:642:2: ( ( rule__CheckboxSpec__Group__0 ) )
            {
            // InternalGuilang.g:642:2: ( ( rule__CheckboxSpec__Group__0 ) )
            // InternalGuilang.g:643:3: ( rule__CheckboxSpec__Group__0 )
            {
             before(grammarAccess.getCheckboxSpecAccess().getGroup()); 
            // InternalGuilang.g:644:3: ( rule__CheckboxSpec__Group__0 )
            // InternalGuilang.g:644:4: rule__CheckboxSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckboxSpec"


    // $ANTLR start "entryRuleTextValidate"
    // InternalGuilang.g:653:1: entryRuleTextValidate : ruleTextValidate EOF ;
    public final void entryRuleTextValidate() throws RecognitionException {
        try {
            // InternalGuilang.g:654:1: ( ruleTextValidate EOF )
            // InternalGuilang.g:655:1: ruleTextValidate EOF
            {
             before(grammarAccess.getTextValidateRule()); 
            pushFollow(FOLLOW_1);
            ruleTextValidate();

            state._fsp--;

             after(grammarAccess.getTextValidateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextValidate"


    // $ANTLR start "ruleTextValidate"
    // InternalGuilang.g:662:1: ruleTextValidate : ( ( rule__TextValidate__Group__0 ) ) ;
    public final void ruleTextValidate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:666:2: ( ( ( rule__TextValidate__Group__0 ) ) )
            // InternalGuilang.g:667:2: ( ( rule__TextValidate__Group__0 ) )
            {
            // InternalGuilang.g:667:2: ( ( rule__TextValidate__Group__0 ) )
            // InternalGuilang.g:668:3: ( rule__TextValidate__Group__0 )
            {
             before(grammarAccess.getTextValidateAccess().getGroup()); 
            // InternalGuilang.g:669:3: ( rule__TextValidate__Group__0 )
            // InternalGuilang.g:669:4: rule__TextValidate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextValidate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextValidateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextValidate"


    // $ANTLR start "entryRuleRegexValidate"
    // InternalGuilang.g:678:1: entryRuleRegexValidate : ruleRegexValidate EOF ;
    public final void entryRuleRegexValidate() throws RecognitionException {
        try {
            // InternalGuilang.g:679:1: ( ruleRegexValidate EOF )
            // InternalGuilang.g:680:1: ruleRegexValidate EOF
            {
             before(grammarAccess.getRegexValidateRule()); 
            pushFollow(FOLLOW_1);
            ruleRegexValidate();

            state._fsp--;

             after(grammarAccess.getRegexValidateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegexValidate"


    // $ANTLR start "ruleRegexValidate"
    // InternalGuilang.g:687:1: ruleRegexValidate : ( ( rule__RegexValidate__Group__0 ) ) ;
    public final void ruleRegexValidate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:691:2: ( ( ( rule__RegexValidate__Group__0 ) ) )
            // InternalGuilang.g:692:2: ( ( rule__RegexValidate__Group__0 ) )
            {
            // InternalGuilang.g:692:2: ( ( rule__RegexValidate__Group__0 ) )
            // InternalGuilang.g:693:3: ( rule__RegexValidate__Group__0 )
            {
             before(grammarAccess.getRegexValidateAccess().getGroup()); 
            // InternalGuilang.g:694:3: ( rule__RegexValidate__Group__0 )
            // InternalGuilang.g:694:4: rule__RegexValidate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegexValidate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegexValidateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegexValidate"


    // $ANTLR start "entryRuleRegexVariableRef"
    // InternalGuilang.g:703:1: entryRuleRegexVariableRef : ruleRegexVariableRef EOF ;
    public final void entryRuleRegexVariableRef() throws RecognitionException {
        try {
            // InternalGuilang.g:704:1: ( ruleRegexVariableRef EOF )
            // InternalGuilang.g:705:1: ruleRegexVariableRef EOF
            {
             before(grammarAccess.getRegexVariableRefRule()); 
            pushFollow(FOLLOW_1);
            ruleRegexVariableRef();

            state._fsp--;

             after(grammarAccess.getRegexVariableRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegexVariableRef"


    // $ANTLR start "ruleRegexVariableRef"
    // InternalGuilang.g:712:1: ruleRegexVariableRef : ( ( rule__RegexVariableRef__RefAssignment ) ) ;
    public final void ruleRegexVariableRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:716:2: ( ( ( rule__RegexVariableRef__RefAssignment ) ) )
            // InternalGuilang.g:717:2: ( ( rule__RegexVariableRef__RefAssignment ) )
            {
            // InternalGuilang.g:717:2: ( ( rule__RegexVariableRef__RefAssignment ) )
            // InternalGuilang.g:718:3: ( rule__RegexVariableRef__RefAssignment )
            {
             before(grammarAccess.getRegexVariableRefAccess().getRefAssignment()); 
            // InternalGuilang.g:719:3: ( rule__RegexVariableRef__RefAssignment )
            // InternalGuilang.g:719:4: rule__RegexVariableRef__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RegexVariableRef__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRegexVariableRefAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegexVariableRef"


    // $ANTLR start "entryRulePresetTextValidate"
    // InternalGuilang.g:728:1: entryRulePresetTextValidate : rulePresetTextValidate EOF ;
    public final void entryRulePresetTextValidate() throws RecognitionException {
        try {
            // InternalGuilang.g:729:1: ( rulePresetTextValidate EOF )
            // InternalGuilang.g:730:1: rulePresetTextValidate EOF
            {
             before(grammarAccess.getPresetTextValidateRule()); 
            pushFollow(FOLLOW_1);
            rulePresetTextValidate();

            state._fsp--;

             after(grammarAccess.getPresetTextValidateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePresetTextValidate"


    // $ANTLR start "rulePresetTextValidate"
    // InternalGuilang.g:737:1: rulePresetTextValidate : ( ( rule__PresetTextValidate__Alternatives ) ) ;
    public final void rulePresetTextValidate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:741:2: ( ( ( rule__PresetTextValidate__Alternatives ) ) )
            // InternalGuilang.g:742:2: ( ( rule__PresetTextValidate__Alternatives ) )
            {
            // InternalGuilang.g:742:2: ( ( rule__PresetTextValidate__Alternatives ) )
            // InternalGuilang.g:743:3: ( rule__PresetTextValidate__Alternatives )
            {
             before(grammarAccess.getPresetTextValidateAccess().getAlternatives()); 
            // InternalGuilang.g:744:3: ( rule__PresetTextValidate__Alternatives )
            // InternalGuilang.g:744:4: rule__PresetTextValidate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PresetTextValidate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPresetTextValidateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePresetTextValidate"


    // $ANTLR start "entryRuleCheckboxValidate"
    // InternalGuilang.g:753:1: entryRuleCheckboxValidate : ruleCheckboxValidate EOF ;
    public final void entryRuleCheckboxValidate() throws RecognitionException {
        try {
            // InternalGuilang.g:754:1: ( ruleCheckboxValidate EOF )
            // InternalGuilang.g:755:1: ruleCheckboxValidate EOF
            {
             before(grammarAccess.getCheckboxValidateRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckboxValidate();

            state._fsp--;

             after(grammarAccess.getCheckboxValidateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckboxValidate"


    // $ANTLR start "ruleCheckboxValidate"
    // InternalGuilang.g:762:1: ruleCheckboxValidate : ( ( rule__CheckboxValidate__ValueAssignment ) ) ;
    public final void ruleCheckboxValidate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:766:2: ( ( ( rule__CheckboxValidate__ValueAssignment ) ) )
            // InternalGuilang.g:767:2: ( ( rule__CheckboxValidate__ValueAssignment ) )
            {
            // InternalGuilang.g:767:2: ( ( rule__CheckboxValidate__ValueAssignment ) )
            // InternalGuilang.g:768:3: ( rule__CheckboxValidate__ValueAssignment )
            {
             before(grammarAccess.getCheckboxValidateAccess().getValueAssignment()); 
            // InternalGuilang.g:769:3: ( rule__CheckboxValidate__ValueAssignment )
            // InternalGuilang.g:769:4: rule__CheckboxValidate__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxValidate__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxValidateAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckboxValidate"


    // $ANTLR start "entryRuleRequireElements"
    // InternalGuilang.g:778:1: entryRuleRequireElements : ruleRequireElements EOF ;
    public final void entryRuleRequireElements() throws RecognitionException {
        try {
            // InternalGuilang.g:779:1: ( ruleRequireElements EOF )
            // InternalGuilang.g:780:1: ruleRequireElements EOF
            {
             before(grammarAccess.getRequireElementsRule()); 
            pushFollow(FOLLOW_1);
            ruleRequireElements();

            state._fsp--;

             after(grammarAccess.getRequireElementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequireElements"


    // $ANTLR start "ruleRequireElements"
    // InternalGuilang.g:787:1: ruleRequireElements : ( ( rule__RequireElements__Group__0 ) ) ;
    public final void ruleRequireElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:791:2: ( ( ( rule__RequireElements__Group__0 ) ) )
            // InternalGuilang.g:792:2: ( ( rule__RequireElements__Group__0 ) )
            {
            // InternalGuilang.g:792:2: ( ( rule__RequireElements__Group__0 ) )
            // InternalGuilang.g:793:3: ( rule__RequireElements__Group__0 )
            {
             before(grammarAccess.getRequireElementsAccess().getGroup()); 
            // InternalGuilang.g:794:3: ( rule__RequireElements__Group__0 )
            // InternalGuilang.g:794:4: rule__RequireElements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequireElements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequireElementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequireElements"


    // $ANTLR start "entryRuleRequire"
    // InternalGuilang.g:803:1: entryRuleRequire : ruleRequire EOF ;
    public final void entryRuleRequire() throws RecognitionException {
        try {
            // InternalGuilang.g:804:1: ( ruleRequire EOF )
            // InternalGuilang.g:805:1: ruleRequire EOF
            {
             before(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            ruleRequire();

            state._fsp--;

             after(grammarAccess.getRequireRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalGuilang.g:812:1: ruleRequire : ( ruleRequireOr ) ;
    public final void ruleRequire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:816:2: ( ( ruleRequireOr ) )
            // InternalGuilang.g:817:2: ( ruleRequireOr )
            {
            // InternalGuilang.g:817:2: ( ruleRequireOr )
            // InternalGuilang.g:818:3: ruleRequireOr
            {
             before(grammarAccess.getRequireAccess().getRequireOrParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleRequireOr();

            state._fsp--;

             after(grammarAccess.getRequireAccess().getRequireOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleRequireOr"
    // InternalGuilang.g:828:1: entryRuleRequireOr : ruleRequireOr EOF ;
    public final void entryRuleRequireOr() throws RecognitionException {
        try {
            // InternalGuilang.g:829:1: ( ruleRequireOr EOF )
            // InternalGuilang.g:830:1: ruleRequireOr EOF
            {
             before(grammarAccess.getRequireOrRule()); 
            pushFollow(FOLLOW_1);
            ruleRequireOr();

            state._fsp--;

             after(grammarAccess.getRequireOrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequireOr"


    // $ANTLR start "ruleRequireOr"
    // InternalGuilang.g:837:1: ruleRequireOr : ( ( rule__RequireOr__Group__0 ) ) ;
    public final void ruleRequireOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:841:2: ( ( ( rule__RequireOr__Group__0 ) ) )
            // InternalGuilang.g:842:2: ( ( rule__RequireOr__Group__0 ) )
            {
            // InternalGuilang.g:842:2: ( ( rule__RequireOr__Group__0 ) )
            // InternalGuilang.g:843:3: ( rule__RequireOr__Group__0 )
            {
             before(grammarAccess.getRequireOrAccess().getGroup()); 
            // InternalGuilang.g:844:3: ( rule__RequireOr__Group__0 )
            // InternalGuilang.g:844:4: rule__RequireOr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequireOr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequireOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequireOr"


    // $ANTLR start "entryRuleRequireAnd"
    // InternalGuilang.g:853:1: entryRuleRequireAnd : ruleRequireAnd EOF ;
    public final void entryRuleRequireAnd() throws RecognitionException {
        try {
            // InternalGuilang.g:854:1: ( ruleRequireAnd EOF )
            // InternalGuilang.g:855:1: ruleRequireAnd EOF
            {
             before(grammarAccess.getRequireAndRule()); 
            pushFollow(FOLLOW_1);
            ruleRequireAnd();

            state._fsp--;

             after(grammarAccess.getRequireAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequireAnd"


    // $ANTLR start "ruleRequireAnd"
    // InternalGuilang.g:862:1: ruleRequireAnd : ( ( rule__RequireAnd__Group__0 ) ) ;
    public final void ruleRequireAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:866:2: ( ( ( rule__RequireAnd__Group__0 ) ) )
            // InternalGuilang.g:867:2: ( ( rule__RequireAnd__Group__0 ) )
            {
            // InternalGuilang.g:867:2: ( ( rule__RequireAnd__Group__0 ) )
            // InternalGuilang.g:868:3: ( rule__RequireAnd__Group__0 )
            {
             before(grammarAccess.getRequireAndAccess().getGroup()); 
            // InternalGuilang.g:869:3: ( rule__RequireAnd__Group__0 )
            // InternalGuilang.g:869:4: rule__RequireAnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequireAnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequireAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequireAnd"


    // $ANTLR start "entryRuleRequireBase"
    // InternalGuilang.g:878:1: entryRuleRequireBase : ruleRequireBase EOF ;
    public final void entryRuleRequireBase() throws RecognitionException {
        try {
            // InternalGuilang.g:879:1: ( ruleRequireBase EOF )
            // InternalGuilang.g:880:1: ruleRequireBase EOF
            {
             before(grammarAccess.getRequireBaseRule()); 
            pushFollow(FOLLOW_1);
            ruleRequireBase();

            state._fsp--;

             after(grammarAccess.getRequireBaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequireBase"


    // $ANTLR start "ruleRequireBase"
    // InternalGuilang.g:887:1: ruleRequireBase : ( ( rule__RequireBase__Alternatives ) ) ;
    public final void ruleRequireBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:891:2: ( ( ( rule__RequireBase__Alternatives ) ) )
            // InternalGuilang.g:892:2: ( ( rule__RequireBase__Alternatives ) )
            {
            // InternalGuilang.g:892:2: ( ( rule__RequireBase__Alternatives ) )
            // InternalGuilang.g:893:3: ( rule__RequireBase__Alternatives )
            {
             before(grammarAccess.getRequireBaseAccess().getAlternatives()); 
            // InternalGuilang.g:894:3: ( rule__RequireBase__Alternatives )
            // InternalGuilang.g:894:4: rule__RequireBase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RequireBase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRequireBaseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequireBase"


    // $ANTLR start "rule__Entity__Alternatives"
    // InternalGuilang.g:902:1: rule__Entity__Alternatives : ( ( ruleLayoutType ) | ( ruleElement ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:906:1: ( ( ruleLayoutType ) | ( ruleElement ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=17 && LA1_0<=20)||LA1_0==26) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_LABEL_TYPE && LA1_0<=RULE_CHECKBOX_TYPE)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGuilang.g:907:2: ( ruleLayoutType )
                    {
                    // InternalGuilang.g:907:2: ( ruleLayoutType )
                    // InternalGuilang.g:908:3: ruleLayoutType
                    {
                     before(grammarAccess.getEntityAccess().getLayoutTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLayoutType();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getLayoutTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:913:2: ( ruleElement )
                    {
                    // InternalGuilang.g:913:2: ( ruleElement )
                    // InternalGuilang.g:914:3: ruleElement
                    {
                     before(grammarAccess.getEntityAccess().getElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleElement();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getElementParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__LayoutType__Alternatives"
    // InternalGuilang.g:923:1: rule__LayoutType__Alternatives : ( ( ruleLayout ) | ( ruleVertical ) | ( ruleHorizontal ) );
    public final void rule__LayoutType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:927:1: ( ( ruleLayout ) | ( ruleVertical ) | ( ruleHorizontal ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 17:
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
            case 20:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGuilang.g:928:2: ( ruleLayout )
                    {
                    // InternalGuilang.g:928:2: ( ruleLayout )
                    // InternalGuilang.g:929:3: ruleLayout
                    {
                     before(grammarAccess.getLayoutTypeAccess().getLayoutParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLayout();

                    state._fsp--;

                     after(grammarAccess.getLayoutTypeAccess().getLayoutParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:934:2: ( ruleVertical )
                    {
                    // InternalGuilang.g:934:2: ( ruleVertical )
                    // InternalGuilang.g:935:3: ruleVertical
                    {
                     before(grammarAccess.getLayoutTypeAccess().getVerticalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVertical();

                    state._fsp--;

                     after(grammarAccess.getLayoutTypeAccess().getVerticalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuilang.g:940:2: ( ruleHorizontal )
                    {
                    // InternalGuilang.g:940:2: ( ruleHorizontal )
                    // InternalGuilang.g:941:3: ruleHorizontal
                    {
                     before(grammarAccess.getLayoutTypeAccess().getHorizontalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleHorizontal();

                    state._fsp--;

                     after(grammarAccess.getLayoutTypeAccess().getHorizontalParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutType__Alternatives"


    // $ANTLR start "rule__Vertical__Alternatives_1"
    // InternalGuilang.g:950:1: rule__Vertical__Alternatives_1 : ( ( 'vertical' ) | ( 'vert' ) );
    public final void rule__Vertical__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:954:1: ( ( 'vertical' ) | ( 'vert' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGuilang.g:955:2: ( 'vertical' )
                    {
                    // InternalGuilang.g:955:2: ( 'vertical' )
                    // InternalGuilang.g:956:3: 'vertical'
                    {
                     before(grammarAccess.getVerticalAccess().getVerticalKeyword_1_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVerticalAccess().getVerticalKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:961:2: ( 'vert' )
                    {
                    // InternalGuilang.g:961:2: ( 'vert' )
                    // InternalGuilang.g:962:3: 'vert'
                    {
                     before(grammarAccess.getVerticalAccess().getVertKeyword_1_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVerticalAccess().getVertKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Alternatives_1"


    // $ANTLR start "rule__Horizontal__Alternatives_1"
    // InternalGuilang.g:971:1: rule__Horizontal__Alternatives_1 : ( ( 'horizontal' ) | ( 'hori' ) );
    public final void rule__Horizontal__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:975:1: ( ( 'horizontal' ) | ( 'hori' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGuilang.g:976:2: ( 'horizontal' )
                    {
                    // InternalGuilang.g:976:2: ( 'horizontal' )
                    // InternalGuilang.g:977:3: 'horizontal'
                    {
                     before(grammarAccess.getHorizontalAccess().getHorizontalKeyword_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getHorizontalAccess().getHorizontalKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:982:2: ( 'hori' )
                    {
                    // InternalGuilang.g:982:2: ( 'hori' )
                    // InternalGuilang.g:983:3: 'hori'
                    {
                     before(grammarAccess.getHorizontalAccess().getHoriKeyword_1_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getHorizontalAccess().getHoriKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Alternatives_1"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalGuilang.g:992:1: rule__Element__Alternatives : ( ( ruleLabel ) | ( ruleButton ) | ( ruleInput ) | ( ruleCheckbox ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:996:1: ( ( ruleLabel ) | ( ruleButton ) | ( ruleInput ) | ( ruleCheckbox ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_LABEL_TYPE:
                {
                alt5=1;
                }
                break;
            case RULE_BUTTON_TYPE:
                {
                alt5=2;
                }
                break;
            case RULE_INPUT_TYPE:
                {
                alt5=3;
                }
                break;
            case RULE_CHECKBOX_TYPE:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGuilang.g:997:2: ( ruleLabel )
                    {
                    // InternalGuilang.g:997:2: ( ruleLabel )
                    // InternalGuilang.g:998:3: ruleLabel
                    {
                     before(grammarAccess.getElementAccess().getLabelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLabelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1003:2: ( ruleButton )
                    {
                    // InternalGuilang.g:1003:2: ( ruleButton )
                    // InternalGuilang.g:1004:3: ruleButton
                    {
                     before(grammarAccess.getElementAccess().getButtonParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getButtonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuilang.g:1009:2: ( ruleInput )
                    {
                    // InternalGuilang.g:1009:2: ( ruleInput )
                    // InternalGuilang.g:1010:3: ruleInput
                    {
                     before(grammarAccess.getElementAccess().getInputParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInput();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getInputParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuilang.g:1015:2: ( ruleCheckbox )
                    {
                    // InternalGuilang.g:1015:2: ( ruleCheckbox )
                    // InternalGuilang.g:1016:3: ruleCheckbox
                    {
                     before(grammarAccess.getElementAccess().getCheckboxParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckbox();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCheckboxParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Specification__TypeAlternatives_0"
    // InternalGuilang.g:1025:1: rule__Specification__TypeAlternatives_0 : ( ( ruleLayoutSpec ) | ( ruleVerticalSpec ) | ( ruleHorizontalSpec ) | ( ruleLabelSpec ) | ( ruleButtonSpec ) | ( ruleInputSpec ) | ( ruleCheckboxSpec ) );
    public final void rule__Specification__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1029:1: ( ( ruleLayoutSpec ) | ( ruleVerticalSpec ) | ( ruleHorizontalSpec ) | ( ruleLabelSpec ) | ( ruleButtonSpec ) | ( ruleInputSpec ) | ( ruleCheckboxSpec ) )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalGuilang.g:1030:2: ( ruleLayoutSpec )
                    {
                    // InternalGuilang.g:1030:2: ( ruleLayoutSpec )
                    // InternalGuilang.g:1031:3: ruleLayoutSpec
                    {
                     before(grammarAccess.getSpecificationAccess().getTypeLayoutSpecParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLayoutSpec();

                    state._fsp--;

                     after(grammarAccess.getSpecificationAccess().getTypeLayoutSpecParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1036:2: ( ruleVerticalSpec )
                    {
                    // InternalGuilang.g:1036:2: ( ruleVerticalSpec )
                    // InternalGuilang.g:1037:3: ruleVerticalSpec
                    {
                     before(grammarAccess.getSpecificationAccess().getTypeVerticalSpecParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVerticalSpec();

                    state._fsp--;

                     after(grammarAccess.getSpecificationAccess().getTypeVerticalSpecParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuilang.g:1042:2: ( ruleHorizontalSpec )
                    {
                    // InternalGuilang.g:1042:2: ( ruleHorizontalSpec )
                    // InternalGuilang.g:1043:3: ruleHorizontalSpec
                    {
                     before(grammarAccess.getSpecificationAccess().getTypeHorizontalSpecParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleHorizontalSpec();

                    state._fsp--;

                     after(grammarAccess.getSpecificationAccess().getTypeHorizontalSpecParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuilang.g:1048:2: ( ruleLabelSpec )
                    {
                    // InternalGuilang.g:1048:2: ( ruleLabelSpec )
                    // InternalGuilang.g:1049:3: ruleLabelSpec
                    {
                     before(grammarAccess.getSpecificationAccess().getTypeLabelSpecParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLabelSpec();

                    state._fsp--;

                     after(grammarAccess.getSpecificationAccess().getTypeLabelSpecParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuilang.g:1054:2: ( ruleButtonSpec )
                    {
                    // InternalGuilang.g:1054:2: ( ruleButtonSpec )
                    // InternalGuilang.g:1055:3: ruleButtonSpec
                    {
                     before(grammarAccess.getSpecificationAccess().getTypeButtonSpecParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleButtonSpec();

                    state._fsp--;

                     after(grammarAccess.getSpecificationAccess().getTypeButtonSpecParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuilang.g:1060:2: ( ruleInputSpec )
                    {
                    // InternalGuilang.g:1060:2: ( ruleInputSpec )
                    // InternalGuilang.g:1061:3: ruleInputSpec
                    {
                     before(grammarAccess.getSpecificationAccess().getTypeInputSpecParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleInputSpec();

                    state._fsp--;

                     after(grammarAccess.getSpecificationAccess().getTypeInputSpecParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGuilang.g:1066:2: ( ruleCheckboxSpec )
                    {
                    // InternalGuilang.g:1066:2: ( ruleCheckboxSpec )
                    // InternalGuilang.g:1067:3: ruleCheckboxSpec
                    {
                     before(grammarAccess.getSpecificationAccess().getTypeCheckboxSpecParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckboxSpec();

                    state._fsp--;

                     after(grammarAccess.getSpecificationAccess().getTypeCheckboxSpecParserRuleCall_0_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__TypeAlternatives_0"


    // $ANTLR start "rule__InputSpecOptions__Alternatives"
    // InternalGuilang.g:1076:1: rule__InputSpecOptions__Alternatives : ( ( ruleTextValidate ) | ( ruleRequireElements ) );
    public final void rule__InputSpecOptions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1080:1: ( ( ruleTextValidate ) | ( ruleRequireElements ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGuilang.g:1081:2: ( ruleTextValidate )
                    {
                    // InternalGuilang.g:1081:2: ( ruleTextValidate )
                    // InternalGuilang.g:1082:3: ruleTextValidate
                    {
                     before(grammarAccess.getInputSpecOptionsAccess().getTextValidateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTextValidate();

                    state._fsp--;

                     after(grammarAccess.getInputSpecOptionsAccess().getTextValidateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1087:2: ( ruleRequireElements )
                    {
                    // InternalGuilang.g:1087:2: ( ruleRequireElements )
                    // InternalGuilang.g:1088:3: ruleRequireElements
                    {
                     before(grammarAccess.getInputSpecOptionsAccess().getRequireElementsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRequireElements();

                    state._fsp--;

                     after(grammarAccess.getInputSpecOptionsAccess().getRequireElementsParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSpecOptions__Alternatives"


    // $ANTLR start "rule__TextValidate__ValidationAlternatives_1_0"
    // InternalGuilang.g:1097:1: rule__TextValidate__ValidationAlternatives_1_0 : ( ( ruleRegexValidate ) | ( ruleRegexVariableRef ) | ( rulePresetTextValidate ) );
    public final void rule__TextValidate__ValidationAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1101:1: ( ( ruleRegexValidate ) | ( ruleRegexVariableRef ) | ( rulePresetTextValidate ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 43:
            case 44:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGuilang.g:1102:2: ( ruleRegexValidate )
                    {
                    // InternalGuilang.g:1102:2: ( ruleRegexValidate )
                    // InternalGuilang.g:1103:3: ruleRegexValidate
                    {
                     before(grammarAccess.getTextValidateAccess().getValidationRegexValidateParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRegexValidate();

                    state._fsp--;

                     after(grammarAccess.getTextValidateAccess().getValidationRegexValidateParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1108:2: ( ruleRegexVariableRef )
                    {
                    // InternalGuilang.g:1108:2: ( ruleRegexVariableRef )
                    // InternalGuilang.g:1109:3: ruleRegexVariableRef
                    {
                     before(grammarAccess.getTextValidateAccess().getValidationRegexVariableRefParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRegexVariableRef();

                    state._fsp--;

                     after(grammarAccess.getTextValidateAccess().getValidationRegexVariableRefParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuilang.g:1114:2: ( rulePresetTextValidate )
                    {
                    // InternalGuilang.g:1114:2: ( rulePresetTextValidate )
                    // InternalGuilang.g:1115:3: rulePresetTextValidate
                    {
                     before(grammarAccess.getTextValidateAccess().getValidationPresetTextValidateParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    rulePresetTextValidate();

                    state._fsp--;

                     after(grammarAccess.getTextValidateAccess().getValidationPresetTextValidateParserRuleCall_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValidate__ValidationAlternatives_1_0"


    // $ANTLR start "rule__PresetTextValidate__Alternatives"
    // InternalGuilang.g:1124:1: rule__PresetTextValidate__Alternatives : ( ( ( rule__PresetTextValidate__ValueAssignment_0 ) ) | ( ( rule__PresetTextValidate__ValueAssignment_1 ) ) );
    public final void rule__PresetTextValidate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1128:1: ( ( ( rule__PresetTextValidate__ValueAssignment_0 ) ) | ( ( rule__PresetTextValidate__ValueAssignment_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            else if ( (LA9_0==44) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGuilang.g:1129:2: ( ( rule__PresetTextValidate__ValueAssignment_0 ) )
                    {
                    // InternalGuilang.g:1129:2: ( ( rule__PresetTextValidate__ValueAssignment_0 ) )
                    // InternalGuilang.g:1130:3: ( rule__PresetTextValidate__ValueAssignment_0 )
                    {
                     before(grammarAccess.getPresetTextValidateAccess().getValueAssignment_0()); 
                    // InternalGuilang.g:1131:3: ( rule__PresetTextValidate__ValueAssignment_0 )
                    // InternalGuilang.g:1131:4: rule__PresetTextValidate__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PresetTextValidate__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPresetTextValidateAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1135:2: ( ( rule__PresetTextValidate__ValueAssignment_1 ) )
                    {
                    // InternalGuilang.g:1135:2: ( ( rule__PresetTextValidate__ValueAssignment_1 ) )
                    // InternalGuilang.g:1136:3: ( rule__PresetTextValidate__ValueAssignment_1 )
                    {
                     before(grammarAccess.getPresetTextValidateAccess().getValueAssignment_1()); 
                    // InternalGuilang.g:1137:3: ( rule__PresetTextValidate__ValueAssignment_1 )
                    // InternalGuilang.g:1137:4: rule__PresetTextValidate__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PresetTextValidate__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPresetTextValidateAccess().getValueAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PresetTextValidate__Alternatives"


    // $ANTLR start "rule__CheckboxValidate__ValueAlternatives_0"
    // InternalGuilang.g:1145:1: rule__CheckboxValidate__ValueAlternatives_0 : ( ( 'is-checked' ) | ( 'is-unchecked' ) );
    public final void rule__CheckboxValidate__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1149:1: ( ( 'is-checked' ) | ( 'is-unchecked' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGuilang.g:1150:2: ( 'is-checked' )
                    {
                    // InternalGuilang.g:1150:2: ( 'is-checked' )
                    // InternalGuilang.g:1151:3: 'is-checked'
                    {
                     before(grammarAccess.getCheckboxValidateAccess().getValueIsCheckedKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCheckboxValidateAccess().getValueIsCheckedKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1156:2: ( 'is-unchecked' )
                    {
                    // InternalGuilang.g:1156:2: ( 'is-unchecked' )
                    // InternalGuilang.g:1157:3: 'is-unchecked'
                    {
                     before(grammarAccess.getCheckboxValidateAccess().getValueIsUncheckedKeyword_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getCheckboxValidateAccess().getValueIsUncheckedKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxValidate__ValueAlternatives_0"


    // $ANTLR start "rule__RequireBase__Alternatives"
    // InternalGuilang.g:1166:1: rule__RequireBase__Alternatives : ( ( ( rule__RequireBase__Group_0__0 ) ) | ( ( rule__RequireBase__Group_1__0 ) ) | ( ( rule__RequireBase__Group_2__0 ) ) );
    public final void rule__RequireBase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1170:1: ( ( ( rule__RequireBase__Group_0__0 ) ) | ( ( rule__RequireBase__Group_1__0 ) ) | ( ( rule__RequireBase__Group_2__0 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt11=1;
                }
                break;
            case 23:
            case 24:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalGuilang.g:1171:2: ( ( rule__RequireBase__Group_0__0 ) )
                    {
                    // InternalGuilang.g:1171:2: ( ( rule__RequireBase__Group_0__0 ) )
                    // InternalGuilang.g:1172:3: ( rule__RequireBase__Group_0__0 )
                    {
                     before(grammarAccess.getRequireBaseAccess().getGroup_0()); 
                    // InternalGuilang.g:1173:3: ( rule__RequireBase__Group_0__0 )
                    // InternalGuilang.g:1173:4: rule__RequireBase__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RequireBase__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequireBaseAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1177:2: ( ( rule__RequireBase__Group_1__0 ) )
                    {
                    // InternalGuilang.g:1177:2: ( ( rule__RequireBase__Group_1__0 ) )
                    // InternalGuilang.g:1178:3: ( rule__RequireBase__Group_1__0 )
                    {
                     before(grammarAccess.getRequireBaseAccess().getGroup_1()); 
                    // InternalGuilang.g:1179:3: ( rule__RequireBase__Group_1__0 )
                    // InternalGuilang.g:1179:4: rule__RequireBase__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RequireBase__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequireBaseAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuilang.g:1183:2: ( ( rule__RequireBase__Group_2__0 ) )
                    {
                    // InternalGuilang.g:1183:2: ( ( rule__RequireBase__Group_2__0 ) )
                    // InternalGuilang.g:1184:3: ( rule__RequireBase__Group_2__0 )
                    {
                     before(grammarAccess.getRequireBaseAccess().getGroup_2()); 
                    // InternalGuilang.g:1185:3: ( rule__RequireBase__Group_2__0 )
                    // InternalGuilang.g:1185:4: rule__RequireBase__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RequireBase__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequireBaseAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Alternatives"


    // $ANTLR start "rule__RequireBase__Alternatives_1_1"
    // InternalGuilang.g:1193:1: rule__RequireBase__Alternatives_1_1 : ( ( '!' ) | ( 'NOT' ) );
    public final void rule__RequireBase__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1197:1: ( ( '!' ) | ( 'NOT' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGuilang.g:1198:2: ( '!' )
                    {
                    // InternalGuilang.g:1198:2: ( '!' )
                    // InternalGuilang.g:1199:3: '!'
                    {
                     before(grammarAccess.getRequireBaseAccess().getExclamationMarkKeyword_1_1_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getRequireBaseAccess().getExclamationMarkKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1204:2: ( 'NOT' )
                    {
                    // InternalGuilang.g:1204:2: ( 'NOT' )
                    // InternalGuilang.g:1205:3: 'NOT'
                    {
                     before(grammarAccess.getRequireBaseAccess().getNOTKeyword_1_1_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getRequireBaseAccess().getNOTKeyword_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Alternatives_1_1"


    // $ANTLR start "rule__Main__Group__0"
    // InternalGuilang.g:1214:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1218:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalGuilang.g:1219:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // InternalGuilang.g:1226:1: rule__Main__Group__0__Impl : ( 'main' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1230:1: ( ( 'main' ) )
            // InternalGuilang.g:1231:1: ( 'main' )
            {
            // InternalGuilang.g:1231:1: ( 'main' )
            // InternalGuilang.g:1232:2: 'main'
            {
             before(grammarAccess.getMainAccess().getMainKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getMainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // InternalGuilang.g:1241:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1245:1: ( rule__Main__Group__1__Impl )
            // InternalGuilang.g:1246:2: rule__Main__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // InternalGuilang.g:1252:1: rule__Main__Group__1__Impl : ( ruleUnit ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1256:1: ( ( ruleUnit ) )
            // InternalGuilang.g:1257:1: ( ruleUnit )
            {
            // InternalGuilang.g:1257:1: ( ruleUnit )
            // InternalGuilang.g:1258:2: ruleUnit
            {
             before(grammarAccess.getMainAccess().getUnitParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getMainAccess().getUnitParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Unit__Group__0"
    // InternalGuilang.g:1268:1: rule__Unit__Group__0 : rule__Unit__Group__0__Impl rule__Unit__Group__1 ;
    public final void rule__Unit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1272:1: ( rule__Unit__Group__0__Impl rule__Unit__Group__1 )
            // InternalGuilang.g:1273:2: rule__Unit__Group__0__Impl rule__Unit__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Unit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__0"


    // $ANTLR start "rule__Unit__Group__0__Impl"
    // InternalGuilang.g:1280:1: rule__Unit__Group__0__Impl : ( RULE_OPEN ) ;
    public final void rule__Unit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1284:1: ( ( RULE_OPEN ) )
            // InternalGuilang.g:1285:1: ( RULE_OPEN )
            {
            // InternalGuilang.g:1285:1: ( RULE_OPEN )
            // InternalGuilang.g:1286:2: RULE_OPEN
            {
             before(grammarAccess.getUnitAccess().getOPENTerminalRuleCall_0()); 
            match(input,RULE_OPEN,FOLLOW_2); 
             after(grammarAccess.getUnitAccess().getOPENTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__0__Impl"


    // $ANTLR start "rule__Unit__Group__1"
    // InternalGuilang.g:1295:1: rule__Unit__Group__1 : rule__Unit__Group__1__Impl rule__Unit__Group__2 ;
    public final void rule__Unit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1299:1: ( rule__Unit__Group__1__Impl rule__Unit__Group__2 )
            // InternalGuilang.g:1300:2: rule__Unit__Group__1__Impl rule__Unit__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Unit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__1"


    // $ANTLR start "rule__Unit__Group__1__Impl"
    // InternalGuilang.g:1307:1: rule__Unit__Group__1__Impl : ( ( rule__Unit__LayoutAssignment_1 ) ) ;
    public final void rule__Unit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1311:1: ( ( ( rule__Unit__LayoutAssignment_1 ) ) )
            // InternalGuilang.g:1312:1: ( ( rule__Unit__LayoutAssignment_1 ) )
            {
            // InternalGuilang.g:1312:1: ( ( rule__Unit__LayoutAssignment_1 ) )
            // InternalGuilang.g:1313:2: ( rule__Unit__LayoutAssignment_1 )
            {
             before(grammarAccess.getUnitAccess().getLayoutAssignment_1()); 
            // InternalGuilang.g:1314:2: ( rule__Unit__LayoutAssignment_1 )
            // InternalGuilang.g:1314:3: rule__Unit__LayoutAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Unit__LayoutAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getLayoutAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__1__Impl"


    // $ANTLR start "rule__Unit__Group__2"
    // InternalGuilang.g:1322:1: rule__Unit__Group__2 : rule__Unit__Group__2__Impl rule__Unit__Group__3 ;
    public final void rule__Unit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1326:1: ( rule__Unit__Group__2__Impl rule__Unit__Group__3 )
            // InternalGuilang.g:1327:2: rule__Unit__Group__2__Impl rule__Unit__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Unit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__2"


    // $ANTLR start "rule__Unit__Group__2__Impl"
    // InternalGuilang.g:1334:1: rule__Unit__Group__2__Impl : ( ( rule__Unit__SpecificationsAssignment_2 )? ) ;
    public final void rule__Unit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1338:1: ( ( ( rule__Unit__SpecificationsAssignment_2 )? ) )
            // InternalGuilang.g:1339:1: ( ( rule__Unit__SpecificationsAssignment_2 )? )
            {
            // InternalGuilang.g:1339:1: ( ( rule__Unit__SpecificationsAssignment_2 )? )
            // InternalGuilang.g:1340:2: ( rule__Unit__SpecificationsAssignment_2 )?
            {
             before(grammarAccess.getUnitAccess().getSpecificationsAssignment_2()); 
            // InternalGuilang.g:1341:2: ( rule__Unit__SpecificationsAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGuilang.g:1341:3: rule__Unit__SpecificationsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unit__SpecificationsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnitAccess().getSpecificationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__2__Impl"


    // $ANTLR start "rule__Unit__Group__3"
    // InternalGuilang.g:1349:1: rule__Unit__Group__3 : rule__Unit__Group__3__Impl ;
    public final void rule__Unit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1353:1: ( rule__Unit__Group__3__Impl )
            // InternalGuilang.g:1354:2: rule__Unit__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Unit__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__3"


    // $ANTLR start "rule__Unit__Group__3__Impl"
    // InternalGuilang.g:1360:1: rule__Unit__Group__3__Impl : ( RULE_CLOSE ) ;
    public final void rule__Unit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1364:1: ( ( RULE_CLOSE ) )
            // InternalGuilang.g:1365:1: ( RULE_CLOSE )
            {
            // InternalGuilang.g:1365:1: ( RULE_CLOSE )
            // InternalGuilang.g:1366:2: RULE_CLOSE
            {
             before(grammarAccess.getUnitAccess().getCLOSETerminalRuleCall_3()); 
            match(input,RULE_CLOSE,FOLLOW_2); 
             after(grammarAccess.getUnitAccess().getCLOSETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group__3__Impl"


    // $ANTLR start "rule__Layout__Group__0"
    // InternalGuilang.g:1376:1: rule__Layout__Group__0 : rule__Layout__Group__0__Impl rule__Layout__Group__1 ;
    public final void rule__Layout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1380:1: ( rule__Layout__Group__0__Impl rule__Layout__Group__1 )
            // InternalGuilang.g:1381:2: rule__Layout__Group__0__Impl rule__Layout__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Layout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layout__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__0"


    // $ANTLR start "rule__Layout__Group__0__Impl"
    // InternalGuilang.g:1388:1: rule__Layout__Group__0__Impl : ( () ) ;
    public final void rule__Layout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1392:1: ( ( () ) )
            // InternalGuilang.g:1393:1: ( () )
            {
            // InternalGuilang.g:1393:1: ( () )
            // InternalGuilang.g:1394:2: ()
            {
             before(grammarAccess.getLayoutAccess().getLayoutAction_0()); 
            // InternalGuilang.g:1395:2: ()
            // InternalGuilang.g:1395:3: 
            {
            }

             after(grammarAccess.getLayoutAccess().getLayoutAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__0__Impl"


    // $ANTLR start "rule__Layout__Group__1"
    // InternalGuilang.g:1403:1: rule__Layout__Group__1 : rule__Layout__Group__1__Impl rule__Layout__Group__2 ;
    public final void rule__Layout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1407:1: ( rule__Layout__Group__1__Impl rule__Layout__Group__2 )
            // InternalGuilang.g:1408:2: rule__Layout__Group__1__Impl rule__Layout__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Layout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layout__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__1"


    // $ANTLR start "rule__Layout__Group__1__Impl"
    // InternalGuilang.g:1415:1: rule__Layout__Group__1__Impl : ( 'layout' ) ;
    public final void rule__Layout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1419:1: ( ( 'layout' ) )
            // InternalGuilang.g:1420:1: ( 'layout' )
            {
            // InternalGuilang.g:1420:1: ( 'layout' )
            // InternalGuilang.g:1421:2: 'layout'
            {
             before(grammarAccess.getLayoutAccess().getLayoutKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLayoutAccess().getLayoutKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__1__Impl"


    // $ANTLR start "rule__Layout__Group__2"
    // InternalGuilang.g:1430:1: rule__Layout__Group__2 : rule__Layout__Group__2__Impl rule__Layout__Group__3 ;
    public final void rule__Layout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1434:1: ( rule__Layout__Group__2__Impl rule__Layout__Group__3 )
            // InternalGuilang.g:1435:2: rule__Layout__Group__2__Impl rule__Layout__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Layout__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layout__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__2"


    // $ANTLR start "rule__Layout__Group__2__Impl"
    // InternalGuilang.g:1442:1: rule__Layout__Group__2__Impl : ( ( rule__Layout__NameAssignment_2 )? ) ;
    public final void rule__Layout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1446:1: ( ( ( rule__Layout__NameAssignment_2 )? ) )
            // InternalGuilang.g:1447:1: ( ( rule__Layout__NameAssignment_2 )? )
            {
            // InternalGuilang.g:1447:1: ( ( rule__Layout__NameAssignment_2 )? )
            // InternalGuilang.g:1448:2: ( rule__Layout__NameAssignment_2 )?
            {
             before(grammarAccess.getLayoutAccess().getNameAssignment_2()); 
            // InternalGuilang.g:1449:2: ( rule__Layout__NameAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGuilang.g:1449:3: rule__Layout__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layout__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayoutAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__2__Impl"


    // $ANTLR start "rule__Layout__Group__3"
    // InternalGuilang.g:1457:1: rule__Layout__Group__3 : rule__Layout__Group__3__Impl rule__Layout__Group__4 ;
    public final void rule__Layout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1461:1: ( rule__Layout__Group__3__Impl rule__Layout__Group__4 )
            // InternalGuilang.g:1462:2: rule__Layout__Group__3__Impl rule__Layout__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Layout__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layout__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__3"


    // $ANTLR start "rule__Layout__Group__3__Impl"
    // InternalGuilang.g:1469:1: rule__Layout__Group__3__Impl : ( RULE_OPEN ) ;
    public final void rule__Layout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1473:1: ( ( RULE_OPEN ) )
            // InternalGuilang.g:1474:1: ( RULE_OPEN )
            {
            // InternalGuilang.g:1474:1: ( RULE_OPEN )
            // InternalGuilang.g:1475:2: RULE_OPEN
            {
             before(grammarAccess.getLayoutAccess().getOPENTerminalRuleCall_3()); 
            match(input,RULE_OPEN,FOLLOW_2); 
             after(grammarAccess.getLayoutAccess().getOPENTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__3__Impl"


    // $ANTLR start "rule__Layout__Group__4"
    // InternalGuilang.g:1484:1: rule__Layout__Group__4 : rule__Layout__Group__4__Impl rule__Layout__Group__5 ;
    public final void rule__Layout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1488:1: ( rule__Layout__Group__4__Impl rule__Layout__Group__5 )
            // InternalGuilang.g:1489:2: rule__Layout__Group__4__Impl rule__Layout__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Layout__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layout__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__4"


    // $ANTLR start "rule__Layout__Group__4__Impl"
    // InternalGuilang.g:1496:1: rule__Layout__Group__4__Impl : ( ( rule__Layout__EntitiesAssignment_4 )* ) ;
    public final void rule__Layout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1500:1: ( ( ( rule__Layout__EntitiesAssignment_4 )* ) )
            // InternalGuilang.g:1501:1: ( ( rule__Layout__EntitiesAssignment_4 )* )
            {
            // InternalGuilang.g:1501:1: ( ( rule__Layout__EntitiesAssignment_4 )* )
            // InternalGuilang.g:1502:2: ( rule__Layout__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getLayoutAccess().getEntitiesAssignment_4()); 
            // InternalGuilang.g:1503:2: ( rule__Layout__EntitiesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_LABEL_TYPE && LA15_0<=RULE_CHECKBOX_TYPE)||(LA15_0>=17 && LA15_0<=20)||LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGuilang.g:1503:3: rule__Layout__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Layout__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getLayoutAccess().getEntitiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__4__Impl"


    // $ANTLR start "rule__Layout__Group__5"
    // InternalGuilang.g:1511:1: rule__Layout__Group__5 : rule__Layout__Group__5__Impl ;
    public final void rule__Layout__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1515:1: ( rule__Layout__Group__5__Impl )
            // InternalGuilang.g:1516:2: rule__Layout__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__5"


    // $ANTLR start "rule__Layout__Group__5__Impl"
    // InternalGuilang.g:1522:1: rule__Layout__Group__5__Impl : ( RULE_CLOSE ) ;
    public final void rule__Layout__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1526:1: ( ( RULE_CLOSE ) )
            // InternalGuilang.g:1527:1: ( RULE_CLOSE )
            {
            // InternalGuilang.g:1527:1: ( RULE_CLOSE )
            // InternalGuilang.g:1528:2: RULE_CLOSE
            {
             before(grammarAccess.getLayoutAccess().getCLOSETerminalRuleCall_5()); 
            match(input,RULE_CLOSE,FOLLOW_2); 
             after(grammarAccess.getLayoutAccess().getCLOSETerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__5__Impl"


    // $ANTLR start "rule__Vertical__Group__0"
    // InternalGuilang.g:1538:1: rule__Vertical__Group__0 : rule__Vertical__Group__0__Impl rule__Vertical__Group__1 ;
    public final void rule__Vertical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1542:1: ( rule__Vertical__Group__0__Impl rule__Vertical__Group__1 )
            // InternalGuilang.g:1543:2: rule__Vertical__Group__0__Impl rule__Vertical__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Vertical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vertical__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__0"


    // $ANTLR start "rule__Vertical__Group__0__Impl"
    // InternalGuilang.g:1550:1: rule__Vertical__Group__0__Impl : ( () ) ;
    public final void rule__Vertical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1554:1: ( ( () ) )
            // InternalGuilang.g:1555:1: ( () )
            {
            // InternalGuilang.g:1555:1: ( () )
            // InternalGuilang.g:1556:2: ()
            {
             before(grammarAccess.getVerticalAccess().getVerticalAction_0()); 
            // InternalGuilang.g:1557:2: ()
            // InternalGuilang.g:1557:3: 
            {
            }

             after(grammarAccess.getVerticalAccess().getVerticalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__0__Impl"


    // $ANTLR start "rule__Vertical__Group__1"
    // InternalGuilang.g:1565:1: rule__Vertical__Group__1 : rule__Vertical__Group__1__Impl rule__Vertical__Group__2 ;
    public final void rule__Vertical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1569:1: ( rule__Vertical__Group__1__Impl rule__Vertical__Group__2 )
            // InternalGuilang.g:1570:2: rule__Vertical__Group__1__Impl rule__Vertical__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Vertical__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vertical__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__1"


    // $ANTLR start "rule__Vertical__Group__1__Impl"
    // InternalGuilang.g:1577:1: rule__Vertical__Group__1__Impl : ( ( rule__Vertical__Alternatives_1 ) ) ;
    public final void rule__Vertical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1581:1: ( ( ( rule__Vertical__Alternatives_1 ) ) )
            // InternalGuilang.g:1582:1: ( ( rule__Vertical__Alternatives_1 ) )
            {
            // InternalGuilang.g:1582:1: ( ( rule__Vertical__Alternatives_1 ) )
            // InternalGuilang.g:1583:2: ( rule__Vertical__Alternatives_1 )
            {
             before(grammarAccess.getVerticalAccess().getAlternatives_1()); 
            // InternalGuilang.g:1584:2: ( rule__Vertical__Alternatives_1 )
            // InternalGuilang.g:1584:3: rule__Vertical__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Vertical__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getVerticalAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__1__Impl"


    // $ANTLR start "rule__Vertical__Group__2"
    // InternalGuilang.g:1592:1: rule__Vertical__Group__2 : rule__Vertical__Group__2__Impl rule__Vertical__Group__3 ;
    public final void rule__Vertical__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1596:1: ( rule__Vertical__Group__2__Impl rule__Vertical__Group__3 )
            // InternalGuilang.g:1597:2: rule__Vertical__Group__2__Impl rule__Vertical__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Vertical__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vertical__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__2"


    // $ANTLR start "rule__Vertical__Group__2__Impl"
    // InternalGuilang.g:1604:1: rule__Vertical__Group__2__Impl : ( ( rule__Vertical__NameAssignment_2 )? ) ;
    public final void rule__Vertical__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1608:1: ( ( ( rule__Vertical__NameAssignment_2 )? ) )
            // InternalGuilang.g:1609:1: ( ( rule__Vertical__NameAssignment_2 )? )
            {
            // InternalGuilang.g:1609:1: ( ( rule__Vertical__NameAssignment_2 )? )
            // InternalGuilang.g:1610:2: ( rule__Vertical__NameAssignment_2 )?
            {
             before(grammarAccess.getVerticalAccess().getNameAssignment_2()); 
            // InternalGuilang.g:1611:2: ( rule__Vertical__NameAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGuilang.g:1611:3: rule__Vertical__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Vertical__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVerticalAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__2__Impl"


    // $ANTLR start "rule__Vertical__Group__3"
    // InternalGuilang.g:1619:1: rule__Vertical__Group__3 : rule__Vertical__Group__3__Impl rule__Vertical__Group__4 ;
    public final void rule__Vertical__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1623:1: ( rule__Vertical__Group__3__Impl rule__Vertical__Group__4 )
            // InternalGuilang.g:1624:2: rule__Vertical__Group__3__Impl rule__Vertical__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Vertical__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vertical__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__3"


    // $ANTLR start "rule__Vertical__Group__3__Impl"
    // InternalGuilang.g:1631:1: rule__Vertical__Group__3__Impl : ( RULE_OPEN ) ;
    public final void rule__Vertical__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1635:1: ( ( RULE_OPEN ) )
            // InternalGuilang.g:1636:1: ( RULE_OPEN )
            {
            // InternalGuilang.g:1636:1: ( RULE_OPEN )
            // InternalGuilang.g:1637:2: RULE_OPEN
            {
             before(grammarAccess.getVerticalAccess().getOPENTerminalRuleCall_3()); 
            match(input,RULE_OPEN,FOLLOW_2); 
             after(grammarAccess.getVerticalAccess().getOPENTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__3__Impl"


    // $ANTLR start "rule__Vertical__Group__4"
    // InternalGuilang.g:1646:1: rule__Vertical__Group__4 : rule__Vertical__Group__4__Impl rule__Vertical__Group__5 ;
    public final void rule__Vertical__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1650:1: ( rule__Vertical__Group__4__Impl rule__Vertical__Group__5 )
            // InternalGuilang.g:1651:2: rule__Vertical__Group__4__Impl rule__Vertical__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Vertical__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vertical__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__4"


    // $ANTLR start "rule__Vertical__Group__4__Impl"
    // InternalGuilang.g:1658:1: rule__Vertical__Group__4__Impl : ( ( rule__Vertical__EntitiesAssignment_4 )* ) ;
    public final void rule__Vertical__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1662:1: ( ( ( rule__Vertical__EntitiesAssignment_4 )* ) )
            // InternalGuilang.g:1663:1: ( ( rule__Vertical__EntitiesAssignment_4 )* )
            {
            // InternalGuilang.g:1663:1: ( ( rule__Vertical__EntitiesAssignment_4 )* )
            // InternalGuilang.g:1664:2: ( rule__Vertical__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getVerticalAccess().getEntitiesAssignment_4()); 
            // InternalGuilang.g:1665:2: ( rule__Vertical__EntitiesAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_LABEL_TYPE && LA17_0<=RULE_CHECKBOX_TYPE)||(LA17_0>=17 && LA17_0<=20)||LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGuilang.g:1665:3: rule__Vertical__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Vertical__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getVerticalAccess().getEntitiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__4__Impl"


    // $ANTLR start "rule__Vertical__Group__5"
    // InternalGuilang.g:1673:1: rule__Vertical__Group__5 : rule__Vertical__Group__5__Impl ;
    public final void rule__Vertical__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1677:1: ( rule__Vertical__Group__5__Impl )
            // InternalGuilang.g:1678:2: rule__Vertical__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vertical__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__5"


    // $ANTLR start "rule__Vertical__Group__5__Impl"
    // InternalGuilang.g:1684:1: rule__Vertical__Group__5__Impl : ( RULE_CLOSE ) ;
    public final void rule__Vertical__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1688:1: ( ( RULE_CLOSE ) )
            // InternalGuilang.g:1689:1: ( RULE_CLOSE )
            {
            // InternalGuilang.g:1689:1: ( RULE_CLOSE )
            // InternalGuilang.g:1690:2: RULE_CLOSE
            {
             before(grammarAccess.getVerticalAccess().getCLOSETerminalRuleCall_5()); 
            match(input,RULE_CLOSE,FOLLOW_2); 
             after(grammarAccess.getVerticalAccess().getCLOSETerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__Group__5__Impl"


    // $ANTLR start "rule__Horizontal__Group__0"
    // InternalGuilang.g:1700:1: rule__Horizontal__Group__0 : rule__Horizontal__Group__0__Impl rule__Horizontal__Group__1 ;
    public final void rule__Horizontal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1704:1: ( rule__Horizontal__Group__0__Impl rule__Horizontal__Group__1 )
            // InternalGuilang.g:1705:2: rule__Horizontal__Group__0__Impl rule__Horizontal__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Horizontal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Horizontal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__0"


    // $ANTLR start "rule__Horizontal__Group__0__Impl"
    // InternalGuilang.g:1712:1: rule__Horizontal__Group__0__Impl : ( () ) ;
    public final void rule__Horizontal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1716:1: ( ( () ) )
            // InternalGuilang.g:1717:1: ( () )
            {
            // InternalGuilang.g:1717:1: ( () )
            // InternalGuilang.g:1718:2: ()
            {
             before(grammarAccess.getHorizontalAccess().getHorizontalAction_0()); 
            // InternalGuilang.g:1719:2: ()
            // InternalGuilang.g:1719:3: 
            {
            }

             after(grammarAccess.getHorizontalAccess().getHorizontalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__0__Impl"


    // $ANTLR start "rule__Horizontal__Group__1"
    // InternalGuilang.g:1727:1: rule__Horizontal__Group__1 : rule__Horizontal__Group__1__Impl rule__Horizontal__Group__2 ;
    public final void rule__Horizontal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1731:1: ( rule__Horizontal__Group__1__Impl rule__Horizontal__Group__2 )
            // InternalGuilang.g:1732:2: rule__Horizontal__Group__1__Impl rule__Horizontal__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Horizontal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Horizontal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__1"


    // $ANTLR start "rule__Horizontal__Group__1__Impl"
    // InternalGuilang.g:1739:1: rule__Horizontal__Group__1__Impl : ( ( rule__Horizontal__Alternatives_1 ) ) ;
    public final void rule__Horizontal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1743:1: ( ( ( rule__Horizontal__Alternatives_1 ) ) )
            // InternalGuilang.g:1744:1: ( ( rule__Horizontal__Alternatives_1 ) )
            {
            // InternalGuilang.g:1744:1: ( ( rule__Horizontal__Alternatives_1 ) )
            // InternalGuilang.g:1745:2: ( rule__Horizontal__Alternatives_1 )
            {
             before(grammarAccess.getHorizontalAccess().getAlternatives_1()); 
            // InternalGuilang.g:1746:2: ( rule__Horizontal__Alternatives_1 )
            // InternalGuilang.g:1746:3: rule__Horizontal__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Horizontal__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getHorizontalAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__1__Impl"


    // $ANTLR start "rule__Horizontal__Group__2"
    // InternalGuilang.g:1754:1: rule__Horizontal__Group__2 : rule__Horizontal__Group__2__Impl rule__Horizontal__Group__3 ;
    public final void rule__Horizontal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1758:1: ( rule__Horizontal__Group__2__Impl rule__Horizontal__Group__3 )
            // InternalGuilang.g:1759:2: rule__Horizontal__Group__2__Impl rule__Horizontal__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Horizontal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Horizontal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__2"


    // $ANTLR start "rule__Horizontal__Group__2__Impl"
    // InternalGuilang.g:1766:1: rule__Horizontal__Group__2__Impl : ( ( rule__Horizontal__NameAssignment_2 )? ) ;
    public final void rule__Horizontal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1770:1: ( ( ( rule__Horizontal__NameAssignment_2 )? ) )
            // InternalGuilang.g:1771:1: ( ( rule__Horizontal__NameAssignment_2 )? )
            {
            // InternalGuilang.g:1771:1: ( ( rule__Horizontal__NameAssignment_2 )? )
            // InternalGuilang.g:1772:2: ( rule__Horizontal__NameAssignment_2 )?
            {
             before(grammarAccess.getHorizontalAccess().getNameAssignment_2()); 
            // InternalGuilang.g:1773:2: ( rule__Horizontal__NameAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGuilang.g:1773:3: rule__Horizontal__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Horizontal__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHorizontalAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__2__Impl"


    // $ANTLR start "rule__Horizontal__Group__3"
    // InternalGuilang.g:1781:1: rule__Horizontal__Group__3 : rule__Horizontal__Group__3__Impl rule__Horizontal__Group__4 ;
    public final void rule__Horizontal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1785:1: ( rule__Horizontal__Group__3__Impl rule__Horizontal__Group__4 )
            // InternalGuilang.g:1786:2: rule__Horizontal__Group__3__Impl rule__Horizontal__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Horizontal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Horizontal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__3"


    // $ANTLR start "rule__Horizontal__Group__3__Impl"
    // InternalGuilang.g:1793:1: rule__Horizontal__Group__3__Impl : ( RULE_OPEN ) ;
    public final void rule__Horizontal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1797:1: ( ( RULE_OPEN ) )
            // InternalGuilang.g:1798:1: ( RULE_OPEN )
            {
            // InternalGuilang.g:1798:1: ( RULE_OPEN )
            // InternalGuilang.g:1799:2: RULE_OPEN
            {
             before(grammarAccess.getHorizontalAccess().getOPENTerminalRuleCall_3()); 
            match(input,RULE_OPEN,FOLLOW_2); 
             after(grammarAccess.getHorizontalAccess().getOPENTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__3__Impl"


    // $ANTLR start "rule__Horizontal__Group__4"
    // InternalGuilang.g:1808:1: rule__Horizontal__Group__4 : rule__Horizontal__Group__4__Impl rule__Horizontal__Group__5 ;
    public final void rule__Horizontal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1812:1: ( rule__Horizontal__Group__4__Impl rule__Horizontal__Group__5 )
            // InternalGuilang.g:1813:2: rule__Horizontal__Group__4__Impl rule__Horizontal__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Horizontal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Horizontal__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__4"


    // $ANTLR start "rule__Horizontal__Group__4__Impl"
    // InternalGuilang.g:1820:1: rule__Horizontal__Group__4__Impl : ( ( rule__Horizontal__EntitiesAssignment_4 )* ) ;
    public final void rule__Horizontal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1824:1: ( ( ( rule__Horizontal__EntitiesAssignment_4 )* ) )
            // InternalGuilang.g:1825:1: ( ( rule__Horizontal__EntitiesAssignment_4 )* )
            {
            // InternalGuilang.g:1825:1: ( ( rule__Horizontal__EntitiesAssignment_4 )* )
            // InternalGuilang.g:1826:2: ( rule__Horizontal__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getHorizontalAccess().getEntitiesAssignment_4()); 
            // InternalGuilang.g:1827:2: ( rule__Horizontal__EntitiesAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_LABEL_TYPE && LA19_0<=RULE_CHECKBOX_TYPE)||(LA19_0>=17 && LA19_0<=20)||LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGuilang.g:1827:3: rule__Horizontal__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Horizontal__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getHorizontalAccess().getEntitiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__4__Impl"


    // $ANTLR start "rule__Horizontal__Group__5"
    // InternalGuilang.g:1835:1: rule__Horizontal__Group__5 : rule__Horizontal__Group__5__Impl ;
    public final void rule__Horizontal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1839:1: ( rule__Horizontal__Group__5__Impl )
            // InternalGuilang.g:1840:2: rule__Horizontal__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Horizontal__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__5"


    // $ANTLR start "rule__Horizontal__Group__5__Impl"
    // InternalGuilang.g:1846:1: rule__Horizontal__Group__5__Impl : ( RULE_CLOSE ) ;
    public final void rule__Horizontal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1850:1: ( ( RULE_CLOSE ) )
            // InternalGuilang.g:1851:1: ( RULE_CLOSE )
            {
            // InternalGuilang.g:1851:1: ( RULE_CLOSE )
            // InternalGuilang.g:1852:2: RULE_CLOSE
            {
             before(grammarAccess.getHorizontalAccess().getCLOSETerminalRuleCall_5()); 
            match(input,RULE_CLOSE,FOLLOW_2); 
             after(grammarAccess.getHorizontalAccess().getCLOSETerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__Group__5__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalGuilang.g:1862:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1866:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalGuilang.g:1867:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalGuilang.g:1874:1: rule__Label__Group__0__Impl : ( () ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1878:1: ( ( () ) )
            // InternalGuilang.g:1879:1: ( () )
            {
            // InternalGuilang.g:1879:1: ( () )
            // InternalGuilang.g:1880:2: ()
            {
             before(grammarAccess.getLabelAccess().getLabelAction_0()); 
            // InternalGuilang.g:1881:2: ()
            // InternalGuilang.g:1881:3: 
            {
            }

             after(grammarAccess.getLabelAccess().getLabelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalGuilang.g:1889:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1893:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalGuilang.g:1894:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalGuilang.g:1901:1: rule__Label__Group__1__Impl : ( RULE_LABEL_TYPE ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1905:1: ( ( RULE_LABEL_TYPE ) )
            // InternalGuilang.g:1906:1: ( RULE_LABEL_TYPE )
            {
            // InternalGuilang.g:1906:1: ( RULE_LABEL_TYPE )
            // InternalGuilang.g:1907:2: RULE_LABEL_TYPE
            {
             before(grammarAccess.getLabelAccess().getLABEL_TYPETerminalRuleCall_1()); 
            match(input,RULE_LABEL_TYPE,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLABEL_TYPETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__2"
    // InternalGuilang.g:1916:1: rule__Label__Group__2 : rule__Label__Group__2__Impl ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1920:1: ( rule__Label__Group__2__Impl )
            // InternalGuilang.g:1921:2: rule__Label__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2"


    // $ANTLR start "rule__Label__Group__2__Impl"
    // InternalGuilang.g:1927:1: rule__Label__Group__2__Impl : ( ( rule__Label__NameAssignment_2 )? ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1931:1: ( ( ( rule__Label__NameAssignment_2 )? ) )
            // InternalGuilang.g:1932:1: ( ( rule__Label__NameAssignment_2 )? )
            {
            // InternalGuilang.g:1932:1: ( ( rule__Label__NameAssignment_2 )? )
            // InternalGuilang.g:1933:2: ( rule__Label__NameAssignment_2 )?
            {
             before(grammarAccess.getLabelAccess().getNameAssignment_2()); 
            // InternalGuilang.g:1934:2: ( rule__Label__NameAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGuilang.g:1934:3: rule__Label__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Label__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalGuilang.g:1943:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1947:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalGuilang.g:1948:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalGuilang.g:1955:1: rule__Button__Group__0__Impl : ( () ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1959:1: ( ( () ) )
            // InternalGuilang.g:1960:1: ( () )
            {
            // InternalGuilang.g:1960:1: ( () )
            // InternalGuilang.g:1961:2: ()
            {
             before(grammarAccess.getButtonAccess().getButtonAction_0()); 
            // InternalGuilang.g:1962:2: ()
            // InternalGuilang.g:1962:3: 
            {
            }

             after(grammarAccess.getButtonAccess().getButtonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalGuilang.g:1970:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1974:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalGuilang.g:1975:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalGuilang.g:1982:1: rule__Button__Group__1__Impl : ( RULE_BUTTON_TYPE ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:1986:1: ( ( RULE_BUTTON_TYPE ) )
            // InternalGuilang.g:1987:1: ( RULE_BUTTON_TYPE )
            {
            // InternalGuilang.g:1987:1: ( RULE_BUTTON_TYPE )
            // InternalGuilang.g:1988:2: RULE_BUTTON_TYPE
            {
             before(grammarAccess.getButtonAccess().getBUTTON_TYPETerminalRuleCall_1()); 
            match(input,RULE_BUTTON_TYPE,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getBUTTON_TYPETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // InternalGuilang.g:1997:1: rule__Button__Group__2 : rule__Button__Group__2__Impl ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2001:1: ( rule__Button__Group__2__Impl )
            // InternalGuilang.g:2002:2: rule__Button__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // InternalGuilang.g:2008:1: rule__Button__Group__2__Impl : ( ( rule__Button__NameAssignment_2 )? ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2012:1: ( ( ( rule__Button__NameAssignment_2 )? ) )
            // InternalGuilang.g:2013:1: ( ( rule__Button__NameAssignment_2 )? )
            {
            // InternalGuilang.g:2013:1: ( ( rule__Button__NameAssignment_2 )? )
            // InternalGuilang.g:2014:2: ( rule__Button__NameAssignment_2 )?
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_2()); 
            // InternalGuilang.g:2015:2: ( rule__Button__NameAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGuilang.g:2015:3: rule__Button__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Button__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalGuilang.g:2024:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2028:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalGuilang.g:2029:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalGuilang.g:2036:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2040:1: ( ( () ) )
            // InternalGuilang.g:2041:1: ( () )
            {
            // InternalGuilang.g:2041:1: ( () )
            // InternalGuilang.g:2042:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalGuilang.g:2043:2: ()
            // InternalGuilang.g:2043:3: 
            {
            }

             after(grammarAccess.getInputAccess().getInputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalGuilang.g:2051:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2055:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalGuilang.g:2056:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalGuilang.g:2063:1: rule__Input__Group__1__Impl : ( RULE_INPUT_TYPE ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2067:1: ( ( RULE_INPUT_TYPE ) )
            // InternalGuilang.g:2068:1: ( RULE_INPUT_TYPE )
            {
            // InternalGuilang.g:2068:1: ( RULE_INPUT_TYPE )
            // InternalGuilang.g:2069:2: RULE_INPUT_TYPE
            {
             before(grammarAccess.getInputAccess().getINPUT_TYPETerminalRuleCall_1()); 
            match(input,RULE_INPUT_TYPE,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getINPUT_TYPETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalGuilang.g:2078:1: rule__Input__Group__2 : rule__Input__Group__2__Impl ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2082:1: ( rule__Input__Group__2__Impl )
            // InternalGuilang.g:2083:2: rule__Input__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalGuilang.g:2089:1: rule__Input__Group__2__Impl : ( ( rule__Input__NameAssignment_2 )? ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2093:1: ( ( ( rule__Input__NameAssignment_2 )? ) )
            // InternalGuilang.g:2094:1: ( ( rule__Input__NameAssignment_2 )? )
            {
            // InternalGuilang.g:2094:1: ( ( rule__Input__NameAssignment_2 )? )
            // InternalGuilang.g:2095:2: ( rule__Input__NameAssignment_2 )?
            {
             before(grammarAccess.getInputAccess().getNameAssignment_2()); 
            // InternalGuilang.g:2096:2: ( rule__Input__NameAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGuilang.g:2096:3: rule__Input__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Checkbox__Group__0"
    // InternalGuilang.g:2105:1: rule__Checkbox__Group__0 : rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 ;
    public final void rule__Checkbox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2109:1: ( rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 )
            // InternalGuilang.g:2110:2: rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Checkbox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__0"


    // $ANTLR start "rule__Checkbox__Group__0__Impl"
    // InternalGuilang.g:2117:1: rule__Checkbox__Group__0__Impl : ( () ) ;
    public final void rule__Checkbox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2121:1: ( ( () ) )
            // InternalGuilang.g:2122:1: ( () )
            {
            // InternalGuilang.g:2122:1: ( () )
            // InternalGuilang.g:2123:2: ()
            {
             before(grammarAccess.getCheckboxAccess().getCheckboxAction_0()); 
            // InternalGuilang.g:2124:2: ()
            // InternalGuilang.g:2124:3: 
            {
            }

             after(grammarAccess.getCheckboxAccess().getCheckboxAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__0__Impl"


    // $ANTLR start "rule__Checkbox__Group__1"
    // InternalGuilang.g:2132:1: rule__Checkbox__Group__1 : rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 ;
    public final void rule__Checkbox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2136:1: ( rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 )
            // InternalGuilang.g:2137:2: rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Checkbox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__1"


    // $ANTLR start "rule__Checkbox__Group__1__Impl"
    // InternalGuilang.g:2144:1: rule__Checkbox__Group__1__Impl : ( RULE_CHECKBOX_TYPE ) ;
    public final void rule__Checkbox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2148:1: ( ( RULE_CHECKBOX_TYPE ) )
            // InternalGuilang.g:2149:1: ( RULE_CHECKBOX_TYPE )
            {
            // InternalGuilang.g:2149:1: ( RULE_CHECKBOX_TYPE )
            // InternalGuilang.g:2150:2: RULE_CHECKBOX_TYPE
            {
             before(grammarAccess.getCheckboxAccess().getCHECKBOX_TYPETerminalRuleCall_1()); 
            match(input,RULE_CHECKBOX_TYPE,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getCHECKBOX_TYPETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__1__Impl"


    // $ANTLR start "rule__Checkbox__Group__2"
    // InternalGuilang.g:2159:1: rule__Checkbox__Group__2 : rule__Checkbox__Group__2__Impl ;
    public final void rule__Checkbox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2163:1: ( rule__Checkbox__Group__2__Impl )
            // InternalGuilang.g:2164:2: rule__Checkbox__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__2"


    // $ANTLR start "rule__Checkbox__Group__2__Impl"
    // InternalGuilang.g:2170:1: rule__Checkbox__Group__2__Impl : ( ( rule__Checkbox__NameAssignment_2 )? ) ;
    public final void rule__Checkbox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2174:1: ( ( ( rule__Checkbox__NameAssignment_2 )? ) )
            // InternalGuilang.g:2175:1: ( ( rule__Checkbox__NameAssignment_2 )? )
            {
            // InternalGuilang.g:2175:1: ( ( rule__Checkbox__NameAssignment_2 )? )
            // InternalGuilang.g:2176:2: ( rule__Checkbox__NameAssignment_2 )?
            {
             before(grammarAccess.getCheckboxAccess().getNameAssignment_2()); 
            // InternalGuilang.g:2177:2: ( rule__Checkbox__NameAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGuilang.g:2177:3: rule__Checkbox__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Checkbox__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckboxAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__2__Impl"


    // $ANTLR start "rule__Specifications__Group__0"
    // InternalGuilang.g:2186:1: rule__Specifications__Group__0 : rule__Specifications__Group__0__Impl rule__Specifications__Group__1 ;
    public final void rule__Specifications__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2190:1: ( rule__Specifications__Group__0__Impl rule__Specifications__Group__1 )
            // InternalGuilang.g:2191:2: rule__Specifications__Group__0__Impl rule__Specifications__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Specifications__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specifications__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specifications__Group__0"


    // $ANTLR start "rule__Specifications__Group__0__Impl"
    // InternalGuilang.g:2198:1: rule__Specifications__Group__0__Impl : ( () ) ;
    public final void rule__Specifications__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2202:1: ( ( () ) )
            // InternalGuilang.g:2203:1: ( () )
            {
            // InternalGuilang.g:2203:1: ( () )
            // InternalGuilang.g:2204:2: ()
            {
             before(grammarAccess.getSpecificationsAccess().getSpecificationsAction_0()); 
            // InternalGuilang.g:2205:2: ()
            // InternalGuilang.g:2205:3: 
            {
            }

             after(grammarAccess.getSpecificationsAccess().getSpecificationsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specifications__Group__0__Impl"


    // $ANTLR start "rule__Specifications__Group__1"
    // InternalGuilang.g:2213:1: rule__Specifications__Group__1 : rule__Specifications__Group__1__Impl rule__Specifications__Group__2 ;
    public final void rule__Specifications__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2217:1: ( rule__Specifications__Group__1__Impl rule__Specifications__Group__2 )
            // InternalGuilang.g:2218:2: rule__Specifications__Group__1__Impl rule__Specifications__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Specifications__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specifications__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specifications__Group__1"


    // $ANTLR start "rule__Specifications__Group__1__Impl"
    // InternalGuilang.g:2225:1: rule__Specifications__Group__1__Impl : ( 'elements' ) ;
    public final void rule__Specifications__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2229:1: ( ( 'elements' ) )
            // InternalGuilang.g:2230:1: ( 'elements' )
            {
            // InternalGuilang.g:2230:1: ( 'elements' )
            // InternalGuilang.g:2231:2: 'elements'
            {
             before(grammarAccess.getSpecificationsAccess().getElementsKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSpecificationsAccess().getElementsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specifications__Group__1__Impl"


    // $ANTLR start "rule__Specifications__Group__2"
    // InternalGuilang.g:2240:1: rule__Specifications__Group__2 : rule__Specifications__Group__2__Impl rule__Specifications__Group__3 ;
    public final void rule__Specifications__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2244:1: ( rule__Specifications__Group__2__Impl rule__Specifications__Group__3 )
            // InternalGuilang.g:2245:2: rule__Specifications__Group__2__Impl rule__Specifications__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Specifications__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specifications__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specifications__Group__2"


    // $ANTLR start "rule__Specifications__Group__2__Impl"
    // InternalGuilang.g:2252:1: rule__Specifications__Group__2__Impl : ( RULE_OPEN ) ;
    public final void rule__Specifications__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2256:1: ( ( RULE_OPEN ) )
            // InternalGuilang.g:2257:1: ( RULE_OPEN )
            {
            // InternalGuilang.g:2257:1: ( RULE_OPEN )
            // InternalGuilang.g:2258:2: RULE_OPEN
            {
             before(grammarAccess.getSpecificationsAccess().getOPENTerminalRuleCall_2()); 
            match(input,RULE_OPEN,FOLLOW_2); 
             after(grammarAccess.getSpecificationsAccess().getOPENTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specifications__Group__2__Impl"


    // $ANTLR start "rule__Specifications__Group__3"
    // InternalGuilang.g:2267:1: rule__Specifications__Group__3 : rule__Specifications__Group__3__Impl rule__Specifications__Group__4 ;
    public final void rule__Specifications__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2271:1: ( rule__Specifications__Group__3__Impl rule__Specifications__Group__4 )
            // InternalGuilang.g:2272:2: rule__Specifications__Group__3__Impl rule__Specifications__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Specifications__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specifications__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specifications__Group__3"


    // $ANTLR start "rule__Specifications__Group__3__Impl"
    // InternalGuilang.g:2279:1: rule__Specifications__Group__3__Impl : ( ( rule__Specifications__SpecificationsAssignment_3 )* ) ;
    public final void rule__Specifications__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2283:1: ( ( ( rule__Specifications__SpecificationsAssignment_3 )* ) )
            // InternalGuilang.g:2284:1: ( ( rule__Specifications__SpecificationsAssignment_3 )* )
            {
            // InternalGuilang.g:2284:1: ( ( rule__Specifications__SpecificationsAssignment_3 )* )
            // InternalGuilang.g:2285:2: ( rule__Specifications__SpecificationsAssignment_3 )*
            {
             before(grammarAccess.getSpecificationsAccess().getSpecificationsAssignment_3()); 
            // InternalGuilang.g:2286:2: ( rule__Specifications__SpecificationsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGuilang.g:2286:3: rule__Specifications__SpecificationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Specifications__SpecificationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSpecificationsAccess().getSpecificationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specifications__Group__3__Impl"


    // $ANTLR start "rule__Specifications__Group__4"
    // InternalGuilang.g:2294:1: rule__Specifications__Group__4 : rule__Specifications__Group__4__Impl ;
    public final void rule__Specifications__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2298:1: ( rule__Specifications__Group__4__Impl )
            // InternalGuilang.g:2299:2: rule__Specifications__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Specifications__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specifications__Group__4"


    // $ANTLR start "rule__Specifications__Group__4__Impl"
    // InternalGuilang.g:2305:1: rule__Specifications__Group__4__Impl : ( RULE_CLOSE ) ;
    public final void rule__Specifications__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2309:1: ( ( RULE_CLOSE ) )
            // InternalGuilang.g:2310:1: ( RULE_CLOSE )
            {
            // InternalGuilang.g:2310:1: ( RULE_CLOSE )
            // InternalGuilang.g:2311:2: RULE_CLOSE
            {
             before(grammarAccess.getSpecificationsAccess().getCLOSETerminalRuleCall_4()); 
            match(input,RULE_CLOSE,FOLLOW_2); 
             after(grammarAccess.getSpecificationsAccess().getCLOSETerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specifications__Group__4__Impl"


    // $ANTLR start "rule__LayoutSpec__Group__0"
    // InternalGuilang.g:2321:1: rule__LayoutSpec__Group__0 : rule__LayoutSpec__Group__0__Impl rule__LayoutSpec__Group__1 ;
    public final void rule__LayoutSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2325:1: ( rule__LayoutSpec__Group__0__Impl rule__LayoutSpec__Group__1 )
            // InternalGuilang.g:2326:2: rule__LayoutSpec__Group__0__Impl rule__LayoutSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LayoutSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutSpec__Group__0"


    // $ANTLR start "rule__LayoutSpec__Group__0__Impl"
    // InternalGuilang.g:2333:1: rule__LayoutSpec__Group__0__Impl : ( ( rule__LayoutSpec__RefAssignment_0 ) ) ;
    public final void rule__LayoutSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2337:1: ( ( ( rule__LayoutSpec__RefAssignment_0 ) ) )
            // InternalGuilang.g:2338:1: ( ( rule__LayoutSpec__RefAssignment_0 ) )
            {
            // InternalGuilang.g:2338:1: ( ( rule__LayoutSpec__RefAssignment_0 ) )
            // InternalGuilang.g:2339:2: ( rule__LayoutSpec__RefAssignment_0 )
            {
             before(grammarAccess.getLayoutSpecAccess().getRefAssignment_0()); 
            // InternalGuilang.g:2340:2: ( rule__LayoutSpec__RefAssignment_0 )
            // InternalGuilang.g:2340:3: rule__LayoutSpec__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LayoutSpec__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutSpecAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutSpec__Group__0__Impl"


    // $ANTLR start "rule__LayoutSpec__Group__1"
    // InternalGuilang.g:2348:1: rule__LayoutSpec__Group__1 : rule__LayoutSpec__Group__1__Impl rule__LayoutSpec__Group__2 ;
    public final void rule__LayoutSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2352:1: ( rule__LayoutSpec__Group__1__Impl rule__LayoutSpec__Group__2 )
            // InternalGuilang.g:2353:2: rule__LayoutSpec__Group__1__Impl rule__LayoutSpec__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__LayoutSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutSpec__Group__1"


    // $ANTLR start "rule__LayoutSpec__Group__1__Impl"
    // InternalGuilang.g:2360:1: rule__LayoutSpec__Group__1__Impl : ( RULE_OPEN ) ;
    public final void rule__LayoutSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2364:1: ( ( RULE_OPEN ) )
            // InternalGuilang.g:2365:1: ( RULE_OPEN )
            {
            // InternalGuilang.g:2365:1: ( RULE_OPEN )
            // InternalGuilang.g:2366:2: RULE_OPEN
            {
             before(grammarAccess.getLayoutSpecAccess().getOPENTerminalRuleCall_1()); 
            match(input,RULE_OPEN,FOLLOW_2); 
             after(grammarAccess.getLayoutSpecAccess().getOPENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutSpec__Group__1__Impl"


    // $ANTLR start "rule__LayoutSpec__Group__2"
    // InternalGuilang.g:2375:1: rule__LayoutSpec__Group__2 : rule__LayoutSpec__Group__2__Impl rule__LayoutSpec__Group__3 ;
    public final void rule__LayoutSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2379:1: ( rule__LayoutSpec__Group__2__Impl rule__LayoutSpec__Group__3 )
            // InternalGuilang.g:2380:2: rule__LayoutSpec__Group__2__Impl rule__LayoutSpec__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__LayoutSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayoutSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutSpec__Group__2"


    // $ANTLR start "rule__LayoutSpec__Group__2__Impl"
    // InternalGuilang.g:2387:1: rule__LayoutSpec__Group__2__Impl : ( 'layout-spec' ) ;
    public final void rule__LayoutSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2391:1: ( ( 'layout-spec' ) )
            // InternalGuilang.g:2392:1: ( 'layout-spec' )
            {
            // InternalGuilang.g:2392:1: ( 'layout-spec' )
            // InternalGuilang.g:2393:2: 'layout-spec'
            {
             before(grammarAccess.getLayoutSpecAccess().getLayoutSpecKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLayoutSpecAccess().getLayoutSpecKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutSpec__Group__2__Impl"


    // $ANTLR start "rule__LayoutSpec__Group__3"
    // InternalGuilang.g:2402:1: rule__LayoutSpec__Group__3 : rule__LayoutSpec__Group__3__Impl ;
    public final void rule__LayoutSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2406:1: ( rule__LayoutSpec__Group__3__Impl )
            // InternalGuilang.g:2407:2: rule__LayoutSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayoutSpec__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutSpec__Group__3"


    // $ANTLR start "rule__LayoutSpec__Group__3__Impl"
    // InternalGuilang.g:2413:1: rule__LayoutSpec__Group__3__Impl : ( RULE_CLOSE ) ;
    public final void rule__LayoutSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2417:1: ( ( RULE_CLOSE ) )
            // InternalGuilang.g:2418:1: ( RULE_CLOSE )
            {
            // InternalGuilang.g:2418:1: ( RULE_CLOSE )
            // InternalGuilang.g:2419:2: RULE_CLOSE
            {
             before(grammarAccess.getLayoutSpecAccess().getCLOSETerminalRuleCall_3()); 
            match(input,RULE_CLOSE,FOLLOW_2); 
             after(grammarAccess.getLayoutSpecAccess().getCLOSETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutSpec__Group__3__Impl"


    // $ANTLR start "rule__VerticalSpec__Group__0"
    // InternalGuilang.g:2429:1: rule__VerticalSpec__Group__0 : rule__VerticalSpec__Group__0__Impl rule__VerticalSpec__Group__1 ;
    public final void rule__VerticalSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2433:1: ( rule__VerticalSpec__Group__0__Impl rule__VerticalSpec__Group__1 )
            // InternalGuilang.g:2434:2: rule__VerticalSpec__Group__0__Impl rule__VerticalSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VerticalSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerticalSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerticalSpec__Group__0"


    // $ANTLR start "rule__VerticalSpec__Group__0__Impl"
    // InternalGuilang.g:2441:1: rule__VerticalSpec__Group__0__Impl : ( ( rule__VerticalSpec__RefAssignment_0 ) ) ;
    public final void rule__VerticalSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2445:1: ( ( ( rule__VerticalSpec__RefAssignment_0 ) ) )
            // InternalGuilang.g:2446:1: ( ( rule__VerticalSpec__RefAssignment_0 ) )
            {
            // InternalGuilang.g:2446:1: ( ( rule__VerticalSpec__RefAssignment_0 ) )
            // InternalGuilang.g:2447:2: ( rule__VerticalSpec__RefAssignment_0 )
            {
             before(grammarAccess.getVerticalSpecAccess().getRefAssignment_0()); 
            // InternalGuilang.g:2448:2: ( rule__VerticalSpec__RefAssignment_0 )
            // InternalGuilang.g:2448:3: rule__VerticalSpec__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VerticalSpec__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVerticalSpecAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerticalSpec__Group__0__Impl"


    // $ANTLR start "rule__VerticalSpec__Group__1"
    // InternalGuilang.g:2456:1: rule__VerticalSpec__Group__1 : rule__VerticalSpec__Group__1__Impl rule__VerticalSpec__Group__2 ;
    public final void rule__VerticalSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2460:1: ( rule__VerticalSpec__Group__1__Impl rule__VerticalSpec__Group__2 )
            // InternalGuilang.g:2461:2: rule__VerticalSpec__Group__1__Impl rule__VerticalSpec__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__VerticalSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerticalSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerticalSpec__Group__1"


    // $ANTLR start "rule__VerticalSpec__Group__1__Impl"
    // InternalGuilang.g:2468:1: rule__VerticalSpec__Group__1__Impl : ( RULE_OPEN ) ;
    public final void rule__VerticalSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2472:1: ( ( RULE_OPEN ) )
            // InternalGuilang.g:2473:1: ( RULE_OPEN )
            {
            // InternalGuilang.g:2473:1: ( RULE_OPEN )
            // InternalGuilang.g:2474:2: RULE_OPEN
            {
             before(grammarAccess.getVerticalSpecAccess().getOPENTerminalRuleCall_1()); 
            match(input,RULE_OPEN,FOLLOW_2); 
             after(grammarAccess.getVerticalSpecAccess().getOPENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerticalSpec__Group__1__Impl"


    // $ANTLR start "rule__VerticalSpec__Group__2"
    // InternalGuilang.g:2483:1: rule__VerticalSpec__Group__2 : rule__VerticalSpec__Group__2__Impl rule__VerticalSpec__Group__3 ;
    public final void rule__VerticalSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2487:1: ( rule__VerticalSpec__Group__2__Impl rule__VerticalSpec__Group__3 )
            // InternalGuilang.g:2488:2: rule__VerticalSpec__Group__2__Impl rule__VerticalSpec__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__VerticalSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerticalSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerticalSpec__Group__2"


    // $ANTLR start "rule__VerticalSpec__Group__2__Impl"
    // InternalGuilang.g:2495:1: rule__VerticalSpec__Group__2__Impl : ( 'vertical-spec' ) ;
    public final void rule__VerticalSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2499:1: ( ( 'vertical-spec' ) )
            // InternalGuilang.g:2500:1: ( 'vertical-spec' )
            {
            // InternalGuilang.g:2500:1: ( 'vertical-spec' )
            // InternalGuilang.g:2501:2: 'vertical-spec'
            {
             before(grammarAccess.getVerticalSpecAccess().getVerticalSpecKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVerticalSpecAccess().getVerticalSpecKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerticalSpec__Group__2__Impl"


    // $ANTLR start "rule__VerticalSpec__Group__3"
    // InternalGuilang.g:2510:1: rule__VerticalSpec__Group__3 : rule__VerticalSpec__Group__3__Impl ;
    public final void rule__VerticalSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2514:1: ( rule__VerticalSpec__Group__3__Impl )
            // InternalGuilang.g:2515:2: rule__VerticalSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VerticalSpec__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerticalSpec__Group__3"


    // $ANTLR start "rule__VerticalSpec__Group__3__Impl"
    // InternalGuilang.g:2521:1: rule__VerticalSpec__Group__3__Impl : ( RULE_CLOSE ) ;
    public final void rule__VerticalSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2525:1: ( ( RULE_CLOSE ) )
            // InternalGuilang.g:2526:1: ( RULE_CLOSE )
            {
            // InternalGuilang.g:2526:1: ( RULE_CLOSE )
            // InternalGuilang.g:2527:2: RULE_CLOSE
            {
             before(grammarAccess.getVerticalSpecAccess().getCLOSETerminalRuleCall_3()); 
            match(input,RULE_CLOSE,FOLLOW_2); 
             after(grammarAccess.getVerticalSpecAccess().getCLOSETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerticalSpec__Group__3__Impl"


    // $ANTLR start "rule__HorizontalSpec__Group__0"
    // InternalGuilang.g:2537:1: rule__HorizontalSpec__Group__0 : rule__HorizontalSpec__Group__0__Impl rule__HorizontalSpec__Group__1 ;
    public final void rule__HorizontalSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2541:1: ( rule__HorizontalSpec__Group__0__Impl rule__HorizontalSpec__Group__1 )
            // InternalGuilang.g:2542:2: rule__HorizontalSpec__Group__0__Impl rule__HorizontalSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__HorizontalSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HorizontalSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalSpec__Group__0"


    // $ANTLR start "rule__HorizontalSpec__Group__0__Impl"
    // InternalGuilang.g:2549:1: rule__HorizontalSpec__Group__0__Impl : ( ( rule__HorizontalSpec__RefAssignment_0 ) ) ;
    public final void rule__HorizontalSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2553:1: ( ( ( rule__HorizontalSpec__RefAssignment_0 ) ) )
            // InternalGuilang.g:2554:1: ( ( rule__HorizontalSpec__RefAssignment_0 ) )
            {
            // InternalGuilang.g:2554:1: ( ( rule__HorizontalSpec__RefAssignment_0 ) )
            // InternalGuilang.g:2555:2: ( rule__HorizontalSpec__RefAssignment_0 )
            {
             before(grammarAccess.getHorizontalSpecAccess().getRefAssignment_0()); 
            // InternalGuilang.g:2556:2: ( rule__HorizontalSpec__RefAssignment_0 )
            // InternalGuilang.g:2556:3: rule__HorizontalSpec__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalSpec__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHorizontalSpecAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalSpec__Group__0__Impl"


    // $ANTLR start "rule__HorizontalSpec__Group__1"
    // InternalGuilang.g:2564:1: rule__HorizontalSpec__Group__1 : rule__HorizontalSpec__Group__1__Impl rule__HorizontalSpec__Group__2 ;
    public final void rule__HorizontalSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2568:1: ( rule__HorizontalSpec__Group__1__Impl rule__HorizontalSpec__Group__2 )
            // InternalGuilang.g:2569:2: rule__HorizontalSpec__Group__1__Impl rule__HorizontalSpec__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__HorizontalSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HorizontalSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalSpec__Group__1"


    // $ANTLR start "rule__HorizontalSpec__Group__1__Impl"
    // InternalGuilang.g:2576:1: rule__HorizontalSpec__Group__1__Impl : ( RULE_OPEN ) ;
    public final void rule__HorizontalSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2580:1: ( ( RULE_OPEN ) )
            // InternalGuilang.g:2581:1: ( RULE_OPEN )
            {
            // InternalGuilang.g:2581:1: ( RULE_OPEN )
            // InternalGuilang.g:2582:2: RULE_OPEN
            {
             before(grammarAccess.getHorizontalSpecAccess().getOPENTerminalRuleCall_1()); 
            match(input,RULE_OPEN,FOLLOW_2); 
             after(grammarAccess.getHorizontalSpecAccess().getOPENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalSpec__Group__1__Impl"


    // $ANTLR start "rule__HorizontalSpec__Group__2"
    // InternalGuilang.g:2591:1: rule__HorizontalSpec__Group__2 : rule__HorizontalSpec__Group__2__Impl rule__HorizontalSpec__Group__3 ;
    public final void rule__HorizontalSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2595:1: ( rule__HorizontalSpec__Group__2__Impl rule__HorizontalSpec__Group__3 )
            // InternalGuilang.g:2596:2: rule__HorizontalSpec__Group__2__Impl rule__HorizontalSpec__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__HorizontalSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HorizontalSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalSpec__Group__2"


    // $ANTLR start "rule__HorizontalSpec__Group__2__Impl"
    // InternalGuilang.g:2603:1: rule__HorizontalSpec__Group__2__Impl : ( 'horizontal-spec' ) ;
    public final void rule__HorizontalSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2607:1: ( ( 'horizontal-spec' ) )
            // InternalGuilang.g:2608:1: ( 'horizontal-spec' )
            {
            // InternalGuilang.g:2608:1: ( 'horizontal-spec' )
            // InternalGuilang.g:2609:2: 'horizontal-spec'
            {
             before(grammarAccess.getHorizontalSpecAccess().getHorizontalSpecKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHorizontalSpecAccess().getHorizontalSpecKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalSpec__Group__2__Impl"


    // $ANTLR start "rule__HorizontalSpec__Group__3"
    // InternalGuilang.g:2618:1: rule__HorizontalSpec__Group__3 : rule__HorizontalSpec__Group__3__Impl ;
    public final void rule__HorizontalSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2622:1: ( rule__HorizontalSpec__Group__3__Impl )
            // InternalGuilang.g:2623:2: rule__HorizontalSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalSpec__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalSpec__Group__3"


    // $ANTLR start "rule__HorizontalSpec__Group__3__Impl"
    // InternalGuilang.g:2629:1: rule__HorizontalSpec__Group__3__Impl : ( RULE_CLOSE ) ;
    public final void rule__HorizontalSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2633:1: ( ( RULE_CLOSE ) )
            // InternalGuilang.g:2634:1: ( RULE_CLOSE )
            {
            // InternalGuilang.g:2634:1: ( RULE_CLOSE )
            // InternalGuilang.g:2635:2: RULE_CLOSE
            {
             before(grammarAccess.getHorizontalSpecAccess().getCLOSETerminalRuleCall_3()); 
            match(input,RULE_CLOSE,FOLLOW_2); 
             after(grammarAccess.getHorizontalSpecAccess().getCLOSETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalSpec__Group__3__Impl"


    // $ANTLR start "rule__LabelSpec__Group__0"
    // InternalGuilang.g:2645:1: rule__LabelSpec__Group__0 : rule__LabelSpec__Group__0__Impl rule__LabelSpec__Group__1 ;
    public final void rule__LabelSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2649:1: ( rule__LabelSpec__Group__0__Impl rule__LabelSpec__Group__1 )
            // InternalGuilang.g:2650:2: rule__LabelSpec__Group__0__Impl rule__LabelSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LabelSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LabelSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelSpec__Group__0"


    // $ANTLR start "rule__LabelSpec__Group__0__Impl"
    // InternalGuilang.g:2657:1: rule__LabelSpec__Group__0__Impl : ( ( rule__LabelSpec__RefAssignment_0 ) ) ;
    public final void rule__LabelSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2661:1: ( ( ( rule__LabelSpec__RefAssignment_0 ) ) )
            // InternalGuilang.g:2662:1: ( ( rule__LabelSpec__RefAssignment_0 ) )
            {
            // InternalGuilang.g:2662:1: ( ( rule__LabelSpec__RefAssignment_0 ) )
            // InternalGuilang.g:2663:2: ( rule__LabelSpec__RefAssignment_0 )
            {
             before(grammarAccess.getLabelSpecAccess().getRefAssignment_0()); 
            // InternalGuilang.g:2664:2: ( rule__LabelSpec__RefAssignment_0 )
            // InternalGuilang.g:2664:3: rule__LabelSpec__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LabelSpec__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLabelSpecAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelSpec__Group__0__Impl"


    // $ANTLR start "rule__LabelSpec__Group__1"
    // InternalGuilang.g:2672:1: rule__LabelSpec__Group__1 : rule__LabelSpec__Group__1__Impl rule__LabelSpec__Group__2 ;
    public final void rule__LabelSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2676:1: ( rule__LabelSpec__Group__1__Impl rule__LabelSpec__Group__2 )
            // InternalGuilang.g:2677:2: rule__LabelSpec__Group__1__Impl rule__LabelSpec__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__LabelSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LabelSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelSpec__Group__1"


    // $ANTLR start "rule__LabelSpec__Group__1__Impl"
    // InternalGuilang.g:2684:1: rule__LabelSpec__Group__1__Impl : ( RULE_OPEN ) ;
    public final void rule__LabelSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2688:1: ( ( RULE_OPEN ) )
            // InternalGuilang.g:2689:1: ( RULE_OPEN )
            {
            // InternalGuilang.g:2689:1: ( RULE_OPEN )
            // InternalGuilang.g:2690:2: RULE_OPEN
            {
             before(grammarAccess.getLabelSpecAccess().getOPENTerminalRuleCall_1()); 
            match(input,RULE_OPEN,FOLLOW_2); 
             after(grammarAccess.getLabelSpecAccess().getOPENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelSpec__Group__1__Impl"


    // $ANTLR start "rule__LabelSpec__Group__2"
    // InternalGuilang.g:2699:1: rule__LabelSpec__Group__2 : rule__LabelSpec__Group__2__Impl rule__LabelSpec__Group__3 ;
    public final void rule__LabelSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2703:1: ( rule__LabelSpec__Group__2__Impl rule__LabelSpec__Group__3 )
            // InternalGuilang.g:2704:2: rule__LabelSpec__Group__2__Impl rule__LabelSpec__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__LabelSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LabelSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelSpec__Group__2"


    // $ANTLR start "rule__LabelSpec__Group__2__Impl"
    // InternalGuilang.g:2711:1: rule__LabelSpec__Group__2__Impl : ( 'label-spec' ) ;
    public final void rule__LabelSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2715:1: ( ( 'label-spec' ) )
            // InternalGuilang.g:2716:1: ( 'label-spec' )
            {
            // InternalGuilang.g:2716:1: ( 'label-spec' )
            // InternalGuilang.g:2717:2: 'label-spec'
            {
             before(grammarAccess.getLabelSpecAccess().getLabelSpecKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLabelSpecAccess().getLabelSpecKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelSpec__Group__2__Impl"


    // $ANTLR start "rule__LabelSpec__Group__3"
    // InternalGuilang.g:2726:1: rule__LabelSpec__Group__3 : rule__LabelSpec__Group__3__Impl ;
    public final void rule__LabelSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2730:1: ( rule__LabelSpec__Group__3__Impl )
            // InternalGuilang.g:2731:2: rule__LabelSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LabelSpec__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelSpec__Group__3"


    // $ANTLR start "rule__LabelSpec__Group__3__Impl"
    // InternalGuilang.g:2737:1: rule__LabelSpec__Group__3__Impl : ( RULE_CLOSE ) ;
    public final void rule__LabelSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2741:1: ( ( RULE_CLOSE ) )
            // InternalGuilang.g:2742:1: ( RULE_CLOSE )
            {
            // InternalGuilang.g:2742:1: ( RULE_CLOSE )
            // InternalGuilang.g:2743:2: RULE_CLOSE
            {
             before(grammarAccess.getLabelSpecAccess().getCLOSETerminalRuleCall_3()); 
            match(input,RULE_CLOSE,FOLLOW_2); 
             after(grammarAccess.getLabelSpecAccess().getCLOSETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelSpec__Group__3__Impl"


    // $ANTLR start "rule__ButtonSpec__Group__0"
    // InternalGuilang.g:2753:1: rule__ButtonSpec__Group__0 : rule__ButtonSpec__Group__0__Impl rule__ButtonSpec__Group__1 ;
    public final void rule__ButtonSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2757:1: ( rule__ButtonSpec__Group__0__Impl rule__ButtonSpec__Group__1 )
            // InternalGuilang.g:2758:2: rule__ButtonSpec__Group__0__Impl rule__ButtonSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ButtonSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSpec__Group__0"


    // $ANTLR start "rule__ButtonSpec__Group__0__Impl"
    // InternalGuilang.g:2765:1: rule__ButtonSpec__Group__0__Impl : ( ( rule__ButtonSpec__RefAssignment_0 ) ) ;
    public final void rule__ButtonSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2769:1: ( ( ( rule__ButtonSpec__RefAssignment_0 ) ) )
            // InternalGuilang.g:2770:1: ( ( rule__ButtonSpec__RefAssignment_0 ) )
            {
            // InternalGuilang.g:2770:1: ( ( rule__ButtonSpec__RefAssignment_0 ) )
            // InternalGuilang.g:2771:2: ( rule__ButtonSpec__RefAssignment_0 )
            {
             before(grammarAccess.getButtonSpecAccess().getRefAssignment_0()); 
            // InternalGuilang.g:2772:2: ( rule__ButtonSpec__RefAssignment_0 )
            // InternalGuilang.g:2772:3: rule__ButtonSpec__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSpec__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getButtonSpecAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSpec__Group__0__Impl"


    // $ANTLR start "rule__ButtonSpec__Group__1"
    // InternalGuilang.g:2780:1: rule__ButtonSpec__Group__1 : rule__ButtonSpec__Group__1__Impl rule__ButtonSpec__Group__2 ;
    public final void rule__ButtonSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2784:1: ( rule__ButtonSpec__Group__1__Impl rule__ButtonSpec__Group__2 )
            // InternalGuilang.g:2785:2: rule__ButtonSpec__Group__1__Impl rule__ButtonSpec__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ButtonSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSpec__Group__1"


    // $ANTLR start "rule__ButtonSpec__Group__1__Impl"
    // InternalGuilang.g:2792:1: rule__ButtonSpec__Group__1__Impl : ( RULE_OPEN ) ;
    public final void rule__ButtonSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2796:1: ( ( RULE_OPEN ) )
            // InternalGuilang.g:2797:1: ( RULE_OPEN )
            {
            // InternalGuilang.g:2797:1: ( RULE_OPEN )
            // InternalGuilang.g:2798:2: RULE_OPEN
            {
             before(grammarAccess.getButtonSpecAccess().getOPENTerminalRuleCall_1()); 
            match(input,RULE_OPEN,FOLLOW_2); 
             after(grammarAccess.getButtonSpecAccess().getOPENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSpec__Group__1__Impl"


    // $ANTLR start "rule__ButtonSpec__Group__2"
    // InternalGuilang.g:2807:1: rule__ButtonSpec__Group__2 : rule__ButtonSpec__Group__2__Impl rule__ButtonSpec__Group__3 ;
    public final void rule__ButtonSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2811:1: ( rule__ButtonSpec__Group__2__Impl rule__ButtonSpec__Group__3 )
            // InternalGuilang.g:2812:2: rule__ButtonSpec__Group__2__Impl rule__ButtonSpec__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ButtonSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSpec__Group__2"


    // $ANTLR start "rule__ButtonSpec__Group__2__Impl"
    // InternalGuilang.g:2819:1: rule__ButtonSpec__Group__2__Impl : ( 'button-spec' ) ;
    public final void rule__ButtonSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2823:1: ( ( 'button-spec' ) )
            // InternalGuilang.g:2824:1: ( 'button-spec' )
            {
            // InternalGuilang.g:2824:1: ( 'button-spec' )
            // InternalGuilang.g:2825:2: 'button-spec'
            {
             before(grammarAccess.getButtonSpecAccess().getButtonSpecKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getButtonSpecAccess().getButtonSpecKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSpec__Group__2__Impl"


    // $ANTLR start "rule__ButtonSpec__Group__3"
    // InternalGuilang.g:2834:1: rule__ButtonSpec__Group__3 : rule__ButtonSpec__Group__3__Impl rule__ButtonSpec__Group__4 ;
    public final void rule__ButtonSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2838:1: ( rule__ButtonSpec__Group__3__Impl rule__ButtonSpec__Group__4 )
            // InternalGuilang.g:2839:2: rule__ButtonSpec__Group__3__Impl rule__ButtonSpec__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ButtonSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonSpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSpec__Group__3"


    // $ANTLR start "rule__ButtonSpec__Group__3__Impl"
    // InternalGuilang.g:2846:1: rule__ButtonSpec__Group__3__Impl : ( ( rule__ButtonSpec__OptionsAssignment_3 )* ) ;
    public final void rule__ButtonSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2850:1: ( ( ( rule__ButtonSpec__OptionsAssignment_3 )* ) )
            // InternalGuilang.g:2851:1: ( ( rule__ButtonSpec__OptionsAssignment_3 )* )
            {
            // InternalGuilang.g:2851:1: ( ( rule__ButtonSpec__OptionsAssignment_3 )* )
            // InternalGuilang.g:2852:2: ( rule__ButtonSpec__OptionsAssignment_3 )*
            {
             before(grammarAccess.getButtonSpecAccess().getOptionsAssignment_3()); 
            // InternalGuilang.g:2853:2: ( rule__ButtonSpec__OptionsAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGuilang.g:2853:3: rule__ButtonSpec__OptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ButtonSpec__OptionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getButtonSpecAccess().getOptionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSpec__Group__3__Impl"


    // $ANTLR start "rule__ButtonSpec__Group__4"
    // InternalGuilang.g:2861:1: rule__ButtonSpec__Group__4 : rule__ButtonSpec__Group__4__Impl ;
    public final void rule__ButtonSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2865:1: ( rule__ButtonSpec__Group__4__Impl )
            // InternalGuilang.g:2866:2: rule__ButtonSpec__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSpec__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSpec__Group__4"


    // $ANTLR start "rule__ButtonSpec__Group__4__Impl"
    // InternalGuilang.g:2872:1: rule__ButtonSpec__Group__4__Impl : ( RULE_CLOSE ) ;
    public final void rule__ButtonSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2876:1: ( ( RULE_CLOSE ) )
            // InternalGuilang.g:2877:1: ( RULE_CLOSE )
            {
            // InternalGuilang.g:2877:1: ( RULE_CLOSE )
            // InternalGuilang.g:2878:2: RULE_CLOSE
            {
             before(grammarAccess.getButtonSpecAccess().getCLOSETerminalRuleCall_4()); 
            match(input,RULE_CLOSE,FOLLOW_2); 
             after(grammarAccess.getButtonSpecAccess().getCLOSETerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSpec__Group__4__Impl"


    // $ANTLR start "rule__InputSpec__Group__0"
    // InternalGuilang.g:2888:1: rule__InputSpec__Group__0 : rule__InputSpec__Group__0__Impl rule__InputSpec__Group__1 ;
    public final void rule__InputSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2892:1: ( rule__InputSpec__Group__0__Impl rule__InputSpec__Group__1 )
            // InternalGuilang.g:2893:2: rule__InputSpec__Group__0__Impl rule__InputSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InputSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSpec__Group__0"


    // $ANTLR start "rule__InputSpec__Group__0__Impl"
    // InternalGuilang.g:2900:1: rule__InputSpec__Group__0__Impl : ( ( rule__InputSpec__RefAssignment_0 ) ) ;
    public final void rule__InputSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2904:1: ( ( ( rule__InputSpec__RefAssignment_0 ) ) )
            // InternalGuilang.g:2905:1: ( ( rule__InputSpec__RefAssignment_0 ) )
            {
            // InternalGuilang.g:2905:1: ( ( rule__InputSpec__RefAssignment_0 ) )
            // InternalGuilang.g:2906:2: ( rule__InputSpec__RefAssignment_0 )
            {
             before(grammarAccess.getInputSpecAccess().getRefAssignment_0()); 
            // InternalGuilang.g:2907:2: ( rule__InputSpec__RefAssignment_0 )
            // InternalGuilang.g:2907:3: rule__InputSpec__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InputSpec__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInputSpecAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSpec__Group__0__Impl"


    // $ANTLR start "rule__InputSpec__Group__1"
    // InternalGuilang.g:2915:1: rule__InputSpec__Group__1 : rule__InputSpec__Group__1__Impl rule__InputSpec__Group__2 ;
    public final void rule__InputSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2919:1: ( rule__InputSpec__Group__1__Impl rule__InputSpec__Group__2 )
            // InternalGuilang.g:2920:2: rule__InputSpec__Group__1__Impl rule__InputSpec__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__InputSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSpec__Group__1"


    // $ANTLR start "rule__InputSpec__Group__1__Impl"
    // InternalGuilang.g:2927:1: rule__InputSpec__Group__1__Impl : ( RULE_OPEN ) ;
    public final void rule__InputSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2931:1: ( ( RULE_OPEN ) )
            // InternalGuilang.g:2932:1: ( RULE_OPEN )
            {
            // InternalGuilang.g:2932:1: ( RULE_OPEN )
            // InternalGuilang.g:2933:2: RULE_OPEN
            {
             before(grammarAccess.getInputSpecAccess().getOPENTerminalRuleCall_1()); 
            match(input,RULE_OPEN,FOLLOW_2); 
             after(grammarAccess.getInputSpecAccess().getOPENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSpec__Group__1__Impl"


    // $ANTLR start "rule__InputSpec__Group__2"
    // InternalGuilang.g:2942:1: rule__InputSpec__Group__2 : rule__InputSpec__Group__2__Impl rule__InputSpec__Group__3 ;
    public final void rule__InputSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2946:1: ( rule__InputSpec__Group__2__Impl rule__InputSpec__Group__3 )
            // InternalGuilang.g:2947:2: rule__InputSpec__Group__2__Impl rule__InputSpec__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__InputSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSpec__Group__2"


    // $ANTLR start "rule__InputSpec__Group__2__Impl"
    // InternalGuilang.g:2954:1: rule__InputSpec__Group__2__Impl : ( 'input-spec' ) ;
    public final void rule__InputSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2958:1: ( ( 'input-spec' ) )
            // InternalGuilang.g:2959:1: ( 'input-spec' )
            {
            // InternalGuilang.g:2959:1: ( 'input-spec' )
            // InternalGuilang.g:2960:2: 'input-spec'
            {
             before(grammarAccess.getInputSpecAccess().getInputSpecKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInputSpecAccess().getInputSpecKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSpec__Group__2__Impl"


    // $ANTLR start "rule__InputSpec__Group__3"
    // InternalGuilang.g:2969:1: rule__InputSpec__Group__3 : rule__InputSpec__Group__3__Impl rule__InputSpec__Group__4 ;
    public final void rule__InputSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2973:1: ( rule__InputSpec__Group__3__Impl rule__InputSpec__Group__4 )
            // InternalGuilang.g:2974:2: rule__InputSpec__Group__3__Impl rule__InputSpec__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__InputSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputSpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSpec__Group__3"


    // $ANTLR start "rule__InputSpec__Group__3__Impl"
    // InternalGuilang.g:2981:1: rule__InputSpec__Group__3__Impl : ( ( rule__InputSpec__OptionsAssignment_3 )* ) ;
    public final void rule__InputSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:2985:1: ( ( ( rule__InputSpec__OptionsAssignment_3 )* ) )
            // InternalGuilang.g:2986:1: ( ( rule__InputSpec__OptionsAssignment_3 )* )
            {
            // InternalGuilang.g:2986:1: ( ( rule__InputSpec__OptionsAssignment_3 )* )
            // InternalGuilang.g:2987:2: ( rule__InputSpec__OptionsAssignment_3 )*
            {
             before(grammarAccess.getInputSpecAccess().getOptionsAssignment_3()); 
            // InternalGuilang.g:2988:2: ( rule__InputSpec__OptionsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35||LA26_0==38) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGuilang.g:2988:3: rule__InputSpec__OptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__InputSpec__OptionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getInputSpecAccess().getOptionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSpec__Group__3__Impl"


    // $ANTLR start "rule__InputSpec__Group__4"
    // InternalGuilang.g:2996:1: rule__InputSpec__Group__4 : rule__InputSpec__Group__4__Impl ;
    public final void rule__InputSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3000:1: ( rule__InputSpec__Group__4__Impl )
            // InternalGuilang.g:3001:2: rule__InputSpec__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputSpec__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSpec__Group__4"


    // $ANTLR start "rule__InputSpec__Group__4__Impl"
    // InternalGuilang.g:3007:1: rule__InputSpec__Group__4__Impl : ( RULE_CLOSE ) ;
    public final void rule__InputSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3011:1: ( ( RULE_CLOSE ) )
            // InternalGuilang.g:3012:1: ( RULE_CLOSE )
            {
            // InternalGuilang.g:3012:1: ( RULE_CLOSE )
            // InternalGuilang.g:3013:2: RULE_CLOSE
            {
             before(grammarAccess.getInputSpecAccess().getCLOSETerminalRuleCall_4()); 
            match(input,RULE_CLOSE,FOLLOW_2); 
             after(grammarAccess.getInputSpecAccess().getCLOSETerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSpec__Group__4__Impl"


    // $ANTLR start "rule__CheckboxSpec__Group__0"
    // InternalGuilang.g:3023:1: rule__CheckboxSpec__Group__0 : rule__CheckboxSpec__Group__0__Impl rule__CheckboxSpec__Group__1 ;
    public final void rule__CheckboxSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3027:1: ( rule__CheckboxSpec__Group__0__Impl rule__CheckboxSpec__Group__1 )
            // InternalGuilang.g:3028:2: rule__CheckboxSpec__Group__0__Impl rule__CheckboxSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CheckboxSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckboxSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSpec__Group__0"


    // $ANTLR start "rule__CheckboxSpec__Group__0__Impl"
    // InternalGuilang.g:3035:1: rule__CheckboxSpec__Group__0__Impl : ( ( rule__CheckboxSpec__RefAssignment_0 ) ) ;
    public final void rule__CheckboxSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3039:1: ( ( ( rule__CheckboxSpec__RefAssignment_0 ) ) )
            // InternalGuilang.g:3040:1: ( ( rule__CheckboxSpec__RefAssignment_0 ) )
            {
            // InternalGuilang.g:3040:1: ( ( rule__CheckboxSpec__RefAssignment_0 ) )
            // InternalGuilang.g:3041:2: ( rule__CheckboxSpec__RefAssignment_0 )
            {
             before(grammarAccess.getCheckboxSpecAccess().getRefAssignment_0()); 
            // InternalGuilang.g:3042:2: ( rule__CheckboxSpec__RefAssignment_0 )
            // InternalGuilang.g:3042:3: rule__CheckboxSpec__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxSpec__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxSpecAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSpec__Group__0__Impl"


    // $ANTLR start "rule__CheckboxSpec__Group__1"
    // InternalGuilang.g:3050:1: rule__CheckboxSpec__Group__1 : rule__CheckboxSpec__Group__1__Impl rule__CheckboxSpec__Group__2 ;
    public final void rule__CheckboxSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3054:1: ( rule__CheckboxSpec__Group__1__Impl rule__CheckboxSpec__Group__2 )
            // InternalGuilang.g:3055:2: rule__CheckboxSpec__Group__1__Impl rule__CheckboxSpec__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__CheckboxSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckboxSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSpec__Group__1"


    // $ANTLR start "rule__CheckboxSpec__Group__1__Impl"
    // InternalGuilang.g:3062:1: rule__CheckboxSpec__Group__1__Impl : ( RULE_OPEN ) ;
    public final void rule__CheckboxSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3066:1: ( ( RULE_OPEN ) )
            // InternalGuilang.g:3067:1: ( RULE_OPEN )
            {
            // InternalGuilang.g:3067:1: ( RULE_OPEN )
            // InternalGuilang.g:3068:2: RULE_OPEN
            {
             before(grammarAccess.getCheckboxSpecAccess().getOPENTerminalRuleCall_1()); 
            match(input,RULE_OPEN,FOLLOW_2); 
             after(grammarAccess.getCheckboxSpecAccess().getOPENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSpec__Group__1__Impl"


    // $ANTLR start "rule__CheckboxSpec__Group__2"
    // InternalGuilang.g:3077:1: rule__CheckboxSpec__Group__2 : rule__CheckboxSpec__Group__2__Impl rule__CheckboxSpec__Group__3 ;
    public final void rule__CheckboxSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3081:1: ( rule__CheckboxSpec__Group__2__Impl rule__CheckboxSpec__Group__3 )
            // InternalGuilang.g:3082:2: rule__CheckboxSpec__Group__2__Impl rule__CheckboxSpec__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__CheckboxSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckboxSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSpec__Group__2"


    // $ANTLR start "rule__CheckboxSpec__Group__2__Impl"
    // InternalGuilang.g:3089:1: rule__CheckboxSpec__Group__2__Impl : ( 'checkbox-spec' ) ;
    public final void rule__CheckboxSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3093:1: ( ( 'checkbox-spec' ) )
            // InternalGuilang.g:3094:1: ( 'checkbox-spec' )
            {
            // InternalGuilang.g:3094:1: ( 'checkbox-spec' )
            // InternalGuilang.g:3095:2: 'checkbox-spec'
            {
             before(grammarAccess.getCheckboxSpecAccess().getCheckboxSpecKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCheckboxSpecAccess().getCheckboxSpecKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSpec__Group__2__Impl"


    // $ANTLR start "rule__CheckboxSpec__Group__3"
    // InternalGuilang.g:3104:1: rule__CheckboxSpec__Group__3 : rule__CheckboxSpec__Group__3__Impl ;
    public final void rule__CheckboxSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3108:1: ( rule__CheckboxSpec__Group__3__Impl )
            // InternalGuilang.g:3109:2: rule__CheckboxSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxSpec__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSpec__Group__3"


    // $ANTLR start "rule__CheckboxSpec__Group__3__Impl"
    // InternalGuilang.g:3115:1: rule__CheckboxSpec__Group__3__Impl : ( RULE_CLOSE ) ;
    public final void rule__CheckboxSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3119:1: ( ( RULE_CLOSE ) )
            // InternalGuilang.g:3120:1: ( RULE_CLOSE )
            {
            // InternalGuilang.g:3120:1: ( RULE_CLOSE )
            // InternalGuilang.g:3121:2: RULE_CLOSE
            {
             before(grammarAccess.getCheckboxSpecAccess().getCLOSETerminalRuleCall_3()); 
            match(input,RULE_CLOSE,FOLLOW_2); 
             after(grammarAccess.getCheckboxSpecAccess().getCLOSETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSpec__Group__3__Impl"


    // $ANTLR start "rule__TextValidate__Group__0"
    // InternalGuilang.g:3131:1: rule__TextValidate__Group__0 : rule__TextValidate__Group__0__Impl rule__TextValidate__Group__1 ;
    public final void rule__TextValidate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3135:1: ( rule__TextValidate__Group__0__Impl rule__TextValidate__Group__1 )
            // InternalGuilang.g:3136:2: rule__TextValidate__Group__0__Impl rule__TextValidate__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__TextValidate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextValidate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValidate__Group__0"


    // $ANTLR start "rule__TextValidate__Group__0__Impl"
    // InternalGuilang.g:3143:1: rule__TextValidate__Group__0__Impl : ( 'validate' ) ;
    public final void rule__TextValidate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3147:1: ( ( 'validate' ) )
            // InternalGuilang.g:3148:1: ( 'validate' )
            {
            // InternalGuilang.g:3148:1: ( 'validate' )
            // InternalGuilang.g:3149:2: 'validate'
            {
             before(grammarAccess.getTextValidateAccess().getValidateKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTextValidateAccess().getValidateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValidate__Group__0__Impl"


    // $ANTLR start "rule__TextValidate__Group__1"
    // InternalGuilang.g:3158:1: rule__TextValidate__Group__1 : rule__TextValidate__Group__1__Impl ;
    public final void rule__TextValidate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3162:1: ( rule__TextValidate__Group__1__Impl )
            // InternalGuilang.g:3163:2: rule__TextValidate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextValidate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValidate__Group__1"


    // $ANTLR start "rule__TextValidate__Group__1__Impl"
    // InternalGuilang.g:3169:1: rule__TextValidate__Group__1__Impl : ( ( rule__TextValidate__ValidationAssignment_1 ) ) ;
    public final void rule__TextValidate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3173:1: ( ( ( rule__TextValidate__ValidationAssignment_1 ) ) )
            // InternalGuilang.g:3174:1: ( ( rule__TextValidate__ValidationAssignment_1 ) )
            {
            // InternalGuilang.g:3174:1: ( ( rule__TextValidate__ValidationAssignment_1 ) )
            // InternalGuilang.g:3175:2: ( rule__TextValidate__ValidationAssignment_1 )
            {
             before(grammarAccess.getTextValidateAccess().getValidationAssignment_1()); 
            // InternalGuilang.g:3176:2: ( rule__TextValidate__ValidationAssignment_1 )
            // InternalGuilang.g:3176:3: rule__TextValidate__ValidationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TextValidate__ValidationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextValidateAccess().getValidationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValidate__Group__1__Impl"


    // $ANTLR start "rule__RegexValidate__Group__0"
    // InternalGuilang.g:3185:1: rule__RegexValidate__Group__0 : rule__RegexValidate__Group__0__Impl rule__RegexValidate__Group__1 ;
    public final void rule__RegexValidate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3189:1: ( rule__RegexValidate__Group__0__Impl rule__RegexValidate__Group__1 )
            // InternalGuilang.g:3190:2: rule__RegexValidate__Group__0__Impl rule__RegexValidate__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__RegexValidate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegexValidate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexValidate__Group__0"


    // $ANTLR start "rule__RegexValidate__Group__0__Impl"
    // InternalGuilang.g:3197:1: rule__RegexValidate__Group__0__Impl : ( 'regex' ) ;
    public final void rule__RegexValidate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3201:1: ( ( 'regex' ) )
            // InternalGuilang.g:3202:1: ( 'regex' )
            {
            // InternalGuilang.g:3202:1: ( 'regex' )
            // InternalGuilang.g:3203:2: 'regex'
            {
             before(grammarAccess.getRegexValidateAccess().getRegexKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRegexValidateAccess().getRegexKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexValidate__Group__0__Impl"


    // $ANTLR start "rule__RegexValidate__Group__1"
    // InternalGuilang.g:3212:1: rule__RegexValidate__Group__1 : rule__RegexValidate__Group__1__Impl rule__RegexValidate__Group__2 ;
    public final void rule__RegexValidate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3216:1: ( rule__RegexValidate__Group__1__Impl rule__RegexValidate__Group__2 )
            // InternalGuilang.g:3217:2: rule__RegexValidate__Group__1__Impl rule__RegexValidate__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__RegexValidate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegexValidate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexValidate__Group__1"


    // $ANTLR start "rule__RegexValidate__Group__1__Impl"
    // InternalGuilang.g:3224:1: rule__RegexValidate__Group__1__Impl : ( '=' ) ;
    public final void rule__RegexValidate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3228:1: ( ( '=' ) )
            // InternalGuilang.g:3229:1: ( '=' )
            {
            // InternalGuilang.g:3229:1: ( '=' )
            // InternalGuilang.g:3230:2: '='
            {
             before(grammarAccess.getRegexValidateAccess().getEqualsSignKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRegexValidateAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexValidate__Group__1__Impl"


    // $ANTLR start "rule__RegexValidate__Group__2"
    // InternalGuilang.g:3239:1: rule__RegexValidate__Group__2 : rule__RegexValidate__Group__2__Impl ;
    public final void rule__RegexValidate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3243:1: ( rule__RegexValidate__Group__2__Impl )
            // InternalGuilang.g:3244:2: rule__RegexValidate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegexValidate__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexValidate__Group__2"


    // $ANTLR start "rule__RegexValidate__Group__2__Impl"
    // InternalGuilang.g:3250:1: rule__RegexValidate__Group__2__Impl : ( ( rule__RegexValidate__ValueAssignment_2 ) ) ;
    public final void rule__RegexValidate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3254:1: ( ( ( rule__RegexValidate__ValueAssignment_2 ) ) )
            // InternalGuilang.g:3255:1: ( ( rule__RegexValidate__ValueAssignment_2 ) )
            {
            // InternalGuilang.g:3255:1: ( ( rule__RegexValidate__ValueAssignment_2 ) )
            // InternalGuilang.g:3256:2: ( rule__RegexValidate__ValueAssignment_2 )
            {
             before(grammarAccess.getRegexValidateAccess().getValueAssignment_2()); 
            // InternalGuilang.g:3257:2: ( rule__RegexValidate__ValueAssignment_2 )
            // InternalGuilang.g:3257:3: rule__RegexValidate__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RegexValidate__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegexValidateAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexValidate__Group__2__Impl"


    // $ANTLR start "rule__RequireElements__Group__0"
    // InternalGuilang.g:3266:1: rule__RequireElements__Group__0 : rule__RequireElements__Group__0__Impl rule__RequireElements__Group__1 ;
    public final void rule__RequireElements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3270:1: ( rule__RequireElements__Group__0__Impl rule__RequireElements__Group__1 )
            // InternalGuilang.g:3271:2: rule__RequireElements__Group__0__Impl rule__RequireElements__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__RequireElements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequireElements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireElements__Group__0"


    // $ANTLR start "rule__RequireElements__Group__0__Impl"
    // InternalGuilang.g:3278:1: rule__RequireElements__Group__0__Impl : ( 'require' ) ;
    public final void rule__RequireElements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3282:1: ( ( 'require' ) )
            // InternalGuilang.g:3283:1: ( 'require' )
            {
            // InternalGuilang.g:3283:1: ( 'require' )
            // InternalGuilang.g:3284:2: 'require'
            {
             before(grammarAccess.getRequireElementsAccess().getRequireKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRequireElementsAccess().getRequireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireElements__Group__0__Impl"


    // $ANTLR start "rule__RequireElements__Group__1"
    // InternalGuilang.g:3293:1: rule__RequireElements__Group__1 : rule__RequireElements__Group__1__Impl ;
    public final void rule__RequireElements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3297:1: ( rule__RequireElements__Group__1__Impl )
            // InternalGuilang.g:3298:2: rule__RequireElements__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequireElements__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireElements__Group__1"


    // $ANTLR start "rule__RequireElements__Group__1__Impl"
    // InternalGuilang.g:3304:1: rule__RequireElements__Group__1__Impl : ( ( rule__RequireElements__ElementsAssignment_1 ) ) ;
    public final void rule__RequireElements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3308:1: ( ( ( rule__RequireElements__ElementsAssignment_1 ) ) )
            // InternalGuilang.g:3309:1: ( ( rule__RequireElements__ElementsAssignment_1 ) )
            {
            // InternalGuilang.g:3309:1: ( ( rule__RequireElements__ElementsAssignment_1 ) )
            // InternalGuilang.g:3310:2: ( rule__RequireElements__ElementsAssignment_1 )
            {
             before(grammarAccess.getRequireElementsAccess().getElementsAssignment_1()); 
            // InternalGuilang.g:3311:2: ( rule__RequireElements__ElementsAssignment_1 )
            // InternalGuilang.g:3311:3: rule__RequireElements__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequireElements__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequireElementsAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireElements__Group__1__Impl"


    // $ANTLR start "rule__RequireOr__Group__0"
    // InternalGuilang.g:3320:1: rule__RequireOr__Group__0 : rule__RequireOr__Group__0__Impl rule__RequireOr__Group__1 ;
    public final void rule__RequireOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3324:1: ( rule__RequireOr__Group__0__Impl rule__RequireOr__Group__1 )
            // InternalGuilang.g:3325:2: rule__RequireOr__Group__0__Impl rule__RequireOr__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__RequireOr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequireOr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireOr__Group__0"


    // $ANTLR start "rule__RequireOr__Group__0__Impl"
    // InternalGuilang.g:3332:1: rule__RequireOr__Group__0__Impl : ( ruleRequireAnd ) ;
    public final void rule__RequireOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3336:1: ( ( ruleRequireAnd ) )
            // InternalGuilang.g:3337:1: ( ruleRequireAnd )
            {
            // InternalGuilang.g:3337:1: ( ruleRequireAnd )
            // InternalGuilang.g:3338:2: ruleRequireAnd
            {
             before(grammarAccess.getRequireOrAccess().getRequireAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRequireAnd();

            state._fsp--;

             after(grammarAccess.getRequireOrAccess().getRequireAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireOr__Group__0__Impl"


    // $ANTLR start "rule__RequireOr__Group__1"
    // InternalGuilang.g:3347:1: rule__RequireOr__Group__1 : rule__RequireOr__Group__1__Impl ;
    public final void rule__RequireOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3351:1: ( rule__RequireOr__Group__1__Impl )
            // InternalGuilang.g:3352:2: rule__RequireOr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequireOr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireOr__Group__1"


    // $ANTLR start "rule__RequireOr__Group__1__Impl"
    // InternalGuilang.g:3358:1: rule__RequireOr__Group__1__Impl : ( ( rule__RequireOr__Group_1__0 )* ) ;
    public final void rule__RequireOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3362:1: ( ( ( rule__RequireOr__Group_1__0 )* ) )
            // InternalGuilang.g:3363:1: ( ( rule__RequireOr__Group_1__0 )* )
            {
            // InternalGuilang.g:3363:1: ( ( rule__RequireOr__Group_1__0 )* )
            // InternalGuilang.g:3364:2: ( rule__RequireOr__Group_1__0 )*
            {
             before(grammarAccess.getRequireOrAccess().getGroup_1()); 
            // InternalGuilang.g:3365:2: ( rule__RequireOr__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==39) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGuilang.g:3365:3: rule__RequireOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__RequireOr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getRequireOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireOr__Group__1__Impl"


    // $ANTLR start "rule__RequireOr__Group_1__0"
    // InternalGuilang.g:3374:1: rule__RequireOr__Group_1__0 : rule__RequireOr__Group_1__0__Impl rule__RequireOr__Group_1__1 ;
    public final void rule__RequireOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3378:1: ( rule__RequireOr__Group_1__0__Impl rule__RequireOr__Group_1__1 )
            // InternalGuilang.g:3379:2: rule__RequireOr__Group_1__0__Impl rule__RequireOr__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__RequireOr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequireOr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireOr__Group_1__0"


    // $ANTLR start "rule__RequireOr__Group_1__0__Impl"
    // InternalGuilang.g:3386:1: rule__RequireOr__Group_1__0__Impl : ( () ) ;
    public final void rule__RequireOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3390:1: ( ( () ) )
            // InternalGuilang.g:3391:1: ( () )
            {
            // InternalGuilang.g:3391:1: ( () )
            // InternalGuilang.g:3392:2: ()
            {
             before(grammarAccess.getRequireOrAccess().getOrLeftAction_1_0()); 
            // InternalGuilang.g:3393:2: ()
            // InternalGuilang.g:3393:3: 
            {
            }

             after(grammarAccess.getRequireOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireOr__Group_1__0__Impl"


    // $ANTLR start "rule__RequireOr__Group_1__1"
    // InternalGuilang.g:3401:1: rule__RequireOr__Group_1__1 : rule__RequireOr__Group_1__1__Impl rule__RequireOr__Group_1__2 ;
    public final void rule__RequireOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3405:1: ( rule__RequireOr__Group_1__1__Impl rule__RequireOr__Group_1__2 )
            // InternalGuilang.g:3406:2: rule__RequireOr__Group_1__1__Impl rule__RequireOr__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__RequireOr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequireOr__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireOr__Group_1__1"


    // $ANTLR start "rule__RequireOr__Group_1__1__Impl"
    // InternalGuilang.g:3413:1: rule__RequireOr__Group_1__1__Impl : ( '||' ) ;
    public final void rule__RequireOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3417:1: ( ( '||' ) )
            // InternalGuilang.g:3418:1: ( '||' )
            {
            // InternalGuilang.g:3418:1: ( '||' )
            // InternalGuilang.g:3419:2: '||'
            {
             before(grammarAccess.getRequireOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRequireOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireOr__Group_1__1__Impl"


    // $ANTLR start "rule__RequireOr__Group_1__2"
    // InternalGuilang.g:3428:1: rule__RequireOr__Group_1__2 : rule__RequireOr__Group_1__2__Impl ;
    public final void rule__RequireOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3432:1: ( rule__RequireOr__Group_1__2__Impl )
            // InternalGuilang.g:3433:2: rule__RequireOr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequireOr__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireOr__Group_1__2"


    // $ANTLR start "rule__RequireOr__Group_1__2__Impl"
    // InternalGuilang.g:3439:1: rule__RequireOr__Group_1__2__Impl : ( ( rule__RequireOr__RightAssignment_1_2 ) ) ;
    public final void rule__RequireOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3443:1: ( ( ( rule__RequireOr__RightAssignment_1_2 ) ) )
            // InternalGuilang.g:3444:1: ( ( rule__RequireOr__RightAssignment_1_2 ) )
            {
            // InternalGuilang.g:3444:1: ( ( rule__RequireOr__RightAssignment_1_2 ) )
            // InternalGuilang.g:3445:2: ( rule__RequireOr__RightAssignment_1_2 )
            {
             before(grammarAccess.getRequireOrAccess().getRightAssignment_1_2()); 
            // InternalGuilang.g:3446:2: ( rule__RequireOr__RightAssignment_1_2 )
            // InternalGuilang.g:3446:3: rule__RequireOr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RequireOr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRequireOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireOr__Group_1__2__Impl"


    // $ANTLR start "rule__RequireAnd__Group__0"
    // InternalGuilang.g:3455:1: rule__RequireAnd__Group__0 : rule__RequireAnd__Group__0__Impl rule__RequireAnd__Group__1 ;
    public final void rule__RequireAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3459:1: ( rule__RequireAnd__Group__0__Impl rule__RequireAnd__Group__1 )
            // InternalGuilang.g:3460:2: rule__RequireAnd__Group__0__Impl rule__RequireAnd__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__RequireAnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequireAnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireAnd__Group__0"


    // $ANTLR start "rule__RequireAnd__Group__0__Impl"
    // InternalGuilang.g:3467:1: rule__RequireAnd__Group__0__Impl : ( ruleRequireBase ) ;
    public final void rule__RequireAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3471:1: ( ( ruleRequireBase ) )
            // InternalGuilang.g:3472:1: ( ruleRequireBase )
            {
            // InternalGuilang.g:3472:1: ( ruleRequireBase )
            // InternalGuilang.g:3473:2: ruleRequireBase
            {
             before(grammarAccess.getRequireAndAccess().getRequireBaseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRequireBase();

            state._fsp--;

             after(grammarAccess.getRequireAndAccess().getRequireBaseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireAnd__Group__0__Impl"


    // $ANTLR start "rule__RequireAnd__Group__1"
    // InternalGuilang.g:3482:1: rule__RequireAnd__Group__1 : rule__RequireAnd__Group__1__Impl ;
    public final void rule__RequireAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3486:1: ( rule__RequireAnd__Group__1__Impl )
            // InternalGuilang.g:3487:2: rule__RequireAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequireAnd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireAnd__Group__1"


    // $ANTLR start "rule__RequireAnd__Group__1__Impl"
    // InternalGuilang.g:3493:1: rule__RequireAnd__Group__1__Impl : ( ( rule__RequireAnd__Group_1__0 )* ) ;
    public final void rule__RequireAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3497:1: ( ( ( rule__RequireAnd__Group_1__0 )* ) )
            // InternalGuilang.g:3498:1: ( ( rule__RequireAnd__Group_1__0 )* )
            {
            // InternalGuilang.g:3498:1: ( ( rule__RequireAnd__Group_1__0 )* )
            // InternalGuilang.g:3499:2: ( rule__RequireAnd__Group_1__0 )*
            {
             before(grammarAccess.getRequireAndAccess().getGroup_1()); 
            // InternalGuilang.g:3500:2: ( rule__RequireAnd__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGuilang.g:3500:3: rule__RequireAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__RequireAnd__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getRequireAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireAnd__Group__1__Impl"


    // $ANTLR start "rule__RequireAnd__Group_1__0"
    // InternalGuilang.g:3509:1: rule__RequireAnd__Group_1__0 : rule__RequireAnd__Group_1__0__Impl rule__RequireAnd__Group_1__1 ;
    public final void rule__RequireAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3513:1: ( rule__RequireAnd__Group_1__0__Impl rule__RequireAnd__Group_1__1 )
            // InternalGuilang.g:3514:2: rule__RequireAnd__Group_1__0__Impl rule__RequireAnd__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__RequireAnd__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequireAnd__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireAnd__Group_1__0"


    // $ANTLR start "rule__RequireAnd__Group_1__0__Impl"
    // InternalGuilang.g:3521:1: rule__RequireAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__RequireAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3525:1: ( ( () ) )
            // InternalGuilang.g:3526:1: ( () )
            {
            // InternalGuilang.g:3526:1: ( () )
            // InternalGuilang.g:3527:2: ()
            {
             before(grammarAccess.getRequireAndAccess().getAndLeftAction_1_0()); 
            // InternalGuilang.g:3528:2: ()
            // InternalGuilang.g:3528:3: 
            {
            }

             after(grammarAccess.getRequireAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireAnd__Group_1__0__Impl"


    // $ANTLR start "rule__RequireAnd__Group_1__1"
    // InternalGuilang.g:3536:1: rule__RequireAnd__Group_1__1 : rule__RequireAnd__Group_1__1__Impl rule__RequireAnd__Group_1__2 ;
    public final void rule__RequireAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3540:1: ( rule__RequireAnd__Group_1__1__Impl rule__RequireAnd__Group_1__2 )
            // InternalGuilang.g:3541:2: rule__RequireAnd__Group_1__1__Impl rule__RequireAnd__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__RequireAnd__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequireAnd__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireAnd__Group_1__1"


    // $ANTLR start "rule__RequireAnd__Group_1__1__Impl"
    // InternalGuilang.g:3548:1: rule__RequireAnd__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__RequireAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3552:1: ( ( '&&' ) )
            // InternalGuilang.g:3553:1: ( '&&' )
            {
            // InternalGuilang.g:3553:1: ( '&&' )
            // InternalGuilang.g:3554:2: '&&'
            {
             before(grammarAccess.getRequireAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRequireAndAccess().getAmpersandAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireAnd__Group_1__1__Impl"


    // $ANTLR start "rule__RequireAnd__Group_1__2"
    // InternalGuilang.g:3563:1: rule__RequireAnd__Group_1__2 : rule__RequireAnd__Group_1__2__Impl ;
    public final void rule__RequireAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3567:1: ( rule__RequireAnd__Group_1__2__Impl )
            // InternalGuilang.g:3568:2: rule__RequireAnd__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequireAnd__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireAnd__Group_1__2"


    // $ANTLR start "rule__RequireAnd__Group_1__2__Impl"
    // InternalGuilang.g:3574:1: rule__RequireAnd__Group_1__2__Impl : ( ( rule__RequireAnd__RightAssignment_1_2 ) ) ;
    public final void rule__RequireAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3578:1: ( ( ( rule__RequireAnd__RightAssignment_1_2 ) ) )
            // InternalGuilang.g:3579:1: ( ( rule__RequireAnd__RightAssignment_1_2 ) )
            {
            // InternalGuilang.g:3579:1: ( ( rule__RequireAnd__RightAssignment_1_2 ) )
            // InternalGuilang.g:3580:2: ( rule__RequireAnd__RightAssignment_1_2 )
            {
             before(grammarAccess.getRequireAndAccess().getRightAssignment_1_2()); 
            // InternalGuilang.g:3581:2: ( rule__RequireAnd__RightAssignment_1_2 )
            // InternalGuilang.g:3581:3: rule__RequireAnd__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RequireAnd__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRequireAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireAnd__Group_1__2__Impl"


    // $ANTLR start "rule__RequireBase__Group_0__0"
    // InternalGuilang.g:3590:1: rule__RequireBase__Group_0__0 : rule__RequireBase__Group_0__0__Impl rule__RequireBase__Group_0__1 ;
    public final void rule__RequireBase__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3594:1: ( rule__RequireBase__Group_0__0__Impl rule__RequireBase__Group_0__1 )
            // InternalGuilang.g:3595:2: rule__RequireBase__Group_0__0__Impl rule__RequireBase__Group_0__1
            {
            pushFollow(FOLLOW_34);
            rule__RequireBase__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequireBase__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_0__0"


    // $ANTLR start "rule__RequireBase__Group_0__0__Impl"
    // InternalGuilang.g:3602:1: rule__RequireBase__Group_0__0__Impl : ( '(' ) ;
    public final void rule__RequireBase__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3606:1: ( ( '(' ) )
            // InternalGuilang.g:3607:1: ( '(' )
            {
            // InternalGuilang.g:3607:1: ( '(' )
            // InternalGuilang.g:3608:2: '('
            {
             before(grammarAccess.getRequireBaseAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRequireBaseAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_0__0__Impl"


    // $ANTLR start "rule__RequireBase__Group_0__1"
    // InternalGuilang.g:3617:1: rule__RequireBase__Group_0__1 : rule__RequireBase__Group_0__1__Impl rule__RequireBase__Group_0__2 ;
    public final void rule__RequireBase__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3621:1: ( rule__RequireBase__Group_0__1__Impl rule__RequireBase__Group_0__2 )
            // InternalGuilang.g:3622:2: rule__RequireBase__Group_0__1__Impl rule__RequireBase__Group_0__2
            {
            pushFollow(FOLLOW_39);
            rule__RequireBase__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequireBase__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_0__1"


    // $ANTLR start "rule__RequireBase__Group_0__1__Impl"
    // InternalGuilang.g:3629:1: rule__RequireBase__Group_0__1__Impl : ( ( rule__RequireBase__ExpAssignment_0_1 ) ) ;
    public final void rule__RequireBase__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3633:1: ( ( ( rule__RequireBase__ExpAssignment_0_1 ) ) )
            // InternalGuilang.g:3634:1: ( ( rule__RequireBase__ExpAssignment_0_1 ) )
            {
            // InternalGuilang.g:3634:1: ( ( rule__RequireBase__ExpAssignment_0_1 ) )
            // InternalGuilang.g:3635:2: ( rule__RequireBase__ExpAssignment_0_1 )
            {
             before(grammarAccess.getRequireBaseAccess().getExpAssignment_0_1()); 
            // InternalGuilang.g:3636:2: ( rule__RequireBase__ExpAssignment_0_1 )
            // InternalGuilang.g:3636:3: rule__RequireBase__ExpAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__RequireBase__ExpAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRequireBaseAccess().getExpAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_0__1__Impl"


    // $ANTLR start "rule__RequireBase__Group_0__2"
    // InternalGuilang.g:3644:1: rule__RequireBase__Group_0__2 : rule__RequireBase__Group_0__2__Impl ;
    public final void rule__RequireBase__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3648:1: ( rule__RequireBase__Group_0__2__Impl )
            // InternalGuilang.g:3649:2: rule__RequireBase__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequireBase__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_0__2"


    // $ANTLR start "rule__RequireBase__Group_0__2__Impl"
    // InternalGuilang.g:3655:1: rule__RequireBase__Group_0__2__Impl : ( ')' ) ;
    public final void rule__RequireBase__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3659:1: ( ( ')' ) )
            // InternalGuilang.g:3660:1: ( ')' )
            {
            // InternalGuilang.g:3660:1: ( ')' )
            // InternalGuilang.g:3661:2: ')'
            {
             before(grammarAccess.getRequireBaseAccess().getRightParenthesisKeyword_0_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRequireBaseAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_0__2__Impl"


    // $ANTLR start "rule__RequireBase__Group_1__0"
    // InternalGuilang.g:3671:1: rule__RequireBase__Group_1__0 : rule__RequireBase__Group_1__0__Impl rule__RequireBase__Group_1__1 ;
    public final void rule__RequireBase__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3675:1: ( rule__RequireBase__Group_1__0__Impl rule__RequireBase__Group_1__1 )
            // InternalGuilang.g:3676:2: rule__RequireBase__Group_1__0__Impl rule__RequireBase__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__RequireBase__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequireBase__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_1__0"


    // $ANTLR start "rule__RequireBase__Group_1__0__Impl"
    // InternalGuilang.g:3683:1: rule__RequireBase__Group_1__0__Impl : ( () ) ;
    public final void rule__RequireBase__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3687:1: ( ( () ) )
            // InternalGuilang.g:3688:1: ( () )
            {
            // InternalGuilang.g:3688:1: ( () )
            // InternalGuilang.g:3689:2: ()
            {
             before(grammarAccess.getRequireBaseAccess().getNotAction_1_0()); 
            // InternalGuilang.g:3690:2: ()
            // InternalGuilang.g:3690:3: 
            {
            }

             after(grammarAccess.getRequireBaseAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_1__0__Impl"


    // $ANTLR start "rule__RequireBase__Group_1__1"
    // InternalGuilang.g:3698:1: rule__RequireBase__Group_1__1 : rule__RequireBase__Group_1__1__Impl rule__RequireBase__Group_1__2 ;
    public final void rule__RequireBase__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3702:1: ( rule__RequireBase__Group_1__1__Impl rule__RequireBase__Group_1__2 )
            // InternalGuilang.g:3703:2: rule__RequireBase__Group_1__1__Impl rule__RequireBase__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__RequireBase__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequireBase__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_1__1"


    // $ANTLR start "rule__RequireBase__Group_1__1__Impl"
    // InternalGuilang.g:3710:1: rule__RequireBase__Group_1__1__Impl : ( ( rule__RequireBase__Alternatives_1_1 ) ) ;
    public final void rule__RequireBase__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3714:1: ( ( ( rule__RequireBase__Alternatives_1_1 ) ) )
            // InternalGuilang.g:3715:1: ( ( rule__RequireBase__Alternatives_1_1 ) )
            {
            // InternalGuilang.g:3715:1: ( ( rule__RequireBase__Alternatives_1_1 ) )
            // InternalGuilang.g:3716:2: ( rule__RequireBase__Alternatives_1_1 )
            {
             before(grammarAccess.getRequireBaseAccess().getAlternatives_1_1()); 
            // InternalGuilang.g:3717:2: ( rule__RequireBase__Alternatives_1_1 )
            // InternalGuilang.g:3717:3: rule__RequireBase__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RequireBase__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRequireBaseAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_1__1__Impl"


    // $ANTLR start "rule__RequireBase__Group_1__2"
    // InternalGuilang.g:3725:1: rule__RequireBase__Group_1__2 : rule__RequireBase__Group_1__2__Impl ;
    public final void rule__RequireBase__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3729:1: ( rule__RequireBase__Group_1__2__Impl )
            // InternalGuilang.g:3730:2: rule__RequireBase__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequireBase__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_1__2"


    // $ANTLR start "rule__RequireBase__Group_1__2__Impl"
    // InternalGuilang.g:3736:1: rule__RequireBase__Group_1__2__Impl : ( ( rule__RequireBase__ExpAssignment_1_2 ) ) ;
    public final void rule__RequireBase__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3740:1: ( ( ( rule__RequireBase__ExpAssignment_1_2 ) ) )
            // InternalGuilang.g:3741:1: ( ( rule__RequireBase__ExpAssignment_1_2 ) )
            {
            // InternalGuilang.g:3741:1: ( ( rule__RequireBase__ExpAssignment_1_2 ) )
            // InternalGuilang.g:3742:2: ( rule__RequireBase__ExpAssignment_1_2 )
            {
             before(grammarAccess.getRequireBaseAccess().getExpAssignment_1_2()); 
            // InternalGuilang.g:3743:2: ( rule__RequireBase__ExpAssignment_1_2 )
            // InternalGuilang.g:3743:3: rule__RequireBase__ExpAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RequireBase__ExpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRequireBaseAccess().getExpAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_1__2__Impl"


    // $ANTLR start "rule__RequireBase__Group_2__0"
    // InternalGuilang.g:3752:1: rule__RequireBase__Group_2__0 : rule__RequireBase__Group_2__0__Impl rule__RequireBase__Group_2__1 ;
    public final void rule__RequireBase__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3756:1: ( rule__RequireBase__Group_2__0__Impl rule__RequireBase__Group_2__1 )
            // InternalGuilang.g:3757:2: rule__RequireBase__Group_2__0__Impl rule__RequireBase__Group_2__1
            {
            pushFollow(FOLLOW_34);
            rule__RequireBase__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequireBase__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_2__0"


    // $ANTLR start "rule__RequireBase__Group_2__0__Impl"
    // InternalGuilang.g:3764:1: rule__RequireBase__Group_2__0__Impl : ( () ) ;
    public final void rule__RequireBase__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3768:1: ( ( () ) )
            // InternalGuilang.g:3769:1: ( () )
            {
            // InternalGuilang.g:3769:1: ( () )
            // InternalGuilang.g:3770:2: ()
            {
             before(grammarAccess.getRequireBaseAccess().getElementRefAction_2_0()); 
            // InternalGuilang.g:3771:2: ()
            // InternalGuilang.g:3771:3: 
            {
            }

             after(grammarAccess.getRequireBaseAccess().getElementRefAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_2__0__Impl"


    // $ANTLR start "rule__RequireBase__Group_2__1"
    // InternalGuilang.g:3779:1: rule__RequireBase__Group_2__1 : rule__RequireBase__Group_2__1__Impl ;
    public final void rule__RequireBase__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3783:1: ( rule__RequireBase__Group_2__1__Impl )
            // InternalGuilang.g:3784:2: rule__RequireBase__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequireBase__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_2__1"


    // $ANTLR start "rule__RequireBase__Group_2__1__Impl"
    // InternalGuilang.g:3790:1: rule__RequireBase__Group_2__1__Impl : ( ( rule__RequireBase__RefAssignment_2_1 ) ) ;
    public final void rule__RequireBase__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3794:1: ( ( ( rule__RequireBase__RefAssignment_2_1 ) ) )
            // InternalGuilang.g:3795:1: ( ( rule__RequireBase__RefAssignment_2_1 ) )
            {
            // InternalGuilang.g:3795:1: ( ( rule__RequireBase__RefAssignment_2_1 ) )
            // InternalGuilang.g:3796:2: ( rule__RequireBase__RefAssignment_2_1 )
            {
             before(grammarAccess.getRequireBaseAccess().getRefAssignment_2_1()); 
            // InternalGuilang.g:3797:2: ( rule__RequireBase__RefAssignment_2_1 )
            // InternalGuilang.g:3797:3: rule__RequireBase__RefAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RequireBase__RefAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRequireBaseAccess().getRefAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__Group_2__1__Impl"


    // $ANTLR start "rule__GUI__MainAssignment"
    // InternalGuilang.g:3806:1: rule__GUI__MainAssignment : ( ruleMain ) ;
    public final void rule__GUI__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3810:1: ( ( ruleMain ) )
            // InternalGuilang.g:3811:2: ( ruleMain )
            {
            // InternalGuilang.g:3811:2: ( ruleMain )
            // InternalGuilang.g:3812:3: ruleMain
            {
             before(grammarAccess.getGUIAccess().getMainMainParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getGUIAccess().getMainMainParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__MainAssignment"


    // $ANTLR start "rule__Unit__LayoutAssignment_1"
    // InternalGuilang.g:3821:1: rule__Unit__LayoutAssignment_1 : ( ruleLayout ) ;
    public final void rule__Unit__LayoutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3825:1: ( ( ruleLayout ) )
            // InternalGuilang.g:3826:2: ( ruleLayout )
            {
            // InternalGuilang.g:3826:2: ( ruleLayout )
            // InternalGuilang.g:3827:3: ruleLayout
            {
             before(grammarAccess.getUnitAccess().getLayoutLayoutParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getUnitAccess().getLayoutLayoutParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__LayoutAssignment_1"


    // $ANTLR start "rule__Unit__SpecificationsAssignment_2"
    // InternalGuilang.g:3836:1: rule__Unit__SpecificationsAssignment_2 : ( ruleSpecifications ) ;
    public final void rule__Unit__SpecificationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3840:1: ( ( ruleSpecifications ) )
            // InternalGuilang.g:3841:2: ( ruleSpecifications )
            {
            // InternalGuilang.g:3841:2: ( ruleSpecifications )
            // InternalGuilang.g:3842:3: ruleSpecifications
            {
             before(grammarAccess.getUnitAccess().getSpecificationsSpecificationsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecifications();

            state._fsp--;

             after(grammarAccess.getUnitAccess().getSpecificationsSpecificationsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__SpecificationsAssignment_2"


    // $ANTLR start "rule__Layout__NameAssignment_2"
    // InternalGuilang.g:3851:1: rule__Layout__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Layout__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3855:1: ( ( RULE_ID ) )
            // InternalGuilang.g:3856:2: ( RULE_ID )
            {
            // InternalGuilang.g:3856:2: ( RULE_ID )
            // InternalGuilang.g:3857:3: RULE_ID
            {
             before(grammarAccess.getLayoutAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLayoutAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__NameAssignment_2"


    // $ANTLR start "rule__Layout__EntitiesAssignment_4"
    // InternalGuilang.g:3866:1: rule__Layout__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__Layout__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3870:1: ( ( ruleEntity ) )
            // InternalGuilang.g:3871:2: ( ruleEntity )
            {
            // InternalGuilang.g:3871:2: ( ruleEntity )
            // InternalGuilang.g:3872:3: ruleEntity
            {
             before(grammarAccess.getLayoutAccess().getEntitiesEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getEntitiesEntityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__EntitiesAssignment_4"


    // $ANTLR start "rule__Vertical__NameAssignment_2"
    // InternalGuilang.g:3881:1: rule__Vertical__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Vertical__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3885:1: ( ( RULE_ID ) )
            // InternalGuilang.g:3886:2: ( RULE_ID )
            {
            // InternalGuilang.g:3886:2: ( RULE_ID )
            // InternalGuilang.g:3887:3: RULE_ID
            {
             before(grammarAccess.getVerticalAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVerticalAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__NameAssignment_2"


    // $ANTLR start "rule__Vertical__EntitiesAssignment_4"
    // InternalGuilang.g:3896:1: rule__Vertical__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__Vertical__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3900:1: ( ( ruleEntity ) )
            // InternalGuilang.g:3901:2: ( ruleEntity )
            {
            // InternalGuilang.g:3901:2: ( ruleEntity )
            // InternalGuilang.g:3902:3: ruleEntity
            {
             before(grammarAccess.getVerticalAccess().getEntitiesEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getVerticalAccess().getEntitiesEntityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertical__EntitiesAssignment_4"


    // $ANTLR start "rule__Horizontal__NameAssignment_2"
    // InternalGuilang.g:3911:1: rule__Horizontal__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Horizontal__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3915:1: ( ( RULE_ID ) )
            // InternalGuilang.g:3916:2: ( RULE_ID )
            {
            // InternalGuilang.g:3916:2: ( RULE_ID )
            // InternalGuilang.g:3917:3: RULE_ID
            {
             before(grammarAccess.getHorizontalAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHorizontalAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__NameAssignment_2"


    // $ANTLR start "rule__Horizontal__EntitiesAssignment_4"
    // InternalGuilang.g:3926:1: rule__Horizontal__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__Horizontal__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3930:1: ( ( ruleEntity ) )
            // InternalGuilang.g:3931:2: ( ruleEntity )
            {
            // InternalGuilang.g:3931:2: ( ruleEntity )
            // InternalGuilang.g:3932:3: ruleEntity
            {
             before(grammarAccess.getHorizontalAccess().getEntitiesEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getHorizontalAccess().getEntitiesEntityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizontal__EntitiesAssignment_4"


    // $ANTLR start "rule__Label__NameAssignment_2"
    // InternalGuilang.g:3941:1: rule__Label__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3945:1: ( ( RULE_ID ) )
            // InternalGuilang.g:3946:2: ( RULE_ID )
            {
            // InternalGuilang.g:3946:2: ( RULE_ID )
            // InternalGuilang.g:3947:3: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__NameAssignment_2"


    // $ANTLR start "rule__Button__NameAssignment_2"
    // InternalGuilang.g:3956:1: rule__Button__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3960:1: ( ( RULE_ID ) )
            // InternalGuilang.g:3961:2: ( RULE_ID )
            {
            // InternalGuilang.g:3961:2: ( RULE_ID )
            // InternalGuilang.g:3962:3: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__NameAssignment_2"


    // $ANTLR start "rule__Input__NameAssignment_2"
    // InternalGuilang.g:3971:1: rule__Input__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Input__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3975:1: ( ( RULE_ID ) )
            // InternalGuilang.g:3976:2: ( RULE_ID )
            {
            // InternalGuilang.g:3976:2: ( RULE_ID )
            // InternalGuilang.g:3977:3: RULE_ID
            {
             before(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__NameAssignment_2"


    // $ANTLR start "rule__Checkbox__NameAssignment_2"
    // InternalGuilang.g:3986:1: rule__Checkbox__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Checkbox__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:3990:1: ( ( RULE_ID ) )
            // InternalGuilang.g:3991:2: ( RULE_ID )
            {
            // InternalGuilang.g:3991:2: ( RULE_ID )
            // InternalGuilang.g:3992:3: RULE_ID
            {
             before(grammarAccess.getCheckboxAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__NameAssignment_2"


    // $ANTLR start "rule__Specifications__SpecificationsAssignment_3"
    // InternalGuilang.g:4001:1: rule__Specifications__SpecificationsAssignment_3 : ( ruleSpecification ) ;
    public final void rule__Specifications__SpecificationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4005:1: ( ( ruleSpecification ) )
            // InternalGuilang.g:4006:2: ( ruleSpecification )
            {
            // InternalGuilang.g:4006:2: ( ruleSpecification )
            // InternalGuilang.g:4007:3: ruleSpecification
            {
             before(grammarAccess.getSpecificationsAccess().getSpecificationsSpecificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationsAccess().getSpecificationsSpecificationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specifications__SpecificationsAssignment_3"


    // $ANTLR start "rule__Specification__TypeAssignment"
    // InternalGuilang.g:4016:1: rule__Specification__TypeAssignment : ( ( rule__Specification__TypeAlternatives_0 ) ) ;
    public final void rule__Specification__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4020:1: ( ( ( rule__Specification__TypeAlternatives_0 ) ) )
            // InternalGuilang.g:4021:2: ( ( rule__Specification__TypeAlternatives_0 ) )
            {
            // InternalGuilang.g:4021:2: ( ( rule__Specification__TypeAlternatives_0 ) )
            // InternalGuilang.g:4022:3: ( rule__Specification__TypeAlternatives_0 )
            {
             before(grammarAccess.getSpecificationAccess().getTypeAlternatives_0()); 
            // InternalGuilang.g:4023:3: ( rule__Specification__TypeAlternatives_0 )
            // InternalGuilang.g:4023:4: rule__Specification__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Specification__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__TypeAssignment"


    // $ANTLR start "rule__LayoutSpec__RefAssignment_0"
    // InternalGuilang.g:4031:1: rule__LayoutSpec__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LayoutSpec__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4035:1: ( ( ( RULE_ID ) ) )
            // InternalGuilang.g:4036:2: ( ( RULE_ID ) )
            {
            // InternalGuilang.g:4036:2: ( ( RULE_ID ) )
            // InternalGuilang.g:4037:3: ( RULE_ID )
            {
             before(grammarAccess.getLayoutSpecAccess().getRefLayoutCrossReference_0_0()); 
            // InternalGuilang.g:4038:3: ( RULE_ID )
            // InternalGuilang.g:4039:4: RULE_ID
            {
             before(grammarAccess.getLayoutSpecAccess().getRefLayoutIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLayoutSpecAccess().getRefLayoutIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLayoutSpecAccess().getRefLayoutCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutSpec__RefAssignment_0"


    // $ANTLR start "rule__VerticalSpec__RefAssignment_0"
    // InternalGuilang.g:4050:1: rule__VerticalSpec__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VerticalSpec__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4054:1: ( ( ( RULE_ID ) ) )
            // InternalGuilang.g:4055:2: ( ( RULE_ID ) )
            {
            // InternalGuilang.g:4055:2: ( ( RULE_ID ) )
            // InternalGuilang.g:4056:3: ( RULE_ID )
            {
             before(grammarAccess.getVerticalSpecAccess().getRefVerticalCrossReference_0_0()); 
            // InternalGuilang.g:4057:3: ( RULE_ID )
            // InternalGuilang.g:4058:4: RULE_ID
            {
             before(grammarAccess.getVerticalSpecAccess().getRefVerticalIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVerticalSpecAccess().getRefVerticalIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getVerticalSpecAccess().getRefVerticalCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerticalSpec__RefAssignment_0"


    // $ANTLR start "rule__HorizontalSpec__RefAssignment_0"
    // InternalGuilang.g:4069:1: rule__HorizontalSpec__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HorizontalSpec__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4073:1: ( ( ( RULE_ID ) ) )
            // InternalGuilang.g:4074:2: ( ( RULE_ID ) )
            {
            // InternalGuilang.g:4074:2: ( ( RULE_ID ) )
            // InternalGuilang.g:4075:3: ( RULE_ID )
            {
             before(grammarAccess.getHorizontalSpecAccess().getRefHorizontalCrossReference_0_0()); 
            // InternalGuilang.g:4076:3: ( RULE_ID )
            // InternalGuilang.g:4077:4: RULE_ID
            {
             before(grammarAccess.getHorizontalSpecAccess().getRefHorizontalIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHorizontalSpecAccess().getRefHorizontalIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getHorizontalSpecAccess().getRefHorizontalCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalSpec__RefAssignment_0"


    // $ANTLR start "rule__LabelSpec__RefAssignment_0"
    // InternalGuilang.g:4088:1: rule__LabelSpec__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LabelSpec__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4092:1: ( ( ( RULE_ID ) ) )
            // InternalGuilang.g:4093:2: ( ( RULE_ID ) )
            {
            // InternalGuilang.g:4093:2: ( ( RULE_ID ) )
            // InternalGuilang.g:4094:3: ( RULE_ID )
            {
             before(grammarAccess.getLabelSpecAccess().getRefLabelCrossReference_0_0()); 
            // InternalGuilang.g:4095:3: ( RULE_ID )
            // InternalGuilang.g:4096:4: RULE_ID
            {
             before(grammarAccess.getLabelSpecAccess().getRefLabelIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLabelSpecAccess().getRefLabelIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLabelSpecAccess().getRefLabelCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelSpec__RefAssignment_0"


    // $ANTLR start "rule__ButtonSpec__RefAssignment_0"
    // InternalGuilang.g:4107:1: rule__ButtonSpec__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ButtonSpec__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4111:1: ( ( ( RULE_ID ) ) )
            // InternalGuilang.g:4112:2: ( ( RULE_ID ) )
            {
            // InternalGuilang.g:4112:2: ( ( RULE_ID ) )
            // InternalGuilang.g:4113:3: ( RULE_ID )
            {
             before(grammarAccess.getButtonSpecAccess().getRefButtonCrossReference_0_0()); 
            // InternalGuilang.g:4114:3: ( RULE_ID )
            // InternalGuilang.g:4115:4: RULE_ID
            {
             before(grammarAccess.getButtonSpecAccess().getRefButtonIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonSpecAccess().getRefButtonIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getButtonSpecAccess().getRefButtonCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSpec__RefAssignment_0"


    // $ANTLR start "rule__ButtonSpec__OptionsAssignment_3"
    // InternalGuilang.g:4126:1: rule__ButtonSpec__OptionsAssignment_3 : ( ruleButtonSpecOptions ) ;
    public final void rule__ButtonSpec__OptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4130:1: ( ( ruleButtonSpecOptions ) )
            // InternalGuilang.g:4131:2: ( ruleButtonSpecOptions )
            {
            // InternalGuilang.g:4131:2: ( ruleButtonSpecOptions )
            // InternalGuilang.g:4132:3: ruleButtonSpecOptions
            {
             before(grammarAccess.getButtonSpecAccess().getOptionsButtonSpecOptionsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleButtonSpecOptions();

            state._fsp--;

             after(grammarAccess.getButtonSpecAccess().getOptionsButtonSpecOptionsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSpec__OptionsAssignment_3"


    // $ANTLR start "rule__InputSpec__RefAssignment_0"
    // InternalGuilang.g:4141:1: rule__InputSpec__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__InputSpec__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4145:1: ( ( ( RULE_ID ) ) )
            // InternalGuilang.g:4146:2: ( ( RULE_ID ) )
            {
            // InternalGuilang.g:4146:2: ( ( RULE_ID ) )
            // InternalGuilang.g:4147:3: ( RULE_ID )
            {
             before(grammarAccess.getInputSpecAccess().getRefInputCrossReference_0_0()); 
            // InternalGuilang.g:4148:3: ( RULE_ID )
            // InternalGuilang.g:4149:4: RULE_ID
            {
             before(grammarAccess.getInputSpecAccess().getRefInputIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputSpecAccess().getRefInputIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getInputSpecAccess().getRefInputCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSpec__RefAssignment_0"


    // $ANTLR start "rule__InputSpec__OptionsAssignment_3"
    // InternalGuilang.g:4160:1: rule__InputSpec__OptionsAssignment_3 : ( ruleInputSpecOptions ) ;
    public final void rule__InputSpec__OptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4164:1: ( ( ruleInputSpecOptions ) )
            // InternalGuilang.g:4165:2: ( ruleInputSpecOptions )
            {
            // InternalGuilang.g:4165:2: ( ruleInputSpecOptions )
            // InternalGuilang.g:4166:3: ruleInputSpecOptions
            {
             before(grammarAccess.getInputSpecAccess().getOptionsInputSpecOptionsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInputSpecOptions();

            state._fsp--;

             after(grammarAccess.getInputSpecAccess().getOptionsInputSpecOptionsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSpec__OptionsAssignment_3"


    // $ANTLR start "rule__CheckboxSpec__RefAssignment_0"
    // InternalGuilang.g:4175:1: rule__CheckboxSpec__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CheckboxSpec__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4179:1: ( ( ( RULE_ID ) ) )
            // InternalGuilang.g:4180:2: ( ( RULE_ID ) )
            {
            // InternalGuilang.g:4180:2: ( ( RULE_ID ) )
            // InternalGuilang.g:4181:3: ( RULE_ID )
            {
             before(grammarAccess.getCheckboxSpecAccess().getRefCheckboxCrossReference_0_0()); 
            // InternalGuilang.g:4182:3: ( RULE_ID )
            // InternalGuilang.g:4183:4: RULE_ID
            {
             before(grammarAccess.getCheckboxSpecAccess().getRefCheckboxIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheckboxSpecAccess().getRefCheckboxIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCheckboxSpecAccess().getRefCheckboxCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSpec__RefAssignment_0"


    // $ANTLR start "rule__TextValidate__ValidationAssignment_1"
    // InternalGuilang.g:4194:1: rule__TextValidate__ValidationAssignment_1 : ( ( rule__TextValidate__ValidationAlternatives_1_0 ) ) ;
    public final void rule__TextValidate__ValidationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4198:1: ( ( ( rule__TextValidate__ValidationAlternatives_1_0 ) ) )
            // InternalGuilang.g:4199:2: ( ( rule__TextValidate__ValidationAlternatives_1_0 ) )
            {
            // InternalGuilang.g:4199:2: ( ( rule__TextValidate__ValidationAlternatives_1_0 ) )
            // InternalGuilang.g:4200:3: ( rule__TextValidate__ValidationAlternatives_1_0 )
            {
             before(grammarAccess.getTextValidateAccess().getValidationAlternatives_1_0()); 
            // InternalGuilang.g:4201:3: ( rule__TextValidate__ValidationAlternatives_1_0 )
            // InternalGuilang.g:4201:4: rule__TextValidate__ValidationAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TextValidate__ValidationAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTextValidateAccess().getValidationAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValidate__ValidationAssignment_1"


    // $ANTLR start "rule__RegexValidate__ValueAssignment_2"
    // InternalGuilang.g:4209:1: rule__RegexValidate__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RegexValidate__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4213:1: ( ( RULE_STRING ) )
            // InternalGuilang.g:4214:2: ( RULE_STRING )
            {
            // InternalGuilang.g:4214:2: ( RULE_STRING )
            // InternalGuilang.g:4215:3: RULE_STRING
            {
             before(grammarAccess.getRegexValidateAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRegexValidateAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexValidate__ValueAssignment_2"


    // $ANTLR start "rule__RegexVariableRef__RefAssignment"
    // InternalGuilang.g:4224:1: rule__RegexVariableRef__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RegexVariableRef__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4228:1: ( ( ( RULE_ID ) ) )
            // InternalGuilang.g:4229:2: ( ( RULE_ID ) )
            {
            // InternalGuilang.g:4229:2: ( ( RULE_ID ) )
            // InternalGuilang.g:4230:3: ( RULE_ID )
            {
             before(grammarAccess.getRegexVariableRefAccess().getRefRegexVariableValidateCrossReference_0()); 
            // InternalGuilang.g:4231:3: ( RULE_ID )
            // InternalGuilang.g:4232:4: RULE_ID
            {
             before(grammarAccess.getRegexVariableRefAccess().getRefRegexVariableValidateIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegexVariableRefAccess().getRefRegexVariableValidateIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRegexVariableRefAccess().getRefRegexVariableValidateCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexVariableRef__RefAssignment"


    // $ANTLR start "rule__PresetTextValidate__ValueAssignment_0"
    // InternalGuilang.g:4243:1: rule__PresetTextValidate__ValueAssignment_0 : ( ( 'val-password' ) ) ;
    public final void rule__PresetTextValidate__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4247:1: ( ( ( 'val-password' ) ) )
            // InternalGuilang.g:4248:2: ( ( 'val-password' ) )
            {
            // InternalGuilang.g:4248:2: ( ( 'val-password' ) )
            // InternalGuilang.g:4249:3: ( 'val-password' )
            {
             before(grammarAccess.getPresetTextValidateAccess().getValueValPasswordKeyword_0_0()); 
            // InternalGuilang.g:4250:3: ( 'val-password' )
            // InternalGuilang.g:4251:4: 'val-password'
            {
             before(grammarAccess.getPresetTextValidateAccess().getValueValPasswordKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPresetTextValidateAccess().getValueValPasswordKeyword_0_0()); 

            }

             after(grammarAccess.getPresetTextValidateAccess().getValueValPasswordKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PresetTextValidate__ValueAssignment_0"


    // $ANTLR start "rule__PresetTextValidate__ValueAssignment_1"
    // InternalGuilang.g:4262:1: rule__PresetTextValidate__ValueAssignment_1 : ( ( 'val-email' ) ) ;
    public final void rule__PresetTextValidate__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4266:1: ( ( ( 'val-email' ) ) )
            // InternalGuilang.g:4267:2: ( ( 'val-email' ) )
            {
            // InternalGuilang.g:4267:2: ( ( 'val-email' ) )
            // InternalGuilang.g:4268:3: ( 'val-email' )
            {
             before(grammarAccess.getPresetTextValidateAccess().getValueValEmailKeyword_1_0()); 
            // InternalGuilang.g:4269:3: ( 'val-email' )
            // InternalGuilang.g:4270:4: 'val-email'
            {
             before(grammarAccess.getPresetTextValidateAccess().getValueValEmailKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPresetTextValidateAccess().getValueValEmailKeyword_1_0()); 

            }

             after(grammarAccess.getPresetTextValidateAccess().getValueValEmailKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PresetTextValidate__ValueAssignment_1"


    // $ANTLR start "rule__CheckboxValidate__ValueAssignment"
    // InternalGuilang.g:4281:1: rule__CheckboxValidate__ValueAssignment : ( ( rule__CheckboxValidate__ValueAlternatives_0 ) ) ;
    public final void rule__CheckboxValidate__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4285:1: ( ( ( rule__CheckboxValidate__ValueAlternatives_0 ) ) )
            // InternalGuilang.g:4286:2: ( ( rule__CheckboxValidate__ValueAlternatives_0 ) )
            {
            // InternalGuilang.g:4286:2: ( ( rule__CheckboxValidate__ValueAlternatives_0 ) )
            // InternalGuilang.g:4287:3: ( rule__CheckboxValidate__ValueAlternatives_0 )
            {
             before(grammarAccess.getCheckboxValidateAccess().getValueAlternatives_0()); 
            // InternalGuilang.g:4288:3: ( rule__CheckboxValidate__ValueAlternatives_0 )
            // InternalGuilang.g:4288:4: rule__CheckboxValidate__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxValidate__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxValidateAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxValidate__ValueAssignment"


    // $ANTLR start "rule__RequireElements__ElementsAssignment_1"
    // InternalGuilang.g:4296:1: rule__RequireElements__ElementsAssignment_1 : ( ruleRequire ) ;
    public final void rule__RequireElements__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4300:1: ( ( ruleRequire ) )
            // InternalGuilang.g:4301:2: ( ruleRequire )
            {
            // InternalGuilang.g:4301:2: ( ruleRequire )
            // InternalGuilang.g:4302:3: ruleRequire
            {
             before(grammarAccess.getRequireElementsAccess().getElementsRequireParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequire();

            state._fsp--;

             after(grammarAccess.getRequireElementsAccess().getElementsRequireParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireElements__ElementsAssignment_1"


    // $ANTLR start "rule__RequireOr__RightAssignment_1_2"
    // InternalGuilang.g:4311:1: rule__RequireOr__RightAssignment_1_2 : ( ruleRequireAnd ) ;
    public final void rule__RequireOr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4315:1: ( ( ruleRequireAnd ) )
            // InternalGuilang.g:4316:2: ( ruleRequireAnd )
            {
            // InternalGuilang.g:4316:2: ( ruleRequireAnd )
            // InternalGuilang.g:4317:3: ruleRequireAnd
            {
             before(grammarAccess.getRequireOrAccess().getRightRequireAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequireAnd();

            state._fsp--;

             after(grammarAccess.getRequireOrAccess().getRightRequireAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireOr__RightAssignment_1_2"


    // $ANTLR start "rule__RequireAnd__RightAssignment_1_2"
    // InternalGuilang.g:4326:1: rule__RequireAnd__RightAssignment_1_2 : ( ruleRequireBase ) ;
    public final void rule__RequireAnd__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4330:1: ( ( ruleRequireBase ) )
            // InternalGuilang.g:4331:2: ( ruleRequireBase )
            {
            // InternalGuilang.g:4331:2: ( ruleRequireBase )
            // InternalGuilang.g:4332:3: ruleRequireBase
            {
             before(grammarAccess.getRequireAndAccess().getRightRequireBaseParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequireBase();

            state._fsp--;

             after(grammarAccess.getRequireAndAccess().getRightRequireBaseParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireAnd__RightAssignment_1_2"


    // $ANTLR start "rule__RequireBase__ExpAssignment_0_1"
    // InternalGuilang.g:4341:1: rule__RequireBase__ExpAssignment_0_1 : ( ruleRequire ) ;
    public final void rule__RequireBase__ExpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4345:1: ( ( ruleRequire ) )
            // InternalGuilang.g:4346:2: ( ruleRequire )
            {
            // InternalGuilang.g:4346:2: ( ruleRequire )
            // InternalGuilang.g:4347:3: ruleRequire
            {
             before(grammarAccess.getRequireBaseAccess().getExpRequireParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequire();

            state._fsp--;

             after(grammarAccess.getRequireBaseAccess().getExpRequireParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__ExpAssignment_0_1"


    // $ANTLR start "rule__RequireBase__ExpAssignment_1_2"
    // InternalGuilang.g:4356:1: rule__RequireBase__ExpAssignment_1_2 : ( ruleRequireBase ) ;
    public final void rule__RequireBase__ExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4360:1: ( ( ruleRequireBase ) )
            // InternalGuilang.g:4361:2: ( ruleRequireBase )
            {
            // InternalGuilang.g:4361:2: ( ruleRequireBase )
            // InternalGuilang.g:4362:3: ruleRequireBase
            {
             before(grammarAccess.getRequireBaseAccess().getExpRequireBaseParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequireBase();

            state._fsp--;

             after(grammarAccess.getRequireBaseAccess().getExpRequireBaseParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__ExpAssignment_1_2"


    // $ANTLR start "rule__RequireBase__RefAssignment_2_1"
    // InternalGuilang.g:4371:1: rule__RequireBase__RefAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__RequireBase__RefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuilang.g:4375:1: ( ( ( RULE_ID ) ) )
            // InternalGuilang.g:4376:2: ( ( RULE_ID ) )
            {
            // InternalGuilang.g:4376:2: ( ( RULE_ID ) )
            // InternalGuilang.g:4377:3: ( RULE_ID )
            {
             before(grammarAccess.getRequireBaseAccess().getRefElementCrossReference_2_1_0()); 
            // InternalGuilang.g:4378:3: ( RULE_ID )
            // InternalGuilang.g:4379:4: RULE_ID
            {
             before(grammarAccess.getRequireBaseAccess().getRefElementIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequireBaseAccess().getRefElementIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getRequireBaseAccess().getRefElementCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequireBase__RefAssignment_2_1"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\12\1\4\1\34\7\uffff";
    static final String dfa_3s = "\1\12\1\4\1\42\7\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\6\1\3\1\4\1\1\1\5\1\7";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\5\1\6\1\10\1\4\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1025:1: rule__Specification__TypeAlternatives_0 : ( ( ruleLayoutSpec ) | ( ruleVerticalSpec ) | ( ruleHorizontalSpec ) | ( ruleLabelSpec ) | ( ruleButtonSpec ) | ( ruleInputSpec ) | ( ruleCheckboxSpec ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000041E03E0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000041E03C2L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000041E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000041E03C0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004800000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004800000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000181000000400L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020001800400L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000001800000L});

}