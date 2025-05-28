package Greedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class MinIncMove_945 {
    //Solution 1: Worst
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] <= nums[i-1]){
                int gap = nums[i-1]-nums[i]+1;
                count+= gap;
                nums[i] += gap;
            }
        }
        return count;
    }

    //Solution 2:
    public int minIncrementForUnique2(int[] nums) {
        if(nums.length == 1) return 0;
        int count =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a );
        pq.offer(nums[0]);
        //
        for(int i = 1;i<nums.length;i++){
            if(pq.contains(nums[i])){
                int gap = pq.peek()-nums[i]+1;
                count+= gap;
                nums[i] += gap;
            }
            pq.offer(nums[i]);
        }
        return count;
    }
}
