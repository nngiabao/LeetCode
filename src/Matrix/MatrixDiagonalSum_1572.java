package Matrix;

public class MatrixDiagonalSum_1572 {
    public int diagonalSum(int[][] mat) {
        //
        int sum = 0;
        int len = mat.length;
        //first diagonal
        for(int i = 0; i < len;i++){
            sum += mat[i][i];
        }
        //second diagonal
        int j=0;
        for(int i = len-1; i >= 0; i--){
            sum += mat[j--][i];
        }
        //if length = odd center point will overlap so we have to deduce it
        //
        return ((len&1)==0) ? sum : sum-mat[len/2][len/2];
    }
}
