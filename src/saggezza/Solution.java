package saggezza;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the strangeCounter function below.
	static long strangeCounter(long t) {
		long count = 3;
		long tmp = count;
		for (long i = 1; i <= t; i++) {
			if (count == 1) {
				count = 2 * tmp;
				tmp = count;
				continue;
			}
			if (i == t) {
				break;
			}
			count--;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		long t = sc.nextLong();
		long result = strangeCounter(t);
		System.out.println(result);

	}
}
