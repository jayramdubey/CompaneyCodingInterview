package shubhLoan;

import java.util.Scanner;

public class GlowBulbs {

	public static void main(String[] args) {

		System.out.println("Enter the size of row and value of K: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int k = sc.nextInt();
		int input[] = new int[k];
		int sizeBulb[] = new int[size];
		int result =bulbGlow(input, sizeBulb);
		System.out.println();
       System.out.println(" Result "+result);
	}

	private static int bulbGlow(int[] input, int[] sizeBulb) {
		int k = input.length;
		int n = sizeBulb.length;
		int r=0;
		if (k > n || k <= 0 || n <= 0) {
			return 0;
		}
		System.out.println("enter the value of K ");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= k; i++) {
			input[i] = sc.nextInt();
			r=input[i-1];
			sizeBulb[input[i]]=1;
			if(sizeBulb[1]==1){
				return r;
			}
		}
		
		return r;
	}

}
