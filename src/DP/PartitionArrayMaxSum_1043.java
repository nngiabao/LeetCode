package DP;

public class PartitionArrayMaxSum_1043 {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        //
        int n = arr.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        //
        for(int i=0;i<n-k+1;i++){
            for(int j=i;j<k;j++){
                dp[j] = Math.max(dp[j], dp[j+1]+arr[i]);
            }
        }
        //sum
        //
        return dp[n];
    }
}
