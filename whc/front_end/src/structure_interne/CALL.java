package structure_interne;

public class CALL extends Op {

	int num;
	
	public CALL(int numFun) {
		this.num = numFun;
	}

	public int getNum() {
		return num;
	}
	
	@Override
	public String toString() {
		return "CALL "+num;
	}
	
	@Override
	public String getOpName() {
		return "CALL";
	}

}
