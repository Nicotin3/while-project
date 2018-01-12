package structure_interne;

import table_des_symboles.Instructions;

public class EQUAL extends Op{
	Instructions gauche;
	Instructions droite;
	
	public EQUAL(Instructions instructions, Instructions instructions2) {
		this.gauche = instructions;
		this.droite = instructions2;
	}
	
	@Override
	public String toString() {
		return gauche + "EQUAL " + droite;
	}
}
