package warmup;

import java.util.Scanner;


public class Stairs 
{
	public static void main(String[] args) {
		
		int i,j;
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(i =0;i<=n;i++ ){
			
			for( j=0;j<=n;j++)
			{
				if((i+j)>=n){
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}
				
			}
			
		
			System.out.println(" ");
		
			
			
		}
		
		
	}

}
