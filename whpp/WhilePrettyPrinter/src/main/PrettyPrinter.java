package main;

import org.xtext.whpp.mydsl.wh.Model;
import org.xtext.whpp.mydsl.wh.Output;
import org.xtext.whpp.mydsl.wh.Variables;
import org.xtext.whpp.mydsl.wh.Commands;
import org.xtext.whpp.mydsl.wh.Definition;
import org.xtext.whpp.mydsl.wh.Function;
import org.xtext.whpp.mydsl.wh.Input;

public class PrettyPrinter {
	
	// Valeurs par défaut des options
	private static final int OPT_INDENT_DEFAULT = 2;
	
	// Options
	private int optIndent;
	
	/**
	 * Constructeur initialisant toutes les options du pretty printer avec leur valeur par défaut
	 */
	public PrettyPrinter() {
		optIndent = OPT_INDENT_DEFAULT;
	}
	
	
	////////////////////////////////////////////////////////////
	////////// Méthodes de modification des options
	
	/**
	 * Indentation par défaut (c.a.d. pas spécifique à une structure if, while etc.)
	 */
	public void setIndent(int newIndent) {
		optIndent = newIndent;
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
		
		for (String com : c.getCommands()) {
			res += curIndent + com + " ;\n";
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
