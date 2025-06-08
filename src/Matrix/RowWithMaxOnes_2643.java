package Matrix;

public class RowWithMaxOnes_2643 {
    //
    public int[] rowAndMaximumOnes(int[][] mat) {
        int [] res = new int[2];
        int max = Integer.MIN_VALUE;
        int index = 0;
        int len = mat.length;
        for(int i = 0; i < len; i++) {
            //
            int count = 0;
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1) count++;
            }
             //after scanning 1 row
            if(count > max) {
                max = count;
                index = i;
            }
        }
        return new int[]{index, max};
    }
    //Solution 2:Best
    static{
        int[][] tmp = {{0,1},{1,0}};
        for(int i=0; i<3000; i++) rowAndMaximumOnes2(tmp);
    }
    public static int[] rowAndMaximumOnes2(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int [] res = {0, 0};
        for(int i=0; i<rows; i++){
            int count = 0;
            for(int j=0; j<cols; j++){
                count+=mat[i][j];
            }
            if(res[1] < count) {
                res[1] = count;
                res[0] = i;
            }
        }
        return res;
    }
}
