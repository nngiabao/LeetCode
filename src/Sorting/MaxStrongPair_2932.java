package Sorting;

import java.util.Arrays;

public class MaxStrongPair_2932 {
    public int maximumStrongPairXor(int[] nums) {
        //sorting
        Arrays.sort(nums);
        //
        int count = 0;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        //
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if ((nums[j] - nums[i]) > nums[i]) break;
                max = Math.max(max, nums[i] ^ nums[j]);
            }
        }
        //
        return max;
    }

    //Solution 2: Best - you dont not need to sort because u using 2 loops
    public int maximumStrongPairXor2(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] ^ nums[j]) > max && Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j]))
                    max = nums[i] ^ nums[j];
            }
        }
        return max;
    }
}
