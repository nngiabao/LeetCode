package SlidingWindow;

import java.util.*;

public class FindXSumSubarraysI {
    public class Pair{
        int key,freq;
        public Pair(int key,int freq){
            this.key=key;
            this.freq=freq;
        }
    }

    public int[] findXSum(int[] nums, int k, int x) {
        //using hashtable to count freq
        if(nums.length == 1) return nums;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.freq != b.freq) return a.freq - b.freq;
            else return a.key - b.freq;
        });

        //count slide window first and count the freq too
        int sum=0;
       return null;
    }
    //find top element in slide window

}
