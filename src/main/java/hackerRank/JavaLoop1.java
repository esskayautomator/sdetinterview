package hackerRank;

import java.util.Scanner;

public class JavaLoop1 
{
	
	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i= 1; i<=10;i++){
			
	
			System.out.printf("%d%2s%2d%2s%2d%n",n ,"x",i,"=",i*n);
			//System.out.println(n + " x " + i + " = " + n * i);
		}
	}

}
