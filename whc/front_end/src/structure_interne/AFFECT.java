package structure_interne;

import table_des_symboles.Instructions;

public class AFFECT extends Op{
	String name;
	
	public AFFECT(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "AFFECT "+ name;
	}
	
	public String getOpName() {
		return "AFFECT";
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
