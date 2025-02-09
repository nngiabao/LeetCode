package Heap;

import java.util.*;


public class LastStoneWeight_1046 {
    //Priority Queue
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        //put into pq
        for(int stone : stones){
            pq.add(stone);
        }
        //max heap operation
        while(pq.size()!=1){
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            pq.add(stone1 - stone2);
        }
        return pq.poll();
    }
}
