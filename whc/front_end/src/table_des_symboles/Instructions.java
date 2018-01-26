package table_des_symboles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import structure_interne.FOR;
import structure_interne.IF;
import structure_interne.Op;
import structure_interne.Quadruplet;
import structure_interne.SYMB;
import structure_interne.WHILE;

public class Instructions {
	List<Quadruplet<Op, Integer, Integer, Integer>> instructions;
	
	public Instructions() {
		instructions = new ArrayList<Quadruplet<Op, Integer, Integer, Integer>>();
	}
	
	public void add_instruction(Quadruplet<Op, Integer, Integer, Integer> instr) {
		instructions.add(instr);
	}
	
	public List<Quadruplet<Op, Integer, Integer, Integer>> get_instructions() {
		return instructions;
	}

	public void add_instructions(Instructions listInstr) {
		instructions.addAll(listInstr.get_instructions());
	}
	
	@Override
	public String toString() {
		String res = "{\n";
		
		for (Quadruplet<Op, Integer, Integer, Integer> quad : instructions) {
			res += quad.toString() + "\n";
		}
		return res+"}";
	}

	public String toLua() {
		return toLuaCache(1);
	}
	
	public String toLuaCache(int indent) {
		// init variables
		ListIterator<Quadruplet<Op, Integer, Integer, Integer>> it = instructions.listIterator();
		List<Integer> varInit = new ArrayList<Integer>(); // liste des variables declarees dans la fonction
		StringBuilder s = new StringBuilder();
		StringBuilder tab = new StringBuilder();
		
		for (int i = 0; i < indent; i++) {
			tab.append("  ");
		}
		Quadruplet<Op, Integer, Integer, Integer> quad;
		
		while (it.hasNext()) {//for (Quadruplet<Op, Integer, Integer, Integer> quad : instructions) {
			quad = it.next();
			int elem2;
			int elem3;
			int elem4;
			StringBuilder tmp = new StringBuilder(); // potentiellement besoin de le remontrer au dessus du while puis du for
			
			switch (quad.getElement1().getOpName()) {	
			
			case "READ": // cas inutile ici car déjà géré avant, on passe donc
				varInit.add(quad.getElement2());
				break;
				
			case "WRITE":
				tmp = new StringBuilder();
				tmp.append(tab);
				tmp.append("return var");
				tmp.append(quad.getElement3());
				while (it.hasNext()) {
					quad = it.next();
					if (quad.getElement1().getOpName().equals("WRITE")){ // prochain est un write
						tmp.append(", var" + quad.getElement3());
					}
					else if (quad.getElement1().getOpName().equals("SYMB")){ // retour d'une variable pas initialisee localement
						elem2 = quad.getElement2();
						if(!varInit.contains(elem2)) { // l'element d'ecriture est forcement une variable
							s.append(tab);
							s.append("local var" + elem2 + "\n");
							varInit.add(elem2);
						}
						s.append(tab);
						s.append("var");
						s.append(quad.getElement2());
						s.append(" = ");
						s.append(((SYMB) (quad.getElement1())).getCorrespondingLuaSymb());
						s.append("\n");
					}
				}
				s.append(tmp);
				s.append("\n");
				break;
				
			case "NOP":
				// le nop se traduit en rien en lua
				s.append(tab);
				s.append("-- nop\n");
				break;
				
			case "AFFECT":
				elem2 = quad.getElement2();
				elem3 = quad.getElement3();
				if(!varInit.contains(elem2)) { // l'element d'ecriture est forcement une variable
					s.append(tab);
					s.append("local var" + elem2 + "\n");
					varInit.add(elem2);
				}
				if(!varInit.contains(elem3)) { // l'element de lecture est forcement une variable
					s.append(tab);
					s.append("local var" + elem3 + "\n");
					varInit.add(elem3);
				}
				s.append(tab);
				s.append("var");
				s.append(quad.getElement2());
				s.append(" = var");
				s.append(quad.getElement3());
				s.append("\n");
				break;
				
			case "SYMB":
				elem2 = quad.getElement2();
				if(!varInit.contains(elem2)) { // l'element d'ecriture est forcement une variable
					s.append(tab);
					s.append("local var" + elem2 + "\n");
					varInit.add(elem2);
				}
				s.append(tab);
				s.append("var");
				s.append(quad.getElement2());
				s.append(" = ");
				s.append(((SYMB) (quad.getElement1())).getCorrespondingLuaSymb());
				s.append("\n");
				break;
			
			case "IF":
				tmp = new StringBuilder();
				tmp.append(tab).append("if ");
				
				if (((IF) (quad.getElement1())).getCondition() == null) {
					tmp.append(quad.getElement3());
				}
				else {
					s.append(((IF) (quad.getElement1())).getCondition().toLuaCache(indent));
					tmp.append("var" + quad.getElement3());
				}

				tmp.append(tab).append("then\n");
				tmp.append(((IF) quad.getElement1()).getThen().toLuaCache(indent+1));
				
				if(((IF) quad.getElement1()).getElse() != null) {
					s.append(tab).append("else\n");
					s.append(((IF) quad.getElement1()).getElse().toLuaCache(indent+1));					
				}
								
				tmp.append(tab).append("end\n");
				s.append(tmp);
				break;
				
			case "WHILE":
				tmp = new StringBuilder();
				tmp.append(tab).append("while ");
				
				if (((WHILE) (quad.getElement1())).getCondition() == null) {
					tmp.append(quad.getElement3());
				}
				else {
					s.append(((WHILE) (quad.getElement1())).getCondition().toLuaCache(indent));
					tmp.append("var" + quad.getElement3());
				}
				
				tmp.append(tab).append("do\n");
				tmp.append(((WHILE) (quad.getElement1())).getBoucle().toLuaCache(indent+1));
				tmp.append(tab).append("end\n");
				
				s.append(tmp);
				break;
				
			case "FOR":
				tmp = new StringBuilder();
				tmp.append(tab).append("for ");
				
				// transformatin de l'expression en con (entier)
				if (((FOR) (quad.getElement1())).getCondition() != null) {
					s.append(((FOR) (quad.getElement1())).getCondition().toLuaCache(indent)); 
				}
				
				// ecriture du for
				tmp.append("i = 0, ");
				tmp.append("treelib.toNumber("+ "var" + quad.getElement3() + ")" );
				tmp.append(" do\n");
				tmp.append(((FOR) (quad.getElement1())).getBoucle().toLuaCache(indent+1));
				tmp.append(tab).append("od\n");
				s.append(tmp);
				break;
			
			case "FOREACH":
				s.append(tab).append("foreach (pas fini)");
				break;
				
			case "AND":
				elem2=quad.getElement2();
				elem3=quad.getElement3();
				elem4= quad.getElement4();
				s.append("var").append(elem2).append("= var");
				s.append(elem3).append(" and var").append(elem4);
				break;
				
			case "OR":
				elem2=quad.getElement2();
				elem3=quad.getElement3();
				elem4= quad.getElement4();
				s.append("var").append(elem2).append("= var");
				s.append(elem3).append(" or var").append(elem4);
				break;
				
			case "Not":
				elem2=quad.getElement2();
				elem3=quad.getElement3();
				elem4= quad.getElement4();
				s.append("var").append(elem2).append("= not var").append(elem3);
				break;
				
			default:
				s.append(tab);
				s.append("bouchon, op non implementé\n");
				break;
			}
		}
		return s.toString();
	}
}
