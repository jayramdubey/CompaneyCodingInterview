package saggezza;

import java.io.*;
import java.util.*;

public class SumOfRecursiveDigit {

	// Complete the superDigit function below.
	static int superDigit(String n, int k) {
		
		int sum = 0;
		for (int i = 0; i <n.length(); i++) {
		sum +=(n.charAt(i)-'0');
		}
		sum=sum*k;
		int res=0;
		while(sum>0 || res>9){
			if(sum==0){
				sum=res;
				res=0;
			}
			res+=sum%10;
			sum=sum/10;
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String[] nk = scanner.nextLine().split(" ");

		String n = nk[0];

		int k = Integer.parseInt(nk[1]);

		int result = superDigit(n, k);
		System.out.println(result);


		scanner.close();
	}
}
