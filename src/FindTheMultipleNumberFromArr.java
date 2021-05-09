import java.util.HashMap;
import java.util.Map;

public class FindTheMultipleNumberFromArr {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int num = 10;
		boolean result = findAnotherMultiple(arr, num);
		System.out.println(result);
	}

	private static boolean findAnotherMultiple(int[] arr, int num) {
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {

			if (num % (hm.get(arr[i])) == 0) {
				flag = 1;
			}

		}
		if (flag == 1) {
			return true;
		}
		return false;

	}

}
