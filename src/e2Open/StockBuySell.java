package e2Open;

import java.util.ArrayList;
import java.util.List;

class Interval {
	int buy, sell;
}

public class StockBuySell {
	
	public static void main(String args[]) {

		StockBuySell stock = new StockBuySell();
		int price[] = { 10, 20, 200, 60, 5, 500 };
		int len = price.length;
		stock.stockBuySellM1(price, len);
		
/*		int res = stock.sndmethodBuySell(price, len);
		System.out.println(res);*/
	}

	private void stockBuySellM1(int price[], int n) {

		int maxProfit = 0;
		int buyPri = 0;
		int count = 0;
		if (n == 1) {
			return;
		}
		List<Interval> sol = new ArrayList<>();
		int i = 0;
		while (i < n - 1) {
			
			// Find Local Minima. Note that the limit is (n-2) as we are
			// comparing present element to the next element.
			while ((i < n - 1) && (price[i]>=price[i + 1]))
				i++;
			
			if (i == n - 1)
				break;

			Interval e = new Interval();
			buyPri = buyPri + price[i];
			e.buy = i++;
			// Store the index of minima

			// Find Local Maxima. Note that the limit is (n-1) as we are
			// comparing to previous element
			while ((i < n) && ( price[i - 1] <= price[i]))
				i++;

			// Store the index of maxima
			maxProfit = maxProfit + price[i - 1];
			e.sell = i - 1;
			sol.add(e);

			// Increment number of buy/sell
			count++;
		}
		int result = maxProfit - buyPri;
		System.out.println("Max profite: " + result);
		if (count == 0)
			System.out.println("There is no day when buying the stock " + "will make profit");
		else
			for (int j = 0; j < count; j++)
				System.out.println("Buy on day: " + sol.get(j).buy + "        " + "Sell on day : " + sol.get(j).sell);

		return;
	}
	
	
	private int sndmethodBuySell(int[] price, int len) {

		int maxProfit = 0;
		for (int i = 1; i < len; i++) {
			while ((i < len) && (price[i] >= price[i - 1]))
				i++;
			
			if (price[i] > price[i - 1]) {
				maxProfit = maxProfit + (price[i] - price[i - 1]);
			}
		}
		return maxProfit;

	}
}