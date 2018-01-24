package structure_interne;

public class CALL extends Op {

	int num;
	int argc;
	
	public CALL(int numFun, int argc) {
		this.num = numFun;
		this.argc = argc;
	}

	public int getNum() {
		return num;
	}

	public int getArgc() {
		return argc;
	}

	@Override
	public String toString() {
		return "CALL "+num+" "+argc;
	}
	
	@Override
	public String getOpName() {
		return "CALL";
	}

}
