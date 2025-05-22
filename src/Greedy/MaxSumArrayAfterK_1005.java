package Greedy;

import java.util.*;
import java.util.PriorityQueue;

public class MaxSumArrayAfterK_1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        // put into pq
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum = 0;
        for (int num : nums) {
            pq.offer(num);
        }
        //
        while (k > 0) {
            int temp = pq.poll();
            if (temp == 0) break;
            pq.offer(temp * -1);
            k--;
        }
        //find sum
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}
