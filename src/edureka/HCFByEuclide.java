package edureka;

import java.util.Scanner;

public class HCFByEuclide {
	public static int findHcf(int a, int b)
	{
		if(a==b)
			return a;
		if(a%b==0)
			return b;
		if(b%a==0)
			return a;
		if(a>b){
			return findHcf(a%b,b);
		}
		else
			return findHcf(a,b%a);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Two No ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		HCFByEuclide ob=new HCFByEuclide();
		System.out.println("Hcf of "+a+" " +b+"  is: "+ob.findHcf(a, b));
		

	}

}
