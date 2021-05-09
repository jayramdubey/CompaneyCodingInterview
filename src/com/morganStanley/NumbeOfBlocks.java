package com.morganStanley;

public class NumbeOfBlocks {

	public static void main(String[] args) {
		int n=10;
		int result=blocks(n);
		System.out.println(result);

	}

	private static int blocks(int n) {
		int blocks=n;
		int res=0;
		for(int i=1;i<n;i++){
			
				blocks -=i;
				if(blocks==0){
					res=i;
					break;
				} else  if(blocks<i){
					res=i-1;
					break;
				}
			}
			
		
		return res;
		
		
	}

}
