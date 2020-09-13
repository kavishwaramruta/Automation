package oopsinheritance;

public class user {

	public static void main(String[] args)
	{
		Smartphones phone=new Smartphones();
		phone.internet();
		phone.texting();
		phone.calling();
		
		Telephone obj=new Telephone();
		obj.calling();
		
		Telephone tel=new Telephone();
		tel=new Mobile();
		tel=new Smartphones();
		

	}

}
