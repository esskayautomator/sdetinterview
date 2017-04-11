package hackerRank;

import java.util.Scanner;

public class JavaOutPutFormatting 

{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%3d%n", s1, x);
            
        }
       /* System.out.println("================================");

		System.out.printf("Print String %s%n","Stringis ");
		
		System.out.printf("Print integer %d%n",123);
		System.out.printf("Print double %.2f%n",12.3 );*/
	}

}
