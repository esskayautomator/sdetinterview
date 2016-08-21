package Collection1;

import java.util.ArrayList;
import java.util.List;

public class SampleArrayList {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(45);
		number.add(67);
		
		System.out.println(number.size());
		System.out.println(number.get(2));
		
		System.out.println("From Sample #01");
		number.remove(number.size()-1);
		for (int i = 0; i < number.size(); i++) {
			
			System.out.println(number.get(i));
			
		}
		
		
		number.remove(1);
		System.out.println("From Sample #02");
		for (Integer data: number){
			
			System.out.println(data);
			
		}
		
		
		
		List<Integer> numbers1 = new ArrayList<Integer>();
	}

}
