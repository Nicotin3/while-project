package production;

import java.util.*;

import org.xtext.whpp.mydsl.wh.Command;
import org.xtext.whpp.mydsl.wh.Commands;
import org.xtext.whpp.mydsl.wh.Definition;
import org.xtext.whpp.mydsl.wh.Function;
import org.xtext.whpp.mydsl.wh.Input;
import org.xtext.whpp.mydsl.wh.Model;
import org.xtext.whpp.mydsl.wh.Output;
import org.xtext.whpp.mydsl.wh.Variables;
import org.eclipse.emf.common.util.EList;
import structure_interne.Quadruplet;
import table_des_symboles.Instructions;
import table_des_symboles.Table;
import table_des_symboles.TableVar;

public class Compiler {

//	Exemple d'instanciation de Quadruplet :
//	Quadruplet<String, String, String, String> quad = new Quadruplet<String, String, String, String>("", "", "", "");
	
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
		Quadruplet<String, String, String, String> quad = new Quadruplet<String, String, String, String>("Bouchon Function", "", "", "");
		
//		Ajout de la liste d'instructions dans l'instance d'Instructions correspondante à f
		code3a.add_instruction(quad);
		
//		Ajout des variables dans la table des variables
		
		code3a.add_instructions(compile(f.getDefinition(), tableVar)); //Récupérer tableVar
		
		tableFonctions.add_function(f.getName(), 0, 0, tableVar, code3a); //A incrémenter à chaque fois qu'on tombe sur une Input/Output
		
	}
	
	private Instructions compile(Definition d, TableVar table) {
		Instructions code3a = new Instructions();
//		Liste d'instructions de la fonction f
		Quadruplet<String, String, String, String> quad = new Quadruplet<String, String, String, String>("Bouchon Definition", "", "", "");
//		Ajout dans la liste d'instructions
		code3a.add_instruction(quad);
		
		code3a.add_instructions(compile(d.getInput(), table));
		
		code3a.add_instructions(compile(d.getCommands(), table));
		
		code3a.add_instructions(compile(d.getOutput(), table));

		return code3a;
	}
	
	private Instructions compile(Input i, TableVar table) {
		Instructions code3a = new Instructions();
//		Liste d'instructions de la fonction f
		Quadruplet<String, String, String, String> quad = new Quadruplet<String, String, String, String>("Bouchon Input", "", "", "");
		int j =0;
		for (String var : i.getVariables().getVariables()){
			table.add_variable(var, j);
			j++;
		}
//		Ajout de la liste d'instructions dans l'instance d'Instructions correspondante à f
		code3a.add_instruction(quad);
		
		return code3a;
	}
	
	private Instructions compile(Output o, TableVar table) {
		Instructions code3a = new Instructions();
//		Liste d'instructions de la fonction f
		Quadruplet<String, String, String, String> quad = new Quadruplet<String, String, String, String>("Bouchon Output", "", "", "");

		for (String var : o.getVariables().getVariables()){
			quad = new Quadruplet<String, String, String, String>("write", table.get_variable(var).toString(), "", "");
			code3a.add_instruction(quad);
		}
		
		return code3a;
	}
	
	private Instructions compile(Commands c, TableVar table) {
		Instructions code3a = new Instructions();
//		Liste d'instructions de la fonction f
		Quadruplet<String, String, String, String> quad = new Quadruplet<String, String, String, String>("Bouchon Commands", "", "", "");
		code3a.add_instruction(quad);
		for (Command com : c.getCommands()) {
			if (com.getCommand().equals("nop")) {
				quad = new Quadruplet<String, String, String, String>("nop", "", "", "");
				code3a.add_instruction(quad);
			}
			else {
				quad = new Quadruplet<String, String, String, String>("Bouchon autre commande", "", "", "");
				code3a.add_instruction(quad);
			}
		}
		
		return code3a;
	}
}
