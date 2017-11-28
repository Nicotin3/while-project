package main;

import org.xtext.whpp.mydsl.wh.Model;
import org.xtext.whpp.mydsl.wh.Output;
import org.xtext.whpp.mydsl.wh.Variables;
import org.xtext.whpp.mydsl.wh.Commands;
import org.xtext.whpp.mydsl.wh.Definition;
import org.xtext.whpp.mydsl.wh.Expr;
import org.xtext.whpp.mydsl.wh.Exprs;
import org.xtext.whpp.mydsl.wh.Function;
import org.xtext.whpp.mydsl.wh.Input;
import org.eclipse.emf.common.util.EList;
import org.xtext.whpp.mydsl.wh.Command;

public class PrettyPrinter {

	// Valeurs par defaut des options
	private static final int OPT_INDENT_DEFAULT = 2;

	// Options
	private int optIndent;
	private int optForIndent;
	private int optWhileIndent;
	private int optIfIndent;

	/**
	 * Constructeur initialisant toutes les options du pretty printer avec leur
	 * valeur par defaut
	 */
	public PrettyPrinter() {
		optIndent = OPT_INDENT_DEFAULT;
		optForIndent = OPT_INDENT_DEFAULT;
		optIfIndent = OPT_INDENT_DEFAULT;
		optWhileIndent = OPT_INDENT_DEFAULT;
	}

	////////////////////////////////////////////////////////////
	////////// Methodes de modification des options

	/**
	 * Indentation par defaut (c.a.d. pas specifique a une structure if, while etc.)
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
	////////// Methodes de pretty print des non terminaux

	/**
	 * Model
	 */
	public StringBuilder prettyPrint(Model m) {
		StringBuilder res = new StringBuilder();

		for (Function f : m.getFunctions()) {
			res.append(prettyPrint(f, new StringBuilder())).append("\n");
		}

		return res;
	}

	/**
	 * Function
	 */
	private StringBuilder prettyPrint(Function f, StringBuilder curIndent) {
		StringBuilder res = new StringBuilder();

		res.append(curIndent).append("function ").append(f.getName()).append(":\n")
				.append(prettyPrint(f.getDefinition(), curIndent));

		return res;
	}

	/**
	 * Definition
	 */
	private StringBuilder prettyPrint(Definition d, StringBuilder curIndent) {
		StringBuilder res = new StringBuilder();

		res.append(prettyPrint(d.getInput(), curIndent)).append(curIndent).append("%\n")
				.append(prettyPrint(d.getCommands(), newIndent(curIndent, optIndent)));
		res.append(curIndent).append("\n%\n").append(prettyPrint(d.getOutput(), curIndent));

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

		res.append(curIndent).append("write ").append(prettyPrint(o.getVariables()));

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
		boolean point_virg = false;

		for (Command com : c.getCommands()) {
			if (!point_virg)
				point_virg = true;
			else
				res.append(" ;\n");

			if (com.getCommand().equals("nop")) {
				res.append(curIndent).append("nop");
			}

			else if (com.getCommand().equals(":=")) {
				res.append(curIndent).append(prettyPrint(com.getVariables())).append(" := ")
						.append(prettyPrint(com.getExrps(), curIndent));
			}

			else if (com.getCommand().equals("while")) {
				res.append(curIndent).append("while ").append(prettyPrint(com.getExpr(), curIndent)).append(" do\n");
				res.append(prettyPrint(com.getCommands(), newIndent(curIndent, optWhileIndent)));
				res.append("\n").append(curIndent).append("od");
			}

			else if (com.getCommand().equals("for")) {
				res.append(curIndent).append("for ").append(prettyPrint(com.getExpr(), curIndent)).append(" do\n");
				res.append(prettyPrint(com.getCommands(), newIndent(curIndent, optForIndent))).append("\n")
						.append(curIndent).append("od");
			}

			else if (com.getCommand().equals("if")) {
				res.append(curIndent).append("if ").append(prettyPrint(com.getExpr(), curIndent)).append(" then\n");
				res.append(prettyPrint(com.getCommands_then(), newIndent(curIndent, optIfIndent))).append("\n");
				res.append(curIndent).append("else\n")
						.append(prettyPrint(com.getCommands_else(), newIndent(curIndent, optIfIndent)))
						.append(curIndent).append("fi");
			}

			else if (com.getCommand().equals("foreach")) {
				res.append(curIndent).append("foreach ").append(prettyPrint(com.getExpr(), curIndent)).append(" in ");
				res.append(prettyPrint(com.getExpr_in(), curIndent)).append(" do\n");
				res.append(prettyPrint(com.getCommands(), newIndent(curIndent, optForIndent))).append("\n")
						.append(curIndent).append("od");
			}
		}
		return res;
	}

	/**
	 * Exprs
	 */
	private Object prettyPrint(Exprs e, StringBuilder curIndent) {
		StringBuilder res = new StringBuilder();
		boolean virgule = false;
		for (Expr exp : e.getExprs()) {
			if (!virgule)
				virgule = true;
			else
				res.append(", ");
			res.append(prettyPrint(exp, curIndent));
		}
		return res;
	}

	/**
	 * Expr
	 */
	private StringBuilder prettyPrint(Expr e, StringBuilder curIndent) {
		StringBuilder res = new StringBuilder();
		if (e.getExpr().equals("nil")) {
			res.append("nil");
		}

		else if (e.getExpr().equals("cons")) {
			res.append("(cons ").append(prettyPrint(e.getExprs(), curIndent)).append(")");
		}

		else if (e.getExpr().equals("list")) {
			res.append("(list ").append(prettyPrint(e.getExprs(), curIndent)).append(")");
		}

		else if (e.getExpr().equals("hd")) {
			res.append("(hd ").append(prettyPrint(e.getExpr2(), curIndent)).append(")");
		}

		else if (e.getExpr().equals("tl")) {
			res.append("(tl ").append(prettyPrint(e.getExpr2(), curIndent)).append(")");
		}

		else if (e.getExpr().equals("and")) {
			res.append("(").append(prettyPrint(e.getExprG(), curIndent)).append(" and ")
					.append(prettyPrint(e.getExprD(), curIndent));
			res.append(")");
		}

		else if (e.getExpr().equals("or")) {
			res.append("(").append(prettyPrint(e.getExprG(), curIndent)).append(" or ")
					.append(prettyPrint(e.getExprD(), curIndent));
			res.append(")");
		}

		else if (e.getExpr().equals("=?")) {
			res.append("(").append(prettyPrint(e.getExprG(), curIndent)).append(" =? ")
					.append(prettyPrint(e.getExprD(), curIndent));
			res.append(")");
		}

		else if (e.getExpr().equals("not")) {
			res.append("not ").append(prettyPrint(e.getExpr2(), curIndent));
		}

		else {
			res.append(e.getVariable());
		}
		return res;
	}

	private Object prettyPrint(EList<Expr> e, StringBuilder curIndent) {
		StringBuilder res = new StringBuilder();
		for (Expr exp : e) {
			if (exp.getExpr().equals("nil")) {
				res.append("nil");
			}

			else if (exp.getExpr().equals("cons")) {
				res.append("(cons ").append(prettyPrint(exp.getExprs(), curIndent)).append(")");
				;
			}

			else if (exp.getExpr().equals("list")) {
				res.append("(list ").append(prettyPrint(exp.getExprs(), curIndent)).append(")");
				;
			}

			else if (exp.getExpr().equals("hd")) {
				res.append("(hd ").append(prettyPrint(exp.getExpr2(), curIndent)).append(")");
			}

			else if (exp.getExpr().equals("tl")) {
				res.append("(tl ").append(prettyPrint(exp.getExpr2(), curIndent)).append(")");
			}

			else if (exp.getExpr().equals("and")) {
				res.append("(").append(prettyPrint(exp.getExprG(), curIndent)).append(" and ")
						.append(prettyPrint(exp.getExprD(), curIndent));
				res.append(")");
			}

			else if (exp.getExpr().equals("or")) {
				res.append("(").append(prettyPrint(exp.getExprG(), curIndent)).append(" or ")
						.append(prettyPrint(exp.getExprD(), curIndent));
				res.append(")");
			}

			else if (exp.getExpr().equals("=?")) {
				res.append("(").append(prettyPrint(exp.getExprG(), curIndent)).append(" =? ")
						.append(prettyPrint(exp.getExprD(), curIndent));
				res.append(")");
			}

			else if (exp.getExpr().equals("not")) {
				res.append("not ").append(prettyPrint(exp.getExpr2(), curIndent));
			}

			else {
				res.append(exp.getVariable());
			}
		}
		return res;
	}

	////////////////////////////////////////////////////////////
	////////// Methodes utilitaires

	/**
	 * Retourne la chaine indent a laquelle ont ete ajoute spacesToAdd espaces
	 */
	private StringBuilder newIndent(StringBuilder indent, int spacesToAdd) {
		StringBuilder res = new StringBuilder().append(indent);
		for (int i = 0; i < spacesToAdd; i++) {
			res.append(" ");
		}
		return res;
	}
}