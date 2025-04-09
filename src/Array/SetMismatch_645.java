package Array;

import java.util.Arrays;

public class SetMismatch_645 {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        int xor=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1 && res[1] == 0) {
                res[1] = i + 1; // missing
            }
            xor ^= nums[i];
            xor ^= i + 1;
        }
        res[0] = xor;
        return res;
    }
}
