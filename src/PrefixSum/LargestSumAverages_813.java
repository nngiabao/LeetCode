package PrefixSum;

public class LargestSumAverages_813 {
    //redo again
    public double largestSumOfAverages(int[] nums, int k) {
        //prefix sum
        int[] presum = new int[nums.length];
        presum[0] = nums[0];
        //
        for(int i=1;i<nums.length;i++){
            presum[i] = presum[i-1] + nums[i];
        }
        //
        double max = 0;
        for(int i=0;i<nums.length-k+1;i++){
            double sum = 0;
            for(int j=i;j<i+k;j++){
                sum += presum[j];
            }
            max = Math.max(max,sum/(double)k);
        }
        return max;
    }
}
