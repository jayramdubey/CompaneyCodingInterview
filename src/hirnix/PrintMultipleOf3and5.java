package hirnix;

import java.util.Scanner;

public class PrintMultipleOf3and5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no ");
		int n=sc.nextInt();
		multiple(n);

	}

	public static void multiple(int n) {
		for(int i=0;i<n;i++){
			if((i%3==0||i%5==0)&&(i%15!=0)){
				System.out.print(i+" ");
				
			}
		}
		
		
	}

}
