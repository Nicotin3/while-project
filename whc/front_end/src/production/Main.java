package production;

import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.xtext.whpp.mydsl.WhStandaloneSetup;
import org.xtext.whpp.mydsl.wh.Model;
import com.google.inject.Injector;
import table_des_symboles.Table;

/**
 * While Compiler
 */
public class Main {

	public static void main(String[] args) throws IOException {
		//Création du compileur
		Compiler comp = new Compiler();
		//Fichier d'entrée
		String nomFichier = "test_simple";
		
		String fichierSource = "src/tests/"+nomFichier+".wh";
		
		// Récupération de la racine de l'ASA correspondant au programme
		Injector injector = new WhStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
		Resource resource = resourceSet.getResource(URI.createFileURI(fichierSource), true);
		resource.load(null);
		Model model = (Model) resource.getContents().get(0);

		//Execution du compilateur
		comp.compile(model);
		Table table_globale = comp.getTable();
		// Affichage code 3 adresses
//		for (String f : table_globale.keySet()) {
//			System.out.println(f + " : " + table_globale.get_function(f).getElement5());
//		}

		//Production code LUA
		System.out.println(table_globale.toString());
		System.out.println(table_globale.toLua());
		
		//Ecriture dans ficher
		try (PrintWriter out = new PrintWriter("../libwh/src/"+nomFichier+".lua", "UTF-8")){
			out.write(table_globale.toLua());
		}
			}

}