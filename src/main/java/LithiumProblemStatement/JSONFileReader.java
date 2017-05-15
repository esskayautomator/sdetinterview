package LithiumProblemStatement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONFileReader 
{
	private	static ObjectMapper mapper ;
		public static void main(String[] args) {

		JSONParser parser = new JSONParser();
		
		File f = new File("src/main/java/LithiumProblemStatement/JsonFlie.txt");
		Object obj =null;
		try 
	
		
		{
			 obj = parser.parse(new FileReader(f.getAbsolutePath()));
			 
		}
		
		 catch (FileNotFoundException e) {e.printStackTrace();}
		 catch (IOException e) {e.printStackTrace();}
		 catch (Exception e) {e.printStackTrace();}
		
		JSONObject jsonObject = (JSONObject) obj;
		
		mapper = new ObjectMapper();
		//Example example = mapper.readValue(jsonObject.toString(), Example.class);
		 
		 
	} 



	
	
	} 

	


