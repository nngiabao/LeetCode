package Array;

import java.util.Arrays;

public class SingleNum2_137 {
    public static void main(String[] args) {
        SingleNum2_137 s = new SingleNum2_137();
        int[] a = {30000, 500, 100, 30000, 100, 30000, 100};
        System.out.println(s.singleNumber(a));
    }

    //Solution 1: slow
    public int singleNumber(int[] nums) {
        int n = nums.length;
        //
        int start = 0;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[start]) {
                if (i - start == 1) return nums[start];
                start = i;
            }
        }
        return nums[n - 1];
    }
    //Solution 2:Using bitwise
    public int singleNumber2(int[] nums) {
        int n = nums.length;
        int ones = 0,twos = 0;
        for (int i = 0; i < n; i++) {
            //remove num hold in twos
            ones = ones^nums[i] & ~twos;
            twos = twos^nums[i] & ~ones;
        }
        return ones;
    }
}
