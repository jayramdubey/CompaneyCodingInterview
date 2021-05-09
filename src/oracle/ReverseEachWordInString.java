package oracle;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str = "My name is jayram dhar dubey";
		String words[] = str.split("\\s");

		reverse(words);
	}

	private static void reverse(String[] words) {
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb + " ";

		}
		System.out.println(reverseWord);
	}

}
