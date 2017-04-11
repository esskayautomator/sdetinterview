package commonqns;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();

		String[] sarray = str.split(" ");

		HashMap<String, Integer> tiger = new HashMap<String, Integer>();

		for (String c : sarray)

		{
			if (!tiger.containsKey(c))

			{
				tiger.put(c, 1);

			}

			else {

				tiger.put(c, tiger.get(c) + 1);
			}

		}

		Set<Map.Entry<String, Integer>> entrySet = tiger.entrySet();

		for (Map.Entry<String, Integer> dup : entrySet) {

			if (dup.getValue() > 1) {

				System.out.println(dup.getValue() + " " + dup.getKey());
			}
		}

	}

}
