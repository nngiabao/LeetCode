package Heap;

import java.util.PriorityQueue;

public class MinPairRemoval_3507 {

    public int minimumPairRemoval(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        pq.offer(nums[0]);
        int temp=0,count=0;
        for(int i=1;i<nums.length;i++){
            temp += nums[i];
            if(pq.peek()<=temp){
                pq.offer(temp);
                temp=0;
            }else count++;
        }
        return count;
    }
}
