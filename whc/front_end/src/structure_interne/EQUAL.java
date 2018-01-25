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
