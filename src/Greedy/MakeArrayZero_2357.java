package Greedy;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MakeArrayZero_2357 {
    public int minimumOperations(int[] nums) {
        //
        int n = nums.length;
        Arrays.sort(nums);
        //using poitner until it hit the last 1
        //(because we keep subtracting to smallest number)
        int i=0,count=0;
        while(i < n){
            if(nums[i] != 0){
                count++;
                for(int j=i; j<n; j++){
                    nums[j] -= nums[i];
                }
            }
            i++;
        }
        return count;
    }
}
