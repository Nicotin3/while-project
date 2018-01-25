package structure_interne;

import table_des_symboles.Instructions;

public class NOP extends Op{
	public NOP() {
	}
	
	@Override
	public String toString() {
		return "NOP";
	}
	
	public String getOpName() {
		return "NOP";
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
