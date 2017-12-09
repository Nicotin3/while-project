package table_des_symboles;

import java.util.*;

public class Table {
	//map de fonctions (nom -> paramtre,return, key_tablesymbole_locale, key_table_code3adresse)
	private HashMap<String, int[]> table = new HashMap<String, int[]>();

	public void add_function(String name, int nb_in, int nb_out) {
		//les deux dernier paramtres seront traiter dans la fonction
		
		int tab[] = new int [4];
		tab[0]= nb_in;
		tab[1]= nb_out;
		
		table.put(name, tab);
	}
	
	public int[] get_function(String name) {
		return table.get(name);
		
	}
}
