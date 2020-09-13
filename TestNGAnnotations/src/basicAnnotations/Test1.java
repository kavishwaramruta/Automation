package basicAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test1 {
	@BeforeTest
	public void beforeTest2()
	{
		System.out.println("Before Test1");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After test 1");
	}


}
