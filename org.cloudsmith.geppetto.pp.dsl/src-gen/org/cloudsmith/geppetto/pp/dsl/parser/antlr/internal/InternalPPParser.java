package org.cloudsmith.geppetto.pp.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.cloudsmith.geppetto.pp.dsl.services.PPGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPPParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_62", "KEYWORD_61", "KEYWORD_59", "KEYWORD_60", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_DOLLAR_VAR", "RULE_WORD_CHARS", "RULE_RE_BODY", "RULE_RE_FLAGS", "RULE_REGULAR_EXPRESSION", "RULE_RE_FIRST_CHAR", "RULE_RE_FOLLOW_CHAR", "RULE_RE_BACKSLASH_SEQUENCE", "RULE_ANY_OTHER"
    };
    public static final int RULE_REGULAR_EXPRESSION=73;
    public static final int RULE_ANY_OTHER=77;
    public static final int RULE_RE_FLAGS=72;
    public static final int KEYWORD_56=9;
    public static final int KEYWORD_19=63;
    public static final int KEYWORD_55=8;
    public static final int KEYWORD_54=15;
    public static final int KEYWORD_17=61;
    public static final int KEYWORD_53=14;
    public static final int KEYWORD_18=62;
    public static final int RULE_RE_FOLLOW_CHAR=75;
    public static final int KEYWORD_52=13;
    public static final int KEYWORD_15=59;
    public static final int KEYWORD_51=12;
    public static final int KEYWORD_16=60;
    public static final int KEYWORD_13=57;
    public static final int KEYWORD_50=19;
    public static final int KEYWORD_14=58;
    public static final int KEYWORD_11=55;
    public static final int EOF=-1;
    public static final int KEYWORD_12=56;
    public static final int KEYWORD_10=54;
    public static final int KEYWORD_59=6;
    public static final int KEYWORD_58=11;
    public static final int KEYWORD_57=10;
    public static final int KEYWORD_6=50;
    public static final int KEYWORD_7=51;
    public static final int KEYWORD_8=52;
    public static final int KEYWORD_9=53;
    public static final int KEYWORD_28=26;
    public static final int KEYWORD_29=27;
    public static final int KEYWORD_61=5;
    public static final int KEYWORD_24=22;
    public static final int KEYWORD_60=7;
    public static final int KEYWORD_25=23;
    public static final int KEYWORD_26=24;
    public static final int RULE_RE_FIRST_CHAR=74;
    public static final int KEYWORD_62=4;
    public static final int KEYWORD_27=25;
    public static final int KEYWORD_20=64;
    public static final int KEYWORD_21=65;
    public static final int KEYWORD_22=20;
    public static final int KEYWORD_23=21;
    public static final int RULE_RE_BACKSLASH_SEQUENCE=76;
    public static final int KEYWORD_30=28;
    public static final int KEYWORD_1=45;
    public static final int KEYWORD_34=32;
    public static final int KEYWORD_5=49;
    public static final int KEYWORD_33=31;
    public static final int KEYWORD_4=48;
    public static final int RULE_WORD_CHARS=70;
    public static final int KEYWORD_32=30;
    public static final int KEYWORD_3=47;
    public static final int KEYWORD_31=29;
    public static final int KEYWORD_2=46;
    public static final int KEYWORD_38=36;
    public static final int KEYWORD_37=35;
    public static final int RULE_SL_COMMENT=67;
    public static final int RULE_RE_BODY=71;
    public static final int KEYWORD_36=34;
    public static final int KEYWORD_35=33;
    public static final int RULE_ML_COMMENT=66;
    public static final int KEYWORD_39=37;
    public static final int KEYWORD_41=39;
    public static final int KEYWORD_40=38;
    public static final int KEYWORD_43=41;
    public static final int KEYWORD_42=40;
    public static final int KEYWORD_45=43;
    public static final int KEYWORD_44=42;
    public static final int KEYWORD_47=16;
    public static final int RULE_WS=68;
    public static final int KEYWORD_46=44;
    public static final int KEYWORD_49=18;
    public static final int KEYWORD_48=17;
    public static final int RULE_DOLLAR_VAR=69;

    // delegates
    // delegators


        public InternalPPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPPParser.tokenNames; }
    public String getGrammarFileName() { return "../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     

    	private PPGrammarAccess grammarAccess;
    	 	
    	public InternalPPParser(TokenStream input, PPGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "PuppetManifest";	
    	} 
    	   	   	
    	@Override
    	protected PPGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRulePuppetManifest"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:67:1: entryRulePuppetManifest returns [EObject current=null] : iv_rulePuppetManifest= rulePuppetManifest EOF ;
    public final EObject entryRulePuppetManifest() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePuppetManifest = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:68:2: (iv_rulePuppetManifest= rulePuppetManifest EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:69:2: iv_rulePuppetManifest= rulePuppetManifest EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPuppetManifestRule()); 
            }
            pushFollow(FOLLOW_rulePuppetManifest_in_entryRulePuppetManifest73);
            iv_rulePuppetManifest=rulePuppetManifest();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePuppetManifest; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePuppetManifest83); if (state.failed) return current;

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
    // $ANTLR end "entryRulePuppetManifest"


    // $ANTLR start "rulePuppetManifest"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:76:1: rulePuppetManifest returns [EObject current=null] : ( () ( (lv_statements_1_0= ruleExpressionList ) )* ) ;
    public final EObject rulePuppetManifest() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:79:28: ( ( () ( (lv_statements_1_0= ruleExpressionList ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:80:1: ( () ( (lv_statements_1_0= ruleExpressionList ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:80:1: ( () ( (lv_statements_1_0= ruleExpressionList ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:80:2: () ( (lv_statements_1_0= ruleExpressionList ) )*
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:80:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:81:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPuppetManifestAccess().getPuppetManifestAction_0(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:89:2: ( (lv_statements_1_0= ruleExpressionList ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=KEYWORD_61 && LA1_0<=KEYWORD_55)||(LA1_0>=KEYWORD_57 && LA1_0<=KEYWORD_51)||(LA1_0>=KEYWORD_53 && LA1_0<=KEYWORD_54)||LA1_0==KEYWORD_24||LA1_0==KEYWORD_42||(LA1_0>=KEYWORD_1 && LA1_0<=KEYWORD_4)||LA1_0==KEYWORD_9||(LA1_0>=KEYWORD_17 && LA1_0<=KEYWORD_18)||LA1_0==KEYWORD_20||(LA1_0>=RULE_DOLLAR_VAR && LA1_0<=RULE_WORD_CHARS)||LA1_0==RULE_REGULAR_EXPRESSION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:90:1: (lv_statements_1_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:90:1: (lv_statements_1_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:91:3: lv_statements_1_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPuppetManifestAccess().getStatementsExpressionListParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_rulePuppetManifest141);
            	    lv_statements_1_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPuppetManifestRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_1_0, 
            	              		"ExpressionList");
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
    // $ANTLR end "rulePuppetManifest"


    // $ANTLR start "entryRuleExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:115:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:116:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:117:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression177);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression187); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:124:1: ruleExpression returns [EObject current=null] : this_RelationshipExpression_0= ruleRelationshipExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationshipExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:127:28: (this_RelationshipExpression_0= ruleRelationshipExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:129:2: this_RelationshipExpression_0= ruleRelationshipExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getRelationshipExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationshipExpression_in_ruleExpression236);
            this_RelationshipExpression_0=ruleRelationshipExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_RelationshipExpression_0;
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpressionList"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:148:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:149:2: (iv_ruleExpressionList= ruleExpressionList EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:150:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList269);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList279); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:157:1: ruleExpressionList returns [EObject current=null] : (this_RelationshipExpression_0= ruleRelationshipExpression ( () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )* )? ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_RelationshipExpression_0 = null;

        EObject lv_expressions_3_0 = null;

        EObject lv_expressions_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:160:28: ( (this_RelationshipExpression_0= ruleRelationshipExpression ( () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )* )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:161:1: (this_RelationshipExpression_0= ruleRelationshipExpression ( () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )* )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:161:1: (this_RelationshipExpression_0= ruleRelationshipExpression ( () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )* )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:162:2: this_RelationshipExpression_0= ruleRelationshipExpression ( () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionListAccess().getRelationshipExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationshipExpression_in_ruleExpressionList329);
            this_RelationshipExpression_0=ruleRelationshipExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_RelationshipExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:173:1: ( () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_8) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:173:2: () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )*
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:173:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:174:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getExpressionListAccess().getExprListExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleExpressionList354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpressionListAccess().getCommaKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:187:1: ( (lv_expressions_3_0= ruleRelationshipExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:188:1: (lv_expressions_3_0= ruleRelationshipExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:188:1: (lv_expressions_3_0= ruleRelationshipExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:189:3: lv_expressions_3_0= ruleRelationshipExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionsRelationshipExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRelationshipExpression_in_ruleExpressionList374);
                    lv_expressions_3_0=ruleRelationshipExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
                      	        }
                             		add(
                             			current, 
                             			"expressions",
                              		lv_expressions_3_0, 
                              		"RelationshipExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:205:2: (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==KEYWORD_8) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:206:2: otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleExpressionList388); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getExpressionListAccess().getCommaKeyword_1_3_0());
                    	          
                    	    }
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:210:1: ( (lv_expressions_5_0= ruleRelationshipExpression ) )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:211:1: (lv_expressions_5_0= ruleRelationshipExpression )
                    	    {
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:211:1: (lv_expressions_5_0= ruleRelationshipExpression )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:212:3: lv_expressions_5_0= ruleRelationshipExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionsRelationshipExpressionParserRuleCall_1_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRelationshipExpression_in_ruleExpressionList408);
                    	    lv_expressions_5_0=ruleRelationshipExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"expressions",
                    	              		lv_expressions_5_0, 
                    	              		"RelationshipExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleEdgeOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:236:1: entryRuleEdgeOperator returns [String current=null] : iv_ruleEdgeOperator= ruleEdgeOperator EOF ;
    public final String entryRuleEdgeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEdgeOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:237:1: (iv_ruleEdgeOperator= ruleEdgeOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:238:2: iv_ruleEdgeOperator= ruleEdgeOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeOperator_in_entryRuleEdgeOperator448);
            iv_ruleEdgeOperator=ruleEdgeOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeOperator459); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEdgeOperator"


    // $ANTLR start "ruleEdgeOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:245:1: ruleEdgeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_27 | kw= KEYWORD_28 | kw= KEYWORD_46 | kw= KEYWORD_32 ) ;
    public final AntlrDatatypeRuleToken ruleEdgeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:249:6: ( (kw= KEYWORD_27 | kw= KEYWORD_28 | kw= KEYWORD_46 | kw= KEYWORD_32 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:250:1: (kw= KEYWORD_27 | kw= KEYWORD_28 | kw= KEYWORD_46 | kw= KEYWORD_32 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:250:1: (kw= KEYWORD_27 | kw= KEYWORD_28 | kw= KEYWORD_46 | kw= KEYWORD_32 )
            int alt4=4;
            switch ( input.LA(1) ) {
            case KEYWORD_27:
                {
                alt4=1;
                }
                break;
            case KEYWORD_28:
                {
                alt4=2;
                }
                break;
            case KEYWORD_46:
                {
                alt4=3;
                }
                break;
            case KEYWORD_32:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:251:2: kw= KEYWORD_27
                    {
                    kw=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleEdgeOperator497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEdgeOperatorAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:258:2: kw= KEYWORD_28
                    {
                    kw=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleEdgeOperator516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEdgeOperatorAccess().getLessThanSignHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:265:2: kw= KEYWORD_46
                    {
                    kw=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleEdgeOperator535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEdgeOperatorAccess().getTildeGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:272:2: kw= KEYWORD_32
                    {
                    kw=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleEdgeOperator554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEdgeOperatorAccess().getLessThanSignTildeKeyword_3()); 
                          
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
    // $ANTLR end "ruleEdgeOperator"


    // $ANTLR start "entryRuleRelationshipExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:285:1: entryRuleRelationshipExpression returns [EObject current=null] : iv_ruleRelationshipExpression= ruleRelationshipExpression EOF ;
    public final EObject entryRuleRelationshipExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:286:2: (iv_ruleRelationshipExpression= ruleRelationshipExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:287:2: iv_ruleRelationshipExpression= ruleRelationshipExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationshipExpression_in_entryRuleRelationshipExpression593);
            iv_ruleRelationshipExpression=ruleRelationshipExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipExpression603); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationshipExpression"


    // $ANTLR start "ruleRelationshipExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:294:1: ruleRelationshipExpression returns [EObject current=null] : (this_ResourceExpression_0= ruleResourceExpression ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )* ) ;
    public final EObject ruleRelationshipExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:297:28: ( (this_ResourceExpression_0= ruleResourceExpression ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:298:1: (this_ResourceExpression_0= ruleResourceExpression ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:298:1: (this_ResourceExpression_0= ruleResourceExpression ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:299:2: this_ResourceExpression_0= ruleResourceExpression ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationshipExpressionAccess().getResourceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleResourceExpression_in_ruleRelationshipExpression653);
            this_ResourceExpression_0=ruleResourceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ResourceExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:310:1: ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case KEYWORD_27:
                    {
                    int LA5_2 = input.LA(2);

                    if ( (synpred7_InternalPPParser()) ) {
                        alt5=1;
                    }


                    }
                    break;
                case KEYWORD_28:
                    {
                    int LA5_3 = input.LA(2);

                    if ( (synpred7_InternalPPParser()) ) {
                        alt5=1;
                    }


                    }
                    break;
                case KEYWORD_46:
                    {
                    int LA5_4 = input.LA(2);

                    if ( (synpred7_InternalPPParser()) ) {
                        alt5=1;
                    }


                    }
                    break;
                case KEYWORD_32:
                    {
                    int LA5_5 = input.LA(2);

                    if ( (synpred7_InternalPPParser()) ) {
                        alt5=1;
                    }


                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:310:2: () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:310:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:311:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationshipExpressionAccess().getRelationshipExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:319:2: ( (lv_opName_2_0= ruleEdgeOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:320:1: (lv_opName_2_0= ruleEdgeOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:320:1: (lv_opName_2_0= ruleEdgeOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:321:3: lv_opName_2_0= ruleEdgeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationshipExpressionAccess().getOpNameEdgeOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEdgeOperator_in_ruleRelationshipExpression686);
            	    lv_opName_2_0=ruleEdgeOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationshipExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"EdgeOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:337:2: ( (lv_rightExpr_3_0= ruleResourceExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:338:1: (lv_rightExpr_3_0= ruleResourceExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:338:1: (lv_rightExpr_3_0= ruleResourceExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:339:3: lv_rightExpr_3_0= ruleResourceExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationshipExpressionAccess().getRightExprResourceExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResourceExpression_in_ruleRelationshipExpression707);
            	    lv_rightExpr_3_0=ruleResourceExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationshipExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"ResourceExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleRelationshipExpression"


    // $ANTLR start "entryRuleResourceExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:363:1: entryRuleResourceExpression returns [EObject current=null] : iv_ruleResourceExpression= ruleResourceExpression EOF ;
    public final EObject entryRuleResourceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:364:2: (iv_ruleResourceExpression= ruleResourceExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:365:2: iv_ruleResourceExpression= ruleResourceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResourceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleResourceExpression_in_entryRuleResourceExpression744);
            iv_ruleResourceExpression=ruleResourceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResourceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceExpression754); if (state.failed) return current;

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
    // $ANTLR end "entryRuleResourceExpression"


    // $ANTLR start "ruleResourceExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:372:1: ruleResourceExpression returns [EObject current=null] : ( (this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )? ) | ( () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21 ) ) ;
    public final EObject ruleResourceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject this_AssignmentExpression_0 = null;

        EObject lv_resourceData_3_0 = null;

        EObject lv_resourceData_5_0 = null;

        EObject lv_resourceExpr_9_0 = null;

        EObject lv_resourceData_11_0 = null;

        EObject lv_resourceData_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:375:28: ( ( (this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )? ) | ( () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21 ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:376:1: ( (this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )? ) | ( () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21 ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:376:1: ( (this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )? ) | ( () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21 ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=KEYWORD_61 && LA13_0<=KEYWORD_60)||(LA13_0>=KEYWORD_57 && LA13_0<=KEYWORD_51)||(LA13_0>=KEYWORD_53 && LA13_0<=KEYWORD_54)||LA13_0==KEYWORD_24||LA13_0==KEYWORD_42||(LA13_0>=KEYWORD_1 && LA13_0<=KEYWORD_4)||LA13_0==KEYWORD_9||(LA13_0>=KEYWORD_17 && LA13_0<=KEYWORD_18)||LA13_0==KEYWORD_20||(LA13_0>=RULE_DOLLAR_VAR && LA13_0<=RULE_WORD_CHARS)||LA13_0==RULE_REGULAR_EXPRESSION) ) {
                alt13=1;
            }
            else if ( (LA13_0==KEYWORD_55) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==KEYWORD_55||LA13_2==RULE_WORD_CHARS) ) {
                    alt13=1;
                }
                else if ( (LA13_2==KEYWORD_20) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:376:2: (this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )? )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:376:2: (this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )? )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:377:2: this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getResourceExpressionAccess().getAssignmentExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleResourceExpression805);
                    this_AssignmentExpression_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_AssignmentExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:388:1: ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==KEYWORD_20) ) {
                        int LA9_1 = input.LA(2);

                        if ( (synpred11_InternalPPParser()) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:388:2: () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:388:2: ()
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:389:2: 
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getResourceExpressionAccess().getResourceExpressionResourceExprAction_0_1_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleResourceExpression830); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getResourceExpressionAccess().getLeftCurlyBracketKeyword_0_1_1());
                                  
                            }
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:402:1: ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( ((LA8_0>=KEYWORD_61 && LA8_0<=KEYWORD_55)||(LA8_0>=KEYWORD_57 && LA8_0<=KEYWORD_51)||(LA8_0>=KEYWORD_53 && LA8_0<=KEYWORD_54)||LA8_0==KEYWORD_24||LA8_0==KEYWORD_42||(LA8_0>=KEYWORD_1 && LA8_0<=KEYWORD_4)||LA8_0==KEYWORD_9||(LA8_0>=KEYWORD_17 && LA8_0<=KEYWORD_18)||LA8_0==KEYWORD_20||(LA8_0>=RULE_DOLLAR_VAR && LA8_0<=RULE_WORD_CHARS)||LA8_0==RULE_REGULAR_EXPRESSION) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:402:2: ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )?
                                    {
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:402:2: ( (lv_resourceData_3_0= ruleResourceBody ) )
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:403:1: (lv_resourceData_3_0= ruleResourceBody )
                                    {
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:403:1: (lv_resourceData_3_0= ruleResourceBody )
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:404:3: lv_resourceData_3_0= ruleResourceBody
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceDataResourceBodyParserRuleCall_0_1_2_0_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleResourceBody_in_ruleResourceExpression851);
                                    lv_resourceData_3_0=ruleResourceBody();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getResourceExpressionRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"resourceData",
                                              		lv_resourceData_3_0, 
                                              		"ResourceBody");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:420:2: (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )*
                                    loop6:
                                    do {
                                        int alt6=2;
                                        int LA6_0 = input.LA(1);

                                        if ( (LA6_0==KEYWORD_12) ) {
                                            int LA6_1 = input.LA(2);

                                            if ( ((LA6_1>=KEYWORD_61 && LA6_1<=KEYWORD_55)||(LA6_1>=KEYWORD_57 && LA6_1<=KEYWORD_51)||(LA6_1>=KEYWORD_53 && LA6_1<=KEYWORD_54)||LA6_1==KEYWORD_24||LA6_1==KEYWORD_42||(LA6_1>=KEYWORD_1 && LA6_1<=KEYWORD_4)||LA6_1==KEYWORD_9||(LA6_1>=KEYWORD_17 && LA6_1<=KEYWORD_18)||LA6_1==KEYWORD_20||(LA6_1>=RULE_DOLLAR_VAR && LA6_1<=RULE_WORD_CHARS)||LA6_1==RULE_REGULAR_EXPRESSION) ) {
                                                alt6=1;
                                            }


                                        }


                                        switch (alt6) {
                                    	case 1 :
                                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:421:2: otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) )
                                    	    {
                                    	    otherlv_4=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleResourceExpression865); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_4, grammarAccess.getResourceExpressionAccess().getSemicolonKeyword_0_1_2_1_0());
                                    	          
                                    	    }
                                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:425:1: ( (lv_resourceData_5_0= ruleResourceBody ) )
                                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:426:1: (lv_resourceData_5_0= ruleResourceBody )
                                    	    {
                                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:426:1: (lv_resourceData_5_0= ruleResourceBody )
                                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:427:3: lv_resourceData_5_0= ruleResourceBody
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceDataResourceBodyParserRuleCall_0_1_2_1_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FOLLOW_ruleResourceBody_in_ruleResourceExpression885);
                                    	    lv_resourceData_5_0=ruleResourceBody();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getResourceExpressionRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"resourceData",
                                    	              		lv_resourceData_5_0, 
                                    	              		"ResourceBody");
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

                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:443:4: (otherlv_6= KEYWORD_12 )?
                                    int alt7=2;
                                    int LA7_0 = input.LA(1);

                                    if ( (LA7_0==KEYWORD_12) ) {
                                        alt7=1;
                                    }
                                    switch (alt7) {
                                        case 1 :
                                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:444:2: otherlv_6= KEYWORD_12
                                            {
                                            otherlv_6=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleResourceExpression901); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_6, grammarAccess.getResourceExpressionAccess().getSemicolonKeyword_0_1_2_2());
                                                  
                                            }

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            otherlv_7=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleResourceExpression917); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getResourceExpressionAccess().getRightCurlyBracketKeyword_0_1_3());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:454:6: ( () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21 )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:454:6: ( () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21 )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:454:7: () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:454:7: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:455:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getResourceExpressionAccess().getResourceExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:463:2: ( (lv_resourceExpr_9_0= ruleLiteralClass ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:464:1: (lv_resourceExpr_9_0= ruleLiteralClass )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:464:1: (lv_resourceExpr_9_0= ruleLiteralClass )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:465:3: lv_resourceExpr_9_0= ruleLiteralClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceExprLiteralClassParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralClass_in_ruleResourceExpression959);
                    lv_resourceExpr_9_0=ruleLiteralClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getResourceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"resourceExpr",
                              		lv_resourceExpr_9_0, 
                              		"LiteralClass");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleResourceExpression972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getResourceExpressionAccess().getLeftCurlyBracketKeyword_1_2());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:486:1: ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=KEYWORD_61 && LA12_0<=KEYWORD_55)||(LA12_0>=KEYWORD_57 && LA12_0<=KEYWORD_51)||(LA12_0>=KEYWORD_53 && LA12_0<=KEYWORD_54)||LA12_0==KEYWORD_24||LA12_0==KEYWORD_42||(LA12_0>=KEYWORD_1 && LA12_0<=KEYWORD_4)||LA12_0==KEYWORD_9||(LA12_0>=KEYWORD_17 && LA12_0<=KEYWORD_18)||LA12_0==KEYWORD_20||(LA12_0>=RULE_DOLLAR_VAR && LA12_0<=RULE_WORD_CHARS)||LA12_0==RULE_REGULAR_EXPRESSION) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:486:2: ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )?
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:486:2: ( (lv_resourceData_11_0= ruleResourceBody ) )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:487:1: (lv_resourceData_11_0= ruleResourceBody )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:487:1: (lv_resourceData_11_0= ruleResourceBody )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:488:3: lv_resourceData_11_0= ruleResourceBody
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceDataResourceBodyParserRuleCall_1_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleResourceBody_in_ruleResourceExpression993);
                            lv_resourceData_11_0=ruleResourceBody();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getResourceExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"resourceData",
                                      		lv_resourceData_11_0, 
                                      		"ResourceBody");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:504:2: (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==KEYWORD_12) ) {
                                    int LA10_1 = input.LA(2);

                                    if ( ((LA10_1>=KEYWORD_61 && LA10_1<=KEYWORD_55)||(LA10_1>=KEYWORD_57 && LA10_1<=KEYWORD_51)||(LA10_1>=KEYWORD_53 && LA10_1<=KEYWORD_54)||LA10_1==KEYWORD_24||LA10_1==KEYWORD_42||(LA10_1>=KEYWORD_1 && LA10_1<=KEYWORD_4)||LA10_1==KEYWORD_9||(LA10_1>=KEYWORD_17 && LA10_1<=KEYWORD_18)||LA10_1==KEYWORD_20||(LA10_1>=RULE_DOLLAR_VAR && LA10_1<=RULE_WORD_CHARS)||LA10_1==RULE_REGULAR_EXPRESSION) ) {
                                        alt10=1;
                                    }


                                }


                                switch (alt10) {
                            	case 1 :
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:505:2: otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) )
                            	    {
                            	    otherlv_12=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleResourceExpression1007); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_12, grammarAccess.getResourceExpressionAccess().getSemicolonKeyword_1_3_1_0());
                            	          
                            	    }
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:509:1: ( (lv_resourceData_13_0= ruleResourceBody ) )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:510:1: (lv_resourceData_13_0= ruleResourceBody )
                            	    {
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:510:1: (lv_resourceData_13_0= ruleResourceBody )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:511:3: lv_resourceData_13_0= ruleResourceBody
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceDataResourceBodyParserRuleCall_1_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleResourceBody_in_ruleResourceExpression1027);
                            	    lv_resourceData_13_0=ruleResourceBody();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getResourceExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"resourceData",
                            	              		lv_resourceData_13_0, 
                            	              		"ResourceBody");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);

                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:527:4: (otherlv_14= KEYWORD_12 )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==KEYWORD_12) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:528:2: otherlv_14= KEYWORD_12
                                    {
                                    otherlv_14=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleResourceExpression1043); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_14, grammarAccess.getResourceExpressionAccess().getSemicolonKeyword_1_3_2());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleResourceExpression1059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getResourceExpressionAccess().getRightCurlyBracketKeyword_1_4());
                          
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
    // $ANTLR end "ruleResourceExpression"


    // $ANTLR start "entryRuleResourceBody"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:545:1: entryRuleResourceBody returns [EObject current=null] : iv_ruleResourceBody= ruleResourceBody EOF ;
    public final EObject entryRuleResourceBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceBody = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:546:2: (iv_ruleResourceBody= ruleResourceBody EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:547:2: iv_ruleResourceBody= ruleResourceBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResourceBodyRule()); 
            }
            pushFollow(FOLLOW_ruleResourceBody_in_entryRuleResourceBody1094);
            iv_ruleResourceBody=ruleResourceBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResourceBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceBody1104); if (state.failed) return current;

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
    // $ANTLR end "entryRuleResourceBody"


    // $ANTLR start "ruleResourceBody"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:554:1: ruleResourceBody returns [EObject current=null] : ( ( ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )? ) | ( (lv_attributes_3_0= ruleAttributeOperations ) ) ) ;
    public final EObject ruleResourceBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_nameExpr_0_0 = null;

        EObject lv_attributes_2_0 = null;

        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:557:28: ( ( ( ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )? ) | ( (lv_attributes_3_0= ruleAttributeOperations ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:558:1: ( ( ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )? ) | ( (lv_attributes_3_0= ruleAttributeOperations ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:558:1: ( ( ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )? ) | ( (lv_attributes_3_0= ruleAttributeOperations ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=KEYWORD_61 && LA15_0<=KEYWORD_55)||(LA15_0>=KEYWORD_57 && LA15_0<=KEYWORD_51)||(LA15_0>=KEYWORD_53 && LA15_0<=KEYWORD_54)||LA15_0==KEYWORD_24||LA15_0==KEYWORD_42||(LA15_0>=KEYWORD_1 && LA15_0<=KEYWORD_4)||LA15_0==KEYWORD_9||(LA15_0>=KEYWORD_17 && LA15_0<=KEYWORD_18)||LA15_0==KEYWORD_20||LA15_0==RULE_DOLLAR_VAR||LA15_0==RULE_REGULAR_EXPRESSION) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_WORD_CHARS) ) {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==EOF||LA15_2==KEYWORD_26||LA15_2==KEYWORD_34||LA15_2==KEYWORD_8||LA15_2==KEYWORD_12||LA15_2==KEYWORD_21||LA15_2==RULE_WORD_CHARS) ) {
                    alt15=2;
                }
                else if ( (LA15_2==KEYWORD_47||LA15_2==KEYWORD_49||(LA15_2>=KEYWORD_22 && LA15_2<=KEYWORD_23)||LA15_2==KEYWORD_25||(LA15_2>=KEYWORD_27 && LA15_2<=KEYWORD_33)||(LA15_2>=KEYWORD_35 && LA15_2<=KEYWORD_37)||(LA15_2>=KEYWORD_43 && LA15_2<=KEYWORD_44)||LA15_2==KEYWORD_46||LA15_2==KEYWORD_4||(LA15_2>=KEYWORD_6 && LA15_2<=KEYWORD_7)||(LA15_2>=KEYWORD_9 && LA15_2<=KEYWORD_11)||(LA15_2>=KEYWORD_13 && LA15_2<=KEYWORD_16)||LA15_2==KEYWORD_18||LA15_2==KEYWORD_20) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:558:2: ( ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )? )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:558:2: ( ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )? )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:558:3: ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )?
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:558:3: ( (lv_nameExpr_0_0= ruleExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:559:1: (lv_nameExpr_0_0= ruleExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:559:1: (lv_nameExpr_0_0= ruleExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:560:3: lv_nameExpr_0_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getResourceBodyAccess().getNameExprExpressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleResourceBody1151);
                    lv_nameExpr_0_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getResourceBodyRule());
                      	        }
                             		set(
                             			current, 
                             			"nameExpr",
                              		lv_nameExpr_0_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleResourceBody1164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getResourceBodyAccess().getColonKeyword_0_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:581:1: ( (lv_attributes_2_0= ruleAttributeOperations ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_WORD_CHARS) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:582:1: (lv_attributes_2_0= ruleAttributeOperations )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:582:1: (lv_attributes_2_0= ruleAttributeOperations )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:583:3: lv_attributes_2_0= ruleAttributeOperations
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getResourceBodyAccess().getAttributesAttributeOperationsParserRuleCall_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAttributeOperations_in_ruleResourceBody1184);
                            lv_attributes_2_0=ruleAttributeOperations();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getResourceBodyRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"attributes",
                                      		lv_attributes_2_0, 
                                      		"AttributeOperations");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:600:6: ( (lv_attributes_3_0= ruleAttributeOperations ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:600:6: ( (lv_attributes_3_0= ruleAttributeOperations ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:601:1: (lv_attributes_3_0= ruleAttributeOperations )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:601:1: (lv_attributes_3_0= ruleAttributeOperations )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:602:3: lv_attributes_3_0= ruleAttributeOperations
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getResourceBodyAccess().getAttributesAttributeOperationsParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeOperations_in_ruleResourceBody1213);
                    lv_attributes_3_0=ruleAttributeOperations();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getResourceBodyRule());
                      	        }
                             		set(
                             			current, 
                             			"attributes",
                              		lv_attributes_3_0, 
                              		"AttributeOperations");
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
    // $ANTLR end "ruleResourceBody"


    // $ANTLR start "entryRuleAttributeOperation"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:626:1: entryRuleAttributeOperation returns [EObject current=null] : iv_ruleAttributeOperation= ruleAttributeOperation EOF ;
    public final EObject entryRuleAttributeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeOperation = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:627:2: (iv_ruleAttributeOperation= ruleAttributeOperation EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:628:2: iv_ruleAttributeOperation= ruleAttributeOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeOperationRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeOperation_in_entryRuleAttributeOperation1248);
            iv_ruleAttributeOperation=ruleAttributeOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeOperation1258); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeOperation"


    // $ANTLR start "ruleAttributeOperation"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:635:1: ruleAttributeOperation returns [EObject current=null] : ( () ( (lv_key_1_0= rulename ) ) ( ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleAttributeOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:638:28: ( ( () ( (lv_key_1_0= rulename ) ) ( ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:639:1: ( () ( (lv_key_1_0= rulename ) ) ( ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:639:1: ( () ( (lv_key_1_0= rulename ) ) ( ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:639:2: () ( (lv_key_1_0= rulename ) ) ( ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) ) )?
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:639:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:640:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributeOperationAccess().getAttributeOperationAction_0(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:648:2: ( (lv_key_1_0= rulename ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:649:1: (lv_key_1_0= rulename )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:649:1: (lv_key_1_0= rulename )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:650:3: lv_key_1_0= rulename
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeOperationAccess().getKeyNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulename_in_ruleAttributeOperation1316);
            lv_key_1_0=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeOperationRule());
              	        }
                     		set(
                     			current, 
                     			"key",
                      		lv_key_1_0, 
                      		"name");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:666:2: ( ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_26||LA17_0==KEYWORD_34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:666:3: ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:666:3: ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:667:1: ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:667:1: ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:668:1: (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:668:1: (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==KEYWORD_34) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==KEYWORD_26) ) {
                        alt16=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:669:3: lv_op_2_1= KEYWORD_34
                            {
                            lv_op_2_1=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleAttributeOperation1338); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getAttributeOperationAccess().getOpEqualsSignGreaterThanSignKeyword_2_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeOperationRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:682:8: lv_op_2_2= KEYWORD_26
                            {
                            lv_op_2_2=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleAttributeOperation1366); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getAttributeOperationAccess().getOpPlusSignGreaterThanSignKeyword_2_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeOperationRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:698:2: ( (lv_value_3_0= ruleExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:699:1: (lv_value_3_0= ruleExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:699:1: (lv_value_3_0= ruleExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:700:3: lv_value_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeOperationAccess().getValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAttributeOperation1401);
                    lv_value_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"Expression");
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
    // $ANTLR end "ruleAttributeOperation"


    // $ANTLR start "entryRuleAttributeOperations"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:724:1: entryRuleAttributeOperations returns [EObject current=null] : iv_ruleAttributeOperations= ruleAttributeOperations EOF ;
    public final EObject entryRuleAttributeOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeOperations = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:725:2: (iv_ruleAttributeOperations= ruleAttributeOperations EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:726:2: iv_ruleAttributeOperations= ruleAttributeOperations EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeOperationsRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeOperations_in_entryRuleAttributeOperations1438);
            iv_ruleAttributeOperations=ruleAttributeOperations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeOperations; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeOperations1448); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeOperations"


    // $ANTLR start "ruleAttributeOperations"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:733:1: ruleAttributeOperations returns [EObject current=null] : ( ( (lv_attributes_0_0= ruleAttributeOperation ) ) ( (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) ) | ( (lv_attributes_3_0= ruleAttributeOperation ) ) )* (otherlv_4= KEYWORD_8 )? ) ;
    public final EObject ruleAttributeOperations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_attributes_0_0 = null;

        EObject lv_attributes_2_0 = null;

        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:736:28: ( ( ( (lv_attributes_0_0= ruleAttributeOperation ) ) ( (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) ) | ( (lv_attributes_3_0= ruleAttributeOperation ) ) )* (otherlv_4= KEYWORD_8 )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:737:1: ( ( (lv_attributes_0_0= ruleAttributeOperation ) ) ( (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) ) | ( (lv_attributes_3_0= ruleAttributeOperation ) ) )* (otherlv_4= KEYWORD_8 )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:737:1: ( ( (lv_attributes_0_0= ruleAttributeOperation ) ) ( (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) ) | ( (lv_attributes_3_0= ruleAttributeOperation ) ) )* (otherlv_4= KEYWORD_8 )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:737:2: ( (lv_attributes_0_0= ruleAttributeOperation ) ) ( (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) ) | ( (lv_attributes_3_0= ruleAttributeOperation ) ) )* (otherlv_4= KEYWORD_8 )?
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:737:2: ( (lv_attributes_0_0= ruleAttributeOperation ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:738:1: (lv_attributes_0_0= ruleAttributeOperation )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:738:1: (lv_attributes_0_0= ruleAttributeOperation )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:739:3: lv_attributes_0_0= ruleAttributeOperation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeOperationsAccess().getAttributesAttributeOperationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAttributeOperation_in_ruleAttributeOperations1494);
            lv_attributes_0_0=ruleAttributeOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeOperationsRule());
              	        }
                     		add(
                     			current, 
                     			"attributes",
                      		lv_attributes_0_0, 
                      		"AttributeOperation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:755:2: ( (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) ) | ( (lv_attributes_3_0= ruleAttributeOperation ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==KEYWORD_8) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_WORD_CHARS) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==RULE_WORD_CHARS) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:755:3: (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:755:3: (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:756:2: otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleAttributeOperations1509); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAttributeOperationsAccess().getCommaKeyword_1_0_0());
            	          
            	    }
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:760:1: ( (lv_attributes_2_0= ruleAttributeOperation ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:761:1: (lv_attributes_2_0= ruleAttributeOperation )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:761:1: (lv_attributes_2_0= ruleAttributeOperation )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:762:3: lv_attributes_2_0= ruleAttributeOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeOperationsAccess().getAttributesAttributeOperationParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttributeOperation_in_ruleAttributeOperations1529);
            	    lv_attributes_2_0=ruleAttributeOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeOperationsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_2_0, 
            	              		"AttributeOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:779:6: ( (lv_attributes_3_0= ruleAttributeOperation ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:779:6: ( (lv_attributes_3_0= ruleAttributeOperation ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:780:1: (lv_attributes_3_0= ruleAttributeOperation )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:780:1: (lv_attributes_3_0= ruleAttributeOperation )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:781:3: lv_attributes_3_0= ruleAttributeOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeOperationsAccess().getAttributesAttributeOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttributeOperation_in_ruleAttributeOperations1557);
            	    lv_attributes_3_0=ruleAttributeOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeOperationsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_3_0, 
            	              		"AttributeOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:797:4: (otherlv_4= KEYWORD_8 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_8) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:798:2: otherlv_4= KEYWORD_8
                    {
                    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleAttributeOperations1573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeOperationsAccess().getCommaKeyword_2());
                          
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
    // $ANTLR end "ruleAttributeOperations"


    // $ANTLR start "entryRuleAssignmentExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:810:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:811:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:812:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression1609);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression1619); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:819:1: ruleAssignmentExpression returns [EObject current=null] : (this_AppendExpression_0= ruleAppendExpression ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )? ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AppendExpression_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:822:28: ( (this_AppendExpression_0= ruleAppendExpression ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:823:1: (this_AppendExpression_0= ruleAppendExpression ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:823:1: (this_AppendExpression_0= ruleAppendExpression ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:824:2: this_AppendExpression_0= ruleAppendExpression ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getAppendExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAppendExpression_in_ruleAssignmentExpression1669);
            this_AppendExpression_0=ruleAppendExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AppendExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:835:1: ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_14) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred23_InternalPPParser()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:835:2: () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:835:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:836:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLeftExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleAssignmentExpression1694); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAssignmentExpressionAccess().getEqualsSignKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:849:1: ( (lv_rightExpr_3_0= ruleAppendExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:850:1: (lv_rightExpr_3_0= ruleAppendExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:850:1: (lv_rightExpr_3_0= ruleAppendExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:851:3: lv_rightExpr_3_0= ruleAppendExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRightExprAppendExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAppendExpression_in_ruleAssignmentExpression1714);
                    lv_rightExpr_3_0=ruleAppendExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_3_0, 
                              		"AppendExpression");
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleAppendExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:875:1: entryRuleAppendExpression returns [EObject current=null] : iv_ruleAppendExpression= ruleAppendExpression EOF ;
    public final EObject entryRuleAppendExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:876:2: (iv_ruleAppendExpression= ruleAppendExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:877:2: iv_ruleAppendExpression= ruleAppendExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppendExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAppendExpression_in_entryRuleAppendExpression1751);
            iv_ruleAppendExpression=ruleAppendExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppendExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppendExpression1761); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAppendExpression"


    // $ANTLR start "ruleAppendExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:884:1: ruleAppendExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )? ) ;
    public final EObject ruleAppendExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpression_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:887:28: ( (this_OrExpression_0= ruleOrExpression ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:888:1: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:888:1: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:889:2: this_OrExpression_0= ruleOrExpression ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAppendExpressionAccess().getOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleAppendExpression1811);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_OrExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:900:1: ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_25) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred24_InternalPPParser()) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:900:2: () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:900:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:901:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getAppendExpressionAccess().getAppendExpressionLeftExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleAppendExpression1836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAppendExpressionAccess().getPlusSignEqualsSignKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:914:1: ( (lv_rightExpr_3_0= ruleOrExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:915:1: (lv_rightExpr_3_0= ruleOrExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:915:1: (lv_rightExpr_3_0= ruleOrExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:916:3: lv_rightExpr_3_0= ruleOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAppendExpressionAccess().getRightExprOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleAppendExpression1856);
                    lv_rightExpr_3_0=ruleOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAppendExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_3_0, 
                              		"OrExpression");
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
    // $ANTLR end "ruleAppendExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:940:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:941:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:942:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression1893);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression1903); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:949:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:952:28: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:953:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:953:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:954:2: this_AndExpression_0= ruleAndExpression ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1953);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:965:1: ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==KEYWORD_44) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred25_InternalPPParser()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:965:2: () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:965:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:966:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExpressionAccess().getOrExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleOrExpression1978); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
            	          
            	    }
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:979:1: ( (lv_rightExpr_3_0= ruleAndExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:980:1: (lv_rightExpr_3_0= ruleAndExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:980:1: (lv_rightExpr_3_0= ruleAndExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:981:3: lv_rightExpr_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExprAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1998);
            	    lv_rightExpr_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"AndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1005:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1006:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1007:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression2035);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression2045); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1014:1: ruleAndExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1017:28: ( (this_RelationalExpression_0= ruleRelationalExpression ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1018:1: (this_RelationalExpression_0= ruleRelationalExpression ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1018:1: (this_RelationalExpression_0= ruleRelationalExpression ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1019:2: this_RelationalExpression_0= ruleRelationalExpression ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression2095);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_RelationalExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1030:1: ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==KEYWORD_49) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred26_InternalPPParser()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1030:2: () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1030:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1031:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getAndExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleAndExpression2120); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
            	          
            	    }
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1044:1: ( (lv_rightExpr_3_0= ruleRelationalExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1045:1: (lv_rightExpr_3_0= ruleRelationalExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1045:1: (lv_rightExpr_3_0= ruleRelationalExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1046:3: lv_rightExpr_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExprRelationalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression2140);
            	    lv_rightExpr_3_0=ruleRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"RelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleRelationalOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1070:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1071:1: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1072:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator2178);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOperator2189); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationalOperator"


    // $ANTLR start "ruleRelationalOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1079:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_36 | kw= KEYWORD_30 | kw= KEYWORD_15 | kw= KEYWORD_13 ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1083:6: ( (kw= KEYWORD_36 | kw= KEYWORD_30 | kw= KEYWORD_15 | kw= KEYWORD_13 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1084:1: (kw= KEYWORD_36 | kw= KEYWORD_30 | kw= KEYWORD_15 | kw= KEYWORD_13 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1084:1: (kw= KEYWORD_36 | kw= KEYWORD_30 | kw= KEYWORD_15 | kw= KEYWORD_13 )
            int alt24=4;
            switch ( input.LA(1) ) {
            case KEYWORD_36:
                {
                alt24=1;
                }
                break;
            case KEYWORD_30:
                {
                alt24=2;
                }
                break;
            case KEYWORD_15:
                {
                alt24=3;
                }
                break;
            case KEYWORD_13:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1085:2: kw= KEYWORD_36
                    {
                    kw=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleRelationalOperator2227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1092:2: kw= KEYWORD_30
                    {
                    kw=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleRelationalOperator2246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1099:2: kw= KEYWORD_15
                    {
                    kw=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleRelationalOperator2265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1106:2: kw= KEYWORD_13
                    {
                    kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleRelationalOperator2284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_3()); 
                          
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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1119:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1120:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1121:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2323);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression2333); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1128:1: ruleRelationalExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1131:28: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1132:1: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1132:1: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1133:2: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleRelationalExpression2383);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_EqualityExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1144:1: ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case KEYWORD_36:
                    {
                    int LA25_2 = input.LA(2);

                    if ( (synpred30_InternalPPParser()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case KEYWORD_30:
                    {
                    int LA25_3 = input.LA(2);

                    if ( (synpred30_InternalPPParser()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case KEYWORD_15:
                    {
                    int LA25_4 = input.LA(2);

                    if ( (synpred30_InternalPPParser()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case KEYWORD_13:
                    {
                    int LA25_5 = input.LA(2);

                    if ( (synpred30_InternalPPParser()) ) {
                        alt25=1;
                    }


                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1144:2: () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1144:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1145:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1153:2: ( (lv_opName_2_0= ruleRelationalOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1154:1: (lv_opName_2_0= ruleRelationalOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1154:1: (lv_opName_2_0= ruleRelationalOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1155:3: lv_opName_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOpNameRelationalOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleRelationalExpression2416);
            	    lv_opName_2_0=ruleRelationalOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"RelationalOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1171:2: ( (lv_rightExpr_3_0= ruleEqualityExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1172:1: (lv_rightExpr_3_0= ruleEqualityExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1172:1: (lv_rightExpr_3_0= ruleEqualityExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1173:3: lv_rightExpr_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightExprEqualityExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEqualityExpression_in_ruleRelationalExpression2437);
            	    lv_rightExpr_3_0=ruleEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"EqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleEqualityOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1197:1: entryRuleEqualityOperator returns [String current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final String entryRuleEqualityOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1198:1: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1199:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualityOperator_in_entryRuleEqualityOperator2475);
            iv_ruleEqualityOperator=ruleEqualityOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityOperator2486); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEqualityOperator"


    // $ANTLR start "ruleEqualityOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1206:1: ruleEqualityOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_33 | kw= KEYWORD_22 ) ;
    public final AntlrDatatypeRuleToken ruleEqualityOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1210:6: ( (kw= KEYWORD_33 | kw= KEYWORD_22 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1211:1: (kw= KEYWORD_33 | kw= KEYWORD_22 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1211:1: (kw= KEYWORD_33 | kw= KEYWORD_22 )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_33) ) {
                alt26=1;
            }
            else if ( (LA26_0==KEYWORD_22) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1212:2: kw= KEYWORD_33
                    {
                    kw=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleEqualityOperator2524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1219:2: kw= KEYWORD_22
                    {
                    kw=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleEqualityOperator2543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
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
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1232:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1233:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1234:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression2582);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression2592); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1241:1: ruleEqualityExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1244:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1245:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1245:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1246:2: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualityExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleEqualityExpression2642);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ShiftExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1257:1: ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==KEYWORD_33) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred32_InternalPPParser()) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==KEYWORD_22) ) {
                    int LA27_3 = input.LA(2);

                    if ( (synpred32_InternalPPParser()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1257:2: () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1257:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1258:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1266:2: ( (lv_opName_2_0= ruleEqualityOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1267:1: (lv_opName_2_0= ruleEqualityOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1267:1: (lv_opName_2_0= ruleEqualityOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1268:3: lv_opName_2_0= ruleEqualityOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOpNameEqualityOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEqualityOperator_in_ruleEqualityExpression2675);
            	    lv_opName_2_0=ruleEqualityOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"EqualityOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1284:2: ( (lv_rightExpr_3_0= ruleShiftExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1285:1: (lv_rightExpr_3_0= ruleShiftExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1285:1: (lv_rightExpr_3_0= ruleShiftExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1286:3: lv_rightExpr_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightExprShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleEqualityExpression2696);
            	    lv_rightExpr_3_0=ruleShiftExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"ShiftExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleShiftOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1310:1: entryRuleShiftOperator returns [String current=null] : iv_ruleShiftOperator= ruleShiftOperator EOF ;
    public final String entryRuleShiftOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShiftOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1311:1: (iv_ruleShiftOperator= ruleShiftOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1312:2: iv_ruleShiftOperator= ruleShiftOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleShiftOperator_in_entryRuleShiftOperator2734);
            iv_ruleShiftOperator=ruleShiftOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftOperator2745); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShiftOperator"


    // $ANTLR start "ruleShiftOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1319:1: ruleShiftOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_29 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleShiftOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1323:6: ( (kw= KEYWORD_29 | kw= KEYWORD_37 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1324:1: (kw= KEYWORD_29 | kw= KEYWORD_37 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1324:1: (kw= KEYWORD_29 | kw= KEYWORD_37 )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_29) ) {
                alt28=1;
            }
            else if ( (LA28_0==KEYWORD_37) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1325:2: kw= KEYWORD_29
                    {
                    kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleShiftOperator2783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getShiftOperatorAccess().getLessThanSignLessThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1332:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleShiftOperator2802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getShiftOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_1()); 
                          
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
    // $ANTLR end "ruleShiftOperator"


    // $ANTLR start "entryRuleShiftExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1345:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1346:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1347:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression2841);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression2851); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShiftExpression"


    // $ANTLR start "ruleShiftExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1354:1: ruleShiftExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1357:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1358:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1358:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1359:2: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression2901);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AdditiveExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1370:1: ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==KEYWORD_29) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred34_InternalPPParser()) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==KEYWORD_37) ) {
                    int LA29_3 = input.LA(2);

                    if ( (synpred34_InternalPPParser()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1370:2: () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1370:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1371:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1379:2: ( (lv_opName_2_0= ruleShiftOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1380:1: (lv_opName_2_0= ruleShiftOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1380:1: (lv_opName_2_0= ruleShiftOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1381:3: lv_opName_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOpNameShiftOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression2934);
            	    lv_opName_2_0=ruleShiftOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"ShiftOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1397:2: ( (lv_rightExpr_3_0= ruleAdditiveExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1398:1: (lv_rightExpr_3_0= ruleAdditiveExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1398:1: (lv_rightExpr_3_0= ruleAdditiveExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1399:3: lv_rightExpr_3_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression2955);
            	    lv_rightExpr_3_0=ruleAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"AdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleAdditiveOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1423:1: entryRuleAdditiveOperator returns [String current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final String entryRuleAdditiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1424:1: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1425:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveOperator_in_entryRuleAdditiveOperator2993);
            iv_ruleAdditiveOperator=ruleAdditiveOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveOperator3004); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdditiveOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1432:1: ruleAdditiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_7 | kw= KEYWORD_9 ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1436:6: ( (kw= KEYWORD_7 | kw= KEYWORD_9 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1437:1: (kw= KEYWORD_7 | kw= KEYWORD_9 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1437:1: (kw= KEYWORD_7 | kw= KEYWORD_9 )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_7) ) {
                alt30=1;
            }
            else if ( (LA30_0==KEYWORD_9) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1438:2: kw= KEYWORD_7
                    {
                    kw=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleAdditiveOperator3042); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1445:2: kw= KEYWORD_9
                    {
                    kw=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleAdditiveOperator3061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getHyphenMinusKeyword_1()); 
                          
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
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1458:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1459:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1460:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3100);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression3110); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1467:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1470:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1471:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1471:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1472:2: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3160);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_MultiplicativeExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1483:1: ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==KEYWORD_9) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred36_InternalPPParser()) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==KEYWORD_7) ) {
                    int LA31_3 = input.LA(2);

                    if ( (synpred36_InternalPPParser()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1483:2: () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1483:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1484:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1492:2: ( (lv_opName_2_0= ruleAdditiveOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1493:1: (lv_opName_2_0= ruleAdditiveOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1493:1: (lv_opName_2_0= ruleAdditiveOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1494:3: lv_opName_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpNameAdditiveOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleAdditiveExpression3193);
            	    lv_opName_2_0=ruleAdditiveOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"AdditiveOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1510:2: ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1511:1: (lv_rightExpr_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1511:1: (lv_rightExpr_3_0= ruleMultiplicativeExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1512:3: lv_rightExpr_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExprMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3214);
            	    lv_rightExpr_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"MultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1536:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1537:1: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1538:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeOperator_in_entryRuleMultiplicativeOperator3252);
            iv_ruleMultiplicativeOperator=ruleMultiplicativeOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeOperator3263); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicativeOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1545:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_6 | kw= KEYWORD_10 ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1549:6: ( (kw= KEYWORD_6 | kw= KEYWORD_10 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1550:1: (kw= KEYWORD_6 | kw= KEYWORD_10 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1550:1: (kw= KEYWORD_6 | kw= KEYWORD_10 )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_6) ) {
                alt32=1;
            }
            else if ( (LA32_0==KEYWORD_10) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1551:2: kw= KEYWORD_6
                    {
                    kw=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleMultiplicativeOperator3301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1558:2: kw= KEYWORD_10
                    {
                    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleMultiplicativeOperator3320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1()); 
                          
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
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1571:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1572:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1573:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3359);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression3369); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1580:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_MatchingExpression_0= ruleMatchingExpression ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MatchingExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1583:28: ( (this_MatchingExpression_0= ruleMatchingExpression ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1584:1: (this_MatchingExpression_0= ruleMatchingExpression ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1584:1: (this_MatchingExpression_0= ruleMatchingExpression ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1585:2: this_MatchingExpression_0= ruleMatchingExpression ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMatchingExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMatchingExpression_in_ruleMultiplicativeExpression3419);
            this_MatchingExpression_0=ruleMatchingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_MatchingExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1596:1: ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==KEYWORD_6) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred38_InternalPPParser()) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==KEYWORD_10) ) {
                    int LA33_3 = input.LA(2);

                    if ( (synpred38_InternalPPParser()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1596:2: () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1596:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1597:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1605:2: ( (lv_opName_2_0= ruleMultiplicativeOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1606:1: (lv_opName_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1606:1: (lv_opName_2_0= ruleMultiplicativeOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1607:3: lv_opName_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpNameMultiplicativeOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleMultiplicativeExpression3452);
            	    lv_opName_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"MultiplicativeOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1623:2: ( (lv_rightExpr_3_0= ruleMatchingExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1624:1: (lv_rightExpr_3_0= ruleMatchingExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1624:1: (lv_rightExpr_3_0= ruleMatchingExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1625:3: lv_rightExpr_3_0= ruleMatchingExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightExprMatchingExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMatchingExpression_in_ruleMultiplicativeExpression3473);
            	    lv_rightExpr_3_0=ruleMatchingExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"MatchingExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMatchingOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1649:1: entryRuleMatchingOperator returns [String current=null] : iv_ruleMatchingOperator= ruleMatchingOperator EOF ;
    public final String entryRuleMatchingOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMatchingOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1650:1: (iv_ruleMatchingOperator= ruleMatchingOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1651:2: iv_ruleMatchingOperator= ruleMatchingOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchingOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMatchingOperator_in_entryRuleMatchingOperator3511);
            iv_ruleMatchingOperator=ruleMatchingOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchingOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchingOperator3522); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMatchingOperator"


    // $ANTLR start "ruleMatchingOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1658:1: ruleMatchingOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_35 | kw= KEYWORD_23 ) ;
    public final AntlrDatatypeRuleToken ruleMatchingOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1662:6: ( (kw= KEYWORD_35 | kw= KEYWORD_23 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1663:1: (kw= KEYWORD_35 | kw= KEYWORD_23 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1663:1: (kw= KEYWORD_35 | kw= KEYWORD_23 )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_35) ) {
                alt34=1;
            }
            else if ( (LA34_0==KEYWORD_23) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1664:2: kw= KEYWORD_35
                    {
                    kw=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleMatchingOperator3560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMatchingOperatorAccess().getEqualsSignTildeKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1671:2: kw= KEYWORD_23
                    {
                    kw=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleMatchingOperator3579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMatchingOperatorAccess().getExclamationMarkTildeKeyword_1()); 
                          
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
    // $ANTLR end "ruleMatchingOperator"


    // $ANTLR start "entryRuleMatchingExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1684:1: entryRuleMatchingExpression returns [EObject current=null] : iv_ruleMatchingExpression= ruleMatchingExpression EOF ;
    public final EObject entryRuleMatchingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchingExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1685:2: (iv_ruleMatchingExpression= ruleMatchingExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1686:2: iv_ruleMatchingExpression= ruleMatchingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMatchingExpression_in_entryRuleMatchingExpression3618);
            iv_ruleMatchingExpression=ruleMatchingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchingExpression3628); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMatchingExpression"


    // $ANTLR start "ruleMatchingExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1693:1: ruleMatchingExpression returns [EObject current=null] : (this_InExpression_0= ruleInExpression ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )* ) ;
    public final EObject ruleMatchingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1696:28: ( (this_InExpression_0= ruleInExpression ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1697:1: (this_InExpression_0= ruleInExpression ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1697:1: (this_InExpression_0= ruleInExpression ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1698:2: this_InExpression_0= ruleInExpression ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMatchingExpressionAccess().getInExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleInExpression_in_ruleMatchingExpression3678);
            this_InExpression_0=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_InExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1709:1: ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==KEYWORD_35) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred40_InternalPPParser()) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==KEYWORD_23) ) {
                    int LA35_3 = input.LA(2);

                    if ( (synpred40_InternalPPParser()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1709:2: () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1709:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1710:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMatchingExpressionAccess().getMatchingExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1718:2: ( (lv_opName_2_0= ruleMatchingOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1719:1: (lv_opName_2_0= ruleMatchingOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1719:1: (lv_opName_2_0= ruleMatchingOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1720:3: lv_opName_2_0= ruleMatchingOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMatchingExpressionAccess().getOpNameMatchingOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMatchingOperator_in_ruleMatchingExpression3711);
            	    lv_opName_2_0=ruleMatchingOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMatchingExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"MatchingOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1736:2: ( (lv_rightExpr_3_0= ruleLiteralRegex ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1737:1: (lv_rightExpr_3_0= ruleLiteralRegex )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1737:1: (lv_rightExpr_3_0= ruleLiteralRegex )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1738:3: lv_rightExpr_3_0= ruleLiteralRegex
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMatchingExpressionAccess().getRightExprLiteralRegexParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLiteralRegex_in_ruleMatchingExpression3732);
            	    lv_rightExpr_3_0=ruleLiteralRegex();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMatchingExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"LiteralRegex");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleMatchingExpression"


    // $ANTLR start "entryRuleInExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1762:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1763:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1764:2: iv_ruleInExpression= ruleInExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInExpression_in_entryRuleInExpression3769);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpression3779); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInExpression"


    // $ANTLR start "ruleInExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1771:1: ruleInExpression returns [EObject current=null] : (this_UnaryOrHigherExpression_0= ruleUnaryOrHigherExpression ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )* ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        Token lv_opName_2_0=null;
        EObject this_UnaryOrHigherExpression_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1774:28: ( (this_UnaryOrHigherExpression_0= ruleUnaryOrHigherExpression ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1775:1: (this_UnaryOrHigherExpression_0= ruleUnaryOrHigherExpression ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1775:1: (this_UnaryOrHigherExpression_0= ruleUnaryOrHigherExpression ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1776:2: this_UnaryOrHigherExpression_0= ruleUnaryOrHigherExpression ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInExpressionAccess().getUnaryOrHigherExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOrHigherExpression_in_ruleInExpression3829);
            this_UnaryOrHigherExpression_0=ruleUnaryOrHigherExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_UnaryOrHigherExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1787:1: ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==KEYWORD_43) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred41_InternalPPParser()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1787:2: () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1787:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1788:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getInExpressionAccess().getInExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1796:2: ( (lv_opName_2_0= KEYWORD_43 ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1797:1: (lv_opName_2_0= KEYWORD_43 )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1797:1: (lv_opName_2_0= KEYWORD_43 )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1798:3: lv_opName_2_0= KEYWORD_43
            	    {
            	    lv_opName_2_0=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleInExpression3860); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_opName_2_0, grammarAccess.getInExpressionAccess().getOpNameInKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getInExpressionRule());
            	      	        }
            	             		setWithLastConsumed(current, "opName", lv_opName_2_0, "in");
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1812:2: ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1813:1: (lv_rightExpr_3_0= ruleUnaryOrHigherExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1813:1: (lv_rightExpr_3_0= ruleUnaryOrHigherExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1814:3: lv_rightExpr_3_0= ruleUnaryOrHigherExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInExpressionAccess().getRightExprUnaryOrHigherExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOrHigherExpression_in_ruleInExpression3892);
            	    lv_rightExpr_3_0=ruleUnaryOrHigherExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"UnaryOrHigherExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end "ruleInExpression"


    // $ANTLR start "entryRuleUnaryOrHigherExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1838:1: entryRuleUnaryOrHigherExpression returns [EObject current=null] : iv_ruleUnaryOrHigherExpression= ruleUnaryOrHigherExpression EOF ;
    public final EObject entryRuleUnaryOrHigherExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrHigherExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1839:2: (iv_ruleUnaryOrHigherExpression= ruleUnaryOrHigherExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1840:2: iv_ruleUnaryOrHigherExpression= ruleUnaryOrHigherExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOrHigherExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOrHigherExpression_in_entryRuleUnaryOrHigherExpression3929);
            iv_ruleUnaryOrHigherExpression=ruleUnaryOrHigherExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOrHigherExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOrHigherExpression3939); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryOrHigherExpression"


    // $ANTLR start "ruleUnaryOrHigherExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1847:1: ruleUnaryOrHigherExpression returns [EObject current=null] : (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_NotExpression_1= ruleNotExpression | this_CollectExpression_2= ruleCollectExpression ) ;
    public final EObject ruleUnaryOrHigherExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryMinusExpression_0 = null;

        EObject this_NotExpression_1 = null;

        EObject this_CollectExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1850:28: ( (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_NotExpression_1= ruleNotExpression | this_CollectExpression_2= ruleCollectExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1851:1: (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_NotExpression_1= ruleNotExpression | this_CollectExpression_2= ruleCollectExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1851:1: (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_NotExpression_1= ruleNotExpression | this_CollectExpression_2= ruleCollectExpression )
            int alt37=3;
            switch ( input.LA(1) ) {
            case KEYWORD_9:
                {
                alt37=1;
                }
                break;
            case KEYWORD_1:
                {
                alt37=2;
                }
                break;
            case KEYWORD_61:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_55:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_51:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_24:
            case KEYWORD_42:
            case KEYWORD_2:
            case KEYWORD_3:
            case KEYWORD_4:
            case KEYWORD_17:
            case KEYWORD_18:
            case KEYWORD_20:
            case RULE_DOLLAR_VAR:
            case RULE_WORD_CHARS:
            case RULE_REGULAR_EXPRESSION:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1852:2: this_UnaryMinusExpression_0= ruleUnaryMinusExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOrHigherExpressionAccess().getUnaryMinusExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryMinusExpression_in_ruleUnaryOrHigherExpression3989);
                    this_UnaryMinusExpression_0=ruleUnaryMinusExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_UnaryMinusExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1865:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOrHigherExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleUnaryOrHigherExpression4019);
                    this_NotExpression_1=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_NotExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1878:2: this_CollectExpression_2= ruleCollectExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOrHigherExpressionAccess().getCollectExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectExpression_in_ruleUnaryOrHigherExpression4049);
                    this_CollectExpression_2=ruleCollectExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_CollectExpression_2;
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleUnaryOrHigherExpression"


    // $ANTLR start "entryRuleUnaryMinusExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1897:1: entryRuleUnaryMinusExpression returns [EObject current=null] : iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF ;
    public final EObject entryRuleUnaryMinusExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryMinusExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1898:2: (iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1899:2: iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryMinusExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryMinusExpression_in_entryRuleUnaryMinusExpression4083);
            iv_ruleUnaryMinusExpression=ruleUnaryMinusExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryMinusExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryMinusExpression4093); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryMinusExpression"


    // $ANTLR start "ruleUnaryMinusExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1906:1: ruleUnaryMinusExpression returns [EObject current=null] : (otherlv_0= KEYWORD_9 ( (lv_expr_1_0= ruleCollectExpression ) ) ) ;
    public final EObject ruleUnaryMinusExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1909:28: ( (otherlv_0= KEYWORD_9 ( (lv_expr_1_0= ruleCollectExpression ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1910:1: (otherlv_0= KEYWORD_9 ( (lv_expr_1_0= ruleCollectExpression ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1910:1: (otherlv_0= KEYWORD_9 ( (lv_expr_1_0= ruleCollectExpression ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1911:2: otherlv_0= KEYWORD_9 ( (lv_expr_1_0= ruleCollectExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleUnaryMinusExpression4131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnaryMinusExpressionAccess().getHyphenMinusKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1915:1: ( (lv_expr_1_0= ruleCollectExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1916:1: (lv_expr_1_0= ruleCollectExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1916:1: (lv_expr_1_0= ruleCollectExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1917:3: lv_expr_1_0= ruleCollectExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryMinusExpressionAccess().getExprCollectExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCollectExpression_in_ruleUnaryMinusExpression4151);
            lv_expr_1_0=ruleCollectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnaryMinusExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"CollectExpression");
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
    // $ANTLR end "ruleUnaryMinusExpression"


    // $ANTLR start "entryRuleNotExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1941:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1942:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1943:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression4186);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression4196); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1950:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= KEYWORD_1 ( (lv_expr_1_0= ruleCollectExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1953:28: ( (otherlv_0= KEYWORD_1 ( (lv_expr_1_0= ruleCollectExpression ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1954:1: (otherlv_0= KEYWORD_1 ( (lv_expr_1_0= ruleCollectExpression ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1954:1: (otherlv_0= KEYWORD_1 ( (lv_expr_1_0= ruleCollectExpression ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1955:2: otherlv_0= KEYWORD_1 ( (lv_expr_1_0= ruleCollectExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleNotExpression4234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getExclamationMarkKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1959:1: ( (lv_expr_1_0= ruleCollectExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1960:1: (lv_expr_1_0= ruleCollectExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1960:1: (lv_expr_1_0= ruleCollectExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1961:3: lv_expr_1_0= ruleCollectExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNotExpressionAccess().getExprCollectExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCollectExpression_in_ruleNotExpression4254);
            lv_expr_1_0=ruleCollectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNotExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"CollectExpression");
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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleCollectExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1985:1: entryRuleCollectExpression returns [EObject current=null] : iv_ruleCollectExpression= ruleCollectExpression EOF ;
    public final EObject entryRuleCollectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1986:2: (iv_ruleCollectExpression= ruleCollectExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1987:2: iv_ruleCollectExpression= ruleCollectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCollectExpression_in_entryRuleCollectExpression4289);
            iv_ruleCollectExpression=ruleCollectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectExpression4299); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectExpression"


    // $ANTLR start "ruleCollectExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1994:1: ruleCollectExpression returns [EObject current=null] : (this_SelectorExpression_0= ruleSelectorExpression ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )? ) ;
    public final EObject ruleCollectExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_SelectorExpression_0 = null;

        EObject lv_query_2_0 = null;

        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1997:28: ( (this_SelectorExpression_0= ruleSelectorExpression ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1998:1: (this_SelectorExpression_0= ruleSelectorExpression ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1998:1: (this_SelectorExpression_0= ruleSelectorExpression ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1999:2: this_SelectorExpression_0= ruleSelectorExpression ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCollectExpressionAccess().getSelectorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectorExpression_in_ruleCollectExpression4349);
            this_SelectorExpression_0=ruleSelectorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SelectorExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2010:1: ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==KEYWORD_31) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred46_InternalPPParser()) ) {
                    alt40=1;
                }
            }
            else if ( (LA40_0==KEYWORD_47) ) {
                int LA40_2 = input.LA(2);

                if ( (synpred46_InternalPPParser()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2010:2: () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )?
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2010:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2011:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCollectExpressionAccess().getCollectExpressionClassReferenceAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2019:2: ( (lv_query_2_0= ruleCollectQuery ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2020:1: (lv_query_2_0= ruleCollectQuery )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2020:1: (lv_query_2_0= ruleCollectQuery )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2021:3: lv_query_2_0= ruleCollectQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectExpressionAccess().getQueryCollectQueryParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollectQuery_in_ruleCollectExpression4382);
                    lv_query_2_0=ruleCollectQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"query",
                              		lv_query_2_0, 
                              		"CollectQuery");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2037:2: (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )?
                    int alt39=2;
                    alt39 = dfa39.predict(input);
                    switch (alt39) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2038:2: otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21
                            {
                            otherlv_3=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleCollectExpression4396); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getCollectExpressionAccess().getLeftCurlyBracketKeyword_1_2_0());
                                  
                            }
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2042:1: ( (lv_attributes_4_0= ruleAttributeOperations ) )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==RULE_WORD_CHARS) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2043:1: (lv_attributes_4_0= ruleAttributeOperations )
                                    {
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2043:1: (lv_attributes_4_0= ruleAttributeOperations )
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2044:3: lv_attributes_4_0= ruleAttributeOperations
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getCollectExpressionAccess().getAttributesAttributeOperationsParserRuleCall_1_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleAttributeOperations_in_ruleCollectExpression4416);
                                    lv_attributes_4_0=ruleAttributeOperations();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getCollectExpressionRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"attributes",
                                              		lv_attributes_4_0, 
                                              		"AttributeOperations");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }

                            otherlv_5=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleCollectExpression4430); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getCollectExpressionAccess().getRightCurlyBracketKeyword_1_2_2());
                                  
                            }

                            }
                            break;

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
    // $ANTLR end "ruleCollectExpression"


    // $ANTLR start "entryRuleCollectQuery"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2073:1: entryRuleCollectQuery returns [EObject current=null] : iv_ruleCollectQuery= ruleCollectQuery EOF ;
    public final EObject entryRuleCollectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectQuery = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2074:2: (iv_ruleCollectQuery= ruleCollectQuery EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2075:2: iv_ruleCollectQuery= ruleCollectQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectQueryRule()); 
            }
            pushFollow(FOLLOW_ruleCollectQuery_in_entryRuleCollectQuery4468);
            iv_ruleCollectQuery=ruleCollectQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectQuery4478); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectQuery"


    // $ANTLR start "ruleCollectQuery"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2082:1: ruleCollectQuery returns [EObject current=null] : (this_VirtualCollectQuery_0= ruleVirtualCollectQuery | this_ExportedCollectQuery_1= ruleExportedCollectQuery ) ;
    public final EObject ruleCollectQuery() throws RecognitionException {
        EObject current = null;

        EObject this_VirtualCollectQuery_0 = null;

        EObject this_ExportedCollectQuery_1 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2085:28: ( (this_VirtualCollectQuery_0= ruleVirtualCollectQuery | this_ExportedCollectQuery_1= ruleExportedCollectQuery ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2086:1: (this_VirtualCollectQuery_0= ruleVirtualCollectQuery | this_ExportedCollectQuery_1= ruleExportedCollectQuery )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2086:1: (this_VirtualCollectQuery_0= ruleVirtualCollectQuery | this_ExportedCollectQuery_1= ruleExportedCollectQuery )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEYWORD_31) ) {
                alt41=1;
            }
            else if ( (LA41_0==KEYWORD_47) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2087:2: this_VirtualCollectQuery_0= ruleVirtualCollectQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCollectQueryAccess().getVirtualCollectQueryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVirtualCollectQuery_in_ruleCollectQuery4528);
                    this_VirtualCollectQuery_0=ruleVirtualCollectQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_VirtualCollectQuery_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2100:2: this_ExportedCollectQuery_1= ruleExportedCollectQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCollectQueryAccess().getExportedCollectQueryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExportedCollectQuery_in_ruleCollectQuery4558);
                    this_ExportedCollectQuery_1=ruleExportedCollectQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ExportedCollectQuery_1;
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleCollectQuery"


    // $ANTLR start "entryRuleVirtualCollectQuery"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2119:1: entryRuleVirtualCollectQuery returns [EObject current=null] : iv_ruleVirtualCollectQuery= ruleVirtualCollectQuery EOF ;
    public final EObject entryRuleVirtualCollectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVirtualCollectQuery = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2120:2: (iv_ruleVirtualCollectQuery= ruleVirtualCollectQuery EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2121:2: iv_ruleVirtualCollectQuery= ruleVirtualCollectQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVirtualCollectQueryRule()); 
            }
            pushFollow(FOLLOW_ruleVirtualCollectQuery_in_entryRuleVirtualCollectQuery4592);
            iv_ruleVirtualCollectQuery=ruleVirtualCollectQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVirtualCollectQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVirtualCollectQuery4602); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVirtualCollectQuery"


    // $ANTLR start "ruleVirtualCollectQuery"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2128:1: ruleVirtualCollectQuery returns [EObject current=null] : ( () otherlv_1= KEYWORD_31 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_45 ) ;
    public final EObject ruleVirtualCollectQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2131:28: ( ( () otherlv_1= KEYWORD_31 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_45 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2132:1: ( () otherlv_1= KEYWORD_31 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_45 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2132:1: ( () otherlv_1= KEYWORD_31 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_45 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2132:2: () otherlv_1= KEYWORD_31 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_45
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2132:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2133:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVirtualCollectQueryAccess().getVirtualCollectQueryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleVirtualCollectQuery4652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVirtualCollectQueryAccess().getLessThanSignVerticalLineKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2146:1: ( (lv_expr_2_0= ruleExpression ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=KEYWORD_61 && LA42_0<=KEYWORD_55)||(LA42_0>=KEYWORD_57 && LA42_0<=KEYWORD_51)||(LA42_0>=KEYWORD_53 && LA42_0<=KEYWORD_54)||LA42_0==KEYWORD_24||LA42_0==KEYWORD_42||(LA42_0>=KEYWORD_1 && LA42_0<=KEYWORD_4)||LA42_0==KEYWORD_9||(LA42_0>=KEYWORD_17 && LA42_0<=KEYWORD_18)||LA42_0==KEYWORD_20||(LA42_0>=RULE_DOLLAR_VAR && LA42_0<=RULE_WORD_CHARS)||LA42_0==RULE_REGULAR_EXPRESSION) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2147:1: (lv_expr_2_0= ruleExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2147:1: (lv_expr_2_0= ruleExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2148:3: lv_expr_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVirtualCollectQueryAccess().getExprExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVirtualCollectQuery4672);
                    lv_expr_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVirtualCollectQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleVirtualCollectQuery4686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVirtualCollectQueryAccess().getVerticalLineGreaterThanSignKeyword_3());
                  
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
    // $ANTLR end "ruleVirtualCollectQuery"


    // $ANTLR start "entryRuleExportedCollectQuery"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2177:1: entryRuleExportedCollectQuery returns [EObject current=null] : iv_ruleExportedCollectQuery= ruleExportedCollectQuery EOF ;
    public final EObject entryRuleExportedCollectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportedCollectQuery = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2178:2: (iv_ruleExportedCollectQuery= ruleExportedCollectQuery EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2179:2: iv_ruleExportedCollectQuery= ruleExportedCollectQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExportedCollectQueryRule()); 
            }
            pushFollow(FOLLOW_ruleExportedCollectQuery_in_entryRuleExportedCollectQuery4720);
            iv_ruleExportedCollectQuery=ruleExportedCollectQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExportedCollectQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExportedCollectQuery4730); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExportedCollectQuery"


    // $ANTLR start "ruleExportedCollectQuery"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2186:1: ruleExportedCollectQuery returns [EObject current=null] : ( () otherlv_1= KEYWORD_47 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_50 ) ;
    public final EObject ruleExportedCollectQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2189:28: ( ( () otherlv_1= KEYWORD_47 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_50 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2190:1: ( () otherlv_1= KEYWORD_47 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_50 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2190:1: ( () otherlv_1= KEYWORD_47 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_50 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2190:2: () otherlv_1= KEYWORD_47 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_50
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2190:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2191:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExportedCollectQueryAccess().getExportedCollectQueryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleExportedCollectQuery4780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExportedCollectQueryAccess().getLessThanSignLessThanSignVerticalLineKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2204:1: ( (lv_expr_2_0= ruleExpression ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=KEYWORD_61 && LA43_0<=KEYWORD_55)||(LA43_0>=KEYWORD_57 && LA43_0<=KEYWORD_51)||(LA43_0>=KEYWORD_53 && LA43_0<=KEYWORD_54)||LA43_0==KEYWORD_24||LA43_0==KEYWORD_42||(LA43_0>=KEYWORD_1 && LA43_0<=KEYWORD_4)||LA43_0==KEYWORD_9||(LA43_0>=KEYWORD_17 && LA43_0<=KEYWORD_18)||LA43_0==KEYWORD_20||(LA43_0>=RULE_DOLLAR_VAR && LA43_0<=RULE_WORD_CHARS)||LA43_0==RULE_REGULAR_EXPRESSION) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2205:1: (lv_expr_2_0= ruleExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2205:1: (lv_expr_2_0= ruleExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2206:3: lv_expr_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExportedCollectQueryAccess().getExprExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExportedCollectQuery4800);
                    lv_expr_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExportedCollectQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleExportedCollectQuery4814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExportedCollectQueryAccess().getVerticalLineGreaterThanSignGreaterThanSignKeyword_3());
                  
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
    // $ANTLR end "ruleExportedCollectQuery"


    // $ANTLR start "entryRuleSelectorExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2235:1: entryRuleSelectorExpression returns [EObject current=null] : iv_ruleSelectorExpression= ruleSelectorExpression EOF ;
    public final EObject entryRuleSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2236:2: (iv_ruleSelectorExpression= ruleSelectorExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2237:2: iv_ruleSelectorExpression= ruleSelectorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectorExpression_in_entryRuleSelectorExpression4848);
            iv_ruleSelectorExpression=ruleSelectorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectorExpression4858); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectorExpression"


    // $ANTLR start "ruleSelectorExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2244:1: ruleSelectorExpression returns [EObject current=null] : (this_AtExpression_0= ruleAtExpression ( () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 ) | ( (lv_parameters_10_0= ruleSelectorEntry ) ) ) )? ) ;
    public final EObject ruleSelectorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject this_AtExpression_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2247:28: ( (this_AtExpression_0= ruleAtExpression ( () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 ) | ( (lv_parameters_10_0= ruleSelectorEntry ) ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2248:1: (this_AtExpression_0= ruleAtExpression ( () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 ) | ( (lv_parameters_10_0= ruleSelectorEntry ) ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2248:1: (this_AtExpression_0= ruleAtExpression ( () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 ) | ( (lv_parameters_10_0= ruleSelectorEntry ) ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2249:2: this_AtExpression_0= ruleAtExpression ( () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 ) | ( (lv_parameters_10_0= ruleSelectorEntry ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectorExpressionAccess().getAtExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAtExpression_in_ruleSelectorExpression4908);
            this_AtExpression_0=ruleAtExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AtExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2260:1: ( () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 ) | ( (lv_parameters_10_0= ruleSelectorEntry ) ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KEYWORD_16) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2260:2: () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 ) | ( (lv_parameters_10_0= ruleSelectorEntry ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2260:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2261:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getSelectorExpressionAccess().getSelectorExpressionLeftExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleSelectorExpression4933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSelectorExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2274:1: ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 ) | ( (lv_parameters_10_0= ruleSelectorEntry ) ) )
                    int alt46=2;
                    alt46 = dfa46.predict(input);
                    switch (alt46) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2274:2: (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2274:2: (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2275:2: otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21
                            {
                            otherlv_3=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleSelectorExpression4947); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getSelectorExpressionAccess().getLeftCurlyBracketKeyword_1_2_0_0());
                                  
                            }
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2279:1: ( (lv_parameters_4_0= ruleSelectorEntry ) )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2280:1: (lv_parameters_4_0= ruleSelectorEntry )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2280:1: (lv_parameters_4_0= ruleSelectorEntry )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2281:3: lv_parameters_4_0= ruleSelectorEntry
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectorExpressionAccess().getParametersSelectorEntryParserRuleCall_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression4967);
                            lv_parameters_4_0=ruleSelectorEntry();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSelectorExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_4_0, 
                                      		"SelectorEntry");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2297:2: ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )*
                            loop44:
                            do {
                                int alt44=3;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==KEYWORD_8) ) {
                                    int LA44_1 = input.LA(2);

                                    if ( ((LA44_1>=KEYWORD_61 && LA44_1<=KEYWORD_55)||(LA44_1>=KEYWORD_57 && LA44_1<=KEYWORD_51)||(LA44_1>=KEYWORD_53 && LA44_1<=KEYWORD_54)||LA44_1==KEYWORD_24||LA44_1==KEYWORD_42||(LA44_1>=KEYWORD_1 && LA44_1<=KEYWORD_4)||LA44_1==KEYWORD_9||(LA44_1>=KEYWORD_17 && LA44_1<=KEYWORD_18)||LA44_1==KEYWORD_20||(LA44_1>=RULE_DOLLAR_VAR && LA44_1<=RULE_WORD_CHARS)||LA44_1==RULE_REGULAR_EXPRESSION) ) {
                                        alt44=1;
                                    }


                                }
                                else if ( ((LA44_0>=KEYWORD_61 && LA44_0<=KEYWORD_55)||(LA44_0>=KEYWORD_57 && LA44_0<=KEYWORD_51)||(LA44_0>=KEYWORD_53 && LA44_0<=KEYWORD_54)||LA44_0==KEYWORD_24||LA44_0==KEYWORD_42||(LA44_0>=KEYWORD_1 && LA44_0<=KEYWORD_4)||LA44_0==KEYWORD_9||(LA44_0>=KEYWORD_17 && LA44_0<=KEYWORD_18)||LA44_0==KEYWORD_20||(LA44_0>=RULE_DOLLAR_VAR && LA44_0<=RULE_WORD_CHARS)||LA44_0==RULE_REGULAR_EXPRESSION) ) {
                                    alt44=2;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2297:3: (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )
                            	    {
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2297:3: (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2298:2: otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) )
                            	    {
                            	    otherlv_5=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleSelectorExpression4982); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getSelectorExpressionAccess().getCommaKeyword_1_2_0_2_0_0());
                            	          
                            	    }
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2302:1: ( (lv_parameters_6_0= ruleSelectorEntry ) )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2303:1: (lv_parameters_6_0= ruleSelectorEntry )
                            	    {
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2303:1: (lv_parameters_6_0= ruleSelectorEntry )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2304:3: lv_parameters_6_0= ruleSelectorEntry
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSelectorExpressionAccess().getParametersSelectorEntryParserRuleCall_1_2_0_2_0_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression5002);
                            	    lv_parameters_6_0=ruleSelectorEntry();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSelectorExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_6_0, 
                            	              		"SelectorEntry");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 2 :
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2321:6: ( (lv_parameters_7_0= ruleSelectorEntry ) )
                            	    {
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2321:6: ( (lv_parameters_7_0= ruleSelectorEntry ) )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2322:1: (lv_parameters_7_0= ruleSelectorEntry )
                            	    {
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2322:1: (lv_parameters_7_0= ruleSelectorEntry )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2323:3: lv_parameters_7_0= ruleSelectorEntry
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSelectorExpressionAccess().getParametersSelectorEntryParserRuleCall_1_2_0_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression5030);
                            	    lv_parameters_7_0=ruleSelectorEntry();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSelectorExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_7_0, 
                            	              		"SelectorEntry");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);

                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2339:4: (otherlv_8= KEYWORD_8 )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==KEYWORD_8) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2340:2: otherlv_8= KEYWORD_8
                                    {
                                    otherlv_8=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleSelectorExpression5046); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_8, grammarAccess.getSelectorExpressionAccess().getCommaKeyword_1_2_0_3());
                                          
                                    }

                                    }
                                    break;

                            }

                            otherlv_9=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleSelectorExpression5060); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getSelectorExpressionAccess().getRightCurlyBracketKeyword_1_2_0_4());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2350:6: ( (lv_parameters_10_0= ruleSelectorEntry ) )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2350:6: ( (lv_parameters_10_0= ruleSelectorEntry ) )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2351:1: (lv_parameters_10_0= ruleSelectorEntry )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2351:1: (lv_parameters_10_0= ruleSelectorEntry )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2352:3: lv_parameters_10_0= ruleSelectorEntry
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectorExpressionAccess().getParametersSelectorEntryParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression5087);
                            lv_parameters_10_0=ruleSelectorEntry();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSelectorExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_10_0, 
                                      		"SelectorEntry");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleSelectorExpression"


    // $ANTLR start "entryRuleSelectorEntry"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2376:1: entryRuleSelectorEntry returns [EObject current=null] : iv_ruleSelectorEntry= ruleSelectorEntry EOF ;
    public final EObject entryRuleSelectorEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorEntry = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2377:2: (iv_ruleSelectorEntry= ruleSelectorEntry EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2378:2: iv_ruleSelectorEntry= ruleSelectorEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectorEntryRule()); 
            }
            pushFollow(FOLLOW_ruleSelectorEntry_in_entryRuleSelectorEntry5125);
            iv_ruleSelectorEntry=ruleSelectorEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectorEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectorEntry5135); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectorEntry"


    // $ANTLR start "ruleSelectorEntry"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2385:1: ruleSelectorEntry returns [EObject current=null] : (this_Expression_0= ruleExpression ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleSelectorEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2388:28: ( (this_Expression_0= ruleExpression ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2389:1: (this_Expression_0= ruleExpression ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2389:1: (this_Expression_0= ruleExpression ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2390:2: this_Expression_0= ruleExpression ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectorEntryAccess().getExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSelectorEntry5185);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_Expression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2401:1: ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==KEYWORD_34) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred55_InternalPPParser()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2401:2: () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2401:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2402:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getSelectorEntryAccess().getSelectorEntryLeftExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleSelectorEntry5210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSelectorEntryAccess().getEqualsSignGreaterThanSignKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2415:1: ( (lv_rightExpr_3_0= ruleExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2416:1: (lv_rightExpr_3_0= ruleExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2416:1: (lv_rightExpr_3_0= ruleExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2417:3: lv_rightExpr_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorEntryAccess().getRightExprExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleSelectorEntry5230);
                    lv_rightExpr_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectorEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_3_0, 
                              		"Expression");
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
    // $ANTLR end "ruleSelectorEntry"


    // $ANTLR start "entryRuleAtExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2441:1: entryRuleAtExpression returns [EObject current=null] : iv_ruleAtExpression= ruleAtExpression EOF ;
    public final EObject entryRuleAtExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2442:2: (iv_ruleAtExpression= ruleAtExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2443:2: iv_ruleAtExpression= ruleAtExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtExpression_in_entryRuleAtExpression5267);
            iv_ruleAtExpression=ruleAtExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtExpression5277); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtExpression"


    // $ANTLR start "ruleAtExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2450:1: ruleAtExpression returns [EObject current=null] : (this_FunctionCall_0= ruleFunctionCall ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )* ) ;
    public final EObject ruleAtExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_FunctionCall_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2453:28: ( (this_FunctionCall_0= ruleFunctionCall ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2454:1: (this_FunctionCall_0= ruleFunctionCall ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2454:1: (this_FunctionCall_0= ruleFunctionCall ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2455:2: this_FunctionCall_0= ruleFunctionCall ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAtExpressionAccess().getFunctionCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_ruleAtExpression5327);
            this_FunctionCall_0=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_FunctionCall_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2466:1: ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )*
            loop51:
            do {
                int alt51=2;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2466:2: () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2466:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2467:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAtExpressionAccess().getAtExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleAtExpression5352); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAtExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	          
            	    }
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2480:1: ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( ((LA50_0>=KEYWORD_61 && LA50_0<=KEYWORD_55)||(LA50_0>=KEYWORD_57 && LA50_0<=KEYWORD_51)||(LA50_0>=KEYWORD_53 && LA50_0<=KEYWORD_54)||LA50_0==KEYWORD_24||LA50_0==KEYWORD_42||(LA50_0>=KEYWORD_1 && LA50_0<=KEYWORD_4)||LA50_0==KEYWORD_9||(LA50_0>=KEYWORD_17 && LA50_0<=KEYWORD_18)||LA50_0==KEYWORD_20||(LA50_0>=RULE_DOLLAR_VAR && LA50_0<=RULE_WORD_CHARS)||LA50_0==RULE_REGULAR_EXPRESSION) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2480:2: ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )*
            	            {
            	            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2480:2: ( (lv_parameters_3_0= ruleExpression ) )
            	            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2481:1: (lv_parameters_3_0= ruleExpression )
            	            {
            	            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2481:1: (lv_parameters_3_0= ruleExpression )
            	            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2482:3: lv_parameters_3_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAtExpressionAccess().getParametersExpressionParserRuleCall_1_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleAtExpression5373);
            	            lv_parameters_3_0=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getAtExpressionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"parameters",
            	                      		lv_parameters_3_0, 
            	                      		"Expression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2498:2: (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )*
            	            loop49:
            	            do {
            	                int alt49=2;
            	                int LA49_0 = input.LA(1);

            	                if ( (LA49_0==KEYWORD_8) ) {
            	                    alt49=1;
            	                }


            	                switch (alt49) {
            	            	case 1 :
            	            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2499:2: otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) )
            	            	    {
            	            	    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleAtExpression5387); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_4, grammarAccess.getAtExpressionAccess().getCommaKeyword_1_2_1_0());
            	            	          
            	            	    }
            	            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2503:1: ( (lv_parameters_5_0= ruleExpression ) )
            	            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2504:1: (lv_parameters_5_0= ruleExpression )
            	            	    {
            	            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2504:1: (lv_parameters_5_0= ruleExpression )
            	            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2505:3: lv_parameters_5_0= ruleExpression
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getAtExpressionAccess().getParametersExpressionParserRuleCall_1_2_1_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleExpression_in_ruleAtExpression5407);
            	            	    lv_parameters_5_0=ruleExpression();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getAtExpressionRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"parameters",
            	            	              		lv_parameters_5_0, 
            	            	              		"Expression");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop49;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleAtExpression5424); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getAtExpressionAccess().getRightSquareBracketKeyword_1_3());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // $ANTLR end "ruleAtExpression"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2534:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2535:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2536:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5460);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall5470); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2543:1: ruleFunctionCall returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )? )? otherlv_7= KEYWORD_5 )? ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2546:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )? )? otherlv_7= KEYWORD_5 )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2547:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )? )? otherlv_7= KEYWORD_5 )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2547:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )? )? otherlv_7= KEYWORD_5 )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2548:2: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )? )? otherlv_7= KEYWORD_5 )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionCallAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleFunctionCall5520);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_PrimaryExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2559:1: ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )? )? otherlv_7= KEYWORD_5 )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2559:2: () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )? )? otherlv_7= KEYWORD_5
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2559:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2560:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getFunctionCallAccess().getFunctionCallLeftExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleFunctionCall5545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2573:1: ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )? )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=KEYWORD_61 && LA54_0<=KEYWORD_55)||(LA54_0>=KEYWORD_57 && LA54_0<=KEYWORD_51)||(LA54_0>=KEYWORD_53 && LA54_0<=KEYWORD_54)||LA54_0==KEYWORD_24||LA54_0==KEYWORD_42||(LA54_0>=KEYWORD_1 && LA54_0<=KEYWORD_4)||LA54_0==KEYWORD_9||(LA54_0>=KEYWORD_17 && LA54_0<=KEYWORD_18)||LA54_0==KEYWORD_20||(LA54_0>=RULE_DOLLAR_VAR && LA54_0<=RULE_WORD_CHARS)||LA54_0==RULE_REGULAR_EXPRESSION) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2573:2: ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )?
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2573:2: ( (lv_parameters_3_0= ruleExpression ) )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2574:1: (lv_parameters_3_0= ruleExpression )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2574:1: (lv_parameters_3_0= ruleExpression )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2575:3: lv_parameters_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall5566);
                            lv_parameters_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_3_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2591:2: (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==KEYWORD_8) ) {
                                    int LA52_1 = input.LA(2);

                                    if ( ((LA52_1>=KEYWORD_61 && LA52_1<=KEYWORD_55)||(LA52_1>=KEYWORD_57 && LA52_1<=KEYWORD_51)||(LA52_1>=KEYWORD_53 && LA52_1<=KEYWORD_54)||LA52_1==KEYWORD_24||LA52_1==KEYWORD_42||(LA52_1>=KEYWORD_1 && LA52_1<=KEYWORD_4)||LA52_1==KEYWORD_9||(LA52_1>=KEYWORD_17 && LA52_1<=KEYWORD_18)||LA52_1==KEYWORD_20||(LA52_1>=RULE_DOLLAR_VAR && LA52_1<=RULE_WORD_CHARS)||LA52_1==RULE_REGULAR_EXPRESSION) ) {
                                        alt52=1;
                                    }


                                }


                                switch (alt52) {
                            	case 1 :
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2592:2: otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleFunctionCall5580); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_1_0());
                            	          
                            	    }
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2596:1: ( (lv_parameters_5_0= ruleExpression ) )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2597:1: (lv_parameters_5_0= ruleExpression )
                            	    {
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2597:1: (lv_parameters_5_0= ruleExpression )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2598:3: lv_parameters_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_1_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall5600);
                            	    lv_parameters_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_5_0, 
                            	              		"Expression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);

                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2614:4: (otherlv_6= KEYWORD_8 )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==KEYWORD_8) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2615:2: otherlv_6= KEYWORD_8
                                    {
                                    otherlv_6=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleFunctionCall5616); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_2());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleFunctionCall5632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_3());
                          
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2632:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2633:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2634:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5668);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression5678); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2641:1: rulePrimaryExpression returns [EObject current=null] : (this_IfExpression_0= ruleIfExpression | this_CaseExpression_1= ruleCaseExpression | this_ImportExpression_2= ruleImportExpression | this_Definition_3= ruleDefinition | this_HostClassDefinition_4= ruleHostClassDefinition | this_NodeDefinition_5= ruleNodeDefinition | this_VirtualNameOrReference_6= ruleVirtualNameOrReference | this_LiteralExpression_7= ruleLiteralExpression | this_VariableExpression_8= ruleVariableExpression | this_ParenthisedExpression_9= ruleParenthisedExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfExpression_0 = null;

        EObject this_CaseExpression_1 = null;

        EObject this_ImportExpression_2 = null;

        EObject this_Definition_3 = null;

        EObject this_HostClassDefinition_4 = null;

        EObject this_NodeDefinition_5 = null;

        EObject this_VirtualNameOrReference_6 = null;

        EObject this_LiteralExpression_7 = null;

        EObject this_VariableExpression_8 = null;

        EObject this_ParenthisedExpression_9 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2644:28: ( (this_IfExpression_0= ruleIfExpression | this_CaseExpression_1= ruleCaseExpression | this_ImportExpression_2= ruleImportExpression | this_Definition_3= ruleDefinition | this_HostClassDefinition_4= ruleHostClassDefinition | this_NodeDefinition_5= ruleNodeDefinition | this_VirtualNameOrReference_6= ruleVirtualNameOrReference | this_LiteralExpression_7= ruleLiteralExpression | this_VariableExpression_8= ruleVariableExpression | this_ParenthisedExpression_9= ruleParenthisedExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2645:1: (this_IfExpression_0= ruleIfExpression | this_CaseExpression_1= ruleCaseExpression | this_ImportExpression_2= ruleImportExpression | this_Definition_3= ruleDefinition | this_HostClassDefinition_4= ruleHostClassDefinition | this_NodeDefinition_5= ruleNodeDefinition | this_VirtualNameOrReference_6= ruleVirtualNameOrReference | this_LiteralExpression_7= ruleLiteralExpression | this_VariableExpression_8= ruleVariableExpression | this_ParenthisedExpression_9= ruleParenthisedExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2645:1: (this_IfExpression_0= ruleIfExpression | this_CaseExpression_1= ruleCaseExpression | this_ImportExpression_2= ruleImportExpression | this_Definition_3= ruleDefinition | this_HostClassDefinition_4= ruleHostClassDefinition | this_NodeDefinition_5= ruleNodeDefinition | this_VirtualNameOrReference_6= ruleVirtualNameOrReference | this_LiteralExpression_7= ruleLiteralExpression | this_VariableExpression_8= ruleVariableExpression | this_ParenthisedExpression_9= ruleParenthisedExpression )
            int alt56=10;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2646:2: this_IfExpression_0= ruleIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIfExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfExpression_in_rulePrimaryExpression5728);
                    this_IfExpression_0=ruleIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_IfExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2659:2: this_CaseExpression_1= ruleCaseExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCaseExpression_in_rulePrimaryExpression5758);
                    this_CaseExpression_1=ruleCaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_CaseExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2672:2: this_ImportExpression_2= ruleImportExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getImportExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImportExpression_in_rulePrimaryExpression5788);
                    this_ImportExpression_2=ruleImportExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ImportExpression_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2685:2: this_Definition_3= ruleDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefinition_in_rulePrimaryExpression5818);
                    this_Definition_3=ruleDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Definition_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2698:2: this_HostClassDefinition_4= ruleHostClassDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getHostClassDefinitionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostClassDefinition_in_rulePrimaryExpression5848);
                    this_HostClassDefinition_4=ruleHostClassDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_HostClassDefinition_4;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2711:2: this_NodeDefinition_5= ruleNodeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNodeDefinitionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeDefinition_in_rulePrimaryExpression5878);
                    this_NodeDefinition_5=ruleNodeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_NodeDefinition_5;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2724:2: this_VirtualNameOrReference_6= ruleVirtualNameOrReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVirtualNameOrReferenceParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVirtualNameOrReference_in_rulePrimaryExpression5908);
                    this_VirtualNameOrReference_6=ruleVirtualNameOrReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_VirtualNameOrReference_6;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2737:2: this_LiteralExpression_7= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralExpression_in_rulePrimaryExpression5938);
                    this_LiteralExpression_7=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralExpression_7;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2750:2: this_VariableExpression_8= ruleVariableExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableExpression_in_rulePrimaryExpression5968);
                    this_VariableExpression_8=ruleVariableExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_VariableExpression_8;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2763:2: this_ParenthisedExpression_9= ruleParenthisedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthisedExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthisedExpression_in_rulePrimaryExpression5998);
                    this_ParenthisedExpression_9=ruleParenthisedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ParenthisedExpression_9;
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleNodeDefinition"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2782:1: entryRuleNodeDefinition returns [EObject current=null] : iv_ruleNodeDefinition= ruleNodeDefinition EOF ;
    public final EObject entryRuleNodeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDefinition = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2783:2: (iv_ruleNodeDefinition= ruleNodeDefinition EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2784:2: iv_ruleNodeDefinition= ruleNodeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition6032);
            iv_ruleNodeDefinition=ruleNodeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDefinition6042); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeDefinition"


    // $ANTLR start "ruleNodeDefinition"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2791:1: ruleNodeDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_53 ( (lv_hostNames_1_0= ruleHostReference ) ) (otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) ) )* (otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) ) )? otherlv_6= KEYWORD_20 ( (lv_statements_7_0= ruleExpressionList ) )* otherlv_8= KEYWORD_21 ) ;
    public final EObject ruleNodeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_hostNames_1_0 = null;

        EObject lv_hostNames_3_0 = null;

        EObject lv_parentName_5_0 = null;

        EObject lv_statements_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2794:28: ( (otherlv_0= KEYWORD_53 ( (lv_hostNames_1_0= ruleHostReference ) ) (otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) ) )* (otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) ) )? otherlv_6= KEYWORD_20 ( (lv_statements_7_0= ruleExpressionList ) )* otherlv_8= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2795:1: (otherlv_0= KEYWORD_53 ( (lv_hostNames_1_0= ruleHostReference ) ) (otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) ) )* (otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) ) )? otherlv_6= KEYWORD_20 ( (lv_statements_7_0= ruleExpressionList ) )* otherlv_8= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2795:1: (otherlv_0= KEYWORD_53 ( (lv_hostNames_1_0= ruleHostReference ) ) (otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) ) )* (otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) ) )? otherlv_6= KEYWORD_20 ( (lv_statements_7_0= ruleExpressionList ) )* otherlv_8= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2796:2: otherlv_0= KEYWORD_53 ( (lv_hostNames_1_0= ruleHostReference ) ) (otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) ) )* (otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) ) )? otherlv_6= KEYWORD_20 ( (lv_statements_7_0= ruleExpressionList ) )* otherlv_8= KEYWORD_21
            {
            otherlv_0=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleNodeDefinition6080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeDefinitionAccess().getNodeKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2800:1: ( (lv_hostNames_1_0= ruleHostReference ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2801:1: (lv_hostNames_1_0= ruleHostReference )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2801:1: (lv_hostNames_1_0= ruleHostReference )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2802:3: lv_hostNames_1_0= ruleHostReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getHostNamesHostReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHostReference_in_ruleNodeDefinition6100);
            lv_hostNames_1_0=ruleHostReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
              	        }
                     		add(
                     			current, 
                     			"hostNames",
                      		lv_hostNames_1_0, 
                      		"HostReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2818:2: (otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==KEYWORD_8) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2819:2: otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleNodeDefinition6114); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNodeDefinitionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2823:1: ( (lv_hostNames_3_0= ruleHostReference ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2824:1: (lv_hostNames_3_0= ruleHostReference )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2824:1: (lv_hostNames_3_0= ruleHostReference )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2825:3: lv_hostNames_3_0= ruleHostReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getHostNamesHostReferenceParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleHostReference_in_ruleNodeDefinition6134);
            	    lv_hostNames_3_0=ruleHostReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"hostNames",
            	              		lv_hostNames_3_0, 
            	              		"HostReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2841:4: (otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==KEYWORD_62) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2842:2: otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) )
                    {
                    otherlv_4=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleNodeDefinition6150); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNodeDefinitionAccess().getInheritsKeyword_3_0());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2846:1: ( (lv_parentName_5_0= ruleHostReference ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2847:1: (lv_parentName_5_0= ruleHostReference )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2847:1: (lv_parentName_5_0= ruleHostReference )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2848:3: lv_parentName_5_0= ruleHostReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getParentNameHostReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHostReference_in_ruleNodeDefinition6170);
                    lv_parentName_5_0=ruleHostReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"parentName",
                              		lv_parentName_5_0, 
                              		"HostReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleNodeDefinition6185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getNodeDefinitionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2869:1: ( (lv_statements_7_0= ruleExpressionList ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=KEYWORD_61 && LA59_0<=KEYWORD_55)||(LA59_0>=KEYWORD_57 && LA59_0<=KEYWORD_51)||(LA59_0>=KEYWORD_53 && LA59_0<=KEYWORD_54)||LA59_0==KEYWORD_24||LA59_0==KEYWORD_42||(LA59_0>=KEYWORD_1 && LA59_0<=KEYWORD_4)||LA59_0==KEYWORD_9||(LA59_0>=KEYWORD_17 && LA59_0<=KEYWORD_18)||LA59_0==KEYWORD_20||(LA59_0>=RULE_DOLLAR_VAR && LA59_0<=RULE_WORD_CHARS)||LA59_0==RULE_REGULAR_EXPRESSION) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2870:1: (lv_statements_7_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2870:1: (lv_statements_7_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2871:3: lv_statements_7_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getStatementsExpressionListParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleNodeDefinition6205);
            	    lv_statements_7_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_7_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_8=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleNodeDefinition6219); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getNodeDefinitionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleNodeDefinition"


    // $ANTLR start "entryRuleHostReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2900:1: entryRuleHostReference returns [EObject current=null] : iv_ruleHostReference= ruleHostReference EOF ;
    public final EObject entryRuleHostReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostReference = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2901:2: (iv_ruleHostReference= ruleHostReference EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2902:2: iv_ruleHostReference= ruleHostReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleHostReference_in_entryRuleHostReference6253);
            iv_ruleHostReference=ruleHostReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostReference6263); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHostReference"


    // $ANTLR start "ruleHostReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2909:1: ruleHostReference returns [EObject current=null] : (this_StringExpression_0= ruleStringExpression | this_LiteralRegex_1= ruleLiteralRegex | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralNameOrReference_3= ruleLiteralNameOrReference ) ;
    public final EObject ruleHostReference() throws RecognitionException {
        EObject current = null;

        EObject this_StringExpression_0 = null;

        EObject this_LiteralRegex_1 = null;

        EObject this_LiteralDefault_2 = null;

        EObject this_LiteralNameOrReference_3 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2912:28: ( (this_StringExpression_0= ruleStringExpression | this_LiteralRegex_1= ruleLiteralRegex | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralNameOrReference_3= ruleLiteralNameOrReference ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2913:1: (this_StringExpression_0= ruleStringExpression | this_LiteralRegex_1= ruleLiteralRegex | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralNameOrReference_3= ruleLiteralNameOrReference )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2913:1: (this_StringExpression_0= ruleStringExpression | this_LiteralRegex_1= ruleLiteralRegex | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralNameOrReference_3= ruleLiteralNameOrReference )
            int alt60=4;
            switch ( input.LA(1) ) {
            case KEYWORD_24:
            case KEYWORD_2:
            case KEYWORD_3:
                {
                alt60=1;
                }
                break;
            case RULE_REGULAR_EXPRESSION:
                {
                alt60=2;
                }
                break;
            case KEYWORD_61:
                {
                alt60=3;
                }
                break;
            case RULE_WORD_CHARS:
                {
                alt60=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2914:2: this_StringExpression_0= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostReferenceAccess().getStringExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleHostReference6313);
                    this_StringExpression_0=ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StringExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2927:2: this_LiteralRegex_1= ruleLiteralRegex
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostReferenceAccess().getLiteralRegexParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralRegex_in_ruleHostReference6343);
                    this_LiteralRegex_1=ruleLiteralRegex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralRegex_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2940:2: this_LiteralDefault_2= ruleLiteralDefault
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostReferenceAccess().getLiteralDefaultParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralDefault_in_ruleHostReference6373);
                    this_LiteralDefault_2=ruleLiteralDefault();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralDefault_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2953:2: this_LiteralNameOrReference_3= ruleLiteralNameOrReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostReferenceAccess().getLiteralNameOrReferenceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralNameOrReference_in_ruleHostReference6403);
                    this_LiteralNameOrReference_3=ruleLiteralNameOrReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralNameOrReference_3;
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleHostReference"


    // $ANTLR start "entryRuleHostClassDefinition"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2972:1: entryRuleHostClassDefinition returns [EObject current=null] : iv_ruleHostClassDefinition= ruleHostClassDefinition EOF ;
    public final EObject entryRuleHostClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostClassDefinition = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2973:2: (iv_ruleHostClassDefinition= ruleHostClassDefinition EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2974:2: iv_ruleHostClassDefinition= ruleHostClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleHostClassDefinition_in_entryRuleHostClassDefinition6437);
            iv_ruleHostClassDefinition=ruleHostClassDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostClassDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostClassDefinition6447); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHostClassDefinition"


    // $ANTLR start "ruleHostClassDefinition"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2981:1: ruleHostClassDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_55 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? (otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) ) )? otherlv_5= KEYWORD_20 ( (lv_statements_6_0= ruleExpressionList ) )* otherlv_7= KEYWORD_21 ) ;
    public final EObject ruleHostClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_parent_4_0 = null;

        EObject lv_statements_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2984:28: ( (otherlv_0= KEYWORD_55 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? (otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) ) )? otherlv_5= KEYWORD_20 ( (lv_statements_6_0= ruleExpressionList ) )* otherlv_7= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2985:1: (otherlv_0= KEYWORD_55 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? (otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) ) )? otherlv_5= KEYWORD_20 ( (lv_statements_6_0= ruleExpressionList ) )* otherlv_7= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2985:1: (otherlv_0= KEYWORD_55 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? (otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) ) )? otherlv_5= KEYWORD_20 ( (lv_statements_6_0= ruleExpressionList ) )* otherlv_7= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2986:2: otherlv_0= KEYWORD_55 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? (otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) ) )? otherlv_5= KEYWORD_20 ( (lv_statements_6_0= ruleExpressionList ) )* otherlv_7= KEYWORD_21
            {
            otherlv_0=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleHostClassDefinition6485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHostClassDefinitionAccess().getClassKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2990:1: ( (lv_className_1_0= ruleclassname ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2991:1: (lv_className_1_0= ruleclassname )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2991:1: (lv_className_1_0= ruleclassname )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2992:3: lv_className_1_0= ruleclassname
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHostClassDefinitionAccess().getClassNameClassnameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleclassname_in_ruleHostClassDefinition6505);
            lv_className_1_0=ruleclassname();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHostClassDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"className",
                      		lv_className_1_0, 
                      		"classname");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3008:2: ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==KEYWORD_4) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3009:1: (lv_arguments_2_0= ruleDefinitionArgumentList )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3009:1: (lv_arguments_2_0= ruleDefinitionArgumentList )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3010:3: lv_arguments_2_0= ruleDefinitionArgumentList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHostClassDefinitionAccess().getArgumentsDefinitionArgumentListParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefinitionArgumentList_in_ruleHostClassDefinition6526);
                    lv_arguments_2_0=ruleDefinitionArgumentList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHostClassDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"DefinitionArgumentList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3026:3: (otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==KEYWORD_62) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3027:2: otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleHostClassDefinition6541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getHostClassDefinitionAccess().getInheritsKeyword_3_0());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3031:1: ( (lv_parent_4_0= ruleParentName ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3032:1: (lv_parent_4_0= ruleParentName )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3032:1: (lv_parent_4_0= ruleParentName )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3033:3: lv_parent_4_0= ruleParentName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHostClassDefinitionAccess().getParentParentNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParentName_in_ruleHostClassDefinition6561);
                    lv_parent_4_0=ruleParentName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHostClassDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"parent",
                              		lv_parent_4_0, 
                              		"ParentName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleHostClassDefinition6576); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getHostClassDefinitionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3054:1: ( (lv_statements_6_0= ruleExpressionList ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=KEYWORD_61 && LA63_0<=KEYWORD_55)||(LA63_0>=KEYWORD_57 && LA63_0<=KEYWORD_51)||(LA63_0>=KEYWORD_53 && LA63_0<=KEYWORD_54)||LA63_0==KEYWORD_24||LA63_0==KEYWORD_42||(LA63_0>=KEYWORD_1 && LA63_0<=KEYWORD_4)||LA63_0==KEYWORD_9||(LA63_0>=KEYWORD_17 && LA63_0<=KEYWORD_18)||LA63_0==KEYWORD_20||(LA63_0>=RULE_DOLLAR_VAR && LA63_0<=RULE_WORD_CHARS)||LA63_0==RULE_REGULAR_EXPRESSION) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3055:1: (lv_statements_6_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3055:1: (lv_statements_6_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3056:3: lv_statements_6_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostClassDefinitionAccess().getStatementsExpressionListParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleHostClassDefinition6596);
            	    lv_statements_6_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHostClassDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_6_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_7=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleHostClassDefinition6610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getHostClassDefinitionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleHostClassDefinition"


    // $ANTLR start "entryRuleParentName"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3085:1: entryRuleParentName returns [EObject current=null] : iv_ruleParentName= ruleParentName EOF ;
    public final EObject entryRuleParentName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentName = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3086:2: (iv_ruleParentName= ruleParentName EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3087:2: iv_ruleParentName= ruleParentName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentNameRule()); 
            }
            pushFollow(FOLLOW_ruleParentName_in_entryRuleParentName6644);
            iv_ruleParentName=ruleParentName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParentName6654); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParentName"


    // $ANTLR start "ruleParentName"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3094:1: ruleParentName returns [EObject current=null] : (this_LiteralDefault_0= ruleLiteralDefault | this_LiteralClass_1= ruleLiteralClass | this_LiteralNameOrReference_2= ruleLiteralNameOrReference ) ;
    public final EObject ruleParentName() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralDefault_0 = null;

        EObject this_LiteralClass_1 = null;

        EObject this_LiteralNameOrReference_2 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3097:28: ( (this_LiteralDefault_0= ruleLiteralDefault | this_LiteralClass_1= ruleLiteralClass | this_LiteralNameOrReference_2= ruleLiteralNameOrReference ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3098:1: (this_LiteralDefault_0= ruleLiteralDefault | this_LiteralClass_1= ruleLiteralClass | this_LiteralNameOrReference_2= ruleLiteralNameOrReference )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3098:1: (this_LiteralDefault_0= ruleLiteralDefault | this_LiteralClass_1= ruleLiteralClass | this_LiteralNameOrReference_2= ruleLiteralNameOrReference )
            int alt64=3;
            switch ( input.LA(1) ) {
            case KEYWORD_61:
                {
                alt64=1;
                }
                break;
            case KEYWORD_55:
                {
                alt64=2;
                }
                break;
            case RULE_WORD_CHARS:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3099:2: this_LiteralDefault_0= ruleLiteralDefault
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParentNameAccess().getLiteralDefaultParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralDefault_in_ruleParentName6704);
                    this_LiteralDefault_0=ruleLiteralDefault();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralDefault_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3112:2: this_LiteralClass_1= ruleLiteralClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParentNameAccess().getLiteralClassParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralClass_in_ruleParentName6734);
                    this_LiteralClass_1=ruleLiteralClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralClass_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3125:2: this_LiteralNameOrReference_2= ruleLiteralNameOrReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParentNameAccess().getLiteralNameOrReferenceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralNameOrReference_in_ruleParentName6764);
                    this_LiteralNameOrReference_2=ruleLiteralNameOrReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralNameOrReference_2;
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleParentName"


    // $ANTLR start "entryRuleDefinition"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3144:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3145:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3146:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition6798);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition6808); if (state.failed) return current;

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
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3153:1: ruleDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_59 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? otherlv_3= KEYWORD_20 ( (lv_statements_4_0= ruleExpressionList ) )* otherlv_5= KEYWORD_21 ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_statements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3156:28: ( (otherlv_0= KEYWORD_59 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? otherlv_3= KEYWORD_20 ( (lv_statements_4_0= ruleExpressionList ) )* otherlv_5= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3157:1: (otherlv_0= KEYWORD_59 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? otherlv_3= KEYWORD_20 ( (lv_statements_4_0= ruleExpressionList ) )* otherlv_5= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3157:1: (otherlv_0= KEYWORD_59 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? otherlv_3= KEYWORD_20 ( (lv_statements_4_0= ruleExpressionList ) )* otherlv_5= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3158:2: otherlv_0= KEYWORD_59 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? otherlv_3= KEYWORD_20 ( (lv_statements_4_0= ruleExpressionList ) )* otherlv_5= KEYWORD_21
            {
            otherlv_0=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleDefinition6846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefineKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3162:1: ( (lv_className_1_0= ruleclassname ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3163:1: (lv_className_1_0= ruleclassname )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3163:1: (lv_className_1_0= ruleclassname )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3164:3: lv_className_1_0= ruleclassname
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionAccess().getClassNameClassnameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleclassname_in_ruleDefinition6866);
            lv_className_1_0=ruleclassname();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"className",
                      		lv_className_1_0, 
                      		"classname");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3180:2: ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==KEYWORD_4) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3181:1: (lv_arguments_2_0= ruleDefinitionArgumentList )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3181:1: (lv_arguments_2_0= ruleDefinitionArgumentList )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3182:3: lv_arguments_2_0= ruleDefinitionArgumentList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionAccess().getArgumentsDefinitionArgumentListParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefinitionArgumentList_in_ruleDefinition6887);
                    lv_arguments_2_0=ruleDefinitionArgumentList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"DefinitionArgumentList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleDefinition6901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3203:1: ( (lv_statements_4_0= ruleExpressionList ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=KEYWORD_61 && LA66_0<=KEYWORD_55)||(LA66_0>=KEYWORD_57 && LA66_0<=KEYWORD_51)||(LA66_0>=KEYWORD_53 && LA66_0<=KEYWORD_54)||LA66_0==KEYWORD_24||LA66_0==KEYWORD_42||(LA66_0>=KEYWORD_1 && LA66_0<=KEYWORD_4)||LA66_0==KEYWORD_9||(LA66_0>=KEYWORD_17 && LA66_0<=KEYWORD_18)||LA66_0==KEYWORD_20||(LA66_0>=RULE_DOLLAR_VAR && LA66_0<=RULE_WORD_CHARS)||LA66_0==RULE_REGULAR_EXPRESSION) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3204:1: (lv_statements_4_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3204:1: (lv_statements_4_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3205:3: lv_statements_4_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDefinitionAccess().getStatementsExpressionListParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleDefinition6921);
            	    lv_statements_4_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_4_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_5=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleDefinition6935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_5());
                  
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


    // $ANTLR start "entryRuleDefinitionArgumentList"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3234:1: entryRuleDefinitionArgumentList returns [EObject current=null] : iv_ruleDefinitionArgumentList= ruleDefinitionArgumentList EOF ;
    public final EObject entryRuleDefinitionArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionArgumentList = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3235:2: (iv_ruleDefinitionArgumentList= ruleDefinitionArgumentList EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3236:2: iv_ruleDefinitionArgumentList= ruleDefinitionArgumentList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionArgumentListRule()); 
            }
            pushFollow(FOLLOW_ruleDefinitionArgumentList_in_entryRuleDefinitionArgumentList6969);
            iv_ruleDefinitionArgumentList=ruleDefinitionArgumentList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionArgumentList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionArgumentList6979); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinitionArgumentList"


    // $ANTLR start "ruleDefinitionArgumentList"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3243:1: ruleDefinitionArgumentList returns [EObject current=null] : ( () otherlv_1= KEYWORD_4 ( ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )* )? (otherlv_5= KEYWORD_8 )? otherlv_6= KEYWORD_5 ) ;
    public final EObject ruleDefinitionArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3246:28: ( ( () otherlv_1= KEYWORD_4 ( ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )* )? (otherlv_5= KEYWORD_8 )? otherlv_6= KEYWORD_5 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3247:1: ( () otherlv_1= KEYWORD_4 ( ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )* )? (otherlv_5= KEYWORD_8 )? otherlv_6= KEYWORD_5 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3247:1: ( () otherlv_1= KEYWORD_4 ( ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )* )? (otherlv_5= KEYWORD_8 )? otherlv_6= KEYWORD_5 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3247:2: () otherlv_1= KEYWORD_4 ( ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )* )? (otherlv_5= KEYWORD_8 )? otherlv_6= KEYWORD_5
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3247:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3248:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefinitionArgumentListAccess().getDefinitionArgumentListAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleDefinitionArgumentList7029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefinitionArgumentListAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3261:1: ( ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_DOLLAR_VAR && LA68_0<=RULE_WORD_CHARS)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3261:2: ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )*
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3261:2: ( (lv_arguments_2_0= ruleDefinitionArgument ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3262:1: (lv_arguments_2_0= ruleDefinitionArgument )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3262:1: (lv_arguments_2_0= ruleDefinitionArgument )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3263:3: lv_arguments_2_0= ruleDefinitionArgument
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionArgumentListAccess().getArgumentsDefinitionArgumentParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefinitionArgument_in_ruleDefinitionArgumentList7050);
                    lv_arguments_2_0=ruleDefinitionArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionArgumentListRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"DefinitionArgument");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3279:2: (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==KEYWORD_8) ) {
                            int LA67_1 = input.LA(2);

                            if ( ((LA67_1>=RULE_DOLLAR_VAR && LA67_1<=RULE_WORD_CHARS)) ) {
                                alt67=1;
                            }


                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3280:2: otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleDefinitionArgumentList7064); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getDefinitionArgumentListAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3284:1: ( (lv_arguments_4_0= ruleDefinitionArgument ) )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3285:1: (lv_arguments_4_0= ruleDefinitionArgument )
                    	    {
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3285:1: (lv_arguments_4_0= ruleDefinitionArgument )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3286:3: lv_arguments_4_0= ruleDefinitionArgument
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefinitionArgumentListAccess().getArgumentsDefinitionArgumentParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDefinitionArgument_in_ruleDefinitionArgumentList7084);
                    	    lv_arguments_4_0=ruleDefinitionArgument();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefinitionArgumentListRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"DefinitionArgument");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3302:6: (otherlv_5= KEYWORD_8 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==KEYWORD_8) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3303:2: otherlv_5= KEYWORD_8
                    {
                    otherlv_5=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleDefinitionArgumentList7102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDefinitionArgumentListAccess().getCommaKeyword_3());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleDefinitionArgumentList7116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDefinitionArgumentListAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleDefinitionArgumentList"


    // $ANTLR start "entryRuleDefinitionArgument"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3320:1: entryRuleDefinitionArgument returns [EObject current=null] : iv_ruleDefinitionArgument= ruleDefinitionArgument EOF ;
    public final EObject entryRuleDefinitionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionArgument = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3321:2: (iv_ruleDefinitionArgument= ruleDefinitionArgument EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3322:2: iv_ruleDefinitionArgument= ruleDefinitionArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleDefinitionArgument_in_entryRuleDefinitionArgument7150);
            iv_ruleDefinitionArgument=ruleDefinitionArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionArgument7160); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinitionArgument"


    // $ANTLR start "ruleDefinitionArgument"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3329:1: ruleDefinitionArgument returns [EObject current=null] : ( ( (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME ) ) ( ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) ) )? ) ;
    public final EObject ruleDefinitionArgument() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        Token lv_op_2_0=null;
        AntlrDatatypeRuleToken lv_argName_0_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3332:28: ( ( ( (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME ) ) ( ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3333:1: ( ( (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME ) ) ( ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3333:1: ( ( (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME ) ) ( ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3333:2: ( (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME ) ) ( ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) ) )?
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3333:2: ( (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3334:1: (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3334:1: (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3335:3: lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionArgumentAccess().getArgNameUNION_VARIABLE_OR_NAMEParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUNION_VARIABLE_OR_NAME_in_ruleDefinitionArgument7206);
            lv_argName_0_0=ruleUNION_VARIABLE_OR_NAME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitionArgumentRule());
              	        }
                     		set(
                     			current, 
                     			"argName",
                      		lv_argName_0_0, 
                      		"UNION_VARIABLE_OR_NAME");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3351:2: ( ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==KEYWORD_34||LA71_0==KEYWORD_14) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3351:3: ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3351:3: ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==KEYWORD_14) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==KEYWORD_34) ) {
                        alt70=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3351:4: ( (lv_op_1_0= KEYWORD_14 ) )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3351:4: ( (lv_op_1_0= KEYWORD_14 ) )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3352:1: (lv_op_1_0= KEYWORD_14 )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3352:1: (lv_op_1_0= KEYWORD_14 )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3353:3: lv_op_1_0= KEYWORD_14
                            {
                            lv_op_1_0=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleDefinitionArgument7227); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_0, grammarAccess.getDefinitionArgumentAccess().getOpEqualsSignKeyword_1_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDefinitionArgumentRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_0, "=");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3368:6: ( (lv_op_2_0= KEYWORD_34 ) )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3368:6: ( (lv_op_2_0= KEYWORD_34 ) )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3369:1: (lv_op_2_0= KEYWORD_34 )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3369:1: (lv_op_2_0= KEYWORD_34 )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3370:3: lv_op_2_0= KEYWORD_34
                            {
                            lv_op_2_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleDefinitionArgument7263); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_0, grammarAccess.getDefinitionArgumentAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDefinitionArgumentRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_0, "=>");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3384:3: ( (lv_value_3_0= ruleAssignmentExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3385:1: (lv_value_3_0= ruleAssignmentExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3385:1: (lv_value_3_0= ruleAssignmentExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3386:3: lv_value_3_0= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionArgumentAccess().getValueAssignmentExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleDefinitionArgument7296);
                    lv_value_3_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionArgumentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"AssignmentExpression");
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
    // $ANTLR end "ruleDefinitionArgument"


    // $ANTLR start "entryRuleCaseExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3410:1: entryRuleCaseExpression returns [EObject current=null] : iv_ruleCaseExpression= ruleCaseExpression EOF ;
    public final EObject entryRuleCaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3411:2: (iv_ruleCaseExpression= ruleCaseExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3412:2: iv_ruleCaseExpression= ruleCaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression7333);
            iv_ruleCaseExpression=ruleCaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseExpression7343); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCaseExpression"


    // $ANTLR start "ruleCaseExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3419:1: ruleCaseExpression returns [EObject current=null] : (otherlv_0= KEYWORD_51 ( (lv_switchExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_cases_3_0= ruleCase ) )* otherlv_4= KEYWORD_21 ) ;
    public final EObject ruleCaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_switchExpr_1_0 = null;

        EObject lv_cases_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3422:28: ( (otherlv_0= KEYWORD_51 ( (lv_switchExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_cases_3_0= ruleCase ) )* otherlv_4= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3423:1: (otherlv_0= KEYWORD_51 ( (lv_switchExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_cases_3_0= ruleCase ) )* otherlv_4= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3423:1: (otherlv_0= KEYWORD_51 ( (lv_switchExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_cases_3_0= ruleCase ) )* otherlv_4= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3424:2: otherlv_0= KEYWORD_51 ( (lv_switchExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_cases_3_0= ruleCase ) )* otherlv_4= KEYWORD_21
            {
            otherlv_0=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleCaseExpression7381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseExpressionAccess().getCaseKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3428:1: ( (lv_switchExpr_1_0= ruleAssignmentExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3429:1: (lv_switchExpr_1_0= ruleAssignmentExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3429:1: (lv_switchExpr_1_0= ruleAssignmentExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3430:3: lv_switchExpr_1_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getSwitchExprAssignmentExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleCaseExpression7401);
            lv_switchExpr_1_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switchExpr",
                      		lv_switchExpr_1_0, 
                      		"AssignmentExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleCaseExpression7414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseExpressionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3451:1: ( (lv_cases_3_0= ruleCase ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=KEYWORD_61 && LA72_0<=KEYWORD_55)||(LA72_0>=KEYWORD_57 && LA72_0<=KEYWORD_51)||(LA72_0>=KEYWORD_53 && LA72_0<=KEYWORD_54)||LA72_0==KEYWORD_24||LA72_0==KEYWORD_42||(LA72_0>=KEYWORD_1 && LA72_0<=KEYWORD_4)||LA72_0==KEYWORD_9||(LA72_0>=KEYWORD_17 && LA72_0<=KEYWORD_18)||LA72_0==KEYWORD_20||(LA72_0>=RULE_DOLLAR_VAR && LA72_0<=RULE_WORD_CHARS)||LA72_0==RULE_REGULAR_EXPRESSION) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3452:1: (lv_cases_3_0= ruleCase )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3452:1: (lv_cases_3_0= ruleCase )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3453:3: lv_cases_3_0= ruleCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getCasesCaseParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCase_in_ruleCaseExpression7434);
            	    lv_cases_3_0=ruleCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCaseExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_3_0, 
            	              		"Case");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_4=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleCaseExpression7448); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCaseExpressionAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleCaseExpression"


    // $ANTLR start "entryRuleCase"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3482:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3483:2: (iv_ruleCase= ruleCase EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3484:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase7482);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase7492); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3491:1: ruleCase returns [EObject current=null] : ( ( (lv_values_0_0= ruleAssignmentExpression ) ) (otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) ) )* otherlv_3= KEYWORD_11 otherlv_4= KEYWORD_20 ( (lv_statements_5_0= ruleExpressionList ) )* otherlv_6= KEYWORD_21 ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;

        EObject lv_statements_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3494:28: ( ( ( (lv_values_0_0= ruleAssignmentExpression ) ) (otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) ) )* otherlv_3= KEYWORD_11 otherlv_4= KEYWORD_20 ( (lv_statements_5_0= ruleExpressionList ) )* otherlv_6= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3495:1: ( ( (lv_values_0_0= ruleAssignmentExpression ) ) (otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) ) )* otherlv_3= KEYWORD_11 otherlv_4= KEYWORD_20 ( (lv_statements_5_0= ruleExpressionList ) )* otherlv_6= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3495:1: ( ( (lv_values_0_0= ruleAssignmentExpression ) ) (otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) ) )* otherlv_3= KEYWORD_11 otherlv_4= KEYWORD_20 ( (lv_statements_5_0= ruleExpressionList ) )* otherlv_6= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3495:2: ( (lv_values_0_0= ruleAssignmentExpression ) ) (otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) ) )* otherlv_3= KEYWORD_11 otherlv_4= KEYWORD_20 ( (lv_statements_5_0= ruleExpressionList ) )* otherlv_6= KEYWORD_21
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3495:2: ( (lv_values_0_0= ruleAssignmentExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3496:1: (lv_values_0_0= ruleAssignmentExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3496:1: (lv_values_0_0= ruleAssignmentExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3497:3: lv_values_0_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getValuesAssignmentExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleCase7538);
            lv_values_0_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_0_0, 
                      		"AssignmentExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3513:2: (otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==KEYWORD_8) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3514:2: otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleCase7552); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3518:1: ( (lv_values_2_0= ruleAssignmentExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3519:1: (lv_values_2_0= ruleAssignmentExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3519:1: (lv_values_2_0= ruleAssignmentExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3520:3: lv_values_2_0= ruleAssignmentExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCaseAccess().getValuesAssignmentExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleCase7572);
            	    lv_values_2_0=ruleAssignmentExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_2_0, 
            	              		"AssignmentExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_3=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleCase7587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getColonKeyword_2());
                  
            }
            otherlv_4=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleCase7599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCaseAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3546:1: ( (lv_statements_5_0= ruleExpressionList ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=KEYWORD_61 && LA74_0<=KEYWORD_55)||(LA74_0>=KEYWORD_57 && LA74_0<=KEYWORD_51)||(LA74_0>=KEYWORD_53 && LA74_0<=KEYWORD_54)||LA74_0==KEYWORD_24||LA74_0==KEYWORD_42||(LA74_0>=KEYWORD_1 && LA74_0<=KEYWORD_4)||LA74_0==KEYWORD_9||(LA74_0>=KEYWORD_17 && LA74_0<=KEYWORD_18)||LA74_0==KEYWORD_20||(LA74_0>=RULE_DOLLAR_VAR && LA74_0<=RULE_WORD_CHARS)||LA74_0==RULE_REGULAR_EXPRESSION) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3547:1: (lv_statements_5_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3547:1: (lv_statements_5_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3548:3: lv_statements_5_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCaseAccess().getStatementsExpressionListParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleCase7619);
            	    lv_statements_5_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_5_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_6=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleCase7633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCaseAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleIfExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3577:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3578:2: (iv_ruleIfExpression= ruleIfExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3579:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIfExpression_in_entryRuleIfExpression7667);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExpression7677); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3586:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= KEYWORD_42 ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condExpr_1_0 = null;

        EObject lv_thenStatements_3_0 = null;

        EObject lv_elseStatement_6_0 = null;

        EObject lv_elseStatement_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3589:28: ( (otherlv_0= KEYWORD_42 ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3590:1: (otherlv_0= KEYWORD_42 ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3590:1: (otherlv_0= KEYWORD_42 ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3591:2: otherlv_0= KEYWORD_42 ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleIfExpression7715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getIfKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3595:1: ( (lv_condExpr_1_0= ruleAssignmentExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3596:1: (lv_condExpr_1_0= ruleAssignmentExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3596:1: (lv_condExpr_1_0= ruleAssignmentExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3597:3: lv_condExpr_1_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpressionAccess().getCondExprAssignmentExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleIfExpression7735);
            lv_condExpr_1_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"condExpr",
                      		lv_condExpr_1_0, 
                      		"AssignmentExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleIfExpression7748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3618:1: ( (lv_thenStatements_3_0= ruleExpressionList ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=KEYWORD_61 && LA75_0<=KEYWORD_55)||(LA75_0>=KEYWORD_57 && LA75_0<=KEYWORD_51)||(LA75_0>=KEYWORD_53 && LA75_0<=KEYWORD_54)||LA75_0==KEYWORD_24||LA75_0==KEYWORD_42||(LA75_0>=KEYWORD_1 && LA75_0<=KEYWORD_4)||LA75_0==KEYWORD_9||(LA75_0>=KEYWORD_17 && LA75_0<=KEYWORD_18)||LA75_0==KEYWORD_20||(LA75_0>=RULE_DOLLAR_VAR && LA75_0<=RULE_WORD_CHARS)||LA75_0==RULE_REGULAR_EXPRESSION) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3619:1: (lv_thenStatements_3_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3619:1: (lv_thenStatements_3_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3620:3: lv_thenStatements_3_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfExpressionAccess().getThenStatementsExpressionListParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleIfExpression7768);
            	    lv_thenStatements_3_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"thenStatements",
            	              		lv_thenStatements_3_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_4=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleIfExpression7782); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getRightCurlyBracketKeyword_4());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3641:1: ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )?
            int alt76=3;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==KEYWORD_56) ) {
                alt76=1;
            }
            else if ( (LA76_0==KEYWORD_52) ) {
                alt76=2;
            }
            switch (alt76) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3641:2: ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3641:2: ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3641:3: ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3641:3: ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3641:4: ( KEYWORD_56 )=>otherlv_5= KEYWORD_56
                    {
                    otherlv_5=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleIfExpression7803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfExpressionAccess().getElsifKeyword_5_0_0());
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3648:2: ( (lv_elseStatement_6_0= ruleElseIfExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3649:1: (lv_elseStatement_6_0= ruleElseIfExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3649:1: (lv_elseStatement_6_0= ruleElseIfExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3650:3: lv_elseStatement_6_0= ruleElseIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElseStatementElseIfExpressionParserRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleElseIfExpression_in_ruleIfExpression7824);
                    lv_elseStatement_6_0=ruleElseIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_6_0, 
                              		"ElseIfExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3667:6: ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3667:6: ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3667:7: ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3667:7: ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3667:8: ( KEYWORD_52 )=>otherlv_7= KEYWORD_52
                    {
                    otherlv_7=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleIfExpression7852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getIfExpressionAccess().getElseKeyword_5_1_0());
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3674:2: ( (lv_elseStatement_8_0= ruleElseExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3675:1: (lv_elseStatement_8_0= ruleElseExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3675:1: (lv_elseStatement_8_0= ruleElseExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3676:3: lv_elseStatement_8_0= ruleElseExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElseStatementElseExpressionParserRuleCall_5_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleElseExpression_in_ruleIfExpression7873);
                    lv_elseStatement_8_0=ruleElseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_8_0, 
                              		"ElseExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleElseExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3700:1: entryRuleElseExpression returns [EObject current=null] : iv_ruleElseExpression= ruleElseExpression EOF ;
    public final EObject entryRuleElseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3701:2: (iv_ruleElseExpression= ruleElseExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3702:2: iv_ruleElseExpression= ruleElseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElseExpression_in_entryRuleElseExpression7911);
            iv_ruleElseExpression=ruleElseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElseExpression7921); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElseExpression"


    // $ANTLR start "ruleElseExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3709:1: ruleElseExpression returns [EObject current=null] : ( () otherlv_1= KEYWORD_20 ( (lv_statements_2_0= ruleExpressionList ) )* otherlv_3= KEYWORD_21 ) ;
    public final EObject ruleElseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3712:28: ( ( () otherlv_1= KEYWORD_20 ( (lv_statements_2_0= ruleExpressionList ) )* otherlv_3= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3713:1: ( () otherlv_1= KEYWORD_20 ( (lv_statements_2_0= ruleExpressionList ) )* otherlv_3= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3713:1: ( () otherlv_1= KEYWORD_20 ( (lv_statements_2_0= ruleExpressionList ) )* otherlv_3= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3713:2: () otherlv_1= KEYWORD_20 ( (lv_statements_2_0= ruleExpressionList ) )* otherlv_3= KEYWORD_21
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3713:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3714:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElseExpressionAccess().getElseExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleElseExpression7971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getElseExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3727:1: ( (lv_statements_2_0= ruleExpressionList ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=KEYWORD_61 && LA77_0<=KEYWORD_55)||(LA77_0>=KEYWORD_57 && LA77_0<=KEYWORD_51)||(LA77_0>=KEYWORD_53 && LA77_0<=KEYWORD_54)||LA77_0==KEYWORD_24||LA77_0==KEYWORD_42||(LA77_0>=KEYWORD_1 && LA77_0<=KEYWORD_4)||LA77_0==KEYWORD_9||(LA77_0>=KEYWORD_17 && LA77_0<=KEYWORD_18)||LA77_0==KEYWORD_20||(LA77_0>=RULE_DOLLAR_VAR && LA77_0<=RULE_WORD_CHARS)||LA77_0==RULE_REGULAR_EXPRESSION) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3728:1: (lv_statements_2_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3728:1: (lv_statements_2_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3729:3: lv_statements_2_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElseExpressionAccess().getStatementsExpressionListParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleElseExpression7991);
            	    lv_statements_2_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElseExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_3=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleElseExpression8005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getElseExpressionAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleElseExpression"


    // $ANTLR start "entryRuleElseIfExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3758:1: entryRuleElseIfExpression returns [EObject current=null] : iv_ruleElseIfExpression= ruleElseIfExpression EOF ;
    public final EObject entryRuleElseIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3759:2: (iv_ruleElseIfExpression= ruleElseIfExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3760:2: iv_ruleElseIfExpression= ruleElseIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElseIfExpression_in_entryRuleElseIfExpression8039);
            iv_ruleElseIfExpression=ruleElseIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElseIfExpression8049); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElseIfExpression"


    // $ANTLR start "ruleElseIfExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3767:1: ruleElseIfExpression returns [EObject current=null] : ( () ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? ) ;
    public final EObject ruleElseIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condExpr_1_0 = null;

        EObject lv_thenStatements_3_0 = null;

        EObject lv_elseStatement_6_0 = null;

        EObject lv_elseStatement_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3770:28: ( ( () ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3771:1: ( () ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3771:1: ( () ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3771:2: () ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )?
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3771:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3772:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElseIfExpressionAccess().getElseIfExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3780:2: ( (lv_condExpr_1_0= ruleAssignmentExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3781:1: (lv_condExpr_1_0= ruleAssignmentExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3781:1: (lv_condExpr_1_0= ruleAssignmentExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3782:3: lv_condExpr_1_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfExpressionAccess().getCondExprAssignmentExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleElseIfExpression8107);
            lv_condExpr_1_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElseIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"condExpr",
                      		lv_condExpr_1_0, 
                      		"AssignmentExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleElseIfExpression8120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getElseIfExpressionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3803:1: ( (lv_thenStatements_3_0= ruleExpressionList ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=KEYWORD_61 && LA78_0<=KEYWORD_55)||(LA78_0>=KEYWORD_57 && LA78_0<=KEYWORD_51)||(LA78_0>=KEYWORD_53 && LA78_0<=KEYWORD_54)||LA78_0==KEYWORD_24||LA78_0==KEYWORD_42||(LA78_0>=KEYWORD_1 && LA78_0<=KEYWORD_4)||LA78_0==KEYWORD_9||(LA78_0>=KEYWORD_17 && LA78_0<=KEYWORD_18)||LA78_0==KEYWORD_20||(LA78_0>=RULE_DOLLAR_VAR && LA78_0<=RULE_WORD_CHARS)||LA78_0==RULE_REGULAR_EXPRESSION) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3804:1: (lv_thenStatements_3_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3804:1: (lv_thenStatements_3_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3805:3: lv_thenStatements_3_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElseIfExpressionAccess().getThenStatementsExpressionListParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleElseIfExpression8140);
            	    lv_thenStatements_3_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElseIfExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"thenStatements",
            	              		lv_thenStatements_3_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_4=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleElseIfExpression8154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getElseIfExpressionAccess().getRightCurlyBracketKeyword_4());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3826:1: ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )?
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==KEYWORD_56) ) {
                alt79=1;
            }
            else if ( (LA79_0==KEYWORD_52) ) {
                alt79=2;
            }
            switch (alt79) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3826:2: ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3826:2: ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3826:3: ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3826:3: ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3826:4: ( KEYWORD_56 )=>otherlv_5= KEYWORD_56
                    {
                    otherlv_5=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleElseIfExpression8175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getElseIfExpressionAccess().getElsifKeyword_5_0_0());
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3833:2: ( (lv_elseStatement_6_0= ruleElseIfExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3834:1: (lv_elseStatement_6_0= ruleElseIfExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3834:1: (lv_elseStatement_6_0= ruleElseIfExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3835:3: lv_elseStatement_6_0= ruleElseIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElseIfExpressionAccess().getElseStatementElseIfExpressionParserRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleElseIfExpression_in_ruleElseIfExpression8196);
                    lv_elseStatement_6_0=ruleElseIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElseIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_6_0, 
                              		"ElseIfExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3852:6: ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3852:6: ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3852:7: ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3852:7: ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3852:8: ( KEYWORD_52 )=>otherlv_7= KEYWORD_52
                    {
                    otherlv_7=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleElseIfExpression8224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getElseIfExpressionAccess().getElseKeyword_5_1_0());
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3859:2: ( (lv_elseStatement_8_0= ruleElseExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3860:1: (lv_elseStatement_8_0= ruleElseExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3860:1: (lv_elseStatement_8_0= ruleElseExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3861:3: lv_elseStatement_8_0= ruleElseExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElseIfExpressionAccess().getElseStatementElseExpressionParserRuleCall_5_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleElseExpression_in_ruleElseIfExpression8245);
                    lv_elseStatement_8_0=ruleElseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElseIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_8_0, 
                              		"ElseExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleElseIfExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3885:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3886:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3887:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression8283);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpression8293); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3894:1: ruleLiteralExpression returns [EObject current=null] : (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralUndef_1= ruleLiteralUndef | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralList_3= ruleLiteralList | this_LiteralHash_4= ruleLiteralHash | this_LiteralRegex_5= ruleLiteralRegex | this_StringExpression_6= ruleStringExpression | this_LiteralNameOrReference_7= ruleLiteralNameOrReference ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralBoolean_0 = null;

        EObject this_LiteralUndef_1 = null;

        EObject this_LiteralDefault_2 = null;

        EObject this_LiteralList_3 = null;

        EObject this_LiteralHash_4 = null;

        EObject this_LiteralRegex_5 = null;

        EObject this_StringExpression_6 = null;

        EObject this_LiteralNameOrReference_7 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3897:28: ( (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralUndef_1= ruleLiteralUndef | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralList_3= ruleLiteralList | this_LiteralHash_4= ruleLiteralHash | this_LiteralRegex_5= ruleLiteralRegex | this_StringExpression_6= ruleStringExpression | this_LiteralNameOrReference_7= ruleLiteralNameOrReference ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3898:1: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralUndef_1= ruleLiteralUndef | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralList_3= ruleLiteralList | this_LiteralHash_4= ruleLiteralHash | this_LiteralRegex_5= ruleLiteralRegex | this_StringExpression_6= ruleStringExpression | this_LiteralNameOrReference_7= ruleLiteralNameOrReference )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3898:1: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralUndef_1= ruleLiteralUndef | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralList_3= ruleLiteralList | this_LiteralHash_4= ruleLiteralHash | this_LiteralRegex_5= ruleLiteralRegex | this_StringExpression_6= ruleStringExpression | this_LiteralNameOrReference_7= ruleLiteralNameOrReference )
            int alt80=8;
            switch ( input.LA(1) ) {
            case KEYWORD_57:
            case KEYWORD_54:
                {
                alt80=1;
                }
                break;
            case KEYWORD_58:
                {
                alt80=2;
                }
                break;
            case KEYWORD_61:
                {
                alt80=3;
                }
                break;
            case KEYWORD_18:
                {
                alt80=4;
                }
                break;
            case KEYWORD_20:
                {
                alt80=5;
                }
                break;
            case RULE_REGULAR_EXPRESSION:
                {
                alt80=6;
                }
                break;
            case KEYWORD_24:
            case KEYWORD_2:
            case KEYWORD_3:
                {
                alt80=7;
                }
                break;
            case RULE_WORD_CHARS:
                {
                alt80=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3899:2: this_LiteralBoolean_0= ruleLiteralBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralBoolean_in_ruleLiteralExpression8343);
                    this_LiteralBoolean_0=ruleLiteralBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralBoolean_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3912:2: this_LiteralUndef_1= ruleLiteralUndef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralUndefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralUndef_in_ruleLiteralExpression8373);
                    this_LiteralUndef_1=ruleLiteralUndef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralUndef_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3925:2: this_LiteralDefault_2= ruleLiteralDefault
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralDefaultParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralDefault_in_ruleLiteralExpression8403);
                    this_LiteralDefault_2=ruleLiteralDefault();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralDefault_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3938:2: this_LiteralList_3= ruleLiteralList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralListParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralList_in_ruleLiteralExpression8433);
                    this_LiteralList_3=ruleLiteralList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralList_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3951:2: this_LiteralHash_4= ruleLiteralHash
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralHashParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralHash_in_ruleLiteralExpression8463);
                    this_LiteralHash_4=ruleLiteralHash();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralHash_4;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3964:2: this_LiteralRegex_5= ruleLiteralRegex
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralRegexParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralRegex_in_ruleLiteralExpression8493);
                    this_LiteralRegex_5=ruleLiteralRegex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralRegex_5;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3977:2: this_StringExpression_6= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getStringExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleLiteralExpression8523);
                    this_StringExpression_6=ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StringExpression_6;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3990:2: this_LiteralNameOrReference_7= ruleLiteralNameOrReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralNameOrReferenceParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralNameOrReference_in_ruleLiteralExpression8553);
                    this_LiteralNameOrReference_7=ruleLiteralNameOrReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralNameOrReference_7;
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteralNameOrReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4009:1: entryRuleLiteralNameOrReference returns [EObject current=null] : iv_ruleLiteralNameOrReference= ruleLiteralNameOrReference EOF ;
    public final EObject entryRuleLiteralNameOrReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNameOrReference = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4010:2: (iv_ruleLiteralNameOrReference= ruleLiteralNameOrReference EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4011:2: iv_ruleLiteralNameOrReference= ruleLiteralNameOrReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNameOrReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralNameOrReference_in_entryRuleLiteralNameOrReference8587);
            iv_ruleLiteralNameOrReference=ruleLiteralNameOrReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralNameOrReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralNameOrReference8597); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralNameOrReference"


    // $ANTLR start "ruleLiteralNameOrReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4018:1: ruleLiteralNameOrReference returns [EObject current=null] : ( (lv_value_0_0= rulename ) ) ;
    public final EObject ruleLiteralNameOrReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4021:28: ( ( (lv_value_0_0= rulename ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4022:1: ( (lv_value_0_0= rulename ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4022:1: ( (lv_value_0_0= rulename ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4023:1: (lv_value_0_0= rulename )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4023:1: (lv_value_0_0= rulename )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4024:3: lv_value_0_0= rulename
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralNameOrReferenceAccess().getValueNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_rulename_in_ruleLiteralNameOrReference8642);
            lv_value_0_0=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLiteralNameOrReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"name");
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
    // $ANTLR end "ruleLiteralNameOrReference"


    // $ANTLR start "entryRuleUNION_VARIABLE_OR_NAME"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4048:1: entryRuleUNION_VARIABLE_OR_NAME returns [String current=null] : iv_ruleUNION_VARIABLE_OR_NAME= ruleUNION_VARIABLE_OR_NAME EOF ;
    public final String entryRuleUNION_VARIABLE_OR_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNION_VARIABLE_OR_NAME = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4049:1: (iv_ruleUNION_VARIABLE_OR_NAME= ruleUNION_VARIABLE_OR_NAME EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4050:2: iv_ruleUNION_VARIABLE_OR_NAME= ruleUNION_VARIABLE_OR_NAME EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUNION_VARIABLE_OR_NAMERule()); 
            }
            pushFollow(FOLLOW_ruleUNION_VARIABLE_OR_NAME_in_entryRuleUNION_VARIABLE_OR_NAME8677);
            iv_ruleUNION_VARIABLE_OR_NAME=ruleUNION_VARIABLE_OR_NAME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUNION_VARIABLE_OR_NAME.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNION_VARIABLE_OR_NAME8688); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUNION_VARIABLE_OR_NAME"


    // $ANTLR start "ruleUNION_VARIABLE_OR_NAME"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4057:1: ruleUNION_VARIABLE_OR_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_dollarVariable_0= ruledollarVariable | this_name_1= rulename ) ;
    public final AntlrDatatypeRuleToken ruleUNION_VARIABLE_OR_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_dollarVariable_0 = null;

        AntlrDatatypeRuleToken this_name_1 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4061:6: ( (this_dollarVariable_0= ruledollarVariable | this_name_1= rulename ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4062:1: (this_dollarVariable_0= ruledollarVariable | this_name_1= rulename )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4062:1: (this_dollarVariable_0= ruledollarVariable | this_name_1= rulename )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_DOLLAR_VAR) ) {
                alt81=1;
            }
            else if ( (LA81_0==RULE_WORD_CHARS) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4063:5: this_dollarVariable_0= ruledollarVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUNION_VARIABLE_OR_NAMEAccess().getDollarVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruledollarVariable_in_ruleUNION_VARIABLE_OR_NAME8735);
                    this_dollarVariable_0=ruledollarVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_dollarVariable_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4075:5: this_name_1= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUNION_VARIABLE_OR_NAMEAccess().getNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulename_in_ruleUNION_VARIABLE_OR_NAME8768);
                    this_name_1=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_name_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleUNION_VARIABLE_OR_NAME"


    // $ANTLR start "entryRuleParenthisedExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4093:1: entryRuleParenthisedExpression returns [EObject current=null] : iv_ruleParenthisedExpression= ruleParenthisedExpression EOF ;
    public final EObject entryRuleParenthisedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthisedExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4094:2: (iv_ruleParenthisedExpression= ruleParenthisedExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4095:2: iv_ruleParenthisedExpression= ruleParenthisedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthisedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthisedExpression_in_entryRuleParenthisedExpression8812);
            iv_ruleParenthisedExpression=ruleParenthisedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthisedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthisedExpression8822); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenthisedExpression"


    // $ANTLR start "ruleParenthisedExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4102:1: ruleParenthisedExpression returns [EObject current=null] : (otherlv_0= KEYWORD_4 () ( (lv_expr_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_5 ) ;
    public final EObject ruleParenthisedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4105:28: ( (otherlv_0= KEYWORD_4 () ( (lv_expr_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_5 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4106:1: (otherlv_0= KEYWORD_4 () ( (lv_expr_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_5 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4106:1: (otherlv_0= KEYWORD_4 () ( (lv_expr_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_5 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4107:2: otherlv_0= KEYWORD_4 () ( (lv_expr_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_5
            {
            otherlv_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleParenthisedExpression8860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthisedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4111:1: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4112:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthisedExpressionAccess().getParenthesisedExpressionAction_1(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4120:2: ( (lv_expr_2_0= ruleAssignmentExpression ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=KEYWORD_61 && LA82_0<=KEYWORD_55)||(LA82_0>=KEYWORD_57 && LA82_0<=KEYWORD_51)||(LA82_0>=KEYWORD_53 && LA82_0<=KEYWORD_54)||LA82_0==KEYWORD_24||LA82_0==KEYWORD_42||(LA82_0>=KEYWORD_1 && LA82_0<=KEYWORD_4)||LA82_0==KEYWORD_9||(LA82_0>=KEYWORD_17 && LA82_0<=KEYWORD_18)||LA82_0==KEYWORD_20||(LA82_0>=RULE_DOLLAR_VAR && LA82_0<=RULE_WORD_CHARS)||LA82_0==RULE_REGULAR_EXPRESSION) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4121:1: (lv_expr_2_0= ruleAssignmentExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4121:1: (lv_expr_2_0= ruleAssignmentExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4122:3: lv_expr_2_0= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParenthisedExpressionAccess().getExprAssignmentExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleParenthisedExpression8892);
                    lv_expr_2_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParenthisedExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"AssignmentExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleParenthisedExpression8906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getParenthisedExpressionAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleParenthisedExpression"


    // $ANTLR start "entryRuleVirtualNameOrReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4151:1: entryRuleVirtualNameOrReference returns [EObject current=null] : iv_ruleVirtualNameOrReference= ruleVirtualNameOrReference EOF ;
    public final EObject entryRuleVirtualNameOrReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVirtualNameOrReference = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4152:2: (iv_ruleVirtualNameOrReference= ruleVirtualNameOrReference EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4153:2: iv_ruleVirtualNameOrReference= ruleVirtualNameOrReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVirtualNameOrReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVirtualNameOrReference_in_entryRuleVirtualNameOrReference8940);
            iv_ruleVirtualNameOrReference=ruleVirtualNameOrReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVirtualNameOrReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVirtualNameOrReference8950); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVirtualNameOrReference"


    // $ANTLR start "ruleVirtualNameOrReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4160:1: ruleVirtualNameOrReference returns [EObject current=null] : (otherlv_0= KEYWORD_17 ( (lv_exported_1_0= ruleATBoolean ) )? ( (lv_value_2_0= ruleunionNameOrReference ) ) ) ;
    public final EObject ruleVirtualNameOrReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_exported_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4163:28: ( (otherlv_0= KEYWORD_17 ( (lv_exported_1_0= ruleATBoolean ) )? ( (lv_value_2_0= ruleunionNameOrReference ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4164:1: (otherlv_0= KEYWORD_17 ( (lv_exported_1_0= ruleATBoolean ) )? ( (lv_value_2_0= ruleunionNameOrReference ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4164:1: (otherlv_0= KEYWORD_17 ( (lv_exported_1_0= ruleATBoolean ) )? ( (lv_value_2_0= ruleunionNameOrReference ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4165:2: otherlv_0= KEYWORD_17 ( (lv_exported_1_0= ruleATBoolean ) )? ( (lv_value_2_0= ruleunionNameOrReference ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleVirtualNameOrReference8988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVirtualNameOrReferenceAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4169:1: ( (lv_exported_1_0= ruleATBoolean ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==KEYWORD_17) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4170:1: (lv_exported_1_0= ruleATBoolean )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4170:1: (lv_exported_1_0= ruleATBoolean )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4171:3: lv_exported_1_0= ruleATBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVirtualNameOrReferenceAccess().getExportedATBooleanParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleATBoolean_in_ruleVirtualNameOrReference9008);
                    lv_exported_1_0=ruleATBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVirtualNameOrReferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"exported",
                              		lv_exported_1_0, 
                              		"ATBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4187:3: ( (lv_value_2_0= ruleunionNameOrReference ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4188:1: (lv_value_2_0= ruleunionNameOrReference )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4188:1: (lv_value_2_0= ruleunionNameOrReference )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4189:3: lv_value_2_0= ruleunionNameOrReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVirtualNameOrReferenceAccess().getValueUnionNameOrReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleunionNameOrReference_in_ruleVirtualNameOrReference9030);
            lv_value_2_0=ruleunionNameOrReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVirtualNameOrReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"unionNameOrReference");
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
    // $ANTLR end "ruleVirtualNameOrReference"


    // $ANTLR start "entryRuleATBoolean"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4213:1: entryRuleATBoolean returns [String current=null] : iv_ruleATBoolean= ruleATBoolean EOF ;
    public final String entryRuleATBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATBoolean = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4214:1: (iv_ruleATBoolean= ruleATBoolean EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4215:2: iv_ruleATBoolean= ruleATBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getATBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleATBoolean_in_entryRuleATBoolean9066);
            iv_ruleATBoolean=ruleATBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleATBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleATBoolean9077); if (state.failed) return current;

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
    // $ANTLR end "entryRuleATBoolean"


    // $ANTLR start "ruleATBoolean"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4222:1: ruleATBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_17 ;
    public final AntlrDatatypeRuleToken ruleATBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4226:6: (kw= KEYWORD_17 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4228:2: kw= KEYWORD_17
            {
            kw=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleATBoolean9114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getATBooleanAccess().getCommercialAtKeyword()); 
                  
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
    // $ANTLR end "ruleATBoolean"


    // $ANTLR start "entryRuleImportExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4241:1: entryRuleImportExpression returns [EObject current=null] : iv_ruleImportExpression= ruleImportExpression EOF ;
    public final EObject entryRuleImportExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4242:2: (iv_ruleImportExpression= ruleImportExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4243:2: iv_ruleImportExpression= ruleImportExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleImportExpression_in_entryRuleImportExpression9152);
            iv_ruleImportExpression=ruleImportExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportExpression9162); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportExpression"


    // $ANTLR start "ruleImportExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4250:1: ruleImportExpression returns [EObject current=null] : ( () otherlv_1= KEYWORD_60 ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )? ) ;
    public final EObject ruleImportExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4253:28: ( ( () otherlv_1= KEYWORD_60 ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4254:1: ( () otherlv_1= KEYWORD_60 ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4254:1: ( () otherlv_1= KEYWORD_60 ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4254:2: () otherlv_1= KEYWORD_60 ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )?
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4254:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4255:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImportExpressionAccess().getImportExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleImportExpression9212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImportExpressionAccess().getImportKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4268:1: ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )?
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4268:2: ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )*
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4268:2: ( (lv_values_2_0= ruleQuotedString ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4269:1: (lv_values_2_0= ruleQuotedString )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4269:1: (lv_values_2_0= ruleQuotedString )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4270:3: lv_values_2_0= ruleQuotedString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportExpressionAccess().getValuesQuotedStringParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQuotedString_in_ruleImportExpression9233);
                    lv_values_2_0=ruleQuotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"values",
                              		lv_values_2_0, 
                              		"QuotedString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4286:2: (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        alt84 = dfa84.predict(input);
                        switch (alt84) {
                    	case 1 :
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4287:2: otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleImportExpression9247); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getImportExpressionAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4291:1: ( (lv_values_4_0= ruleQuotedString ) )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4292:1: (lv_values_4_0= ruleQuotedString )
                    	    {
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4292:1: (lv_values_4_0= ruleQuotedString )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4293:3: lv_values_4_0= ruleQuotedString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getImportExpressionAccess().getValuesQuotedStringParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQuotedString_in_ruleImportExpression9267);
                    	    lv_values_4_0=ruleQuotedString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getImportExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"values",
                    	              		lv_values_4_0, 
                    	              		"QuotedString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


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
    // $ANTLR end "ruleImportExpression"


    // $ANTLR start "entryRuleLiteralList"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4317:1: entryRuleLiteralList returns [EObject current=null] : iv_ruleLiteralList= ruleLiteralList EOF ;
    public final EObject entryRuleLiteralList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralList = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4318:2: (iv_ruleLiteralList= ruleLiteralList EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4319:2: iv_ruleLiteralList= ruleLiteralList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralListRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralList_in_entryRuleLiteralList9306);
            iv_ruleLiteralList=ruleLiteralList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralList9316); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralList"


    // $ANTLR start "ruleLiteralList"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4326:1: ruleLiteralList returns [EObject current=null] : ( () otherlv_1= KEYWORD_18 ( ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )* (otherlv_5= KEYWORD_8 )? )? otherlv_6= KEYWORD_19 ) ;
    public final EObject ruleLiteralList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4329:28: ( ( () otherlv_1= KEYWORD_18 ( ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )* (otherlv_5= KEYWORD_8 )? )? otherlv_6= KEYWORD_19 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4330:1: ( () otherlv_1= KEYWORD_18 ( ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )* (otherlv_5= KEYWORD_8 )? )? otherlv_6= KEYWORD_19 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4330:1: ( () otherlv_1= KEYWORD_18 ( ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )* (otherlv_5= KEYWORD_8 )? )? otherlv_6= KEYWORD_19 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4330:2: () otherlv_1= KEYWORD_18 ( ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )* (otherlv_5= KEYWORD_8 )? )? otherlv_6= KEYWORD_19
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4330:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4331:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralListAccess().getLiteralListAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleLiteralList9366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralListAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4344:1: ( ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )* (otherlv_5= KEYWORD_8 )? )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=KEYWORD_61 && LA88_0<=KEYWORD_55)||(LA88_0>=KEYWORD_57 && LA88_0<=KEYWORD_51)||(LA88_0>=KEYWORD_53 && LA88_0<=KEYWORD_54)||LA88_0==KEYWORD_24||LA88_0==KEYWORD_42||(LA88_0>=KEYWORD_1 && LA88_0<=KEYWORD_4)||LA88_0==KEYWORD_9||(LA88_0>=KEYWORD_17 && LA88_0<=KEYWORD_18)||LA88_0==KEYWORD_20||(LA88_0>=RULE_DOLLAR_VAR && LA88_0<=RULE_WORD_CHARS)||LA88_0==RULE_REGULAR_EXPRESSION) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4344:2: ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )* (otherlv_5= KEYWORD_8 )?
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4344:2: ( (lv_elements_2_0= ruleAssignmentExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4345:1: (lv_elements_2_0= ruleAssignmentExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4345:1: (lv_elements_2_0= ruleAssignmentExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4346:3: lv_elements_2_0= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralListAccess().getElementsAssignmentExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleLiteralList9387);
                    lv_elements_2_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralListRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_2_0, 
                              		"AssignmentExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4362:2: (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==KEYWORD_8) ) {
                            int LA86_1 = input.LA(2);

                            if ( ((LA86_1>=KEYWORD_61 && LA86_1<=KEYWORD_55)||(LA86_1>=KEYWORD_57 && LA86_1<=KEYWORD_51)||(LA86_1>=KEYWORD_53 && LA86_1<=KEYWORD_54)||LA86_1==KEYWORD_24||LA86_1==KEYWORD_42||(LA86_1>=KEYWORD_1 && LA86_1<=KEYWORD_4)||LA86_1==KEYWORD_9||(LA86_1>=KEYWORD_17 && LA86_1<=KEYWORD_18)||LA86_1==KEYWORD_20||(LA86_1>=RULE_DOLLAR_VAR && LA86_1<=RULE_WORD_CHARS)||LA86_1==RULE_REGULAR_EXPRESSION) ) {
                                alt86=1;
                            }


                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4363:2: otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleLiteralList9401); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getLiteralListAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4367:1: ( (lv_elements_4_0= ruleAssignmentExpression ) )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4368:1: (lv_elements_4_0= ruleAssignmentExpression )
                    	    {
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4368:1: (lv_elements_4_0= ruleAssignmentExpression )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4369:3: lv_elements_4_0= ruleAssignmentExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLiteralListAccess().getElementsAssignmentExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleLiteralList9421);
                    	    lv_elements_4_0=ruleAssignmentExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLiteralListRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_4_0, 
                    	              		"AssignmentExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4385:4: (otherlv_5= KEYWORD_8 )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==KEYWORD_8) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4386:2: otherlv_5= KEYWORD_8
                            {
                            otherlv_5=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleLiteralList9437); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getLiteralListAccess().getCommaKeyword_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleLiteralList9453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLiteralListAccess().getRightSquareBracketKeyword_3());
                  
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
    // $ANTLR end "ruleLiteralList"


    // $ANTLR start "entryRuleLiteralHash"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4403:1: entryRuleLiteralHash returns [EObject current=null] : iv_ruleLiteralHash= ruleLiteralHash EOF ;
    public final EObject entryRuleLiteralHash() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralHash = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4404:2: (iv_ruleLiteralHash= ruleLiteralHash EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4405:2: iv_ruleLiteralHash= ruleLiteralHash EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralHashRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralHash_in_entryRuleLiteralHash9487);
            iv_ruleLiteralHash=ruleLiteralHash();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralHash; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralHash9497); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralHash"


    // $ANTLR start "ruleLiteralHash"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4412:1: ruleLiteralHash returns [EObject current=null] : ( () otherlv_1= KEYWORD_20 ( ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )* )? (otherlv_5= KEYWORD_8 )? otherlv_6= KEYWORD_21 ) ;
    public final EObject ruleLiteralHash() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4415:28: ( ( () otherlv_1= KEYWORD_20 ( ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )* )? (otherlv_5= KEYWORD_8 )? otherlv_6= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4416:1: ( () otherlv_1= KEYWORD_20 ( ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )* )? (otherlv_5= KEYWORD_8 )? otherlv_6= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4416:1: ( () otherlv_1= KEYWORD_20 ( ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )* )? (otherlv_5= KEYWORD_8 )? otherlv_6= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4416:2: () otherlv_1= KEYWORD_20 ( ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )* )? (otherlv_5= KEYWORD_8 )? otherlv_6= KEYWORD_21
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4416:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4417:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralHashAccess().getLiteralHashAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleLiteralHash9547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralHashAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4430:1: ( ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==KEYWORD_24||(LA90_0>=KEYWORD_2 && LA90_0<=KEYWORD_3)||LA90_0==RULE_WORD_CHARS) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4430:2: ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )*
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4430:2: ( (lv_elements_2_0= ruleHashEntry ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4431:1: (lv_elements_2_0= ruleHashEntry )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4431:1: (lv_elements_2_0= ruleHashEntry )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4432:3: lv_elements_2_0= ruleHashEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralHashAccess().getElementsHashEntryParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHashEntry_in_ruleLiteralHash9568);
                    lv_elements_2_0=ruleHashEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralHashRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_2_0, 
                              		"HashEntry");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4448:2: (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==KEYWORD_8) ) {
                            int LA89_1 = input.LA(2);

                            if ( (LA89_1==KEYWORD_24||(LA89_1>=KEYWORD_2 && LA89_1<=KEYWORD_3)||LA89_1==RULE_WORD_CHARS) ) {
                                alt89=1;
                            }


                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4449:2: otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleLiteralHash9582); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getLiteralHashAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4453:1: ( (lv_elements_4_0= ruleHashEntry ) )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4454:1: (lv_elements_4_0= ruleHashEntry )
                    	    {
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4454:1: (lv_elements_4_0= ruleHashEntry )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4455:3: lv_elements_4_0= ruleHashEntry
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLiteralHashAccess().getElementsHashEntryParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleHashEntry_in_ruleLiteralHash9602);
                    	    lv_elements_4_0=ruleHashEntry();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLiteralHashRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_4_0, 
                    	              		"HashEntry");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4471:6: (otherlv_5= KEYWORD_8 )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==KEYWORD_8) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4472:2: otherlv_5= KEYWORD_8
                    {
                    otherlv_5=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleLiteralHash9620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getLiteralHashAccess().getCommaKeyword_3());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleLiteralHash9634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLiteralHashAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleLiteralHash"


    // $ANTLR start "entryRuleHashEntry"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4489:1: entryRuleHashEntry returns [EObject current=null] : iv_ruleHashEntry= ruleHashEntry EOF ;
    public final EObject entryRuleHashEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashEntry = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4490:2: (iv_ruleHashEntry= ruleHashEntry EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4491:2: iv_ruleHashEntry= ruleHashEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHashEntryRule()); 
            }
            pushFollow(FOLLOW_ruleHashEntry_in_entryRuleHashEntry9668);
            iv_ruleHashEntry=ruleHashEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHashEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashEntry9678); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHashEntry"


    // $ANTLR start "ruleHashEntry"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4498:1: ruleHashEntry returns [EObject current=null] : ( ( (lv_key_0_0= ruleLiteralNameOrString ) ) otherlv_1= KEYWORD_34 ( (lv_value_2_0= ruleAssignmentExpression ) ) ) ;
    public final EObject ruleHashEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_key_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4501:28: ( ( ( (lv_key_0_0= ruleLiteralNameOrString ) ) otherlv_1= KEYWORD_34 ( (lv_value_2_0= ruleAssignmentExpression ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4502:1: ( ( (lv_key_0_0= ruleLiteralNameOrString ) ) otherlv_1= KEYWORD_34 ( (lv_value_2_0= ruleAssignmentExpression ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4502:1: ( ( (lv_key_0_0= ruleLiteralNameOrString ) ) otherlv_1= KEYWORD_34 ( (lv_value_2_0= ruleAssignmentExpression ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4502:2: ( (lv_key_0_0= ruleLiteralNameOrString ) ) otherlv_1= KEYWORD_34 ( (lv_value_2_0= ruleAssignmentExpression ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4502:2: ( (lv_key_0_0= ruleLiteralNameOrString ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4503:1: (lv_key_0_0= ruleLiteralNameOrString )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4503:1: (lv_key_0_0= ruleLiteralNameOrString )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4504:3: lv_key_0_0= ruleLiteralNameOrString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHashEntryAccess().getKeyLiteralNameOrStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralNameOrString_in_ruleHashEntry9724);
            lv_key_0_0=ruleLiteralNameOrString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHashEntryRule());
              	        }
                     		set(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"LiteralNameOrString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleHashEntry9737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getHashEntryAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4525:1: ( (lv_value_2_0= ruleAssignmentExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4526:1: (lv_value_2_0= ruleAssignmentExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4526:1: (lv_value_2_0= ruleAssignmentExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4527:3: lv_value_2_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHashEntryAccess().getValueAssignmentExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleHashEntry9757);
            lv_value_2_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHashEntryRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"AssignmentExpression");
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
    // $ANTLR end "ruleHashEntry"


    // $ANTLR start "entryRuleLiteralNameOrString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4551:1: entryRuleLiteralNameOrString returns [EObject current=null] : iv_ruleLiteralNameOrString= ruleLiteralNameOrString EOF ;
    public final EObject entryRuleLiteralNameOrString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNameOrString = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4552:2: (iv_ruleLiteralNameOrString= ruleLiteralNameOrString EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4553:2: iv_ruleLiteralNameOrString= ruleLiteralNameOrString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNameOrStringRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralNameOrString_in_entryRuleLiteralNameOrString9792);
            iv_ruleLiteralNameOrString=ruleLiteralNameOrString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralNameOrString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralNameOrString9802); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralNameOrString"


    // $ANTLR start "ruleLiteralNameOrString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4560:1: ruleLiteralNameOrString returns [EObject current=null] : (this_StringExpression_0= ruleStringExpression | this_LiteralName_1= ruleLiteralName ) ;
    public final EObject ruleLiteralNameOrString() throws RecognitionException {
        EObject current = null;

        EObject this_StringExpression_0 = null;

        EObject this_LiteralName_1 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4563:28: ( (this_StringExpression_0= ruleStringExpression | this_LiteralName_1= ruleLiteralName ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4564:1: (this_StringExpression_0= ruleStringExpression | this_LiteralName_1= ruleLiteralName )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4564:1: (this_StringExpression_0= ruleStringExpression | this_LiteralName_1= ruleLiteralName )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==KEYWORD_24||(LA92_0>=KEYWORD_2 && LA92_0<=KEYWORD_3)) ) {
                alt92=1;
            }
            else if ( (LA92_0==RULE_WORD_CHARS) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4565:2: this_StringExpression_0= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralNameOrStringAccess().getStringExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleLiteralNameOrString9852);
                    this_StringExpression_0=ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StringExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4578:2: this_LiteralName_1= ruleLiteralName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralNameOrStringAccess().getLiteralNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralName_in_ruleLiteralNameOrString9882);
                    this_LiteralName_1=ruleLiteralName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralName_1;
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleLiteralNameOrString"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4597:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4598:1: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4599:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue9917);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue9928); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4606:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_54 | kw= KEYWORD_57 ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4610:6: ( (kw= KEYWORD_54 | kw= KEYWORD_57 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4611:1: (kw= KEYWORD_54 | kw= KEYWORD_57 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4611:1: (kw= KEYWORD_54 | kw= KEYWORD_57 )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==KEYWORD_54) ) {
                alt93=1;
            }
            else if ( (LA93_0==KEYWORD_57) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4612:2: kw= KEYWORD_54
                    {
                    kw=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleBooleanValue9966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4619:2: kw= KEYWORD_57
                    {
                    kw=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleBooleanValue9985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanValueAccess().getFalseKeyword_1()); 
                          
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleLiteralBoolean"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4632:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4633:2: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4634:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean10024);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralBoolean10034); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4641:1: ruleLiteralBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4644:28: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4645:1: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4645:1: ( (lv_value_0_0= ruleBooleanValue ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4646:1: (lv_value_0_0= ruleBooleanValue )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4646:1: (lv_value_0_0= ruleBooleanValue )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4647:3: lv_value_0_0= ruleBooleanValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_ruleLiteralBoolean10079);
            lv_value_0_0=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLiteralBooleanRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"BooleanValue");
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
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleLiteralDefault"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4671:1: entryRuleLiteralDefault returns [EObject current=null] : iv_ruleLiteralDefault= ruleLiteralDefault EOF ;
    public final EObject entryRuleLiteralDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralDefault = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4672:2: (iv_ruleLiteralDefault= ruleLiteralDefault EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4673:2: iv_ruleLiteralDefault= ruleLiteralDefault EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralDefaultRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralDefault_in_entryRuleLiteralDefault10113);
            iv_ruleLiteralDefault=ruleLiteralDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralDefault; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralDefault10123); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralDefault"


    // $ANTLR start "ruleLiteralDefault"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4680:1: ruleLiteralDefault returns [EObject current=null] : ( () otherlv_1= KEYWORD_61 ) ;
    public final EObject ruleLiteralDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4683:28: ( ( () otherlv_1= KEYWORD_61 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4684:1: ( () otherlv_1= KEYWORD_61 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4684:1: ( () otherlv_1= KEYWORD_61 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4684:2: () otherlv_1= KEYWORD_61
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4684:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4685:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralDefaultAccess().getLiteralDefaultAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleLiteralDefault10173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralDefaultAccess().getDefaultKeyword_1());
                  
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
    // $ANTLR end "ruleLiteralDefault"


    // $ANTLR start "entryRuleLiteralUndef"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4706:1: entryRuleLiteralUndef returns [EObject current=null] : iv_ruleLiteralUndef= ruleLiteralUndef EOF ;
    public final EObject entryRuleLiteralUndef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralUndef = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4707:2: (iv_ruleLiteralUndef= ruleLiteralUndef EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4708:2: iv_ruleLiteralUndef= ruleLiteralUndef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralUndefRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralUndef_in_entryRuleLiteralUndef10207);
            iv_ruleLiteralUndef=ruleLiteralUndef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralUndef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralUndef10217); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralUndef"


    // $ANTLR start "ruleLiteralUndef"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4715:1: ruleLiteralUndef returns [EObject current=null] : ( () otherlv_1= KEYWORD_58 ) ;
    public final EObject ruleLiteralUndef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4718:28: ( ( () otherlv_1= KEYWORD_58 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4719:1: ( () otherlv_1= KEYWORD_58 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4719:1: ( () otherlv_1= KEYWORD_58 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4719:2: () otherlv_1= KEYWORD_58
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4719:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4720:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralUndefAccess().getLiteralUndefAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleLiteralUndef10267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralUndefAccess().getUndefKeyword_1());
                  
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
    // $ANTLR end "ruleLiteralUndef"


    // $ANTLR start "entryRuleLiteralClass"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4741:1: entryRuleLiteralClass returns [EObject current=null] : iv_ruleLiteralClass= ruleLiteralClass EOF ;
    public final EObject entryRuleLiteralClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralClass = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4742:2: (iv_ruleLiteralClass= ruleLiteralClass EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4743:2: iv_ruleLiteralClass= ruleLiteralClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralClassRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralClass_in_entryRuleLiteralClass10301);
            iv_ruleLiteralClass=ruleLiteralClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralClass10311); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralClass"


    // $ANTLR start "ruleLiteralClass"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4750:1: ruleLiteralClass returns [EObject current=null] : ( () otherlv_1= KEYWORD_55 ) ;
    public final EObject ruleLiteralClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4753:28: ( ( () otherlv_1= KEYWORD_55 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4754:1: ( () otherlv_1= KEYWORD_55 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4754:1: ( () otherlv_1= KEYWORD_55 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4754:2: () otherlv_1= KEYWORD_55
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4754:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4755:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralClassAccess().getLiteralClassAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleLiteralClass10361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralClassAccess().getClassKeyword_1());
                  
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
    // $ANTLR end "ruleLiteralClass"


    // $ANTLR start "entryRuleStringExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4776:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4780:2: (iv_ruleStringExpression= ruleStringExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4781:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression10401);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression10411); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4791:1: ruleStringExpression returns [EObject current=null] : (this_SingleQuotedString_0= ruleSingleQuotedString | this_UnquotedString_1= ruleUnquotedString | this_DoubleQuotedString_2= ruleDoubleQuotedString ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SingleQuotedString_0 = null;

        EObject this_UnquotedString_1 = null;

        EObject this_DoubleQuotedString_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4795:28: ( (this_SingleQuotedString_0= ruleSingleQuotedString | this_UnquotedString_1= ruleUnquotedString | this_DoubleQuotedString_2= ruleDoubleQuotedString ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4796:1: (this_SingleQuotedString_0= ruleSingleQuotedString | this_UnquotedString_1= ruleUnquotedString | this_DoubleQuotedString_2= ruleDoubleQuotedString )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4796:1: (this_SingleQuotedString_0= ruleSingleQuotedString | this_UnquotedString_1= ruleUnquotedString | this_DoubleQuotedString_2= ruleDoubleQuotedString )
            int alt94=3;
            switch ( input.LA(1) ) {
            case KEYWORD_3:
                {
                alt94=1;
                }
                break;
            case KEYWORD_24:
                {
                alt94=2;
                }
                break;
            case KEYWORD_2:
                {
                alt94=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4797:2: this_SingleQuotedString_0= ruleSingleQuotedString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStringExpressionAccess().getSingleQuotedStringParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleQuotedString_in_ruleStringExpression10465);
                    this_SingleQuotedString_0=ruleSingleQuotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SingleQuotedString_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4810:2: this_UnquotedString_1= ruleUnquotedString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStringExpressionAccess().getUnquotedStringParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnquotedString_in_ruleStringExpression10495);
                    this_UnquotedString_1=ruleUnquotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_UnquotedString_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4823:2: this_DoubleQuotedString_2= ruleDoubleQuotedString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStringExpressionAccess().getDoubleQuotedStringParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoubleQuotedString_in_ruleStringExpression10525);
                    this_DoubleQuotedString_2=ruleDoubleQuotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_DoubleQuotedString_2;
                              afterParserOrEnumRuleCall();
                          
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleQuotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4845:1: entryRuleQuotedString returns [EObject current=null] : iv_ruleQuotedString= ruleQuotedString EOF ;
    public final EObject entryRuleQuotedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedString = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4849:2: (iv_ruleQuotedString= ruleQuotedString EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4850:2: iv_ruleQuotedString= ruleQuotedString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedStringRule()); 
            }
            pushFollow(FOLLOW_ruleQuotedString_in_entryRuleQuotedString10569);
            iv_ruleQuotedString=ruleQuotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotedString10579); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedString"


    // $ANTLR start "ruleQuotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4860:1: ruleQuotedString returns [EObject current=null] : (this_DoubleQuotedString_0= ruleDoubleQuotedString | this_SingleQuotedString_1= ruleSingleQuotedString ) ;
    public final EObject ruleQuotedString() throws RecognitionException {
        EObject current = null;

        EObject this_DoubleQuotedString_0 = null;

        EObject this_SingleQuotedString_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4864:28: ( (this_DoubleQuotedString_0= ruleDoubleQuotedString | this_SingleQuotedString_1= ruleSingleQuotedString ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4865:1: (this_DoubleQuotedString_0= ruleDoubleQuotedString | this_SingleQuotedString_1= ruleSingleQuotedString )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4865:1: (this_DoubleQuotedString_0= ruleDoubleQuotedString | this_SingleQuotedString_1= ruleSingleQuotedString )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==KEYWORD_2) ) {
                alt95=1;
            }
            else if ( (LA95_0==KEYWORD_3) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4866:2: this_DoubleQuotedString_0= ruleDoubleQuotedString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAccess().getDoubleQuotedStringParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoubleQuotedString_in_ruleQuotedString10633);
                    this_DoubleQuotedString_0=ruleDoubleQuotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_DoubleQuotedString_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4879:2: this_SingleQuotedString_1= ruleSingleQuotedString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAccess().getSingleQuotedStringParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleQuotedString_in_ruleQuotedString10663);
                    this_SingleQuotedString_1=ruleSingleQuotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SingleQuotedString_1;
                              afterParserOrEnumRuleCall();
                          
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQuotedString"


    // $ANTLR start "entryRuleSingleQuotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4901:1: entryRuleSingleQuotedString returns [EObject current=null] : iv_ruleSingleQuotedString= ruleSingleQuotedString EOF ;
    public final EObject entryRuleSingleQuotedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleQuotedString = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4902:2: (iv_ruleSingleQuotedString= ruleSingleQuotedString EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4903:2: iv_ruleSingleQuotedString= ruleSingleQuotedString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleQuotedStringRule()); 
            }
            pushFollow(FOLLOW_ruleSingleQuotedString_in_entryRuleSingleQuotedString10701);
            iv_ruleSingleQuotedString=ruleSingleQuotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleQuotedString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleQuotedString10711); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleQuotedString"


    // $ANTLR start "ruleSingleQuotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4910:1: ruleSingleQuotedString returns [EObject current=null] : ( () ( ( KEYWORD_3 )=> (lv_text_1_0= rulesqText ) ) ) ;
    public final EObject ruleSingleQuotedString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4913:28: ( ( () ( ( KEYWORD_3 )=> (lv_text_1_0= rulesqText ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4914:1: ( () ( ( KEYWORD_3 )=> (lv_text_1_0= rulesqText ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4914:1: ( () ( ( KEYWORD_3 )=> (lv_text_1_0= rulesqText ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4914:2: () ( ( KEYWORD_3 )=> (lv_text_1_0= rulesqText ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4914:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4915:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleQuotedStringAccess().getSingleQuotedStringAction_0(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4923:2: ( ( KEYWORD_3 )=> (lv_text_1_0= rulesqText ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4923:3: ( KEYWORD_3 )=> (lv_text_1_0= rulesqText )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4926:1: (lv_text_1_0= rulesqText )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4927:3: lv_text_1_0= rulesqText
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleQuotedStringAccess().getTextSqTextParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulesqText_in_ruleSingleQuotedString10775);
            lv_text_1_0=rulesqText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSingleQuotedStringRule());
              	        }
                     		set(
                     			current, 
                     			"text",
                      		lv_text_1_0, 
                      		"sqText");
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
    // $ANTLR end "ruleSingleQuotedString"


    // $ANTLR start "entryRuleDoubleQuotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4951:1: entryRuleDoubleQuotedString returns [EObject current=null] : iv_ruleDoubleQuotedString= ruleDoubleQuotedString EOF ;
    public final EObject entryRuleDoubleQuotedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleQuotedString = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4955:2: (iv_ruleDoubleQuotedString= ruleDoubleQuotedString EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4956:2: iv_ruleDoubleQuotedString= ruleDoubleQuotedString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleQuotedStringRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleQuotedString_in_entryRuleDoubleQuotedString10816);
            iv_ruleDoubleQuotedString=ruleDoubleQuotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleQuotedString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleQuotedString10826); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleQuotedString"


    // $ANTLR start "ruleDoubleQuotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4966:1: ruleDoubleQuotedString returns [EObject current=null] : (otherlv_0= KEYWORD_2 () ( (lv_stringPart_2_0= ruleTextExpression ) )* otherlv_3= KEYWORD_2 ) ;
    public final EObject ruleDoubleQuotedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_stringPart_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4970:28: ( (otherlv_0= KEYWORD_2 () ( (lv_stringPart_2_0= ruleTextExpression ) )* otherlv_3= KEYWORD_2 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4971:1: (otherlv_0= KEYWORD_2 () ( (lv_stringPart_2_0= ruleTextExpression ) )* otherlv_3= KEYWORD_2 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4971:1: (otherlv_0= KEYWORD_2 () ( (lv_stringPart_2_0= ruleTextExpression ) )* otherlv_3= KEYWORD_2 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4972:2: otherlv_0= KEYWORD_2 () ( (lv_stringPart_2_0= ruleTextExpression ) )* otherlv_3= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleDoubleQuotedString10868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDoubleQuotedStringAccess().getQuotationMarkKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4976:1: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4977:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDoubleQuotedStringAccess().getDoubleQuotedStringAction_1(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4985:2: ( (lv_stringPart_2_0= ruleTextExpression ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==KEYWORD_48||LA96_0==KEYWORD_24||(LA96_0>=KEYWORD_38 && LA96_0<=KEYWORD_41)||(LA96_0>=RULE_WS && LA96_0<=RULE_WORD_CHARS)||LA96_0==RULE_ANY_OTHER) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4986:1: (lv_stringPart_2_0= ruleTextExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4986:1: (lv_stringPart_2_0= ruleTextExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4987:3: lv_stringPart_2_0= ruleTextExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDoubleQuotedStringAccess().getStringPartTextExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTextExpression_in_ruleDoubleQuotedString10900);
            	    lv_stringPart_2_0=ruleTextExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDoubleQuotedStringRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"stringPart",
            	              		lv_stringPart_2_0, 
            	              		"TextExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            otherlv_3=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleDoubleQuotedString10914); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDoubleQuotedStringAccess().getQuotationMarkKeyword_3());
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDoubleQuotedString"


    // $ANTLR start "entryRuleTextExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5019:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5023:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5024:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression10958);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression10968); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5034:1: ruleTextExpression returns [EObject current=null] : ( ( () ( (lv_text_1_0= ruledoubleStringCharacters ) ) ) | ( () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21 ) | ( () ( (lv_varName_7_0= ruledollarVariable ) ) ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;

        EObject lv_expression_4_0 = null;

        AntlrDatatypeRuleToken lv_varName_7_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5038:28: ( ( ( () ( (lv_text_1_0= ruledoubleStringCharacters ) ) ) | ( () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21 ) | ( () ( (lv_varName_7_0= ruledollarVariable ) ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5039:1: ( ( () ( (lv_text_1_0= ruledoubleStringCharacters ) ) ) | ( () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21 ) | ( () ( (lv_varName_7_0= ruledollarVariable ) ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5039:1: ( ( () ( (lv_text_1_0= ruledoubleStringCharacters ) ) ) | ( () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21 ) | ( () ( (lv_varName_7_0= ruledollarVariable ) ) ) )
            int alt97=3;
            switch ( input.LA(1) ) {
            case KEYWORD_48:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case RULE_WS:
            case RULE_WORD_CHARS:
            case RULE_ANY_OTHER:
                {
                alt97=1;
                }
                break;
            case KEYWORD_24:
                {
                alt97=2;
                }
                break;
            case RULE_DOLLAR_VAR:
                {
                alt97=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5039:2: ( () ( (lv_text_1_0= ruledoubleStringCharacters ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5039:2: ( () ( (lv_text_1_0= ruledoubleStringCharacters ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5039:3: () ( (lv_text_1_0= ruledoubleStringCharacters ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5039:3: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5040:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTextExpressionAccess().getVerbatimTEAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5048:2: ( (lv_text_1_0= ruledoubleStringCharacters ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5049:1: (lv_text_1_0= ruledoubleStringCharacters )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5049:1: (lv_text_1_0= ruledoubleStringCharacters )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5050:3: lv_text_1_0= ruledoubleStringCharacters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTextExpressionAccess().getTextDoubleStringCharactersParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledoubleStringCharacters_in_ruleTextExpression11031);
                    lv_text_1_0=ruledoubleStringCharacters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"text",
                              		lv_text_1_0, 
                              		"doubleStringCharacters");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5067:6: ( () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21 )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5067:6: ( () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21 )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5067:7: () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5067:7: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5068:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTextExpressionAccess().getExpressionTEAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleTextExpression11064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTextExpressionAccess().getDollarSignLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5081:1: ( (lv_expression_4_0= ruleExpressionWithHidden ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5082:1: (lv_expression_4_0= ruleExpressionWithHidden )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5082:1: (lv_expression_4_0= ruleExpressionWithHidden )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5083:3: lv_expression_4_0= ruleExpressionWithHidden
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTextExpressionAccess().getExpressionExpressionWithHiddenParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionWithHidden_in_ruleTextExpression11084);
                    lv_expression_4_0=ruleExpressionWithHidden();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"ExpressionWithHidden");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleTextExpression11097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTextExpressionAccess().getRightCurlyBracketKeyword_1_3());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5105:6: ( () ( (lv_varName_7_0= ruledollarVariable ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5105:6: ( () ( (lv_varName_7_0= ruledollarVariable ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5105:7: () ( (lv_varName_7_0= ruledollarVariable ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5105:7: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5106:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTextExpressionAccess().getVariableTEAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5114:2: ( (lv_varName_7_0= ruledollarVariable ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5115:1: (lv_varName_7_0= ruledollarVariable )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5115:1: (lv_varName_7_0= ruledollarVariable )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5116:3: lv_varName_7_0= ruledollarVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTextExpressionAccess().getVarNameDollarVariableParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledollarVariable_in_ruleTextExpression11137);
                    lv_varName_7_0=ruledollarVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"varName",
                              		lv_varName_7_0, 
                              		"dollarVariable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleExpressionWithHidden"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5143:1: entryRuleExpressionWithHidden returns [EObject current=null] : iv_ruleExpressionWithHidden= ruleExpressionWithHidden EOF ;
    public final EObject entryRuleExpressionWithHidden() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionWithHidden = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5147:2: (iv_ruleExpressionWithHidden= ruleExpressionWithHidden EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5148:2: iv_ruleExpressionWithHidden= ruleExpressionWithHidden EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionWithHiddenRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionWithHidden_in_entryRuleExpressionWithHidden11183);
            iv_ruleExpressionWithHidden=ruleExpressionWithHidden();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionWithHidden; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionWithHidden11193); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionWithHidden"


    // $ANTLR start "ruleExpressionWithHidden"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5158:1: ruleExpressionWithHidden returns [EObject current=null] : ( () ( (lv_expr_1_0= ruleAssignmentExpression ) )? ) ;
    public final EObject ruleExpressionWithHidden() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5162:28: ( ( () ( (lv_expr_1_0= ruleAssignmentExpression ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5163:1: ( () ( (lv_expr_1_0= ruleAssignmentExpression ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5163:1: ( () ( (lv_expr_1_0= ruleAssignmentExpression ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5163:2: () ( (lv_expr_1_0= ruleAssignmentExpression ) )?
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5163:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5164:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionWithHiddenAccess().getParenthesisedExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5172:2: ( (lv_expr_1_0= ruleAssignmentExpression ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=KEYWORD_61 && LA98_0<=KEYWORD_55)||(LA98_0>=KEYWORD_57 && LA98_0<=KEYWORD_51)||(LA98_0>=KEYWORD_53 && LA98_0<=KEYWORD_54)||LA98_0==KEYWORD_24||LA98_0==KEYWORD_42||(LA98_0>=KEYWORD_1 && LA98_0<=KEYWORD_4)||LA98_0==KEYWORD_9||(LA98_0>=KEYWORD_17 && LA98_0<=KEYWORD_18)||LA98_0==KEYWORD_20||(LA98_0>=RULE_DOLLAR_VAR && LA98_0<=RULE_WORD_CHARS)||LA98_0==RULE_REGULAR_EXPRESSION) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5173:1: (lv_expr_1_0= ruleAssignmentExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5173:1: (lv_expr_1_0= ruleAssignmentExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5174:3: lv_expr_1_0= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionWithHiddenAccess().getExprAssignmentExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpressionWithHidden11255);
                    lv_expr_1_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionWithHiddenRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_1_0, 
                              		"AssignmentExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleExpressionWithHidden"


    // $ANTLR start "entryRuleUnquotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5203:1: entryRuleUnquotedString returns [EObject current=null] : iv_ruleUnquotedString= ruleUnquotedString EOF ;
    public final EObject entryRuleUnquotedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnquotedString = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5204:2: (iv_ruleUnquotedString= ruleUnquotedString EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5205:2: iv_ruleUnquotedString= ruleUnquotedString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnquotedStringRule()); 
            }
            pushFollow(FOLLOW_ruleUnquotedString_in_entryRuleUnquotedString11297);
            iv_ruleUnquotedString=ruleUnquotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnquotedString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnquotedString11307); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnquotedString"


    // $ANTLR start "ruleUnquotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5212:1: ruleUnquotedString returns [EObject current=null] : ( () otherlv_1= KEYWORD_24 ( (lv_expression_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_21 ) ;
    public final EObject ruleUnquotedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5215:28: ( ( () otherlv_1= KEYWORD_24 ( (lv_expression_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5216:1: ( () otherlv_1= KEYWORD_24 ( (lv_expression_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5216:1: ( () otherlv_1= KEYWORD_24 ( (lv_expression_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5216:2: () otherlv_1= KEYWORD_24 ( (lv_expression_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_21
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5216:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5217:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnquotedStringAccess().getUnquotedStringAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleUnquotedString11357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnquotedStringAccess().getDollarSignLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5230:1: ( (lv_expression_2_0= ruleAssignmentExpression ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( ((LA99_0>=KEYWORD_61 && LA99_0<=KEYWORD_55)||(LA99_0>=KEYWORD_57 && LA99_0<=KEYWORD_51)||(LA99_0>=KEYWORD_53 && LA99_0<=KEYWORD_54)||LA99_0==KEYWORD_24||LA99_0==KEYWORD_42||(LA99_0>=KEYWORD_1 && LA99_0<=KEYWORD_4)||LA99_0==KEYWORD_9||(LA99_0>=KEYWORD_17 && LA99_0<=KEYWORD_18)||LA99_0==KEYWORD_20||(LA99_0>=RULE_DOLLAR_VAR && LA99_0<=RULE_WORD_CHARS)||LA99_0==RULE_REGULAR_EXPRESSION) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5231:1: (lv_expression_2_0= ruleAssignmentExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5231:1: (lv_expression_2_0= ruleAssignmentExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5232:3: lv_expression_2_0= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnquotedStringAccess().getExpressionAssignmentExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleUnquotedString11377);
                    lv_expression_2_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnquotedStringRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"AssignmentExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleUnquotedString11391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUnquotedStringAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleUnquotedString"


    // $ANTLR start "entryRulesqText"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5261:1: entryRulesqText returns [String current=null] : iv_rulesqText= rulesqText EOF ;
    public final String entryRulesqText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesqText = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5265:1: (iv_rulesqText= rulesqText EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5266:2: iv_rulesqText= rulesqText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqTextRule()); 
            }
            pushFollow(FOLLOW_rulesqText_in_entryRulesqText11432);
            iv_rulesqText=rulesqText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesqText.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesqText11443); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulesqText"


    // $ANTLR start "rulesqText"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5276:1: rulesqText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( KEYWORD_3 )=>kw= KEYWORD_3 ) (this_singleStringCharacters_1= rulesingleStringCharacters )? kw= KEYWORD_3 ) ;
    public final AntlrDatatypeRuleToken rulesqText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_singleStringCharacters_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5281:6: ( ( ( ( KEYWORD_3 )=>kw= KEYWORD_3 ) (this_singleStringCharacters_1= rulesingleStringCharacters )? kw= KEYWORD_3 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5282:1: ( ( ( KEYWORD_3 )=>kw= KEYWORD_3 ) (this_singleStringCharacters_1= rulesingleStringCharacters )? kw= KEYWORD_3 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5282:1: ( ( ( KEYWORD_3 )=>kw= KEYWORD_3 ) (this_singleStringCharacters_1= rulesingleStringCharacters )? kw= KEYWORD_3 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5282:2: ( ( KEYWORD_3 )=>kw= KEYWORD_3 ) (this_singleStringCharacters_1= rulesingleStringCharacters )? kw= KEYWORD_3
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5282:2: ( ( KEYWORD_3 )=>kw= KEYWORD_3 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5282:3: ( KEYWORD_3 )=>kw= KEYWORD_3
            {
            kw=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rulesqText11494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSqTextAccess().getApostropheKeyword_0()); 
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5290:2: (this_singleStringCharacters_1= rulesingleStringCharacters )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==KEYWORD_48||LA100_0==KEYWORD_24||(LA100_0>=KEYWORD_38 && LA100_0<=KEYWORD_41)||(LA100_0>=RULE_WS && LA100_0<=RULE_WORD_CHARS)||LA100_0==RULE_ANY_OTHER) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5291:5: this_singleStringCharacters_1= rulesingleStringCharacters
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSqTextAccess().getSingleStringCharactersParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulesingleStringCharacters_in_rulesqText11518);
                    this_singleStringCharacters_1=rulesingleStringCharacters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_singleStringCharacters_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rulesqText11538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSqTextAccess().getApostropheKeyword_2()); 
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesqText"


    // $ANTLR start "entryRuleLiteralRegex"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5318:1: entryRuleLiteralRegex returns [EObject current=null] : iv_ruleLiteralRegex= ruleLiteralRegex EOF ;
    public final EObject entryRuleLiteralRegex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralRegex = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5319:2: (iv_ruleLiteralRegex= ruleLiteralRegex EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5320:2: iv_ruleLiteralRegex= ruleLiteralRegex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRegexRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralRegex_in_entryRuleLiteralRegex11581);
            iv_ruleLiteralRegex=ruleLiteralRegex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralRegex; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralRegex11591); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralRegex"


    // $ANTLR start "ruleLiteralRegex"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5327:1: ruleLiteralRegex returns [EObject current=null] : ( (lv_value_0_0= RULE_REGULAR_EXPRESSION ) ) ;
    public final EObject ruleLiteralRegex() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5330:28: ( ( (lv_value_0_0= RULE_REGULAR_EXPRESSION ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5331:1: ( (lv_value_0_0= RULE_REGULAR_EXPRESSION ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5331:1: ( (lv_value_0_0= RULE_REGULAR_EXPRESSION ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5332:1: (lv_value_0_0= RULE_REGULAR_EXPRESSION )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5332:1: (lv_value_0_0= RULE_REGULAR_EXPRESSION )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5333:3: lv_value_0_0= RULE_REGULAR_EXPRESSION
            {
            lv_value_0_0=(Token)match(input,RULE_REGULAR_EXPRESSION,FOLLOW_RULE_REGULAR_EXPRESSION_in_ruleLiteralRegex11632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getLiteralRegexAccess().getValueREGULAR_EXPRESSIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralRegexRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"REGULAR_EXPRESSION");
              	    
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
    // $ANTLR end "ruleLiteralRegex"


    // $ANTLR start "entryRuleLiteralName"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5357:1: entryRuleLiteralName returns [EObject current=null] : iv_ruleLiteralName= ruleLiteralName EOF ;
    public final EObject entryRuleLiteralName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralName = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5358:2: (iv_ruleLiteralName= ruleLiteralName EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5359:2: iv_ruleLiteralName= ruleLiteralName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNameRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralName_in_entryRuleLiteralName11671);
            iv_ruleLiteralName=ruleLiteralName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralName11681); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralName"


    // $ANTLR start "ruleLiteralName"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5366:1: ruleLiteralName returns [EObject current=null] : ( (lv_value_0_0= rulename ) ) ;
    public final EObject ruleLiteralName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5369:28: ( ( (lv_value_0_0= rulename ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5370:1: ( (lv_value_0_0= rulename ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5370:1: ( (lv_value_0_0= rulename ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5371:1: (lv_value_0_0= rulename )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5371:1: (lv_value_0_0= rulename )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5372:3: lv_value_0_0= rulename
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralNameAccess().getValueNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_rulename_in_ruleLiteralName11726);
            lv_value_0_0=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLiteralNameRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"name");
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
    // $ANTLR end "ruleLiteralName"


    // $ANTLR start "entryRuleVariableExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5396:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5397:2: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5398:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression11760);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpression11770); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableExpression"


    // $ANTLR start "ruleVariableExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5405:1: ruleVariableExpression returns [EObject current=null] : ( (lv_varName_0_0= ruledollarVariable ) ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_varName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5408:28: ( ( (lv_varName_0_0= ruledollarVariable ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5409:1: ( (lv_varName_0_0= ruledollarVariable ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5409:1: ( (lv_varName_0_0= ruledollarVariable ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5410:1: (lv_varName_0_0= ruledollarVariable )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5410:1: (lv_varName_0_0= ruledollarVariable )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5411:3: lv_varName_0_0= ruledollarVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getVarNameDollarVariableParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruledollarVariable_in_ruleVariableExpression11815);
            lv_varName_0_0=ruledollarVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"varName",
                      		lv_varName_0_0, 
                      		"dollarVariable");
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
    // $ANTLR end "ruleVariableExpression"


    // $ANTLR start "entryRuledollarVariable"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5435:1: entryRuledollarVariable returns [String current=null] : iv_ruledollarVariable= ruledollarVariable EOF ;
    public final String entryRuledollarVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledollarVariable = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5439:1: (iv_ruledollarVariable= ruledollarVariable EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5440:2: iv_ruledollarVariable= ruledollarVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDollarVariableRule()); 
            }
            pushFollow(FOLLOW_ruledollarVariable_in_entryRuledollarVariable11856);
            iv_ruledollarVariable=ruledollarVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledollarVariable.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledollarVariable11867); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuledollarVariable"


    // $ANTLR start "ruledollarVariable"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5450:1: ruledollarVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOLLAR_VAR_0= RULE_DOLLAR_VAR ;
    public final AntlrDatatypeRuleToken ruledollarVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOLLAR_VAR_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5455:6: (this_DOLLAR_VAR_0= RULE_DOLLAR_VAR )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5456:5: this_DOLLAR_VAR_0= RULE_DOLLAR_VAR
            {
            this_DOLLAR_VAR_0=(Token)match(input,RULE_DOLLAR_VAR,FOLLOW_RULE_DOLLAR_VAR_in_ruledollarVariable11910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DOLLAR_VAR_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOLLAR_VAR_0, grammarAccess.getDollarVariableAccess().getDOLLAR_VARTerminalRuleCall()); 
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruledollarVariable"


    // $ANTLR start "entryRulename"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5476:1: entryRulename returns [String current=null] : iv_rulename= rulename EOF ;
    public final String entryRulename() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulename = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5477:1: (iv_rulename= rulename EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5478:2: iv_rulename= rulename EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_rulename_in_entryRulename11960);
            iv_rulename=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulename.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulename11971); if (state.failed) return current;

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
    // $ANTLR end "entryRulename"


    // $ANTLR start "rulename"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5485:1: rulename returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_WORD_CHARS_0= RULE_WORD_CHARS ;
    public final AntlrDatatypeRuleToken rulename() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_CHARS_0=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5489:6: (this_WORD_CHARS_0= RULE_WORD_CHARS )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5490:5: this_WORD_CHARS_0= RULE_WORD_CHARS
            {
            this_WORD_CHARS_0=(Token)match(input,RULE_WORD_CHARS,FOLLOW_RULE_WORD_CHARS_in_rulename12010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_WORD_CHARS_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_WORD_CHARS_0, grammarAccess.getNameAccess().getWORD_CHARSTerminalRuleCall()); 
                  
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
    // $ANTLR end "rulename"


    // $ANTLR start "entryRuleclassname"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5505:1: entryRuleclassname returns [String current=null] : iv_ruleclassname= ruleclassname EOF ;
    public final String entryRuleclassname() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleclassname = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5506:1: (iv_ruleclassname= ruleclassname EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5507:2: iv_ruleclassname= ruleclassname EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassnameRule()); 
            }
            pushFollow(FOLLOW_ruleclassname_in_entryRuleclassname12054);
            iv_ruleclassname=ruleclassname();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleclassname.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleclassname12065); if (state.failed) return current;

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
    // $ANTLR end "entryRuleclassname"


    // $ANTLR start "ruleclassname"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5514:1: ruleclassname returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_name_0= rulename | kw= KEYWORD_55 ) ;
    public final AntlrDatatypeRuleToken ruleclassname() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_name_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5518:6: ( (this_name_0= rulename | kw= KEYWORD_55 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5519:1: (this_name_0= rulename | kw= KEYWORD_55 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5519:1: (this_name_0= rulename | kw= KEYWORD_55 )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_WORD_CHARS) ) {
                alt101=1;
            }
            else if ( (LA101_0==KEYWORD_55) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5520:5: this_name_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassnameAccess().getNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulename_in_ruleclassname12112);
                    this_name_0=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_name_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5532:2: kw= KEYWORD_55
                    {
                    kw=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleclassname12136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getClassnameAccess().getClassKeyword_1()); 
                          
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
    // $ANTLR end "ruleclassname"


    // $ANTLR start "entryRuleunionNameOrReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5545:1: entryRuleunionNameOrReference returns [String current=null] : iv_ruleunionNameOrReference= ruleunionNameOrReference EOF ;
    public final String entryRuleunionNameOrReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunionNameOrReference = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5546:1: (iv_ruleunionNameOrReference= ruleunionNameOrReference EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5547:2: iv_ruleunionNameOrReference= ruleunionNameOrReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnionNameOrReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleunionNameOrReference_in_entryRuleunionNameOrReference12176);
            iv_ruleunionNameOrReference=ruleunionNameOrReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunionNameOrReference.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunionNameOrReference12187); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunionNameOrReference"


    // $ANTLR start "ruleunionNameOrReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5554:1: ruleunionNameOrReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_CHARS_0= RULE_WORD_CHARS | kw= KEYWORD_55 | kw= KEYWORD_61 ) ;
    public final AntlrDatatypeRuleToken ruleunionNameOrReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_CHARS_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5558:6: ( (this_WORD_CHARS_0= RULE_WORD_CHARS | kw= KEYWORD_55 | kw= KEYWORD_61 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5559:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | kw= KEYWORD_55 | kw= KEYWORD_61 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5559:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | kw= KEYWORD_55 | kw= KEYWORD_61 )
            int alt102=3;
            switch ( input.LA(1) ) {
            case RULE_WORD_CHARS:
                {
                alt102=1;
                }
                break;
            case KEYWORD_55:
                {
                alt102=2;
                }
                break;
            case KEYWORD_61:
                {
                alt102=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5559:6: this_WORD_CHARS_0= RULE_WORD_CHARS
                    {
                    this_WORD_CHARS_0=(Token)match(input,RULE_WORD_CHARS,FOLLOW_RULE_WORD_CHARS_in_ruleunionNameOrReference12227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WORD_CHARS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WORD_CHARS_0, grammarAccess.getUnionNameOrReferenceAccess().getWORD_CHARSTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5568:2: kw= KEYWORD_55
                    {
                    kw=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleunionNameOrReference12251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnionNameOrReferenceAccess().getClassKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5575:2: kw= KEYWORD_61
                    {
                    kw=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleunionNameOrReference12270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnionNameOrReferenceAccess().getDefaultKeyword_2()); 
                          
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
    // $ANTLR end "ruleunionNameOrReference"


    // $ANTLR start "entryRuledoubleStringCharacters"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5588:1: entryRuledoubleStringCharacters returns [String current=null] : iv_ruledoubleStringCharacters= ruledoubleStringCharacters EOF ;
    public final String entryRuledoubleStringCharacters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledoubleStringCharacters = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5592:1: (iv_ruledoubleStringCharacters= ruledoubleStringCharacters EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5593:2: iv_ruledoubleStringCharacters= ruledoubleStringCharacters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleStringCharactersRule()); 
            }
            pushFollow(FOLLOW_ruledoubleStringCharacters_in_entryRuledoubleStringCharacters12316);
            iv_ruledoubleStringCharacters=ruledoubleStringCharacters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledoubleStringCharacters.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledoubleStringCharacters12327); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuledoubleStringCharacters"


    // $ANTLR start "ruledoubleStringCharacters"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5603:1: ruledoubleStringCharacters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+ ;
    public final AntlrDatatypeRuleToken ruledoubleStringCharacters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_CHARS_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_WS_2=null;
        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5608:6: ( (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+ )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5609:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5609:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+
            int cnt103=0;
            loop103:
            do {
                int alt103=9;
                alt103 = dfa103.predict(input);
                switch (alt103) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5609:6: this_WORD_CHARS_0= RULE_WORD_CHARS
            	    {
            	    this_WORD_CHARS_0=(Token)match(input,RULE_WORD_CHARS,FOLLOW_RULE_WORD_CHARS_in_ruledoubleStringCharacters12371); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WORD_CHARS_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WORD_CHARS_0, grammarAccess.getDoubleStringCharactersAccess().getWORD_CHARSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5617:10: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruledoubleStringCharacters12397); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ANY_OTHER_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ANY_OTHER_1, grammarAccess.getDoubleStringCharactersAccess().getANY_OTHERTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5625:10: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruledoubleStringCharacters12423); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getDoubleStringCharactersAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5634:2: kw= KEYWORD_38
            	    {
            	    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruledoubleStringCharacters12447); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDoubleStringCharactersAccess().getReverseSolidusQuotationMarkKeyword_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5641:2: kw= KEYWORD_40
            	    {
            	    kw=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruledoubleStringCharacters12466); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDoubleStringCharactersAccess().getReverseSolidusApostropheKeyword_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5648:2: kw= KEYWORD_39
            	    {
            	    kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruledoubleStringCharacters12485); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDoubleStringCharactersAccess().getReverseSolidusDollarSignKeyword_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5655:2: kw= KEYWORD_48
            	    {
            	    kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruledoubleStringCharacters12504); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDoubleStringCharactersAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5662:2: kw= KEYWORD_41
            	    {
            	    kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruledoubleStringCharacters12523); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDoubleStringCharactersAccess().getReverseSolidusReverseSolidusKeyword_7()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt103 >= 1 ) break loop103;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(103, input);
                        throw eee;
                }
                cnt103++;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruledoubleStringCharacters"


    // $ANTLR start "entryRulesingleStringCharacters"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5678:1: entryRulesingleStringCharacters returns [String current=null] : iv_rulesingleStringCharacters= rulesingleStringCharacters EOF ;
    public final String entryRulesingleStringCharacters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesingleStringCharacters = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5682:1: (iv_rulesingleStringCharacters= rulesingleStringCharacters EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5683:2: iv_rulesingleStringCharacters= rulesingleStringCharacters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleStringCharactersRule()); 
            }
            pushFollow(FOLLOW_rulesingleStringCharacters_in_entryRulesingleStringCharacters12574);
            iv_rulesingleStringCharacters=rulesingleStringCharacters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesingleStringCharacters.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesingleStringCharacters12585); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulesingleStringCharacters"


    // $ANTLR start "rulesingleStringCharacters"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5693:1: rulesingleStringCharacters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | this_DOLLAR_VAR_3= RULE_DOLLAR_VAR | kw= KEYWORD_24 | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+ ;
    public final AntlrDatatypeRuleToken rulesingleStringCharacters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_CHARS_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_WS_2=null;
        Token this_DOLLAR_VAR_3=null;
        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5698:6: ( (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | this_DOLLAR_VAR_3= RULE_DOLLAR_VAR | kw= KEYWORD_24 | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+ )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5699:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | this_DOLLAR_VAR_3= RULE_DOLLAR_VAR | kw= KEYWORD_24 | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5699:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | this_DOLLAR_VAR_3= RULE_DOLLAR_VAR | kw= KEYWORD_24 | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+
            int cnt104=0;
            loop104:
            do {
                int alt104=11;
                switch ( input.LA(1) ) {
                case RULE_WORD_CHARS:
                    {
                    alt104=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt104=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt104=3;
                    }
                    break;
                case RULE_DOLLAR_VAR:
                    {
                    alt104=4;
                    }
                    break;
                case KEYWORD_24:
                    {
                    alt104=5;
                    }
                    break;
                case KEYWORD_38:
                    {
                    alt104=6;
                    }
                    break;
                case KEYWORD_40:
                    {
                    alt104=7;
                    }
                    break;
                case KEYWORD_39:
                    {
                    alt104=8;
                    }
                    break;
                case KEYWORD_48:
                    {
                    alt104=9;
                    }
                    break;
                case KEYWORD_41:
                    {
                    alt104=10;
                    }
                    break;

                }

                switch (alt104) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5699:6: this_WORD_CHARS_0= RULE_WORD_CHARS
            	    {
            	    this_WORD_CHARS_0=(Token)match(input,RULE_WORD_CHARS,FOLLOW_RULE_WORD_CHARS_in_rulesingleStringCharacters12629); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WORD_CHARS_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WORD_CHARS_0, grammarAccess.getSingleStringCharactersAccess().getWORD_CHARSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5707:10: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rulesingleStringCharacters12655); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ANY_OTHER_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ANY_OTHER_1, grammarAccess.getSingleStringCharactersAccess().getANY_OTHERTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5715:10: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulesingleStringCharacters12681); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getSingleStringCharactersAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5723:10: this_DOLLAR_VAR_3= RULE_DOLLAR_VAR
            	    {
            	    this_DOLLAR_VAR_3=(Token)match(input,RULE_DOLLAR_VAR,FOLLOW_RULE_DOLLAR_VAR_in_rulesingleStringCharacters12707); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_DOLLAR_VAR_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_DOLLAR_VAR_3, grammarAccess.getSingleStringCharactersAccess().getDOLLAR_VARTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5732:2: kw= KEYWORD_24
            	    {
            	    kw=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rulesingleStringCharacters12731); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSingleStringCharactersAccess().getDollarSignLeftCurlyBracketKeyword_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5739:2: kw= KEYWORD_38
            	    {
            	    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_rulesingleStringCharacters12750); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSingleStringCharactersAccess().getReverseSolidusQuotationMarkKeyword_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5746:2: kw= KEYWORD_40
            	    {
            	    kw=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rulesingleStringCharacters12769); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSingleStringCharactersAccess().getReverseSolidusApostropheKeyword_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5753:2: kw= KEYWORD_39
            	    {
            	    kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_rulesingleStringCharacters12788); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSingleStringCharactersAccess().getReverseSolidusDollarSignKeyword_7()); 
            	          
            	    }

            	    }
            	    break;
            	case 9 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5760:2: kw= KEYWORD_48
            	    {
            	    kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rulesingleStringCharacters12807); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSingleStringCharactersAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_8()); 
            	          
            	    }

            	    }
            	    break;
            	case 10 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5767:2: kw= KEYWORD_41
            	    {
            	    kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_rulesingleStringCharacters12826); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSingleStringCharactersAccess().getReverseSolidusReverseSolidusKeyword_9()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt104 >= 1 ) break loop104;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(104, input);
                        throw eee;
                }
                cnt104++;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesingleStringCharacters"

    // $ANTLR start synpred7_InternalPPParser
    public final void synpred7_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:310:2: ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:310:2: () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:310:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:311:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:319:2: ( (lv_opName_2_0= ruleEdgeOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:320:1: (lv_opName_2_0= ruleEdgeOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:320:1: (lv_opName_2_0= ruleEdgeOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:321:3: lv_opName_2_0= ruleEdgeOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRelationshipExpressionAccess().getOpNameEdgeOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEdgeOperator_in_synpred7_InternalPPParser686);
        lv_opName_2_0=ruleEdgeOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:337:2: ( (lv_rightExpr_3_0= ruleResourceExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:338:1: (lv_rightExpr_3_0= ruleResourceExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:338:1: (lv_rightExpr_3_0= ruleResourceExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:339:3: lv_rightExpr_3_0= ruleResourceExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRelationshipExpressionAccess().getRightExprResourceExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleResourceExpression_in_synpred7_InternalPPParser707);
        lv_rightExpr_3_0=ruleResourceExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalPPParser

    // $ANTLR start synpred11_InternalPPParser
    public final void synpred11_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_resourceData_3_0 = null;

        EObject lv_resourceData_5_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:388:2: ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:388:2: () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:388:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:389:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_synpred11_InternalPPParser830); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:402:1: ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )?
        int alt110=2;
        int LA110_0 = input.LA(1);

        if ( ((LA110_0>=KEYWORD_61 && LA110_0<=KEYWORD_55)||(LA110_0>=KEYWORD_57 && LA110_0<=KEYWORD_51)||(LA110_0>=KEYWORD_53 && LA110_0<=KEYWORD_54)||LA110_0==KEYWORD_24||LA110_0==KEYWORD_42||(LA110_0>=KEYWORD_1 && LA110_0<=KEYWORD_4)||LA110_0==KEYWORD_9||(LA110_0>=KEYWORD_17 && LA110_0<=KEYWORD_18)||LA110_0==KEYWORD_20||(LA110_0>=RULE_DOLLAR_VAR && LA110_0<=RULE_WORD_CHARS)||LA110_0==RULE_REGULAR_EXPRESSION) ) {
            alt110=1;
        }
        switch (alt110) {
            case 1 :
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:402:2: ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )?
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:402:2: ( (lv_resourceData_3_0= ruleResourceBody ) )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:403:1: (lv_resourceData_3_0= ruleResourceBody )
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:403:1: (lv_resourceData_3_0= ruleResourceBody )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:404:3: lv_resourceData_3_0= ruleResourceBody
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceDataResourceBodyParserRuleCall_0_1_2_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleResourceBody_in_synpred11_InternalPPParser851);
                lv_resourceData_3_0=ruleResourceBody();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:420:2: (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )*
                loop108:
                do {
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==KEYWORD_12) ) {
                        int LA108_1 = input.LA(2);

                        if ( ((LA108_1>=KEYWORD_61 && LA108_1<=KEYWORD_55)||(LA108_1>=KEYWORD_57 && LA108_1<=KEYWORD_51)||(LA108_1>=KEYWORD_53 && LA108_1<=KEYWORD_54)||LA108_1==KEYWORD_24||LA108_1==KEYWORD_42||(LA108_1>=KEYWORD_1 && LA108_1<=KEYWORD_4)||LA108_1==KEYWORD_9||(LA108_1>=KEYWORD_17 && LA108_1<=KEYWORD_18)||LA108_1==KEYWORD_20||(LA108_1>=RULE_DOLLAR_VAR && LA108_1<=RULE_WORD_CHARS)||LA108_1==RULE_REGULAR_EXPRESSION) ) {
                            alt108=1;
                        }


                    }


                    switch (alt108) {
                	case 1 :
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:421:2: otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) )
                	    {
                	    otherlv_4=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_synpred11_InternalPPParser865); if (state.failed) return ;
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:425:1: ( (lv_resourceData_5_0= ruleResourceBody ) )
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:426:1: (lv_resourceData_5_0= ruleResourceBody )
                	    {
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:426:1: (lv_resourceData_5_0= ruleResourceBody )
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:427:3: lv_resourceData_5_0= ruleResourceBody
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceDataResourceBodyParserRuleCall_0_1_2_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleResourceBody_in_synpred11_InternalPPParser885);
                	    lv_resourceData_5_0=ruleResourceBody();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop108;
                    }
                } while (true);

                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:443:4: (otherlv_6= KEYWORD_12 )?
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==KEYWORD_12) ) {
                    alt109=1;
                }
                switch (alt109) {
                    case 1 :
                        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:444:2: otherlv_6= KEYWORD_12
                        {
                        otherlv_6=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_synpred11_InternalPPParser901); if (state.failed) return ;

                        }
                        break;

                }


                }
                break;

        }

        otherlv_7=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_synpred11_InternalPPParser917); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalPPParser

    // $ANTLR start synpred23_InternalPPParser
    public final void synpred23_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:835:2: ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:835:2: () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:835:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:836:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_synpred23_InternalPPParser1694); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:849:1: ( (lv_rightExpr_3_0= ruleAppendExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:850:1: (lv_rightExpr_3_0= ruleAppendExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:850:1: (lv_rightExpr_3_0= ruleAppendExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:851:3: lv_rightExpr_3_0= ruleAppendExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRightExprAppendExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAppendExpression_in_synpred23_InternalPPParser1714);
        lv_rightExpr_3_0=ruleAppendExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23_InternalPPParser

    // $ANTLR start synpred24_InternalPPParser
    public final void synpred24_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:900:2: ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:900:2: () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:900:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:901:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_synpred24_InternalPPParser1836); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:914:1: ( (lv_rightExpr_3_0= ruleOrExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:915:1: (lv_rightExpr_3_0= ruleOrExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:915:1: (lv_rightExpr_3_0= ruleOrExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:916:3: lv_rightExpr_3_0= ruleOrExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAppendExpressionAccess().getRightExprOrExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOrExpression_in_synpred24_InternalPPParser1856);
        lv_rightExpr_3_0=ruleOrExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred24_InternalPPParser

    // $ANTLR start synpred25_InternalPPParser
    public final void synpred25_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:965:2: ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:965:2: () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:965:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:966:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_synpred25_InternalPPParser1978); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:979:1: ( (lv_rightExpr_3_0= ruleAndExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:980:1: (lv_rightExpr_3_0= ruleAndExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:980:1: (lv_rightExpr_3_0= ruleAndExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:981:3: lv_rightExpr_3_0= ruleAndExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExprAndExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAndExpression_in_synpred25_InternalPPParser1998);
        lv_rightExpr_3_0=ruleAndExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25_InternalPPParser

    // $ANTLR start synpred26_InternalPPParser
    public final void synpred26_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1030:2: ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1030:2: () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1030:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1031:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_synpred26_InternalPPParser2120); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1044:1: ( (lv_rightExpr_3_0= ruleRelationalExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1045:1: (lv_rightExpr_3_0= ruleRelationalExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1045:1: (lv_rightExpr_3_0= ruleRelationalExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1046:3: lv_rightExpr_3_0= ruleRelationalExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExprRelationalExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleRelationalExpression_in_synpred26_InternalPPParser2140);
        lv_rightExpr_3_0=ruleRelationalExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26_InternalPPParser

    // $ANTLR start synpred30_InternalPPParser
    public final void synpred30_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1144:2: ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1144:2: () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1144:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1145:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1153:2: ( (lv_opName_2_0= ruleRelationalOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1154:1: (lv_opName_2_0= ruleRelationalOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1154:1: (lv_opName_2_0= ruleRelationalOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1155:3: lv_opName_2_0= ruleRelationalOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOpNameRelationalOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleRelationalOperator_in_synpred30_InternalPPParser2416);
        lv_opName_2_0=ruleRelationalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1171:2: ( (lv_rightExpr_3_0= ruleEqualityExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1172:1: (lv_rightExpr_3_0= ruleEqualityExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1172:1: (lv_rightExpr_3_0= ruleEqualityExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1173:3: lv_rightExpr_3_0= ruleEqualityExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightExprEqualityExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEqualityExpression_in_synpred30_InternalPPParser2437);
        lv_rightExpr_3_0=ruleEqualityExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred30_InternalPPParser

    // $ANTLR start synpred32_InternalPPParser
    public final void synpred32_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1257:2: ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1257:2: () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1257:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1258:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1266:2: ( (lv_opName_2_0= ruleEqualityOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1267:1: (lv_opName_2_0= ruleEqualityOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1267:1: (lv_opName_2_0= ruleEqualityOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1268:3: lv_opName_2_0= ruleEqualityOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOpNameEqualityOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEqualityOperator_in_synpred32_InternalPPParser2675);
        lv_opName_2_0=ruleEqualityOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1284:2: ( (lv_rightExpr_3_0= ruleShiftExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1285:1: (lv_rightExpr_3_0= ruleShiftExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1285:1: (lv_rightExpr_3_0= ruleShiftExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1286:3: lv_rightExpr_3_0= ruleShiftExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightExprShiftExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleShiftExpression_in_synpred32_InternalPPParser2696);
        lv_rightExpr_3_0=ruleShiftExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred32_InternalPPParser

    // $ANTLR start synpred34_InternalPPParser
    public final void synpred34_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1370:2: ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1370:2: () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1370:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1371:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1379:2: ( (lv_opName_2_0= ruleShiftOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1380:1: (lv_opName_2_0= ruleShiftOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1380:1: (lv_opName_2_0= ruleShiftOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1381:3: lv_opName_2_0= ruleShiftOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOpNameShiftOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleShiftOperator_in_synpred34_InternalPPParser2934);
        lv_opName_2_0=ruleShiftOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1397:2: ( (lv_rightExpr_3_0= ruleAdditiveExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1398:1: (lv_rightExpr_3_0= ruleAdditiveExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1398:1: (lv_rightExpr_3_0= ruleAdditiveExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1399:3: lv_rightExpr_3_0= ruleAdditiveExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAdditiveExpression_in_synpred34_InternalPPParser2955);
        lv_rightExpr_3_0=ruleAdditiveExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred34_InternalPPParser

    // $ANTLR start synpred36_InternalPPParser
    public final void synpred36_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1483:2: ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1483:2: () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1483:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1484:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1492:2: ( (lv_opName_2_0= ruleAdditiveOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1493:1: (lv_opName_2_0= ruleAdditiveOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1493:1: (lv_opName_2_0= ruleAdditiveOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1494:3: lv_opName_2_0= ruleAdditiveOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpNameAdditiveOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAdditiveOperator_in_synpred36_InternalPPParser3193);
        lv_opName_2_0=ruleAdditiveOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1510:2: ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1511:1: (lv_rightExpr_3_0= ruleMultiplicativeExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1511:1: (lv_rightExpr_3_0= ruleMultiplicativeExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1512:3: lv_rightExpr_3_0= ruleMultiplicativeExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExprMultiplicativeExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleMultiplicativeExpression_in_synpred36_InternalPPParser3214);
        lv_rightExpr_3_0=ruleMultiplicativeExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalPPParser

    // $ANTLR start synpred38_InternalPPParser
    public final void synpred38_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1596:2: ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1596:2: () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1596:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1597:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1605:2: ( (lv_opName_2_0= ruleMultiplicativeOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1606:1: (lv_opName_2_0= ruleMultiplicativeOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1606:1: (lv_opName_2_0= ruleMultiplicativeOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1607:3: lv_opName_2_0= ruleMultiplicativeOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpNameMultiplicativeOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleMultiplicativeOperator_in_synpred38_InternalPPParser3452);
        lv_opName_2_0=ruleMultiplicativeOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1623:2: ( (lv_rightExpr_3_0= ruleMatchingExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1624:1: (lv_rightExpr_3_0= ruleMatchingExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1624:1: (lv_rightExpr_3_0= ruleMatchingExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1625:3: lv_rightExpr_3_0= ruleMatchingExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightExprMatchingExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleMatchingExpression_in_synpred38_InternalPPParser3473);
        lv_rightExpr_3_0=ruleMatchingExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred38_InternalPPParser

    // $ANTLR start synpred40_InternalPPParser
    public final void synpred40_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1709:2: ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1709:2: () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1709:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1710:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1718:2: ( (lv_opName_2_0= ruleMatchingOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1719:1: (lv_opName_2_0= ruleMatchingOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1719:1: (lv_opName_2_0= ruleMatchingOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1720:3: lv_opName_2_0= ruleMatchingOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMatchingExpressionAccess().getOpNameMatchingOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleMatchingOperator_in_synpred40_InternalPPParser3711);
        lv_opName_2_0=ruleMatchingOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1736:2: ( (lv_rightExpr_3_0= ruleLiteralRegex ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1737:1: (lv_rightExpr_3_0= ruleLiteralRegex )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1737:1: (lv_rightExpr_3_0= ruleLiteralRegex )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1738:3: lv_rightExpr_3_0= ruleLiteralRegex
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMatchingExpressionAccess().getRightExprLiteralRegexParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleLiteralRegex_in_synpred40_InternalPPParser3732);
        lv_rightExpr_3_0=ruleLiteralRegex();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred40_InternalPPParser

    // $ANTLR start synpred41_InternalPPParser
    public final void synpred41_InternalPPParser_fragment() throws RecognitionException {   
        Token lv_opName_2_0=null;
        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1787:2: ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1787:2: () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1787:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1788:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1796:2: ( (lv_opName_2_0= KEYWORD_43 ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1797:1: (lv_opName_2_0= KEYWORD_43 )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1797:1: (lv_opName_2_0= KEYWORD_43 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1798:3: lv_opName_2_0= KEYWORD_43
        {
        lv_opName_2_0=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_synpred41_InternalPPParser3860); if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1812:2: ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1813:1: (lv_rightExpr_3_0= ruleUnaryOrHigherExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1813:1: (lv_rightExpr_3_0= ruleUnaryOrHigherExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1814:3: lv_rightExpr_3_0= ruleUnaryOrHigherExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getInExpressionAccess().getRightExprUnaryOrHigherExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleUnaryOrHigherExpression_in_synpred41_InternalPPParser3892);
        lv_rightExpr_3_0=ruleUnaryOrHigherExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred41_InternalPPParser

    // $ANTLR start synpred45_InternalPPParser
    public final void synpred45_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2038:2: (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2038:2: otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21
        {
        otherlv_3=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_synpred45_InternalPPParser4396); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2042:1: ( (lv_attributes_4_0= ruleAttributeOperations ) )?
        int alt119=2;
        int LA119_0 = input.LA(1);

        if ( (LA119_0==RULE_WORD_CHARS) ) {
            alt119=1;
        }
        switch (alt119) {
            case 1 :
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2043:1: (lv_attributes_4_0= ruleAttributeOperations )
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2043:1: (lv_attributes_4_0= ruleAttributeOperations )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2044:3: lv_attributes_4_0= ruleAttributeOperations
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getCollectExpressionAccess().getAttributesAttributeOperationsParserRuleCall_1_2_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleAttributeOperations_in_synpred45_InternalPPParser4416);
                lv_attributes_4_0=ruleAttributeOperations();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_5=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_synpred45_InternalPPParser4430); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalPPParser

    // $ANTLR start synpred46_InternalPPParser
    public final void synpred46_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_query_2_0 = null;

        EObject lv_attributes_4_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2010:2: ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2010:2: () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )?
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2010:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2011:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2019:2: ( (lv_query_2_0= ruleCollectQuery ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2020:1: (lv_query_2_0= ruleCollectQuery )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2020:1: (lv_query_2_0= ruleCollectQuery )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2021:3: lv_query_2_0= ruleCollectQuery
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCollectExpressionAccess().getQueryCollectQueryParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleCollectQuery_in_synpred46_InternalPPParser4382);
        lv_query_2_0=ruleCollectQuery();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2037:2: (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )?
        int alt121=2;
        int LA121_0 = input.LA(1);

        if ( (LA121_0==KEYWORD_20) ) {
            alt121=1;
        }
        switch (alt121) {
            case 1 :
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2038:2: otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21
                {
                otherlv_3=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_synpred46_InternalPPParser4396); if (state.failed) return ;
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2042:1: ( (lv_attributes_4_0= ruleAttributeOperations ) )?
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==RULE_WORD_CHARS) ) {
                    alt120=1;
                }
                switch (alt120) {
                    case 1 :
                        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2043:1: (lv_attributes_4_0= ruleAttributeOperations )
                        {
                        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2043:1: (lv_attributes_4_0= ruleAttributeOperations )
                        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2044:3: lv_attributes_4_0= ruleAttributeOperations
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getCollectExpressionAccess().getAttributesAttributeOperationsParserRuleCall_1_2_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleAttributeOperations_in_synpred46_InternalPPParser4416);
                        lv_attributes_4_0=ruleAttributeOperations();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;

                }

                otherlv_5=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_synpred46_InternalPPParser4430); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred46_InternalPPParser

    // $ANTLR start synpred53_InternalPPParser
    public final void synpred53_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_7_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2274:2: ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2274:2: (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2274:2: (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2275:2: otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21
        {
        otherlv_3=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_synpred53_InternalPPParser4947); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2279:1: ( (lv_parameters_4_0= ruleSelectorEntry ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2280:1: (lv_parameters_4_0= ruleSelectorEntry )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2280:1: (lv_parameters_4_0= ruleSelectorEntry )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2281:3: lv_parameters_4_0= ruleSelectorEntry
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSelectorExpressionAccess().getParametersSelectorEntryParserRuleCall_1_2_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleSelectorEntry_in_synpred53_InternalPPParser4967);
        lv_parameters_4_0=ruleSelectorEntry();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2297:2: ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )*
        loop122:
        do {
            int alt122=3;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==KEYWORD_8) ) {
                int LA122_1 = input.LA(2);

                if ( ((LA122_1>=KEYWORD_61 && LA122_1<=KEYWORD_55)||(LA122_1>=KEYWORD_57 && LA122_1<=KEYWORD_51)||(LA122_1>=KEYWORD_53 && LA122_1<=KEYWORD_54)||LA122_1==KEYWORD_24||LA122_1==KEYWORD_42||(LA122_1>=KEYWORD_1 && LA122_1<=KEYWORD_4)||LA122_1==KEYWORD_9||(LA122_1>=KEYWORD_17 && LA122_1<=KEYWORD_18)||LA122_1==KEYWORD_20||(LA122_1>=RULE_DOLLAR_VAR && LA122_1<=RULE_WORD_CHARS)||LA122_1==RULE_REGULAR_EXPRESSION) ) {
                    alt122=1;
                }


            }
            else if ( ((LA122_0>=KEYWORD_61 && LA122_0<=KEYWORD_55)||(LA122_0>=KEYWORD_57 && LA122_0<=KEYWORD_51)||(LA122_0>=KEYWORD_53 && LA122_0<=KEYWORD_54)||LA122_0==KEYWORD_24||LA122_0==KEYWORD_42||(LA122_0>=KEYWORD_1 && LA122_0<=KEYWORD_4)||LA122_0==KEYWORD_9||(LA122_0>=KEYWORD_17 && LA122_0<=KEYWORD_18)||LA122_0==KEYWORD_20||(LA122_0>=RULE_DOLLAR_VAR && LA122_0<=RULE_WORD_CHARS)||LA122_0==RULE_REGULAR_EXPRESSION) ) {
                alt122=2;
            }


            switch (alt122) {
        	case 1 :
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2297:3: (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )
        	    {
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2297:3: (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2298:2: otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) )
        	    {
        	    otherlv_5=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred53_InternalPPParser4982); if (state.failed) return ;
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2302:1: ( (lv_parameters_6_0= ruleSelectorEntry ) )
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2303:1: (lv_parameters_6_0= ruleSelectorEntry )
        	    {
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2303:1: (lv_parameters_6_0= ruleSelectorEntry )
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2304:3: lv_parameters_6_0= ruleSelectorEntry
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSelectorExpressionAccess().getParametersSelectorEntryParserRuleCall_1_2_0_2_0_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleSelectorEntry_in_synpred53_InternalPPParser5002);
        	    lv_parameters_6_0=ruleSelectorEntry();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2321:6: ( (lv_parameters_7_0= ruleSelectorEntry ) )
        	    {
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2321:6: ( (lv_parameters_7_0= ruleSelectorEntry ) )
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2322:1: (lv_parameters_7_0= ruleSelectorEntry )
        	    {
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2322:1: (lv_parameters_7_0= ruleSelectorEntry )
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2323:3: lv_parameters_7_0= ruleSelectorEntry
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSelectorExpressionAccess().getParametersSelectorEntryParserRuleCall_1_2_0_2_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleSelectorEntry_in_synpred53_InternalPPParser5030);
        	    lv_parameters_7_0=ruleSelectorEntry();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop122;
            }
        } while (true);

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2339:4: (otherlv_8= KEYWORD_8 )?
        int alt123=2;
        int LA123_0 = input.LA(1);

        if ( (LA123_0==KEYWORD_8) ) {
            alt123=1;
        }
        switch (alt123) {
            case 1 :
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2340:2: otherlv_8= KEYWORD_8
                {
                otherlv_8=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred53_InternalPPParser5046); if (state.failed) return ;

                }
                break;

        }

        otherlv_9=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_synpred53_InternalPPParser5060); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred53_InternalPPParser

    // $ANTLR start synpred55_InternalPPParser
    public final void synpred55_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2401:2: ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2401:2: () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2401:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2402:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_synpred55_InternalPPParser5210); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2415:1: ( (lv_rightExpr_3_0= ruleExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2416:1: (lv_rightExpr_3_0= ruleExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2416:1: (lv_rightExpr_3_0= ruleExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2417:3: lv_rightExpr_3_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSelectorEntryAccess().getRightExprExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred55_InternalPPParser5230);
        lv_rightExpr_3_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred55_InternalPPParser

    // $ANTLR start synpred58_InternalPPParser
    public final void synpred58_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2466:2: ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2466:2: () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2466:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2467:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_synpred58_InternalPPParser5352); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2480:1: ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )?
        int alt129=2;
        int LA129_0 = input.LA(1);

        if ( ((LA129_0>=KEYWORD_61 && LA129_0<=KEYWORD_55)||(LA129_0>=KEYWORD_57 && LA129_0<=KEYWORD_51)||(LA129_0>=KEYWORD_53 && LA129_0<=KEYWORD_54)||LA129_0==KEYWORD_24||LA129_0==KEYWORD_42||(LA129_0>=KEYWORD_1 && LA129_0<=KEYWORD_4)||LA129_0==KEYWORD_9||(LA129_0>=KEYWORD_17 && LA129_0<=KEYWORD_18)||LA129_0==KEYWORD_20||(LA129_0>=RULE_DOLLAR_VAR && LA129_0<=RULE_WORD_CHARS)||LA129_0==RULE_REGULAR_EXPRESSION) ) {
            alt129=1;
        }
        switch (alt129) {
            case 1 :
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2480:2: ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )*
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2480:2: ( (lv_parameters_3_0= ruleExpression ) )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2481:1: (lv_parameters_3_0= ruleExpression )
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2481:1: (lv_parameters_3_0= ruleExpression )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2482:3: lv_parameters_3_0= ruleExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getAtExpressionAccess().getParametersExpressionParserRuleCall_1_2_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred58_InternalPPParser5373);
                lv_parameters_3_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2498:2: (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )*
                loop128:
                do {
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==KEYWORD_8) ) {
                        alt128=1;
                    }


                    switch (alt128) {
                	case 1 :
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2499:2: otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) )
                	    {
                	    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred58_InternalPPParser5387); if (state.failed) return ;
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2503:1: ( (lv_parameters_5_0= ruleExpression ) )
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2504:1: (lv_parameters_5_0= ruleExpression )
                	    {
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2504:1: (lv_parameters_5_0= ruleExpression )
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2505:3: lv_parameters_5_0= ruleExpression
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getAtExpressionAccess().getParametersExpressionParserRuleCall_1_2_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleExpression_in_synpred58_InternalPPParser5407);
                	    lv_parameters_5_0=ruleExpression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop128;
                    }
                } while (true);


                }
                break;

        }

        otherlv_6=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_synpred58_InternalPPParser5424); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalPPParser

    // $ANTLR start synpred62_InternalPPParser
    public final void synpred62_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2559:2: ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )? )? otherlv_7= KEYWORD_5 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2559:2: () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )? )? otherlv_7= KEYWORD_5
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2559:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2560:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_synpred62_InternalPPParser5545); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2573:1: ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )? )?
        int alt134=2;
        int LA134_0 = input.LA(1);

        if ( ((LA134_0>=KEYWORD_61 && LA134_0<=KEYWORD_55)||(LA134_0>=KEYWORD_57 && LA134_0<=KEYWORD_51)||(LA134_0>=KEYWORD_53 && LA134_0<=KEYWORD_54)||LA134_0==KEYWORD_24||LA134_0==KEYWORD_42||(LA134_0>=KEYWORD_1 && LA134_0<=KEYWORD_4)||LA134_0==KEYWORD_9||(LA134_0>=KEYWORD_17 && LA134_0<=KEYWORD_18)||LA134_0==KEYWORD_20||(LA134_0>=RULE_DOLLAR_VAR && LA134_0<=RULE_WORD_CHARS)||LA134_0==RULE_REGULAR_EXPRESSION) ) {
            alt134=1;
        }
        switch (alt134) {
            case 1 :
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2573:2: ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )?
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2573:2: ( (lv_parameters_3_0= ruleExpression ) )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2574:1: (lv_parameters_3_0= ruleExpression )
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2574:1: (lv_parameters_3_0= ruleExpression )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2575:3: lv_parameters_3_0= ruleExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_1_2_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred62_InternalPPParser5566);
                lv_parameters_3_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2591:2: (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )*
                loop132:
                do {
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==KEYWORD_8) ) {
                        int LA132_1 = input.LA(2);

                        if ( ((LA132_1>=KEYWORD_61 && LA132_1<=KEYWORD_55)||(LA132_1>=KEYWORD_57 && LA132_1<=KEYWORD_51)||(LA132_1>=KEYWORD_53 && LA132_1<=KEYWORD_54)||LA132_1==KEYWORD_24||LA132_1==KEYWORD_42||(LA132_1>=KEYWORD_1 && LA132_1<=KEYWORD_4)||LA132_1==KEYWORD_9||(LA132_1>=KEYWORD_17 && LA132_1<=KEYWORD_18)||LA132_1==KEYWORD_20||(LA132_1>=RULE_DOLLAR_VAR && LA132_1<=RULE_WORD_CHARS)||LA132_1==RULE_REGULAR_EXPRESSION) ) {
                            alt132=1;
                        }


                    }


                    switch (alt132) {
                	case 1 :
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2592:2: otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) )
                	    {
                	    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred62_InternalPPParser5580); if (state.failed) return ;
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2596:1: ( (lv_parameters_5_0= ruleExpression ) )
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2597:1: (lv_parameters_5_0= ruleExpression )
                	    {
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2597:1: (lv_parameters_5_0= ruleExpression )
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2598:3: lv_parameters_5_0= ruleExpression
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_1_2_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleExpression_in_synpred62_InternalPPParser5600);
                	    lv_parameters_5_0=ruleExpression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop132;
                    }
                } while (true);

                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2614:4: (otherlv_6= KEYWORD_8 )?
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==KEYWORD_8) ) {
                    alt133=1;
                }
                switch (alt133) {
                    case 1 :
                        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2615:2: otherlv_6= KEYWORD_8
                        {
                        otherlv_6=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred62_InternalPPParser5616); if (state.failed) return ;

                        }
                        break;

                }


                }
                break;

        }

        otherlv_7=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_synpred62_InternalPPParser5632); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalPPParser

    // $ANTLR start synpred114_InternalPPParser
    public final void synpred114_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        EObject lv_values_4_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4287:2: (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4287:2: otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) )
        {
        otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred114_InternalPPParser9247); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4291:1: ( (lv_values_4_0= ruleQuotedString ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4292:1: (lv_values_4_0= ruleQuotedString )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4292:1: (lv_values_4_0= ruleQuotedString )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4293:3: lv_values_4_0= ruleQuotedString
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getImportExpressionAccess().getValuesQuotedStringParserRuleCall_2_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleQuotedString_in_synpred114_InternalPPParser9267);
        lv_values_4_0=ruleQuotedString();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred114_InternalPPParser

    // $ANTLR start synpred115_InternalPPParser
    public final void synpred115_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4268:2: ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4268:2: ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )*
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4268:2: ( (lv_values_2_0= ruleQuotedString ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4269:1: (lv_values_2_0= ruleQuotedString )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4269:1: (lv_values_2_0= ruleQuotedString )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4270:3: lv_values_2_0= ruleQuotedString
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getImportExpressionAccess().getValuesQuotedStringParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleQuotedString_in_synpred115_InternalPPParser9233);
        lv_values_2_0=ruleQuotedString();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4286:2: (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )*
        loop137:
        do {
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==KEYWORD_8) ) {
                alt137=1;
            }


            switch (alt137) {
        	case 1 :
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4287:2: otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) )
        	    {
        	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred115_InternalPPParser9247); if (state.failed) return ;
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4291:1: ( (lv_values_4_0= ruleQuotedString ) )
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4292:1: (lv_values_4_0= ruleQuotedString )
        	    {
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4292:1: (lv_values_4_0= ruleQuotedString )
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4293:3: lv_values_4_0= ruleQuotedString
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getImportExpressionAccess().getValuesQuotedStringParserRuleCall_2_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleQuotedString_in_synpred115_InternalPPParser9267);
        	    lv_values_4_0=ruleQuotedString();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop137;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred115_InternalPPParser

    // $ANTLR start synpred138_InternalPPParser
    public final void synpred138_InternalPPParser_fragment() throws RecognitionException {   
        Token this_WORD_CHARS_0=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5609:6: (this_WORD_CHARS_0= RULE_WORD_CHARS )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5609:6: this_WORD_CHARS_0= RULE_WORD_CHARS
        {
        this_WORD_CHARS_0=(Token)match(input,RULE_WORD_CHARS,FOLLOW_RULE_WORD_CHARS_in_synpred138_InternalPPParser12371); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred138_InternalPPParser

    // $ANTLR start synpred139_InternalPPParser
    public final void synpred139_InternalPPParser_fragment() throws RecognitionException {   
        Token this_ANY_OTHER_1=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5617:10: (this_ANY_OTHER_1= RULE_ANY_OTHER )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5617:10: this_ANY_OTHER_1= RULE_ANY_OTHER
        {
        this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_synpred139_InternalPPParser12397); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred139_InternalPPParser

    // $ANTLR start synpred140_InternalPPParser
    public final void synpred140_InternalPPParser_fragment() throws RecognitionException {   
        Token this_WS_2=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5625:10: (this_WS_2= RULE_WS )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5625:10: this_WS_2= RULE_WS
        {
        this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_synpred140_InternalPPParser12423); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred140_InternalPPParser

    // $ANTLR start synpred141_InternalPPParser
    public final void synpred141_InternalPPParser_fragment() throws RecognitionException {   
        Token kw=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5634:2: (kw= KEYWORD_38 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5634:2: kw= KEYWORD_38
        {
        kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_synpred141_InternalPPParser12447); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred141_InternalPPParser

    // $ANTLR start synpred142_InternalPPParser
    public final void synpred142_InternalPPParser_fragment() throws RecognitionException {   
        Token kw=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5641:2: (kw= KEYWORD_40 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5641:2: kw= KEYWORD_40
        {
        kw=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_synpred142_InternalPPParser12466); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred142_InternalPPParser

    // $ANTLR start synpred143_InternalPPParser
    public final void synpred143_InternalPPParser_fragment() throws RecognitionException {   
        Token kw=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5648:2: (kw= KEYWORD_39 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5648:2: kw= KEYWORD_39
        {
        kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_synpred143_InternalPPParser12485); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred143_InternalPPParser

    // $ANTLR start synpred144_InternalPPParser
    public final void synpred144_InternalPPParser_fragment() throws RecognitionException {   
        Token kw=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5655:2: (kw= KEYWORD_48 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5655:2: kw= KEYWORD_48
        {
        kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_synpred144_InternalPPParser12504); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred144_InternalPPParser

    // $ANTLR start synpred145_InternalPPParser
    public final void synpred145_InternalPPParser_fragment() throws RecognitionException {   
        Token kw=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5662:2: (kw= KEYWORD_41 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5662:2: kw= KEYWORD_41
        {
        kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_synpred145_InternalPPParser12523); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred145_InternalPPParser

    // Delegated rules

    public final boolean synpred24_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred142_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred142_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred141_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred139_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred139_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred145_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred145_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred114_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred144_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred144_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred140_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred140_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred143_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred143_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA39 dfa39 = new DFA39(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA103 dfa103 = new DFA103(this);
    static final String DFA39_eotS =
        "\72\uffff";
    static final String DFA39_eofS =
        "\1\2\71\uffff";
    static final String DFA39_minS =
        "\1\5\1\0\70\uffff";
    static final String DFA39_maxS =
        "\1\111\1\0\70\uffff";
    static final String DFA39_acceptS =
        "\2\uffff\1\2\66\uffff\1\1";
    static final String DFA39_specialS =
        "\1\uffff\1\0\70\uffff}>";
    static final String[] DFA39_transitionS = {
            "\4\2\1\uffff\3\2\1\uffff\3\2\1\uffff\6\2\1\uffff\13\2\4\uffff"+
            "\24\2\1\uffff\3\2\1\1\1\2\3\uffff\2\2\2\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "2037:2: (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalPPParser()) ) {s = 57;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index39_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\30\uffff";
    static final String DFA46_eofS =
        "\30\uffff";
    static final String DFA46_minS =
        "\1\5\1\0\26\uffff";
    static final String DFA46_maxS =
        "\1\111\1\0\26\uffff";
    static final String DFA46_acceptS =
        "\2\uffff\1\2\24\uffff\1\1";
    static final String DFA46_specialS =
        "\1\uffff\1\0\26\uffff}>";
    static final String[] DFA46_transitionS = {
            "\4\2\1\uffff\3\2\1\uffff\2\2\6\uffff\1\2\21\uffff\1\2\4\uffff"+
            "\4\2\4\uffff\1\2\7\uffff\2\2\1\uffff\1\1\4\uffff\2\2\2\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "2274:1: ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) ( (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) ) | ( (lv_parameters_7_0= ruleSelectorEntry ) ) )* (otherlv_8= KEYWORD_8 )? otherlv_9= KEYWORD_21 ) | ( (lv_parameters_10_0= ruleSelectorEntry ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_1 = input.LA(1);

                         
                        int index46_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalPPParser()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index46_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\73\uffff";
    static final String DFA51_eofS =
        "\1\1\72\uffff";
    static final String DFA51_minS =
        "\1\5\60\uffff\1\0\11\uffff";
    static final String DFA51_maxS =
        "\1\111\60\uffff\1\0\11\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\2\70\uffff\1\1";
    static final String DFA51_specialS =
        "\61\uffff\1\0\11\uffff}>";
    static final String[] DFA51_transitionS = {
            "\4\1\1\uffff\3\1\1\uffff\3\1\1\uffff\6\1\1\uffff\13\1\4\uffff"+
            "\26\1\1\61\3\1\3\uffff\2\1\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "()* loopback of 2466:1: ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_49 = input.LA(1);

                         
                        int index51_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalPPParser()) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index51_49);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\73\uffff";
    static final String DFA55_eofS =
        "\1\2\72\uffff";
    static final String DFA55_minS =
        "\1\5\1\0\71\uffff";
    static final String DFA55_maxS =
        "\1\111\1\0\71\uffff";
    static final String DFA55_acceptS =
        "\2\uffff\1\2\67\uffff\1\1";
    static final String DFA55_specialS =
        "\1\uffff\1\0\71\uffff}>";
    static final String[] DFA55_transitionS = {
            "\4\2\1\uffff\3\2\1\uffff\3\2\1\uffff\6\2\1\uffff\13\2\4\uffff"+
            "\10\2\1\1\21\2\3\uffff\2\2\2\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "2559:1: ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* (otherlv_6= KEYWORD_8 )? )? otherlv_7= KEYWORD_5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalPPParser()) ) {s = 58;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\13\uffff";
    static final String DFA56_eofS =
        "\13\uffff";
    static final String DFA56_minS =
        "\1\5\12\uffff";
    static final String DFA56_maxS =
        "\1\111\12\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA56_specialS =
        "\13\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\10\1\4\1\3\1\5\1\uffff\2\10\1\2\1\uffff\1\6\1\10\6\uffff"+
            "\1\10\21\uffff\1\1\5\uffff\2\10\1\12\14\uffff\1\7\1\10\1\uffff"+
            "\1\10\4\uffff\1\11\1\10\2\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "2645:1: (this_IfExpression_0= ruleIfExpression | this_CaseExpression_1= ruleCaseExpression | this_ImportExpression_2= ruleImportExpression | this_Definition_3= ruleDefinition | this_HostClassDefinition_4= ruleHostClassDefinition | this_NodeDefinition_5= ruleNodeDefinition | this_VirtualNameOrReference_6= ruleVirtualNameOrReference | this_LiteralExpression_7= ruleLiteralExpression | this_VariableExpression_8= ruleVariableExpression | this_ParenthisedExpression_9= ruleParenthisedExpression )";
        }
    }
    static final String DFA85_eotS =
        "\73\uffff";
    static final String DFA85_eofS =
        "\1\3\72\uffff";
    static final String DFA85_minS =
        "\1\5\2\0\70\uffff";
    static final String DFA85_maxS =
        "\1\111\2\0\70\uffff";
    static final String DFA85_acceptS =
        "\3\uffff\1\2\66\uffff\1\1";
    static final String DFA85_specialS =
        "\1\uffff\1\0\1\1\70\uffff}>";
    static final String[] DFA85_transitionS = {
            "\4\3\1\uffff\3\3\1\uffff\3\3\1\uffff\6\3\1\uffff\13\3\4\uffff"+
            "\6\3\1\1\1\2\22\3\3\uffff\2\3\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "4268:1: ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_1 = input.LA(1);

                         
                        int index85_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_InternalPPParser()) ) {s = 58;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index85_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA85_2 = input.LA(1);

                         
                        int index85_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_InternalPPParser()) ) {s = 58;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index85_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA84_eotS =
        "\73\uffff";
    static final String DFA84_eofS =
        "\1\1\72\uffff";
    static final String DFA84_minS =
        "\1\5\37\uffff\1\0\32\uffff";
    static final String DFA84_maxS =
        "\1\111\37\uffff\1\0\32\uffff";
    static final String DFA84_acceptS =
        "\1\uffff\1\2\70\uffff\1\1";
    static final String DFA84_specialS =
        "\40\uffff\1\0\32\uffff}>";
    static final String[] DFA84_transitionS = {
            "\4\1\1\uffff\3\1\1\uffff\3\1\1\uffff\6\1\1\uffff\13\1\4\uffff"+
            "\14\1\1\40\15\1\3\uffff\2\1\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "()* loopback of 4286:2: (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_32 = input.LA(1);

                         
                        int index84_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_InternalPPParser()) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index84_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA103_eotS =
        "\22\uffff";
    static final String DFA103_eofS =
        "\1\1\21\uffff";
    static final String DFA103_minS =
        "\1\21\1\uffff\10\0\10\uffff";
    static final String DFA103_maxS =
        "\1\115\1\uffff\10\0\10\uffff";
    static final String DFA103_acceptS =
        "\1\uffff\1\11\10\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA103_specialS =
        "\2\uffff\1\5\1\7\1\4\1\1\1\2\1\0\1\6\1\3\10\uffff}>";
    static final String[] DFA103_transitionS = {
            "\1\10\4\uffff\1\1\15\uffff\1\5\1\7\1\6\1\11\6\uffff\1\1\25\uffff"+
            "\1\4\1\1\1\2\6\uffff\1\3",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
    static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
    static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
    static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
    static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
    static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
    static final short[][] DFA103_transition;

    static {
        int numStates = DFA103_transitionS.length;
        DFA103_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
        }
    }

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = DFA103_eot;
            this.eof = DFA103_eof;
            this.min = DFA103_min;
            this.max = DFA103_max;
            this.accept = DFA103_accept;
            this.special = DFA103_special;
            this.transition = DFA103_transition;
        }
        public String getDescription() {
            return "()+ loopback of 5609:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA103_7 = input.LA(1);

                         
                        int index103_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred143_InternalPPParser()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA103_5 = input.LA(1);

                         
                        int index103_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred141_InternalPPParser()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA103_6 = input.LA(1);

                         
                        int index103_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred142_InternalPPParser()) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA103_9 = input.LA(1);

                         
                        int index103_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalPPParser()) ) {s = 17;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA103_4 = input.LA(1);

                         
                        int index103_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred140_InternalPPParser()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA103_2 = input.LA(1);

                         
                        int index103_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalPPParser()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA103_8 = input.LA(1);

                         
                        int index103_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalPPParser()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA103_3 = input.LA(1);

                         
                        int index103_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_InternalPPParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 103, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_rulePuppetManifest_in_entryRulePuppetManifest73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePuppetManifest83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_rulePuppetManifest141 = new BitSet(new long[]{0x6021E1000040DDE2L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipExpression_in_ruleExpression236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipExpression_in_ruleExpressionList329 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleExpressionList354 = new BitSet(new long[]{0x6031E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleRelationshipExpression_in_ruleExpressionList374 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleExpressionList388 = new BitSet(new long[]{0x6031E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleRelationshipExpression_in_ruleExpressionList408 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleEdgeOperator_in_entryRuleEdgeOperator448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeOperator459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleEdgeOperator497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleEdgeOperator516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleEdgeOperator535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleEdgeOperator554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipExpression_in_entryRuleRelationshipExpression593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipExpression603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceExpression_in_ruleRelationshipExpression653 = new BitSet(new long[]{0x0000100046000002L});
    public static final BitSet FOLLOW_ruleEdgeOperator_in_ruleRelationshipExpression686 = new BitSet(new long[]{0x6021F1004640DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleResourceExpression_in_ruleRelationshipExpression707 = new BitSet(new long[]{0x0000100046000002L});
    public static final BitSet FOLLOW_ruleResourceExpression_in_entryRuleResourceExpression744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceExpression754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleResourceExpression805 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleResourceExpression830 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleResourceBody_in_ruleResourceExpression851 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleResourceExpression865 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleResourceBody_in_ruleResourceExpression885 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleResourceExpression901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleResourceExpression917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralClass_in_ruleResourceExpression959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleResourceExpression972 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleResourceBody_in_ruleResourceExpression993 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleResourceExpression1007 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleResourceBody_in_ruleResourceExpression1027 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleResourceExpression1043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleResourceExpression1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceBody_in_entryRuleResourceBody1094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceBody1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleResourceBody1151 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleResourceBody1164 = new BitSet(new long[]{0x6021E1000040DDE2L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAttributeOperations_in_ruleResourceBody1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOperations_in_ruleResourceBody1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOperation_in_entryRuleAttributeOperation1248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeOperation1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulename_in_ruleAttributeOperation1316 = new BitSet(new long[]{0x0000000101000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleAttributeOperation1338 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleAttributeOperation1366 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAttributeOperation1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOperations_in_entryRuleAttributeOperations1438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeOperations1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOperation_in_ruleAttributeOperations1494 = new BitSet(new long[]{0x6031E1000040DDE2L,0x0000000000000261L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleAttributeOperations1509 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAttributeOperation_in_ruleAttributeOperations1529 = new BitSet(new long[]{0x6031E1000040DDE2L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAttributeOperation_in_ruleAttributeOperations1557 = new BitSet(new long[]{0x6031E1000040DDE2L,0x0000000000000261L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleAttributeOperations1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression1609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppendExpression_in_ruleAssignmentExpression1669 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleAssignmentExpression1694 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAppendExpression_in_ruleAssignmentExpression1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppendExpression_in_entryRuleAppendExpression1751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppendExpression1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleAppendExpression1811 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleAppendExpression1836 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleAppendExpression1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1953 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleOrExpression1978 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1998 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression2035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression2095 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleAndExpression2120 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression2140 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator2178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOperator2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleRelationalOperator2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleRelationalOperator2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleRelationalOperator2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleRelationalOperator2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleRelationalExpression2383 = new BitSet(new long[]{0x0A00000410000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleRelationalExpression2416 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleRelationalExpression2437 = new BitSet(new long[]{0x0A00000410000002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_entryRuleEqualityOperator2475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityOperator2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleEqualityOperator2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleEqualityOperator2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression2582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleEqualityExpression2642 = new BitSet(new long[]{0x0000000080100002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_ruleEqualityExpression2675 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleEqualityExpression2696 = new BitSet(new long[]{0x0000000080100002L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_entryRuleShiftOperator2734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftOperator2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleShiftOperator2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleShiftOperator2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression2841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression2901 = new BitSet(new long[]{0x0000000808000002L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression2934 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression2955 = new BitSet(new long[]{0x0000000808000002L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_entryRuleAdditiveOperator2993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveOperator3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleAdditiveOperator3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleAdditiveOperator3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3160 = new BitSet(new long[]{0x0028000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleAdditiveExpression3193 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3214 = new BitSet(new long[]{0x0028000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_entryRuleMultiplicativeOperator3252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeOperator3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleMultiplicativeOperator3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleMultiplicativeOperator3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingExpression_in_ruleMultiplicativeExpression3419 = new BitSet(new long[]{0x0044000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleMultiplicativeExpression3452 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleMatchingExpression_in_ruleMultiplicativeExpression3473 = new BitSet(new long[]{0x0044000000000002L});
    public static final BitSet FOLLOW_ruleMatchingOperator_in_entryRuleMatchingOperator3511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchingOperator3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleMatchingOperator3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleMatchingOperator3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingExpression_in_entryRuleMatchingExpression3618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchingExpression3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_ruleMatchingExpression3678 = new BitSet(new long[]{0x0000000200200002L});
    public static final BitSet FOLLOW_ruleMatchingOperator_in_ruleMatchingExpression3711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleLiteralRegex_in_ruleMatchingExpression3732 = new BitSet(new long[]{0x0000000200200002L});
    public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression3769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpression3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrHigherExpression_in_ruleInExpression3829 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleInExpression3860 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleUnaryOrHigherExpression_in_ruleInExpression3892 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrHigherExpression_in_entryRuleUnaryOrHigherExpression3929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOrHigherExpression3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryMinusExpression_in_ruleUnaryOrHigherExpression3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleUnaryOrHigherExpression4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectExpression_in_ruleUnaryOrHigherExpression4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryMinusExpression_in_entryRuleUnaryMinusExpression4083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryMinusExpression4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleUnaryMinusExpression4131 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleCollectExpression_in_ruleUnaryMinusExpression4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression4186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleNotExpression4234 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleCollectExpression_in_ruleNotExpression4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectExpression_in_entryRuleCollectExpression4289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectExpression4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorExpression_in_ruleCollectExpression4349 = new BitSet(new long[]{0x0000000020010002L});
    public static final BitSet FOLLOW_ruleCollectQuery_in_ruleCollectExpression4382 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleCollectExpression4396 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleAttributeOperations_in_ruleCollectExpression4416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleCollectExpression4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectQuery_in_entryRuleCollectQuery4468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectQuery4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualCollectQuery_in_ruleCollectQuery4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportedCollectQuery_in_ruleCollectQuery4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualCollectQuery_in_entryRuleVirtualCollectQuery4592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVirtualCollectQuery4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleVirtualCollectQuery4652 = new BitSet(new long[]{0x6021E9000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVirtualCollectQuery4672 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleVirtualCollectQuery4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportedCollectQuery_in_entryRuleExportedCollectQuery4720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExportedCollectQuery4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleExportedCollectQuery4780 = new BitSet(new long[]{0x6021E1000048DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExportedCollectQuery4800 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleExportedCollectQuery4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorExpression_in_entryRuleSelectorExpression4848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectorExpression4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtExpression_in_ruleSelectorExpression4908 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleSelectorExpression4933 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleSelectorExpression4947 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression4967 = new BitSet(new long[]{0x6031E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleSelectorExpression4982 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression5002 = new BitSet(new long[]{0x6031E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression5030 = new BitSet(new long[]{0x6031E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleSelectorExpression5046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleSelectorExpression5060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_entryRuleSelectorEntry5125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectorEntry5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelectorEntry5185 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleSelectorEntry5210 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelectorEntry5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtExpression_in_entryRuleAtExpression5267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtExpression5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleAtExpression5327 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleAtExpression5352 = new BitSet(new long[]{0xE021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtExpression5373 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleAtExpression5387 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtExpression5407 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleAtExpression5424 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleFunctionCall5520 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleFunctionCall5545 = new BitSet(new long[]{0x6023E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall5566 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleFunctionCall5580 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall5600 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleFunctionCall5616 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleFunctionCall5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_rulePrimaryExpression5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_rulePrimaryExpression5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportExpression_in_rulePrimaryExpression5788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rulePrimaryExpression5818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostClassDefinition_in_rulePrimaryExpression5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_rulePrimaryExpression5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualNameOrReference_in_rulePrimaryExpression5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_rulePrimaryExpression5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_rulePrimaryExpression5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthisedExpression_in_rulePrimaryExpression5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition6032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDefinition6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleNodeDefinition6080 = new BitSet(new long[]{0x4000C00000408C20L,0x0000000000000241L});
    public static final BitSet FOLLOW_ruleHostReference_in_ruleNodeDefinition6100 = new BitSet(new long[]{0x0010000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleNodeDefinition6114 = new BitSet(new long[]{0x4000C00000408C20L,0x0000000000000241L});
    public static final BitSet FOLLOW_ruleHostReference_in_ruleNodeDefinition6134 = new BitSet(new long[]{0x0010000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleNodeDefinition6150 = new BitSet(new long[]{0x4000C00000408C20L,0x0000000000000241L});
    public static final BitSet FOLLOW_ruleHostReference_in_ruleNodeDefinition6170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleNodeDefinition6185 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleNodeDefinition6205 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleNodeDefinition6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostReference_in_entryRuleHostReference6253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostReference6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleHostReference6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralRegex_in_ruleHostReference6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralDefault_in_ruleHostReference6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNameOrReference_in_ruleHostReference6403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostClassDefinition_in_entryRuleHostClassDefinition6437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostClassDefinition6447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleHostClassDefinition6485 = new BitSet(new long[]{0x4000C00000408D20L,0x0000000000000241L});
    public static final BitSet FOLLOW_ruleclassname_in_ruleHostClassDefinition6505 = new BitSet(new long[]{0x0001000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleDefinitionArgumentList_in_ruleHostClassDefinition6526 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleHostClassDefinition6541 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleParentName_in_ruleHostClassDefinition6561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleHostClassDefinition6576 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleHostClassDefinition6596 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleHostClassDefinition6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentName_in_entryRuleParentName6644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParentName6654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralDefault_in_ruleParentName6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralClass_in_ruleParentName6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNameOrReference_in_ruleParentName6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition6798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition6808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleDefinition6846 = new BitSet(new long[]{0x4000C00000408D20L,0x0000000000000241L});
    public static final BitSet FOLLOW_ruleclassname_in_ruleDefinition6866 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleDefinitionArgumentList_in_ruleDefinition6887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleDefinition6901 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleDefinition6921 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleDefinition6935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionArgumentList_in_entryRuleDefinitionArgumentList6969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionArgumentList6979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleDefinitionArgumentList7029 = new BitSet(new long[]{0x4012C00000408C20L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleDefinitionArgument_in_ruleDefinitionArgumentList7050 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleDefinitionArgumentList7064 = new BitSet(new long[]{0x4000C00000408C20L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleDefinitionArgument_in_ruleDefinitionArgumentList7084 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleDefinitionArgumentList7102 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleDefinitionArgumentList7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionArgument_in_entryRuleDefinitionArgument7150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionArgument7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNION_VARIABLE_OR_NAME_in_ruleDefinitionArgument7206 = new BitSet(new long[]{0x0400000100000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleDefinitionArgument7227 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleDefinitionArgument7263 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleDefinitionArgument7296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression7333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseExpression7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleCaseExpression7381 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleCaseExpression7401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleCaseExpression7414 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleCase_in_ruleCaseExpression7434 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleCaseExpression7448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase7482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase7492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleCase7538 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleCase7552 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleCase7572 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleCase7587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleCase7599 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleCase7619 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleCase7633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_entryRuleIfExpression7667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExpression7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleIfExpression7715 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleIfExpression7735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleIfExpression7748 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleIfExpression7768 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleIfExpression7782 = new BitSet(new long[]{0x0000000000002202L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleIfExpression7803 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleElseIfExpression_in_ruleIfExpression7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleIfExpression7852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleElseExpression_in_ruleIfExpression7873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseExpression_in_entryRuleElseExpression7911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElseExpression7921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleElseExpression7971 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleElseExpression7991 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleElseExpression8005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseIfExpression_in_entryRuleElseIfExpression8039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElseIfExpression8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleElseIfExpression8107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleElseIfExpression8120 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleElseIfExpression8140 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleElseIfExpression8154 = new BitSet(new long[]{0x0000000000002202L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleElseIfExpression8175 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleElseIfExpression_in_ruleElseIfExpression8196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleElseIfExpression8224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleElseExpression_in_ruleElseIfExpression8245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression8283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression8293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_ruleLiteralExpression8343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralUndef_in_ruleLiteralExpression8373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralDefault_in_ruleLiteralExpression8403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralList_in_ruleLiteralExpression8433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralHash_in_ruleLiteralExpression8463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralRegex_in_ruleLiteralExpression8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleLiteralExpression8523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNameOrReference_in_ruleLiteralExpression8553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNameOrReference_in_entryRuleLiteralNameOrReference8587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNameOrReference8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulename_in_ruleLiteralNameOrReference8642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNION_VARIABLE_OR_NAME_in_entryRuleUNION_VARIABLE_OR_NAME8677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNION_VARIABLE_OR_NAME8688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledollarVariable_in_ruleUNION_VARIABLE_OR_NAME8735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulename_in_ruleUNION_VARIABLE_OR_NAME8768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthisedExpression_in_entryRuleParenthisedExpression8812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthisedExpression8822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleParenthisedExpression8860 = new BitSet(new long[]{0x6023E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleParenthisedExpression8892 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleParenthisedExpression8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualNameOrReference_in_entryRuleVirtualNameOrReference8940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVirtualNameOrReference8950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleVirtualNameOrReference8988 = new BitSet(new long[]{0x2000000000000120L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleATBoolean_in_ruleVirtualNameOrReference9008 = new BitSet(new long[]{0x2000000000000120L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleunionNameOrReference_in_ruleVirtualNameOrReference9030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATBoolean_in_entryRuleATBoolean9066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATBoolean9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleATBoolean9114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportExpression_in_entryRuleImportExpression9152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportExpression9162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleImportExpression9212 = new BitSet(new long[]{0x0000C00000400002L});
    public static final BitSet FOLLOW_ruleQuotedString_in_ruleImportExpression9233 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleImportExpression9247 = new BitSet(new long[]{0x0000C00000400000L});
    public static final BitSet FOLLOW_ruleQuotedString_in_ruleImportExpression9267 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleLiteralList_in_entryRuleLiteralList9306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralList9316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleLiteralList9366 = new BitSet(new long[]{0xE021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleLiteralList9387 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleLiteralList9401 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleLiteralList9421 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleLiteralList9437 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleLiteralList9453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralHash_in_entryRuleLiteralHash9487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralHash9497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleLiteralHash9547 = new BitSet(new long[]{0x4010C00000408C20L,0x0000000000000243L});
    public static final BitSet FOLLOW_ruleHashEntry_in_ruleLiteralHash9568 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleLiteralHash9582 = new BitSet(new long[]{0x4000C00000408C20L,0x0000000000000241L});
    public static final BitSet FOLLOW_ruleHashEntry_in_ruleLiteralHash9602 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleLiteralHash9620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleLiteralHash9634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashEntry_in_entryRuleHashEntry9668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashEntry9678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNameOrString_in_ruleHashEntry9724 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleHashEntry9737 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleHashEntry9757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNameOrString_in_entryRuleLiteralNameOrString9792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNameOrString9802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleLiteralNameOrString9852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralName_in_ruleLiteralNameOrString9882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue9917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue9928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleBooleanValue9966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleBooleanValue9985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean10024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean10034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleLiteralBoolean10079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralDefault_in_entryRuleLiteralDefault10113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralDefault10123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleLiteralDefault10173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralUndef_in_entryRuleLiteralUndef10207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralUndef10217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleLiteralUndef10267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralClass_in_entryRuleLiteralClass10301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralClass10311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleLiteralClass10361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression10401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression10411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuotedString_in_ruleStringExpression10465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnquotedString_in_ruleStringExpression10495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuotedString_in_ruleStringExpression10525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedString_in_entryRuleQuotedString10569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotedString10579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuotedString_in_ruleQuotedString10633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuotedString_in_ruleQuotedString10663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuotedString_in_entryRuleSingleQuotedString10701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleQuotedString10711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesqText_in_ruleSingleQuotedString10775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuotedString_in_entryRuleDoubleQuotedString10816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleQuotedString10826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleDoubleQuotedString10868 = new BitSet(new long[]{0x000040F000420000L,0x0000000000002070L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleDoubleQuotedString10900 = new BitSet(new long[]{0x000040F000420000L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleDoubleQuotedString10914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression10958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression10968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoubleStringCharacters_in_ruleTextExpression11031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleTextExpression11064 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionWithHidden_in_ruleTextExpression11084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleTextExpression11097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledollarVariable_in_ruleTextExpression11137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionWithHidden_in_entryRuleExpressionWithHidden11183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionWithHidden11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpressionWithHidden11255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnquotedString_in_entryRuleUnquotedString11297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnquotedString11307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleUnquotedString11357 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleUnquotedString11377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleUnquotedString11391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesqText_in_entryRulesqText11432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesqText11443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rulesqText11494 = new BitSet(new long[]{0x000080F000420000L,0x0000000000002070L});
    public static final BitSet FOLLOW_rulesingleStringCharacters_in_rulesqText11518 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rulesqText11538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralRegex_in_entryRuleLiteralRegex11581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralRegex11591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REGULAR_EXPRESSION_in_ruleLiteralRegex11632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralName_in_entryRuleLiteralName11671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralName11681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulename_in_ruleLiteralName11726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression11760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression11770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledollarVariable_in_ruleVariableExpression11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledollarVariable_in_entryRuledollarVariable11856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledollarVariable11867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOLLAR_VAR_in_ruledollarVariable11910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulename_in_entryRulename11960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulename11971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_CHARS_in_rulename12010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassname_in_entryRuleclassname12054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclassname12065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulename_in_ruleclassname12112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleclassname12136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunionNameOrReference_in_entryRuleunionNameOrReference12176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunionNameOrReference12187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_CHARS_in_ruleunionNameOrReference12227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleunionNameOrReference12251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleunionNameOrReference12270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoubleStringCharacters_in_entryRuledoubleStringCharacters12316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledoubleStringCharacters12327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_CHARS_in_ruledoubleStringCharacters12371 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruledoubleStringCharacters12397 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_RULE_WS_in_ruledoubleStringCharacters12423 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruledoubleStringCharacters12447 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruledoubleStringCharacters12466 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruledoubleStringCharacters12485 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruledoubleStringCharacters12504 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruledoubleStringCharacters12523 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_rulesingleStringCharacters_in_entryRulesingleStringCharacters12574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesingleStringCharacters12585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_CHARS_in_rulesingleStringCharacters12629 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rulesingleStringCharacters12655 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulesingleStringCharacters12681 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_RULE_DOLLAR_VAR_in_rulesingleStringCharacters12707 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rulesingleStringCharacters12731 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_38_in_rulesingleStringCharacters12750 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rulesingleStringCharacters12769 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_39_in_rulesingleStringCharacters12788 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rulesingleStringCharacters12807 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_41_in_rulesingleStringCharacters12826 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_ruleEdgeOperator_in_synpred7_InternalPPParser686 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleResourceExpression_in_synpred7_InternalPPParser707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_synpred11_InternalPPParser830 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleResourceBody_in_synpred11_InternalPPParser851 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_synpred11_InternalPPParser865 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleResourceBody_in_synpred11_InternalPPParser885 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_synpred11_InternalPPParser901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_synpred11_InternalPPParser917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_synpred23_InternalPPParser1694 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAppendExpression_in_synpred23_InternalPPParser1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_synpred24_InternalPPParser1836 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleOrExpression_in_synpred24_InternalPPParser1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_synpred25_InternalPPParser1978 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAndExpression_in_synpred25_InternalPPParser1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_synpred26_InternalPPParser2120 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_synpred26_InternalPPParser2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_synpred30_InternalPPParser2416 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_synpred30_InternalPPParser2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_synpred32_InternalPPParser2675 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_synpred32_InternalPPParser2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_synpred34_InternalPPParser2934 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_synpred34_InternalPPParser2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_synpred36_InternalPPParser3193 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_synpred36_InternalPPParser3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_synpred38_InternalPPParser3452 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleMatchingExpression_in_synpred38_InternalPPParser3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingOperator_in_synpred40_InternalPPParser3711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleLiteralRegex_in_synpred40_InternalPPParser3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_synpred41_InternalPPParser3860 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleUnaryOrHigherExpression_in_synpred41_InternalPPParser3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_synpred45_InternalPPParser4396 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleAttributeOperations_in_synpred45_InternalPPParser4416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_synpred45_InternalPPParser4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectQuery_in_synpred46_InternalPPParser4382 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_synpred46_InternalPPParser4396 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleAttributeOperations_in_synpred46_InternalPPParser4416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_synpred46_InternalPPParser4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_synpred53_InternalPPParser4947 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_synpred53_InternalPPParser4967 = new BitSet(new long[]{0x6031E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred53_InternalPPParser4982 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_synpred53_InternalPPParser5002 = new BitSet(new long[]{0x6031E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_synpred53_InternalPPParser5030 = new BitSet(new long[]{0x6031E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred53_InternalPPParser5046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_synpred53_InternalPPParser5060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_synpred55_InternalPPParser5210 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred55_InternalPPParser5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_synpred58_InternalPPParser5352 = new BitSet(new long[]{0xE021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred58_InternalPPParser5373 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred58_InternalPPParser5387 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred58_InternalPPParser5407 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_19_in_synpred58_InternalPPParser5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_synpred62_InternalPPParser5545 = new BitSet(new long[]{0x6023E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred62_InternalPPParser5566 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred62_InternalPPParser5580 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred62_InternalPPParser5600 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred62_InternalPPParser5616 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_synpred62_InternalPPParser5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred114_InternalPPParser9247 = new BitSet(new long[]{0x0000C00000400000L});
    public static final BitSet FOLLOW_ruleQuotedString_in_synpred114_InternalPPParser9267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedString_in_synpred115_InternalPPParser9233 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred115_InternalPPParser9247 = new BitSet(new long[]{0x0000C00000400000L});
    public static final BitSet FOLLOW_ruleQuotedString_in_synpred115_InternalPPParser9267 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_CHARS_in_synpred138_InternalPPParser12371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_synpred139_InternalPPParser12397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_synpred140_InternalPPParser12423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_synpred141_InternalPPParser12447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_synpred142_InternalPPParser12466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_synpred143_InternalPPParser12485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_synpred144_InternalPPParser12504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_synpred145_InternalPPParser12523 = new BitSet(new long[]{0x0000000000000002L});

}