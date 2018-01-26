package structure_interne;

import table_des_symboles.Instructions;

public class OR extends Op {

	public OR() {
		
	}
	
	@Override
	public String toString() {
		return "or";
	}

	public String getOpName() {
		return "OR";
	}
}
