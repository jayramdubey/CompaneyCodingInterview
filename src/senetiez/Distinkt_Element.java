package senetiez;

import java.util.Scanner;

public class Distinkt_Element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of element ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("enter the element of Array ");
		for(int i=0;i<size;i++){
			ar[i]=sc.nextInt();
		
		}
		/*System.out.println("element of array ");
		for(int i=0;i<size;i++){
			System.out.print(ar[i]);
		
		}*/
		
		distinct_Element(ar,size);

	}

	private static void distinct_Element(int[] ar, int size) {
		int hashAr[]=new int[size+1];
		for(int i=0;i<=ar.length;i++){
			hashAr[ar[i]]=+1;
		}
		for(int i=0;i<=size;i++){
			if(hashAr[i]==1){
				System.out.println("Distinct No."+i);
			}
		}
		
	}

}
