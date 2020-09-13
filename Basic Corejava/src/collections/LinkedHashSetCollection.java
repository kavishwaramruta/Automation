package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;


public class LinkedHashSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet<>();
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
