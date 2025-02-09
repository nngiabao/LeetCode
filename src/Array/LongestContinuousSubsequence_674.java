package Array;

public class LongestContinuousSubsequence_674 {


    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 1) return 1;
        int max=1,count=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[i-1]) count++;
            else count=1;
            max=Math.max(max,count);
        }
        return max;
    }
}
