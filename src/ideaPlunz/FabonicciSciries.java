package ideaPlunz;

import java.util.Scanner;

public class FabonicciSciries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element of Fabonicci ");
		int n=sc.nextInt();
	
		System.out.print(" Sum of Fabonicci series is: "+feb(n));
		
		

	}

	private static int feb(int n) {
		if(n==0){
			return 0;
		}  
		if(n==1||n==2)
		    return 1;
		else
			return feb(n-1)+feb(n-2);
		
	}

}
