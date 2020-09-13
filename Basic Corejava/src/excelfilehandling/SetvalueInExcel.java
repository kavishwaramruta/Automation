package excelfilehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SetvalueInExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

String Path=System.getProperty("user.dir")+"\\src\\ExcelFileHandling\\Preksh.xls";	
FileInputStream file=new FileInputStream(Path);
		
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		Thread.sleep(1000);
		HSSFSheet Sheet=wb.getSheet("Sheet1");
		HSSRow row = sheet.getrow(56);
		if (row == null)
			row = sheet.createRow(56;)
		
		int rows=Sheet.getLastRowNum();
		HSSFRow row=Sheet.getRow(1);
		int cols=row.getLastCellNum();
		HSSFCell cell=row.getCell(0);
		
		
		cell.setCellValue("Preksh");
		FileOutputStream fileout=new FileOutputStream(Path);
		
		wb.write(fileout);
	}
}