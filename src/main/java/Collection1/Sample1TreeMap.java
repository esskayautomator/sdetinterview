package Collection1;

import java.util.Map;
import java.util.TreeMap;

public class Sample1TreeMap {

	
	public static void main(String[] args) {
		
		
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(100, "Kiran");
		tm.put(101, "Kiran1");
		tm.put(102, "Kiran2");
		tm.put(103, "Kiran3");
		tm.put(104, "Kiran4");
		
		
		for(Map.Entry m : tm.entrySet())
		{
			System.out.println(m.getValue()+""+m.getKey()+"");
		}
		
	}
}
