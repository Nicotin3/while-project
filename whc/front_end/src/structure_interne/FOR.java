package structure_interne;

import table_des_symboles.Instructions;

public class FOR extends Op {
	
	Instructions Condition;
	Instructions Boucle;
	
	public FOR(Instructions Condition, Instructions Boucle) {
		this.Condition = Condition;
		this.Boucle = Boucle;
	}
}
