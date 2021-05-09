package netraDyne;

import java.util.HashSet;
import java.util.Set;

public class WordBreakProblem {

	// set to hold dictionary values
	private static Set<String> dictionary = new HashSet<>();

	public static void main(String[] args) {

		// array of strings to be added in dictionary set.
		String temp_dictionary = "Iloveicecream";

		// loop to add all strings in dictionary set

		dictionary.add(temp_dictionary);

		// sample input cases
		System.out.println(wordBreak(temp_dictionary));

	}

	public static boolean wordBreak(String word) {
		int size = word.length();

		// base case
		if (size == 0)
			return true;
		for (int i = 1; i <= size; i++) {

			if (dictionary.contains(word.substring(0, i)) && wordBreak(word.substring(i, size)))
				return true;
		}

		// if all cases failed then return false
		return false;
	}
}
