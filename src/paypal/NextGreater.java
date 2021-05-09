package paypal;

import java.util.Arrays;

public class NextGreater {

	public static void main(String[] args) {
		
		//String x = 218765
		//x1 = 251678
		//char digits[] = { '5', '3', '4', '9', '7', '6' };
		char digits[] = { '2', '1', '8', '7', '6', '5' };
		int n = digits.length;
		findNext(digits, n);
	}

	static void swap(char ar[], int i, int j) {
		char temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

	public static void findNext(char ar[], int n) {
		int i;

		for (i = n - 1; i > 0; i--) {
			if (ar[i] > ar[i - 1]) {
				break;
			}
		}
		if (i == 0) {
			System.out.println("Not possible");
		} else {
			int x = ar[i - 1], min = i;

			for (int j = i + 1; j < n; j++) {
				if (ar[j] > x && ar[j] < ar[min]) {
					min = j;
				}
			}
			swap(ar, i - 1, min);

			Arrays.sort(ar, i, n);
			System.out.print("Next number with same" + " set of digits is ");
			for (i = 0; i < n; i++)
				System.out.print(ar[i]);
		}
	}
}