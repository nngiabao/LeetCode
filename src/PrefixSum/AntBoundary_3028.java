package PrefixSum;

public class AntBoundary_3028 {
    public int returnToBoundaryCount(int[] nums) {
        //prefix sum to count ant
        //count when ant return boundary => when it return to 0
        //edge
        if (nums.length == 1) return 0;
        //count variable for times ant return boundary
        int count = 0;
        int [] presum = new int[nums.length];
        presum[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            presum[i] = presum[i-1] + nums[i];
            if(presum[i] ==0) count++;
        }
        return count;
    }
}
