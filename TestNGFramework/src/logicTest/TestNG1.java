package logicTest;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNG1 
{

	@Test(priority=2)
	public void test2()
	{
		System.out.println("Test2");
		
	 Assert.assertEquals("anand", "anand");
	
	}
	@Test(priority=1)
	public void test3() {
		System.out.println("Test3");
	}
	
	@Test(priority=3)
public void test1()
{
	System.out.println("Test1");
}
}
