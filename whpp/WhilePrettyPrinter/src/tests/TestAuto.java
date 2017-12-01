package tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import main.Main;

public class TestAuto {

	public static void main(String[] args) {
		// On récupère nos fichiers de test d'extension "wh" :
		List<String> tests = getFiles(new File("src/tests/Tests base"), ".wh");
		// On affiche les tests disponibles pour l'utilisateur :
		printFiles(tests, ".wh");
		// On PrettyPrint chacun de ces tests :
		prettyPrint(tests);
		
	}
	
	
	/*
	 * Fonction qui retourne la liste des fichiers recherchés dans un répertoire
	 * Param :  Nom du répertoire
	 *          Type de fichier
	 * Return : Liste des fichiers correspondants
	 */
	public static List<String> getFiles(File dirName, String type) {
		List<String> result = new ArrayList<String>();
		String [] fileList = dirName.list();
		System.out.println("Taille doss : "+ fileList.length);
		for(int i=0;i<fileList.length;i++) {
			if(fileList[i].endsWith(type)) {
				result.add(fileList[i]);
			}
		}		
		return result;
	}
	
	/*
	 * Fonction qui affiche tous les noms de fichier d'une liste
	 * Param :  Liste de fichier
	 *          Type de fichier
	 * Out :    Ecriture dans la console
	 */
	public static void printFiles(List<String> fileList, String type) {
		System.out.println("\nListe des tests disponibles : \n");
		int nbChar = type.length();
		Iterator<String> it = fileList.listIterator(); 
		while(it.hasNext()) {
			String fileName = it.next();
			System.out.println(fileName.substring(0,fileName.length()-nbChar));
		}	
	}

	/*
	 * Fonction qui pretty print les tests d'une liste
	 * Param :  Liste de fichier
	 * Out :    Création des fichiers PrettyPrintés d'extensions ".whpp" dans le dossier Production code
	 */
	public static void prettyPrint(List<String> fileList) {
		Iterator<String> it = fileList.listIterator(); 
		while(it.hasNext()) {
			String fileName = it.next();
			String path = "src/tests/Tests base/";
			path.concat(fileName);
			String [] args = new String[] {path, "-o", "src/tests/Production code/".concat(fileName).concat("pp")};
			try {
				Main.main(args);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
