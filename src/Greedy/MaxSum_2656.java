package Greedy;

import java.util.Arrays;

public class MaxSum_2656 {
    public int maximizeSum(int[] nums, int k) {
        //
        Arrays.sort(nums);
        int sum=0;
        while(k > 0){
            k--;
            sum+= nums[nums.length];
            nums[nums.length-1]++;
        }
        return sum;
    }
}
