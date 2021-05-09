package oyorooms;

public class SearchElementFromTwoDArray {

	public static void main(String[] args) {
		
		 int mat[][] = { { 1, 3, 5, 9 }, 
                         { 10, 13, 17, 19 }, 
                         { 22, 27, 28, 45 }, 
                         { 51, 53, 55, 57 } }; 
		 searchEle(mat,4,27);
	}

	private static void searchEle(int[][] mat, int n, int key) {
		int i = 0;
		int j = n - 1;
		while (i < n && j >= 0) {
			if (mat[i][j] == key) {
				System.out.println("Element is in [" + i + ", " + j+"]");
				return;
			}
			if (mat[i][j] > key) {
				j--;
			} else {
				i++;
			}
		}
		System.out.println(" Element is not present in this array ");
	}

}
