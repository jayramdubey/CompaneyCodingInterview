package alatron;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReverseTheWord {

	public static void main(String[] args) {
		String str = "My name is Jayram";
		System.out.println(reverseWord(str));
		
	}

	private static String reverseWord(String str) {

		String words[] = str.split(" ");

		int len = words.length;

		String resString = "";

		for (int i = 0; i < len; i++) {
			String word = words[i];
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
			}
			resString = resString + revWord + " ";

		}
		System.out.println(str);

		return resString;
	}
	@Test
	public void testCase() {
		String str = "My name is Jayram";
		String expected = "yM eman si maryaJ  ";
		String actual= reverseWord(str);
		
		
		assertNotSame(expected, actual);
		assertNotNull(actual);
		assertNotSame(expected, actual);
		assertTrue(true);
		assertFalse(false);
		assertNull(null);
		

	}
}
