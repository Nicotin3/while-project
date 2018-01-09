package table_des_symboles;

import java.util.Collection;
import java.util.HashMap;

public class TableVar {

	private HashMap<String, Integer> table;
	private int nextAddr;
	
	public TableVar() {
		table = new HashMap<String, Integer>();
		nextAddr = 0;
	}
	
	public void add_variable(String name) {
		table.put(name, nextAddr);
		nextAddr++;
	}
	
	public Integer get_variable(String name) {
		return table.get(name);
	}
	
	public Collection<Integer> get_variables() {
		return table.values();
	}
	
	public Collection<String> getKeys(){
		return table.keySet();
	}
	
	@Override
	public String toString() {
		return table.toString();
	}
}
