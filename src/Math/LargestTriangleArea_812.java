package Math;

public class LargestTriangleArea_812 {
    //Solution: using Shoelaces formula
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0.0;

        int n = points.length;
        for (int i = 0; i < n; i++) {
            int[] A = points[i];
            for (int j = i + 1; j < n; j++) {
                int[] B = points[j];
                for (int k = j + 1; k < n; k++) {
                    int[] C = points[k];
                    double area = 0.5 * Math.abs(
                            A[0] * (B[1] - C[1]) +
                                    B[0] * (C[1] - A[1]) +
                                    C[0] * (A[1] - B[1])
                    );
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    //Solution 2:Build every area point we have
    public double largestTriangleArea2(int[][] points) {
        double maxArea = 0.0;
        int n = points.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    double area = triangleArea(points[i], points[j], points[k]);
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }
            }
        }

        return maxArea;
    }

    private double triangleArea(int[] p1, int[] p2, int[] p3) {
        return Math.abs(
                p1[0] * (p2[1] - p3[1]) +
                        p2[0] * (p3[1] - p1[1]) +
                        p3[0] * (p1[1] - p2[1])
        ) / 2.0;
    }
}
