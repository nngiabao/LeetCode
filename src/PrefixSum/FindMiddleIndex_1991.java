package PrefixSum;

public class FindMiddleIndex_1991 {
    public int findMiddleIndex(int[] nums) {
        if(nums.length ==1) return 0;
        //array prefix sum
        int [] prefix = new int [nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        // left sum + right sum = total sum
        //check if left sum == right sum => return the pivot

        //
        for(int i=1;i<nums.length;i++){
            int left = (i==0) ? 0 : prefix[i-1];//check edge case if pivot =0
            int right = prefix[nums.length-1]-prefix[i];
            if(left == right) return i;
        }
        return -1;
    }
}
