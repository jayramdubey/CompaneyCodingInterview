package com.blume;

import java.util.Arrays;

/*1. n=5
 * used = [3,2,1,3,1]-> 1,1,2,3,3 sum =10
 * total= [3,5,3,5,5]-> 5,5,5,3,3
 * O/P: 2
 * 
 * 2. n=3 
 * used = [1,2,3]
 * total= [3,3,3]
 * O/P= 2
 * 
 * 3. n=3 
 * used = [2,2,3]
 * total= [3,2,3]
 * O/P= 3
 * */

public class BlumeCode1 {

	public static void main(String[] args) {

		int used[] = { 1, 2, 3 };
		int total[] = { 3, 3, 3 };
		int len = used.length;
		findNumberOfUsed(used, total, len);
	}

	private static void findNumberOfUsed(int[] used, int[] total, int len) {

		int sum = 0, count = 0;
		for (int i = 0; i < len; i++)
			sum += used[i];
		Arrays.sort(total);
		for (int i = len - 1; i >= 0; i--) {
			int rem = sum - total[i];
			count++;
			sum = rem;
			if (sum <= 0) {
				break;
			}
		}
		System.out.println("Total used cont: " + count);
	}

}
