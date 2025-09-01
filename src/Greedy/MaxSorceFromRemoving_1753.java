package Greedy;

import java.util.PriorityQueue;

public class MaxSorceFromRemoving_1753 {
    //Solution 1:Using heap
    public int maximumScore(int a, int b, int c) {
        //
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> y-x);
        pq.offer(a);
        pq.offer(b);
        pq.offer(c);
        //
        int count = 0;
        while (true) {
            int first = pq.poll();
            int second = pq.poll();
            if(first == 0 || second == 0) return count;
            //
            first--;pq.offer(first);
            second--;pq.offer(second);
            count++;
        }
    }
    //Solution 2:Using formula
    public int maximumScore2(int a, int b, int c) {
        if (Math.max(a,Math.max(b,c)) > a + b + c - Math.max(a,Math.max(b,c))){
            return a + b + c - Math.max(a,Math.max(b,c));
        } else {
            return (a + b + c) / 2;
        }
    }
}
