package production;

import org.xtext.whpp.mydsl.wh.Command;
import org.xtext.whpp.mydsl.wh.Commands;
import org.xtext.whpp.mydsl.wh.Definition;
import org.xtext.whpp.mydsl.wh.Function;
import org.xtext.whpp.mydsl.wh.Input;
import org.xtext.whpp.mydsl.wh.Model;
import org.xtext.whpp.mydsl.wh.Output;
import org.xtext.whpp.mydsl.wh.Variables;

import structure_interne.Op;
import structure_interne.Quadruplet;
import table_des_symboles.Instructions;
import table_des_symboles.Table;
import table_des_symboles.TableVar;

public class Compiler {

//	Exemple d'instanciation de Quadruplet :
//	Quadruplet<Op, String, String, String> quad = new Quadruplet<Op, String, String, String>(new Op(""), "", "", "");
	
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
//		Liste d'instructions de la fonction f
		Quadruplet<Op, String, String, String> quad = new Quadruplet<Op, String, String, String>(new Op("Bouchon fonction"), "", "", "");
		
//		Ajout de la liste d'instructions dans l'instance d'Instructions correspondante à f
		code3a.add_instruction(quad);
		
//		Ajout des variables dans la table des variables
		
		code3a.add_instructions(compile(f.getDefinition(), tableVar));
		
		tableFonctions.add_function(f.getName(), getNbInput(f), getNbOutput(f), tableVar, code3a); 
	}
	
	/**
	 * Definition
	 */
	private Instructions compile(Definition d, TableVar table) {
		Instructions code3a = new Instructions();
//		Liste d'instructions de la fonction f
		Quadruplet<Op, String, String, String> quad = new Quadruplet<Op, String, String, String>(new Op("Bouchon Definition"), "", "", "");
//		Ajout dans la liste d'instructions
		code3a.add_instruction(quad);
		
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
		Quadruplet<Op, String, String, String> quad = new Quadruplet<Op, String, String, String>(new Op("Bouchon Variables"), "", "", "");
		code3a.add_instruction(quad);
//		Evaluer la Variable pour les conditions ? (si_vrai, si_faux)

//		Les nouvelles variables valent nil à leur déclaration.
		
		return code3a;
	}
	
	/**
	 * Input
	 */
	private Instructions compile(Input i, TableVar table) {
		Instructions code3a = new Instructions();
		Quadruplet<Op, String, String, String> quad;
		int j =0;
		for (String var : i.getVariables().getVariables()){
			table.add_variable(var, j);
			j++;
			quad = new Quadruplet<Op, String, String, String>(new Op("Bouchon Input"), var, table.get_variable(var).toString(), "");
			code3a.add_instruction(quad);
		}
		
		return code3a;
	}
	
	/**
	 * Output
	 */
	private Instructions compile(Output o, TableVar table) {
		Instructions code3a = new Instructions();
//		Liste d'instructions de la fonction f
		Quadruplet<Op, String, String, String> quad;

		for (String var : o.getVariables().getVariables()){
			try {
				quad = new Quadruplet<Op, String, String, String>(new Op("write "+var), table.get_variable(var).toString(), "", "");
				code3a.add_instruction(quad);
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
		Quadruplet<Op, String, String, String> quad = new Quadruplet<Op, String, String, String>(new Op("Bouchon Commands"), "", "", "");
		code3a.add_instruction(quad);
		for (Command com : c.getCommands()) {
			if (com.getCommand().equals("nop")) {
				quad = new Quadruplet<Op, String, String, String>(new Op("nop"), "", "", "");
				code3a.add_instruction(quad);
			}
			else if (com.getCommand().equals(":=")) {
				for (String var : com.getVariables().getVariables()) {
					table.add_variable(var, 12);
					//Nécessite de compiler le getExprs ? car besoin de connaitre valeur avant d'affecter ?
					quad = new Quadruplet<Op, String, String, String>(new Op(":="), var,"" , "");
					code3a.add_instruction(quad);
				}

			}
			else if (com.getCommand().equals("while")) {
				quad = new Quadruplet<Op, String, String, String>(new Op("Bouchon while"), "", "", "");
				code3a.add_instruction(quad);
			}
			else if (com.getCommand().equals("for")) {
//				CONDITION : compile(com.getExpr(), table)
//				DO : compile(com.getCommands(), table)
				quad = new Quadruplet<Op, String, String, String>(new Op("Bouchon for"), "", "", "");
				code3a.add_instruction(quad);
			}
			else if (com.getCommand().equals("if")) {
//				CONDITION : compile(com.getExpr(), table)
//				THEN : compile(com.getCommands_then(), table)
//				Else : compile(com.getCommands_else(), table)
				
				quad = new Quadruplet<Op, String, String, String>(new Op("Bouchon if"), "", "", "");
				code3a.add_instruction(quad);
			}
			else if (com.getCommand().equals("foreach")) {
//				CONDITION : compile(com.getExpr(), table)
//				IN : compile(com.getExpr_in(), table)
//				THEN : compile(com.getCommands(), table)
				quad = new Quadruplet<Op, String, String, String>(new Op("Bouchon foreach"), "", "", "");
				code3a.add_instruction(quad);
			}
			else {
				quad = new Quadruplet<Op, String, String, String>(new Op("Bouchon autre commande"), "", "", "");
				code3a.add_instruction(quad);
			}
		}
		
		return code3a;
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
