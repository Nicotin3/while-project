package production;

import java.util.*;
import org.xtext.whpp.mydsl.wh.Definition;
import org.xtext.whpp.mydsl.wh.Function;
import org.xtext.whpp.mydsl.wh.Input;
import org.xtext.whpp.mydsl.wh.Model;
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
		TableVar tablef = new TableVar();
		Instructions code3a = new Instructions();
//		Liste d'instructions de la fonction f
		Quadruplet<String, String, String, String> quad = new Quadruplet<String, String, String, String>("Bouchon", "", "", "");
		
//		Ajout de la liste d'instructions dans l'instance d'Instructions correspondante à f
		code3a.add_instruction(quad);
		
//		Ajout des variables dans la table des variables
		
//		compile(f.getDefinition()); doit apparaitre à un moment. Récupérer tableVar 

//		tableFonctions.add_function("clé de f"(ou f.getName() dans un premier temps), nb_in, nb_out, tablef, code3a);
		
	}
	
}
