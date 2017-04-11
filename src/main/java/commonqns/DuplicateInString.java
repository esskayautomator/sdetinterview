package commonqns;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateInString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		String str=scanner.nextLine();

		HashMap<Character, Integer> tiger = new HashMap<Character, Integer>();

		// Character as Key and Integer as Number of Occurrence

		char[] carray = str.toCharArray();

		for (char c : carray) {

			if (!tiger.containsKey(c)) {

				tiger.put(c, 1);
			} else {
				tiger.put(c, tiger.get(c) + 1);
			}

			Set<Map.Entry<Character, Integer>> entrySet = tiger.entrySet();

			for (Map.Entry<Character, Integer> dup : entrySet) {

				if (dup.getValue() > 1) {

					System.out.println(dup.getKey() + " : " + dup.getValue());
				}

			}

		}

	}

}
