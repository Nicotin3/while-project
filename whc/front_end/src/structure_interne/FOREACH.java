package structure_interne;

import table_des_symboles.Instructions;

public class FOREACH extends Op{

	int Condition;
	int In;
	Instructions Then;
	
	public FOREACH(int Condition, int In, Instructions Then) {
		this.Condition = Condition;
		this.In = In;
		this.Then = Then;
	}
	
	@Override
	public String toString() {
		return "foreach";
	}
}
