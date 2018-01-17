package structure_interne;

import table_des_symboles.Instructions;

public class WHILE extends Op {
	
	int Condition;
	Instructions Boucle;
	public WHILE(int Condition, Instructions Boucle) {
			this.Condition = Condition;
			this.Boucle = Boucle;
	}
	
	@Override
	public String toString() {
		return "while";
	}
}
