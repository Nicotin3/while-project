package structure_interne;

public class AFFECT extends Op{
	String name;
	
	public AFFECT(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "AFFECT "+ name;
	}
	
	public String getOpName() {
		return "AFFECT";
	}
	
}
