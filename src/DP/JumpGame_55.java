package DP;

public class JumpGame_55 {
    //SOlution 1: Greedy
    public boolean canJump(int[] nums) {
        //
        if(nums[0]==0) return false;
        int len = nums.length;
        int currentEnd=0;
        int maxReach=0;
        for(int i=0;i<len-1;i++){
            //
            if(i<=maxReach){
                maxReach = Math.max(maxReach, i+nums[i]);
                if(maxReach>=len-1) return true;
            }
        }
        return false;
    }
    //Solution 2: using DP - O(n^2)
}
