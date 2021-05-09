package saggezza;

import java.io.*;
import java.util.*;

public class FindTheTargetElements {

	static long superDigit(String n, int k) {

		long sum = 0, sum1 = 0;
		for (int i = 0; i < n.length(); i++) {
			sum += (n.charAt(i) - '0');
		}
		sum = k * sum;
		while (sum != 0 || sum1 > 9) {
			if (sum == 0) {
				sum = sum1;
				sum1 = 0;
			}
			sum1 += sum % 10;
			sum = sum / 10;
		}

		return sum1;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int k = sc.nextInt();
		long result = superDigit(n, k);
		System.out.println(" "+ result);

	}
}
