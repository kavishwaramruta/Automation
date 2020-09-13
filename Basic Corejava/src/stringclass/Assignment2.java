package stringclass;

public class Assignment2 {

	public static void main(String[] args) {
		String str="anand";
	    int count = 0;
for(int i=0; i<str.length(); i++)
{
	if(str.substring(i, i+1).equals("a"))
	{
		count++;
	}
}
System.out.println(count);
}
}
