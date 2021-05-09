package hirnix;

import java.util.Scanner;

public class FeboniciiSeriseConditional {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Max and Min Value ");
		int res=0,a=0,b=1,min,max;
		min=sc.nextInt();
		max=sc.nextInt();
		while(true){
			res=a+b;
			if(res>=min&&res<max&&res%4==0){
				System.out.println(res);
				break;
			}
			else if(res>max){
				System.out.println(0);
				break;
			}
			a=b;
			b=res;
		}
	}

}
