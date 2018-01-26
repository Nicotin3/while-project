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

	public Instructions getCondition() {
		return Condition;
	}

	public void setCondition(Instructions condition) {
		Condition = condition;
	}

	public Instructions getBoucle() {
		return Boucle;
	}

	public void setBoucle(Instructions boucle) {
		Boucle = boucle;
	}
	
	
}
