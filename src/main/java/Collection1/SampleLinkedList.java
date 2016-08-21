package Collection1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SampleLinkedList 
{
	
	public static void main(String[] args) 
	
	{
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		// If u want two use Item at the End 
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		//If u want to add or remove item anywhere else, Use 
		
		doTimings("Array List", arrayList);
		
		doTimings("Linked List", linkedList);
		
	}

	
	private static void doTimings(String Type, List<Integer> list  )
	
	{
		
		
		
	}
}
