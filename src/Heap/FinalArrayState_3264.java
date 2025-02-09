package Heap;

import java.util.PriorityQueue;

public class FinalArrayState_3264 {
    //using entry is class or map here to store index and value
    //Solution 1: using class
    public static class Pair{
        int key,value;
        public Pair(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        //put in pq so we can get and modify the min in each state
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> (a.value == b.value) ? Integer.compare(a.key, b.key) : Integer.compare(a.value, b.value));
        for(int i=0;i<nums.length;i++){
            pq.offer(new Pair(i,nums[i]));
        }
        //do each state k
        for(int i=0;i<k;i++){
            Pair p = pq.poll();
            pq.offer(new Pair(p.key,p.value*multiplier));
        }
        //put back
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            nums[p.key]=p.value;
        }
        return nums;
    }
}
