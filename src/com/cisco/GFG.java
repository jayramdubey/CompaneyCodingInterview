package com.cisco;

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int size1=sc.nextInt();
	    int size2=sc.nextInt();
	    int arr[]= new int[size1];
	    int arr2[]= new int[size1];
	    for(int i=0;i<size1;i++){
	    	arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<size2;i++){
	    	arr2[i]=sc.nextInt();
	    }
	    
	    int result = findMissingNumber(arr, arr2, size1, size2);
	    System.out.println(result);
	}
	public static int findMissingNumber(int arr[],int arr2[], int n1, int n2){
	    int val=1;
	    int val2=1;
	    
	    for(int i=0;i<n1;i++){
	       if(arr[i]==val){
	           val++;
	           continue;
	       } else{
	           break;
	       }
	    }
	    return val;
	}
}