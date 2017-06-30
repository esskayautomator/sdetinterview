package SDET;

public class SumOfMAX 
{
	
	
	public static int sumMax(int[] k)
	{
		
		int first = k[0];
		
		int second =k[1];
		for (int i =2; i<k.length;i++)
		{
			if (k[i]>first){
				
				second = first;
				first = k[i];
				
			}
			
			if (k[i]> second && k[i]!=first)
			{
				second = k[i];
				
			}
		
			
			
			
			
		}
		return first + second;
		
	}
	
	public static void main(String[] args) 
	{
		
		int[] k ={1,3,5,6,7,8,8};
		
		;
		
		System.out.println(sumMax(k));
		
	}

}
