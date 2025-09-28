package PracticeQuestionForContest;

public class ClimbingStairsII {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = costs[0]+1;
        dp[2] = dp[1]+costs[1]+2*2;
        for(int i = 3; i <= n; i++){
            dp[i] = Math.min(Math.min(dp[i-1]+costs[i-1]+1, dp[i-2]+costs[i-1]+2*2),dp[i-2]+costs[i-1]+3*3);
        }
        return dp[n];
    }
}
