package oopspolymorphism;

public class NoDirectObject
{
	int age;
	private static NoDirectObject obj=new NoDirectObject();
	
   private NoDirectObject()
   
   {

   }
public static NoDirectObject getobject()

{
	return obj;
}


}