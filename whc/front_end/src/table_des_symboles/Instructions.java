package table_des_symboles;

import java.util.ArrayList;
import java.util.List;

import structure_interne.Quadruplet;

public class Instructions {
	List<Quadruplet<String, String, String, String>> instructions = new ArrayList<Quadruplet<String, String, String, String>>();
	
	public void add_instruction(Quadruplet<String, String, String, String> instr) {
		instructions.add(instr);
	}
	
	public List<Quadruplet<String, String, String, String>> get_instructions() {
		return instructions;
	}
}
