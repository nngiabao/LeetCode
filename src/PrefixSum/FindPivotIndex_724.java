package PrefixSum;

public class FindPivotIndex_724 {
    public int pivotIndex(int[] nums) {
        //prefix sum array
        int [] presum = new int[nums.length];
        presum[0] = nums[0];
        for(int i = 1; i < nums.length-1; i++) {
            presum[i] = presum[i-1] + nums[i];
        }
        // Check index 0 separately (left sum is 0)
        if (presum[nums.length - 1] - nums[0] == 0) return 0;
        //total = prenum[a.length]
        //this case miss left[0] => we have to check this edge before
        for(int i=1;i<nums.length;i++) {
            int left = presum[i-1];
            int right = presum[nums.length-1] - presum[i];
            if(left == right) return i;
        }
        return -1;
    }
}
