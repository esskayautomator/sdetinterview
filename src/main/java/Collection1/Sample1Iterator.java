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
		
		all.add("Kiran");

		// By Using Iterators
		Iterator<String> itr = all.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// By using the For Each Statement
		System.out.println("________________________");

		for (String obj : all) {
			System.out.println(obj);
		}

		System.out.println("Adding addAll() Function");
		// Using addAll()

		ArrayList<String> all2 = new ArrayList<String>();
		all2.add("Rakz");
		all2.add("Kiran");


		all.addAll(all2);
		Iterator<String> itr1 = all.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("Adding removeAll() Function");
		//remove All function
		ArrayList<String> all3 = new ArrayList<String>();
		all3.add("Karan");
		all3.add("Kiran");
		
		all3.add("Rakz");
		
		all.removeAll(all3);
		for(String test:all)
		{
			System.out.println(test);
		}
		
		

		
		

	}

}
