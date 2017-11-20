package main;

import org.xtext.whpp.mydsl.wh.Model;
import org.xtext.whpp.mydsl.wh.Output;
import org.xtext.whpp.mydsl.wh.Variables;
import org.xtext.whpp.mydsl.wh.Commands;
import org.xtext.whpp.mydsl.wh.Definition;
import org.xtext.whpp.mydsl.wh.Function;
import org.xtext.whpp.mydsl.wh.Input;
import org.xtext.whpp.mydsl.wh.Command;

public class PrettyPrinter {
	
	// Valeurs par défaut des options
	private static final int OPT_INDENT_DEFAULT = 2;
	
	// Options
	private int optIndent;
	private int optForIndent;
	private int optWhileIndent;
	private int optIfIndent;
	
	
	/**
	 * Constructeur initialisant toutes les options du pretty printer avec leur valeur par défaut
	 */
	public PrettyPrinter() {
		optIndent = OPT_INDENT_DEFAULT;
		optForIndent = OPT_INDENT_DEFAULT;
		optIfIndent = OPT_INDENT_DEFAULT;
		optWhileIndent = OPT_INDENT_DEFAULT;
	}
	
	
	////////////////////////////////////////////////////////////
	////////// Méthodes de modification des options
	
	/**
	 * Indentation par défaut (c.a.d. pas spécifique à une structure if, while etc.)
	 */
	public void setIndent(int newIndent) {
		optIndent = newIndent;
		optIfIndent = newIndent;
		optWhileIndent = newIndent;
		optForIndent = newIndent;
	}
	
	public void setIfIndent(int newIndent) {
		optIfIndent = newIndent;
	}
	
	public void setWhileIndent(int newIndent) {
		optWhileIndent = newIndent;
	}
	
	public void setForIndent(int newIndent) {
		optForIndent = newIndent;
	}
	
	
	////////////////////////////////////////////////////////////
	////////// Méthodes de pretty print des non terminaux
	
	/**
	 * Model
	 */
	public StringBuilder prettyPrint(Model m) {
		StringBuilder res = new StringBuilder();
		
		for (Function f : m.getFunctions()) {
            res.append(prettyPrint(f,new StringBuilder())).append("\n");
        }
		
		return res;
	}
	
	/**
	 * Function
	 */
	private StringBuilder prettyPrint(Function f, StringBuilder curIndent) {
		StringBuilder res = new StringBuilder();
		
		res.append(curIndent).append("function ").append(f.getName()).append(":\n").append(prettyPrint(f.getDefinition(), curIndent));
		
		return res;
	}
	
	/**
	 * Definition
	 */
	private StringBuilder prettyPrint(Definition d, StringBuilder curIndent) {
		StringBuilder res = new StringBuilder();
		
		res.append(prettyPrint(d.getInput(), curIndent)).append(curIndent).append("%\n").append(prettyPrint(d.getCommands(), newIndent(curIndent, optIndent)));
		res.append(curIndent).append("%\n").append(prettyPrint(d.getOutput(), curIndent));
		
		return res;
	}
	
	/**
	 * Input
	 */
	private StringBuilder prettyPrint(Input i, StringBuilder curIndent) {
		StringBuilder res = new StringBuilder();
		
		res.append(curIndent).append("read ").append(prettyPrint(i.getVariables())).append("\n");
		
		return res;
	}
	
	/**
	 * Output
	 */
	private StringBuilder prettyPrint(Output o, StringBuilder curIndent) {
		StringBuilder res = new StringBuilder();
		
		res.append(curIndent).append("write ").append(prettyPrint(o.getVariables())).append("\n");
		
		return res;
	}
	
	/**
	 * Variables
	 */
	private StringBuilder prettyPrint(Variables v) {
		StringBuilder res = new StringBuilder();
		
		for (String var : v.getVariables()) {
			res.append(var).append(",");
		}
		res.deleteCharAt(res.length() - 1);
		
		return res;
	}
	
	/**
	 * Commands
	 */
	private StringBuilder prettyPrint(Commands c, StringBuilder curIndent) {
		StringBuilder res = new StringBuilder();
		
		for (Command com : c.getCommands()) {
			if(com.getCommand().equals("nop")) {
				res.append(curIndent).append("nop \n");
			}
			
			else if (com.getCommand().equals(":=")){
				res.append(curIndent).append(prettyPrint(com.getVariables())).append(" := Exprs ;\n");
			}
			
			else if (com.getCommand().equals("while")){
				res.append(curIndent).append("while Expr do\n").append(prettyPrint(com.getCommands(), newIndent(curIndent, OPT_INDENT_DEFAULT))).append(curIndent).append("od \n");
			}
			else if (com.getCommand().equals("for")) {
				res.append(curIndent).append("for Expr do\n").append(prettyPrint(com.getCommands(), newIndent(curIndent, OPT_INDENT_DEFAULT))).append(curIndent).append("od \n");
			}
			else if (com.getCommand().equals("if")) {
				res.append(curIndent).append("if Expr then\n").append(prettyPrint(com.getCommands_then(), newIndent(curIndent, OPT_INDENT_DEFAULT))).append("\n else\n").append(prettyPrint(com.getCommands_else(), newIndent(curIndent, OPT_INDENT_DEFAULT))).append(curIndent).append("fi\n");
			}
		}
		return res;
	}
	
	
	
	
	////////////////////////////////////////////////////////////
	////////// Méthodes utilitaires
	
	/**
	 * Retourne la chaine indent à laquelle ont été ajoutés spacesToAdd espaces
	 */
	private StringBuilder newIndent(StringBuilder indent, int spacesToAdd) {
		StringBuilder res = new StringBuilder().append(indent);
		for (int i = 0; i < spacesToAdd; i++) {
			res.append(" ");
		}
		return res;
	}
}
