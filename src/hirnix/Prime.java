package hirnix;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

public class Prime {

	    public static void main (String[] args) throws java.lang.Exception
	    {
	    	Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String str=sc.nextLine();
	      
	        int sum = 0;
	      
	        List<Integer> digits = getDigits(str);
	        for(Integer digit : digits) {
	            // checking whether number is even or prime
	            if(digit%2 == 0 || (digit != 1 && isPrime(digit))) {
	              sum = sum + digit;    
	            }
	        }
	        System.out.println(sum);
	    }
	    
	    private static boolean isPrime(int number) {
	        for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    private static List<Integer> getDigits(String str) {
	        List<Integer> digits = new ArrayList<Integer>();
	        Matcher match = Pattern.compile("[0-9]+").matcher(str);
	        while (match.find()) {
	            digits.add(Integer.parseInt(match.group()));
	        }
	        return digits;
	    }
	}