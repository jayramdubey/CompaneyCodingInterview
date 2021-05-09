package edureka;

import java.util.Scanner;

public class Series {
	public static void series()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the multiple of than 30");
		int num=sc.nextInt();
		System.out.println("prime factor is: ");
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0){
				System.out.print(i+" ");
			}
			
		}
	}

	public static void main(String[] args)
	{
		Series ob=new Series();
		ob.series();

	}

}
