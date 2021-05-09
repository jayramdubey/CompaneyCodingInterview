package saggezza;

import java.util.Scanner;

public class SrangeCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		long t = sc.nextLong();
		long result = strangeCounter(t);
		System.out.println(result);
	}

	private static long strangeCounter(long t) {
		long count=3;
		while(t > count){
			t -=count;
			count *=2;
		}
		return (count-t+1);
	}

}
