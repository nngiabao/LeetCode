package Greedy;

import java.util.Arrays;

public class ArrayPartition_561 {
    //solution 1
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i+=2){
            sum += nums[i];
        }
        return sum;
    }
    //Solution 2
}
