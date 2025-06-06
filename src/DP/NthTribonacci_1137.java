package DP;

public class NthTribonacci_1137 {
    public int tribonacci(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        //edge case
        if(n<2) return dp[n];
        if(n==2) dp[2] = 1;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2]+ dp[i-3];
        }
        return dp[n];
    }
}
