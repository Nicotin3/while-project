package structure_interne;

import table_des_symboles.Instructions;

public class WHILE extends Op {
	
	Instructions Condition;
	Instructions Boucle;
	public WHILE(Instructions Condition, Instructions Boucle) {
			this.Condition = Condition;
			this.Boucle = Boucle;
	}
}
