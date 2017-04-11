package commonqns;

import java.util.Scanner;

public class SumofFirstNNumbers {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		int Sum = n*(n+1)/2;
		System.out.println("Sum of first n Numbers :"+Sum);
		
		
		
		
	}

}
