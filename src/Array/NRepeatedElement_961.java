package Array;

import java.util.Arrays;

public class NRepeatedElement_961 {
    public int repeatedNTimes(int[] nums) {
        //
        Arrays.sort(nums);
        //
        for(int i = 1; i < nums.length-1; i++){
            if(nums[i] == nums[i-1]) return i;
        }
        return 1;
    }
    //Solution 2: best
    public int repeatedNTimes2(int[] nums) {
        for (int i = 0; i + 2 < nums.length; ++i)
            if (nums[i] == nums[i + 1] || nums[i] == nums[i + 2])
                return nums[i];
        return nums[nums.length - 1];
    }
}
