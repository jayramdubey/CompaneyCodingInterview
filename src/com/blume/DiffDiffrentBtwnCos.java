package com.blume;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiffDiffrentBtwnCos {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(4);
		int res = findVal(list);
		System.out.println(res);
	}

	private static int findVal(List<Integer> arr) {
		Collections.sort(arr);
		int sum = 0;
		for (int i = 1; i < arr.size(); i++) {
			sum += Math.abs(arr.get(i - 1) - arr.get(i));
		}
		return sum;
	}

}
