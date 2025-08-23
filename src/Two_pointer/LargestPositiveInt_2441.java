package Two_pointer;

import java.util.Arrays;

public class LargestPositiveInt_2441 {
    public int findMaxK(int[] nums) {
        //sort array
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        //
        while(i<j){
            if(nums[i]*-1>nums[j]) i++;
            else if(nums[i]*-1 < nums[j]) j--;
            else return nums[j];
        }
        //
        return -1;
    }
}
