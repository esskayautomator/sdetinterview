package razorFishPractice;

public class ExcelString2 
{
	public static String convertToTitle(int n) {
	    if(n <= 0){
	        throw new IllegalArgumentException("Input is not valid!");
	    }
	 
	    StringBuilder sb = new StringBuilder();
	 
	    while(n > 0){
	        n--;
	        
	        char ch = (char) (n % 26 + 'A');
	        n =n/ 26;
	        sb.append(ch);
	    }
	 
	    sb.reverse();
	    return sb.toString();
	}
	
	public static void main(String[] args) {
		
		
		int k = 700;
		System.out.println(convertToTitle(k));
		
		
	}

}
