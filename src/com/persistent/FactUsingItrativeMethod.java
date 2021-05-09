package com.persistent;

import java.util.Scanner;

public class FactUsingItrativeMethod {

	public static void main(String[] args) {
		System.out.println("Enter the no. ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		FactUsingItrativeMethod ob = new FactUsingItrativeMethod();
		int result=ob.fact(n);
		System.out.print("Factorials of " + n + " is: " + result);
	}

	private int fact(int n) {
		int result = 1;
		if (n == 0 || n==1) {
			return 1;
		} else {
			for (int i = 2; i <= n; i++) {
				result *= i;
			}
			return result;
		}

	}

}
