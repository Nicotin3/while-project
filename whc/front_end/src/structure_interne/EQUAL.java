package structure_interne;

public class EQUAL extends Op{
	String gauche;
	String droite;
	
	public EQUAL(String gauche, String droite) {
		this.gauche = gauche;
		this.droite = droite;
	}
	
	@Override
	public String toString() {
		return gauche + "EQUAL " + droite;
	}
}
