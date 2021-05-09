package edureka;

import java.util.Scanner;

public class Prime_no
  {
	int flag;
	public void isprime()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:  ");	
		int n=sc.nextInt();
		
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0||n==i)
			{
				flag=1;	
		     }
			
		}
		if(flag==1)
		 {
			System.out.println("not prime");
		 }
		else
		{
			System.out.println("prime");
		}
	

	}
	/*public static void sumOfPrimeNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of array:  ");	
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		}
		for(int i=0;i<n;i++)
		{
			for(int j=)
		}
	}*/

	public static void main(String[] args)
	{
		
		Prime_no ob=new Prime_no();
		
		ob.isprime();
		//ob.sumOfPrimeNumber();

	}

}
