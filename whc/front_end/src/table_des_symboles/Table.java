package table_des_symboles;

import java.util.*;

import javax.print.attribute.standard.PrinterLocation;

import structure_interne.Quintuplet;

public class Table {
	//Map de nom de fonction et d'un quintuplet correspondant aux donnÃ©es de la fonction : numÃ©ro de fonction, nb entrÃ©es, nb sorties, table de variable et liste d'instructions
	private HashMap<String, Quintuplet<Integer, Integer, Integer, TableVar, Instructions>> table;
	private static int numFun = 0;
	
	public Table() {
		table = new HashMap<String, Quintuplet<Integer, Integer, Integer, TableVar, Instructions>>();
	}

	public void add_function(String name, int nb_in, int nb_out, TableVar tableV, Instructions table3a) {
		//les deux dernier paramtres seront traiter dans la fonction
		Quintuplet<Integer, Integer, Integer, TableVar, Instructions> quint = new Quintuplet<Integer, Integer, Integer, TableVar, Instructions>(numFun, nb_in, nb_out, tableV, table3a);
		numFun ++;
		table.put(name, quint);
	}
	
	public Quintuplet<Integer, Integer, Integer, TableVar, Instructions> get_function(String name) {
		return table.get(name);
	}
	
	public Set<String> keySet() {
		return table.keySet();
	}
	
	@Override
	public String toString() {
		// TODO Surcharge de l'opÃ©rateur pour production code LUA (creez une autre
		// fonction si vous le souhaitez)
		StringBuilder s = new StringBuilder();
		for (String func : table.keySet()) {
			s.append(func + " : " + table.get(func) + "\n");
		}
		return s.toString();
	}
	public String toLua() {
		StringBuilder s = new StringBuilder();
		for (String func : table.keySet()) {
			
			if (!func.equals("nil")) { // on ignore la premiere entree "nil" de la table des fonctions -- verif a changer - au moins un param entree pour fonction
				//Récupération du quintuplet 
				Quintuplet<Integer, Integer, Integer, TableVar, Instructions> quintu = table.get(func);
				
				//Récupération de la liste d'instructions
				Instructions instrus = quintu.getElement5(); // recuperation du quadruplet instruction <op, i1, i2, i3>
				
				s.append("\nfunction f");
				s.append(quintu.getElement1()); // recuperation du nom de la fonction
				s.append("(");
				
				//gestion inputs
				for(int i = 0 ; i<quintu.getElement2() ; i++) { // nombre d'entree
					s.append("var");
					s.append(instrus.get_instructions().get(i).getElement2());
					if (i != quintu.getElement2()-1) // si derniere variable alors pas de virgule de separation
						s.append(", ");
				}
				s.append(")\n");
				
				//gestion corps de la fonction
				s.append(quintu.getElement5().toLua());
				
				s.append("end\n");
			}
		}
		return s.toString();
	}
}
