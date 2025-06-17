package Greedy;

import java.util.PriorityQueue;

public class LargestNumber_179 {
    public String largestNumber(int[] nums) {
        //building heap
        //if first digit is the same sort by next digit
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b+""+a).compareTo(a+""+b));
        //put into heap
        for(int i : nums){
            pq.offer(i);
        }
        //build
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            sb.append(pq.poll());
        }
        //edge case if 0 => return 0
        return sb.toString();

    }
}
