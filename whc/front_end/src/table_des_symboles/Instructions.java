package table_des_symboles;

import java.util.ArrayList;
import java.util.List;

import structure_interne.Op;
import structure_interne.Quadruplet;

public class Instructions {
	List<Quadruplet<Op, String, String, String>> instructions;
	
	public Instructions() {
		instructions = new ArrayList<Quadruplet<Op, String, String, String>>();
	}
	
	public void add_instruction(Quadruplet<Op, String, String, String> instr) {
		instructions.add(instr);
	}
	
	public List<Quadruplet<Op, String, String, String>> get_instructions() {
		return instructions;
	}

	public void add_instructions(Instructions listInstr) {
		instructions.addAll(listInstr.get_instructions());
	}
	
	@Override
	public String toString() {
		return instructions.toString();
	}
}
