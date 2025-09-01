package Sorting;

import java.util.Arrays;

public class FindArrayCanBeSorted_3011 {
    public boolean canSortArray(int[] nums) {
        //
        Arrays.sort(nums);
        //
        for(int i=1; i<nums.length; i++) {
            if(bitSet(nums[i]) != bitSet(nums[i-1])) return false;
        }
        //
        return true;
    }

    int bitSet(int n) {
        //
        int count = 0;
        //
        while (n != 0) {
            if (n % 2 != 0) count++;
            n /= 2;
        }
        //
        //
        return count;
    }
}
