package table_des_symboles;

import java.util.*;

import structure_interne.Quintuplet;

public class Table {
	//map de fonctions (nom -> code(integer) -> paramtre,return, key_tablesymbole_locale, key_table_code3adresse)
	//Map de nom de fonction et d'un quintuplet correspondant aux données de la fonction : numéro de fonction, nb entrées, nb sorties, table de variable et liste d'instructions
	private HashMap<String, Quintuplet<Integer, Integer, Integer, TableVar, Instructions>> table;
	private static int numFun = 0;
	
	public Table() {
		table = new HashMap<String, Quintuplet<Integer, Integer, Integer, TableVar, Instructions>>();
	}

	public void add_function(String name, int nb_in, int nb_out, TableVar tableV, Instructions table3a) {
		//les deux dernier paramtres seront traiter dans la fonction
		Quintuplet<Integer, Integer, Integer, TableVar, Instructions> quint = new Quintuplet<Integer, Integer, Integer, TableVar, Instructions>(numFun, nb_in, nb_out, tableV, table3a);
		numFun ++;
		table.put(name, quint);
	}
	
	public Quintuplet<Integer, Integer, Integer, TableVar, Instructions> get_function(String name) {
		return table.get(name);
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (String func : table.keySet()) {
			s.append(func + " : " + table.get(func) + "\n");
		}
		return s.toString();
	}
}
