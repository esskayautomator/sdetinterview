package razorFishPractice;

public class PeakElement 
{
	
	public static void main(String[] args) 
	{
		
		int[] p = {100, 12, 112, 3443,11};
		
		int min = Integer.MAX_VALUE;
		
		
		
		for (int i =0; i<p.length-1;i++)
		{
			
			if ( p[i] > p[i+1]){
				
				int minima =	Math.min(p[i], min);
				System.out.println("Peak Element is "+p[i]);
			}
			

			
			
		}
		
	}

}
