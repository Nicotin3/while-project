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
