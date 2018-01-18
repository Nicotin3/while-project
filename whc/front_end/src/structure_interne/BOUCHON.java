package structure_interne;

public class BOUCHON extends Op {

	String name;
	
	public BOUCHON(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "BOUCHON " + name;
	}

	public String getOpName() {
		return "BOUCHON";
	}
}
