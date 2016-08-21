package corejava.corejava;

public class PassingArraytoMethod

{
	
	
	public static void testArry (double[] test)
	
	
	{
		
		for(double element : test){
			System.out.println(element);
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		
		
		testArry(new double [] {12, 3, 44.5});
		
	}

}
