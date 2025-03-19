package Heap;

import java.util.stream.*;
import java.util.*;


public class MinAmountTime2fillCup_2335 {
    public int fillCups(int[] amount) {

        int count = 0;
        // Check if all values are 0 at the start
        if (amount[0] == 0 && amount[1] == 0 && amount[2] == 0) return 0;
        //add into priority queue
        //in reverse order
        //we keep fill until cup 1 and 2 reach 0
        // Heapify for Max-Heap (O(n))
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                amount.length, Collections.reverseOrder()
        );

        pq.addAll(Arrays.stream(amount).boxed().collect(Collectors.toList()));
        while (!pq.isEmpty()) {
            int cup1 = pq.poll();
            int cup2 = !pq.isEmpty() ? pq.poll() : 0;
            //take 2 cup to fill and check until it all reach 0
            cup1--;
            if (cup2 > 0) cup2--;
            //if(cup is not filled => put back to queue
            if (cup1 > 0) pq.offer(cup1);
            if (cup2 > 0) pq.offer(cup2);
            count++;
        }
        return count;
    }
}
