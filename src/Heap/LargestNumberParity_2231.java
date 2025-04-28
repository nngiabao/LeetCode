package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LargestNumberParity_2231 {
    public int largestInteger(int num) {
        //pq for odd
        PriorityQueue<Integer> pq_odd = new PriorityQueue<Integer>((a,b) -> b -a);
        //pq for even
        PriorityQueue<Integer> pq_even = new PriorityQueue<Integer>((a,b) -> b -a);
        //temp
        String str = String.valueOf(num);
        //put into pq
        while (num != 0) {
            int m = num % 10;
            if ((num & 1) == 0) pq_even.offer(m);
            else pq_odd.offer(m);
            num /= 10;
            //if(num<10)
        }
        //check first left or right
        //re-arrange
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if((str.charAt(i) - '0' & 1) ==0) sb.append(pq_even.poll());
            else sb.append(pq_odd.poll());
        }
        return Integer.parseInt(sb.toString());
    }
}
