package Array;

import java.util.Arrays;

public class MinOperations_3065 {
    //Solution 1:Brute-force
    public int minOperations(int[] nums, int k) {
        int count= 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<k) count++;
        }
        return count;
    }

}
