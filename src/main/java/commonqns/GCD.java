package commonqns;

import java.util.Scanner;

public class GCD {

	public static int gcdCalculator(int m, int n) {
		
		//System.out.println(m+" "+n);
		int r;
		
		if (m > n) {
			r = m % n;
			if (r == 0) {

				 
				System.out.println("Value of GCD "+n);
			}

			else {

				m = n;
				n = r;
				gcdCalculator(m, n);

			}

		}



	return n;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		System.out.println(gcdCalculator(m, n));

	}

}
