package edureka;

import java.util.Scanner;
//enhancement is requred
public class Turnament 
 {
	public void possible()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Score: ");
		int n=sc.nextInt();
		System.out.println("enter the a,b,c which is (a+b+c=score): ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b&&b==c&&a==c)
		{
			System.out.println("your score is: "+n);
			System.out.println("your Possiblity is: "+1);
		}
		else if(a!=b&&b!=c&&a!=c)
		{
			System.out.println("your score is: "+n);
			System.out.println("your Possiblity is: "+(fact(3)/2));
		}
		else if(a==b&&b==c&&a!=c)
		{
			System.out.println("your score is: "+n);
			System.out.println("your Possiblity is: "+(fact(3)/2));
		}
		else if(a==b&&b!=c&&a==c)
		{
			System.out.println("your score is: "+n);
			System.out.println("your Possiblity is: "+(fact(3)/2));
		}
		else if(a!=b&&b==c&&a==c)
		{
			System.out.println("your score is: "+n);
			System.out.println("your Possiblity is: "+(fact(3)/2));
		}
		else if(a!=b&&b!=c&&a==c)
		{
			System.out.println("your score is: "+n);
			System.out.println("your Possiblity is: "+(fact(3)/2));
		}
			
		else if(a==b&&b!=c&&a!=c)
		{
			System.out.println("your score is: "+n);
			System.out.println("your Possiblity is: "+(fact(3)/2));
		}
			
		else 
		{
			System.out.println("your score is: "+n);
			System.out.println("your Possiblity is: "+(fact(3)/2));
		}
			
		
		
	}
	public int fact(int n)
	{
		if(n==0)		
				return 1;
			return (n*fact(n-1));
		
	}

	public static void main(String[] args) 
	{
		Turnament ob=new Turnament();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the group: ");
		int n=sc.nextInt();
		
		System.out.println("factorial of no : "+ob.fact(n));
		ob.possible();
	}

}
