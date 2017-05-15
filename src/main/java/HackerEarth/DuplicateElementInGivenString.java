package HackerEarth;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateElementInGivenString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();



		HashMap<Character, Integer> tiger = new HashMap<Character, Integer>();

		for( int i =0;i<str.length();i++)

		{
			char c = str.charAt(i);
			if (!tiger.containsKey(c))

			{
				tiger.put(c, 1);

			}

			else {

				tiger.put(c, tiger.get(c) + 1);
			}

		}



		for (Entry<Character, Integer> dup : tiger.entrySet()) {

			if (dup.getValue() > 1) {

				System.out.println(dup.getValue() + " " + dup.getKey());
			}
		}

	}
}