package stringclass;

public class stringmethod {

	public static void main(String[] args) {
		String s1 = "my name is Rajkumar";
		
		int strlength=s1.length();
		System.out.println(s1.length());
		
		int charlength=s1.charAt(3);
		System.out.println(s1.charAt(3));
		
		String substring=s1.substring(6);
		System.out.println(s1.charAt(6));
		
		String substring2=s1.substring(3, 6);
		System.out.println(substring2);
		
		boolean b=s1.contains("Raj");
		System.out.println(b);
		
		boolean c=s1.equals("Rajkumar");
		System.out.println(c);
		
		String date=String.join(":","25","06","2018");
		System.out.println(date);
		
		int a=s1.indexOf("a");
		System.out.println(s1.indexOf("a"));
		
	    int l=s1.lastIndexOf(a);
	    System.out.println(l);
		
	    
		
		String[]s2=s1.split(" ");
		
		for(String s3:s2)
		{
		//	System.out.println(s3);
		}
	    
	//	System.out.println(s1.replace("Rajkumar", "new rajkumar"));
	//	System.out.println(s1.toUpperCase());
	//	System.out.println(s1.toUpperCase());
		
	}

}
