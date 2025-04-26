package Math;

import java.util.Arrays;

public class MinOperationsSumDivisiblebyK_3512 {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum%k;
    }
}
