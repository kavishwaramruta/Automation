package collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<>();
		set.add("name");
		set.add("surname");
		set.add("address");
		set.add("name");
		set.add("surname");
		set.add("address");
		
		for(String s:set)
		{
			System.out.println(s);
		}


	}

}
