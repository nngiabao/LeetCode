package Matrix;

public class ReshapeMatrix_566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length != r*c) return mat;
        //reshape
        int[][] reshapedMatrix = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0; i < m*n; i++){
            //original row and col
            int originalRow = i / n;
            int originalCol = i % n;
            //new row and col
            int newRow = i / r;
            int newCol = i % r;
            //put into new array
            reshapedMatrix[newRow][newCol] = mat[originalRow][originalCol];
        }
        return reshapedMatrix;
    }
}
