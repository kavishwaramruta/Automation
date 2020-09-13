package excelfilehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\ExcelFileHandling\\Preksh.xls");
		
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		Thread.sleep(1000);
		HSSFSheet Sheet=wb.getSheet("Sheet1");
		
		int rows=Sheet.getPhysicalNumberOfRows();
		HSSFRow row=Sheet.getRow(1);
		int cols=row.getLastCellNum();
		HSSFCell cell=row.getCell(0);
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
			String val=Sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(val+" ");
			}
			System.out.println();
		}
		
	}
	
}
		
		//System.out.println(val);