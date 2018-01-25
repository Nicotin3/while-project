package structure_interne;

import table_des_symboles.Instructions;

public class TL extends Op {

	public TL() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TL";
	}
	@Override
	public String getOpName() {
		return "TL";
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
