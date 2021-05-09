package com.cleri5;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumberUnshortedEl {

	public static void main(String[] args) {
		int a[] = { 3, 0, 1 };
		int a2[] = { 13, 9, 7, 8, 10, 11, 14 };

		int result = missingNumberStrtFrmZero(a);
		int result2 = missingNumberStrtFromAnywhere(a2);
		System.out.println(result);
		System.out.println("missing Number  "+result2);

	}

	public static int missingNumberStrtFrmZero(int[] ar) {

		Set<Integer> hs = new HashSet<>();
		for (int num : ar)
			hs.add(num);

		int expectedNumCount = ar.length + 1;
		for (int i = 0; i < expectedNumCount; i++) {
			if (!hs.contains(i)) {
				return i;
			}
		}
		return -1;

	}

	public static int missingNumberStrtFromAnywhere(int[] ar) {
		
		int max = ar[0], min = ar[0];
		int tmp1 = 0, tmp2 = 0, result = 0, sum = 0, len = ar.length;
		for (int i = 0; i < len - 1; i++) {
			tmp1 = ar[i + 1];
			tmp2 = ar[i + 1];
			if (min > tmp1)
				min = tmp1;
			if (max < tmp2)
				max = tmp2;
		}
		for (int i = 0; i < len; i++) {
			sum += ar[i];
		}
		result += (max * (max + 1) / 2) - (min * (min - 1) / 2) - sum;
		return result;

	}
}
