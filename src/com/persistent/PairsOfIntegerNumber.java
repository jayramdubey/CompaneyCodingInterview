package com.persistent;

import java.util.HashMap;
import java.util.Map;


public class PairsOfIntegerNumber {

	public static void main(String arg[]) {
		int arr[] =  { 2, 3, 5, 4, 6, 33 };
		int n = 7;
		PairsOfIntegerNumber obj = new PairsOfIntegerNumber();
		 pairsOfNum(arr, n);
		// printPairUsing2ndArr(arr, n);
		int result =pairs(n, arr);
		System.out.println(result);
	}
   
	
	private static void printPairUsing2ndArr(int[] a, int sum) {
		int a2[] = new int[100];

		for (int i = 0; i <= a.length - 1; i++) {
			a2[a[i]] = 1;
		}
		for (int i = 0; i <= a.length - 1; i++) {
			int tmp = sum - a[i];
			if (tmp < 0) {
				continue;
			}
			if (a2[tmp] == 1) {
				System.out.println("(" + a[i] + "," + tmp + ")");
			}
		}
	}
	
	private static void pairsOfNum(int[] arr, int n) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int diff = arr[i] - n;
			for (int j = 1; j < len; j++) {
				if (diff == arr[j]) {
					System.out.println("(" + arr[i] + "," + arr[j] + ")");
				}
			}
		}

	}
	
	public static int pairs(int k, int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int count=0;
		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i]-k)) {
				System.out.println();

			}

			map.put(arr[i], i);
		}
		return count;

	}

}
