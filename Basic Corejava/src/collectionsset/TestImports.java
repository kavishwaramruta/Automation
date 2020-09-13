package collectionsset;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;

public class TestImports {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Path=System.getProperty("user.dir")+"\\src\\ExcelFileHandling\\Test.xls";
FileInputStream fs=new FileInputStream(Path);
HSSFWorkbook wb=new HSSFWorkbook(fs);
HSSFSheet sheet=wb.getSheet("Sheet1");


int row=sheet.getLastRowNum();
for(int i=0;i<row;i++)
{
	HSSFRow row1=sheet.getRow(i);
	int cols=row1.getLastCellNum();
	for(int j=0;j<cols;j++)
	{
		HSSFCell cell=row1.getCell(j);
		cell.setCellValue("Preksh");
	}
}


	}

}
