package postAkamai;

import java.util.LinkedHashMap;

public class LongestSubString 
{  
    static void longestSubstring(String inputString)
    {
        //Convert inputString to charArray
         
        char[] charArray = inputString.toCharArray();
         
        //Initialization
         
        String longestSubstring = null;
         
        int longestSubstringLength = 0;
         
        //Creating LinkedHashMap with characters as keys and their position as values.
         
        LinkedHashMap<Character, Integer> tiger = new LinkedHashMap<Character, Integer>();
         
        //Iterating through charArray
         
        for (int i = 0; i < charArray.length; i++) 
        {
            char ch = charArray[i];
         
            //If ch is not present in tiger, adding ch into tiger along with its position
             
            if(!tiger.containsKey(ch))
            {
                tiger.put(ch, i);
                System.out.println("Value Storing is "+i);
            }
             
            //If ch is already present in tiger, reposioning the cursor i to the position of ch and clearing the tiger
             
            else
            {    
                i = tiger.get(ch);
              
                
                System.out.println("Data we got when whe had done get ch "+i);
                 
                tiger.clear();
            }
             
            //Updating longestSubstring and longestSubstringLength
             
            if(tiger.size() > longestSubstringLength)
            {
                longestSubstringLength = tiger.size();
                 
                longestSubstring = tiger.keySet().toString();
            }
        }
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("The longest substring : "+longestSubstring);
         
        System.out.println("The longest Substring Length : "+longestSubstringLength);
    }
     
    public static void main(String[] args) 
    {    
        longestSubstring("kiransk");
         
        System.out.println("==========================");
         
    }
}