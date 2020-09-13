package collections;

	
	import java.util.Vector;

	public class VectorCollections
	
	{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Vector<String> list=new Vector<>();
			list.add("Name");
			list.add("Surname");
			list.add("Address");
			list.add("Name");
			list.add("Surname");
			list.add("Address");
			
			//System.out.println(list.get(0));
			
			for(String s:list)
			{
				System.out.println(s);
			}
			
			System.out.println(list.size());
		}

	}


