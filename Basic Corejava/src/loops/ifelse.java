package loops;
import java.util.Scanner;

public class ifelse {
	
	void evenodd()
	{
		System.out.println("please enter a no");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		if(number%2==0)
		{
		System.out.println("even number");
		
		}
		else {
			System.out.println("odd number");
		}
	}
	public static void main(String[]args) {
		ifelse x = new ifelse();
		x.evenodd();
	}
	}


