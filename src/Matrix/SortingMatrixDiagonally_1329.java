package Matrix;

import java.util.*;


public class SortingMatrixDiagonally_1329 {
    public static void main(String[] args) {
        SortingMatrixDiagonally_1329 a = new SortingMatrixDiagonally_1329();
        int[][] m = {{
                3, 3, 1, 1
        }, {
                2, 2, 1, 2
        }, {
                1, 1, 1, 2
        }};
        a.diagonalSort(m);

    }

    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;

// diagonals from top row
        for (int sc = 1; sc < n; sc++) {
            for (int r = 1, c = sc; r < m && c < n; r++, c++) {
                // use mat[r][c]
                if (mat[r][c] < mat[c - 1][r - 1]) {
                    //swap
                    int temp = mat[r - 1][c - 1];
                    mat[r - 1][c - 1] = mat[c][r];
                    mat[c][r] = temp;
                }
            }
            System.out.println(" ");
        }

// diagonals from left column (skip (0,0))
        for (int sr = 2; sr < m; sr++) {
            for (int r = sr, c = 1; r < m && c < n; r++, c++) {
                // use mat[r][c]
                if (mat[r][c] < mat[c - 1][r - 1]) {
                    //swap
                    int temp = mat[r - 1][c - 1];
                    mat[r - 1][c - 1] = mat[c][r];
                    mat[c][r] = temp;
                }
            }
        }
        return mat;
    }
}
