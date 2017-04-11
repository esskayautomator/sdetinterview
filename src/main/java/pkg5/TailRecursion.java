package pkg5;

public class TailRecursion {
	
	
	public  static int factorial(int n, int result){
		
		
		if(n==0) return result;
		return factorial(n-1, result*n);
	}
	
	
	public static void main(String[] args) {
		
		
		//factorial(10, result);
	}

}
