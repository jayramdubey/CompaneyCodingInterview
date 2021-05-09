package accolite_java;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharTest {

	public static void main(String[] args) {
		String str = "ababcd";
		uniqueChar(str);
	}

	private static void uniqueChar(String str) {
		int len = str.length();
		Map<Character, Integer> hm = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {

			if (hm.containsKey(ch))
				hm.put(ch, hm.get(ch) + 1);
			else
				hm.put(ch, 1);
		}
		for (char ch : str.toCharArray()) {
			if (hm.get(ch) == 1) {
				System.out.println(ch);
				break;
			}

		}
	}

}
