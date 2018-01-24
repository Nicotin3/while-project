package production;

import org.xtext.whpp.mydsl.wh.Command;
import org.xtext.whpp.mydsl.wh.Commands;
import org.xtext.whpp.mydsl.wh.Definition;
import org.xtext.whpp.mydsl.wh.Expr;
import org.xtext.whpp.mydsl.wh.Exprand;
import org.xtext.whpp.mydsl.wh.Expreq;
import org.xtext.whpp.mydsl.wh.Exprnot;
import org.xtext.whpp.mydsl.wh.Expror;
import org.xtext.whpp.mydsl.wh.Exprsimple;
import org.xtext.whpp.mydsl.wh.Function;
import org.xtext.whpp.mydsl.wh.Input;
import org.xtext.whpp.mydsl.wh.Model;
import org.xtext.whpp.mydsl.wh.Output;
import org.xtext.whpp.mydsl.wh.Variables;
import javafx.util.Pair;
import structure_interne.AFFECT;
import structure_interne.AND;
import structure_interne.ARG;
import structure_interne.BOUCHON;
import structure_interne.CALL;
import structure_interne.CONS;
import structure_interne.EQUAL;
import structure_interne.FOR;
import structure_interne.FOREACH;
import structure_interne.HD;
import structure_interne.IF;
import structure_interne.LIST;
import structure_interne.NOP;
import structure_interne.NOT;
import structure_interne.OR;
import structure_interne.Op;
import structure_interne.Quadruplet;
import structure_interne.READ;
import structure_interne.SYMB;
import structure_interne.TL;
import structure_interne.WHILE;
import structure_interne.WRITE;
import table_des_symboles.Instructions;
import table_des_symboles.Table;
import table_des_symboles.TableVar;
import java.util.ArrayDeque;
import java.util.Queue;

public class Compiler {
	// Entier utilisé pour les variables temporaires
	private static int nb_temp_var=0;
	// Table des symboles
	Table tableSymbole;

	public Compiler() {
		tableSymbole = new Table();
		tableSymbole.add_function("nil", 0, 0, new TableVar(), new Instructions());
	}

	public Table getTable() {
		return tableSymbole;
	}

	/* __________________________Méthodes compile__________________________ */

	/**
	 * Model
	 */
	public void compile(Model m) {
		for (Function f : m.getFunctions()) {
			compile(f);
		}
	}

	/**
	 * Function
	 */
	private void compile(Function f) {
		// Table des variables internes à la fonction
		TableVar tableVar = new TableVar();
		// Liste d'instructions en code 3 adresses
		Instructions code3a = new Instructions();
		// Appel des méthodes compile sous jacentes à Function
		code3a.add_instructions(compile(f.getDefinition(), tableVar));
		// Ajout de la fonction et son code associé dans la table des fonctions
		tableSymbole.add_function(f.getName(), getNbInput(f), getNbOutput(f), tableVar, code3a);
	}

	/**
	 * Definition
	 */
	private Instructions compile(Definition d, TableVar table) {
		// Liste d'instructions
		Instructions code3a = new Instructions();

		// Appel des méthodes compile sous jacentes
		code3a.add_instructions(compile(d.getInput(), table));
		code3a.add_instructions(compile(d.getCommands(), table));
		code3a.add_instructions(compile(d.getOutput(), table));

		return code3a;
	}

	/**
	 * Variables
	 */
	private void compile(Variables v, TableVar table) {
		// Les nouvelles variables valent nil à leur déclaration.

		// Si les variables ne sont pas dans la table, les ajoutent et leur
		// attribuent une place unique. Sinon rien.
		for (String var : v.getVariables()) {
			table.add_variable(var);
		}
	}

	/**
	 * Input
	 */
	private Instructions compile(Input i, TableVar table) {
		Instructions code3a = new Instructions();
		// Parcours des input et ajout dans la table des variables
		compile(i.getVariables(), table);
		Quadruplet<Op, Integer, Integer, Integer> quad;
		// Génération du code 3 adresse <READ,numVar,_,_>
		for (String var : i.getVariables().getVariables()) {
			quad = new Quadruplet<Op, Integer, Integer, Integer>(
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
		Quadruplet<Op, Integer, Integer, Integer> quad;
		// Parcours des output et vérification de la présence dans la
		// table des variables. Puis génération code <WRITE,numVar,_,_>
		for (String var : o.getVariables().getVariables()) {
			if (table.get_variable(var) != null) {
				quad = new Quadruplet<Op, Integer, Integer, Integer>(
						new WRITE(var), null, table.get_variable(var), null);
				code3a.add_instruction(quad);
			} else {
				System.err.println("L'output " + var + " est inconnue de la table des variables ! Remplacée par nil\n");
				int value = newTemp(table);
				code3a.add_instruction(new Quadruplet<Op, Integer, Integer, Integer>(
						new SYMB(tableSymbole.get_function("nil").getElement1()), value, null, null));
				quad = new Quadruplet<Op, Integer, Integer, Integer>(new WRITE(var), null, value, null);
				code3a.add_instruction(quad);
			}
		}
		return code3a;
	}

	/**
	 * Commands
	 */
	private Instructions compile(Commands c, TableVar table) {
		Instructions code3a = new Instructions();
		Quadruplet<Op, Integer, Integer, Integer> quad;
		// Parcours des commandes pour génération code 3 adresse associé.
		for (Command com : c.getCommands()) {
			if (com.getCommand().equals("nop")) {
				quad = new Quadruplet<Op, Integer, Integer, Integer>(new NOP(), null, null, null);
				code3a.add_instruction(quad);
			} else if (com.getCommand().equals("while")) {
				// CONDITION : compile(com.getExpr(), table)
				// BOUCLE : compile(com.getCommands(), table)
				Pair<Instructions, Integer> var = compile(com.getExpr(), table);
				WHILE While = new WHILE(var.getKey(), compile(com.getCommands(), table));
				quad = new Quadruplet<Op, Integer, Integer, Integer>(While, null, var.getValue(), null);
				code3a.add_instruction(quad);
			} else if (com.getCommand().equals("for")) {
				// CONDITION : compile(com.getExpr(), table)
				// DO : compile(com.getCommands(), table)
				Pair<Instructions, Integer> var = compile(com.getExpr(), table);
				FOR For = new FOR(var.getKey(), compile(com.getCommands(), table));
				quad = new Quadruplet<Op, Integer, Integer, Integer>(For, null, var.getValue(), null);
				code3a.add_instruction(quad);
			} else if (com.getCommand().equals("if")) {
				// CONDITION : compile(com.getExpr(), table)
				// THEN : compile(com.getCommands_then(), table)
				// Else : compile(com.getCommands_else(), table)
				IF If;
				Pair<Instructions, Integer> var=compile(com.getExpr(), table);
				// Vérification de la présence du champs Else
				if (com.getCommands_else() == null) {
					
					If = new IF(var.getKey(), compile(com.getCommands_then(), table));
				} else {
					If = new IF(var.getKey(), compile(com.getCommands_then(), table),compile(com.getCommands_else(), table));
				}
				quad = new Quadruplet<Op, Integer, Integer, Integer>(If, null, var.getValue(), null);
				code3a.add_instruction(quad);
				
			} else if (com.getCommand().equals("foreach")) {
				// CONDITION : compile(com.getExpr(), table)
				// IN : compile(com.getExpr_in(), table)
				// THEN : compile(com.getCommands(), table)
				Pair<Instructions, Integer> var = compile(com.getExpr(), table);
				Pair<Instructions, Integer> var_in = compile(com.getExpr_in(), table);
				FOREACH Foreach = new FOREACH(var.getKey(), var_in.getKey(), compile(com.getCommands(), table));
				quad = new Quadruplet<Op, Integer, Integer, Integer>(Foreach, null, var.getValue(), var_in.getValue());
				code3a.add_instruction(quad);
			} else if (com.getCommand().equals(":=")) {
				// Ajout des nouvelles variables déclarées dans la table des variables
				compile(com.getVariables(), table);
				
//				Vérification de la taille des listes de variables et d'expression
				if (com.getExrps().getExprs().size() == 1 || com.getVariables().getVariables().size() == 1) {
					Pair<Instructions, Integer> var =compile(com.getExrps().getExprs().get(0), table);
					quad = new Quadruplet<Op, Integer, Integer, Integer>(
							new AFFECT(com.getVariables().getVariables().get(0)),
							table.get_variable(com.getVariables().getVariables().get(0)),
							var.getValue(), null);
					code3a.add_instructions(var.getKey());
					code3a.add_instruction(quad);
				}
				else {
					Queue<Integer> file = new ArrayDeque<Integer>();
					for (Expr exp : com.getExrps().getExprs()) {
						Pair<Instructions, Integer> var = compile(exp, table);
						code3a.add_instructions(var.getKey());
						table.add_variable("temp"+nb_temp_var);
						int value = table.get_variable("temp"+nb_temp_var);
						file.add(value);
						quad = new Quadruplet<Op, Integer, Integer, Integer>(new AFFECT("temp"+nb_temp_var),
								value, var.getValue(), null);
						code3a.add_instruction(quad);
						nb_temp_var++;
					}
					
					for (String var : com.getVariables().getVariables()) {
						quad = new Quadruplet<Op, Integer, Integer, Integer>(new AFFECT(var),
								table.get_variable(var), file.remove(), null);
						code3a.add_instruction(quad);
					}
				}
			} else {
				System.err.println("Commande inconnue, à implémenter : " + com.getCommand());
			}
		}

		return code3a;
	}

	private Pair<Instructions, Integer> compile(Expr expr, TableVar table) {
		Instructions code3a = new Instructions();
		
		if (expr.getExpr() == "=?") {
			
			Quadruplet<Op, Integer, Integer, Integer> quad;
			int value = newTemp(table);
			Pair<Instructions, Integer> var1 = compile(expr.getExprsimple1(), table);
			Pair<Instructions, Integer> var2 = compile(expr.getExprsimple2(), table);
			code3a.add_instructions(var1.getKey());
			code3a.add_instructions(var2.getKey());
			quad = new Quadruplet<Op, Integer, Integer, Integer>(new EQUAL(), value,
					var1.getValue(), var2.getValue());
			code3a.add_instruction(quad);
			return new Pair<Instructions, Integer>(code3a, value); 
		} else {
			if (expr.getExprsimple1() != null) {
				Pair<Instructions, Integer> var = compile(expr.getExprsimple1(), table);
				code3a.add_instructions(var.getKey());
				return new Pair<Instructions, Integer>(code3a, var.getValue());

			} else if (expr.getExprand() != null) {
				Pair<Instructions, Integer> var = compile(expr.getExprand(), table);
				code3a.add_instructions(var.getKey());
				return new Pair<Instructions, Integer>(code3a, var.getValue());

			} else {
				System.err.println("Expression inconnue, à implémenter : " + expr.getExpr());
				return new Pair<Instructions, Integer>(null, null);
			}
		}
	}
	
	private Pair<Instructions, Integer> compile(Exprsimple exprsimple, TableVar table) {
		Instructions code3a = new Instructions();
		
//			On tombe sur un "nil"
		if (exprsimple.getExpr().equals("nil")) {
			int value = newTemp(table);
			code3a.add_instruction(new Quadruplet<Op, Integer, Integer, Integer>(
					new SYMB(tableSymbole.get_function("nil").getElement1()), value, null, null));
			return new Pair<Instructions, Integer>(code3a, value);

//			On tombe sur un cons
//			Cons et list ne fonctionnent qu'avec 2 variables. Possibilité de changer !
		} else if (exprsimple.getExpr().equals("cons")) {
			Quadruplet<Op, Integer, Integer, Integer> quad;
			Expr gauche = exprsimple.getExprs().getExprs().get(0);
			Expr droite = exprsimple.getExprs().getExprs().get(1);
			Pair<Instructions, Integer> var1 = compile(gauche, table);
			Pair<Instructions, Integer> var2 = compile(droite, table);
			code3a.add_instructions(var1.getKey());
			code3a.add_instructions(var2.getKey());
			
			int value = newTemp(table);
			quad = new Quadruplet<Op, Integer, Integer, Integer>(new CONS(), value, var1.getValue(),
					var2.getValue());
			code3a.add_instruction(quad);
			return new Pair<Instructions, Integer>(code3a, value);
			
//			On tombe sur un list
		} else if (exprsimple.getExpr().equals("list")) {
			Quadruplet<Op, Integer, Integer, Integer> quad;
			Expr gauche = exprsimple.getExprs().getExprs().get(0);
			Expr droite = exprsimple.getExprs().getExprs().get(1);
			Pair<Instructions, Integer> var1 = compile(gauche, table);
			Pair<Instructions, Integer> var2 = compile(droite, table);
			code3a.add_instructions(var1.getKey());
			code3a.add_instructions(var2.getKey());
			
			int value = newTemp(table);
			quad = new Quadruplet<Op, Integer, Integer, Integer>(new LIST(), value, var1.getValue(),
					var2.getValue());
			code3a.add_instruction(quad);
			return new Pair<Instructions, Integer>(code3a, value);
			
//			On tombe sur un hd
		} else if (exprsimple.getExpr().equals("hd")) {
			Pair<Instructions, Integer> var = compile(exprsimple.getExpr2(), table);
			code3a.add_instructions(var.getKey());
			int value = newTemp(table);
			Quadruplet<Op, Integer, Integer, Integer> quad;
			quad = new Quadruplet<Op, Integer, Integer, Integer>(new HD(), value, var.getValue(), null);
			code3a.add_instruction(quad);
			return new Pair<Instructions, Integer>(code3a, value);

//			On tombe sur un tl
		} else if (exprsimple.getExpr().equals("tl")) {
			Pair<Instructions, Integer> var = compile(exprsimple.getExpr2(), table);
			code3a.add_instructions(var.getKey());
			int value = newTemp(table);
			Quadruplet<Op, Integer, Integer, Integer> quad;
			quad = new Quadruplet<Op, Integer, Integer, Integer>(new TL(), value, var.getValue(), null);
			code3a.add_instruction(quad);
			return new Pair<Instructions, Integer>(code3a, value);
			
//			On tombe sur une variable
		} else if (Character.isUpperCase((exprsimple.getExpr().charAt(0)))){
			if (table.get_variable(exprsimple.getExpr()) == null) {
				System.err.println("La variable "+ exprsimple.getExpr() +" est inconnue ! Initialisée à nil.");
				table.add_variable(exprsimple.getExpr());
				int value = table.get_variable(exprsimple.getExpr());
				code3a.add_instruction(new Quadruplet<Op, Integer, Integer, Integer>(
						new SYMB(tableSymbole.get_function("nil").getElement1()), value, null, null));
			}
			return new Pair<Instructions, Integer>(code3a, table.get_variable(exprsimple.getExpr()));
			
//			On tombe sur une fonction OU un symbole
		} else if (Character.isLowerCase((exprsimple.getExpr().charAt(0)))){
			String name = exprsimple.getExpr();
			if (tableSymbole.get_function(name) == null) {
				System.err.println("Fonction/Symbole inconnue de la table des symboles !");
				return new Pair<Instructions, Integer>(code3a, -1);
			}
			if (tableSymbole.get_function(name).getElement2() == 0) {
//				C'est un symbole
				int value = newTemp(table);
				code3a.add_instruction(new Quadruplet<Op, Integer, Integer, Integer>(
						new SYMB(tableSymbole.get_function(name).getElement1()), value, null, null));
				return new Pair<Instructions, Integer>(code3a, value);
			}
			else {
//				 C'est une fonction
				System.err.println(exprsimple.getExprs());
				if (tableSymbole.get_function(name).getElement2() != exprsimple.getExprs().getExprs().size()) {
					System.err.println("Nombre d'arguments incorrects ! Expected : "
							+ tableSymbole.get_function(name).getElement2().toString() + ". Given : "
							+ exprsimple.getExprs().getExprs().size());
					return new Pair<Instructions, Integer>(code3a, -1);
				}

				int value = newTemp(table);
				//Verifier nombre de sorties de la fonction, si pas assez combler avec nil, si trop ignorer
				for (Expr arg : exprsimple.getExprs().getExprs()) {
					code3a.add_instruction(new Quadruplet<Op, Integer, Integer, Integer>(new ARG(), null, compile(arg, table).getValue(), null));
				}
				code3a.add_instruction(new Quadruplet<Op, Integer, Integer, Integer>(new CALL(tableSymbole.get_function(name).getElement1()), value, null, null));
				return new Pair<Instructions, Integer>(code3a, value);
			}
			
			
			
			
		} else {
			Quadruplet<Op, Integer, Integer, Integer> quad = new Quadruplet<Op, Integer, Integer, Integer>(new BOUCHON("Exprsimple"), null, null, null);
			code3a.add_instruction(quad);
			System.err.println("Expression inconnue : " + exprsimple.getExpr());
			return new Pair<Instructions, Integer>(code3a, 0);
		}
		
	}

	private Pair<Instructions, Integer> compile(Exprand exprand, TableVar table) {
		Instructions code3a = new Instructions();
		
		if (exprand.getExpr() == "and") {
			int value = newTemp(table);
			Quadruplet<Op, Integer, Integer, Integer> quad;
			Pair<Instructions, Integer> var1 = compile(exprand.getExprG(), table);
			Pair<Instructions, Integer> var2 = compile(exprand.getExprD(), table);
			code3a.add_instructions(var1.getKey());
			code3a.add_instructions(var2.getKey());
			quad = new Quadruplet<Op,Integer, Integer, Integer>(new AND(), value, var1.getValue(), var2.getValue());
			code3a.add_instruction(quad);
			return new Pair<Instructions, Integer>(code3a, value);

		} else {
			Pair<Instructions, Integer> var1 = compile(exprand.getExprG(), table);
			code3a.add_instructions(var1.getKey());
			return new Pair<Instructions, Integer>(code3a, var1.getValue());
		}

	}

	private Pair<Instructions, Integer> compile(Expror expror, TableVar table) {
		Instructions code3a = new Instructions();
		if (expror.getExpr() == "or") {
			int value = newTemp(table);
			Quadruplet<Op, Integer, Integer, Integer> quad;
			Pair<Instructions, Integer> var1 = compile(expror.getExprG(), table);
			Pair<Instructions, Integer> var2 = compile(expror.getExprD(), table);
			code3a.add_instructions(var1.getKey());
			code3a.add_instructions(var2.getKey());
			quad = new Quadruplet<Op,Integer, Integer, Integer>(new OR(), value, var1.getValue(), var2.getValue());
			code3a.add_instruction(quad);
			return new Pair<Instructions, Integer>(code3a, value);

		} else {
			Pair<Instructions, Integer> var1 = compile(expror.getExprG(), table);
			code3a.add_instructions(var1.getKey());
			return new Pair<Instructions, Integer>(code3a, var1.getValue());
		}
	}
	
	
	
	private Pair<Instructions, Integer> compile(Exprnot exprnot, TableVar table) {
		Instructions code3a = new Instructions();
		
		if (exprnot.getExpr() == "not") {
			int value = newTemp(table);
			Quadruplet<Op, Integer, Integer, Integer> quad;
			Pair<Instructions, Integer> var1 = compile(exprnot.getExpr2(), table);
			code3a.add_instructions(var1.getKey());
			quad = new Quadruplet<Op,Integer, Integer, Integer>(new NOT(), value, var1.getValue(), null);
			code3a.add_instruction(quad);
			return new Pair<Instructions, Integer>(code3a, value);

		} else {
			Pair<Instructions, Integer> var1 = compile(exprnot.getExpr2(), table);
			code3a.add_instructions(var1.getKey());
			return new Pair<Instructions, Integer>(code3a, var1.getValue());
		}
	}
	
	

	private Pair<Instructions, Integer> compile(Expreq expr, TableVar table) {
		Instructions code3a = new Instructions();
		Pair<Instructions, Integer> var1 = compile(expr.getExpr(), table);
		code3a.add_instructions(var1.getKey());
		return new Pair<Instructions, Integer>(code3a, var1.getValue());
		
	}

	
	
	
	
	
	
	/* ________________________Méthodes utilitaires________________________ */

	

	

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
	
	/**
	 * Ajoute une nouvelle variable temporaire dans la table des variables
	 * @param table : la table des variables
	 * @return le numéro correspondant à la variable temporaire
	 */
	private int newTemp(TableVar table) {
		table.add_variable("temp" + nb_temp_var);
		int value = table.get_variable("temp" + nb_temp_var);
		nb_temp_var++;
		return value;
	}
}
