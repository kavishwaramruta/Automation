package functions;

public class funfunction {

	public static void main(String[] args)
	{
		int add=sum(10,20);
		int add2=sum(30,40);
		System.out.println(add);
		System.out.println(add2);
		System.out.println(add+add2);
		
		funfunction ref= new funfunction();
		
		ref.message("ajd");
	}
       public static int sum(int a, int b)
       
       {
    	  
    	return a+b;
       }

       public void message(String message)
       
       {
    	   System.out.println("your message is "+message);
       }
}