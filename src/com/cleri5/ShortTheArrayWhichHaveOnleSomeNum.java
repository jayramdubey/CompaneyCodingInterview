package com.cleri5;

public class ShortTheArrayWhichHaveOnleSomeNum {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 0, 0, 0, 2, 2, 1, 1, 0, 0 };
		shorts(arr);

	}

	private static void shorts(int[] arr) {
		int x = 0, y = 0, z = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				x++;
			else if (arr[i] == 1)
				y++;
			else
				z++;
		}
		int arr2[] = new int[arr.length];
		int p = 0;
		while (x > 0) {
			arr2[p] = 0;
			p++;
			x--;
		}
		while (y > 0) {
			arr2[p] = 1;
			p++;
			y--;
		}
		while (z > 0) {
			arr2[p] = 2;
			p++;
			z--;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
		}

	}

}
