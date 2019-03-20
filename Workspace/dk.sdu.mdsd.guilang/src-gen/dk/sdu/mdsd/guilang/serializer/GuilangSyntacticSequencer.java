/*
 * generated by Xtext 2.16.0
 */
package dk.sdu.mdsd.guilang.serializer;

import com.google.inject.Inject;
import dk.sdu.mdsd.guilang.services.GuilangGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class GuilangSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GuilangGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Horizontal_HoriKeyword_1_1_or_HorizontalKeyword_1_0;
	protected AbstractElementAlias match_RequireBase_ExclamationMarkKeyword_1_1_0_or_NOTKeyword_1_1_1;
	protected AbstractElementAlias match_SizeSpec_HKeyword_1_1_2_0_or_HeightKeyword_1_1_2_1;
	protected AbstractElementAlias match_SizeSpec_WKeyword_1_1_0_0_or_WidthKeyword_1_1_0_1;
	protected AbstractElementAlias match_Vertical_VertKeyword_1_1_or_VerticalKeyword_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GuilangGrammarAccess) access;
		match_Horizontal_HoriKeyword_1_1_or_HorizontalKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getHorizontalAccess().getHoriKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getHorizontalAccess().getHorizontalKeyword_1_0()));
		match_RequireBase_ExclamationMarkKeyword_1_1_0_or_NOTKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRequireBaseAccess().getExclamationMarkKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getRequireBaseAccess().getNOTKeyword_1_1_1()));
		match_SizeSpec_HKeyword_1_1_2_0_or_HeightKeyword_1_1_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSizeSpecAccess().getHKeyword_1_1_2_0()), new TokenAlias(false, false, grammarAccess.getSizeSpecAccess().getHeightKeyword_1_1_2_1()));
		match_SizeSpec_WKeyword_1_1_0_0_or_WidthKeyword_1_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSizeSpecAccess().getWKeyword_1_1_0_0()), new TokenAlias(false, false, grammarAccess.getSizeSpecAccess().getWidthKeyword_1_1_0_1()));
		match_Vertical_VertKeyword_1_1_or_VerticalKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getVerticalAccess().getVertKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getVerticalAccess().getVerticalKeyword_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBUTTON_TYPERule())
			return getBUTTON_TYPEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCHECKBOX_TYPERule())
			return getCHECKBOX_TYPEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCLOSERule())
			return getCLOSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINPUT_TYPERule())
			return getINPUT_TYPEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLABEL_TYPERule())
			return getLABEL_TYPEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOPENRule())
			return getOPENToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal BUTTON_TYPE:
	 * 	'btn' | 'button'
	 * ;
	 */
	protected String getBUTTON_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "btn";
	}
	
	/**
	 * terminal CHECKBOX_TYPE:
	 * 	'chk' | 'checkbox'
	 * ;
	 */
	protected String getCHECKBOX_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "chk";
	}
	
	/**
	 * terminal CLOSE:
	 * 	'}'
	 * ;
	 */
	protected String getCLOSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal INPUT_TYPE:
	 * 	'field' | 'input'
	 * ;
	 */
	protected String getINPUT_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "field";
	}
	
	/**
	 * terminal LABEL_TYPE:
	 * 	'lbl' | 'label'
	 * ;
	 */
	protected String getLABEL_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "lbl";
	}
	
	/**
	 * terminal OPEN:
	 * 	'{'
	 * ;
	 */
	protected String getOPENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Horizontal_HoriKeyword_1_1_or_HorizontalKeyword_1_0.equals(syntax))
				emit_Horizontal_HoriKeyword_1_1_or_HorizontalKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RequireBase_ExclamationMarkKeyword_1_1_0_or_NOTKeyword_1_1_1.equals(syntax))
				emit_RequireBase_ExclamationMarkKeyword_1_1_0_or_NOTKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SizeSpec_HKeyword_1_1_2_0_or_HeightKeyword_1_1_2_1.equals(syntax))
				emit_SizeSpec_HKeyword_1_1_2_0_or_HeightKeyword_1_1_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SizeSpec_WKeyword_1_1_0_0_or_WidthKeyword_1_1_0_1.equals(syntax))
				emit_SizeSpec_WKeyword_1_1_0_0_or_WidthKeyword_1_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Vertical_VertKeyword_1_1_or_VerticalKeyword_1_0.equals(syntax))
				emit_Vertical_VertKeyword_1_1_or_VerticalKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'horizontal' | 'hori'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) OPEN CLOSE (rule start)
	 *     (rule start) (ambiguity) OPEN entities+=Entity
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_Horizontal_HoriKeyword_1_1_or_HorizontalKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '!' | 'NOT'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) exp=RequireBase
	 */
	protected void emit_RequireBase_ExclamationMarkKeyword_1_1_0_or_NOTKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'h' | 'height'
	 *
	 * This ambiguous syntax occurs at:
	 *     width=INT (ambiguity) height=INT
	 */
	protected void emit_SizeSpec_HKeyword_1_1_2_0_or_HeightKeyword_1_1_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'w' | 'width'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'size' (ambiguity) width=INT
	 */
	protected void emit_SizeSpec_WKeyword_1_1_0_0_or_WidthKeyword_1_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'vertical' | 'vert'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) OPEN CLOSE (rule start)
	 *     (rule start) (ambiguity) OPEN entities+=Entity
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_Vertical_VertKeyword_1_1_or_VerticalKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}