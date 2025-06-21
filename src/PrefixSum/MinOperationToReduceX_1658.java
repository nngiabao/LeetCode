package PrefixSum;

public class MinOperationToReduceX_1658 {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        //build prefix sum
        int len = nums.length;
        int[] presum = new int[len];
        presum[0] = nums[0];
        for(int i = 0; i < len; i++){
            presum[i] = presum[i-1]+nums[i];
        }
        //go from the left to right
        int countLeft=0,countRight=0;
        while(countLeft<x){

        }
        //go from the right to left
        return -1;
    }
}
