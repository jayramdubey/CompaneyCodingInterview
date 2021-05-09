package com.Lowes;

public class PrintPrimNumberupto50 {

	public static void main(String[] args) {

		PrintPrimNumberupto50 obj = new PrintPrimNumberupto50();
		obj.printPrime();
	}

	private void printPrime() {

		for (int i = 2; i <= 50; i++) {
			int flag=1;
			for (int j=2;j<=Math.sqrt(i);j++) {
				 if(i%j==0) 
	                {
	                    flag = 0;
	                    break;
	                }
			}
			if(flag==1)
			System.out.print(" "+i);
		}
	}

}
