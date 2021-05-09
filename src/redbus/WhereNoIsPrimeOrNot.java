package redbus;

import java.util.Scanner;

public class WhereNoIsPrimeOrNot {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		whereNoIsPrimeOrNot(n);

	}

	private static void whereNoIsPrimeOrNot(int n) {
		int flag=0;
		
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i ==0){
				flag=1;
			}
		}
		if(flag==0){
			System.out.println("prime");
		}else{
			System.out.println("not prime");
		}
	}

}
