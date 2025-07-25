package DP;

import java.util.*;

public class Traiangle_120 {
    //Solution 1:Using DP 2D array
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];

        dp[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int val = triangle.get(i).get(j);
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + val;
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + val;
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + val;
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int x : dp[n - 1]) {
            min = Math.min(min, x);
        }
        return min;
    }

    //Soluition 2:Using DP
    public int minimumTotal2(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];

        // Initialize dp with the last row of triangle
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        // Start from second-last row and go upward
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int val = triangle.get(i).get(j);
                dp[j] = val + Math.min(dp[j], dp[j + 1]);
            }
        }
        return dp[0];
    }

}
