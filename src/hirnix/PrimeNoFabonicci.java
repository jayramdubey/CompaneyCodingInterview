package hirnix;

import java.util.Scanner;

public class PrimeNoFabonicci {
	 public static int checkPrime(int n){
		 for(int i=2;i<Math.sqrt(n);i++){
			 if(n%i==0){
				 return 0;
			 }
		 }
		return 1;
		 
	 }

	public static void main(String[] args) {
	int res=0,a=0,b=1,num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	num=sc.nextInt();
	while(true){
		res=a+b;
		if(res==num){
			System.out.println(0);
			break;
		}
		else if(res>num){
			break;			
		}
		a=b;
		b=res;
	}
	if(checkPrime(num)==1){
		System.out.println(1);
	}
	else {
		System.out.println(0);
	}
	}

}
