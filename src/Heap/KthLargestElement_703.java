package Heap;

import java.util.PriorityQueue;

public class KthLargestElement_703 {
    //create min heap because we keep kthlargest number
    PriorityQueue<Integer> pq;
    int k;

    public static void main(String[] args) {
        KthLargestElement_703 a = new KthLargestElement_703(3,new int[]{4, 5, 8, 2});
        System.out.println(a.add(3));; // return 4
    }

    public KthLargestElement_703(int k, int[] nums) {
        this.pq = new PriorityQueue<Integer>();
        this.k = k;
        //put numbers into heap but take kth largest
        for(int num : nums){
            pq.add(num);
            if (pq.size() > k) pq.poll();
        }
    }

    public int add(int val) {
        pq.add(val);
        if (pq.size() > k) pq.poll();
        return pq.peek();
    }
}