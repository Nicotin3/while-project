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
	public String prettyPrint(Model m) {
		String res = "";
		
		for (Function f : m.getFunctions()) {
            res += prettyPrint(f, "") + "\n";
        }
		
		return res;
	}
	
	/**
	 * Function
	 */
	private String prettyPrint(Function f, String curIndent) {
		String res = "";
		
		res += curIndent + "function " + f.getName() + ":\n"
				+ prettyPrint(f.getDefinition(), curIndent);
		
		return res;
	}
	
	/**
	 * Definition
	 */
	private String prettyPrint(Definition d, String curIndent) {
		String res = "";
		
		res += prettyPrint(d.getInput(), curIndent)
				+ curIndent + "%\n"
				+ prettyPrint(d.getCommands(), newIndent(curIndent, optIndent))
				+ curIndent + "%\n"
				+ prettyPrint(d.getOutput(), curIndent);
		
		return res;
	}
	
	/**
	 * Input
	 */
	private String prettyPrint(Input i, String curIndent) {
		String res = "";
		
		res += curIndent + "read " + prettyPrint(i.getVariables()) + "\n";
		
		return res;
	}
	
	/**
	 * Output
	 */
	private String prettyPrint(Output o, String curIndent) {
		String res = "";
		
		res += curIndent + "write " + prettyPrint(o.getVariables()) + "\n";;
		
		return res;
	}
	
	/**
	 * Variables
	 */
	private String prettyPrint(Variables v) {
		String res = "";
		
		for (String var : v.getVariables()) {
			res += var + ",";
		}
		res = res.substring(0, res.length() - 1);
		
		return res;
	}
	
	/**
	 * Commands
	 */
	private String prettyPrint(Commands c, String curIndent) {
		String res = "";
		
		for (Command com : c.getCommands()) {
			if(com.getCommand().equals("nop")) {
				res += curIndent + "nop \n";
			}
			
			else if (com.getCommand().equals(":=")){
				res += curIndent + prettyPrint(com.getVariables()) + " := Exprs ;\n";
			}
			
			else if (com.getCommand().equals("while")){
				res += curIndent + "while Expr do\n" + prettyPrint(com.getCommands(), newIndent(curIndent, OPT_INDENT_DEFAULT)) + curIndent + "od \n";
			}
			else if (com.getCommand().equals("for")) {
				res += curIndent + "for Expr do\n" + prettyPrint(com.getCommands(), newIndent(curIndent, OPT_INDENT_DEFAULT)) + curIndent + "od \n";
			}
			else if (com.getCommand().equals("if")) {
				res += curIndent + "if Expr then\n" + prettyPrint(com.getCommands_then(), newIndent(curIndent, OPT_INDENT_DEFAULT)) + "\n else\n" + prettyPrint(com.getCommands_else(),"") + curIndent + "fi\n";
			}
		}
		return res;
	}
	
	
	
	
	////////////////////////////////////////////////////////////
	////////// Méthodes utilitaires
	
	/**
	 * Retourne la chaine indent à laquelle ont été ajoutés spacesToAdd espaces
	 */
	private String newIndent(String indent, int spacesToAdd) {
		for (int i = 0; i < spacesToAdd; i++) {
			indent += " ";
		}
		return indent;
	}
}
