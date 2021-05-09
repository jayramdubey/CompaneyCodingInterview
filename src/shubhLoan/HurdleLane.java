package shubhLoan;

public class HurdleLane {
  public static void main(String arg[]){
	  int arr[][]={{1,0,0},
			       {0,1,1},
			       {1,0,1},
			       {1,0,0},
			       {0,1,1}
			      };
	  int result=output(arr, 5,3);
	  System.out.println(" "+ result);
  }

	private static int output(int[][] arr, int r,int c) {
		int count =0;
		for(int i=0;i<r;i++){
			for(int j=1;j<c;j++){
				if(arr[i][j] == 0){
					count++;
				}
			}
		}
		return count;
		
	
	}
}
