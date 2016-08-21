package Collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample1Iterator 

{
	
	public static void main(String[] args) {
		
		
		
		ArrayList<String> all = new ArrayList<String>();
		all.add("Karan");
		all.add("Arjun");
		
		all.add("Kiran");
		
		
		
		Iterator<String> itr = all.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
