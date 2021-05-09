package hirnix;

import java.util.Scanner;

public class ReverseSpaicialChar {
	public static void reverse(String s){
		String s2=s.toLowerCase();
		char[] schar=s2.toCharArray();
		int size=schar.length;
		int c=0,p=0;
		char[] res=new char[size];
		for(int i=0;i<size;i++){
			if((schar[i]>='a'&& schar[i]<='z') ||(schar[i]>=48 && schar[i]<=57))
			{
				
			}
			else{
				res[p]=schar[i];p++;		
			}
		}
		int len=res.length-1;
		for(int i=len;i>=0;i--){
			if(res[i]!=0)
			System.out.print(res[i]);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		reverse(str);

	}

}
