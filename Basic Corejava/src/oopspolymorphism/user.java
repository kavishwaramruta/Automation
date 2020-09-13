package oopspolymorphism;

public class user {

	public static void main(String[] args) 
	{
		functions obj= new functions();
		int sum=obj.sum(10,20);
		System.out.println(sum);
		sum=obj.sum(10,20,30);
		System.out.println(sum);

	}
	
	

}
