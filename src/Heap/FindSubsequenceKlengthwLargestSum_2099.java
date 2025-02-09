package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindSubsequenceKlengthwLargestSum_2099 {

    public static void main(String[] args) {
        System.out.println(maxSubsequence(new int[]{50,-75},2));
    }
   //class pair
    public static class Pair{
        int key,value;
        public Pair(int key,int value){
            this.key=key;
            this.value=value;
        }
   }

    public static int[] maxSubsequence(int[] nums, int k) {
        //put into queue to keep k length largest numberp
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) ->
                (a.value==b.value) ? Integer.compare(a.key,b.key): Integer.compare(a.value,b.value));
        for(int i=0;i<nums.length;i++){
            if(pq.size() == k) pq.poll();
            pq.add(new Pair(i,nums[i]));
        }
        //sorted by index again before return res
        //using array list for sorted easier
        ArrayList<Pair> list = new ArrayList<>(pq);
        //using collections
        list.sort(Comparator.comparing(Pair -> Pair.key));
        //return k array largest number

        return list.stream().mapToInt(p -> p.value).toArray();
    }
}
