package bloomGlobalGrayOrange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortNumberOfZeroAndOne {
	public static void main(String[] args) {

		Integer arrA[] = { 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		ArrayList<Integer> arr = new ArrayList(Arrays.asList(arrA));
		int n = minMoves(arr);
		System.out.println(n);
	}

	private static int minMoves(ArrayList<Integer> arr1) {

		Integer[] arr = arr1.toArray(new Integer[arr1.size()]);
		int n = arr1.size();

		int numberOfOnes = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 1)
				numberOfOnes++;
		}

		int x = numberOfOnes;

		int count_ones = 0, maxOnes;

		for (int i = 0; i < x; i++) {
			if (arr[i] == 1)
				count_ones++;
		}

		maxOnes = count_ones;
		for (int i = 1; i <= n - x; i++) {

			if (arr[i - 1] == 1)
				count_ones--;

			if (arr[i + x - 1] == 1)
				count_ones++;

			if (maxOnes < count_ones)
				maxOnes = count_ones;
		}

		int numberOfZeroes = x - maxOnes;

		return numberOfZeroes;
	}

}