package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import com.google.inject.Injector;
import org.xtext.whpp.mydsl.WhStandaloneSetup;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.common.util.URI;
import org.xtext.whpp.mydsl.wh.Model;

/**
 * While Pretty Printer
 */
public class Main {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// Création du pretty printer
		PrettyPrinter whpp = new PrettyPrinter();
		
		// Gestion des options
		//Premier argument : nom du fichier source, vérification du nombre d'arguments dans le script.
		
		String fichierSource = args[0];
		String fichierResultat = new String (fichierSource + "pp"); //Par défaut : sth.whpp si l'entrée est sth.wh
		
		for (int i = 0; i < args.length; i++) {
			if(args[i].equalsIgnoreCase("-all")){
				whpp.setIndent(Integer.parseInt(args[i+1]));
			}
			if(args[i].equalsIgnoreCase("-if")){
				whpp.setIfIndent(Integer.parseInt(args[i+1]));
			}
			if(args[i].equalsIgnoreCase("-while")){
				whpp.setWhileIndent(Integer.parseInt(args[i+1]));
			}
			if(args[i].equalsIgnoreCase("-for")){
				whpp.setForIndent(Integer.parseInt(args[i+1]));
			}
			if(args[i].equalsIgnoreCase("-o")){
				fichierResultat = args[i+1];
			}
		}
		
		
		
		// Récupération de la racine de l'ASA correspondant au programme
		// Sources :
		//		https://stackoverflow.com/questions/44716914/text-file-parsing-java-bean-instantiation-with-mwe2-xtext#44787099
		//		https://typefox.io/how-and-why-use-xtext-without-the-ide
		Injector injector = new WhStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
		Resource resource = resourceSet.getResource(URI.createFileURI(fichierSource), true);
		resource.load(null);
		Model model = (Model) resource.getContents().get(0);
		
		
		// Execution du pretty printer sur le programme mal formaté
		StringBuilder prettyWh = whpp.prettyPrint(model);
		
		// Stockage du programme bien formaté dans un nouveau fichier
		try (PrintWriter out = new PrintWriter(fichierResultat, "UTF-8")) {
            out.write(prettyWh.toString());
        }
	}
}