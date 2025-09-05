package Sorting;

import java.util.Arrays;

public class CheckArray_2784 {
    //Solution 1:Sorting
    public boolean isGood(int[] nums) {
        int len = nums.length;
        //edge case
        if (len == 1) return false;
        Arrays.sort(nums);
        //
        for (int i = 1; i < len - 2; i++) {
            if (nums[i] != nums[i - 1] + 1) return false;
        }
        return nums[len - 1] == nums[len - 2] && nums[len - 1] == len - 1;
    }

    //Solution 2:
    public boolean isGood2(int[] nums) {
        int max = 0;
        for (int i : nums) {
            if (i > max)
                max = i;
        }
        if (nums.length != max + 1) return false;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (i != max && arr[i] != 1)
                return false;
            else if (i == max && arr[i] != 2)
                return false;
        }
        return true;
    }
}
