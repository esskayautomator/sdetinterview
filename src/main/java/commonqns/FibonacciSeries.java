package commonqns;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) {
		
		
		int first= 0;
		int second =1 ;
		int next;
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int numberOfCount = scanner.nextInt();
		
		System.out.println("Fibonacci Series of Length "+numberOfCount);
		
		System.out.print(first+ ", "+second);
		for(int i =0;i<=numberOfCount;i++){
			
			
			next= first +second;
			
			first= second;
			second = next;
			
			System.out.print(", "+next);
			
			{
				
			}
		}
		
		
		
		
		
	}

}
