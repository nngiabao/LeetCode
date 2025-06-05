package DP;

public class HouseRobber_198 {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        //
        //int max=0;
        for(int i = 2; i < len-1; i++){
            dp[i] = Math.max(dp[i-1], nums[i]+dp[i-2]);
        }
        return dp[len-1];
    }
}
