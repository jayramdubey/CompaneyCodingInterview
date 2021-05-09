package com.cleri5;

public class DNumberBNumberRecursively {

	public static void main(String[] args) {
		int num = 14;
		System.out.println(find(num));
	}

	private static int find(int n) {
		if (n < 2) {
			return n;
		}
		if (n % 2 != 0)
			return 10 * find(n / 2) + 1;
		return 10 * find(n / 2);
		/*
		 * if(num==0){ return 0; } return (num%2+10*find(num/2));
		 */

	}

}
