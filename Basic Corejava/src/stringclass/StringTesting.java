package stringclass;

public class StringTesting {

	public static void main(String[] args)
	{
		String str="Amruta";
		String str2="Amruta";
		String test="My name is Amruta Joshi";
		
		
		//1. CharAt
		System.out.println(str.charAt(3));
		
		//2.Length
		
		System.out.println(str.length());
		
		//3.Equals
		System.out.println(str.equals(str2));
		
		//4.EqualIgnorence
		System.out.println(str.equalsIgnoreCase(str2));
		
		//5.Replace
		System.out.println(str.replace("Amruta", "Amrutak"));
		
		//6.Split
		String[] arr=test.split(" ");
		for(String s:arr)
		{
			System.out.println(s);
		}
		

	//7.Sub string
		System.out.println(str.substring(3));
		System.out.println(str.substring(2,4));
 
	}

}
