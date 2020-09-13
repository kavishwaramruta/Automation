package basicAnnotations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;

public class TestClass1 
{
	@Test
	public void testcase1()
	{
		System.out.println("Test Case 1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("Test Case 2");
	}
	@Test
	public void testcase3()
	{
		System.out.println("Test Case 3");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method class 1");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After method class 1");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class 1");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("Afetr Class 1");
	}
	
}
