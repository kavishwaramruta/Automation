package excelfilehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] values= {
				{"name","surname","address"},
				{"amruta","joshi","pune"},
				{"anuj","joshi","pune1"},
		}
		String Path=System.getProperty("user.dir")+"\\src\\ExcelFileHandling\\Preksh.xls";	
		FileInputStream file=new FileInputStream(Path);
				
				HSSFWorkbook wb=new HSSFWorkbook(file);
				
				Thread.sleep(1000);
				HSSFSheet Sheet=wb.getSheet("Sheet2");
				
				for(int r=0; r<values.length;r++)
				{
					
				HSSRow row = sheet.getrow(56);
				if (row == null)
					row = sheet.createRow(r);
				    for(intc=0; c<values[0].length; r++)
				    {
				    	
				
				int rows=Sheet.getLastRowNum();
				HSSFRow row=Sheet.getRow(1);
				int cols=row.getLastCellNum();
				HSSFCell cell=row.getCell(0);
				
				
				cell.setCellValue("Preksh");
				FileOutputStream fileout=new FileOutputStream(Path);
				
				wb.write(fileout);
			}
		}
				
		}

	}

}
