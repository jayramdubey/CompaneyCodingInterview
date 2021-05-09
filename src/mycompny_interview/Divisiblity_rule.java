package mycompny_interview;

import java.util.Scanner;

public class Divisiblity_rule {

	public static void main(String[] args) {
		int n,i,j;
		int count =0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of element: ");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter the element of array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
	    }
		for(i=0;i<n;i++)
		{ 
           for(j=0;j<n;j++)
               {
        	        if(a[i]%a[j]==0 && i !=j)
        	        {
        	    	  count++;
        	    	  break;
        	        }
        	    
			    }
				
		}
		  System.out.println("total no of divisible :  "+count);
		  System.out.print("Element of array is: ");
		  for(i=0;i<n;i++)
		  {
			  System.out.print(" "+a[i]);  
		  }
		
	}

}
