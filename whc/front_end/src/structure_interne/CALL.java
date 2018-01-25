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

	@Override
	public Instructions getCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instructions getThen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instructions getElse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instructions getIn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instructions getBoucle() {
		// TODO Auto-generated method stub
		return null;
	}

}
