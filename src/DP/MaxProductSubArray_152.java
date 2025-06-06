package DP;

public class MaxProductSubArray_152 {
    //Solution 1:Using Kadane
    public int maxProduct(int[] nums) {
        //edge cases
        if(nums.length==1) return nums[0];
        int len = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        int maxSofar = nums[0];
        int minSofar = nums[0];
        for(int i = 1; i < len; i++){
            int curr = nums[i];
            int prev_max = maxSofar;
            int prev_min = minSofar;
            maxSofar = Math.max(curr, Math.max(curr*prev_max,curr*prev_min));
            minSofar = Math.min(curr, Math.min(curr*prev_max,curr*prev_min));
            maxProduct = Math.max(maxSofar,maxProduct);
        }
        return maxProduct;
    }
}
