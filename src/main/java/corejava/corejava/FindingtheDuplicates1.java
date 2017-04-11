package corejava.corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class FindingtheDuplicates1 
{
	public static void main(String[] args) {
		
	String text= "This is Kiran Sk and my Name is Kiran";
	String[] words = text.split(" ");
	Map<String, String> mapWord = new HashMap<String, String>();
	System.out.println("First "+mapWord.get(words));
	for(int i =0;i<words.length;i++){
		
		
		String word = words[i];
		//System.out.println(words[i]);
		System.out.println(mapWord.get(word));
		if(mapWord.get(word)!=null){
			
			System.out.println("Duplicate Element is :"+word);
			
		}
		else{
			

			
			mapWord.put(word, word);
			
		}
	}

	
	

	
	 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
