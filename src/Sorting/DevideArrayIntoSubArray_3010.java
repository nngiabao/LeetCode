package Sorting;

import java.util.Arrays;

public class DevideArrayIntoSubArray_3010 {
    //Solution 1
    public int minimumCost(int[] nums) {
        Arrays.sort(nums, 1, nums.length);
        return nums[0] + nums[1] + nums[2];
    }

    //Solution 2:Greedy + sorting
    public int minimumCost2(int[] nums) {
        int cost = nums[0];
        int small1 = nums[1];
        int small2 = nums[2];
        for (int i = 3; i < nums.length; i++) {
            if (small2 >= small1 && nums[i] < small2) {
                small2 = nums[i];
            } else if (small1 > small2 && nums[i] < small1) {
                small1 = nums[i];
            }
        }
        return cost + small2 + small1;
    }
}
