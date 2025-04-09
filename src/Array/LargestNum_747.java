package Array;

import java.util.Arrays;

public class LargestNum_747 {
    //Solution 1
    public int dominantIndex(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        if(temp[temp.length-1] >= temp[temp.length-2]*2){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i] == temp[temp.length-1]) return i;
            }
        };
        return -1;
    }
    //Solution 2:

}
