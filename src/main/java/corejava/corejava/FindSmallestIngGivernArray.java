// Find the Largest Number in the Given Array:


package corejava.corejava;

public class FindSmallestIngGivernArray 
{
	
	public static void main(String[] args) {
		
		
		double[] doubleArray = {1.2 , 1.8, 12.1,2};
		

			
		
		for(double mytest: doubleArray)
		{
			System.out.println(mytest);
		}
		System.out.println("----------------------");
		
		double largest= doubleArray[0] ;
		
	
		for( int i =0; i< doubleArray.length;i++)
		{	
			
			
			
			if(largest< doubleArray[i])
			
			
				largest=doubleArray[i];
				
		
		
			
			
		
	
		
			
		}
	
		
		
		System.out.println(largest);
	}

}
