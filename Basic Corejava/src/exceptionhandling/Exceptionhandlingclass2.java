package exceptionhandling;

public class Exceptionhandlingclass2 
{
	public static void main(String[] args)
	{
	Exceptionhandlingclass2 obj=new Exceptionhandlingclass2();
	
	try {
		obj.test(10,0);
		
	}catch(Exception e)
	{
		System.out.println("print statement");
	}
	}
	public int test(int a,int b)
	{
		return a/b;
	}
	
	

	
}
