package structure_interne;

public class EQUAL extends Op{
	int gauche;
	int droite;
	
	public EQUAL(int var1, int var2) {
		this.gauche = var1;
		this.droite = var2;
	}
	
	@Override
	public String toString() {
		return gauche + "EQUAL " + droite;
	}
}
