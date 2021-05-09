package hirnix;

import java.util.Scanner;

public class Div$th {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Max and Min Value ");
		int res=0,a=0,b=1,min,max,c=0,p=0;
		min=sc.nextInt();
		max=sc.nextInt();
		while(res<=max){
			res=a+b;
			if(res>=min&&res<=max&&res%4==0){
				p++;
				System.out.println(res);
				break;
			}

			a=b;
			b=res;
		}
		if(p==0){
			System.out.println(c);
		}
	}

}
