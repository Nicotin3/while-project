package table_des_symboles;

import java.util.ArrayList;
import java.util.List;

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
		StringBuilder s = new StringBuilder();
		for (Quadruplet<Op, Integer, Integer, Integer> quad : instructions) {
			
			switch (quad.getElement1().getOpName()) {
			case "READ":
				break;
			case "WRITE":
				break;
			case "NOP":
				s.append("\t");
				s.append("bouchon nop\n");
				break;
			case "AFFECT":
				s.append("\t");
				s.append("var");
				s.append(quad.getElement2());
				s.append(" = ");
				s.append(quad.getElement3());
				s.append("\n");
				break;
			case "SYMB":
				s.append("\t");
				s.append("bouchon symbole");
				
			//a completer ici
			default:
				s.append("bouchon OP non implementé\n");
				break;
			}
		}
		return s.toString();
	}
	
}
