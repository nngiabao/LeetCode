package Math;

import java.util.Arrays;

public class SmallestRangeI_908 {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        return Math.max(0, nums[nums.length - 1] - nums[0] + 2 * k);
    }

    //Solution 2: best
    static {
        for (int i = 0; i < 500; i++) SmallestRangeI_908.smallestRangeI2(new int[2], 10);
    }

    public static int smallestRangeI2(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int difference = max - min;
        if (difference <= 2 * k) return 0;
        else return difference - (2 * k);
    }
}
