package housejoyIn;

import java.util.Scanner;

public class StepsToReachedFloor {

	public static void main(String[] args) {
		/*
		 * How many way to climb on pole if we can use one or 2 steps one if
		 * input is 2 output is 2 , if input is 3 output is 3 vice versa
		 */
		int x = 1, y = 1, z = 1;
		System.out.println("Enter the Inpute");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n < 1) {
			System.out.println("Wrong input");
			return;
		}
		if (n == 1) {
			System.out.print(x);
			return;
		}
		if (n == 2) {
			System.out.print(x);
			int k=x + y;
			System.out.print(" " + k);
		}

		int p = n;
		if (n > 2) {
			while (p >= 2) {
				z = x + y;
				x = y;
				y = z;
			
				p--;
			}
			System.out.print("output: " + z);
		}

	}

}
