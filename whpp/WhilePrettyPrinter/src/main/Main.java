package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

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
		String fichierSource = "./test/test.wh";
		String fichierResultat = "./test/test_pretty.wh";
		
		// Récupération de la racine de l'ASA correspondant au programme
		// Sources :
		//		https://stackoverflow.com/questions/44716914/text-file-parsing-java-bean-instantiation-with-mwe2-xtext#44787099
		//		https://typefox.io/how-and-why-use-xtext-without-the-ide
		Injector injector = new WhStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
		Resource resource = resourceSet.getResource(URI.createFileURI(fichierSource), true);
		resource.load(null);
		Model model = (Model) resource.getContents().get(0);
		
		// Création du pretty printer
		PrettyPrinter whpp = new PrettyPrinter();
		
		// Modification des options
		//whpp.setIndent(4);
		
		// Execution du pretty printer sur le programme mal formaté
		String prettyWh = whpp.prettyPrint(model);
		
		// Stockage du programme bien formaté dans un nouveau fichier
		try (PrintWriter out = new PrintWriter(fichierResultat, "UTF-8")) {
            out.write(prettyWh);
        }
	}
}
