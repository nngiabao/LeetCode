package Matrix;

public class CountNegNum_1351 {
    //Solution 1:n^2
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
            for(int j=grid[0].length-1;j>=0;j--){
                if(grid[i][j]<0) count++;
                else break;
            }
        return count;
    }

    ///Solution 2:
    public int countNegatives2(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int i = m - 1, j = 0;
        int count = 0;

        while (i >= 0 && j < n) {
            if (grid[i][j] < 0) {
                count += (n - j); // all elements to the right are also negative
                i--;              // move up
            } else {
                j++;              // move right
            }
        }
        return count;
    }
}
