package Matrix;

public class RangeAddition2_598 {
    /*
    this problem is find the smallest row that effect
    in maxtrix because
     */

    public int maxCount(int m, int n, int[][] ops) {
        int minCol,minRow;
        if(ops == null || ops.length == 0) return m*n;
        if(ops.length == 1) return ops[0][0]*ops[0][1];
        else{
            minCol=ops[0][0];minRow=ops[0][1];
            for(int i=0; i<ops.length; i++){
                if(ops[i][0]<minCol) minCol=ops[i][0];
                if(ops[i][1]<minRow) minRow=ops[i][1];
            }
        }
        return minRow*minCol;
    }
}
