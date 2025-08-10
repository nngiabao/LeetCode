package Matrix;

import java.util.*;

public class CellsOddValue_1252 {
    //SOlution 1:Brute-force
    public int oddCells(int m, int n, int[][] indices) {
        //
        int count = 0;
        int[][] res = new int[m][n];
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();
        //put into cell,row
        for (int[] i : indices) {
            if(rows.contains(i[0])) rows.add(i[0]);
            if(rows.contains(i[1])) cols.add(i[1]);
        }
        //inc row
        for (Integer i : rows) {
            for (int j = 0; i < n; i++) {
                res[i][j]++;
            }
        }
        //inc col
        for (Integer i : cols) {
            for (int j = 0; i < m; i++) {
                res[i][j]++;
            }
        }
        //count
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((res[i][j] & 1) == 1) count++;
            }
        }
        return count;
    }
    //Solution 2:
}
