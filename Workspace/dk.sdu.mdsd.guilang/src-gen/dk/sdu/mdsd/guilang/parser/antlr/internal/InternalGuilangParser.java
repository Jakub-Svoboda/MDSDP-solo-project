package dk.sdu.mdsd.guilang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mdsd.guilang.services.GuilangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuilangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPEN", "RULE_CLOSE", "RULE_ID", "RULE_LABEL_TYPE", "RULE_BUTTON_TYPE", "RULE_INPUT_TYPE", "RULE_CHECKBOX_TYPE", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'main'", "'layout'", "'vertical'", "'vert'", "'horizontal'", "'hori'", "'elements'", "'layout-spec'", "'vertical-spec'", "'horizontal-spec'", "'label-spec'", "'button-spec'", "'input-spec'", "'checkbox-spec'", "'validate'", "'regex'", "'='", "'val-password'", "'val-email'", "'is-checked'", "'is-unchecked'", "'require'", "'||'", "'&&'", "'('", "')'", "'!'", "'NOT'"
    };
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


        public InternalGuilangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGuilangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGuilangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGuilang.g"; }



     	private GuilangGrammarAccess grammarAccess;

        public InternalGuilangParser(TokenStream input, GuilangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GUI";
       	}

       	@Override
       	protected GuilangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGUI"
    // InternalGuilang.g:64:1: entryRuleGUI returns [EObject current=null] : iv_ruleGUI= ruleGUI EOF ;
    public final EObject entryRuleGUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUI = null;


        try {
            // InternalGuilang.g:64:44: (iv_ruleGUI= ruleGUI EOF )
            // InternalGuilang.g:65:2: iv_ruleGUI= ruleGUI EOF
            {
             newCompositeNode(grammarAccess.getGUIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGUI=ruleGUI();

            state._fsp--;

             current =iv_ruleGUI; 
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
    // $ANTLR end "entryRuleGUI"


    // $ANTLR start "ruleGUI"
    // InternalGuilang.g:71:1: ruleGUI returns [EObject current=null] : ( (lv_main_0_0= ruleMain ) ) ;
    public final EObject ruleGUI() throws RecognitionException {
        EObject current = null;

        EObject lv_main_0_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:77:2: ( ( (lv_main_0_0= ruleMain ) ) )
            // InternalGuilang.g:78:2: ( (lv_main_0_0= ruleMain ) )
            {
            // InternalGuilang.g:78:2: ( (lv_main_0_0= ruleMain ) )
            // InternalGuilang.g:79:3: (lv_main_0_0= ruleMain )
            {
            // InternalGuilang.g:79:3: (lv_main_0_0= ruleMain )
            // InternalGuilang.g:80:4: lv_main_0_0= ruleMain
            {

            				newCompositeNode(grammarAccess.getGUIAccess().getMainMainParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_main_0_0=ruleMain();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getGUIRule());
            				}
            				set(
            					current,
            					"main",
            					lv_main_0_0,
            					"dk.sdu.mdsd.guilang.Guilang.Main");
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
    // $ANTLR end "ruleGUI"


    // $ANTLR start "entryRuleMain"
    // InternalGuilang.g:100:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalGuilang.g:100:45: (iv_ruleMain= ruleMain EOF )
            // InternalGuilang.g:101:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalGuilang.g:107:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main' this_Unit_1= ruleUnit ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Unit_1 = null;



        	enterRule();

        try {
            // InternalGuilang.g:113:2: ( (otherlv_0= 'main' this_Unit_1= ruleUnit ) )
            // InternalGuilang.g:114:2: (otherlv_0= 'main' this_Unit_1= ruleUnit )
            {
            // InternalGuilang.g:114:2: (otherlv_0= 'main' this_Unit_1= ruleUnit )
            // InternalGuilang.g:115:3: otherlv_0= 'main' this_Unit_1= ruleUnit
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMainAccess().getMainKeyword_0());
            		

            			newCompositeNode(grammarAccess.getMainAccess().getUnitParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Unit_1=ruleUnit();

            state._fsp--;


            			current = this_Unit_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleUnit"
    // InternalGuilang.g:131:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // InternalGuilang.g:131:45: (iv_ruleUnit= ruleUnit EOF )
            // InternalGuilang.g:132:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit; 
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
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalGuilang.g:138:1: ruleUnit returns [EObject current=null] : (this_OPEN_0= RULE_OPEN ( (lv_layout_1_0= ruleLayout ) ) ( (lv_specifications_2_0= ruleSpecifications ) )? this_CLOSE_3= RULE_CLOSE ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token this_CLOSE_3=null;
        EObject lv_layout_1_0 = null;

        EObject lv_specifications_2_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:144:2: ( (this_OPEN_0= RULE_OPEN ( (lv_layout_1_0= ruleLayout ) ) ( (lv_specifications_2_0= ruleSpecifications ) )? this_CLOSE_3= RULE_CLOSE ) )
            // InternalGuilang.g:145:2: (this_OPEN_0= RULE_OPEN ( (lv_layout_1_0= ruleLayout ) ) ( (lv_specifications_2_0= ruleSpecifications ) )? this_CLOSE_3= RULE_CLOSE )
            {
            // InternalGuilang.g:145:2: (this_OPEN_0= RULE_OPEN ( (lv_layout_1_0= ruleLayout ) ) ( (lv_specifications_2_0= ruleSpecifications ) )? this_CLOSE_3= RULE_CLOSE )
            // InternalGuilang.g:146:3: this_OPEN_0= RULE_OPEN ( (lv_layout_1_0= ruleLayout ) ) ( (lv_specifications_2_0= ruleSpecifications ) )? this_CLOSE_3= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FOLLOW_4); 

            			newLeafNode(this_OPEN_0, grammarAccess.getUnitAccess().getOPENTerminalRuleCall_0());
            		
            // InternalGuilang.g:150:3: ( (lv_layout_1_0= ruleLayout ) )
            // InternalGuilang.g:151:4: (lv_layout_1_0= ruleLayout )
            {
            // InternalGuilang.g:151:4: (lv_layout_1_0= ruleLayout )
            // InternalGuilang.g:152:5: lv_layout_1_0= ruleLayout
            {

            					newCompositeNode(grammarAccess.getUnitAccess().getLayoutLayoutParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_layout_1_0=ruleLayout();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnitRule());
            					}
            					set(
            						current,
            						"layout",
            						lv_layout_1_0,
            						"dk.sdu.mdsd.guilang.Guilang.Layout");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGuilang.g:169:3: ( (lv_specifications_2_0= ruleSpecifications ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGuilang.g:170:4: (lv_specifications_2_0= ruleSpecifications )
                    {
                    // InternalGuilang.g:170:4: (lv_specifications_2_0= ruleSpecifications )
                    // InternalGuilang.g:171:5: lv_specifications_2_0= ruleSpecifications
                    {

                    					newCompositeNode(grammarAccess.getUnitAccess().getSpecificationsSpecificationsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_specifications_2_0=ruleSpecifications();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnitRule());
                    					}
                    					set(
                    						current,
                    						"specifications",
                    						lv_specifications_2_0,
                    						"dk.sdu.mdsd.guilang.Guilang.Specifications");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_3=(Token)match(input,RULE_CLOSE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_3, grammarAccess.getUnitAccess().getCLOSETerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleEntity"
    // InternalGuilang.g:196:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalGuilang.g:196:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalGuilang.g:197:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalGuilang.g:203:1: ruleEntity returns [EObject current=null] : (this_LayoutType_0= ruleLayoutType | this_Element_1= ruleElement ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_LayoutType_0 = null;

        EObject this_Element_1 = null;



        	enterRule();

        try {
            // InternalGuilang.g:209:2: ( (this_LayoutType_0= ruleLayoutType | this_Element_1= ruleElement ) )
            // InternalGuilang.g:210:2: (this_LayoutType_0= ruleLayoutType | this_Element_1= ruleElement )
            {
            // InternalGuilang.g:210:2: (this_LayoutType_0= ruleLayoutType | this_Element_1= ruleElement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=18 && LA2_0<=22)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_LABEL_TYPE && LA2_0<=RULE_CHECKBOX_TYPE)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGuilang.g:211:3: this_LayoutType_0= ruleLayoutType
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getLayoutTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LayoutType_0=ruleLayoutType();

                    state._fsp--;


                    			current = this_LayoutType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGuilang.g:220:3: this_Element_1= ruleElement
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Element_1=ruleElement();

                    state._fsp--;


                    			current = this_Element_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleLayout"
    // InternalGuilang.g:232:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalGuilang.g:232:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalGuilang.g:233:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalGuilang.g:239:1: ruleLayout returns [EObject current=null] : ( () otherlv_1= 'layout' ( (lv_name_2_0= RULE_ID ) )? this_OPEN_3= RULE_OPEN ( (lv_entities_4_0= ruleEntity ) )* this_CLOSE_5= RULE_CLOSE ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPEN_3=null;
        Token this_CLOSE_5=null;
        EObject lv_entities_4_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:245:2: ( ( () otherlv_1= 'layout' ( (lv_name_2_0= RULE_ID ) )? this_OPEN_3= RULE_OPEN ( (lv_entities_4_0= ruleEntity ) )* this_CLOSE_5= RULE_CLOSE ) )
            // InternalGuilang.g:246:2: ( () otherlv_1= 'layout' ( (lv_name_2_0= RULE_ID ) )? this_OPEN_3= RULE_OPEN ( (lv_entities_4_0= ruleEntity ) )* this_CLOSE_5= RULE_CLOSE )
            {
            // InternalGuilang.g:246:2: ( () otherlv_1= 'layout' ( (lv_name_2_0= RULE_ID ) )? this_OPEN_3= RULE_OPEN ( (lv_entities_4_0= ruleEntity ) )* this_CLOSE_5= RULE_CLOSE )
            // InternalGuilang.g:247:3: () otherlv_1= 'layout' ( (lv_name_2_0= RULE_ID ) )? this_OPEN_3= RULE_OPEN ( (lv_entities_4_0= ruleEntity ) )* this_CLOSE_5= RULE_CLOSE
            {
            // InternalGuilang.g:247:3: ()
            // InternalGuilang.g:248:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLayoutAccess().getLayoutAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getLayoutKeyword_1());
            		
            // InternalGuilang.g:258:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGuilang.g:259:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalGuilang.g:259:4: (lv_name_2_0= RULE_ID )
                    // InternalGuilang.g:260:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getLayoutAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLayoutRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            this_OPEN_3=(Token)match(input,RULE_OPEN,FOLLOW_8); 

            			newLeafNode(this_OPEN_3, grammarAccess.getLayoutAccess().getOPENTerminalRuleCall_3());
            		
            // InternalGuilang.g:280:3: ( (lv_entities_4_0= ruleEntity ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_LABEL_TYPE && LA4_0<=RULE_CHECKBOX_TYPE)||(LA4_0>=18 && LA4_0<=22)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGuilang.g:281:4: (lv_entities_4_0= ruleEntity )
            	    {
            	    // InternalGuilang.g:281:4: (lv_entities_4_0= ruleEntity )
            	    // InternalGuilang.g:282:5: lv_entities_4_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getLayoutAccess().getEntitiesEntityParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_entities_4_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayoutRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_4_0,
            	    						"dk.sdu.mdsd.guilang.Guilang.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_CLOSE_5=(Token)match(input,RULE_CLOSE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_5, grammarAccess.getLayoutAccess().getCLOSETerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleLayoutType"
    // InternalGuilang.g:307:1: entryRuleLayoutType returns [EObject current=null] : iv_ruleLayoutType= ruleLayoutType EOF ;
    public final EObject entryRuleLayoutType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutType = null;


        try {
            // InternalGuilang.g:307:51: (iv_ruleLayoutType= ruleLayoutType EOF )
            // InternalGuilang.g:308:2: iv_ruleLayoutType= ruleLayoutType EOF
            {
             newCompositeNode(grammarAccess.getLayoutTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutType=ruleLayoutType();

            state._fsp--;

             current =iv_ruleLayoutType; 
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
    // $ANTLR end "entryRuleLayoutType"


    // $ANTLR start "ruleLayoutType"
    // InternalGuilang.g:314:1: ruleLayoutType returns [EObject current=null] : (this_Layout_0= ruleLayout | this_Vertical_1= ruleVertical | this_Horizontal_2= ruleHorizontal ) ;
    public final EObject ruleLayoutType() throws RecognitionException {
        EObject current = null;

        EObject this_Layout_0 = null;

        EObject this_Vertical_1 = null;

        EObject this_Horizontal_2 = null;



        	enterRule();

        try {
            // InternalGuilang.g:320:2: ( (this_Layout_0= ruleLayout | this_Vertical_1= ruleVertical | this_Horizontal_2= ruleHorizontal ) )
            // InternalGuilang.g:321:2: (this_Layout_0= ruleLayout | this_Vertical_1= ruleVertical | this_Horizontal_2= ruleHorizontal )
            {
            // InternalGuilang.g:321:2: (this_Layout_0= ruleLayout | this_Vertical_1= ruleVertical | this_Horizontal_2= ruleHorizontal )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGuilang.g:322:3: this_Layout_0= ruleLayout
                    {

                    			newCompositeNode(grammarAccess.getLayoutTypeAccess().getLayoutParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Layout_0=ruleLayout();

                    state._fsp--;


                    			current = this_Layout_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGuilang.g:331:3: this_Vertical_1= ruleVertical
                    {

                    			newCompositeNode(grammarAccess.getLayoutTypeAccess().getVerticalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Vertical_1=ruleVertical();

                    state._fsp--;


                    			current = this_Vertical_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGuilang.g:340:3: this_Horizontal_2= ruleHorizontal
                    {

                    			newCompositeNode(grammarAccess.getLayoutTypeAccess().getHorizontalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Horizontal_2=ruleHorizontal();

                    state._fsp--;


                    			current = this_Horizontal_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleLayoutType"


    // $ANTLR start "entryRuleVertical"
    // InternalGuilang.g:352:1: entryRuleVertical returns [EObject current=null] : iv_ruleVertical= ruleVertical EOF ;
    public final EObject entryRuleVertical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVertical = null;


        try {
            // InternalGuilang.g:352:49: (iv_ruleVertical= ruleVertical EOF )
            // InternalGuilang.g:353:2: iv_ruleVertical= ruleVertical EOF
            {
             newCompositeNode(grammarAccess.getVerticalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVertical=ruleVertical();

            state._fsp--;

             current =iv_ruleVertical; 
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
    // $ANTLR end "entryRuleVertical"


    // $ANTLR start "ruleVertical"
    // InternalGuilang.g:359:1: ruleVertical returns [EObject current=null] : ( () (otherlv_1= 'vertical' | otherlv_2= 'vert' ) ( (lv_name_3_0= RULE_ID ) )? this_OPEN_4= RULE_OPEN ( (lv_entities_5_0= ruleEntity ) )* this_CLOSE_6= RULE_CLOSE ) ;
    public final EObject ruleVertical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_OPEN_4=null;
        Token this_CLOSE_6=null;
        EObject lv_entities_5_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:365:2: ( ( () (otherlv_1= 'vertical' | otherlv_2= 'vert' ) ( (lv_name_3_0= RULE_ID ) )? this_OPEN_4= RULE_OPEN ( (lv_entities_5_0= ruleEntity ) )* this_CLOSE_6= RULE_CLOSE ) )
            // InternalGuilang.g:366:2: ( () (otherlv_1= 'vertical' | otherlv_2= 'vert' ) ( (lv_name_3_0= RULE_ID ) )? this_OPEN_4= RULE_OPEN ( (lv_entities_5_0= ruleEntity ) )* this_CLOSE_6= RULE_CLOSE )
            {
            // InternalGuilang.g:366:2: ( () (otherlv_1= 'vertical' | otherlv_2= 'vert' ) ( (lv_name_3_0= RULE_ID ) )? this_OPEN_4= RULE_OPEN ( (lv_entities_5_0= ruleEntity ) )* this_CLOSE_6= RULE_CLOSE )
            // InternalGuilang.g:367:3: () (otherlv_1= 'vertical' | otherlv_2= 'vert' ) ( (lv_name_3_0= RULE_ID ) )? this_OPEN_4= RULE_OPEN ( (lv_entities_5_0= ruleEntity ) )* this_CLOSE_6= RULE_CLOSE
            {
            // InternalGuilang.g:367:3: ()
            // InternalGuilang.g:368:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerticalAccess().getVerticalAction_0(),
            					current);
            			

            }

            // InternalGuilang.g:374:3: (otherlv_1= 'vertical' | otherlv_2= 'vert' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGuilang.g:375:4: otherlv_1= 'vertical'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getVerticalAccess().getVerticalKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuilang.g:380:4: otherlv_2= 'vert'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getVerticalAccess().getVertKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGuilang.g:385:3: ( (lv_name_3_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGuilang.g:386:4: (lv_name_3_0= RULE_ID )
                    {
                    // InternalGuilang.g:386:4: (lv_name_3_0= RULE_ID )
                    // InternalGuilang.g:387:5: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    					newLeafNode(lv_name_3_0, grammarAccess.getVerticalAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVerticalRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            this_OPEN_4=(Token)match(input,RULE_OPEN,FOLLOW_8); 

            			newLeafNode(this_OPEN_4, grammarAccess.getVerticalAccess().getOPENTerminalRuleCall_3());
            		
            // InternalGuilang.g:407:3: ( (lv_entities_5_0= ruleEntity ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_LABEL_TYPE && LA8_0<=RULE_CHECKBOX_TYPE)||(LA8_0>=18 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGuilang.g:408:4: (lv_entities_5_0= ruleEntity )
            	    {
            	    // InternalGuilang.g:408:4: (lv_entities_5_0= ruleEntity )
            	    // InternalGuilang.g:409:5: lv_entities_5_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getVerticalAccess().getEntitiesEntityParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_entities_5_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVerticalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_5_0,
            	    						"dk.sdu.mdsd.guilang.Guilang.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_CLOSE_6=(Token)match(input,RULE_CLOSE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_6, grammarAccess.getVerticalAccess().getCLOSETerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleVertical"


    // $ANTLR start "entryRuleHorizontal"
    // InternalGuilang.g:434:1: entryRuleHorizontal returns [EObject current=null] : iv_ruleHorizontal= ruleHorizontal EOF ;
    public final EObject entryRuleHorizontal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorizontal = null;


        try {
            // InternalGuilang.g:434:51: (iv_ruleHorizontal= ruleHorizontal EOF )
            // InternalGuilang.g:435:2: iv_ruleHorizontal= ruleHorizontal EOF
            {
             newCompositeNode(grammarAccess.getHorizontalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHorizontal=ruleHorizontal();

            state._fsp--;

             current =iv_ruleHorizontal; 
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
    // $ANTLR end "entryRuleHorizontal"


    // $ANTLR start "ruleHorizontal"
    // InternalGuilang.g:441:1: ruleHorizontal returns [EObject current=null] : ( () (otherlv_1= 'horizontal' | otherlv_2= 'hori' ) ( (lv_name_3_0= RULE_ID ) )? this_OPEN_4= RULE_OPEN ( (lv_entities_5_0= ruleEntity ) )* this_CLOSE_6= RULE_CLOSE ) ;
    public final EObject ruleHorizontal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_OPEN_4=null;
        Token this_CLOSE_6=null;
        EObject lv_entities_5_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:447:2: ( ( () (otherlv_1= 'horizontal' | otherlv_2= 'hori' ) ( (lv_name_3_0= RULE_ID ) )? this_OPEN_4= RULE_OPEN ( (lv_entities_5_0= ruleEntity ) )* this_CLOSE_6= RULE_CLOSE ) )
            // InternalGuilang.g:448:2: ( () (otherlv_1= 'horizontal' | otherlv_2= 'hori' ) ( (lv_name_3_0= RULE_ID ) )? this_OPEN_4= RULE_OPEN ( (lv_entities_5_0= ruleEntity ) )* this_CLOSE_6= RULE_CLOSE )
            {
            // InternalGuilang.g:448:2: ( () (otherlv_1= 'horizontal' | otherlv_2= 'hori' ) ( (lv_name_3_0= RULE_ID ) )? this_OPEN_4= RULE_OPEN ( (lv_entities_5_0= ruleEntity ) )* this_CLOSE_6= RULE_CLOSE )
            // InternalGuilang.g:449:3: () (otherlv_1= 'horizontal' | otherlv_2= 'hori' ) ( (lv_name_3_0= RULE_ID ) )? this_OPEN_4= RULE_OPEN ( (lv_entities_5_0= ruleEntity ) )* this_CLOSE_6= RULE_CLOSE
            {
            // InternalGuilang.g:449:3: ()
            // InternalGuilang.g:450:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHorizontalAccess().getHorizontalAction_0(),
            					current);
            			

            }

            // InternalGuilang.g:456:3: (otherlv_1= 'horizontal' | otherlv_2= 'hori' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGuilang.g:457:4: otherlv_1= 'horizontal'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getHorizontalAccess().getHorizontalKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuilang.g:462:4: otherlv_2= 'hori'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getHorizontalAccess().getHoriKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGuilang.g:467:3: ( (lv_name_3_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGuilang.g:468:4: (lv_name_3_0= RULE_ID )
                    {
                    // InternalGuilang.g:468:4: (lv_name_3_0= RULE_ID )
                    // InternalGuilang.g:469:5: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    					newLeafNode(lv_name_3_0, grammarAccess.getHorizontalAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHorizontalRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            this_OPEN_4=(Token)match(input,RULE_OPEN,FOLLOW_8); 

            			newLeafNode(this_OPEN_4, grammarAccess.getHorizontalAccess().getOPENTerminalRuleCall_3());
            		
            // InternalGuilang.g:489:3: ( (lv_entities_5_0= ruleEntity ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_LABEL_TYPE && LA11_0<=RULE_CHECKBOX_TYPE)||(LA11_0>=18 && LA11_0<=22)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGuilang.g:490:4: (lv_entities_5_0= ruleEntity )
            	    {
            	    // InternalGuilang.g:490:4: (lv_entities_5_0= ruleEntity )
            	    // InternalGuilang.g:491:5: lv_entities_5_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getHorizontalAccess().getEntitiesEntityParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_entities_5_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHorizontalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_5_0,
            	    						"dk.sdu.mdsd.guilang.Guilang.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            this_CLOSE_6=(Token)match(input,RULE_CLOSE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_6, grammarAccess.getHorizontalAccess().getCLOSETerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleHorizontal"


    // $ANTLR start "entryRuleElement"
    // InternalGuilang.g:516:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalGuilang.g:516:48: (iv_ruleElement= ruleElement EOF )
            // InternalGuilang.g:517:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalGuilang.g:523:1: ruleElement returns [EObject current=null] : (this_Label_0= ruleLabel | this_Button_1= ruleButton | this_Input_2= ruleInput | this_Checkbox_3= ruleCheckbox ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Label_0 = null;

        EObject this_Button_1 = null;

        EObject this_Input_2 = null;

        EObject this_Checkbox_3 = null;



        	enterRule();

        try {
            // InternalGuilang.g:529:2: ( (this_Label_0= ruleLabel | this_Button_1= ruleButton | this_Input_2= ruleInput | this_Checkbox_3= ruleCheckbox ) )
            // InternalGuilang.g:530:2: (this_Label_0= ruleLabel | this_Button_1= ruleButton | this_Input_2= ruleInput | this_Checkbox_3= ruleCheckbox )
            {
            // InternalGuilang.g:530:2: (this_Label_0= ruleLabel | this_Button_1= ruleButton | this_Input_2= ruleInput | this_Checkbox_3= ruleCheckbox )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_LABEL_TYPE:
                {
                alt12=1;
                }
                break;
            case RULE_BUTTON_TYPE:
                {
                alt12=2;
                }
                break;
            case RULE_INPUT_TYPE:
                {
                alt12=3;
                }
                break;
            case RULE_CHECKBOX_TYPE:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalGuilang.g:531:3: this_Label_0= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLabelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_0=ruleLabel();

                    state._fsp--;


                    			current = this_Label_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGuilang.g:540:3: this_Button_1= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getButtonParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_1=ruleButton();

                    state._fsp--;


                    			current = this_Button_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGuilang.g:549:3: this_Input_2= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getInputParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_2=ruleInput();

                    state._fsp--;


                    			current = this_Input_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGuilang.g:558:3: this_Checkbox_3= ruleCheckbox
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCheckboxParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Checkbox_3=ruleCheckbox();

                    state._fsp--;


                    			current = this_Checkbox_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleLabel"
    // InternalGuilang.g:570:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalGuilang.g:570:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalGuilang.g:571:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalGuilang.g:577:1: ruleLabel returns [EObject current=null] : ( () this_LABEL_TYPE_1= RULE_LABEL_TYPE ( (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token this_LABEL_TYPE_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalGuilang.g:583:2: ( ( () this_LABEL_TYPE_1= RULE_LABEL_TYPE ( (lv_name_2_0= RULE_ID ) )? ) )
            // InternalGuilang.g:584:2: ( () this_LABEL_TYPE_1= RULE_LABEL_TYPE ( (lv_name_2_0= RULE_ID ) )? )
            {
            // InternalGuilang.g:584:2: ( () this_LABEL_TYPE_1= RULE_LABEL_TYPE ( (lv_name_2_0= RULE_ID ) )? )
            // InternalGuilang.g:585:3: () this_LABEL_TYPE_1= RULE_LABEL_TYPE ( (lv_name_2_0= RULE_ID ) )?
            {
            // InternalGuilang.g:585:3: ()
            // InternalGuilang.g:586:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelAccess().getLabelAction_0(),
            					current);
            			

            }

            this_LABEL_TYPE_1=(Token)match(input,RULE_LABEL_TYPE,FOLLOW_9); 

            			newLeafNode(this_LABEL_TYPE_1, grammarAccess.getLabelAccess().getLABEL_TYPETerminalRuleCall_1());
            		
            // InternalGuilang.g:596:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGuilang.g:597:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalGuilang.g:597:4: (lv_name_2_0= RULE_ID )
                    // InternalGuilang.g:598:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleButton"
    // InternalGuilang.g:618:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalGuilang.g:618:47: (iv_ruleButton= ruleButton EOF )
            // InternalGuilang.g:619:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalGuilang.g:625:1: ruleButton returns [EObject current=null] : ( () this_BUTTON_TYPE_1= RULE_BUTTON_TYPE ( (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token this_BUTTON_TYPE_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalGuilang.g:631:2: ( ( () this_BUTTON_TYPE_1= RULE_BUTTON_TYPE ( (lv_name_2_0= RULE_ID ) )? ) )
            // InternalGuilang.g:632:2: ( () this_BUTTON_TYPE_1= RULE_BUTTON_TYPE ( (lv_name_2_0= RULE_ID ) )? )
            {
            // InternalGuilang.g:632:2: ( () this_BUTTON_TYPE_1= RULE_BUTTON_TYPE ( (lv_name_2_0= RULE_ID ) )? )
            // InternalGuilang.g:633:3: () this_BUTTON_TYPE_1= RULE_BUTTON_TYPE ( (lv_name_2_0= RULE_ID ) )?
            {
            // InternalGuilang.g:633:3: ()
            // InternalGuilang.g:634:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getButtonAccess().getButtonAction_0(),
            					current);
            			

            }

            this_BUTTON_TYPE_1=(Token)match(input,RULE_BUTTON_TYPE,FOLLOW_9); 

            			newLeafNode(this_BUTTON_TYPE_1, grammarAccess.getButtonAccess().getBUTTON_TYPETerminalRuleCall_1());
            		
            // InternalGuilang.g:644:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGuilang.g:645:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalGuilang.g:645:4: (lv_name_2_0= RULE_ID )
                    // InternalGuilang.g:646:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getButtonRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleInput"
    // InternalGuilang.g:666:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalGuilang.g:666:46: (iv_ruleInput= ruleInput EOF )
            // InternalGuilang.g:667:2: iv_ruleInput= ruleInput EOF
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
    // InternalGuilang.g:673:1: ruleInput returns [EObject current=null] : ( () this_INPUT_TYPE_1= RULE_INPUT_TYPE ( (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token this_INPUT_TYPE_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalGuilang.g:679:2: ( ( () this_INPUT_TYPE_1= RULE_INPUT_TYPE ( (lv_name_2_0= RULE_ID ) )? ) )
            // InternalGuilang.g:680:2: ( () this_INPUT_TYPE_1= RULE_INPUT_TYPE ( (lv_name_2_0= RULE_ID ) )? )
            {
            // InternalGuilang.g:680:2: ( () this_INPUT_TYPE_1= RULE_INPUT_TYPE ( (lv_name_2_0= RULE_ID ) )? )
            // InternalGuilang.g:681:3: () this_INPUT_TYPE_1= RULE_INPUT_TYPE ( (lv_name_2_0= RULE_ID ) )?
            {
            // InternalGuilang.g:681:3: ()
            // InternalGuilang.g:682:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            this_INPUT_TYPE_1=(Token)match(input,RULE_INPUT_TYPE,FOLLOW_9); 

            			newLeafNode(this_INPUT_TYPE_1, grammarAccess.getInputAccess().getINPUT_TYPETerminalRuleCall_1());
            		
            // InternalGuilang.g:692:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGuilang.g:693:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalGuilang.g:693:4: (lv_name_2_0= RULE_ID )
                    // InternalGuilang.g:694:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getInputAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleCheckbox"
    // InternalGuilang.g:714:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // InternalGuilang.g:714:49: (iv_ruleCheckbox= ruleCheckbox EOF )
            // InternalGuilang.g:715:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox; 
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
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // InternalGuilang.g:721:1: ruleCheckbox returns [EObject current=null] : ( () this_CHECKBOX_TYPE_1= RULE_CHECKBOX_TYPE ( (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token this_CHECKBOX_TYPE_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalGuilang.g:727:2: ( ( () this_CHECKBOX_TYPE_1= RULE_CHECKBOX_TYPE ( (lv_name_2_0= RULE_ID ) )? ) )
            // InternalGuilang.g:728:2: ( () this_CHECKBOX_TYPE_1= RULE_CHECKBOX_TYPE ( (lv_name_2_0= RULE_ID ) )? )
            {
            // InternalGuilang.g:728:2: ( () this_CHECKBOX_TYPE_1= RULE_CHECKBOX_TYPE ( (lv_name_2_0= RULE_ID ) )? )
            // InternalGuilang.g:729:3: () this_CHECKBOX_TYPE_1= RULE_CHECKBOX_TYPE ( (lv_name_2_0= RULE_ID ) )?
            {
            // InternalGuilang.g:729:3: ()
            // InternalGuilang.g:730:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCheckboxAccess().getCheckboxAction_0(),
            					current);
            			

            }

            this_CHECKBOX_TYPE_1=(Token)match(input,RULE_CHECKBOX_TYPE,FOLLOW_9); 

            			newLeafNode(this_CHECKBOX_TYPE_1, grammarAccess.getCheckboxAccess().getCHECKBOX_TYPETerminalRuleCall_1());
            		
            // InternalGuilang.g:740:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGuilang.g:741:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalGuilang.g:741:4: (lv_name_2_0= RULE_ID )
                    // InternalGuilang.g:742:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getCheckboxAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCheckboxRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleSpecifications"
    // InternalGuilang.g:762:1: entryRuleSpecifications returns [EObject current=null] : iv_ruleSpecifications= ruleSpecifications EOF ;
    public final EObject entryRuleSpecifications() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecifications = null;


        try {
            // InternalGuilang.g:762:55: (iv_ruleSpecifications= ruleSpecifications EOF )
            // InternalGuilang.g:763:2: iv_ruleSpecifications= ruleSpecifications EOF
            {
             newCompositeNode(grammarAccess.getSpecificationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecifications=ruleSpecifications();

            state._fsp--;

             current =iv_ruleSpecifications; 
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
    // $ANTLR end "entryRuleSpecifications"


    // $ANTLR start "ruleSpecifications"
    // InternalGuilang.g:769:1: ruleSpecifications returns [EObject current=null] : ( () otherlv_1= 'elements' this_OPEN_2= RULE_OPEN ( (lv_specifications_3_0= ruleSpecification ) )* this_CLOSE_4= RULE_CLOSE ) ;
    public final EObject ruleSpecifications() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token this_CLOSE_4=null;
        EObject lv_specifications_3_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:775:2: ( ( () otherlv_1= 'elements' this_OPEN_2= RULE_OPEN ( (lv_specifications_3_0= ruleSpecification ) )* this_CLOSE_4= RULE_CLOSE ) )
            // InternalGuilang.g:776:2: ( () otherlv_1= 'elements' this_OPEN_2= RULE_OPEN ( (lv_specifications_3_0= ruleSpecification ) )* this_CLOSE_4= RULE_CLOSE )
            {
            // InternalGuilang.g:776:2: ( () otherlv_1= 'elements' this_OPEN_2= RULE_OPEN ( (lv_specifications_3_0= ruleSpecification ) )* this_CLOSE_4= RULE_CLOSE )
            // InternalGuilang.g:777:3: () otherlv_1= 'elements' this_OPEN_2= RULE_OPEN ( (lv_specifications_3_0= ruleSpecification ) )* this_CLOSE_4= RULE_CLOSE
            {
            // InternalGuilang.g:777:3: ()
            // InternalGuilang.g:778:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpecificationsAccess().getSpecificationsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSpecificationsAccess().getElementsKeyword_1());
            		
            this_OPEN_2=(Token)match(input,RULE_OPEN,FOLLOW_10); 

            			newLeafNode(this_OPEN_2, grammarAccess.getSpecificationsAccess().getOPENTerminalRuleCall_2());
            		
            // InternalGuilang.g:792:3: ( (lv_specifications_3_0= ruleSpecification ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGuilang.g:793:4: (lv_specifications_3_0= ruleSpecification )
            	    {
            	    // InternalGuilang.g:793:4: (lv_specifications_3_0= ruleSpecification )
            	    // InternalGuilang.g:794:5: lv_specifications_3_0= ruleSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getSpecificationsAccess().getSpecificationsSpecificationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_specifications_3_0=ruleSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecificationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"specifications",
            	    						lv_specifications_3_0,
            	    						"dk.sdu.mdsd.guilang.Guilang.Specification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            this_CLOSE_4=(Token)match(input,RULE_CLOSE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_4, grammarAccess.getSpecificationsAccess().getCLOSETerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleSpecifications"


    // $ANTLR start "entryRuleSpecification"
    // InternalGuilang.g:819:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalGuilang.g:819:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalGuilang.g:820:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalGuilang.g:826:1: ruleSpecification returns [EObject current=null] : ( ( (lv_type_0_1= ruleLayoutSpec | lv_type_0_2= ruleVerticalSpec | lv_type_0_3= ruleHorizontalSpec | lv_type_0_4= ruleLabelSpec | lv_type_0_5= ruleButtonSpec | lv_type_0_6= ruleInputSpec | lv_type_0_7= ruleCheckboxSpec ) ) ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_type_0_3 = null;

        EObject lv_type_0_4 = null;

        EObject lv_type_0_5 = null;

        EObject lv_type_0_6 = null;

        EObject lv_type_0_7 = null;



        	enterRule();

        try {
            // InternalGuilang.g:832:2: ( ( ( (lv_type_0_1= ruleLayoutSpec | lv_type_0_2= ruleVerticalSpec | lv_type_0_3= ruleHorizontalSpec | lv_type_0_4= ruleLabelSpec | lv_type_0_5= ruleButtonSpec | lv_type_0_6= ruleInputSpec | lv_type_0_7= ruleCheckboxSpec ) ) ) )
            // InternalGuilang.g:833:2: ( ( (lv_type_0_1= ruleLayoutSpec | lv_type_0_2= ruleVerticalSpec | lv_type_0_3= ruleHorizontalSpec | lv_type_0_4= ruleLabelSpec | lv_type_0_5= ruleButtonSpec | lv_type_0_6= ruleInputSpec | lv_type_0_7= ruleCheckboxSpec ) ) )
            {
            // InternalGuilang.g:833:2: ( ( (lv_type_0_1= ruleLayoutSpec | lv_type_0_2= ruleVerticalSpec | lv_type_0_3= ruleHorizontalSpec | lv_type_0_4= ruleLabelSpec | lv_type_0_5= ruleButtonSpec | lv_type_0_6= ruleInputSpec | lv_type_0_7= ruleCheckboxSpec ) ) )
            // InternalGuilang.g:834:3: ( (lv_type_0_1= ruleLayoutSpec | lv_type_0_2= ruleVerticalSpec | lv_type_0_3= ruleHorizontalSpec | lv_type_0_4= ruleLabelSpec | lv_type_0_5= ruleButtonSpec | lv_type_0_6= ruleInputSpec | lv_type_0_7= ruleCheckboxSpec ) )
            {
            // InternalGuilang.g:834:3: ( (lv_type_0_1= ruleLayoutSpec | lv_type_0_2= ruleVerticalSpec | lv_type_0_3= ruleHorizontalSpec | lv_type_0_4= ruleLabelSpec | lv_type_0_5= ruleButtonSpec | lv_type_0_6= ruleInputSpec | lv_type_0_7= ruleCheckboxSpec ) )
            // InternalGuilang.g:835:4: (lv_type_0_1= ruleLayoutSpec | lv_type_0_2= ruleVerticalSpec | lv_type_0_3= ruleHorizontalSpec | lv_type_0_4= ruleLabelSpec | lv_type_0_5= ruleButtonSpec | lv_type_0_6= ruleInputSpec | lv_type_0_7= ruleCheckboxSpec )
            {
            // InternalGuilang.g:835:4: (lv_type_0_1= ruleLayoutSpec | lv_type_0_2= ruleVerticalSpec | lv_type_0_3= ruleHorizontalSpec | lv_type_0_4= ruleLabelSpec | lv_type_0_5= ruleButtonSpec | lv_type_0_6= ruleInputSpec | lv_type_0_7= ruleCheckboxSpec )
            int alt18=7;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalGuilang.g:836:5: lv_type_0_1= ruleLayoutSpec
                    {

                    					newCompositeNode(grammarAccess.getSpecificationAccess().getTypeLayoutSpecParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_1=ruleLayoutSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_1,
                    						"dk.sdu.mdsd.guilang.Guilang.LayoutSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalGuilang.g:852:5: lv_type_0_2= ruleVerticalSpec
                    {

                    					newCompositeNode(grammarAccess.getSpecificationAccess().getTypeVerticalSpecParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_2=ruleVerticalSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_2,
                    						"dk.sdu.mdsd.guilang.Guilang.VerticalSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalGuilang.g:868:5: lv_type_0_3= ruleHorizontalSpec
                    {

                    					newCompositeNode(grammarAccess.getSpecificationAccess().getTypeHorizontalSpecParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_3=ruleHorizontalSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_3,
                    						"dk.sdu.mdsd.guilang.Guilang.HorizontalSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalGuilang.g:884:5: lv_type_0_4= ruleLabelSpec
                    {

                    					newCompositeNode(grammarAccess.getSpecificationAccess().getTypeLabelSpecParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_4=ruleLabelSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_4,
                    						"dk.sdu.mdsd.guilang.Guilang.LabelSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalGuilang.g:900:5: lv_type_0_5= ruleButtonSpec
                    {

                    					newCompositeNode(grammarAccess.getSpecificationAccess().getTypeButtonSpecParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_5=ruleButtonSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_5,
                    						"dk.sdu.mdsd.guilang.Guilang.ButtonSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 6 :
                    // InternalGuilang.g:916:5: lv_type_0_6= ruleInputSpec
                    {

                    					newCompositeNode(grammarAccess.getSpecificationAccess().getTypeInputSpecParserRuleCall_0_5());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_6=ruleInputSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_6,
                    						"dk.sdu.mdsd.guilang.Guilang.InputSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 7 :
                    // InternalGuilang.g:932:5: lv_type_0_7= ruleCheckboxSpec
                    {

                    					newCompositeNode(grammarAccess.getSpecificationAccess().getTypeCheckboxSpecParserRuleCall_0_6());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_7=ruleCheckboxSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_7,
                    						"dk.sdu.mdsd.guilang.Guilang.CheckboxSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleLayoutSpec"
    // InternalGuilang.g:953:1: entryRuleLayoutSpec returns [EObject current=null] : iv_ruleLayoutSpec= ruleLayoutSpec EOF ;
    public final EObject entryRuleLayoutSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutSpec = null;


        try {
            // InternalGuilang.g:953:51: (iv_ruleLayoutSpec= ruleLayoutSpec EOF )
            // InternalGuilang.g:954:2: iv_ruleLayoutSpec= ruleLayoutSpec EOF
            {
             newCompositeNode(grammarAccess.getLayoutSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutSpec=ruleLayoutSpec();

            state._fsp--;

             current =iv_ruleLayoutSpec; 
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
    // $ANTLR end "entryRuleLayoutSpec"


    // $ANTLR start "ruleLayoutSpec"
    // InternalGuilang.g:960:1: ruleLayoutSpec returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'layout-spec' this_CLOSE_3= RULE_CLOSE ) ;
    public final EObject ruleLayoutSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_OPEN_1=null;
        Token otherlv_2=null;
        Token this_CLOSE_3=null;


        	enterRule();

        try {
            // InternalGuilang.g:966:2: ( ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'layout-spec' this_CLOSE_3= RULE_CLOSE ) )
            // InternalGuilang.g:967:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'layout-spec' this_CLOSE_3= RULE_CLOSE )
            {
            // InternalGuilang.g:967:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'layout-spec' this_CLOSE_3= RULE_CLOSE )
            // InternalGuilang.g:968:3: ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'layout-spec' this_CLOSE_3= RULE_CLOSE
            {
            // InternalGuilang.g:968:3: ( (otherlv_0= RULE_ID ) )
            // InternalGuilang.g:969:4: (otherlv_0= RULE_ID )
            {
            // InternalGuilang.g:969:4: (otherlv_0= RULE_ID )
            // InternalGuilang.g:970:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLayoutSpecRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getLayoutSpecAccess().getRefLayoutCrossReference_0_0());
            				

            }


            }

            this_OPEN_1=(Token)match(input,RULE_OPEN,FOLLOW_11); 

            			newLeafNode(this_OPEN_1, grammarAccess.getLayoutSpecAccess().getOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLayoutSpecAccess().getLayoutSpecKeyword_2());
            		
            this_CLOSE_3=(Token)match(input,RULE_CLOSE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_3, grammarAccess.getLayoutSpecAccess().getCLOSETerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleLayoutSpec"


    // $ANTLR start "entryRuleVerticalSpec"
    // InternalGuilang.g:997:1: entryRuleVerticalSpec returns [EObject current=null] : iv_ruleVerticalSpec= ruleVerticalSpec EOF ;
    public final EObject entryRuleVerticalSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerticalSpec = null;


        try {
            // InternalGuilang.g:997:53: (iv_ruleVerticalSpec= ruleVerticalSpec EOF )
            // InternalGuilang.g:998:2: iv_ruleVerticalSpec= ruleVerticalSpec EOF
            {
             newCompositeNode(grammarAccess.getVerticalSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerticalSpec=ruleVerticalSpec();

            state._fsp--;

             current =iv_ruleVerticalSpec; 
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
    // $ANTLR end "entryRuleVerticalSpec"


    // $ANTLR start "ruleVerticalSpec"
    // InternalGuilang.g:1004:1: ruleVerticalSpec returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'vertical-spec' this_CLOSE_3= RULE_CLOSE ) ;
    public final EObject ruleVerticalSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_OPEN_1=null;
        Token otherlv_2=null;
        Token this_CLOSE_3=null;


        	enterRule();

        try {
            // InternalGuilang.g:1010:2: ( ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'vertical-spec' this_CLOSE_3= RULE_CLOSE ) )
            // InternalGuilang.g:1011:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'vertical-spec' this_CLOSE_3= RULE_CLOSE )
            {
            // InternalGuilang.g:1011:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'vertical-spec' this_CLOSE_3= RULE_CLOSE )
            // InternalGuilang.g:1012:3: ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'vertical-spec' this_CLOSE_3= RULE_CLOSE
            {
            // InternalGuilang.g:1012:3: ( (otherlv_0= RULE_ID ) )
            // InternalGuilang.g:1013:4: (otherlv_0= RULE_ID )
            {
            // InternalGuilang.g:1013:4: (otherlv_0= RULE_ID )
            // InternalGuilang.g:1014:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVerticalSpecRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getVerticalSpecAccess().getRefVerticalCrossReference_0_0());
            				

            }


            }

            this_OPEN_1=(Token)match(input,RULE_OPEN,FOLLOW_12); 

            			newLeafNode(this_OPEN_1, grammarAccess.getVerticalSpecAccess().getOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getVerticalSpecAccess().getVerticalSpecKeyword_2());
            		
            this_CLOSE_3=(Token)match(input,RULE_CLOSE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_3, grammarAccess.getVerticalSpecAccess().getCLOSETerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleVerticalSpec"


    // $ANTLR start "entryRuleHorizontalSpec"
    // InternalGuilang.g:1041:1: entryRuleHorizontalSpec returns [EObject current=null] : iv_ruleHorizontalSpec= ruleHorizontalSpec EOF ;
    public final EObject entryRuleHorizontalSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorizontalSpec = null;


        try {
            // InternalGuilang.g:1041:55: (iv_ruleHorizontalSpec= ruleHorizontalSpec EOF )
            // InternalGuilang.g:1042:2: iv_ruleHorizontalSpec= ruleHorizontalSpec EOF
            {
             newCompositeNode(grammarAccess.getHorizontalSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHorizontalSpec=ruleHorizontalSpec();

            state._fsp--;

             current =iv_ruleHorizontalSpec; 
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
    // $ANTLR end "entryRuleHorizontalSpec"


    // $ANTLR start "ruleHorizontalSpec"
    // InternalGuilang.g:1048:1: ruleHorizontalSpec returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'horizontal-spec' this_CLOSE_3= RULE_CLOSE ) ;
    public final EObject ruleHorizontalSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_OPEN_1=null;
        Token otherlv_2=null;
        Token this_CLOSE_3=null;


        	enterRule();

        try {
            // InternalGuilang.g:1054:2: ( ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'horizontal-spec' this_CLOSE_3= RULE_CLOSE ) )
            // InternalGuilang.g:1055:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'horizontal-spec' this_CLOSE_3= RULE_CLOSE )
            {
            // InternalGuilang.g:1055:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'horizontal-spec' this_CLOSE_3= RULE_CLOSE )
            // InternalGuilang.g:1056:3: ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'horizontal-spec' this_CLOSE_3= RULE_CLOSE
            {
            // InternalGuilang.g:1056:3: ( (otherlv_0= RULE_ID ) )
            // InternalGuilang.g:1057:4: (otherlv_0= RULE_ID )
            {
            // InternalGuilang.g:1057:4: (otherlv_0= RULE_ID )
            // InternalGuilang.g:1058:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHorizontalSpecRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getHorizontalSpecAccess().getRefHorizontalCrossReference_0_0());
            				

            }


            }

            this_OPEN_1=(Token)match(input,RULE_OPEN,FOLLOW_13); 

            			newLeafNode(this_OPEN_1, grammarAccess.getHorizontalSpecAccess().getOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getHorizontalSpecAccess().getHorizontalSpecKeyword_2());
            		
            this_CLOSE_3=(Token)match(input,RULE_CLOSE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_3, grammarAccess.getHorizontalSpecAccess().getCLOSETerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleHorizontalSpec"


    // $ANTLR start "entryRuleLabelSpec"
    // InternalGuilang.g:1085:1: entryRuleLabelSpec returns [EObject current=null] : iv_ruleLabelSpec= ruleLabelSpec EOF ;
    public final EObject entryRuleLabelSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelSpec = null;


        try {
            // InternalGuilang.g:1085:50: (iv_ruleLabelSpec= ruleLabelSpec EOF )
            // InternalGuilang.g:1086:2: iv_ruleLabelSpec= ruleLabelSpec EOF
            {
             newCompositeNode(grammarAccess.getLabelSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelSpec=ruleLabelSpec();

            state._fsp--;

             current =iv_ruleLabelSpec; 
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
    // $ANTLR end "entryRuleLabelSpec"


    // $ANTLR start "ruleLabelSpec"
    // InternalGuilang.g:1092:1: ruleLabelSpec returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'label-spec' this_CLOSE_3= RULE_CLOSE ) ;
    public final EObject ruleLabelSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_OPEN_1=null;
        Token otherlv_2=null;
        Token this_CLOSE_3=null;


        	enterRule();

        try {
            // InternalGuilang.g:1098:2: ( ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'label-spec' this_CLOSE_3= RULE_CLOSE ) )
            // InternalGuilang.g:1099:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'label-spec' this_CLOSE_3= RULE_CLOSE )
            {
            // InternalGuilang.g:1099:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'label-spec' this_CLOSE_3= RULE_CLOSE )
            // InternalGuilang.g:1100:3: ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'label-spec' this_CLOSE_3= RULE_CLOSE
            {
            // InternalGuilang.g:1100:3: ( (otherlv_0= RULE_ID ) )
            // InternalGuilang.g:1101:4: (otherlv_0= RULE_ID )
            {
            // InternalGuilang.g:1101:4: (otherlv_0= RULE_ID )
            // InternalGuilang.g:1102:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelSpecRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getLabelSpecAccess().getRefLabelCrossReference_0_0());
            				

            }


            }

            this_OPEN_1=(Token)match(input,RULE_OPEN,FOLLOW_14); 

            			newLeafNode(this_OPEN_1, grammarAccess.getLabelSpecAccess().getOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLabelSpecAccess().getLabelSpecKeyword_2());
            		
            this_CLOSE_3=(Token)match(input,RULE_CLOSE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_3, grammarAccess.getLabelSpecAccess().getCLOSETerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleLabelSpec"


    // $ANTLR start "entryRuleButtonSpec"
    // InternalGuilang.g:1129:1: entryRuleButtonSpec returns [EObject current=null] : iv_ruleButtonSpec= ruleButtonSpec EOF ;
    public final EObject entryRuleButtonSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonSpec = null;


        try {
            // InternalGuilang.g:1129:51: (iv_ruleButtonSpec= ruleButtonSpec EOF )
            // InternalGuilang.g:1130:2: iv_ruleButtonSpec= ruleButtonSpec EOF
            {
             newCompositeNode(grammarAccess.getButtonSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButtonSpec=ruleButtonSpec();

            state._fsp--;

             current =iv_ruleButtonSpec; 
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
    // $ANTLR end "entryRuleButtonSpec"


    // $ANTLR start "ruleButtonSpec"
    // InternalGuilang.g:1136:1: ruleButtonSpec returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'button-spec' ( (lv_options_3_0= ruleButtonSpecOptions ) )* this_CLOSE_4= RULE_CLOSE ) ;
    public final EObject ruleButtonSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_OPEN_1=null;
        Token otherlv_2=null;
        Token this_CLOSE_4=null;
        EObject lv_options_3_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:1142:2: ( ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'button-spec' ( (lv_options_3_0= ruleButtonSpecOptions ) )* this_CLOSE_4= RULE_CLOSE ) )
            // InternalGuilang.g:1143:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'button-spec' ( (lv_options_3_0= ruleButtonSpecOptions ) )* this_CLOSE_4= RULE_CLOSE )
            {
            // InternalGuilang.g:1143:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'button-spec' ( (lv_options_3_0= ruleButtonSpecOptions ) )* this_CLOSE_4= RULE_CLOSE )
            // InternalGuilang.g:1144:3: ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'button-spec' ( (lv_options_3_0= ruleButtonSpecOptions ) )* this_CLOSE_4= RULE_CLOSE
            {
            // InternalGuilang.g:1144:3: ( (otherlv_0= RULE_ID ) )
            // InternalGuilang.g:1145:4: (otherlv_0= RULE_ID )
            {
            // InternalGuilang.g:1145:4: (otherlv_0= RULE_ID )
            // InternalGuilang.g:1146:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonSpecRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getButtonSpecAccess().getRefButtonCrossReference_0_0());
            				

            }


            }

            this_OPEN_1=(Token)match(input,RULE_OPEN,FOLLOW_15); 

            			newLeafNode(this_OPEN_1, grammarAccess.getButtonSpecAccess().getOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getButtonSpecAccess().getButtonSpecKeyword_2());
            		
            // InternalGuilang.g:1165:3: ( (lv_options_3_0= ruleButtonSpecOptions ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGuilang.g:1166:4: (lv_options_3_0= ruleButtonSpecOptions )
            	    {
            	    // InternalGuilang.g:1166:4: (lv_options_3_0= ruleButtonSpecOptions )
            	    // InternalGuilang.g:1167:5: lv_options_3_0= ruleButtonSpecOptions
            	    {

            	    					newCompositeNode(grammarAccess.getButtonSpecAccess().getOptionsButtonSpecOptionsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_options_3_0=ruleButtonSpecOptions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getButtonSpecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"options",
            	    						lv_options_3_0,
            	    						"dk.sdu.mdsd.guilang.Guilang.ButtonSpecOptions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            this_CLOSE_4=(Token)match(input,RULE_CLOSE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_4, grammarAccess.getButtonSpecAccess().getCLOSETerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleButtonSpec"


    // $ANTLR start "entryRuleButtonSpecOptions"
    // InternalGuilang.g:1192:1: entryRuleButtonSpecOptions returns [EObject current=null] : iv_ruleButtonSpecOptions= ruleButtonSpecOptions EOF ;
    public final EObject entryRuleButtonSpecOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonSpecOptions = null;


        try {
            // InternalGuilang.g:1192:58: (iv_ruleButtonSpecOptions= ruleButtonSpecOptions EOF )
            // InternalGuilang.g:1193:2: iv_ruleButtonSpecOptions= ruleButtonSpecOptions EOF
            {
             newCompositeNode(grammarAccess.getButtonSpecOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButtonSpecOptions=ruleButtonSpecOptions();

            state._fsp--;

             current =iv_ruleButtonSpecOptions; 
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
    // $ANTLR end "entryRuleButtonSpecOptions"


    // $ANTLR start "ruleButtonSpecOptions"
    // InternalGuilang.g:1199:1: ruleButtonSpecOptions returns [EObject current=null] : this_RequireElements_0= ruleRequireElements ;
    public final EObject ruleButtonSpecOptions() throws RecognitionException {
        EObject current = null;

        EObject this_RequireElements_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:1205:2: (this_RequireElements_0= ruleRequireElements )
            // InternalGuilang.g:1206:2: this_RequireElements_0= ruleRequireElements
            {

            		newCompositeNode(grammarAccess.getButtonSpecOptionsAccess().getRequireElementsParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_RequireElements_0=ruleRequireElements();

            state._fsp--;


            		current = this_RequireElements_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleButtonSpecOptions"


    // $ANTLR start "entryRuleInputSpec"
    // InternalGuilang.g:1217:1: entryRuleInputSpec returns [EObject current=null] : iv_ruleInputSpec= ruleInputSpec EOF ;
    public final EObject entryRuleInputSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputSpec = null;


        try {
            // InternalGuilang.g:1217:50: (iv_ruleInputSpec= ruleInputSpec EOF )
            // InternalGuilang.g:1218:2: iv_ruleInputSpec= ruleInputSpec EOF
            {
             newCompositeNode(grammarAccess.getInputSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputSpec=ruleInputSpec();

            state._fsp--;

             current =iv_ruleInputSpec; 
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
    // $ANTLR end "entryRuleInputSpec"


    // $ANTLR start "ruleInputSpec"
    // InternalGuilang.g:1224:1: ruleInputSpec returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'input-spec' ( (lv_options_3_0= ruleInputSpecOptions ) )* this_CLOSE_4= RULE_CLOSE ) ;
    public final EObject ruleInputSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_OPEN_1=null;
        Token otherlv_2=null;
        Token this_CLOSE_4=null;
        EObject lv_options_3_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:1230:2: ( ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'input-spec' ( (lv_options_3_0= ruleInputSpecOptions ) )* this_CLOSE_4= RULE_CLOSE ) )
            // InternalGuilang.g:1231:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'input-spec' ( (lv_options_3_0= ruleInputSpecOptions ) )* this_CLOSE_4= RULE_CLOSE )
            {
            // InternalGuilang.g:1231:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'input-spec' ( (lv_options_3_0= ruleInputSpecOptions ) )* this_CLOSE_4= RULE_CLOSE )
            // InternalGuilang.g:1232:3: ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'input-spec' ( (lv_options_3_0= ruleInputSpecOptions ) )* this_CLOSE_4= RULE_CLOSE
            {
            // InternalGuilang.g:1232:3: ( (otherlv_0= RULE_ID ) )
            // InternalGuilang.g:1233:4: (otherlv_0= RULE_ID )
            {
            // InternalGuilang.g:1233:4: (otherlv_0= RULE_ID )
            // InternalGuilang.g:1234:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputSpecRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getInputSpecAccess().getRefInputCrossReference_0_0());
            				

            }


            }

            this_OPEN_1=(Token)match(input,RULE_OPEN,FOLLOW_17); 

            			newLeafNode(this_OPEN_1, grammarAccess.getInputSpecAccess().getOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getInputSpecAccess().getInputSpecKeyword_2());
            		
            // InternalGuilang.g:1253:3: ( (lv_options_3_0= ruleInputSpecOptions ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31||LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGuilang.g:1254:4: (lv_options_3_0= ruleInputSpecOptions )
            	    {
            	    // InternalGuilang.g:1254:4: (lv_options_3_0= ruleInputSpecOptions )
            	    // InternalGuilang.g:1255:5: lv_options_3_0= ruleInputSpecOptions
            	    {

            	    					newCompositeNode(grammarAccess.getInputSpecAccess().getOptionsInputSpecOptionsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_options_3_0=ruleInputSpecOptions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInputSpecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"options",
            	    						lv_options_3_0,
            	    						"dk.sdu.mdsd.guilang.Guilang.InputSpecOptions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            this_CLOSE_4=(Token)match(input,RULE_CLOSE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_4, grammarAccess.getInputSpecAccess().getCLOSETerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleInputSpec"


    // $ANTLR start "entryRuleInputSpecOptions"
    // InternalGuilang.g:1280:1: entryRuleInputSpecOptions returns [EObject current=null] : iv_ruleInputSpecOptions= ruleInputSpecOptions EOF ;
    public final EObject entryRuleInputSpecOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputSpecOptions = null;


        try {
            // InternalGuilang.g:1280:57: (iv_ruleInputSpecOptions= ruleInputSpecOptions EOF )
            // InternalGuilang.g:1281:2: iv_ruleInputSpecOptions= ruleInputSpecOptions EOF
            {
             newCompositeNode(grammarAccess.getInputSpecOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputSpecOptions=ruleInputSpecOptions();

            state._fsp--;

             current =iv_ruleInputSpecOptions; 
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
    // $ANTLR end "entryRuleInputSpecOptions"


    // $ANTLR start "ruleInputSpecOptions"
    // InternalGuilang.g:1287:1: ruleInputSpecOptions returns [EObject current=null] : (this_TextValidate_0= ruleTextValidate | this_RequireElements_1= ruleRequireElements ) ;
    public final EObject ruleInputSpecOptions() throws RecognitionException {
        EObject current = null;

        EObject this_TextValidate_0 = null;

        EObject this_RequireElements_1 = null;



        	enterRule();

        try {
            // InternalGuilang.g:1293:2: ( (this_TextValidate_0= ruleTextValidate | this_RequireElements_1= ruleRequireElements ) )
            // InternalGuilang.g:1294:2: (this_TextValidate_0= ruleTextValidate | this_RequireElements_1= ruleRequireElements )
            {
            // InternalGuilang.g:1294:2: (this_TextValidate_0= ruleTextValidate | this_RequireElements_1= ruleRequireElements )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            else if ( (LA21_0==38) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGuilang.g:1295:3: this_TextValidate_0= ruleTextValidate
                    {

                    			newCompositeNode(grammarAccess.getInputSpecOptionsAccess().getTextValidateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextValidate_0=ruleTextValidate();

                    state._fsp--;


                    			current = this_TextValidate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1304:3: this_RequireElements_1= ruleRequireElements
                    {

                    			newCompositeNode(grammarAccess.getInputSpecOptionsAccess().getRequireElementsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequireElements_1=ruleRequireElements();

                    state._fsp--;


                    			current = this_RequireElements_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleInputSpecOptions"


    // $ANTLR start "entryRuleCheckboxSpec"
    // InternalGuilang.g:1316:1: entryRuleCheckboxSpec returns [EObject current=null] : iv_ruleCheckboxSpec= ruleCheckboxSpec EOF ;
    public final EObject entryRuleCheckboxSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckboxSpec = null;


        try {
            // InternalGuilang.g:1316:53: (iv_ruleCheckboxSpec= ruleCheckboxSpec EOF )
            // InternalGuilang.g:1317:2: iv_ruleCheckboxSpec= ruleCheckboxSpec EOF
            {
             newCompositeNode(grammarAccess.getCheckboxSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckboxSpec=ruleCheckboxSpec();

            state._fsp--;

             current =iv_ruleCheckboxSpec; 
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
    // $ANTLR end "entryRuleCheckboxSpec"


    // $ANTLR start "ruleCheckboxSpec"
    // InternalGuilang.g:1323:1: ruleCheckboxSpec returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'checkbox-spec' this_CLOSE_3= RULE_CLOSE ) ;
    public final EObject ruleCheckboxSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_OPEN_1=null;
        Token otherlv_2=null;
        Token this_CLOSE_3=null;


        	enterRule();

        try {
            // InternalGuilang.g:1329:2: ( ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'checkbox-spec' this_CLOSE_3= RULE_CLOSE ) )
            // InternalGuilang.g:1330:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'checkbox-spec' this_CLOSE_3= RULE_CLOSE )
            {
            // InternalGuilang.g:1330:2: ( ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'checkbox-spec' this_CLOSE_3= RULE_CLOSE )
            // InternalGuilang.g:1331:3: ( (otherlv_0= RULE_ID ) ) this_OPEN_1= RULE_OPEN otherlv_2= 'checkbox-spec' this_CLOSE_3= RULE_CLOSE
            {
            // InternalGuilang.g:1331:3: ( (otherlv_0= RULE_ID ) )
            // InternalGuilang.g:1332:4: (otherlv_0= RULE_ID )
            {
            // InternalGuilang.g:1332:4: (otherlv_0= RULE_ID )
            // InternalGuilang.g:1333:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckboxSpecRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getCheckboxSpecAccess().getRefCheckboxCrossReference_0_0());
            				

            }


            }

            this_OPEN_1=(Token)match(input,RULE_OPEN,FOLLOW_19); 

            			newLeafNode(this_OPEN_1, grammarAccess.getCheckboxSpecAccess().getOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckboxSpecAccess().getCheckboxSpecKeyword_2());
            		
            this_CLOSE_3=(Token)match(input,RULE_CLOSE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_3, grammarAccess.getCheckboxSpecAccess().getCLOSETerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleCheckboxSpec"


    // $ANTLR start "entryRuleTextValidate"
    // InternalGuilang.g:1360:1: entryRuleTextValidate returns [EObject current=null] : iv_ruleTextValidate= ruleTextValidate EOF ;
    public final EObject entryRuleTextValidate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValidate = null;


        try {
            // InternalGuilang.g:1360:53: (iv_ruleTextValidate= ruleTextValidate EOF )
            // InternalGuilang.g:1361:2: iv_ruleTextValidate= ruleTextValidate EOF
            {
             newCompositeNode(grammarAccess.getTextValidateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextValidate=ruleTextValidate();

            state._fsp--;

             current =iv_ruleTextValidate; 
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
    // $ANTLR end "entryRuleTextValidate"


    // $ANTLR start "ruleTextValidate"
    // InternalGuilang.g:1367:1: ruleTextValidate returns [EObject current=null] : (otherlv_0= 'validate' ( ( (lv_validation_1_1= ruleRegexValidate | lv_validation_1_2= ruleRegexVariableRef | lv_validation_1_3= rulePresetTextValidate ) ) ) ) ;
    public final EObject ruleTextValidate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_validation_1_1 = null;

        EObject lv_validation_1_2 = null;

        EObject lv_validation_1_3 = null;



        	enterRule();

        try {
            // InternalGuilang.g:1373:2: ( (otherlv_0= 'validate' ( ( (lv_validation_1_1= ruleRegexValidate | lv_validation_1_2= ruleRegexVariableRef | lv_validation_1_3= rulePresetTextValidate ) ) ) ) )
            // InternalGuilang.g:1374:2: (otherlv_0= 'validate' ( ( (lv_validation_1_1= ruleRegexValidate | lv_validation_1_2= ruleRegexVariableRef | lv_validation_1_3= rulePresetTextValidate ) ) ) )
            {
            // InternalGuilang.g:1374:2: (otherlv_0= 'validate' ( ( (lv_validation_1_1= ruleRegexValidate | lv_validation_1_2= ruleRegexVariableRef | lv_validation_1_3= rulePresetTextValidate ) ) ) )
            // InternalGuilang.g:1375:3: otherlv_0= 'validate' ( ( (lv_validation_1_1= ruleRegexValidate | lv_validation_1_2= ruleRegexVariableRef | lv_validation_1_3= rulePresetTextValidate ) ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getTextValidateAccess().getValidateKeyword_0());
            		
            // InternalGuilang.g:1379:3: ( ( (lv_validation_1_1= ruleRegexValidate | lv_validation_1_2= ruleRegexVariableRef | lv_validation_1_3= rulePresetTextValidate ) ) )
            // InternalGuilang.g:1380:4: ( (lv_validation_1_1= ruleRegexValidate | lv_validation_1_2= ruleRegexVariableRef | lv_validation_1_3= rulePresetTextValidate ) )
            {
            // InternalGuilang.g:1380:4: ( (lv_validation_1_1= ruleRegexValidate | lv_validation_1_2= ruleRegexVariableRef | lv_validation_1_3= rulePresetTextValidate ) )
            // InternalGuilang.g:1381:5: (lv_validation_1_1= ruleRegexValidate | lv_validation_1_2= ruleRegexVariableRef | lv_validation_1_3= rulePresetTextValidate )
            {
            // InternalGuilang.g:1381:5: (lv_validation_1_1= ruleRegexValidate | lv_validation_1_2= ruleRegexVariableRef | lv_validation_1_3= rulePresetTextValidate )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt22=1;
                }
                break;
            case RULE_ID:
                {
                alt22=2;
                }
                break;
            case 34:
            case 35:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGuilang.g:1382:6: lv_validation_1_1= ruleRegexValidate
                    {

                    						newCompositeNode(grammarAccess.getTextValidateAccess().getValidationRegexValidateParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_validation_1_1=ruleRegexValidate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextValidateRule());
                    						}
                    						set(
                    							current,
                    							"validation",
                    							lv_validation_1_1,
                    							"dk.sdu.mdsd.guilang.Guilang.RegexValidate");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1398:6: lv_validation_1_2= ruleRegexVariableRef
                    {

                    						newCompositeNode(grammarAccess.getTextValidateAccess().getValidationRegexVariableRefParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_validation_1_2=ruleRegexVariableRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextValidateRule());
                    						}
                    						set(
                    							current,
                    							"validation",
                    							lv_validation_1_2,
                    							"dk.sdu.mdsd.guilang.Guilang.RegexVariableRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalGuilang.g:1414:6: lv_validation_1_3= rulePresetTextValidate
                    {

                    						newCompositeNode(grammarAccess.getTextValidateAccess().getValidationPresetTextValidateParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_validation_1_3=rulePresetTextValidate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextValidateRule());
                    						}
                    						set(
                    							current,
                    							"validation",
                    							lv_validation_1_3,
                    							"dk.sdu.mdsd.guilang.Guilang.PresetTextValidate");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

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
    // $ANTLR end "ruleTextValidate"


    // $ANTLR start "entryRuleRegexValidate"
    // InternalGuilang.g:1436:1: entryRuleRegexValidate returns [EObject current=null] : iv_ruleRegexValidate= ruleRegexValidate EOF ;
    public final EObject entryRuleRegexValidate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexValidate = null;


        try {
            // InternalGuilang.g:1436:54: (iv_ruleRegexValidate= ruleRegexValidate EOF )
            // InternalGuilang.g:1437:2: iv_ruleRegexValidate= ruleRegexValidate EOF
            {
             newCompositeNode(grammarAccess.getRegexValidateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegexValidate=ruleRegexValidate();

            state._fsp--;

             current =iv_ruleRegexValidate; 
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
    // $ANTLR end "entryRuleRegexValidate"


    // $ANTLR start "ruleRegexValidate"
    // InternalGuilang.g:1443:1: ruleRegexValidate returns [EObject current=null] : (otherlv_0= 'regex' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleRegexValidate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalGuilang.g:1449:2: ( (otherlv_0= 'regex' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalGuilang.g:1450:2: (otherlv_0= 'regex' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalGuilang.g:1450:2: (otherlv_0= 'regex' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalGuilang.g:1451:3: otherlv_0= 'regex' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getRegexValidateAccess().getRegexKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getRegexValidateAccess().getEqualsSignKeyword_1());
            		
            // InternalGuilang.g:1459:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalGuilang.g:1460:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalGuilang.g:1460:4: (lv_value_2_0= RULE_STRING )
            // InternalGuilang.g:1461:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getRegexValidateAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegexValidateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleRegexValidate"


    // $ANTLR start "entryRuleRegexVariableRef"
    // InternalGuilang.g:1481:1: entryRuleRegexVariableRef returns [EObject current=null] : iv_ruleRegexVariableRef= ruleRegexVariableRef EOF ;
    public final EObject entryRuleRegexVariableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexVariableRef = null;


        try {
            // InternalGuilang.g:1481:57: (iv_ruleRegexVariableRef= ruleRegexVariableRef EOF )
            // InternalGuilang.g:1482:2: iv_ruleRegexVariableRef= ruleRegexVariableRef EOF
            {
             newCompositeNode(grammarAccess.getRegexVariableRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegexVariableRef=ruleRegexVariableRef();

            state._fsp--;

             current =iv_ruleRegexVariableRef; 
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
    // $ANTLR end "entryRuleRegexVariableRef"


    // $ANTLR start "ruleRegexVariableRef"
    // InternalGuilang.g:1488:1: ruleRegexVariableRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRegexVariableRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalGuilang.g:1494:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalGuilang.g:1495:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalGuilang.g:1495:2: ( (otherlv_0= RULE_ID ) )
            // InternalGuilang.g:1496:3: (otherlv_0= RULE_ID )
            {
            // InternalGuilang.g:1496:3: (otherlv_0= RULE_ID )
            // InternalGuilang.g:1497:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRegexVariableRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRegexVariableRefAccess().getRefRegexVariableValidateCrossReference_0());
            			

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
    // $ANTLR end "ruleRegexVariableRef"


    // $ANTLR start "entryRulePresetTextValidate"
    // InternalGuilang.g:1511:1: entryRulePresetTextValidate returns [EObject current=null] : iv_rulePresetTextValidate= rulePresetTextValidate EOF ;
    public final EObject entryRulePresetTextValidate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresetTextValidate = null;


        try {
            // InternalGuilang.g:1511:59: (iv_rulePresetTextValidate= rulePresetTextValidate EOF )
            // InternalGuilang.g:1512:2: iv_rulePresetTextValidate= rulePresetTextValidate EOF
            {
             newCompositeNode(grammarAccess.getPresetTextValidateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresetTextValidate=rulePresetTextValidate();

            state._fsp--;

             current =iv_rulePresetTextValidate; 
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
    // $ANTLR end "entryRulePresetTextValidate"


    // $ANTLR start "rulePresetTextValidate"
    // InternalGuilang.g:1518:1: rulePresetTextValidate returns [EObject current=null] : ( ( (lv_value_0_0= 'val-password' ) ) | ( (lv_value_1_0= 'val-email' ) ) ) ;
    public final EObject rulePresetTextValidate() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalGuilang.g:1524:2: ( ( ( (lv_value_0_0= 'val-password' ) ) | ( (lv_value_1_0= 'val-email' ) ) ) )
            // InternalGuilang.g:1525:2: ( ( (lv_value_0_0= 'val-password' ) ) | ( (lv_value_1_0= 'val-email' ) ) )
            {
            // InternalGuilang.g:1525:2: ( ( (lv_value_0_0= 'val-password' ) ) | ( (lv_value_1_0= 'val-email' ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            else if ( (LA23_0==35) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalGuilang.g:1526:3: ( (lv_value_0_0= 'val-password' ) )
                    {
                    // InternalGuilang.g:1526:3: ( (lv_value_0_0= 'val-password' ) )
                    // InternalGuilang.g:1527:4: (lv_value_0_0= 'val-password' )
                    {
                    // InternalGuilang.g:1527:4: (lv_value_0_0= 'val-password' )
                    // InternalGuilang.g:1528:5: lv_value_0_0= 'val-password'
                    {
                    lv_value_0_0=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getPresetTextValidateAccess().getValueValPasswordKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPresetTextValidateRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_0, "val-password");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1541:3: ( (lv_value_1_0= 'val-email' ) )
                    {
                    // InternalGuilang.g:1541:3: ( (lv_value_1_0= 'val-email' ) )
                    // InternalGuilang.g:1542:4: (lv_value_1_0= 'val-email' )
                    {
                    // InternalGuilang.g:1542:4: (lv_value_1_0= 'val-email' )
                    // InternalGuilang.g:1543:5: lv_value_1_0= 'val-email'
                    {
                    lv_value_1_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getPresetTextValidateAccess().getValueValEmailKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPresetTextValidateRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_1_0, "val-email");
                    				

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
    // $ANTLR end "rulePresetTextValidate"


    // $ANTLR start "entryRuleCheckboxValidate"
    // InternalGuilang.g:1559:1: entryRuleCheckboxValidate returns [EObject current=null] : iv_ruleCheckboxValidate= ruleCheckboxValidate EOF ;
    public final EObject entryRuleCheckboxValidate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckboxValidate = null;


        try {
            // InternalGuilang.g:1559:57: (iv_ruleCheckboxValidate= ruleCheckboxValidate EOF )
            // InternalGuilang.g:1560:2: iv_ruleCheckboxValidate= ruleCheckboxValidate EOF
            {
             newCompositeNode(grammarAccess.getCheckboxValidateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckboxValidate=ruleCheckboxValidate();

            state._fsp--;

             current =iv_ruleCheckboxValidate; 
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
    // $ANTLR end "entryRuleCheckboxValidate"


    // $ANTLR start "ruleCheckboxValidate"
    // InternalGuilang.g:1566:1: ruleCheckboxValidate returns [EObject current=null] : ( ( (lv_value_0_1= 'is-checked' | lv_value_0_2= 'is-unchecked' ) ) ) ;
    public final EObject ruleCheckboxValidate() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalGuilang.g:1572:2: ( ( ( (lv_value_0_1= 'is-checked' | lv_value_0_2= 'is-unchecked' ) ) ) )
            // InternalGuilang.g:1573:2: ( ( (lv_value_0_1= 'is-checked' | lv_value_0_2= 'is-unchecked' ) ) )
            {
            // InternalGuilang.g:1573:2: ( ( (lv_value_0_1= 'is-checked' | lv_value_0_2= 'is-unchecked' ) ) )
            // InternalGuilang.g:1574:3: ( (lv_value_0_1= 'is-checked' | lv_value_0_2= 'is-unchecked' ) )
            {
            // InternalGuilang.g:1574:3: ( (lv_value_0_1= 'is-checked' | lv_value_0_2= 'is-unchecked' ) )
            // InternalGuilang.g:1575:4: (lv_value_0_1= 'is-checked' | lv_value_0_2= 'is-unchecked' )
            {
            // InternalGuilang.g:1575:4: (lv_value_0_1= 'is-checked' | lv_value_0_2= 'is-unchecked' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            else if ( (LA24_0==37) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalGuilang.g:1576:5: lv_value_0_1= 'is-checked'
                    {
                    lv_value_0_1=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getCheckboxValidateAccess().getValueIsCheckedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCheckboxValidateRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1587:5: lv_value_0_2= 'is-unchecked'
                    {
                    lv_value_0_2=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getCheckboxValidateAccess().getValueIsUncheckedKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCheckboxValidateRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleCheckboxValidate"


    // $ANTLR start "entryRuleRequireElements"
    // InternalGuilang.g:1603:1: entryRuleRequireElements returns [EObject current=null] : iv_ruleRequireElements= ruleRequireElements EOF ;
    public final EObject entryRuleRequireElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequireElements = null;


        try {
            // InternalGuilang.g:1603:56: (iv_ruleRequireElements= ruleRequireElements EOF )
            // InternalGuilang.g:1604:2: iv_ruleRequireElements= ruleRequireElements EOF
            {
             newCompositeNode(grammarAccess.getRequireElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequireElements=ruleRequireElements();

            state._fsp--;

             current =iv_ruleRequireElements; 
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
    // $ANTLR end "entryRuleRequireElements"


    // $ANTLR start "ruleRequireElements"
    // InternalGuilang.g:1610:1: ruleRequireElements returns [EObject current=null] : (otherlv_0= 'require' ( (lv_elements_1_0= ruleRequire ) ) ) ;
    public final EObject ruleRequireElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:1616:2: ( (otherlv_0= 'require' ( (lv_elements_1_0= ruleRequire ) ) ) )
            // InternalGuilang.g:1617:2: (otherlv_0= 'require' ( (lv_elements_1_0= ruleRequire ) ) )
            {
            // InternalGuilang.g:1617:2: (otherlv_0= 'require' ( (lv_elements_1_0= ruleRequire ) ) )
            // InternalGuilang.g:1618:3: otherlv_0= 'require' ( (lv_elements_1_0= ruleRequire ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getRequireElementsAccess().getRequireKeyword_0());
            		
            // InternalGuilang.g:1622:3: ( (lv_elements_1_0= ruleRequire ) )
            // InternalGuilang.g:1623:4: (lv_elements_1_0= ruleRequire )
            {
            // InternalGuilang.g:1623:4: (lv_elements_1_0= ruleRequire )
            // InternalGuilang.g:1624:5: lv_elements_1_0= ruleRequire
            {

            					newCompositeNode(grammarAccess.getRequireElementsAccess().getElementsRequireParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleRequire();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequireElementsRule());
            					}
            					set(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"dk.sdu.mdsd.guilang.Guilang.Require");
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
    // $ANTLR end "ruleRequireElements"


    // $ANTLR start "entryRuleRequire"
    // InternalGuilang.g:1645:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalGuilang.g:1645:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalGuilang.g:1646:2: iv_ruleRequire= ruleRequire EOF
            {
             newCompositeNode(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequire=ruleRequire();

            state._fsp--;

             current =iv_ruleRequire; 
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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalGuilang.g:1652:1: ruleRequire returns [EObject current=null] : this_RequireOr_0= ruleRequireOr ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        EObject this_RequireOr_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:1658:2: (this_RequireOr_0= ruleRequireOr )
            // InternalGuilang.g:1659:2: this_RequireOr_0= ruleRequireOr
            {

            		newCompositeNode(grammarAccess.getRequireAccess().getRequireOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_RequireOr_0=ruleRequireOr();

            state._fsp--;


            		current = this_RequireOr_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleRequireOr"
    // InternalGuilang.g:1670:1: entryRuleRequireOr returns [EObject current=null] : iv_ruleRequireOr= ruleRequireOr EOF ;
    public final EObject entryRuleRequireOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequireOr = null;


        try {
            // InternalGuilang.g:1670:50: (iv_ruleRequireOr= ruleRequireOr EOF )
            // InternalGuilang.g:1671:2: iv_ruleRequireOr= ruleRequireOr EOF
            {
             newCompositeNode(grammarAccess.getRequireOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequireOr=ruleRequireOr();

            state._fsp--;

             current =iv_ruleRequireOr; 
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
    // $ANTLR end "entryRuleRequireOr"


    // $ANTLR start "ruleRequireOr"
    // InternalGuilang.g:1677:1: ruleRequireOr returns [EObject current=null] : (this_RequireAnd_0= ruleRequireAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleRequireAnd ) ) )* ) ;
    public final EObject ruleRequireOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_RequireAnd_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:1683:2: ( (this_RequireAnd_0= ruleRequireAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleRequireAnd ) ) )* ) )
            // InternalGuilang.g:1684:2: (this_RequireAnd_0= ruleRequireAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleRequireAnd ) ) )* )
            {
            // InternalGuilang.g:1684:2: (this_RequireAnd_0= ruleRequireAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleRequireAnd ) ) )* )
            // InternalGuilang.g:1685:3: this_RequireAnd_0= ruleRequireAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleRequireAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getRequireOrAccess().getRequireAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_RequireAnd_0=ruleRequireAnd();

            state._fsp--;


            			current = this_RequireAnd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGuilang.g:1693:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleRequireAnd ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==39) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGuilang.g:1694:4: () otherlv_2= '||' ( (lv_right_3_0= ruleRequireAnd ) )
            	    {
            	    // InternalGuilang.g:1694:4: ()
            	    // InternalGuilang.g:1695:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRequireOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRequireOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalGuilang.g:1705:4: ( (lv_right_3_0= ruleRequireAnd ) )
            	    // InternalGuilang.g:1706:5: (lv_right_3_0= ruleRequireAnd )
            	    {
            	    // InternalGuilang.g:1706:5: (lv_right_3_0= ruleRequireAnd )
            	    // InternalGuilang.g:1707:6: lv_right_3_0= ruleRequireAnd
            	    {

            	    						newCompositeNode(grammarAccess.getRequireOrAccess().getRightRequireAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleRequireAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRequireOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mdsd.guilang.Guilang.RequireAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
    // $ANTLR end "ruleRequireOr"


    // $ANTLR start "entryRuleRequireAnd"
    // InternalGuilang.g:1729:1: entryRuleRequireAnd returns [EObject current=null] : iv_ruleRequireAnd= ruleRequireAnd EOF ;
    public final EObject entryRuleRequireAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequireAnd = null;


        try {
            // InternalGuilang.g:1729:51: (iv_ruleRequireAnd= ruleRequireAnd EOF )
            // InternalGuilang.g:1730:2: iv_ruleRequireAnd= ruleRequireAnd EOF
            {
             newCompositeNode(grammarAccess.getRequireAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequireAnd=ruleRequireAnd();

            state._fsp--;

             current =iv_ruleRequireAnd; 
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
    // $ANTLR end "entryRuleRequireAnd"


    // $ANTLR start "ruleRequireAnd"
    // InternalGuilang.g:1736:1: ruleRequireAnd returns [EObject current=null] : (this_RequireBase_0= ruleRequireBase ( () otherlv_2= '&&' ( (lv_right_3_0= ruleRequireBase ) ) )* ) ;
    public final EObject ruleRequireAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_RequireBase_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:1742:2: ( (this_RequireBase_0= ruleRequireBase ( () otherlv_2= '&&' ( (lv_right_3_0= ruleRequireBase ) ) )* ) )
            // InternalGuilang.g:1743:2: (this_RequireBase_0= ruleRequireBase ( () otherlv_2= '&&' ( (lv_right_3_0= ruleRequireBase ) ) )* )
            {
            // InternalGuilang.g:1743:2: (this_RequireBase_0= ruleRequireBase ( () otherlv_2= '&&' ( (lv_right_3_0= ruleRequireBase ) ) )* )
            // InternalGuilang.g:1744:3: this_RequireBase_0= ruleRequireBase ( () otherlv_2= '&&' ( (lv_right_3_0= ruleRequireBase ) ) )*
            {

            			newCompositeNode(grammarAccess.getRequireAndAccess().getRequireBaseParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_RequireBase_0=ruleRequireBase();

            state._fsp--;


            			current = this_RequireBase_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGuilang.g:1752:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleRequireBase ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==40) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGuilang.g:1753:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleRequireBase ) )
            	    {
            	    // InternalGuilang.g:1753:4: ()
            	    // InternalGuilang.g:1754:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRequireAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRequireAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalGuilang.g:1764:4: ( (lv_right_3_0= ruleRequireBase ) )
            	    // InternalGuilang.g:1765:5: (lv_right_3_0= ruleRequireBase )
            	    {
            	    // InternalGuilang.g:1765:5: (lv_right_3_0= ruleRequireBase )
            	    // InternalGuilang.g:1766:6: lv_right_3_0= ruleRequireBase
            	    {

            	    						newCompositeNode(grammarAccess.getRequireAndAccess().getRightRequireBaseParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleRequireBase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRequireAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mdsd.guilang.Guilang.RequireBase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


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
    // $ANTLR end "ruleRequireAnd"


    // $ANTLR start "entryRuleRequireBase"
    // InternalGuilang.g:1788:1: entryRuleRequireBase returns [EObject current=null] : iv_ruleRequireBase= ruleRequireBase EOF ;
    public final EObject entryRuleRequireBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequireBase = null;


        try {
            // InternalGuilang.g:1788:52: (iv_ruleRequireBase= ruleRequireBase EOF )
            // InternalGuilang.g:1789:2: iv_ruleRequireBase= ruleRequireBase EOF
            {
             newCompositeNode(grammarAccess.getRequireBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequireBase=ruleRequireBase();

            state._fsp--;

             current =iv_ruleRequireBase; 
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
    // $ANTLR end "entryRuleRequireBase"


    // $ANTLR start "ruleRequireBase"
    // InternalGuilang.g:1795:1: ruleRequireBase returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_exp_1_0= ruleRequire ) ) otherlv_2= ')' ) | ( () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_exp_6_0= ruleRequireBase ) ) ) | ( () ( (otherlv_8= RULE_ID ) ) ) ) ;
    public final EObject ruleRequireBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_exp_1_0 = null;

        EObject lv_exp_6_0 = null;



        	enterRule();

        try {
            // InternalGuilang.g:1801:2: ( ( (otherlv_0= '(' ( (lv_exp_1_0= ruleRequire ) ) otherlv_2= ')' ) | ( () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_exp_6_0= ruleRequireBase ) ) ) | ( () ( (otherlv_8= RULE_ID ) ) ) ) )
            // InternalGuilang.g:1802:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleRequire ) ) otherlv_2= ')' ) | ( () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_exp_6_0= ruleRequireBase ) ) ) | ( () ( (otherlv_8= RULE_ID ) ) ) )
            {
            // InternalGuilang.g:1802:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleRequire ) ) otherlv_2= ')' ) | ( () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_exp_6_0= ruleRequireBase ) ) ) | ( () ( (otherlv_8= RULE_ID ) ) ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt28=1;
                }
                break;
            case 43:
            case 44:
                {
                alt28=2;
                }
                break;
            case RULE_ID:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalGuilang.g:1803:3: (otherlv_0= '(' ( (lv_exp_1_0= ruleRequire ) ) otherlv_2= ')' )
                    {
                    // InternalGuilang.g:1803:3: (otherlv_0= '(' ( (lv_exp_1_0= ruleRequire ) ) otherlv_2= ')' )
                    // InternalGuilang.g:1804:4: otherlv_0= '(' ( (lv_exp_1_0= ruleRequire ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_23); 

                    				newLeafNode(otherlv_0, grammarAccess.getRequireBaseAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalGuilang.g:1808:4: ( (lv_exp_1_0= ruleRequire ) )
                    // InternalGuilang.g:1809:5: (lv_exp_1_0= ruleRequire )
                    {
                    // InternalGuilang.g:1809:5: (lv_exp_1_0= ruleRequire )
                    // InternalGuilang.g:1810:6: lv_exp_1_0= ruleRequire
                    {

                    						newCompositeNode(grammarAccess.getRequireBaseAccess().getExpRequireParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_exp_1_0=ruleRequire();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequireBaseRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_1_0,
                    							"dk.sdu.mdsd.guilang.Guilang.Require");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getRequireBaseAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuilang.g:1833:3: ( () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_exp_6_0= ruleRequireBase ) ) )
                    {
                    // InternalGuilang.g:1833:3: ( () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_exp_6_0= ruleRequireBase ) ) )
                    // InternalGuilang.g:1834:4: () (otherlv_4= '!' | otherlv_5= 'NOT' ) ( (lv_exp_6_0= ruleRequireBase ) )
                    {
                    // InternalGuilang.g:1834:4: ()
                    // InternalGuilang.g:1835:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRequireBaseAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGuilang.g:1841:4: (otherlv_4= '!' | otherlv_5= 'NOT' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==43) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==44) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalGuilang.g:1842:5: otherlv_4= '!'
                            {
                            otherlv_4=(Token)match(input,43,FOLLOW_23); 

                            					newLeafNode(otherlv_4, grammarAccess.getRequireBaseAccess().getExclamationMarkKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGuilang.g:1847:5: otherlv_5= 'NOT'
                            {
                            otherlv_5=(Token)match(input,44,FOLLOW_23); 

                            					newLeafNode(otherlv_5, grammarAccess.getRequireBaseAccess().getNOTKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    // InternalGuilang.g:1852:4: ( (lv_exp_6_0= ruleRequireBase ) )
                    // InternalGuilang.g:1853:5: (lv_exp_6_0= ruleRequireBase )
                    {
                    // InternalGuilang.g:1853:5: (lv_exp_6_0= ruleRequireBase )
                    // InternalGuilang.g:1854:6: lv_exp_6_0= ruleRequireBase
                    {

                    						newCompositeNode(grammarAccess.getRequireBaseAccess().getExpRequireBaseParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_6_0=ruleRequireBase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequireBaseRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_6_0,
                    							"dk.sdu.mdsd.guilang.Guilang.RequireBase");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGuilang.g:1873:3: ( () ( (otherlv_8= RULE_ID ) ) )
                    {
                    // InternalGuilang.g:1873:3: ( () ( (otherlv_8= RULE_ID ) ) )
                    // InternalGuilang.g:1874:4: () ( (otherlv_8= RULE_ID ) )
                    {
                    // InternalGuilang.g:1874:4: ()
                    // InternalGuilang.g:1875:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRequireBaseAccess().getElementRefAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGuilang.g:1881:4: ( (otherlv_8= RULE_ID ) )
                    // InternalGuilang.g:1882:5: (otherlv_8= RULE_ID )
                    {
                    // InternalGuilang.g:1882:5: (otherlv_8= RULE_ID )
                    // InternalGuilang.g:1883:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequireBaseRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_8, grammarAccess.getRequireBaseAccess().getRefElementCrossReference_2_1_0());
                    					

                    }


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
    // $ANTLR end "ruleRequireBase"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\6\1\4\1\30\7\uffff";
    static final String dfa_3s = "\1\6\1\4\1\36\7\uffff";
    static final String dfa_4s = "\3\uffff\1\5\1\7\1\3\1\6\1\1\1\4\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\7\1\11\1\5\1\10\1\3\1\6\1\4",
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

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "835:4: (lv_type_0_1= ruleLayoutSpec | lv_type_0_2= ruleVerticalSpec | lv_type_0_3= ruleHorizontalSpec | lv_type_0_4= ruleLabelSpec | lv_type_0_5= ruleButtonSpec | lv_type_0_6= ruleInputSpec | lv_type_0_7= ruleCheckboxSpec )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000007C07A0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004080000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000D00000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00001A0000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});

}