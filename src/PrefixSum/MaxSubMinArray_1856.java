package PrefixSum;

import java.util.Arrays;

public class MaxSubMinArray_1856 {
    public int maxSumMinProduct(int[] nums) {
        //sort first => can find min
        Arrays.sort(nums);
        int len = nums.length;
        //prefix sum array
        int[] presum = new int[len];
        presum[0] = nums[0];
        //
        for(int i=1;i<len;i++){
            presum[i] = presum[i-1] + nums[i];
        }
        //
        long max = Integer.MIN_VALUE;
        for(int i=0;i<len-1;i++){
            for(int j=len-1;j>i;j--){
                int left = (i==0) ? 0:presum[i-1];
                int right = presum[j]-left;
                int sum = right-left;
                max = Math.max(max,nums[i]*sum);
            }
        }
        return (int) max;
    }
}
