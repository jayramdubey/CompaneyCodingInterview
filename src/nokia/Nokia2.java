package nokia;

public class Nokia2 {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 1, 1, 1,0,1 };
		// O/P= 0,0,1,1,1,1
		int len = arr.length;
		sortTheGivenArray(arr, len);
		sortTheGivenArrayM2(arr, len);

	}

	private static void sortTheGivenArrayM2(int[] arr, int len) {
		int i = 0, j = len - 1;
		while (i < j) {

			if (arr[i] == 0) {
				i++;
			} else if (arr[j] == 1) {
				j--;
			} else {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}

		}
		for (i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

	private static void sortTheGivenArray(int[] arr, int len) {
		int zero = 0;
		int one = 0;
		int j = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] == 0)
				zero++;
			else if (arr[i] == 1)
				one++;
		}
		for (int i = 0; i <= zero; i++) {
			arr[i] = 0;
			j = i;
		}

		for (int i = j; i < len; i++) {
			arr[i] = 1;
		}
		
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

}
