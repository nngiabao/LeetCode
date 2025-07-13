package Matrix;

public class LargestLocalValuesMatrix_2373 {
    public int[][] largestLocal(int[][] grid) {
        int n= grid.length;
        //
         //new maxLocal[n-2][n-2]
        //find max 3x3 element
        int[][] maxLocal = new int[n-2][n-2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                maxLocal[i][j] = maxValue(i,j,grid);
            }
        }
        return maxLocal;
    }

    //find the max in 3x3
    int maxValue(int col,int row,int[][] grid){
        int max = Integer.MIN_VALUE;
        for(int i=col;i<col+3;i++){
            for(int j=row;j<row+3;j++){
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }
}
