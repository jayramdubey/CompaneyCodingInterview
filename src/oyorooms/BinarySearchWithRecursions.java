package oyorooms;

import java.util.Scanner;

public class BinarySearchWithRecursions {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int frst = 0;
		int last = arr.length - 1;
		System.out.println("Enter the element ");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		int result = bserach(arr, frst, last, element);
		if (result == -1) {
			System.out.println("Element is not in list ");
		} else {
			System.out.println("Element found is in index " + result);
		}
	}

	private static int bserach(int[] arr, int frst, int last, int key) {
		if (key > arr[last]) {
			System.out.println("Values is not present in Arrays ");
		}
		int mid = 1 + (frst + last) / 2;
		while (frst <= last) {
			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				return bserach(arr, frst, mid - 1, key);
			} else {
				return bserach(arr, mid + 1, last, key);
			}
		}
		return -1;
	}

}
