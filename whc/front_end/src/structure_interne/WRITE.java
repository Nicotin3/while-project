package structure_interne;

public class WRITE extends Op {

	String name;
	
	public WRITE(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "WRITE " + name;
	}
	
	public String getOpName() {
		return "WRITE";
	}
}
