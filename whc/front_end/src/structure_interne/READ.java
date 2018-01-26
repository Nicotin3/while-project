package structure_interne;

import table_des_symboles.Instructions;

public class READ extends Op {

	String name;
	
	public READ(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "READ " + name;
	}
	
	public String getOpName() {
		return "READ";
	}
}
