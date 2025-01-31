package TwoDimArray;

import java.util.Arrays;

public class DelMaxEachRow_2500 {

    public static void main(String[] args) {

    }

    public int deleteGreatestValue(int[][] grid) {
        int count = 0,max=0;
        for(int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }

        for(int j = 0; j < grid[0].length; j++) {
            max = grid[0][j];
            for(int k = 1; k < grid.length; k++) {

                max=Math.max(max,grid[k][j]);
            }
            count+=max;
        }
        return count;
    }
}
