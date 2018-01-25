package structure_interne;

import table_des_symboles.Instructions;

public class FOREACH extends Op{

	Instructions Condition;
	Instructions In;
	Instructions Then;
	
	public FOREACH(Instructions Condition, Instructions In, Instructions Then) {
		this.Condition = Condition;
		this.In = In;
		this.Then = Then;
	}
	
	@Override
	public String toString() {
		return "FOREACH " + Condition + "\tin " + In.toString() + Then + "\tthen" + Then.toString();
	}
	
	public String getOpName() {
		return "FOREACH";
	}

	@Override
	public Instructions getCondition() {
		return Condition;
	}

	@Override
	public Instructions getThen() {
		return Then;
	}

	@Override
	public Instructions getElse() {
		return null;
	}

	@Override
	public Instructions getIn() {
		return In;
	}

	@Override
	public Instructions getBoucle() {
		return null;
	}
}
