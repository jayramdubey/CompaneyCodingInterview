package saggezza;

public class RemoveOneElemenProductMax {

	public static void main(String[] args) {

		int arr[] = { -2, 3, 5,10 };
		int resultNum = findRequiredNum(arr);
		System.out.println("\nrequired number " + resultNum);
		int product=1;
		System.out.print("\nResult Array: ");
		for (int i = 0; i < arr.length; i++) { 
			if (arr[i] == resultNum) {
				arr[i] = 1;
			}
			product *=arr[i];
			System.out.print(" " + arr[i]);
		}
		
		System.out.println("\nProduct of the number " + product);
	}
	private static int findRequiredNum(int[] arr) {
		int len = arr.length;
		int min = arr[0];
		int max = arr[1];
		int noNeg = 0;
		int maxNeg = 0;
		int p = 0;
		int result = 0;
		for (int i = 0; i < len; i++) {
			if (min > arr[i]) {
				min = arr[i];
			} else if (max < arr[i]) {
				max = arr[i];
			}
			if (arr[i] < 0) {
				p++;
				if (p == 1) {
					maxNeg = arr[i];
				}

				if (maxNeg > arr[i]) {
					maxNeg = arr[i];
				}
				noNeg += 1;
			}
		}
		if (noNeg == len) {
			if (noNeg == len % 2) {
				result = max;

			} else {
				result = min;
			}

		} else if (noNeg == len % 2) {
			result = min;

		} else {
			result = maxNeg;

		}
		return result;

	}
}
