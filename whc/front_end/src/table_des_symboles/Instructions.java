package table_des_symboles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import structure_interne.Op;
import structure_interne.Quadruplet;

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
		String res = "{";
		
		for (Quadruplet<Op, Integer, Integer, Integer> quad : instructions) {
			res += quad.toString() + "\n";
		}
		return res+"}";
	}
	public String toLua() {
		ListIterator<Quadruplet<Op, Integer, Integer, Integer>> it = instructions.listIterator();
		
		return toLuaCache(2, it);
	}
	public String toLuaCache(int indent, ListIterator<Quadruplet<Op, Integer, Integer, Integer>> it) {
		StringBuilder s = new StringBuilder();
		Quadruplet<Op, Integer, Integer, Integer> quad;
		while (it.hasNext()) {//for (Quadruplet<Op, Integer, Integer, Integer> quad : instructions) {
			quad = it.next();
			
			switch (quad.getElement1().getOpName()) {	
			
			case "READ": // cas inutile ici car déjà géré avant, on passe donc
				break;
				
			case "WRITE":
				for (int i = 0; i < indent; i++) {
					s.append(" ");
				}
				s.append("return ");
				s.append(quad.getElement3());
				while (it.hasNext()) {
					quad = it.next();
					if (quad.getElement1().getOpName().equals("WRITE")){ // prochain est un write
						s.append(", " + quad.getElement3());
					}
				}
				s.append("\n");
				break;
				
			case "NOP":
				// le nop se traduit pas rien en lua
				break;
				
			case "AFFECT":
				for (int i = 0; i < indent; i++) {
					s.append(" ");
				}
				s.append("var");
				s.append(quad.getElement2());
				s.append(" = ");
				s.append(quad.getElement3());
				s.append("\n");
				break;
				
			case "SYMB":
				for (int i = 0; i < indent; i++) {
					s.append(" ");
				}
				s.append("bouchon symbole\n");
				break;
				
			//a completer ici
			default:
				for (int i = 0; i < indent; i++) {
					s.append(" ");
				}
				s.append("bouchon, op non implementé\n");
				break;
			}
		}
		return s.toString();
	}
	
}
