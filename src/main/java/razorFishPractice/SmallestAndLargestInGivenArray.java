package razorFishPractice;

import java.util.Scanner;

// Find the Largest and Smallest Number in Given Array:


public class SmallestAndLargestInGivenArray 
{
	public static void main(String[] args) {

        int[] numbers; // declaring the data type of numbers
        numbers = new int[3]; //assigning the number of values numbers will contain
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");

        for(int counter = 0; counter<numbers.length;counter++) {
            numbers[counter] = input.nextInt();
        }

        for(int i = 0; i<numbers.length; i++) {
            if(numbers[i]<smallest)
                smallest = numbers[i];
            else if(numbers[i]>largest)
                largest = numbers[i];
        }

        System.out.println("Largest is "+largest);
        System.out.println("Smallest is "+smallest);
    }


}
