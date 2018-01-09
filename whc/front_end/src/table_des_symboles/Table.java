package table_des_symboles;

import java.util.*;

import structure_interne.Quadruplet;

public class Table {
	//map de fonctions (nom -> code(integer) -> paramtre,return, key_tablesymbole_locale, key_table_code3adresse)
	private TableVar tablesymbole;
	private HashMap<Integer, Quadruplet<Integer, Integer, TableVar, Instructions>> table;
	
	
	public Table() {
		table = new HashMap<Integer, Quadruplet<Integer, Integer, TableVar, Instructions>>();
		tablesymbole = new TableVar();
	}

	public void add_function(String name, int nb_in, int nb_out, TableVar tableV, Instructions table3a) {
		//les deux dernier paramtres seront traiter dans la fonction
		Quadruplet<Integer, Integer, TableVar, Instructions> quad = new Quadruplet<Integer, Integer, TableVar, Instructions>(nb_in, nb_out, tableV, table3a);
		tablesymbole.add_variable(name);//ajouter fonction au table de symboles
		table.put(tablesymbole.get_variable(name), quad);
	}
	
	public Quadruplet<Integer, Integer, TableVar, Instructions> get_function(String name) {
		return table.get(tablesymbole.get_variable(name));
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (String func : tablesymbole.getKeys()) {
			s.append(func + " : " + table.get(tablesymbole.get_variable(func)).toString() + "\n");
		}
		return s.toString();
	}
}
