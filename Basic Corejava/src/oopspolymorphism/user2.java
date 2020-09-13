package oopspolymorphism;

public class user2 {

	public static void main(String[] args) 
	{
		NoDirectObject obj= NoDirectObject.getobject();
		obj.age=30;
		
		NoDirectObject obj2= NoDirectObject.getobject();
		obj2.age=32;
		
		System.out.println(obj2.age);
		System.out.println(obj.age);
		

	}

}
