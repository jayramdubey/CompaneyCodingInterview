package com.persistent;

import java.util.Scanner;

public class FactUsingRecursiveMethod {

	public static void main(String[] args) {
		
		System.out.println("Enter the no. ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		FactUsingRecursiveMethod ob = new FactUsingRecursiveMethod();
		int result=ob.fact(n);
		System.out.print("Factorials of " + n + " is: " + result);
	}

	private int fact(int n) {
		
		return (n==1 || n==0)? 1: n*fact(n-1);
		
	}

}
