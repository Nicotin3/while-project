/*
 * generated by Xtext 2.13.0
 */
package org.xtext.whpp.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.whpp.mydsl.parser.antlr.internal.InternalWhParser;
import org.xtext.whpp.mydsl.services.WhGrammarAccess;

public class WhParser extends AbstractAntlrParser {

	@Inject
	private WhGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS");
	}
	

	@Override
	protected InternalWhParser createParser(XtextTokenStream stream) {
		return new InternalWhParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public WhGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WhGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
