package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import configuration.Configue;
import libraries.ApplicationLibraries;
import pages.HomePage;
import utilities.Xls_Reader;

public class TestScript1 {
	
	//SoftAssert asser;
	
	/*
	 * @BeforeClass public void setup() { asser=new SoftAssert(); }
	 * 
	 * @AfterClass public void teardown() { asser.assertAll(); }
	 */

	@Test(dataProvider="getdata2")
	public void LoginTest(String username, String password, String title)
	{
		SoftAssert asser=new SoftAssert();
		
		  ApplicationLibraries lib= new ApplicationLibraries();
		 
		  WebDriver dr=lib.LaunchBrowser();
		  
		  HomePage page1=new HomePage(dr);
		  
		  page1.login(username, password);
		  
		 // Assert.assertEquals(dr.getTitle(), title);
		  
		/*
		 * System.out.println(title);
		 * 
		 * System.out.println(dr.getTitle());
		 * 
		 * System.out.println("**********");
		 */
		  asser.assertEquals(dr.getTitle(), title);
		  
		  dr.quit();
		 
		  asser.assertAll();
	}
	
	
	@DataProvider
	public String[][] getdata2() throws IOException
	{
		
		Xls_Reader obj= new Xls_Reader(Configue.testData);
	    
		int rows=obj.getrowcount("testdata");
		int cols=obj.getColumncount("testdata");
		
		String[][] data=new String[rows-1][cols];
		
		for (int r=2; r<=rows; r++)
		{
			for (int c=1; c<=cols; c++)
			{
				data[r-2][c-1]=obj.getCellData("testdata", r, c);
			}
			
			}
		return data;
		}
		
		

}
