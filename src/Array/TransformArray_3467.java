package Array;

import java.util.Arrays;

public class TransformArray_3467 {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        //zero = even
        //1 == odd
        int zero = 0, one = 0;
        for (int i = 0; i < n; i++) {
            if ((nums[i] & 1) == 1) one++;
            else zero++;
        }
        //build array
        Arrays.fill(res,0,zero,0);
        Arrays.fill(res,zero+1,n,1);
        return res;
    }
}
