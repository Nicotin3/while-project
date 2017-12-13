package structure_interne;

public class ABin {
	private ABin gauche, droit;

	// CONSTRUCTEUR

	public ABin(ABin g, ABin d) {
		gauche = g;
		droit = d;
	}

	// ACCESSEURS

	public ABin hd() {
		return (gauche);
	}

	public ABin tl() {
		return (droit);
	}

	// AFFICHAGE
	public String toString() {
		return toString("\t");
	}

	public String toString(String s) {
		String valeur = "•";
//		if (gauche == null && droit== null)
//			return s+valeur+"\nnil"+s+s+"nil";
//		else if (gauche==null)
//			return s+valeur+"\nnil"+s+s+droit.toString();
//		else
//			return s+valeur+"\n"+gauche.toString()+s+s+"nil";
		
		if (gauche != null) {
			if (droit != null)
				return (s + valeur + "\n" + gauche.toString(s + "\t") + droit.toString(s + "\t"));
			else
				return (s + valeur + "\n" + gauche.toString(s + "\t") + "\n");
		} else if (droit != null)
			return (s + valeur + "\n\n" + droit.toString(s + "\t"));
		else
			return (s + valeur + "\n");
	}

	// /**
	// * Affiche l'arbre selon un parcours prefixe
	// */
	// public void ParcoursPrefixe() {
	// System.out.println(getValeur());
	// if (getSousBinTreeGauche() != null)
	// getSousBinTreeGauche().ParcoursPrefixe();
	// if (getSousBinTreeDroit() != null)
	// getSousBinTreeDroit().ParcoursPrefixe();
	// }
	//
	// /**
	// * Affiche l'arbre selon un parcours infixe
	// */
	// public void ParcoursInfixe() {
	// if (getSousBinTreeGauche() != null)
	// getSousBinTreeGauche().ParcoursInfixe();
	// System.out.println(getValeur());
	// if (getSousBinTreeDroit() != null)
	// getSousBinTreeDroit().ParcoursInfixe();
	// }
	//
	// /**
	// * Affiche l'arbre selon un parcours postfixe
	// */
	// public void ParcoursPostfixe() {
	// if (getSousBinTreeGauche() != null)
	// getSousBinTreeGauche().ParcoursPostfixe();
	// if (getSousBinTreeDroit() != null)
	// getSousBinTreeDroit().ParcoursPostfixe();
	// System.out.println(getValeur());
	// }
	//
	// /**
	// * Teste si deux arbres sont egaux, meme valeurs et meme disposition
	// *
	// * @param a
	// * l'arbre a comparer a b
	// * @param b
	// * l'arbre a comparer a a
	// * @return un boolean indiquant si les arbres sont egaux
	// */
	// public static boolean arbresEgaux(ABin a, ABin b) {
	// if ((a == null) && (b == null))
	// return true;
	// if ((a == null) && (b != null))
	// return false;
	// if ((a != null) && (b == null))
	// return false;
	//
	// // A ce point, a et b != null, on peut acceder a leurs champs
	// if (a.getValeur() != b.getValeur())
	// return false;
	// return (arbresEgaux(a.hd(), b.hd())
	// && arbresEgaux(a.tl(), b.tl()));
	// }

	/**
	 * @param a
	 *            un arbre
	 * @return la hauteur de l'arbre a
	 */
	public static int hauteur(ABin a) {
		if (a == null)
			return 0;
		else
			return (1 + Math.max(hauteur(a.hd()), hauteur(a.tl())));
	}

	public static int ABinToInt(ABin a) {
		if (a == null)
			return 0;
		else
			return (1 + ABinToInt(a.tl()));
	}

	public static ABin IntToABin(int i) {
		if (i == 0)
			return null;
		else
			return (new ABin(null, IntToABin(i - 1)));
	}

}