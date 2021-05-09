package Amazon;

import java.util.Arrays;

/*Write code to merge one sorted and one unsorted string arrays into one sorted array.
Sample 
Array 1 -> {“a”,”c”,“d”,”f”,”g”}
Array 2 -> {“e”,”b”,”h”}
Final array to be printed -> “a”,”b”,”c”,”d”,”e”,”f”,”g”,”h”}*/

public class MergeArray {

	public static void main(String[] args) {

		char arr1[] = { 'a', 'c', 'd', 'f', 'g' };
		char arr2[] = { 'e', 'b', 'h' };
		sortAndMergeArray(arr1, arr2);
	}

	private static void sortAndMergeArray(char[] arr1, char[] arr2) {

		int lengthArr1 = arr1.length;
		int lengthArr2 = arr2.length;
		int resultSize = lengthArr1 + lengthArr2;
		Arrays.sort(arr2);
		char result[] = new char[resultSize];
		int i = 0, j = 0, k = 0;

		while (i < lengthArr1 && j < lengthArr2) {
			if (arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				k++;
				i++;
			} else {
				result[k] = arr2[j];
				k++;
				j++;
			}
		}
		while (i < lengthArr1) {
			result[k] = arr1[i];
			k++;
			i++;
		}
		while (j < lengthArr2) {
			result[k] = arr2[j];
			k++;
			j++;
		}

		for (int p = 0; p < resultSize; p++) {
			System.out.print(result[p] + " ");
		}
	}

}
