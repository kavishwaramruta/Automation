package logicTest;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configuration.Configue;
import utilities.Xls_Reader;


public class dataproviderconcept 
{
	@Test(dataProvider="getdata2")
	public void LoginTest(String username, String password)
	{
		System.out.println("Enter Username="+username);
		System.out.println("Password="+password);
		System.out.println("Login Successful");
		System.out.println("**************************");
	}
	
	@DataProvider
	public String[][] getdata()
	{
		
		String[][] data= new String[3][2];
		
		data[0][0]="user1";
		data[0][1]="password1";
		
		data[1][0]="user2";
		data[1][1]="password2";
		
		data[2][0]="user3";
		data[2][1]="password3";
		
		return data;
		
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

