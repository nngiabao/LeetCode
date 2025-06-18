package Array;

import java.util.*;
public class NumArithmeticTriplets_2367 {
    //Solution 1: Brute-force
    public int arithmeticTriplets(int[] nums, int diff) {
        //
         //
        int count=0;
        int len = nums.length;
        for(int i = 0; i < len-2; i++){
            for(int j = i+1; j<len-1; j++){
                for(int k = j+1; k <len; k++){
                    if(nums[k] - nums[j] == diff && nums[j] - nums[i] == diff) count++;
                }
            }
        }
        return count;
    }
    public int arithmeticTriplets2(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int count = 0;
        for (int num : nums) {
            if (set.contains(num + diff) && set.contains(num + 2 * diff)) {
                count++;
            }
        }
        return count;
    }

}
