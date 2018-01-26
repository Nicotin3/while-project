package structure_interne;

import table_des_symboles.Instructions;

public class CALL extends Op {

	int num;
	
	public CALL(int numFun) {
		this.num = numFun;
	}

	public int getNum() {
		return num;
	}
	
	@Override
	public String toString() {
		return "CALL "+num;
	}
	
	@Override
	public String getOpName() {
		return "CALL";
	}
}
