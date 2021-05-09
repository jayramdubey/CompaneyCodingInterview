package nokia;

public class Nokiya1 {
	static int count = 0;

	Nokiya1() {
		count++;
	}

	public static void main(String[] args) {
		String str = "Jayram";
		String result = reversiString(str);
		System.out.println(result);
	}

	private static String reversiString(String str) {
		String res = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		return res;
	}

}
