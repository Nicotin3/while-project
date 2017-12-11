package table_des_symboles;

import java.util.*;

import structure_interne.Quadruplet;

public class Table {
	//map de fonctions (nom -> paramtre,return, key_tablesymbole_locale, key_table_code3adresse)
	private HashMap<String, Quadruplet<Integer, Integer, TableVar, Instructions>> table;
	
	public Table() {
		table = new HashMap<String, Quadruplet<Integer, Integer, TableVar, Instructions>>();
	}

	public void add_function(String name, int nb_in, int nb_out, TableVar tableV, Instructions table3a) {
		//les deux dernier paramtres seront traiter dans la fonction
		Quadruplet<Integer, Integer, TableVar, Instructions> quad = new Quadruplet<Integer, Integer, TableVar, Instructions>(nb_in, nb_out, tableV, table3a);
		table.put(name, quad);
	}
	
	public Quadruplet<Integer, Integer, TableVar, Instructions> get_function(String name) {
		return table.get(name);
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (String func : table.keySet()) {
			s.append(func + " : " + table.get(func).toString() + "\n");
		}
		return s.toString();
	}
}
