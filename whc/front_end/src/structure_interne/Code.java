package structure_interne;

public class Code {
	private Op op;
	private Addr res, left, right;
	
	public Code(Op op, Addr res, Addr left, Addr right) {
		// TODO Auto-generated constructor stub
		this.op = op;
		this.res = res;
		this.left = left;
		this.right = right;
	}

}
