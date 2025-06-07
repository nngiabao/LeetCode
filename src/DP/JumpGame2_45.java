package DP;

import java.util.*;
public class JumpGame2_45 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(new JumpGame2_45().jump(nums));
    }
    //Solution 1:Greedy
    public int jump(int[] nums) {
        int i=0;
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        //edge case
        if(nums[0]==0 || len==1) return 0;
        int count=0;
        int currentEnd=0;
        int farthest=0;
        //if(nums[0] >= len-1) return 1;
        while(i<len-1){
            farthest = Math.max(farthest, i+nums[i]);
            if(i==currentEnd){
                count++;
                currentEnd=farthest;
            }
            i++;
        }
        return count;
    }
    //Solution 2: classic DP - O(n^2)
    public int jump2(int[] nums) {
        int len=nums.length;
        //
        int[] dp = new int[len];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; //1 step no move
        for(int i=0;i<len;i++){
            for(int j=1;j<=nums[i] && i+j<len;j++){
                dp[i+j] = Math.min(dp[i]+1,dp[i+j]);
            }
        }
        return dp[len-1];
    }
}
