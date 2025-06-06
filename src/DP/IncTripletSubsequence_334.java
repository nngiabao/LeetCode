package DP;

import java.util.Arrays;

public class IncTripletSubsequence_334 {
    public static void main(String[] args) {
        int[] nums = {20,100,10,12,5,13};
        System.out.println(new IncTripletSubsequence_334().increasingTriplet2(nums));
    }
    //Solution 1:DP - Bottom up - for small input
    public boolean increasingTriplet(int[] nums) {
        //
        int len = nums.length;
        if(len < 3) return false;
        //
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
         //if dp has box contains 3 => return true because the subsequence inc has 3 num
        for(int i = 1; i < len; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
                if(dp[i] >= 3) return true;
            }
        }
         //
        return false;
    }
    //SOlution 2:Using greedy + DP tracking
    public boolean increasingTriplet2(int[] nums) {
        //create first and second for 2 first smaller nums
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        //we keep scanning from 3rd element of this array
        //we return true when first < second < nums[i]
        //we using dp array to track
        for(int num : nums){
            if(num <= first) first = num;
            else if(num <= second) second = num;
            else return true;
        }
        return false;
    }
}
