package Matrix;

public class ToeplitzMatrix_766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        //check main diagonal
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m-1;i++){
            int j = i;
            if(j<n && matrix[i][j]!=matrix[i+1][j+1]) return false;
        }
        //check right diagonals
        for(int i=0;i<m-1;i++){
            int j = i+1;
            if(matrix[i][j]!=matrix[i+1][j]) return false;
        }
        //check left elements from diagonal
        for(int i=1;i<m-1;i++){
            int j = i-1;
            if(j>= 0 && matrix[i][j]!=matrix[i+1][j]) return false;
        }
        return true;
    }
}
