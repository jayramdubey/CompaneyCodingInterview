package informatica;

import java.util.Scanner;

public class Print_Circuler_Matrix {

	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the row and col");
	   int r=sc.nextInt();
	   int c=sc.nextInt();
	   int mat[][]=new int[r][c];
	   System.out.println("Enter element of Mat: ");
	   int i,j;
	   for(i=0;i<r;i++){
		   for(j=0;j<c;j++){
			   mat[i][j]=sc.nextInt();
		   }
	   }
	   System.out.println("Display of Mat: ");
	  
	   for(i=0;i<r;i++){
		   for(j=0;j<c;j++){
			   System.out.print(mat[i][j]+" ");
		   }
		   System.out.println();
	   }
	   System.out.println("After Rotation of Matrics ");
	   circularMatrix(r,c, mat);
	   
	}

	private static void circularMatrix(int r2, int c2, int[][] mat) {
		
		int i, r1 = 0, c1 = 0;
    /*  r1 - starting row index
        r2 - ending row index
        c1 - starting column index
        c2 - ending column index
        i - iterator
        */
		while(r1<r2 && c1<c2){
			for(i=r1;i<=c2;i++){
				System.out.println(mat[r1][i]);
			}
			r1++;
			for(i=r1;i<=r2;i++){
				System.out.println(mat[i][r2-1]);
			}
			c2--;
			if(c1<c2){
				for(i=c2-1;i>=c1;i--)
				System.out.println(mat[r2][i]);	
			}
			r2--;
			
		}
	}

}
