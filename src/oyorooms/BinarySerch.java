package oyorooms;

import java.util.Scanner;

public class BinarySerch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int frst = 0;
		int last = arr.length - 1;
		System.out.println("Enter the element ");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		bserach(arr, frst, last, element);
	}

	private static void bserach(int[] arr, int frst, int last, int x) {
		int mid = (frst + last) / 2;
		while (frst <= last) {
			if (x > arr[last]) {
				System.out.println("Element is not exist in array ");
			}
			if (x == arr[mid]) {
				System.out.println("Element is in " + mid + "  place in array");
				break;
			} else if (x > arr[mid]) {
				frst = mid + 1;
			} else if (x < arr[mid]) {
				last = mid - 1;
			}
			mid = (frst + last) / 2;
			
		}

	}

}
