package Greedy;

import java.util.Arrays;

public class PartitionArrayWithMaxDiffK_2294 {
    public int partitionArray(int[] nums, int k) {
        if(nums.length < 2 && nums[0] < k) return 1;
        //sort array
        Arrays.sort(nums);
        int len = nums.length;
        //
        int count=0;
        int start =0;
        for(int i=1;i<len;i++){
            if(nums[i]-start > k){
                count++;
                start = nums[i];
            }
        }
        return count;
    }


}
