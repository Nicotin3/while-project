package structure_interne;

public class CALL extends Op {

	private int num;
	private int nb_param;
	
	public CALL(int numFun,int nb_param) {
		this.num = numFun;
		this.nb_param=nb_param;
	}

	public int getNum() {
		return num;
	}
	
	/**
	 * @return the nb_param
	 */
	public int getNb_param() {
		return nb_param;
	}


	@Override
	public String toString() {
		return "CALL "+num+" "+nb_param;
	}
	
	@Override
	public String getOpName() {
		return "CALL";
	}
}
