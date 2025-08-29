package Sorting;

import java.util.Arrays;

public class KeepMultiplying_2154 {
    //
    public int findFinalValue(int[] nums, int original) {
        //sort
        Arrays.sort(nums);
        //
        int i = 0;
        while(i < nums.length) {
            if(nums[i] != original) i++;
            else if(nums[i] == original){
                original *= 2;
            }
        }
        //
        return original;
    }
}
