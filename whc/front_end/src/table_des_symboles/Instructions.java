package table_des_symboles;

import java.util.ArrayList;
import java.util.List;

import structure_interne.Quadruplet;

public class Instructions {
	List<Quadruplet<String, String, String, String>> instructions;
	
	public Instructions() {
		instructions = new ArrayList<Quadruplet<String, String, String, String>>();
	}
	
	public void add_instruction(Quadruplet<String, String, String, String> instr) {
		instructions.add(instr);
	}
	
	public List<Quadruplet<String, String, String, String>> get_instructions() {
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
