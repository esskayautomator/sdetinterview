package HackerEarth;









import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.util.*;


class FindFactorial {
    public static void main(String args[] ) throws Exception {
        
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();

      System.out.println("Number to calculate the Factorial "+N);
        
      

        for (int i = N-1; i >=1; i--) {
            
          N = N * i ;
        }
        
        
        System.out.println(N);

    }
}

