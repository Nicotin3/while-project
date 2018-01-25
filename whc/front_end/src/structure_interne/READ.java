package structure_interne;

import table_des_symboles.Instructions;

public class READ extends Op {

	String name;
	
	public READ(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "READ " + name;
	}
	
	public String getOpName() {
		return "READ";
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
