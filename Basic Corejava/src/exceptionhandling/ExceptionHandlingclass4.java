package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingclass4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		System.out.println(a/b);
		
		Thread.sleep(4000);
		readdata("");
		divide(a,b);
		
	

	}
public static void readdata(String filepath)
{
	try {
		FileInputStream obj= new FileInputStream(filepath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void divide(int a, int b)throws ArithmeticException

{
	System.out.println(a/b);
}

public static void readdata2(String filepath) throws FileNotFoundException
{
	
		FileInputStream obj= new FileInputStream(filepath);
	
}


}
