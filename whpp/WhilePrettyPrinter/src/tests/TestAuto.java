package tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.Main;

public class TestAuto {
	
	// Ici les differents PATH,, DIRECTORY et EXTENSION que nous allons utiliser (seule partie à adapter à la structure du projet)
	static private String packagePATH = "src/tests/";
	
	static private String test_baseDIR = "tests_base";
	static private String production_codeDIR = "production_code";
	static private String resultat_testsDIR = "resultat_tests";
	
	static private String extTest = ".wh";
	static private String extTestResult = ".whpp";

	public static void main(String[] args) {
		// On recupere nos fichiers de test d'extension "wh" :
		List<File> tests = new ArrayList<File>();
		System.out.println("Liste des tests disponibles : \n");
		getFiles(new File(packagePATH+test_baseDIR), new ArrayList<String>(), tests);
		System.out.println("\nNombre total de tests trouvés : "+tests.size());
		// On PrettyPrint chacun de ces tests :
		prettyPrint(tests);
		// On compare les resultats des tests effectues avec ceux que nous sommes censes obtenir
		// et on liste les tests qui ne sont pas correctement passes :
		List<File> failedTests = new ArrayList<File>();
		checkResults(tests, failedTests);
		if(failedTests.size() != 0) {
			System.out.println("\nListe des tests qui ont échoué : \n");
			printFiles(failedTests, extTest);
			System.out.println("\nNombre total de tests échoués : "+failedTests.size()+" / "+tests.size());
		} else {
			System.out.println("\nAucun test n'a échoué, félicitations !");
		}
	}
	

	/*
	 * Fonction qui affiche les fichiers d'un certain type disponibles dans une hierarchie de repertoire
	 * Elle ajoute aussi les chemins de ces fichiers dans une liste passee en parametre
	 * Param :  Nom du repertoire parent
	 *          Type de fichier
	 *          Liste utilisée pour le parcours recursif
	 *          Liste ou les chemins des fichiers sont stockes
	 */	
	public static void getFiles(File path, List<String> recursivList, List<File> fileList) {
		 
		if (path.isDirectory()) {
		    File[] list = path.listFiles();
		    if (list != null) {
			for (int i = 0; i < list.length; i++) {
			    // Appel récursif sur les sous-répertoires
				getFiles(list[i], recursivList, fileList);
			}
		    } else {
			System.err.println(path + " : Erreur de lecture.");
		    }
		} else {
		    String currentFilePath = path.toString();
		    String fileName = path.getName();
		    if(fileName.endsWith(extTest)) {
		    	// On ajoute le path du fichier à la liste puis on affiche le nom du fichier duquel il s'agit
		    	fileList.add(path);
		    	System.out.println(fileName.substring(0,fileName.length()-extTest.length()));
		    }
		    recursivList.add(currentFilePath);
		}
	}
	
	/*
	 * Fonction qui affiche tous les noms de fichier d'une liste
	 * Param :  Liste de fichier
	 *          Type de fichier
	 * Out :    Ecriture dans la console
	 */
	public static void printFiles(List<File> fileList, String ext) {
		Iterator<File> it = fileList.listIterator(); 
		while(it.hasNext()) {
			String fileName = it.next().getName();
			System.out.println(fileName.substring(0,fileName.length()-ext.length()));
		}	
	}

	/*
	 * Fonction qui pretty print les tests d'une liste
	 * Param :  Liste de fichier
	 * Out :    Creation des fichiers PrettyPrintes d'extensions ".whpp" dans le dossier Production code
	 */
	public static void prettyPrint(List<File> fileList) {
		Iterator<File> it = fileList.listIterator(); 
		while(it.hasNext()) {
			File currentFile = it.next();
			String fileName = currentFile.getName();
			String filePath = currentFile.getPath();
			String prettyPrintedFilePath = packagePATH+production_codeDIR+"/"+fileName.substring(0, fileName.length()-extTest.length())+extTestResult;
			String [] args = new String[] {filePath, "-o", prettyPrintedFilePath};
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
	
	/*
	 * Fonction qui compare les resultats des tests pratiques et theoriques
	 * et qui indique quels tests ont echoue
	 * Param :  Liste des fichiers de tests
	 *          Liste des tests echoues
	 * Out :    Remplissage de la liste des tests echoues
	 */
	public static void checkResults(List<File> tests, List<File> failedTests) {
		Iterator<File> it = tests.listIterator();
		while(it.hasNext()) {
			// Pour chaque test qui a ete effectue :
			File currentTest = it.next();
			// On recupere le nom du fichier prettyprinte (extension modifiee)
			String generatedFile = currentTest.toString().substring(0,currentTest.toString().length()-extTest.length()).concat(extTestResult).replaceAll(test_baseDIR,production_codeDIR);
			// On cherche le fichier en question dans le repertoire de test
			File currentResult = new File(generatedFile);
			// On cherche egalement le fichier du resultat que nous somme cense obtenir (repertoire modifie)
			File actualResult = new File(currentResult.toString().replaceAll(production_codeDIR, resultat_testsDIR));
			// On effectue un test de base pour comparer les tailles de fichier qui doivent etre identiques
			if(currentResult.length() == actualResult.length()) {
				try {
					// On cree deux BufferedReaders pour stocker le contenu de nos fichiers
					BufferedReader currentRD = new BufferedReader(new FileReader(currentResult));
					BufferedReader actualRD = new BufferedReader(new FileReader(actualResult));
					// On lit progressivement les deux contenus ligne par ligne pour les comparer
					String currentLine = currentRD.readLine();
					String actualLine = actualRD.readLine();
					int nbLigne = 0;
					Boolean correspondance = true;
					while(currentLine != null && actualLine != null && correspondance == true) {
						// Si les deux lignes ne sont pas identiques :
						if(currentLine.compareTo(actualLine) != 0) {
							// On ajoute le fichier à la liste des tests echoues
							System.out.println("\nERREUR : les lignes n°"+nbLigne+" des deux fichiers ne correspondent pas : ");
							System.out.println("PrettyPrinté : "+currentLine);
							System.out.println("Attendu       : "+actualLine);
							failedTests.add(currentTest);
							// On sort de la boucle
							correspondance = false;
						}
						// Sinon on passe a la ligne suivante
						currentLine = currentRD.readLine();
						actualLine = actualRD.readLine();
						nbLigne++;
					}
					// On ferme les BufferedReaders
					currentRD.close();
					actualRD.close();
				} catch (FileNotFoundException e) {
					System.out.println("Problème à la création des BufferedReaders.");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("Problème à la récupération du contenu des BufferedReaders.");
					e.printStackTrace();
				}
			}
		}
	}
}
