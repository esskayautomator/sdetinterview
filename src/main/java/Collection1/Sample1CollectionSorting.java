package Collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;

public class Sample1CollectionSorting {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Chetan");
		al.add("Chandan");
		al.add("Anupam");
		
		Collections.sort(al);
		
		
		Iterator<String> m = al.iterator();
		
		
		while(m.hasNext())
			
		{
			System.out.println(m.next());
		}
	}
	

}
