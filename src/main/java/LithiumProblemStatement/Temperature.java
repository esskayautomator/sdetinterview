package LithiumProblemStatement;


/**
 * Created by grofers-air on 26/10/16.
 */
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Properties;

//import static org.apache.log4j.helpers.Loader.getResource;

public class Temperature {
    private static ObjectMapper mapper;
    public static void main(String[] args) throws IOException, URISyntaxException {

        JSONParser parser = new JSONParser();

        double high=0;
        int high_day = 0;

        File f = new File("src/main/java/LithiumProblemStatement/JsonFlie.txt");
       // System.out.println(f.getAbsolutePath());

            Object obj = null;
            try {
               // obj = parser.parse(new FileReader("/Users/grofers-air/cms-api/src/main/resources/jsonFile.txt"));
                obj = parser.parse(new FileReader(f.getAbsolutePath()));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }

            JSONObject jsonObject = (JSONObject) obj;
            mapper = new ObjectMapper();

            Example example = mapper.readValue(jsonObject.toString(), Example.class);

            for(Day day : example.getDays()){
                double temp = day.getHigh() - day.getLow();
                if (temp > high){
                    high = temp;
                    high_day = day.getDay();
                }
            }

        System.out.println("Largest temperature spread = "+high+" and day = "+high_day);

    }
}