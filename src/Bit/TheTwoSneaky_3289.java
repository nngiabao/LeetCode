package Bit;

import java.util.Arrays;

public class TheTwoSneaky_3289 {
    //Solution 1:
    public int[] getSneakyNumbers(int[] nums) {
        //using bitwise
        //becasue
        //sort arrays
        Arrays.sort(nums);
        //
        int[] res = new int[2];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) res[index++] = nums[i];
        }
        return res;
    }

    //Solution 2:
    //because constraint to small so we can build cage for that
    //better no need to sort
    public int[] getSneakyNumbers2(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[2];
        int index = 0;
        for(int num : nums){
            if(++count[num] == 2){
                res[index++] = num;
            }
        }
        //
        return res;
    }
}
