package production;

import org.xtext.whpp.mydsl.wh.Command;
import org.xtext.whpp.mydsl.wh.Commands;
import org.xtext.whpp.mydsl.wh.Definition;
import org.xtext.whpp.mydsl.wh.Expr;
import org.xtext.whpp.mydsl.wh.Exprand;
import org.xtext.whpp.mydsl.wh.Exprsimple;
import org.xtext.whpp.mydsl.wh.Function;
import org.xtext.whpp.mydsl.wh.Input;
import org.xtext.whpp.mydsl.wh.Model;
import org.xtext.whpp.mydsl.wh.Output;
import org.xtext.whpp.mydsl.wh.Variables;

import javafx.util.Pair;
import structure_interne.AFFECT;
import structure_interne.BOUCHON;
import structure_interne.EQUAL;
import structure_interne.FOR;
import structure_interne.FOREACH;
import structure_interne.IF;
import structure_interne.NOP;
import structure_interne.Op;
import structure_interne.Quadruplet;
import structure_interne.READ;
import structure_interne.WHILE;
import structure_interne.WRITE;
import table_des_symboles.Instructions;
import table_des_symboles.Table;
import table_des_symboles.TableVar;

public class Compiler {
	private static int nb_temp_var=0;

	// Exemple d'instanciation de Quadruplet :
	// Quadruplet<Op, Integer, Integer, Integer> quad = new Quadruplet<Op,
	// Integer, Integer, Integer>(new Op(""), 0, 0, 0);

	// Table globale qui doit être correctement instanciée
	Table tableFonctions;

	public Compiler() {
		tableFonctions = new Table();
	}

	public Table getTable() {
		return tableFonctions;
	}

	/* __________________________Méthodes compile__________________________ */

	/**
	 * Model
	 */
	public void compile(Model m) {
		for (Function f : m.getFunctions()) {
			compile(f);
			// Peut-être mieux de le faire ici, pour donner une clé aux
			// fontions plutot que leurs nom auquel cas
			// virer l'ajout de la tableFonction dans le compile(Fonction). Mais
			// nécessiterais de récupérer tableVar et List d'instr.
			// tableFonctions.add_function(name, nb_in, nb_out);
		}
	}

	/**
	 * Function
	 */
	private void compile(Function f) {
		TableVar tableVar = new TableVar();
		Instructions code3a = new Instructions();
		// Liste d'instructions
		// Quadruplet<Op, Integer, Integer, Integer> quad = new Quadruplet<Op,
		// Integer, Integer, Integer>(new BOUCHON("fonction"), 0, 0, 0);

		// Ajout de la liste d'instructions dans l'instance d'Instructions
		// correspondante à f
		// code3a.add_instruction(quad);

		// Ajout des variables dans la table des variables

		code3a.add_instructions(compile(f.getDefinition(), tableVar));

		tableFonctions.add_function(f.getName(), getNbInput(f), getNbOutput(f), tableVar, code3a);
	}

	/**
	 * Definition
	 */
	private Instructions compile(Definition d, TableVar table) {
		Instructions code3a = new Instructions();
		// Liste d'instructions
		// Quadruplet<Op, Integer, Integer, Integer> quad = new Quadruplet<Op,
		// Integer, Integer, Integer>(new Op("Bouchon Definition"), null, null,
		// null);
		// Ajout dans la liste d'instructions
		// code3a.add_instruction(quad);

		code3a.add_instructions(compile(d.getInput(), table));

		code3a.add_instructions(compile(d.getCommands(), table));

		code3a.add_instructions(compile(d.getOutput(), table));

		return code3a;
	}

	/**
	 * Variables
	 */
	private void compile(Variables v, TableVar table) {
		// Les nouvelles variables valent nil à leur déclaration. mais pas
		// initialisées car cela se fait à l'execution.

		// Si les variables ne sont pas dans la table, les ajoutent et leur
		// attribuent un numéro unique. Sinon rien.
		for (String var : v.getVariables()) {
			table.add_variable(var);
		}
	}

	/**
	 * Input
	 */
	private Instructions compile(Input i, TableVar table) {
		Instructions code3a = new Instructions();
		compile(i.getVariables(), table);
		for (String var : i.getVariables().getVariables()) {
			Quadruplet<Op, Integer, Integer, Integer> quad = new Quadruplet<Op, Integer, Integer, Integer>(
					new READ(var), table.get_variable(var), null, null);
			code3a.add_instruction(quad);
		}
		return code3a;
	}

	/**
	 * Output
	 */
	private Instructions compile(Output o, TableVar table) {
		Instructions code3a = new Instructions();
		// Liste d'instructions de la fonction f
		Quadruplet<Op, Integer, Integer, Integer> quad;

		for (String var : o.getVariables().getVariables()) {
			try {
				quad = new Quadruplet<Op, Integer, Integer, Integer>(new WRITE(var), table.get_variable(var), null,
						null);
				code3a.add_instruction(quad);
			} catch (NullPointerException e) {
				System.err.println(var + " inconnue de la table des variables !");
			}

		}

		return code3a;
	}

	/**
	 * Commands
	 */
	private Instructions compile(Commands c, TableVar table) {
		Instructions code3a = new Instructions();
		// Liste d'instructions de la fonction f
		Quadruplet<Op, Integer, Integer, Integer> quad;
		// code3a.add_instruction(quad);
		for (Command com : c.getCommands()) {
			if (com.getCommand().equals("nop")) {
				quad = new Quadruplet<Op, Integer, Integer, Integer>(new NOP(), null, null, null);
				code3a.add_instruction(quad);
			} else if (com.getCommand().equals("while")) {
				WHILE While = new WHILE(compile(com.getExpr(), table).getValue(), compile(com.getCommands(), table));
				// CONDITION : compile(com.getExpr(), table)
				// BOUCLE : compile(com.getCommands(), table)
				quad = new Quadruplet<Op, Integer, Integer, Integer>(While, null, null, null);
				code3a.add_instruction(quad);
			} else if (com.getCommand().equals("for")) {
				FOR For = new FOR(compile(com.getExpr(), table).getValue(), compile(com.getCommands(), table));
				// CONDITION : compile(com.getExpr(), table)
				// DO : compile(com.getCommands(), table)
				quad = new Quadruplet<Op, Integer, Integer, Integer>(For, null, null, null);
				code3a.add_instruction(quad);
			} else if (com.getCommand().equals("if")) {
				IF If;
				if (com.getCommands_else() == null) {
					Pair<Instructions, Integer> var=compile(com.getExpr(), table);
					code3a.add_instructions(var.getKey());
					If = new IF(var.getValue(), compile(com.getCommands_then(), table));
				} else {
					Pair<Instructions, Integer> var=compile(com.getExpr(), table);
					code3a.add_instructions(var.getKey());
					If = new IF(var.getValue(), compile(com.getCommands_then(), table),
							compile(com.getCommands_else(), table));
				}
				// CONDITION : compile(com.getExpr(), table)
				// THEN : compile(com.getCommands_then(), table)
				// Else : compile(com.getCommands_else(), table)
				// TODO Et si on mettait dans code3a les Instructions
				// encapsulées dans l'opérateur ?
				quad = new Quadruplet<Op, Integer, Integer, Integer>(If, null, null, null);
				code3a.add_instruction(quad);
			} else if (com.getCommand().equals("foreach")) {
				FOREACH Foreach = new FOREACH(compile(com.getExpr(), table).getValue(), compile(com.getExpr_in(), table).getValue(),
						compile(com.getCommands(), table));
				// CONDITION : compile(com.getExpr(), table)
				// IN : compile(com.getExpr_in(), table)
				// THEN : compile(com.getCommands(), table)
				quad = new Quadruplet<Op, Integer, Integer, Integer>(Foreach, null, null, null);
				code3a.add_instruction(quad);
			} else if (com.getCommand().equals(":=")) {
				compile(com.getVariables(), table);

				int numVar = 0;
				for (String var : com.getVariables().getVariables()) {
					// Nécessite de compiler le getExprs ? car besoin de
					// connaitre valeur avant d'affecter ?
					// (exp.getExprsimple1().getExpr()) peut être nil, cons,
					// list... DUR A GERER.
					// Voir même être une fonction ! => récupérer son code
					// via son numéro de fonction, vérifier que le nombre de
					// sorties et d'entrées sont correctes
					int num = 0;
					for (Expr exp : com.getExrps().getExprs()) {
						if (numVar == num) {
							quad = new Quadruplet<Op, Integer, Integer, Integer>(new AFFECT(var),
									table.get_variable(var), table.get_variable((exp.getExprsimple1().getExpr())),
									null);
							code3a.add_instruction(quad);
						}
						num++;
					}
					numVar++;
				}
			} else {
				System.err.println("Commande inconnue, à implémenter : " + com.getCommand());
			}
		}

		return code3a;
	}

	private Pair<Instructions, Integer> compile(Expr expr, TableVar table) {
		Instructions code3a = new Instructions();
		int value;
		table.add_variable("temp"+nb_temp_var);
		value = table.get_variable("temp"+nb_temp_var);
		nb_temp_var++;
		if (expr.getExpr()=="=?") {
			Pair<Instructions, Integer> var1 = compile(expr.getExprsimple1(), table);
			Pair<Instructions, Integer> var2 = compile(expr.getExprsimple2(), table);
			code3a.add_instructions(var1.getKey());
			code3a.add_instructions(var2.getKey());
			Quadruplet<Op, Integer, Integer, Integer> quad;
			quad = new Quadruplet<Op, Integer, Integer, Integer>(new EQUAL(),table.get_variable("temp"+nb_temp_var), var1.getValue(), var2.getValue());
			code3a.add_instruction(quad);
			

		} else {
			if (expr.getExprsimple1() != null) {	
				Pair<Instructions, Integer> var = compile(expr.getExprsimple1(), table);
				code3a.add_instructions(var.getKey());
				
				Quadruplet<Op, Integer, Integer, Integer> quad;
				quad = new Quadruplet<Op, Integer, Integer, Integer>(new AFFECT("temp"+value),value, var.getValue() , null);
				code3a.add_instruction(quad);

			} else if (expr.getExprand() != null) {
				
				Pair<Instructions, Integer> var = compile(expr.getExprand(), table);
				code3a.add_instructions(var.getKey());
				
				Quadruplet<Op, Integer, Integer, Integer> quad;
				quad = new Quadruplet<Op, Integer, Integer, Integer>(new AFFECT("temp"+value),value, var.getValue() , null);
				code3a.add_instruction(quad);

				
			} else
				System.err.println("Expression inconnue, à implémenter : " + expr.getExpr());
		}
		// TODO Itérer sur le deuxieme element afin d'obtenir toutes les
		// variables (ou seulement celle correspondante) en cas d'affectation
		// multiple

		// TODO Gérer les expressions pour retrouver des =?
		// else if (com.getExpr().getExpr()equals("=?")) {
		// quad = new Quadruplet<Op, Integer, Integer, Integer>(new
		// EQUAL(com.getExpr().getExprsimple1().getExpr(),
		// com.getExrps().getExprs().get(0).getExprsimple2().getExpr()), null,
		// null, null);
		// code3a.add_instruction(quad);
		// }
		return new Pair<Instructions, Integer>(code3a, value);
	}

	private Pair<Instructions, Integer> compile(Exprand exprand, TableVar table) {
		Instructions code3a = new Instructions();
		//Quadruplet<Op, Integer, Integer, Integer> quad;
		int value;
		table.add_variable("temp"+nb_temp_var);
		value = table.get_variable("temp"+nb_temp_var);
		nb_temp_var++;
		// TODO

		code3a.add_instruction(
				new Quadruplet<Op, Integer, Integer, Integer>(new BOUCHON("Exprand "), null, null, null));
		return new Pair<Instructions, Integer>(code3a, value);
	}

	private Pair<Instructions, Integer> compile(Exprsimple exprsimple, TableVar table) {
		Instructions code3a = new Instructions();
		//Quadruplet<Op, Integer, Integer, Integer> quad;
		int value;
		table.add_variable("temp"+nb_temp_var);
		value = table.get_variable("temp"+nb_temp_var);
		nb_temp_var++;
		// TODO

		code3a.add_instruction(
				new Quadruplet<Op, Integer, Integer, Integer>(new BOUCHON("Exprsimple "), null, null, null));
		return new Pair<Instructions, Integer>(code3a, value);
	}
	////////////////////////////////////////////////////////////
	////////// Methodes utilitaires

	/**
	 * Donne le nombre d'entrées d'une fonction
	 * 
	 * @param f
	 *            : fonction dont on doit déterminer le nombre d'entrées
	 * @return le nombre d'entrées
	 */
	private int getNbInput(Function f) {
		int nbInput = 0;
		Variables vars = f.getDefinition().getInput().getVariables();
		for (@SuppressWarnings("unused")
		String var : vars.getVariables()) {
			nbInput++;
		}
		return nbInput;
	}

	/**
	 * Donne le nombre de sorties d'une fonction
	 * 
	 * @param f
	 *            : fonction dont on doit déterminer le nombre de sorties
	 * @return le nombre de sorties
	 */
	private int getNbOutput(Function f) {
		int nbOutput = 0;
		Variables vars = f.getDefinition().getOutput().getVariables();
		for (@SuppressWarnings("unused")
		String var : vars.getVariables()) {
			nbOutput++;
		}
		return nbOutput;
	}

}
