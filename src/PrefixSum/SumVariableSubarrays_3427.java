package PrefixSum;

public class SumVariableSubarrays_3427 {
    public int subarraySum(int[] nums) {
        if(nums.length == 1) return nums[0];
        //prefix sum array
        int sum = 0;
        int [] presum = new int[nums.length];
        presum[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            presum[i] = nums[i] + presum[i - 1];
        }
        //
        int max=0;
        for(int i=0;i<nums.length;i++){
            int start = Math.max(0, i - nums[i]);
            sum+= (start == 0 ) ? presum[i] : presum[i]-presum[start-1];
        }
        return sum;
    }
}
