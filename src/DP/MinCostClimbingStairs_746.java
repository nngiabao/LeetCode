package DP;

public class MinCostClimbingStairs_746 {
    //Solution 1:DP- reversed Tabulation -
    public int minCostClimbingStairs(int[] cost) {
        //we go from the top and go back to first step
        //=> so we can find the min cost
        //by min(dp[0] and dp[1]
        //we using dp here
        int len = cost.length;
        //the top is n
        int[] dp = new int[len+1];
        dp[len] = 0;
        dp[len-1] = cost[len-1];
        for(int i=len-2; i>=0; i--){
            //if(i == len-1) dp[i] = cost[i];
            dp[i] = cost[i]+Math.min(dp[i+1], dp[i+2]);
        }
        return Math.min(dp[0],dp[1]);
    }
    //Solution 2:Tabulation - fastest
    public int minCostClimbingStairs2(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i <= len; i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[len];
    }
}
