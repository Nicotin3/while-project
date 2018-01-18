package structure_interne;

import table_des_symboles.Instructions;

public class IF extends Op {

	Instructions Condition;
	Instructions Then;
	Instructions Else;
	
	public IF(Instructions Condition, Instructions Then, Instructions Else) {
		//Ajout de 3 champs correspondant à condition, then et else
		this.Condition = Condition;
		this.Then = Then;
		this.Else = Else;
	}
	
	public IF(Instructions Condition, Instructions Then) {
		//Ajout de 3 champs correspondant à condition, then et else
		this.Condition = Condition;
		this.Then = Then;
		this.Else = null;
	}
	
	@Override
	public String toString() {
		if (Else == null) {
			return "if " + Condition + "\n\tthen " + Then.toString();
		}
		return "if " + Condition + "\tthen " + Then.toString() + "\telse " + Else.toString();
	}

	public String getOpName() {
		return "IF";
	}
}
