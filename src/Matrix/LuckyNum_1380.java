package Matrix;

import java.util.*;

public class LuckyNum_1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rowMin = new int[m]; // min in each row
        int[] colMax = new int[n]; // max in each column

        // Initialize rowMin with max value
        Arrays.fill(rowMin, Integer.MAX_VALUE);
        // Initialize colMax with min value
        Arrays.fill(colMax, Integer.MIN_VALUE);

        // Step 1: Find min in each row and max in each column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        // Step 2: Find elements that are both min in their row and max in their column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    res.add(matrix[i][j]);
                }
            }
        }

        return res;
    }
}
