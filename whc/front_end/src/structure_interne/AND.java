package structure_interne;

import table_des_symboles.Instructions;

public class AND extends Op {
	
	public AND() {

	}

	@Override
	public String toString() {
		return "and";
	}

	public String getOpName() {
		return "AND";
	}
}
