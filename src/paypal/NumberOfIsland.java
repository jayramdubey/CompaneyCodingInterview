package paypal;

public class NumberOfIsland {
	 static final int ROW = 5, COL = 5; 

	public static void main(String[] args) {

	    int M[][] = new int[][] {
	    	{ 1, 1, 0, 0, 0 }, 
            { 0, 1, 0, 0, 1 }, 
            { 1, 0, 0, 1, 1 }, 
            { 0, 0, 0, 0, 0 }, 
            { 1, 0, 1, 0, 1 } }; 
            
		NumberOfIsland objIsl = new NumberOfIsland();

		int result = objIsl.countIslands(M);
		System.out.println("Number of islands is: " + result);
	}

	private int countIslands(int[][] grid) {
		if (grid == null || grid.length <= 0)
			return 0;
		int isLand = 0;
		int r = grid.length;
		int c = grid[0].length;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (grid[i][j] == 1){
					isLand++;
				DFS(grid, i, j, r, c);
				}

			}
		}
		return isLand;
	}

	private void DFS(int[][] grid, int i, int j, int r, int c) {

		grid[i][j] = 0;
		if (i > 0 && grid[i - 1][j] == 1)//top
			DFS(grid, i - 1, j, r, c);
		if (i < r - 1 && grid[i + 1][j] == 1)//botton
			DFS(grid, i + 1, j, r, c);
		if (j > 0 && grid[i][j - 1] == 1)//left
			DFS(grid, i, j - 1, r, c);
		if (j < c - 1 && grid[i][j + 1] == 1)//right
			DFS(grid, i, j + 1, r, c);

	}

}
