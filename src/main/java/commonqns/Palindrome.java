package commonqns;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int n, r=0;
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		
		while(n>0){
			int re= n%10;
			r = r*10 + re;
			n =n/10;
			
		}
		System.out.println("Reverse of Number is "+r);
		if(n==r){
			System.out.println("The Given Number is Pandrome");
		}
		
		System.out.println("The Given Number is Not Palindrome");
	}
	

}

