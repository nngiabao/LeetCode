package Greedy;

import java.util.PriorityQueue;

public class MaxProductKInc_2233 {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //put into pq
        for(int i : nums){
            pq.offer(i);
        }
        //
        while(k-- > 0){
            int temp = pq.poll();
            pq.offer(++temp);
        }
        long product = 1;
        //find product
        while(!pq.isEmpty()){
            int temp = pq.poll();
            if(temp == 0) return 0;
            else product = (product*temp) % 1000000007;
        }
        return (int) product;
    }
}
