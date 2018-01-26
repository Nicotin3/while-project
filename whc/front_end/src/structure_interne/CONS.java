package structure_interne;

import table_des_symboles.Instructions;

public class CONS extends Op {

	public CONS() {
	}
	
	@Override
	public String toString() {
		return "CONS";
	}
	
	@Override
	public String getOpName() {
		return "CONS";
	}
}
