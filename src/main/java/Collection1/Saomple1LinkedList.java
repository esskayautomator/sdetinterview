package Collection1;

import java.util.Iterator;
import java.util.LinkedList;

public class Saomple1LinkedList 

{
	
	
	public static void main(String[] args) {
		
		
		
		LinkedList<String> all = new LinkedList<String>();
		all.add("Test");
		all.add("Test");
		
		Iterator<String> itr = all.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------------------");
		for(String obj : all)
		{
			System.out.println(obj);
		}
	}

}
