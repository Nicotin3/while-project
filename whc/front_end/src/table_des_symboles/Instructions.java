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
		return instructions.toString();
	}
}
