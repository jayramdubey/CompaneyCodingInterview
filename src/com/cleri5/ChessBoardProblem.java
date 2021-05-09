package com.cleri5;

public class ChessBoardProblem {

	public static void main(String[] args) {
       int chsbrd[][]={{1,2,3,4},
    		           {5,6,7,8},
    		           {9,10,11,12},
    		           {13,14,15,16}};
       int sum=0;
       for(int i=0;i<4;i++){
    	   if(i%2==0){
    		   for(int j=1;j<4;j+=2){
    			   sum+=chsbrd[i][j];
    		   }
    	   }else{
    		   for(int j=0;j<4;j+=2){
    			   sum+=chsbrd[i][j];
    		   }
    	   }
       }
       System.out.println(sum);

	}

}
