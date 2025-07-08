package Matrix;

public class SurfaceArea3D_892 {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int area = 0;
        //
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int v = grid[i][j];
                if (v > 0) {
                    area += 6 * v - 2 * (v - 1); // Top, bottom, and internal vertical overlaps

                    // Subtract overlaps with adjacent cells
                    if (i > 0) area -= Math.min(v, grid[i - 1][j]); // Up
                    if (j > 0) area -= Math.min(v, grid[i][j - 1]); // Left
                    if (i < n - 1) area -= Math.min(v, grid[i + 1][j]); // Down
                    if (j < n - 1) area -= Math.min(v, grid[i][j + 1]); // Right
                }
            }
        }
        return area;
    }

}
