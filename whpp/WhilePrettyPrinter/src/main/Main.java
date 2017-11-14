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
		
		//Gestion des options
		String stringOpt = args[0];
		String[] tableOpt = stringOpt.split(" ");
		if(tableOpt.length%2 != 0){
			throw new Exception("Nombre d'argument incorrect\n");
		}
		
		String fichierSource = tableOpt[0];
		String fichierResultat = new String ("pretty-" + tableOpt[0]);
		
		for (int i = 0; i < tableOpt.length; i++) {
			if(tableOpt[i].equalsIgnoreCase("-all")){
				whpp.setIndent(Integer.parseInt(tableOpt[i+1]));
			}
			if(tableOpt[i].equalsIgnoreCase("-if")){
				whpp.setIfIndent(Integer.parseInt(tableOpt[i+1]));
			}
			if(tableOpt[i].equalsIgnoreCase("-while")){
				whpp.setWhileIndent(Integer.parseInt(tableOpt[i+1]));
			}
			if(tableOpt[i].equalsIgnoreCase("-for")){
				whpp.setForIndent(Integer.parseInt(tableOpt[i+1]));
			}
			if(tableOpt[i].equalsIgnoreCase("-o")){
				fichierResultat = tableOpt[i+1];
			}
		}
		
		
		
		// R�cup�ration de la racine de l'ASA correspondant au programme
		// Sources :
		//		https://stackoverflow.com/questions/44716914/text-file-parsing-java-bean-instantiation-with-mwe2-xtext#44787099
		//		https://typefox.io/how-and-why-use-xtext-without-the-ide
		Injector injector = new WhStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
		Resource resource = resourceSet.getResource(URI.createFileURI(fichierSource), true);
		resource.load(null);
		Model model = (Model) resource.getContents().get(0);
		
		
		// Execution du pretty printer sur le programme mal format�
		String prettyWh = whpp.prettyPrint(model);
		
		// Stockage du programme bien format� dans un nouveau fichier
		try (PrintWriter out = new PrintWriter(fichierResultat, "UTF-8")) {
            out.write(prettyWh);
        }
	}
}