package Matrix;

import java.util.*;

public class Shift2DGrid_1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        //
        List<List<Integer>> res = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int totalLength = m*n;
        int[] flat = new int[totalLength];
        int index = 0;
        //build the flat grid
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                flat[index++] = grid[i][j];
            }
        }
        //shift the plain
        int[] rotated = new int[totalLength];
        for(int i = 0; i < totalLength; i++){
            rotated[(i+k)%totalLength] = flat[i];
        }
         //build result
        List<Integer> row = new ArrayList<>();
        for(int i = 0; i < totalLength; i++){
            row.add(rotated[i]);
            if(row.size() == n){
                res.add(row);
                row = new ArrayList<>();
            }
        }
         ///
        return res;
    }
}
