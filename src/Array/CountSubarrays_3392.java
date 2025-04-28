package Array;

public class CountSubarrays_3392 {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=2;i<nums.length;i++){
            int sum=nums[i]+nums[i-2];
            if(sum != 0 && sum== nums[i-1]/2) count++;
        }
        return count;
    }
}
