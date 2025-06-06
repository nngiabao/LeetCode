package DP;

import java.util.*;
//import java.util.Arrays;

public class LongestIncSubsequence_300 {
    public static void main(String[] args) {

    }
    //Solution 1:DP
    //bottom-up(tabulation)
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int max =Integer.MIN_VALUE;
        for(int i = 1; i < len; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        //find the max
        for(int num : dp){
            max = Math.max(max, num);
        }
        //
        return max;
    }
    //Solution 2:Using BST - because constraint is small
    public int lengthOfLIS2(int[] nums) {
        //
        List<Integer> tail = new ArrayList<>();
        for(int num : nums){
            int l=0,r =tail.size();
            while(l < r){
                int mid = l+(r-l)/2;
                if(tail.get(mid) < num){
                    l = mid+1;
                }else{
                    r = mid;
                }
            }
            //check if this num <= tail => replace tail to this
            //else => add this as new tail
            if(l < tail.size()) tail.set(l, num);
            else tail.add(num);
        }
        return tail.size();
    }
}
