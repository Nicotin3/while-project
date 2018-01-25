package structure_interne;

import table_des_symboles.Instructions;

public class WHILE extends Op {
	
	Instructions Condition;
	Instructions Boucle;
	public WHILE(Instructions Condition, Instructions Boucle) {
			this.Condition = Condition;
			this.Boucle = Boucle;
	}
	
	@Override
	public String toString() {
		return "WHILE " + Condition + "\tboucle " + Boucle.toString();
	}
	
	public String getOpName() {
		return "WHILE";
	}

	@Override
	public Instructions getCondition() {
		return Condition;
	}

	@Override
	public Instructions getThen() {
		return null;
	}

	@Override
	public Instructions getElse() {
		return null;
	}

	@Override
	public Instructions getIn() {
		return null;
	}

	@Override
	public Instructions getBoucle() {
		return Boucle;
	}
}
