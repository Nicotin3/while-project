/*
 * generated by Xtext 2.13.0
 */
package org.xtext.whpp.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.whpp.mydsl.services.WhGrammarAccess;

@SuppressWarnings("all")
public class WhSyntacticSequencer extends AbstractSyntacticSequencer {

	protected WhGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Program_LineFeedKeyword_1_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (WhGrammarAccess) access;
		match_Program_LineFeedKeyword_1_p = new TokenAlias(true, false, grammarAccess.getProgramAccess().getLineFeedKeyword_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Program_LineFeedKeyword_1_p.equals(syntax))
				emit_Program_LineFeedKeyword_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '
	  *     '+
	 *
	 * This ambiguous syntax occurs at:
	 *     function=Function (ambiguity) (rule end)
	 *     function=Function (ambiguity) program=Program
	 */
	protected void emit_Program_LineFeedKeyword_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
