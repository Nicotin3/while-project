package production;

import table_des_symboles.Table;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table table_globale = new Table();
		table_globale.add_function("f", 2, 3);
		int res[] = table_globale.get_function("f");
		for (int i = 0; i < res.length; i++)
			System.out.println(res[i]);

	}

}
