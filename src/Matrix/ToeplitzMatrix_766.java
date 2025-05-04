package Matrix;

public class ToeplitzMatrix_766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        //check main diagonal
        int m = matrix.length;
        int n = matrix[0].length;
        int i=1,j=1;
        while(i<m && j<n) {
            if(matrix[i][j]!=matrix[i-1][j-1]) return false;
            i++;
            j++;
        }
        //check right diagonals
        i=1;j=2;
        while(i<matrix.length && j<matrix[0].length){
            if(matrix[i][j]!=matrix[i-1][j-1]) return false;
            i++;
            j++;
        }
        //check left elements from diagonal
        i=2;j=1;
        while(i<matrix.length && j<matrix[0].length){
            if(matrix[i][j]!=matrix[i-1][j-1]) return false;
            i++;
            j++;
        }
        return true;
    }
}
