package Array;

import java.util.*;

public class MaxDiffIncNums_2016 {
    //Solution 1:Using brute force
    public int maximumDifference(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]-nums[i] > max) max = nums[j]-nums[i];
            }
        }
        return (max==0) ? -1 : max ;
    }
    //SOlution 2:
}
