package structure_interne;

import table_des_symboles.Instructions;

public class EQUAL extends Op{
	
	
	public EQUAL() {
		
	}
	
	@Override
	public String toString() {
		return  "EQUAL";
	}
	
	public String getOpName() {
		return "EQUAL";
	}
}
