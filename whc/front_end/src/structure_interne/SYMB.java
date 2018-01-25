package structure_interne;

import table_des_symboles.Instructions;

public class SYMB extends Op {

	int numSymb;
	
	public SYMB(Integer numSymb) {
		this.numSymb = numSymb;
	}

	public int getNumSymb() {
		return numSymb;
	}
	
	public String getCorrespondingLuaSymb() { // retourne noms de symboles predefinis pour lua
		switch (numSymb) {
			case 0 :
				return "nil";
		
			default : 
				return String.valueOf(numSymb);
		}
	}
	
	@Override
	public String toString() {
		return "SYMB " + numSymb;
	}
	
	@Override
	public String getOpName() {
		return "SYMB";
	}

	@Override
	public Instructions getCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instructions getThen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instructions getElse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instructions getIn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instructions getBoucle() {
		// TODO Auto-generated method stub
		return null;
	}

}
