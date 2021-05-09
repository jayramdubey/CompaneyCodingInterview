package saggezza;

import java.util.Scanner;

public class SumOfConsecutiveNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the two number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String result = sumOfConNumber(a, b);
		System.out.println("Sum of cons number "+result);

	}

	private static String sumOfConNumber(int a, int b) {
		long tmp1 = 0, tmp2 = 0;

		tmp1 = (a * (a - 1)) / 2;
		tmp2 = (b * (b + 1)) / 2;
		long sum1 = tmp2 - tmp1;

		return sum1+"";

	}

}
