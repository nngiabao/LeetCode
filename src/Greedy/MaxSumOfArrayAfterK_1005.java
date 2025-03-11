package Greedy;

import java.util.Arrays;

public class MaxSumOfArrayAfterK_1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        //flip
        while(k>0){
            if(nums[0] < 0)
            k--;
        }
        //sum
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}
