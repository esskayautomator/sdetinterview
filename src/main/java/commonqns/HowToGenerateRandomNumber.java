package commonqns;

import java.util.Random;

//Uing nextInt() of Random Class 

public class HowToGenerateRandomNumber {
	
	public static void main(String[] args) {
		
		
		Random random = new Random();
		System.out.println(random.nextInt(10000));
		for(int i=0;i<10;i++){
			
			System.out.println(random.nextInt(10));
			
		
		}
		
		
	}

}
