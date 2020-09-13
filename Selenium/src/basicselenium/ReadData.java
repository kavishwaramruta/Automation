package basicselenium;

import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		Xls_Reader obj= new Xls_Reader("G:\\26.05.2019\\Automation\\Selenium\\src\\basicselenium\\TestDatafile.xls");
	    
		int rows=obj.getrowcount("Sheet1");
		int cols=obj.getColumncount("Sheet1");
		
		System.out.println(rows);
		System.out.println(cols);
	
		String str=obj.getCellData("Sheet1", 1, 1);
		System.out.println(str);
		
		String str2=obj.getCellData("Sheet1", 2, "surname");
		System.out.println(str2);
		
		obj.setCellData("Sheet1", "surname", 3, "abc");
	}

}
