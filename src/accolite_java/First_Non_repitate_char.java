package accolite_java;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class First_Non_repitate_char {

	public static void main(String[] args) {
		String str = "my name is jayram dhar dubey";

		Character res = firstNonRepitedChar(str);
		System.out.println("First non repeated characted in String is:  " + res);

	}

	private static char firstNonRepitedChar(String str) {

		Map<Character, Integer> hm = new LinkedHashMap<>();
		char arr[] = str.toCharArray();

		for (char c : arr) {

			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				if (c == ' ') {
					continue;
				}
				hm.put(c, 1);
			}
		}
		for (char c : arr) {
			if (c == ' ') {
				continue;
			}
			if (hm.get(c) == 1) {

				return c;
			}
		}
		return 0;

	}

	@Test
	public void testCase() {
		String str = "my name is jayram dhar dubey";
		char expected = 'n';
		int arr[] = { 1, 2, 3, 4, 5 };
		Integer arr2[] = { 1, 2, 3, 4, 5 };
		char exual = firstNonRepitedChar(str);
		assertEquals(expected, exual);
		assertNotNull(exual);
		assertSame(expected, exual);
		assertTrue(true);
		assertFalse(false);
		assertNull(null);
		assertNotSame(expected, 'f');
		assertEquals(arr[2], 3);
        int[] airethematicArrary1 = { 1, 2, 3 };					
        int[] airethematicArrary2 = { 1, 2, 3 };
		assertArrayEquals(airethematicArrary1, airethematicArrary2);

	}

}
