package razorFishPractice;

public class StockProfitBuyandSell

{

	public static void main(String[] args) {
		int A[] = { 5, 10, 4, 6, 12 };

		int min = A[0]; // Lets assume first element is minimum
		int maxProfit = 0; // 0 profit, if we buy & sell on same day.
		int profit = 0;

		// Run the loop from next element

		for (int i = 1; i < A.length; i++) {
			// Keep track of minimum buy price & index
			if (A[i] < min) {
				min = A[i];

			}
			profit = A[i] - min;
			// If new profit is more than previous profit, keep it and update
			// the max index
			if (profit > maxProfit) {
				maxProfit = profit;

			}
		}

		System.out.println("maxProfit is " + maxProfit);

	}
}
