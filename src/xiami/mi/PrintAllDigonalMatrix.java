package xiami.mi;

public class PrintAllDigonalMatrix {

	public static void main(String[] args) {
		int M[][] = { { 1, 2, 3, 4 }, 
				      { 5, 6, 7, 8 },
				      { 9, 10, 11, 12 },
				      { 13, 14, 15, 16 },
				      };

		System.out.println("\nDiagonal printing of matrix is \n");

		diagonalOrder(M);

	}

	private static void diagonalOrder(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < n;) {
			int tmp = i;
			for (int j = 0; j <= tmp; j++) {
				System.out.print(" " + arr[i][j]);
				i--;
				if (i < 0)
					break;
			}
			i = tmp + 1;
			System.out.println();
		}

		int p = 1;
		while (p < n) {
			int i = n - 1;
			for (int j = p; j < n; j++) {
				System.out.print(" " + arr[i][j]);
				i--;
			}
			p++;
			System.out.println();
		}

	}

}
