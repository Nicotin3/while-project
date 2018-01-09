package production;

import org.xtext.whpp.mydsl.wh.Command;
import org.xtext.whpp.mydsl.wh.Commands;
import org.xtext.whpp.mydsl.wh.Definition;
import org.xtext.whpp.mydsl.wh.Expr;
import org.xtext.whpp.mydsl.wh.Function;
import org.xtext.whpp.mydsl.wh.Input;
import org.xtext.whpp.mydsl.wh.Model;
import org.xtext.whpp.mydsl.wh.Output;
import org.xtext.whpp.mydsl.wh.Variables;

import structure_interne.FOR;
import structure_interne.FOREACH;
import structure_interne.IF;
import structure_interne.NOP;
import structure_interne.Op;
import structure_interne.Quadruplet;
import structure_interne.WHILE;
import table_des_symboles.Instructions;
import table_des_symboles.Table;
import table_des_symboles.TableVar;

public class Compiler {

//	Exemple d'instanciation de Quadruplet :
//	Quadruplet<Op, Integer, Integer, Integer> quad = new Quadruplet<Op, Integer, Integer, Integer>(new Op(""), null, null, null);
	
//	Table globale qui doit être correctement instanciée
	Table tableFonctions;
	
	public Compiler() {
		tableFonctions = new Table();
	}
	
	public Table getTable() {
		return tableFonctions;
	}

	
/* __________________________Méthodes compile__________________________*/
	
	/**
	 * Model
	 */
	public void compile(Model m) {
		for (Function f : m.getFunctions()) {
			compile(f);
//			Peut-être mieux de le faire ici, pour donner une clé aux fontions plutot que leurs nom auquel cas
//			virer l'ajout de la tableFonction dans le compile(Fonction). Mais nécessiterais de récupérer tableVar et List d'instr.
//			tableFonctions.add_function(name, nb_in, nb_out);
		}
	}
	
	/**
	 * Function
	 */
	private void compile(Function f) {
		TableVar tableVar = new TableVar();
		Instructions code3a = new Instructions();
//		Liste d'instructions
//		Quadruplet<Op, Integer, Integer, Integer> quad = new Quadruplet<Op, Integer, Integer, Integer>(new Op("Bouchon fonction"), null, null, null);
		
//		Ajout de la liste d'instructions dans l'instance d'Instructions correspondante à f
//		code3a.add_instruction(quad);
		
//		Ajout des variables dans la table des variables
		
		code3a.add_instructions(compile(f.getDefinition(), tableVar));
		
		tableFonctions.add_function(f.getName(), getNbInput(f), getNbOutput(f), tableVar, code3a);
	}
	
	/**
	 * Definition
	 */
	private Instructions compile(Definition d, TableVar table) {
		Instructions code3a = new Instructions();
//		Liste d'instructions
//		Quadruplet<Op, Integer, Integer, Integer> quad = new Quadruplet<Op, Integer, Integer, Integer>(new Op("Bouchon Definition"), null, null, null);
//		Ajout dans la liste d'instructions
//		code3a.add_instruction(quad);
		
		code3a.add_instructions(compile(d.getInput(), table));
		
		code3a.add_instructions(compile(d.getCommands(), table));
		
		code3a.add_instructions(compile(d.getOutput(), table));

		return code3a;
	}
	
	/**
	 * Variables
	 */
	private Instructions compile(Variables v, TableVar table) {
		Instructions code3a = new Instructions();
//		Liste d'instructions de la fonction f
//		Quadruplet<Op, Integer, Integer, Integer> quad = new Quadruplet<Op, Integer, Integer, Integer>(new Op("Bouchon Variables"), null, null, null);
//		code3a.add_instruction(quad);
//		Evaluer la Variable pour les conditions ? (si_vrai, si_faux)

//		Les nouvelles variables valent nil à leur déclaration.
		
		return code3a;
	}
	
	/**
	 * Input
	 */
	private Instructions compile(Input i, TableVar table) {
		Instructions code3a = new Instructions();
		Quadruplet<Op, Integer, Integer, Integer> quad;
		for (String var : i.getVariables().getVariables()){
			table.add_variable(var);
//			quad = new Quadruplet<Op, Integer, Integer, Integer>(new Op("write "), var, table.get_variable(var), null);
//			code3a.add_instruction(quad);
		}
		
		return code3a;
	}
	
	/**
	 * Output
	 */
	private Instructions compile(Output o, TableVar table) {
		Instructions code3a = new Instructions();
//		Liste d'instructions de la fonction f
		Quadruplet<Op, Integer, Integer, Integer> quad;

		for (String var : o.getVariables().getVariables()){
			try {
//				quad = new Quadruplet<Op, Integer, Integer, Integer>(new Op("write "+var), table.get_variable(var), null, null);
//				code3a.add_instruction(quad);
			} catch (NullPointerException e) {
				System.err.println("Output inconnue de la table des variables !");
			}
			
		}
		
		return code3a;
	}
	
	/**
	 * Commands
	 */
	private Instructions compile(Commands c, TableVar table) {
		Instructions code3a = new Instructions();
//		Liste d'instructions de la fonction f
		Quadruplet<Op, Integer, Integer, Integer> quad; // = new Quadruplet<Op, Integer, Integer, Integer>(new Op("Bouchon Commands"), null, null, null);
//		code3a.add_instruction(quad);
		for (Command com : c.getCommands()) {
			if (com.getCommand().equals("nop")) {
				NOP nop = new NOP();
				quad = new Quadruplet<Op, Integer, Integer, Integer>(nop, null, null, null);
				code3a.add_instruction(quad);
			}
			else if (com.getCommand().equals("while")) {
				WHILE While = new WHILE(compile(com.getExpr(), table), compile(com.getCommands(), table));
//				CONDITION : compile(com.getExpr(), table)
//				BOUCLE : 	compile(com.getCommands(), table)
				quad = new Quadruplet<Op, Integer, Integer, Integer>(While, null, null, null);
				code3a.add_instruction(quad);
			}
			else if (com.getCommand().equals("for")) {
				FOR For = new FOR(compile(com.getExpr(), table), compile(com.getCommands(), table));
//				CONDITION : compile(com.getExpr(), table)
//				DO : 		compile(com.getCommands(), table)
				quad = new Quadruplet<Op, Integer, Integer, Integer>(For, null, null, null);
				code3a.add_instruction(quad);
			}
			else if (com.getCommand().equals("if")) {
				IF If = new IF(compile(com.getExpr(), table), compile(com.getCommands_then(), table), compile(com.getCommands_else(), table));
//				CONDITION : compile(com.getExpr(), table)
//				THEN : 		compile(com.getCommands_then(), table)
//				Else : 		compile(com.getCommands_else(), table)
				
				quad = new Quadruplet<Op, Integer, Integer, Integer>(If, null, null, null);
				code3a.add_instruction(quad);
			}
			else if (com.getCommand().equals("foreach")) {
				FOREACH Foreach = new FOREACH(compile(com.getExpr(), table), compile(com.getExpr_in(), table), compile(com.getCommands(), table));
//				CONDITION : compile(com.getExpr(), table)
//				IN : 		compile(com.getExpr_in(), table)
//				THEN : 		compile(com.getCommands(), table)
				quad = new Quadruplet<Op, Integer, Integer, Integer>(Foreach, null, null, null);
				code3a.add_instruction(quad);
			}
//			else if (com.getCommand().equals(":=")) {
//			for (String var : com.getVariables().getVariables()) {
//				table.add_variable(var);
//				//Nécessite de compiler le getExprs ? car besoin de connaitre valeur avant d'affecter ?
//				quad = new Quadruplet<Op, Integer, Integer, Integer>(new Op(":="), var, null, null);
//				code3a.add_instruction(quad);
//			}
//		}
			else {
//				quad = new Quadruplet<Op, Integer, Integer, Integer>(new Op("Bouchon autre commande"), null, null, null);
//				code3a.add_instruction(quad);
				System.err.println("Commande inconnue, à implémenter : " + com.getCommand());
			}
		}
		
		return code3a;
	}
	
	private Instructions compile(Expr expr, TableVar table) {
		return null;
	}
	
////////////////////////////////////////////////////////////
////////// Methodes utilitaires


	/**
	 * Donne le nombre d'entrées d'une fonction
	 * @param f : fonction dont on doit déterminer le nombre d'entrées
	 * @return le nombre d'entrées
	 */
	private int getNbInput (Function f) {
		int nbInput = 0;
		Variables vars = f.getDefinition().getInput().getVariables();
		for (@SuppressWarnings("unused") String var : vars.getVariables()) {
			nbInput++;
		}
		return nbInput;
	}
	
	/**
	 * Donne le nombre de sorties d'une fonction
	 * @param f : fonction dont on doit déterminer le nombre de sorties
	 * @return le nombre de sorties
	 */
	private int getNbOutput (Function f) {
		int nbOutput = 0;
		Variables vars = f.getDefinition().getOutput().getVariables();
		for (@SuppressWarnings("unused") String var : vars.getVariables()) {
			nbOutput++;
		}
		return nbOutput;
	}
	
}
