package PrefixSum;

public class ContinuousSubArraySum_523 {
    public static void main(String[] args) {
        ContinuousSubArraySum_523 a = new ContinuousSubArraySum_523();
        int[] t = {23,2,6,4,7};
        int k=13;
        System.out.println(a.checkSubarraySum(t,13));
    }
    public boolean checkSubarraySum(int[] nums, int k) {
        ///
        int sum = 0;
        //find presum array
        int len = nums.length;
        //
        int[] presum = new int[len];
        presum[0] = nums[0];
        for(int i = 1; i < len; i++){
            presum[i] = presum[i-1]+nums[i];
            if(presum[i] % k==0) return true;
        }
        //start from loop no2
        for(int i = 1; i < len-1; i++){
            for(int j=i+1; j < len; j++){
                if((presum[j] - presum[i-1])%k==0) return true;
            }
        }
        return false;
    }
}
