package corejava.corejava;
public class RemoveDuplicatesWords
{
 
	public static void main(String args[])
	{
		System.out.println("Input String");
		String input="Welcome to java programming programming";

	
		// split text to array of words
		String[] words = input.split(" ");
 
		// clean duplicates
		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words.length; j++)
			{
				if (words[i].equals(words[j]))
				{
					if (i != j)
					{
						System.out.println("The Duplicate is "+words[i]);
					}
 
				}
			}
		}}}
		
	
