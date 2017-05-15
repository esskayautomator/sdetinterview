package HackerEarth;

import java.util.Scanner;

public class ZeroBack 
{
	

		   int[] array;
		   void shiftZeroes(int[] array) {

		       int second = 0;
		       int first = 0;

		       for(int k = 0; k < array.length - 1; k++) {

		           if(array[k] == 0 && array[k + 1] != 0 && first != 0) {
		               int temp = array[second];
		               array[second] = array[k + 1];
		               array[k + 1] = temp;
		               second = second + 1;
		               continue;
		           }

		           if(array[k] == 0 && array[k + 1] != 0) {
		              int temp = array[k];
		              array[k] = array[k + 1];
		              array[k + 1] = temp;
		              continue;
		           }

		           if(array[k] == 0 && array[k + 1] == 0) {
		               if(first == 0) {
		                   second = k;
		                   first = 1;
		               }
		           }

		      }
		  }

		  int[] input(Scanner scanner, int size) {
		      array = new int[size];
		      for(int i = 0; i < size; i++) {
		          array[i] = scanner.nextInt();
		      }
		      return array;
		  }

		  void print() {
		      System.out.println();
		      for(int i = 0; i < array.length; i++) {
		          System.out.print(array[i] + " ");
		      }
		      System.out.println();
		  }

		  public static void main(String[] args) {
		      Scanner scanner = new Scanner(System.in);
		      ZeroBack sztb = new ZeroBack();
		      System.out.print("Enter Size of Array\t");
		      int size = scanner.nextInt();
		      int[] input = sztb.input(scanner, size);
		      sztb.shiftZeroes(input);
		      sztb.print();
		  }

		}


