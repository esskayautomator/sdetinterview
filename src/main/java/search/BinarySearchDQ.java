package search;

public class BinarySearchDQ {

	public static int binarySearch(int[] list, int key) {

		int start = list[0];
		int end = list[list.length - 1];
		int mid;

		while (start <= end)

		{
			mid = (start + end) / 2;
			if (key == list[mid]) {
				return mid;
			}

			if (key < list[mid]) {

				end = mid - 1;
			}

			else {
					
				start = mid + 1;
			}

		}

		while (start <= end) {

		}

		return -1;

	}

	public static void main(String[] args) {
		int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int key = 9;

		System.out.println("The Key Value Index Is " + binarySearch(list, key));

	}
}
