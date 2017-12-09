package table_des_symboles;

import java.util.HashMap;

public class TableVar {

	private HashMap<String, Integer> table = new HashMap<String, Integer>();
	
	public void add_variable(String name, int value) {
		table.put(name, value);
	}
	
	public Integer get_variable(String name) {
		return table.get(name);
	}
	
}
