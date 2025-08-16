package Greedy;

import java.util.Arrays;

public class MinimizeMaxPairSum_1877 {
    public int minPairSum(int[] nums) {
        //
        int n = nums.length;
        //
        Arrays.sort(nums);
        //
        int max = 0;
        int i=0, j=n-1;
        while(i<j){
            max = Math.max(max, nums[i]+nums[j]);
            i++;
            j--;
        }
        return max;
    }
}
