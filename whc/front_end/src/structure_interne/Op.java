package structure_interne;

import table_des_symboles.Instructions;

public abstract class Op {
	
	public abstract String toString();
	public abstract String getOpName();
	public abstract Instructions getCondition();
	public abstract Instructions getThen();
	public abstract Instructions getElse();
	public abstract Instructions getIn();
	public abstract Instructions getBoucle();
}
