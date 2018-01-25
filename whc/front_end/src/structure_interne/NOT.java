package structure_interne;

import table_des_symboles.Instructions;

public class NOT extends Op {

	public NOT() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NOT";
	}
	
	@Override
	public String getOpName() {
		return "NOT";
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
