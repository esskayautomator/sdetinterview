package HackerEarth;
import java.util.HashSet;
import java.util.Scanner;

public class LongestString 
{

	
	public static int lengthOfLongestSubstring(String s) {
	    if(s==null || s.length()==0)
	        return 0;
	 
	    HashSet<Character> set = new HashSet<Character>();
	 
	    int max=0;
	 
	    int i=0;
	    int start=0;
	    while(i<s.length()){
	        char c = s.charAt(i);
	        if(!set.contains(c)){
	            set.add(c);
	        }else{
	            max = Math.max(max, set.size());
	 
	            while(start<i&&s.charAt(start)!=c){
	                set.remove(s.charAt(start));
	                start++;
	            }
	            start++;
	        }
	 
	        i++;
	    }
	 
	    max = Math.max(max, set.size());
	 
	    return max;
	}
	
	public static void main(String[] args) 
	{
	
			
		
		Scanner scan = new Scanner(System.in);
        int queries = scan.nextInt();
        for(int i=0;i<queries;i++){
            String s = scan.next();
            int result = lengthOfLongestSubstring(s);
            System.out.println(result);

                  }
      
		
		
	}
}
