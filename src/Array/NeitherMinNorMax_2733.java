package Array;

import java.util.Arrays;

public class NeitherMinNorMax_2733 {
    //Solution 1:
    public int findNonMinOrMax(int[] nums) {
        //
        int n = nums.length;
        if(n <3) return -1;
         //
        Arrays.sort(nums);
        return nums[1];
    }
    //Solution 2:Using 2 variable
    public int findNonMinOrMax2(int[] nums) {
        //
        //
        int max = nums[0];
        int min = nums[0];
        //find max and min
        for(int i=1;i<nums.length;i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        //return element != -1
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != min && nums[i] != max) return nums[i];
        }
        return -1;
    }
}
