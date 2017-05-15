package commonqns;

import java.util.Scanner;

public class PrimeNumberGenerator 

{
	
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		
		
		for(int i =1;i<K; i++){
			
			for(int j =2; j<=i;j++){
				
				if(i==j){
					
					System.out.print(i + " ");
				}
				if(i%j==0){
					
					break;
				}
				
				
			}
		}
		
		
	}
	
	

}
