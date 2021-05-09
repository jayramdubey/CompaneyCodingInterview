package accolite_java;

public class ReverseStr {

	public static void main(String[] args) {

		String str = "jayram";
		String result = reverseRecursively(str);
		System.out.println(" Reverse the string : "+ result);

	}

	public static String reverseRecursively(String str) {

		if (str.length() < 2) {
			return str;
		}

		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}
}
