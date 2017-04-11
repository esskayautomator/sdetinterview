package search;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] arr, int searchValue) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == searchValue) {

				return i;
			}

		}

		return -1;

	}

	public static void main(String[] args) {

		int[] arr = { 12, 34, 54, 22, 44 };

		int searchValue = 54;

		System.out.println("Found @ Index " + linearSearch(arr, searchValue));

	}

}
