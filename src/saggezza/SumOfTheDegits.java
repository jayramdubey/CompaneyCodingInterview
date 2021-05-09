package saggezza;

import java.util.Scanner;
	  
	public class SumOfTheDegits { 
	      
	    static int digSum(int n) 
	    { 
	        int sum = 0; 

	        while (n > 0 || sum > 9)  
	        { 
	            if (n == 0) { 
	                n = sum; 
	                sum = 0; 
	            } 
	            sum += n % 10; 
	            n /= 10; 
	        } 
	        return sum; 
	    } 
	      
	    // Driver code 
	    public static void main(String argc[]) 
	    { 
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the num : ");
	        int n = sc.nextInt(); 
	        System.out.println(digSum(n)); 
	    } 
	} 
	  