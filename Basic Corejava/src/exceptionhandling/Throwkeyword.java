package exceptionhandling;

public class Throwkeyword {

	public static void main(String[] args) throws Exception 
	{
		test(10,0);
	}
	
	public static void test(int a, int b) throws Exception
	{
		if(b==0)
			throw new Exception("the value of b is zero");
		
	}

}
