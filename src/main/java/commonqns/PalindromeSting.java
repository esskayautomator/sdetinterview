package commonqns;

public class PalindromeSting {

	public static void main(String[] args) {

		String str = "stats";

		StringBuilder builder = new StringBuilder(str);
		StringBuilder reverese = builder.reverse();

		if (str.equals(reverese.toString())) {

			System.out.println("Palindrom");
		}

		else {

			System.out.println("Not");
		}

	}

}
