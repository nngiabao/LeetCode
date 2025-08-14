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
    //Solution 1: Selection sort
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;

        // From top row
        for (int sc = 0; sc < n; sc++) {
            int len = Math.min(m, n - sc);
            for (int i = 0; i < len - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < len; j++) {
                    int rj = j, cj = sc + j;
                    int rMin = minIdx, cMin = sc + minIdx;
                    if (mat[rj][cj] < mat[rMin][cMin]) {
                        minIdx = j;
                    }
                }
                if (minIdx != i) {
                    int ri = i, ci = sc + i;
                    int rMin = minIdx, cMin = sc + minIdx;
                    int tmp = mat[ri][ci];
                    mat[ri][ci] = mat[rMin][cMin];
                    mat[rMin][cMin] = tmp;
                }
            }
        }

        // From left column (skip (0,0))
        for (int sr = 1; sr < m; sr++) {
            int len = Math.min(m - sr, n);
            for (int i = 0; i < len - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < len; j++) {
                    int rj = sr + j, cj = j;
                    int rMin = sr + minIdx, cMin = minIdx;
                    if (mat[rj][cj] < mat[rMin][cMin]) {
                        minIdx = j;
                    }
                }
                if (minIdx != i) {
                    int ri = sr + i, ci = i;
                    int rMin = sr + minIdx, cMin = minIdx;
                    int tmp = mat[ri][ci];
                    mat[ri][ci] = mat[rMin][cMin];
                    mat[rMin][cMin] = tmp;
                }
            }
        }

        return mat;
    }
}
