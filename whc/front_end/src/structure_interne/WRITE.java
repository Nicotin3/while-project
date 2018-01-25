package structure_interne;

import table_des_symboles.Instructions;

public class WRITE extends Op {

	String name;
	
	public WRITE(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "WRITE " + name;
	}
	
	public String getOpName() {
		return "WRITE";
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
