package HackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

class ToggleString {
    public static void main(String args[] ) throws Exception 
    
    
        
        {
            
            
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String reader = br.readLine();
            
            
            for(int i =0; i <reader.length(); i++){
                
                char c = reader.charAt(i);
                
                if ( c>='a' && c<='z' )
                {
                    System.out.print( (c= (char) (c-32)));
                    
                }
                
                else {
                    System.out.print(c=(char) (c+32));
                }
                
                
                
            }
           
          
            
        }
    }
