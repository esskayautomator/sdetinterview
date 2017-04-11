package sorting;

public class InsertionSortExample {

	// All the Items to the left are smaller

	public static int[] insertionSort (int[] list) {
		int i, j, key, temp;
		for (i = 0; i <= list.length-1; i++) {
			
			// Every time One Iteration is less 
			key = list[i];
			j = i - 1;// Because U are comparing to left side
			while (j >= 0 && key < list[j]) {
				temp = list[j];
				list[j] = list[j +1];
				list[j+1] = temp;
				j--;
			}
		}
		return list;
	}

	public static void main(String[] args) {

		int[] list = { 5, 8, 1, 3, 9, 6 };

		insertionSort(list);

		for (int sortedList : list) {
			System.out.print(sortedList + ", ");

		}

	}
}
