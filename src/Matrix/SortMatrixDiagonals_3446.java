package Matrix;

public class SortMatrixDiagonals_3446 {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        // Bottom-left + main diagonal
        for (int row = 0; row < n; row++) {
            selectionSortDiagonal(grid, row, 0, true); // descending
        }

        // Top-right (excluding main diagonal)
        for (int col = 1; col < n; col++) {
            selectionSortDiagonal(grid, 0, col, false); // ascending
        }

        return grid;
    }

    private void selectionSortDiagonal(int[][] grid, int row, int col, boolean descending) {
        int n = grid.length;

        int r1 = row, c1 = col;
        while (r1 < n && c1 < n) {
            int rMinMax = r1, cMinMax = c1;

            int r2 = r1 + 1, c2 = c1 + 1;
            while (r2 < n && c2 < n) {
                if ((descending && grid[r2][c2] > grid[rMinMax][cMinMax]) ||
                        (!descending && grid[r2][c2] < grid[rMinMax][cMinMax])) {
                    rMinMax = r2;
                    cMinMax = c2;
                }
                r2++;
                c2++;
            }

            // swap
            int temp = grid[r1][c1];
            grid[r1][c1] = grid[rMinMax][cMinMax];
            grid[rMinMax][cMinMax] = temp;

            r1++;
            c1++;
        }
    }
}
