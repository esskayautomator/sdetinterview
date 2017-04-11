package commonqns;

public class ReverseString {

	public static void main(String[] args) {

		String str = "malayalam";
		String[] chars = str.split("");

		String reverse = "";

		System.out.println(chars.length);

		for (int i = chars.length - 1; i >= 0; i--) {

			reverse = reverse + chars[i] ;

		}
	System.out.println(reverse);
	if(str.equals(reverse))
	{
		System.out.println("True");
	}
	
	else{
		System.out.println("False");
	}
	
	
	
		
		

	}
}
