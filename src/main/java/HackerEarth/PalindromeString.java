package HackerEarth;

/*
 * You have been given a String 
S
S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

Input Format
The first and only line of input contains the String 
S
S. The String shall consist of lowercase English alphabets only.

Output Format
Print the required answer on a single line.

Constraints 
1
≤
|
S
|
≤
100
1≤|S|≤100

Note
String 
S
S consists of lowercase English Alphabets only.
 * 
 * 
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


import java.util.*;


class PalindromeString {
    public static void main(String args[] ) throws Exception {
       
       
        Scanner s = new Scanner(System.in);
        String reader = s.next();
        String[] str = reader.split("");
        
        String temp = "";
        
        int N = str.length;

        for (int i = N-1; i >= 0; i--) {
            
            temp = temp+ str[i];
            
        }
        

        if(reader.equalsIgnoreCase(temp)){
        	System.out.println("YES");
        }
        else {
        	System.out.println("NO");
        }
    }
}

