package structure_interne;

import table_des_symboles.Instructions;

public class BOUCHON extends Op {

	String name;
	
	public BOUCHON(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "BOUCHON " + name;
	}

	public String getOpName() {
		return "BOUCHON";
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
