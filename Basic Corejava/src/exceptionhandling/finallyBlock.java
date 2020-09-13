package exceptionhandling;

public class finallyBlock {

	public static void main(String[] args)
	{
		try {
			
			int a=10;
			int b=10;
			System.out.println(a/b);
			System.out.println("testing");
		
		}catch(Exception e)
		{
			
		}finally {
			System.out.println("executing finally block");

	}

}
}
