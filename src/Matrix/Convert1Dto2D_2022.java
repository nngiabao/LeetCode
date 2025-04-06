package Matrix;

public class Convert1Dto2D_2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n) return new int[0][0];
        int[][] result = new int[m][n];
        for(int i = 0; i < original.length; i++) {
            int newRow = i/m;
            int newCol = i/n;
            result[newRow][newCol] = original[i];
        }
        return result;
    }
}
