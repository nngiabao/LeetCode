package PrefixSum;

public class CountPartitionsEvenSumDifference_3432 {

    public static void main(String[] args) {
        CountPartitionsEvenSumDifference_3432 a = new CountPartitionsEvenSumDifference_3432();
        int [] d = {10,10,3,7,6};
        System.out.println(a.countPartitions(d));
    }

    public int countPartitions(int[] nums) {
        if(nums.length == 2) return ((nums[0] - nums[1] & 1)==0) ? 1 : 0;
        int sum = 0;
        //prefix sum array
        int [] presum = new int[nums.length];
        presum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            presum[i] = presum[i-1] + nums[i];
        }
        //
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            int left = presum[i];
            int right = presum[nums.length-1]  - presum[i];
            if((left-right & 1) ==0) count++;
        }
        return count;
    }
}
