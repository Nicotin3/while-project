package structure_interne;

import table_des_symboles.Instructions;

public class AND extends Op {
	
	public AND() {

	}

	@Override
	public String toString() {
		return "AND";
	}

	public String getOpName() {
		return "AND";
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
