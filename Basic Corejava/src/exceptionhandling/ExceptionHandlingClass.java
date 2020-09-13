package exceptionhandling;

import oops.abstractions.RBI;

public class ExceptionHandlingClass {

	public static void main(String[] args) throws InterruptedException
	{
		
		int a=10;
		int b=0;
		
		System.out.println(a/b);
		
		RBI obj=null;
		obj.creditCard();
		
		String str="anand";
		System.out.println(str.charAt(5));
		
		System.out.println("anand");
		Thread.sleep(3000);
		System.out.println("bhayre");
		Test.login();
	
		

	}

}
