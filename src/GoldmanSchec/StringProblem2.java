package GoldmanSchec;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringProblem2 {

	public static void main(String[] args) {

		String str = "aabcabbbaccbba";
		String result = printM1(str);
		System.out.println(result);

	}

	private static String printM1(String str) {

		String result = "";
		char ar1[] = str.toCharArray();
		int len = ar1.length;
		int ar2[] = new int[126];
		for (int i = 0; i < len; i++) {
			ar2[ar1[i]] += 1;
		}
		// A to Z 65 to 90 and a to z 97 to 122
		for (int i = 65; i < ar2.length; i++) {
			if (ar2[i] > 0) {
				result += (char) i + "" + ar2[i];
			}
		}
		return result;
	}
	
	@Test
	public void testMethod(){
		//assertEquals
		assertEquals("a5b6c3",printM1("aabcabbbaccbba"));
		assertEquals("a4b6c3",printM1("aabcabbbaccbb"));
	}
	@Test
	public void testMethod2(){
		//assertEquals
		assertEquals("a4b4c3",printM1("aabcabbbacc"));
	}
	@Test
	public void testMethod3(){
		//assertEquals
		assertEquals("",printM1(""));
	}


}
