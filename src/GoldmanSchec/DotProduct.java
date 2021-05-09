package GoldmanSchec;

public class DotProduct {

	public static int dotProduct(int[] array1, int[] array2) {
		
		int a= array1.length;
		int b= array2.length;
		if(a!=b)
			System.out.println("Lenth is mismach ");

		int val = 2;
		int res = 0;
		for (int i = 0; i <a ; i++) {
			;
			res += array1[i] * array2[i];
		}
		return res;
	}

	/**
	 * boolean doTestsPass() Returns true if all the tests pass. Otherwise
	 * returns false.
	 */
	public static boolean doTestsPass() {

		int[] array1 = { 4, 4 };
		int[] array2 = { 4, 4 };
		int result = dotProduct(array1, array2);
		StringBuilder sb = new StringBuilder();
		if (result == 8) {

			System.out.println("Test 1 passed.");
			return true;
		} else if (result == 18) {
			System.out.println("Test 2 passed.");
			return true;
		}

		else if (result == 32) {
			System.out.println("Test 3 passed.");
			return true;
		} else {
			System.out.println("Test failed.");

			return false;
		}
	}

	public static void main(String[] args) {
		doTestsPass();
	}
}
