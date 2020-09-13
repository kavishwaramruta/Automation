package basicAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test2 {
	@BeforeTest
	public void beforeTest2()
	{
		System.out.println("Before Test2");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After test 2");
	}

}
