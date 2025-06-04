package Array;

import java.util.Arrays;

public class DivideArrayIntoPair_2206 {
    //Solution 1:Sort + check length can be inpair or not ?
    public boolean divideArray(int[] nums) {
        //sort
        Arrays.sort(nums);
        //
        int start = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[start]){
                if((i-start&1)==1) return false;
                start=i;
            }
        }
        //check last time
        return true;
    }
    //Solution 2:better but only with small constraint
    public boolean divideArray2(int[] nums){
        //put into sub array
        int[] subarray = new int[501];
        //
        for(int num : nums){
            subarray[num]++;
        }
        //
        for(int i=0;i<subarray.length;i++){
            if(subarray[i] != 0 && (subarray[i]&1)==1) return false;
        }
        return true;
    }
}
