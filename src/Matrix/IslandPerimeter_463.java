package Matrix;

public class IslandPerimeter_463 {
    public int islandPerimeter(int[][] grid) {
        ////we build the method to check up left right
        int m = grid.length;
        int n = grid[0].length;
        int islandPerimeter = 0;
        //
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    //check 4 ways
                    int down = (i == m-1 || grid[i+1][j] == 0) ?  1 : 0;
                    int up = (i ==0  || grid[i-1][j] == 0) ?  1 : 0;
                    int left = (j == 0 || grid[i][j-1] == 0) ?  1 : 0;
                    int right = (j == n-1 || grid[i][j+1] == 0) ?  1 : 0;
                    //
                    islandPerimeter += down + up + left + right;
                }
            }
        }
        return islandPerimeter;
    }



}
