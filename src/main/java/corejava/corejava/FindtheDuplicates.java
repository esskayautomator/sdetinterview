package corejava.corejava;

public class FindtheDuplicates 

{
	
	public static void main(String[] args) {
		
		
		String input = "My Name is Name";
		
		String[] words = input.split(" ");
		
		for(int i = 0; i<words.length;i++){
			for(int j =1;j<(words.length);j++){
				
				
				if(words[i].equals(words[j]))
				
				{
					if(i!=j){
					System.out.println("Duplicates are :"+ words[i]);
					}
					
					
				}
			}
			
		}
		
		
		
	}

}
