package Array;

import java.util.*;

//
public class RotateArray_189 {
    //Solution 1:Using temp and modulo
    public void rotate(int[] nums, int k) {
        //using temp array to deal with it
        //
        int n = nums.length;
        int[] temp = Arrays.copyOf(nums, n);
        for (int i = 0; i < n; i++) {
            nums[(i + k) % n] = temp[i];
        }
    }

    //Solution 2:Best - check again
    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);//reverse the first part
        reverse(nums, n - k, n - 1);//reverse the last part
        reverse(nums, 0, n - 1);//reverse who array
    }
}
