package production;

import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.xtext.whpp.mydsl.WhStandaloneSetup;
import org.xtext.whpp.mydsl.wh.Model;
import com.google.inject.Injector;

import structure_interne.ABin;
import table_des_symboles.Table;

/**
 * While Compiler
 */
public class Main {

	public static void main(String[] args) throws IOException {
		//Création du compileur
		Compiler comp = new Compiler();
		//Fichier d'entrée
		String fichierSource = "src/tests/test_simple.wh";
		
		// Récupération de la racine de l'ASA correspondant au programme
		// Sources :
		//		https://stackoverflow.com/questions/44716914/text-file-parsing-java-bean-instantiation-with-mwe2-xtext#44787099
		//		https://typefox.io/how-and-why-use-xtext-without-the-ide
		Injector injector = new WhStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
		Resource resource = resourceSet.getResource(URI.createFileURI(fichierSource), true);
		resource.load(null);
		Model model = (Model) resource.getContents().get(0);
		

		//Execution
		comp.compile(model);
		Table table_globale = comp.getTable();

		System.out.println(table_globale.toString());
	}

}
