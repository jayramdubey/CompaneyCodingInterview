package GoldmanSchec;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringProblem {

	public static String printRLE(String str) {

		// StringBuilder sb = new StringBuilder();
		String result = "";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			int count = 1;
			while (i < len - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			result += str.charAt(i) + "" + count;
		}
		return result;

	}
	
	  
	@Test
	public void doTestsPass() {
		assertEquals("a3", printRLE("aaa"));
		assertEquals("a3b2c1", printRLE("aaabbc"));
		assertEquals("a1", printRLE("a"));
		assertEquals("", printRLE("")); // assertEquals("a10b5",rle("aaaaaaaaaabbbbb"));
	}
	 

	public static void main(String[] args) throws InterruptedException {
		String str = "aabbbaa";
		String strresult=printRLE(str);
		System.out.println(strresult);
	}
}
