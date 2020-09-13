package functions;

public class AccessModifiers {

	public static void main(String[] args)
	{
		AccessModifiers obj= new AccessModifiers();
		obj.Publicmethod();
		obj.Privatemethod();
		obj.noaccessmethod();

	}

	//public method
	
	public void Publicmethod()
	{
		System.out.println("public method");
	}
	
	//private method
	
	private void Privatemethod()
	{
		System.out.println("public method");
	}
	
	//noaccess method
	
	 void noaccessmethod()
	{
		System.out.println("public method");
	}
	
	//protected method
	
	protected void protectedmethod()
	{
		System.out.println("public method");
	}
	
	
}
