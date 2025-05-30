package Heap;

import java.util.PriorityQueue;

public class KLargestElement_215 {
    public int findKthLargest(int[] nums, int k) {
        //put into pq
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int num : nums){
            pq.add(num);
        }
        //return
        int count = 0;
        while(count < k){
            pq.poll();
        }
        return pq.poll();
    }
}
