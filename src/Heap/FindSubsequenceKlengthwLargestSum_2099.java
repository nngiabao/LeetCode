package Heap;

import java.util.*;

public class FindSubsequenceKlengthwLargestSum_2099 {

    public static void main(String[] args) {

        //System.out.println(maxSubsequence2(new int[]{2,1,3,3},2));
        for(int i : maxSubsequence2(new int[]{-214,-345,952,529,-294,-325,-924,-27,-41,716,-67,-65,-481},5)){
            System.out.println(i);
        }
    }
   //class pair
    public static class Pair{
        int key,index;
        public Pair(int key,int index){
            this.key=key;
            this.index=index;
        }
   }

    public static int[] maxSubsequence(int[] nums, int k) {
        //put into queue to keep k length largest numberp
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) ->
                (a.index==b.index) ? Integer.compare(a.key,b.key): Integer.compare(a.index,b.index));
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

        return list.stream().mapToInt(p -> p.index).toArray();
    }

    //Solution 2: Sorting then pick k largest element
    public static int[] maxSubsequence2(int[] nums, int k) {
        //int len = nums.length;
        //int [] temp = Arrays.copyOf(nums,nums.length);
        //Arrays.sort(temp);
        //int [] res = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.key - b.key );
        //put into priority queue
        for(int i=0;i<nums.length;i++){
            pq.offer(new Pair(nums[i],i));
            if(pq.size() > k) pq.poll();
        }
        //put into a List to sort by index
        //then using stream to convert back to int[]
        ArrayList<Pair> list = new ArrayList<>(pq);
        list.sort(Comparator.comparing(Pair -> Pair.index));
        return list.stream().mapToInt(p -> p.key).toArray();
    }
}
