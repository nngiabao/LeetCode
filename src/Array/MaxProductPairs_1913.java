package Array;

import java.util.Arrays;

public class MaxProductPairs_1913 {
    //Solution 1:Sort
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        //
        return nums[nums.length-1]*nums[nums.length-2] - nums[0]*nums[1];
    }
    //Solution 2:Brute-force
    public int maxProductDifference2(int[] nums) {
        int max1 = -1;
        int max2 = -1;
        int min1 = 100001;
        int min2 = min1;

        for(int x : nums) {
            if(x > max1) {
                max2 = max1;
                max1 = x;
            }
            else if(x > max2) {
                max2 = x;
            }
            if(x < min1) {
                min2 = min1;
                min1 = x;
            }
            else if(x < min2) {
                min2 = x;
            }
        }

        return (max1 * max2) - (min1 * min2);
    }
}
