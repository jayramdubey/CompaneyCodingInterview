package com.Lowes;

public class SwapTwoNumberWithout3rdV {

	public static void main(String[] args) {
		SwapTwoNumberWithout3rdV ob = new SwapTwoNumberWithout3rdV();
		int a=10;
		int b= 20;
		ob.swapTwoNumber(a,b);
	}

	private void swapTwoNumber(int a, int b) {
         a= a+b;
         b=a-b;
         a=a-b;
         System.out.println(a+ " "+ b);
	}

}
