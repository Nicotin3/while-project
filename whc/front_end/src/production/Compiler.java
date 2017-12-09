package production;

import java.util.*;
import org.xtext.whpp.mydsl.wh.Definition;
import org.xtext.whpp.mydsl.wh.Function;
import org.xtext.whpp.mydsl.wh.Input;
import org.xtext.whpp.mydsl.wh.Model;
import org.eclipse.emf.common.util.EList;

import structure_interne.Quadruplet;
import table_des_symboles.Table;
import table_des_symboles.TableVar;

public class Compiler {

//	Exemple d'instanciation de Quadruplet :
//	Quadruplet<String, String, String, String> quad = new Quadruplet<String, String, String, String>("", "", "", "");
	
//	Liste d'instructions
	List<Quadruplet<String, String, String, String>> instructions = new ArrayList<Quadruplet<String, String, String, String>>();
	
//	Table globale qui doit être correctement instanciée
	Table table;
	
	public List<Quadruplet<String, String, String, String>> getInstructions() {
		return instructions;
	}

	public Table getTable() {
		return table;
	}

	
/* __________________________Méthodes compile__________________________*/
	
	/**
	 * Model
	 */
	public void compile(Model m) {
		for (Function f : m.getFunctions()) {
			TableVar tablef = null; //Instanciée correctement
			instructions.add(compile(f, tablef));
//			table.add_function(name, nb_in, nb_out);
		}
	}
	
	/**
	 * Function
	 */
	private Quadruplet<String,String,String,String> compile(Function f, TableVar table) {
		Quadruplet<String, String, String, String> res = new Quadruplet<String, String, String, String>("Bouchon", "", "", "");
//
//		res.append(curIndent).append("function ").append(f.getName()).append(":\n")
//				.append(prettyPrint(f.getDefinition(), curIndent));

		return res;
	}
	
	/**
	 * Definition
	 */
	private Quadruplet<String,String,String,String> compile(Definition f, TableVar table) {
		Quadruplet<String, String, String, String> res = new Quadruplet<String, String, String, String>("Bouchon", "", "", "");

//		res.append(prettyPrint(d.getInput(), curIndent)).append(curIndent).append("%\n")
//				.append(prettyPrint(d.getCommands(), newIndent(curIndent, optIndent)));
//		res.append(curIndent).append("\n%\n").append(prettyPrint(d.getOutput(), curIndent));

		return res;
	}
	
	/**
	 * Input
	 */
	private Quadruplet<String,String,String,String> compile(Input i, TableVar table) {
		Quadruplet<String, String, String, String> res = new Quadruplet<String, String, String, String>("Bouchon", "", "", "");

//		Ajout dans la table des symboles ? key : nom, value : case mémoire allouée ? -> modifier TableVar ?
		
//		res.append(curIndent).append("read ").append(prettyPrint(i.getVariables())).append("\n");

		return res;
	}

	
}
