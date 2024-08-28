package excelread;

import java.io.IOException;

public class Excelread_pgm2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String y = ExcelRead1_Exp.getstringdata(1, 0);
		System.out.println(y);
		String z= ExcelRead1_Exp.getintegerdata(1, 1);
		System.out.println(z);
	}

}
