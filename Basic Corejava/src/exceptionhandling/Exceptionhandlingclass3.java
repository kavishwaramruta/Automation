package exceptionhandling;

import oops.abstractions.RBI;

public class Exceptionhandlingclass3 {

	public static void main(String[] args) throws InterruptedException {
	try {	// Exception type1:Unchecked Exception
		int a=10;
		int b=10;
		
		System.out.println(a/b);
		
		RBI obj=null;
		//obj.creditCard();
		
		String str="anand";
		System.out.println(str.charAt(5));
		
		System.out.println("anand");
		Thread.sleep(3000);
		System.out.println("bhayre");
		Test.login();
	}catch(ArithmeticException e)
	{
		System.out.println("Divident is zero");
	}catch(NullPointerException e)
	{
		System.out.println("RBI reference is not initialized");
	}catch(RuntimeException e)
	{
        System.out.println(e.getMessage());
	}

}
}
