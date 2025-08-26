package Sorting;

import java.util.Arrays;

public class ReductionOperations_1887 {
    //Solution 1:Small input
    public int reductionOperations(int[] nums) {
        //
        Arrays.sort(nums);
        //
        int n = nums.length;
        int i = n-2,j=n-1;
        int count=0;
        //
        while(i>-1){
            if(nums[i]<nums[j]){
                nums[j]=nums[i];
                count++;
                j=n-1;
                i=j-1;
            }else{
                i--;
                j--;
            }
        }
        return count;
    }
    //Solution 2:
}
